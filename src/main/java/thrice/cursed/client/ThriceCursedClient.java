package thrice.cursed.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import thrice.cursed.ThriceCursed;
import thrice.cursed.entity.StomperEntityModel;
import thrice.cursed.render.StomperEntityRenderer;

@Environment(EnvType.CLIENT)
public class ThriceCursedClient implements ClientModInitializer {

    public static final EntityModelLayer MODEL_STOMPER_LAYER = new EntityModelLayer(new Identifier(ThriceCursed.MOD_ID, "stomper"),"main");

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.INSTANCE.register(ThriceCursed.STOMPER, (context) ->{
            return new StomperEntityRenderer(context);
        });
        EntityModelLayerRegistry.registerModelLayer(MODEL_STOMPER_LAYER, StomperEntityModel::getTexturedModelData);

    }
}
