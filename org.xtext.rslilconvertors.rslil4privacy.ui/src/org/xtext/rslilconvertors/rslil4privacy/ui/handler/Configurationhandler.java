package org.xtext.rslilconvertors.rslil4privacy.ui.handler;



import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.xtext.rslilconvertors.rslil4privacy.ui.window.ConfigurationWindow;


public class Configurationhandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ConfigurationWindow window = new ConfigurationWindow(workbenchWindow.getShell());
		window.open();
		return null;
	}

}