import {KAKAO_AUTH_URL, KAKAO_LOGOUT_URL} from "./OAuth";
import React from "react";

export default () => (
    <a href={KAKAO_LOGOUT_URL}>
        로그아웃
    </a>
)