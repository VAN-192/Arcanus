package dev.cammiescorner.arcanus.common.spells;

import dev.cammiescorner.arcanus.core.util.Pattern;
import dev.cammiescorner.arcanus.core.util.Spell;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class MeteorSpell extends Spell
{
	public MeteorSpell(Pattern first, Pattern second, Pattern last, int manaCost)
	{
		super(first, second, last, manaCost);
	}

	@Override
	public void onCast(World world, PlayerEntity player)
	{
		super.onCast(world, player);
	}
}
