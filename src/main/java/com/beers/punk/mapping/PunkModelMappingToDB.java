package com.beers.punk.mapping;

import com.beers.punk.model.PunkModel;
import com.beers.punk.model.PunkModelToDB;

public class PunkModelMappingToDB {

    public static PunkModelToDB mapTo(PunkModel punkModel){

        PunkModelToDB punkModelToDB = new PunkModelToDB();
        punkModelToDB.setAbv(punkModel.getAbv());
        punkModelToDB.setAttenuationLevel(punkModel.getAttenuation_level());
        punkModelToDB.setBoilVolume(punkModel.getBoil_volume().toString());
        punkModelToDB.setBrewersTips(punkModel.getBrewers_tips());
        punkModelToDB.setContributedBy(punkModel.getContributed_by());
        punkModelToDB.setDescription(punkModel.getDescription());
        punkModelToDB.setEbc(punkModel.getEbc());
        punkModelToDB.setFirstBrewed(punkModel.getFirst_brewed());
        punkModelToDB.setFoodPairing(punkModel.getFood_pairing());
        punkModelToDB.setIbu(punkModel.getIbu());
        punkModelToDB.setId(punkModel.getId());
        punkModelToDB.setImageUrl(punkModel.getImage_url());
        punkModelToDB.setIngredients(punkModel.getIngredients().toString());
        punkModelToDB.setMethod(punkModel.getMethod().toString());
        punkModelToDB.setName(punkModel.getName());
        punkModelToDB.setPh(punkModel.getPh());
        punkModelToDB.setSrm(punkModel.getSrm());
        punkModelToDB.setTagline(punkModel.getTagline());
        punkModelToDB.setTargetFg(punkModel.getTarget_fg());
        punkModelToDB.setTargetOg(punkModel.getTarget_og());
        punkModelToDB.setVolume(punkModel.getVolume().toString());

        return punkModelToDB;
    }
}
