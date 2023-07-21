(() => {
    ////////////////////////////// 전역변수 //////////////////////
    const USERID= document.querySelector('#userid')         // 아이디
    const USERNAME=document.querySelector('#username')      //이름
    const PW=document.querySelector('#currPassword')        //현재비빌번호
    const NEWPW=document.querySelector('#newPassword')      //신규비밀번호
    const CHKPW=document.querySelector('#validPassword')    //신규비밀번호 확인
    const TELNO=document.querySelector('#myTelNumM')        //전화번호
    const PHONO=document.querySelector('#myMobileNumM')     //폰번호
    const EMAIL=document.querySelector('#myEmailAdrM')      //이메일
    const SAVEBTN=document.querySelector('#savebtn')        //저장버튼
    const REGIBTN=document.querySelector('.modal-open')     //회원가입 버튼(로그인창)

    /////////////////////////////// EVENT  /////////////////////////////////////
    SAVEBTN.addEventListener('click',(e)=>{
        const param = {
            userid : USERID.value,
            username : USERNAME.value,
            newpw : NEWPW.value,
            chkpw : CHKPW.value,
            telbo : TELNO.value,
            phono : PHONO.value,
            email : EAMIL.value
        }

        USERINFOSAVE(JSON.stringify(param))
    })

    REGIBTN.addEventListener('click',(e)=>{
        console.log(e)
        $('#myInfoEditModal').modal('show');
        USERID.value = '';
        USERNAME.value = '';
        NEWPW.value = '';
        CHKPW.value = '';
        TELNO.value = '';
        PHONO.value = '';
        EMAIL.value = '';
    })

    ////////////////////////////// API REQUEST //////////////////////////////////

    const USERINFOSAVE = param => fetch(`/pri/api/userinfo/save?${param}`, {
        headers: { 'Content-Type': 'application/json; charset=utf-8' },
        method:'post'
    });

    ///////////////////////////// 함수  ////////////////////////////////////////

    const Validation = param => {
        param.map(param => param.replace(' ',''),)
    }








})()