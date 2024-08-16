package com.example.daedong_dayt.domain.workspace.exception;

import com.example.daedong_dayt.global.error.exception.DayException;
import com.example.daedong_dayt.global.error.exception.ErrorCode;

public class WorkspaceNotFoundException extends DayException {
    public static final DayException EXCEPTION = new WorkspaceNotFoundException();
    private WorkspaceNotFoundException(){
        super(ErrorCode.WORKSPACE_NOT_FOUND);
    }
}
