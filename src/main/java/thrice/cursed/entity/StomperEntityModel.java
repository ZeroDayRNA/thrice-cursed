package thrice.cursed.entity;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class StomperEntityModel extends EntityModel<StomperEntity> {
    private final ModelPart face01;
    private final ModelPart face02;
    private final ModelPart tits01;
    private final ModelPart tits02;
    private final ModelPart arms01;
    private final ModelPart arms02;
    private final ModelPart legsandfeet01;
    private final ModelPart legsandfeet02;
    private final ModelPart legsandfeet03;
    private final ModelPart legsandfeet04;
    private final ModelPart legsandfeet05;
    private final ModelPart legsandfeet06;
    private final ModelPart legsandfeet07;
    private final ModelPart legsandfeet08;


    public StomperEntityModel(ModelPart part) {
        this.face01 = part.getChild("face01");
        this.face02 = part.getChild("face02");
        this.tits01 = part.getChild("tits01");
        this.tits02 = part.getChild("tits02");
        this.arms01 = part.getChild("arms01");
        this.arms02 = part.getChild("arms02");
        this.legsandfeet01 = part.getChild("legsandfeet01");
        this.legsandfeet02 = part.getChild("legsandfeet02");
        this.legsandfeet03 = part.getChild("legsandfeet03");
        this.legsandfeet04 = part.getChild("legsandfeet04");
        this.legsandfeet05 = part.getChild("legsandfeet05");
        this.legsandfeet06 = part.getChild("legsandfeet06");
        this.legsandfeet07 = part.getChild("legsandfeet07");
        this.legsandfeet08 = part.getChild("legsandfeet08");
    }

    public static TexturedModelData getTexturedModelData(){
        ModelData data = new ModelData();
        ModelPartData root = data.getRoot();
        ModelPartData tits01 = root.addChild(
                "tits01",
                ModelPartBuilder.create().uv(0,0).cuboid(-7.0f,-29.0f,-5.0f,9.0f,13.0f,10.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData tits02 = root.addChild(
                "tits02",
                ModelPartBuilder.create().uv(0,23).cuboid(-4.0f,-40.0f,-5.0f,6.0f,11.0f,10.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData face01 = root.addChild(
                "face01",
                ModelPartBuilder.create().uv(32,17).cuboid(-6.0f,-47.0f,-3.0f,7.0f,6.0f,6.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData face02 = root.addChild(
                "face02",
                ModelPartBuilder.create().uv(50,0).cuboid(-7.0f,-47.0f,-3.0f,1.0f,6.0f,6.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData arms01 = root.addChild(
                "arms01",
                ModelPartBuilder.create().uv(32,36).cuboid(-3.0f,-39.0f,5.0f,3.0f,17.0f,3.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData arms02 = root.addChild(
                "arms02",
                ModelPartBuilder.create().uv(32,36).cuboid(-3.0f,-39.0f,-8.0f,3.0f,17.0f,3.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData legsandfeet07 = root.addChild(
                "legsandfeet07",
                ModelPartBuilder.create().uv(12,44).cuboid(-3.0f,-16.0f,-5.0f,5.0f,10.0f,4.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData legsandfeet08 = root.addChild(
                "legsandfeet08",
                ModelPartBuilder.create().uv(44,36).cuboid(-3.0f,-16.0f,1.0f,5.0f,10.0f,4.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData legsandfeet02 = root.addChild(
                "legsandfeet02",
                ModelPartBuilder.create().uv(0,4).cuboid(-1.0f,-6.0f,2.0f,3.0f,2.0f,2.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData legsandfeet04 = root.addChild(
                "legsandfeet04",
                ModelPartBuilder.create().uv(28,0).cuboid(-8.0f,-4.0f,1.0f,10.0f,2.0f,4.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData legsandfeet03 = root.addChild(
                "legsandfeet03",
                ModelPartBuilder.create().uv(22,26).cuboid(-8.0f,-5.0f,1.0f,3.0f,1.0f,4.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData legsandfeet01 = root.addChild(
                "legsandfeet01",
                ModelPartBuilder.create().uv(0,0).cuboid(-1.0f,-6.0f,-4.0f,3.0f,2.0f,2.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData legsandfeet06 = root.addChild(
                "legsandfeet06",
                ModelPartBuilder.create().uv(32,30).cuboid(-8.0f,-4.0f,-5.0f,10.0f,2.0f,4.0f,false),
                ModelTransform.pivot(0.0f,24.0f,0.0f));
        ModelPartData legsandfeet05 = root.addChild(
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
        this.face01.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.face02.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.tits01.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.tits02.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.arms01.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.arms02.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.legsandfeet01.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.legsandfeet02.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.legsandfeet03.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.legsandfeet04.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.legsandfeet05.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.legsandfeet06.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.legsandfeet07.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.legsandfeet08.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}
