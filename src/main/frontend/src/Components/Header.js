import React from 'react';
import { Link } from "react-router-dom";
import {KAKAO_AUTH_URL, KAKAO_LOGOUT_URL} from "./OAuth";
import LoginPage from "./LoginPage";
import LogoutPage from "./LogoutPage";

function Header() {
    return (
        <div>
            <LoginPage/>
            <LogoutPage/>
        </div>
    )
}

export default Header;