package org.xtext.rslilconvertors.rslil4privacy.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.handlers.HandlerUtil;

public class Exithandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		HandlerUtil.getActiveWorkbenchWindow(event).close();
		return null;
	}

}

