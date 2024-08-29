package com.example.Code;

import org.springframework.stereotype.Component;

@Component
public class Girl {
    Outfit outfit;

    public Girl(Outfit outfit){
        this.outfit = outfit;
    }

    public void wear(){
        outfit.wear();
    }
}
