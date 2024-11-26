package de.crdev.thecure;

import de.crdev.thecure.particle.ModParticles;
import de.crdev.thecure.particle.SculcAcidParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

import static de.crdev.thecure.entity.ModEntities.THROWN_SCULC_ACID_JAR_PROJECTILE;
import static de.crdev.thecure.entity.ModEntities.THROWN_SCULC_ACID_VIAL_PROJECTILE;

public class TheCureModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(THROWN_SCULC_ACID_JAR_PROJECTILE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(THROWN_SCULC_ACID_VIAL_PROJECTILE, FlyingItemEntityRenderer::new);

        ParticleFactoryRegistry.getInstance().register(ModParticles.SCULC_ACID_PARTICLE, SculcAcidParticle.Factory::new);
    }
}
