package thrice.cursed.render;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import thrice.cursed.ThriceCursed;
import thrice.cursed.entity.StomperEntity;
import thrice.cursed.entity.StomperEntityModel;

public class StomperEntityRenderer extends MobEntityRenderer<StomperEntity, StomperEntityModel>{

    public StomperEntityRenderer(EntityRendererFactory.Context context){
        super(context, new StomperEntityModel(context.getPart(ThriceCursed.MODEL_STOMPER_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(StomperEntity entity){
        return new Identifier("tcursed","");

    }
}
