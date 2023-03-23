package de.pwietmaier.sound;

import de.pwietmaier.GanacciMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static SoundEvent GANACCI_HORSE = registerSoundEvent("ganacci_horse");

    public static void registerModSounds() {
        GanacciMod.LOGGER.info("Registering Sounds");
    }

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(GanacciMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}
