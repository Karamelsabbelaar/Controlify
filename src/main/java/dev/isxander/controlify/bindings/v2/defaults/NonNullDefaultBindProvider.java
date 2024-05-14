package dev.isxander.controlify.bindings.v2.defaults;

import dev.isxander.controlify.bindings.v2.inputmask.Bind;
import dev.isxander.controlify.bindings.v2.inputmask.EmptyBind;
import net.minecraft.resources.ResourceLocation;

public record NonNullDefaultBindProvider(DefaultBindProvider provider) implements DefaultBindProvider {
    @Override
    public Bind getDefaultBind(ResourceLocation bindId) {
        var bind = provider.getDefaultBind(bindId);
        if (bind == null) bind = EmptyBind.INSTANCE;
        return bind;
    }
}
