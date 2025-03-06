package org.polyfrost.example.testmacro.caculator.functions.stop;

import org.polyfrost.example.testmacro.caculator.functions.Function;
import org.polyfrost.example.testmacro.caculator.functions.Player;
import org.polyfrost.example.testmacro.caculator.utils.Arguments;

import java.util.ArrayList;
import java.util.HashMap;

public class FunctionStopAir extends Function {

    @Override
    public String[] names() {
        return new String[] {"stopair", "sta"};
    }

    @Override
    public void run(Player player, int duration, float facing, ArrayList<Character> modifiers, HashMap<String, Double> effects) throws DurationException, InvalidKeypressException {
        Arguments args = new Arguments();
        args.replace("duration", Math.abs(duration));
        args.replace("facing", (float) facing);

        checkEffects(effects, args, duration);
        checkNoModifiers(modifiers);

        args.replace("airborne", true);
        player.move(args);

    }



}