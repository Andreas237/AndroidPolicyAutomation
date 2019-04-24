// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.android.ASaxEventRecorder;
import ch.qos.logback.core.joran.action.IncludeAction;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import java.io.InputStream;
import java.net.URL;
import org.xml.sax.Attributes;

public class FindIncludeAction extends IncludeAction
{

	public FindIncludeAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void IncludeAction()>
		setEventOffset(1);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #15  <Method void setEventOffset(int)>
	//    5    9:return          
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
	//    0    0:return          
	}

	protected SaxEventRecorder createRecorder(InputStream inputstream, URL url)
	{
		if(url.toString().endsWith("AndroidManifest.xml"))
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #26  <Method String URL.toString()>
	//*   2    4:ldc1            #28  <String "AndroidManifest.xml">
	//*   3    6:invokevirtual   #34  <Method boolean String.endsWith(String)>
	//*   4    9:ifeq            35
		{
			inputstream = ((InputStream) (new ASaxEventRecorder()));
	//    5   12:new             #36  <Class ASaxEventRecorder>
	//    6   15:dup             
	//    7   16:invokespecial   #37  <Method void ASaxEventRecorder()>
	//    8   19:astore_1        
			((ASaxEventRecorder) (inputstream)).setFilter(new String[] {
				"logback"
			});
	//    9   20:aload_1         
	//   10   21:iconst_1        
	//   11   22:anewarray       String[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:ldc1            #39  <String "logback">
	//   15   29:aastore         
	//   16   30:invokevirtual   #43  <Method void ASaxEventRecorder.setFilter(String[])>
			return ((SaxEventRecorder) (inputstream));
	//   17   33:aload_1         
	//   18   34:areturn         
		} else
		{
			return new SaxEventRecorder(getContext());
	//   19   35:new             #45  <Class SaxEventRecorder>
	//   20   38:dup             
	//   21   39:aload_0         
	//   22   40:invokevirtual   #49  <Method ch.qos.logback.core.Context getContext()>
	//   23   43:invokespecial   #52  <Method void SaxEventRecorder(ch.qos.logback.core.Context)>
	//   24   46:areturn         
		}
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
		if(!interpretationcontext.isEmpty() && (interpretationcontext.peekObject() instanceof ConditionalIncludeAction.State))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #62  <Method boolean InterpretationContext.isEmpty()>
	//*   2    4:ifne            126
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #66  <Method Object InterpretationContext.peekObject()>
	//*   5   11:instanceof      #68  <Class ConditionalIncludeAction$State>
	//*   6   14:ifeq            126
		{
			s = ((String) (((ConditionalIncludeAction.State)interpretationcontext.popObject()).getUrl()));
	//    7   17:aload_1         
	//    8   18:invokevirtual   #71  <Method Object InterpretationContext.popObject()>
	//    9   21:checkcast       #68  <Class ConditionalIncludeAction$State>
	//   10   24:invokevirtual   #75  <Method URL ConditionalIncludeAction$State.getUrl()>
	//   11   27:astore_2        
			if(s != null)
	//*  12   28:aload_2         
	//*  13   29:ifnull          120
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   14   32:new             #77  <Class StringBuilder>
	//   15   35:dup             
	//   16   36:invokespecial   #78  <Method void StringBuilder()>
	//   17   39:astore_3        
				stringbuilder.append("Path found [");
	//   18   40:aload_3         
	//   19   41:ldc1            #80  <String "Path found [">
	//   20   43:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
				stringbuilder.append(((URL) (s)).toString());
	//   22   47:aload_3         
	//   23   48:aload_2         
	//   24   49:invokevirtual   #26  <Method String URL.toString()>
	//   25   52:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   26   55:pop             
				stringbuilder.append("]");
	//   27   56:aload_3         
	//   28   57:ldc1            #86  <String "]">
	//   29   59:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
				addInfo(stringbuilder.toString());
	//   31   63:aload_0         
	//   32   64:aload_3         
	//   33   65:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   34   68:invokevirtual   #91  <Method void addInfo(String)>
				try
				{
					processInclude(interpretationcontext, ((URL) (s)));
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:aload_2         
	//   38   74:invokevirtual   #95  <Method void processInclude(InterpretationContext, URL)>
					return;
	//   39   77:return          
				}
				// Misplaced declaration of an exception variable
				catch(InterpretationContext interpretationcontext)
	//*  40   78:astore_1        
				{
					stringbuilder = new StringBuilder();
	//   41   79:new             #77  <Class StringBuilder>
	//   42   82:dup             
	//   43   83:invokespecial   #78  <Method void StringBuilder()>
	//   44   86:astore_3        
				}
				stringbuilder.append("Failed to process include [");
	//   45   87:aload_3         
	//   46   88:ldc1            #97  <String "Failed to process include [">
	//   47   90:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   48   93:pop             
				stringbuilder.append(((URL) (s)).toString());
	//   49   94:aload_3         
	//   50   95:aload_2         
	//   51   96:invokevirtual   #26  <Method String URL.toString()>
	//   52   99:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   53  102:pop             
				stringbuilder.append("]");
	//   54  103:aload_3         
	//   55  104:ldc1            #86  <String "]">
	//   56  106:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   57  109:pop             
				addError(stringbuilder.toString(), ((Throwable) (interpretationcontext)));
	//   58  110:aload_0         
	//   59  111:aload_3         
	//   60  112:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   61  115:aload_1         
	//   62  116:invokevirtual   #101 <Method void addError(String, Throwable)>
				return;
	//   63  119:return          
			}
			addInfo("No paths found from includes");
	//   64  120:aload_0         
	//   65  121:ldc1            #103 <String "No paths found from includes">
	//   66  123:invokevirtual   #91  <Method void addInfo(String)>
		}
	//   67  126:return          
	}

	private static final int EVENT_OFFSET = 1;
}
