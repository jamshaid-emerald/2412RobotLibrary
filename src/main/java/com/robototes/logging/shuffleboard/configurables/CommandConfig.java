package com.robototes.logging.shuffleboard.configurables;

import com.robototes.logging.shuffleboard.AbstractReporter;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * A Command widget
 *
 * @author Eli Orona
 *
 */
public class CommandConfig extends AbstractReporter<Command, CommandConfig> {

	/**
	 * Creates a new command widget
	 *
	 * @param command Command
	 * @param name    Widget name
	 * @param tabName Tab name
	 */
	public CommandConfig(Command command, String name, String tabName) {
		super(() -> command, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kCommand;
	}

	@Override
	public void update() {
	}

}
