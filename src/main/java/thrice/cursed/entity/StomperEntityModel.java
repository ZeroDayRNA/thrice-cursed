package thrice.cursed.entity;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class StomperEntityModel extends EntityModel<StomperEntity> {
    private final ModelPart chest;

    public StomperEntityModel(ModelPart part) {
        this.chest = part.getChild("tits01");
    }

    public static TexturedModelData getTexturedModelData(){
        ModelData data = new ModelData();
        ModelPartData root = data.getRoot();
        ModelPartData tits01 = root.addChild(
                "tits01",
                ModelPartBuilder.create().uv(0,0).cuboid(-7.0f,-29.0f,-5.0f,9.0f,13.0f,10.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData tits02 = tits01.addChild(
                "tits02",
                ModelPartBuilder.create().uv(0,23).cuboid(-4.0f,-40.0f,-5.0f,6.0f,11.0f,10.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData face01 = tits02.addChild(
                "face01",
                ModelPartBuilder.create().uv(32,17).cuboid(-6.0f,-47.0f,-3.0f,7.0f,6.0f,0.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData face02 = face01.addChild(
                "face02",
                ModelPartBuilder.create().uv(50,0).cuboid(-7.0f,-47.0f,-3.0f,1.0f,6.0f,6.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData arms01 = tits02.addChild(
                "arms01",
                ModelPartBuilder.create().uv(32,36).cuboid(-3.0f,-39.0f,5.0f,3.0f,17.0f,3.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData arms02 = tits02.addChild(
                "arms02",
                ModelPartBuilder.create().uv(32,36).cuboid(-3.0f,-39.0f,5.0f,3.0f,17.0f,3.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData legsandfeet07 = tits01.addChild(
                "legsandfeet07",
                ModelPartBuilder.create().uv(12,44).cuboid(-3.0f,-16.0f,-5.0f,5.0f,10.0f,4.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData legsandfeet08 = tits01.addChild(
                "legsandfeet08",
                ModelPartBuilder.create().uv(44,36).cuboid(-3.0f,-16.0f,1.0f,5.0f,10.0f,4.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData legsandfeet02 = legsandfeet08.addChild(
                "legsandfeet02",
                ModelPartBuilder.create().uv(0,4).cuboid(-1.0f,-6.0f,2.0f,3.0f,2.0f,2.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData legsandfeet04 = legsandfeet02.addChild(
                "legsandfeet04",
                ModelPartBuilder.create().uv(28,0).cuboid(-8.0f,-4.0f,1.0f,10.0f,2.0f,4.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData legsandfeet03 = legsandfeet04.addChild(
                "legsandfeet03",
                ModelPartBuilder.create().uv(22,26).cuboid(-8.0f,-5.0f,3.0f,1.0f,4.0f,0.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData legsandfeet01 = legsandfeet07.addChild(
                "legsandfeet01",
                ModelPartBuilder.create().uv(0,0).cuboid(-1.0f,-6.0f,-4.0f,3.0f,2.0f,2.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData legsandfeet06 = legsandfeet01.addChild(
                "legsandfeet06",
                ModelPartBuilder.create().uv(32,30).cuboid(-8.0f,-4.0f,-5.0f,10.0f,2.0f,4.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData legsandfeet05 = legsandfeet06.addChild(
                "legsandfeet05",
                ModelPartBuilder.create().uv(38,8).cuboid(-8.0f,-5.0f,-5.0f,3.0f,1.0f,4.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));

        return TexturedModelData.of(data,64,64);
    }

    @Override
    public void setAngles(StomperEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        chest.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}
