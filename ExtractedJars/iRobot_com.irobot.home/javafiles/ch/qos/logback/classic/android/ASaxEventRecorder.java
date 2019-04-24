// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.android;

import a.a.a.a.a;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.JoranException;
import java.util.*;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.LocatorImpl;
import org.xmlpull.v1.XmlPullParser;

public class ASaxEventRecorder extends SaxEventRecorder
{
	static class StatePassFilter
	{

		public boolean checkEnd(String s)
		{
			int i = _depth;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field int _depth>
		//    2    4:istore_2        
			boolean flag = false;
		//    3    5:iconst_0        
		//    4    6:istore_3        
			if(i > 0 && s.equals(((Object) (_states[_depth - 1]))))
		//*   5    7:iload_2         
		//*   6    8:ifle            41
		//*   7   11:aload_1         
		//*   8   12:aload_0         
		//*   9   13:getfield        #22  <Field String[] _states>
		//*  10   16:aload_0         
		//*  11   17:getfield        #18  <Field int _depth>
		//*  12   20:iconst_1        
		//*  13   21:isub            
		//*  14   22:aaload          
		//*  15   23:invokevirtual   #29  <Method boolean String.equals(Object)>
		//*  16   26:ifeq            41
			{
				_depth = _depth - 1;
		//   17   29:aload_0         
		//   18   30:aload_0         
		//   19   31:getfield        #18  <Field int _depth>
		//   20   34:iconst_1        
		//   21   35:isub            
		//   22   36:putfield        #18  <Field int _depth>
				return false;
		//   23   39:iconst_0        
		//   24   40:ireturn         
			}
			if(_depth == _states.length)
		//*  25   41:aload_0         
		//*  26   42:getfield        #18  <Field int _depth>
		//*  27   45:aload_0         
		//*  28   46:getfield        #22  <Field String[] _states>
		//*  29   49:arraylength     
		//*  30   50:icmpne          55
				flag = true;
		//   31   53:iconst_1        
		//   32   54:istore_3        
			return flag;
		//   33   55:iload_3         
		//   34   56:ireturn         
		}

		public boolean checkStart(String s)
		{
			if(_depth == _states.length)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field int _depth>
		//*   2    4:aload_0         
		//*   3    5:getfield        #22  <Field String[] _states>
		//*   4    8:arraylength     
		//*   5    9:icmpne          14
				return true;
		//    6   12:iconst_1        
		//    7   13:ireturn         
			if(s.equals(((Object) (_states[_depth]))))
		//*   8   14:aload_1         
		//*   9   15:aload_0         
		//*  10   16:getfield        #22  <Field String[] _states>
		//*  11   19:aload_0         
		//*  12   20:getfield        #18  <Field int _depth>
		//*  13   23:aaload          
		//*  14   24:invokevirtual   #29  <Method boolean String.equals(Object)>
		//*  15   27:ifeq            40
				_depth = _depth + 1;
		//   16   30:aload_0         
		//   17   31:aload_0         
		//   18   32:getfield        #18  <Field int _depth>
		//   19   35:iconst_1        
		//   20   36:iadd            
		//   21   37:putfield        #18  <Field int _depth>
			return false;
		//   22   40:iconst_0        
		//   23   41:ireturn         
		}

		public int depth()
		{
			return _depth;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field int _depth>
		//    2    4:ireturn         
		}

		public boolean passed()
		{
			return _depth == _states.length;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field int _depth>
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field String[] _states>
		//    4    8:arraylength     
		//    5    9:icmpne          14
		//    6   12:iconst_1        
		//    7   13:ireturn         
		//    8   14:iconst_0        
		//    9   15:ireturn         
		}

		public void reset()
		{
			_depth = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #18  <Field int _depth>
		//    3    5:return          
		}

		public int size()
		{
			return _states.length;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field String[] _states>
		//    2    4:arraylength     
		//    3    5:ireturn         
		}

		private int _depth;
		private final String _states[];

		public transient StatePassFilter(String as[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			_depth = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #18  <Field int _depth>
			String as1[] = as;
		//    5    9:aload_1         
		//    6   10:astore_2        
			if(as == null)
		//*   7   11:aload_1         
		//*   8   12:ifnonnull       20
				as1 = new String[0];
		//    9   15:iconst_0        
		//   10   16:anewarray       String[]
		//   11   19:astore_2        
			_states = as1;
		//   12   20:aload_0         
		//   13   21:aload_2         
		//   14   22:putfield        #22  <Field String[] _states>
		//   15   25:return          
		}
	}


