// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.*;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

// Referenced classes of package ch.qos.logback.core.joran.action:
//			AbstractIncludeAction

public class IncludeAction extends AbstractIncludeAction
{

	public IncludeAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void AbstractIncludeAction()>
		eventOffset = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #19  <Field int eventOffset>
	//    5    9:return          
	}

	private String getEventName(SaxEvent saxevent)
	{
		if(saxevent.qName.length() > 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #27  <Field String SaxEvent.qName>
	//*   2    4:invokevirtual   #33  <Method int String.length()>
	//*   3    7:ifle            15
			return saxevent.qName;
	//    4   10:aload_1         
	//    5   11:getfield        #27  <Field String SaxEvent.qName>
	//    6   14:areturn         
		else
			return saxevent.localName;
	//    7   15:aload_1         
	//    8   16:getfield        #36  <Field String SaxEvent.localName>
	//    9   19:areturn         
	}

	private InputStream openURL(URL url)
	{
		InputStream inputstream;
		try
		{
			inputstream = url.openStream();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #46  <Method InputStream URL.openStream()>
	//    2    4:astore_2        
		}
	//*   3    5:aload_2         
	//*   4    6:areturn         
		catch(IOException ioexception)
	//*   5    7:astore_2        
		{
			if(!isOptional())
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #50  <Method boolean isOptional()>
	//*   8   12:ifne            55
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #52  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #53  <Method void StringBuilder()>
	//   12   22:astore_3        
				stringbuilder.append("Failed to open [");
	//   13   23:aload_3         
	//   14   24:ldc1            #55  <String "Failed to open [">
	//   15   26:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
				stringbuilder.append(url.toString());
	//   17   30:aload_3         
	//   18   31:aload_1         
	//   19   32:invokevirtual   #63  <Method String URL.toString()>
	//   20   35:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   21   38:pop             
				stringbuilder.append("]");
	//   22   39:aload_3         
	//   23   40:ldc1            #65  <String "]">
	//   24   42:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   25   45:pop             
				addError(stringbuilder.toString(), ((Throwable) (ioexception)));
	//   26   46:aload_0         
	//   27   47:aload_3         
	//   28   48:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   29   51:aload_2         
	//   30   52:invokevirtual   #70  <Method void addError(String, Throwable)>
			}
			return null;
	//   31   55:aconst_null     
	//   32   56:areturn         
		}
		return inputstream;
	}

	private void trimHeadAndTail(SaxEventRecorder saxeventrecorder)
	{
		saxeventrecorder = ((SaxEventRecorder) (saxeventrecorder.getSaxEventList()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #78  <Method List SaxEventRecorder.getSaxEventList()>
	//    2    4:astore_1        
		if(((List) (saxeventrecorder)).size() == 0)
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #83  <Method int List.size()>
	//*   5   11:ifne            15
			return;
	//    6   14:return          
		Object obj = ((Object) ((SaxEvent)((List) (saxeventrecorder)).get(0)));
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:invokeinterface #87  <Method Object List.get(int)>
	//   10   22:checkcast       #24  <Class SaxEvent>
	//   11   25:astore          5
		boolean flag;
		boolean flag1;
		if(obj != null)
	//*  12   27:aload           5
	//*  13   29:ifnull          60
		{
			obj = ((Object) (getEventName(((SaxEvent) (obj)))));
	//   14   32:aload_0         
	//   15   33:aload           5
	//   16   35:invokespecial   #89  <Method String getEventName(SaxEvent)>
	//   17   38:astore          5
			flag1 = "included".equalsIgnoreCase(((String) (obj)));
	//   18   40:ldc1            #11  <String "included">
	//   19   42:aload           5
	//   20   44:invokevirtual   #93  <Method boolean String.equalsIgnoreCase(String)>
	//   21   47:istore          4
			flag = "configuration".equalsIgnoreCase(((String) (obj)));
	//   22   49:ldc1            #8   <String "configuration">
	//   23   51:aload           5
	//   24   53:invokevirtual   #93  <Method boolean String.equalsIgnoreCase(String)>
	//   25   56:istore_3        
		} else
	//*  26   57:goto            65
		{
			flag = false;
	//   27   60:iconst_0        
	//   28   61:istore_3        
			flag1 = false;
	//   29   62:iconst_0        
	//   30   63:istore          4
		}
		if(flag1 || flag)
	//*  31   65:iload           4
	//*  32   67:ifne            74
	//*  33   70:iload_3         
	//*  34   71:ifeq            160
		{
			((List) (saxeventrecorder)).remove(0);
	//   35   74:aload_1         
	//   36   75:iconst_0        
	//   37   76:invokeinterface #96  <Method Object List.remove(int)>
	//   38   81:pop             
			int i = ((List) (saxeventrecorder)).size();
	//   39   82:aload_1         
	//   40   83:invokeinterface #83  <Method int List.size()>
	//   41   88:istore_2        
			if(i == 0)
	//*  42   89:iload_2         
	//*  43   90:ifne            94
				return;
	//   44   93:return          
			i--;
	//   45   94:iload_2         
	//   46   95:iconst_1        
	//   47   96:isub            
	//   48   97:istore_2        
			Object obj1 = ((Object) ((SaxEvent)((List) (saxeventrecorder)).get(i)));
	//   49   98:aload_1         
	//   50   99:iload_2         
	//   51  100:invokeinterface #87  <Method Object List.get(int)>
	//   52  105:checkcast       #24  <Class SaxEvent>
	//   53  108:astore          5
			if(obj1 != null)
	//*  54  110:aload           5
	//*  55  112:ifnull          160
			{
				obj1 = ((Object) (getEventName(((SaxEvent) (obj1)))));
	//   56  115:aload_0         
	//   57  116:aload           5
	//   58  118:invokespecial   #89  <Method String getEventName(SaxEvent)>
	//   59  121:astore          5
				if(flag1 && "included".equalsIgnoreCase(((String) (obj1))) || flag && "configuration".equalsIgnoreCase(((String) (obj1))))
	//*  60  123:iload           4
	//*  61  125:ifeq            138
	//*  62  128:ldc1            #11  <String "included">
	//*  63  130:aload           5
	//*  64  132:invokevirtual   #93  <Method boolean String.equalsIgnoreCase(String)>
	//*  65  135:ifne            152
	//*  66  138:iload_3         
	//*  67  139:ifeq            160
	//*  68  142:ldc1            #8   <String "configuration">
	//*  69  144:aload           5
	//*  70  146:invokevirtual   #93  <Method boolean String.equalsIgnoreCase(String)>
	//*  71  149:ifeq            160
					((List) (saxeventrecorder)).remove(i);
	//   72  152:aload_1         
	//   73  153:iload_2         
	//   74  154:invokeinterface #96  <Method Object List.remove(int)>
	//   75  159:pop             
			}
		}
	//   76  160:return          
	}

	protected SaxEventRecorder createRecorder(InputStream inputstream, URL url)
	{
		return new SaxEventRecorder(getContext());
	//    0    0:new             #74  <Class SaxEventRecorder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #102 <Method ch.qos.logback.core.Context getContext()>
	//    4    8:invokespecial   #105 <Method void SaxEventRecorder(ch.qos.logback.core.Context)>
	//    5   11:areturn         
	}

	protected void processInclude(InterpretationContext interpretationcontext, URL url)
	{
		InputStream inputstream;
		inputstream = openURL(url);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #111 <Method InputStream openURL(URL)>
	//    3    5:astore_3        
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_129;
	//    4    6:aload_3         
	//    5    7:ifnull          129
		try
		{
			ConfigurationWatchListUtil.addToWatchList(getContext(), url);
	//    6   10:aload_0         
	//    7   11:invokevirtual   #102 <Method ch.qos.logback.core.Context getContext()>
	//    8   14:aload_2         
	//    9   15:invokestatic    #117 <Method void ConfigurationWatchListUtil.addToWatchList(ch.qos.logback.core.Context, URL)>
			SaxEventRecorder saxeventrecorder = createRecorder(inputstream, url);
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:aload_2         
	//   13   21:invokevirtual   #119 <Method SaxEventRecorder createRecorder(InputStream, URL)>
	//   14   24:astore          4
			saxeventrecorder.setContext(getContext());
	//   15   26:aload           4
	//   16   28:aload_0         
	//   17   29:invokevirtual   #102 <Method ch.qos.logback.core.Context getContext()>
	//   18   32:invokevirtual   #122 <Method void SaxEventRecorder.setContext(ch.qos.logback.core.Context)>
			saxeventrecorder.recordEvents(inputstream);
	//   19   35:aload           4
	//   20   37:aload_3         
	//   21   38:invokevirtual   #126 <Method void SaxEventRecorder.recordEvents(InputStream)>
			trimHeadAndTail(saxeventrecorder);
	//   22   41:aload_0         
	//   23   42:aload           4
	//   24   44:invokespecial   #128 <Method void trimHeadAndTail(SaxEventRecorder)>
			interpretationcontext.getJoranInterpreter().getEventPlayer().addEventsDynamically(saxeventrecorder.getSaxEventList(), eventOffset);
	//   25   47:aload_1         
	//   26   48:invokevirtual   #134 <Method Interpreter InterpretationContext.getJoranInterpreter()>
	//   27   51:invokevirtual   #140 <Method EventPlayer Interpreter.getEventPlayer()>
	//   28   54:aload           4
	//   29   56:invokevirtual   #78  <Method List SaxEventRecorder.getSaxEventList()>
	//   30   59:aload_0         
	//   31   60:getfield        #19  <Field int eventOffset>
	//   32   63:invokevirtual   #146 <Method void EventPlayer.addEventsDynamically(List, int)>
			break MISSING_BLOCK_LABEL_129;
	//   33   66:goto            129
		}
	//*  34   69:astore_1        
	//*  35   70:goto            122
		// Misplaced declaration of an exception variable
		catch(InterpretationContext interpretationcontext) { }
	//   36   73:astore_1        
		break MISSING_BLOCK_LABEL_74;
		interpretationcontext;
		break MISSING_BLOCK_LABEL_122;
		StringBuilder stringbuilder = new StringBuilder();
	//   37   74:new             #52  <Class StringBuilder>
	//   38   77:dup             
	//   39   78:invokespecial   #53  <Method void StringBuilder()>
	//   40   81:astore          4
		stringbuilder.append("Failed processing [");
	//   41   83:aload           4
	//   42   85:ldc1            #148 <String "Failed processing [">
	//   43   87:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   44   90:pop             
		stringbuilder.append(url.toString());
	//   45   91:aload           4
	//   46   93:aload_2         
	//   47   94:invokevirtual   #63  <Method String URL.toString()>
	//   48   97:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   49  100:pop             
		stringbuilder.append("]");
	//   50  101:aload           4
	//   51  103:ldc1            #65  <String "]">
	//   52  105:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   53  108:pop             
		addError(stringbuilder.toString(), ((Throwable) (interpretationcontext)));
	//   54  109:aload_0         
	//   55  110:aload           4
	//   56  112:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   57  115:aload_1         
	//   58  116:invokevirtual   #70  <Method void addError(String, Throwable)>
		break MISSING_BLOCK_LABEL_129;
	//   59  119:goto            129
		close(inputstream);
	//   60  122:aload_0         
	//   61  123:aload_3         
	//   62  124:invokevirtual   #151 <Method void close(InputStream)>
		throw interpretationcontext;
	//   63  127:aload_1         
	//   64  128:athrow          
		close(inputstream);
	//   65  129:aload_0         
	//   66  130:aload_3         
	//   67  131:invokevirtual   #151 <Method void close(InputStream)>
		return;
	//   68  134:return          
	}

	protected void setEventOffset(int i)
	{
		eventOffset = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #19  <Field int eventOffset>
	//    3    5:return          
	}

	private static final String CONFIG_TAG = "configuration";
	private static final String INCLUDED_TAG = "included";
	private int eventOffset;
}
