package service;

import javax.jws.WebParam;
import javax.jws.WebService;

import dto.WhateverRequest;
import dto.WhateverResponse;

@WebService
public interface FNSW {

    public WhateverResponse FNSTXN0003( //
            @WebParam(name = "CUBXML") WhateverRequest request);
}