	public ASaxEventRecorder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void SaxEventRecorder()>
		holderForStartAndLength = new int[2];
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:putfield        #22  <Field int[] holderForStartAndLength>
		filter = new StatePassFilter(new String[0]);
	//    6   11:aload_0         
	//    7   12:new             #6   <Class ASaxEventRecorder$StatePassFilter>
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:anewarray       String[]
	//   11   20:invokespecial   #27  <Method void ASaxEventRecorder$StatePassFilter(String[])>
	//   12   23:putfield        #29  <Field ASaxEventRecorder$StatePassFilter filter>
		elemNameToWatch = null;
	//   13   26:aload_0         
	//   14   27:aconst_null     
	//   15   28:putfield        #31  <Field String elemNameToWatch>
		elemAttrs = null;
	//   16   31:aload_0         
	//   17   32:aconst_null     
	//   18   33:putfield        #33  <Field Map elemAttrs>
	//   19   36:return          
	}

	private void characters(XmlPullParser xmlpullparser)
	{
		if(filter.passed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field ASaxEventRecorder$StatePassFilter filter>
	//*   2    4:invokevirtual   #40  <Method boolean ASaxEventRecorder$StatePassFilter.passed()>
	//*   3    7:ifeq            36
			super.characters(xmlpullparser.getTextCharacters(holderForStartAndLength), holderForStartAndLength[0], holderForStartAndLength[1]);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field int[] holderForStartAndLength>
	//    8   16:invokeinterface #46  <Method char[] XmlPullParser.getTextCharacters(int[])>
	//    9   21:aload_0         
	//   10   22:getfield        #22  <Field int[] holderForStartAndLength>
	//   11   25:iconst_0        
	//   12   26:iaload          
	//   13   27:aload_0         
	//   14   28:getfield        #22  <Field int[] holderForStartAndLength>
	//   15   31:iconst_1        
	//   16   32:iaload          
	//   17   33:invokespecial   #49  <Method void SaxEventRecorder.characters(char[], int, int)>
	//   18   36:return          
	}

	private void checkForWatchedAttributes(XmlPullParser xmlpullparser)
	{
		if(elemNameToWatch != null && elemAttrs == null && xmlpullparser.getName().equals(((Object) (elemNameToWatch))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field String elemNameToWatch>
	//*   2    4:ifnull          209
	//*   3    7:aload_0         
	//*   4    8:getfield        #33  <Field Map elemAttrs>
	//*   5   11:ifnonnull       209
	//*   6   14:aload_1         
	//*   7   15:invokeinterface #54  <Method String XmlPullParser.getName()>
	//*   8   20:aload_0         
	//*   9   21:getfield        #31  <Field String elemNameToWatch>
	//*  10   24:invokevirtual   #58  <Method boolean String.equals(Object)>
	//*  11   27:ifeq            209
		{
			HashMap hashmap = new HashMap();
	//   12   30:new             #60  <Class HashMap>
	//   13   33:dup             
	//   14   34:invokespecial   #61  <Method void HashMap()>
	//   15   37:astore          6
			for(int i = 0; i < xmlpullparser.getAttributeCount(); i++)
	//*  16   39:iconst_0        
	//*  17   40:istore_2        
	//*  18   41:iload_2         
	//*  19   42:aload_1         
	//*  20   43:invokeinterface #65  <Method int XmlPullParser.getAttributeCount()>
	//*  21   48:icmpge          203
			{
				String s = "";
	//   22   51:ldc1            #67  <String "">
	//   23   53:astore          4
				Object obj = ((Object) (xmlpullparser.getAttributeNamespace(i)));
	//   24   55:aload_1         
	//   25   56:iload_2         
	//   26   57:invokeinterface #71  <Method String XmlPullParser.getAttributeNamespace(int)>
	//   27   62:astore          5
				if(((String) (obj)).length() > 0)
	//*  28   64:aload           5
	//*  29   66:invokevirtual   #74  <Method int String.length()>
	//*  30   69:ifle            146
				{
					int j = ((String) (obj)).lastIndexOf("/");
	//   31   72:aload           5
	//   32   74:ldc1            #76  <String "/">
	//   33   76:invokevirtual   #80  <Method int String.lastIndexOf(String)>
	//   34   79:istore_3        
					s = ((String) (obj));
	//   35   80:aload           5
	//   36   82:astore          4
					if(j > -1)
	//*  37   84:iload_3         
	//*  38   85:iconst_m1       
	//*  39   86:icmple          114
					{
						j++;
	//   40   89:iload_3         
	//   41   90:iconst_1        
	//   42   91:iadd            
	//   43   92:istore_3        
						s = ((String) (obj));
	//   44   93:aload           5
	//   45   95:astore          4
						if(j < ((String) (obj)).length())
	//*  46   97:iload_3         
	//*  47   98:aload           5
	//*  48  100:invokevirtual   #74  <Method int String.length()>
	//*  49  103:icmpge          114
							s = ((String) (obj)).substring(j);
	//   50  106:aload           5
	//   51  108:iload_3         
	//   52  109:invokevirtual   #83  <Method String String.substring(int)>
	//   53  112:astore          4
					}
					obj = ((Object) (new StringBuilder()));
	//   54  114:new             #85  <Class StringBuilder>
	//   55  117:dup             
	//   56  118:invokespecial   #86  <Method void StringBuilder()>
	//   57  121:astore          5
					((StringBuilder) (obj)).append(s);
	//   58  123:aload           5
	//   59  125:aload           4
	//   60  127:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   61  130:pop             
					((StringBuilder) (obj)).append(":");
	//   62  131:aload           5
	//   63  133:ldc1            #92  <String ":">
	//   64  135:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   65  138:pop             
					s = ((StringBuilder) (obj)).toString();
	//   66  139:aload           5
	//   67  141:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   68  144:astore          4
				}
				obj = ((Object) (new StringBuilder()));
	//   69  146:new             #85  <Class StringBuilder>
	//   70  149:dup             
	//   71  150:invokespecial   #86  <Method void StringBuilder()>
	//   72  153:astore          5
				((StringBuilder) (obj)).append(s);
	//   73  155:aload           5
	//   74  157:aload           4
	//   75  159:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   76  162:pop             
				((StringBuilder) (obj)).append(xmlpullparser.getAttributeName(i));
	//   77  163:aload           5
	//   78  165:aload_1         
	//   79  166:iload_2         
	//   80  167:invokeinterface #98  <Method String XmlPullParser.getAttributeName(int)>
	//   81  172:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   82  175:pop             
				((Map) (hashmap)).put(((Object) (((StringBuilder) (obj)).toString())), ((Object) (xmlpullparser.getAttributeValue(i))));
	//   83  176:aload           6
	//   84  178:aload           5
	//   85  180:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   86  183:aload_1         
	//   87  184:iload_2         
	//   88  185:invokeinterface #101 <Method String XmlPullParser.getAttributeValue(int)>
	//   89  190:invokeinterface #107 <Method Object Map.put(Object, Object)>
	//   90  195:pop             
			}

	//   91  196:iload_2         
	//   92  197:iconst_1        
	//   93  198:iadd            
	//   94  199:istore_2        
	//*  95  200:goto            41
			elemAttrs = ((Map) (hashmap));
	//   96  203:aload_0         
	//   97  204:aload           6
	//   98  206:putfield        #33  <Field Map elemAttrs>
		}
	//   99  209:return          
	}

	private void endElement(XmlPullParser xmlpullparser)
	{
		String s = xmlpullparser.getName();
	//    0    0:aload_1         
	//    1    1:invokeinterface #54  <Method String XmlPullParser.getName()>
	//    2    6:astore_2        
		if(filter.checkEnd(s))
	//*   3    7:aload_0         
	//*   4    8:getfield        #29  <Field ASaxEventRecorder$StatePassFilter filter>
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #112 <Method boolean ASaxEventRecorder$StatePassFilter.checkEnd(String)>
	//*   7   15:ifeq            30
			endElement(xmlpullparser.getNamespace(), s, s);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokeinterface #115 <Method String XmlPullParser.getNamespace()>
	//   11   25:aload_2         
	//   12   26:aload_2         
	//   13   27:invokevirtual   #118 <Method void endElement(String, String, String)>
	//   14   30:return          
	}

	private void startDocument(XmlPullParser xmlpullparser)
	{
		super.startDocument();
	//    0    0:aload_0         
	//    1    1:invokespecial   #121 <Method void SaxEventRecorder.startDocument()>
		super.setDocumentLocator(((org.xml.sax.Locator) (new LocatorImpl())));
	//    2    4:aload_0         
	//    3    5:new             #123 <Class LocatorImpl>
	//    4    8:dup             
	//    5    9:invokespecial   #124 <Method void LocatorImpl()>
	//    6   12:invokespecial   #128 <Method void SaxEventRecorder.setDocumentLocator(org.xml.sax.Locator)>
	//    7   15:return          
	}

	private void startElement(XmlPullParser xmlpullparser)
	{
		String s = xmlpullparser.getName();
	//    0    0:aload_1         
	//    1    1:invokeinterface #54  <Method String XmlPullParser.getName()>
	//    2    6:astore_3        
		if(filter.checkStart(s))
	//*   3    7:aload_0         
	//*   4    8:getfield        #29  <Field ASaxEventRecorder$StatePassFilter filter>
	//*   5   11:aload_3         
	//*   6   12:invokevirtual   #132 <Method boolean ASaxEventRecorder$StatePassFilter.checkStart(String)>
	//*   7   15:ifeq            100
		{
			AttributesImpl attributesimpl = new AttributesImpl();
	//    8   18:new             #134 <Class AttributesImpl>
	//    9   21:dup             
	//   10   22:invokespecial   #135 <Method void AttributesImpl()>
	//   11   25:astore          4
			for(int i = 0; i < xmlpullparser.getAttributeCount(); i++)
	//*  12   27:iconst_0        
	//*  13   28:istore_2        
	//*  14   29:iload_2         
	//*  15   30:aload_1         
	//*  16   31:invokeinterface #65  <Method int XmlPullParser.getAttributeCount()>
	//*  17   36:icmpge          86
				attributesimpl.addAttribute(xmlpullparser.getAttributeNamespace(i), xmlpullparser.getAttributeName(i), xmlpullparser.getAttributeName(i), xmlpullparser.getAttributeType(i), xmlpullparser.getAttributeValue(i));
	//   18   39:aload           4
	//   19   41:aload_1         
	//   20   42:iload_2         
	//   21   43:invokeinterface #71  <Method String XmlPullParser.getAttributeNamespace(int)>
	//   22   48:aload_1         
	//   23   49:iload_2         
	//   24   50:invokeinterface #98  <Method String XmlPullParser.getAttributeName(int)>
	//   25   55:aload_1         
	//   26   56:iload_2         
	//   27   57:invokeinterface #98  <Method String XmlPullParser.getAttributeName(int)>
	//   28   62:aload_1         
	//   29   63:iload_2         
	//   30   64:invokeinterface #138 <Method String XmlPullParser.getAttributeType(int)>
	//   31   69:aload_1         
	//   32   70:iload_2         
	//   33   71:invokeinterface #101 <Method String XmlPullParser.getAttributeValue(int)>
	//   34   76:invokevirtual   #142 <Method void AttributesImpl.addAttribute(String, String, String, String, String)>

	//   35   79:iload_2         
	//   36   80:iconst_1        
	//   37   81:iadd            
	//   38   82:istore_2        
	//*  39   83:goto            29
			startElement(xmlpullparser.getNamespace(), s, s, ((org.xml.sax.Attributes) (attributesimpl)));
	//   40   86:aload_0         
	//   41   87:aload_1         
	//   42   88:invokeinterface #115 <Method String XmlPullParser.getNamespace()>
	//   43   93:aload_3         
	//   44   94:aload_3         
	//   45   95:aload           4
	//   46   97:invokevirtual   #145 <Method void startElement(String, String, String, org.xml.sax.Attributes)>
		}
		checkForWatchedAttributes(xmlpullparser);
	//   47  100:aload_0         
	//   48  101:aload_1         
	//   49  102:invokespecial   #147 <Method void checkForWatchedAttributes(XmlPullParser)>
	//   50  105:return          
	}

	public Map getAttributeWatchValues()
	{
		return elemAttrs;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Map elemAttrs>
	//    2    4:areturn         
	}

	public List recordEvents(InputSource inputsource)
	{
		inputsource = ((InputSource) (inputsource.getByteStream()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #161 <Method java.io.InputStream InputSource.getByteStream()>
	//    2    4:astore_1        
		if(inputsource == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       19
			throw new IllegalArgumentException("Input source must specify an input stream");
	//    5    9:new             #163 <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc1            #165 <String "Input source must specify an input stream">
	//    8   15:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//    9   18:athrow          
		inputsource = ((InputSource) (new a(((java.io.InputStream) (inputsource)))));
	//   10   19:new             #170 <Class a>
	//   11   22:dup             
	//   12   23:aload_1         
	//   13   24:invokespecial   #173 <Method void a(java.io.InputStream)>
	//   14   27:astore_1        
		elemAttrs = null;
	//   15   28:aload_0         
	//   16   29:aconst_null     
	//   17   30:putfield        #33  <Field Map elemAttrs>
_L1:
		int i = ((a) (inputsource)).next();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #176 <Method int a.next()>
	//   20   37:istore_2        
label0:
		{
			if(i <= -1)
				break MISSING_BLOCK_LABEL_120;
	//   21   38:iload_2         
	//   22   39:iconst_m1       
	//   23   40:icmple          120
			if(i != 0)
				break label0;
	//   24   43:iload_2         
	//   25   44:ifne            62
			try
			{
				filter.reset();
	//   26   47:aload_0         
	//   27   48:getfield        #29  <Field ASaxEventRecorder$StatePassFilter filter>
	//   28   51:invokevirtual   #179 <Method void ASaxEventRecorder$StatePassFilter.reset()>
				startDocument(((XmlPullParser) (inputsource)));
	//   29   54:aload_0         
	//   30   55:aload_1         
	//   31   56:invokespecial   #181 <Method void startDocument(XmlPullParser)>
			}
	//*  32   59:goto            33
	//*  33   62:iconst_1        
	//*  34   63:iload_2         
	//*  35   64:icmpne          81
	//*  36   67:aload_0         
	//*  37   68:getfield        #29  <Field ASaxEventRecorder$StatePassFilter filter>
	//*  38   71:invokevirtual   #179 <Method void ASaxEventRecorder$StatePassFilter.reset()>
	//*  39   74:aload_0         
	//*  40   75:invokevirtual   #184 <Method void endDocument()>
	//*  41   78:goto            120
	//*  42   81:iconst_2        
	//*  43   82:iload_2         
	//*  44   83:icmpne          94
	//*  45   86:aload_0         
	//*  46   87:aload_1         
	//*  47   88:invokespecial   #186 <Method void startElement(XmlPullParser)>
	//*  48   91:goto            33
	//*  49   94:iconst_3        
	//*  50   95:iload_2         
	//*  51   96:icmpne          107
	//*  52   99:aload_0         
	//*  53  100:aload_1         
	//*  54  101:invokespecial   #188 <Method void endElement(XmlPullParser)>
	//*  55  104:goto            33
	//*  56  107:iconst_4        
	//*  57  108:iload_2         
	//*  58  109:icmpne          33
	//*  59  112:aload_0         
	//*  60  113:aload_1         
	//*  61  114:invokespecial   #190 <Method void characters(XmlPullParser)>
	//*  62  117:goto            33
	//*  63  120:aload_0         
	//*  64  121:invokevirtual   #194 <Method List getSaxEventList()>
	//*  65  124:astore_1        
	//*  66  125:aload_1         
	//*  67  126:areturn         
			// Misplaced declaration of an exception variable
			catch(InputSource inputsource)
	//*  68  127:astore_1        
			{
				addError(((Exception) (inputsource)).getMessage(), ((Throwable) (inputsource)));
	//   69  128:aload_0         
	//   70  129:aload_1         
	//   71  130:invokevirtual   #197 <Method String Exception.getMessage()>
	//   72  133:aload_1         
	//   73  134:invokevirtual   #201 <Method void addError(String, Throwable)>
				throw new JoranException("Can't parse Android XML resource", ((Throwable) (inputsource)));
	//   74  137:new             #203 <Class JoranException>
	//   75  140:dup             
	//   76  141:ldc1            #205 <String "Can't parse Android XML resource">
	//   77  143:aload_1         
	//   78  144:invokespecial   #207 <Method void JoranException(String, Throwable)>
	//   79  147:athrow          
			}
		}
		  goto _L1
		if(1 != i)
			break MISSING_BLOCK_LABEL_81;
		filter.reset();
		endDocument();
		break MISSING_BLOCK_LABEL_120;
		if(2 != i)
			break MISSING_BLOCK_LABEL_94;
		startElement(((XmlPullParser) (inputsource)));
		  goto _L1
		if(3 != i) goto _L3; else goto _L2
_L2:
		endElement(((XmlPullParser) (inputsource)));
		  goto _L1
_L3:
		if(4 != i) goto _L1; else goto _L4
_L4:
		characters(((XmlPullParser) (inputsource)));
		  goto _L1
		inputsource = ((InputSource) (getSaxEventList()));
		return ((List) (inputsource));
	}

	public void setAttributeWatch(String s)
	{
		elemNameToWatch = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field String elemNameToWatch>
	//    3    5:return          
	}

	public transient void setFilter(String as[])
	{
		filter = new StatePassFilter(as);
	//    0    0:aload_0         
	//    1    1:new             #6   <Class ASaxEventRecorder$StatePassFilter>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #27  <Method void ASaxEventRecorder$StatePassFilter(String[])>
	//    5    9:putfield        #29  <Field ASaxEventRecorder$StatePassFilter filter>
	//    6   12:return          
	}

	private Map elemAttrs;
	private String elemNameToWatch;
	private StatePassFilter filter;
	private int holderForStartAndLength[];
}
