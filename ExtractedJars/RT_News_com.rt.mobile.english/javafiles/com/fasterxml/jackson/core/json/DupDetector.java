// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import java.util.HashSet;

public class DupDetector
{

	private DupDetector(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		_source = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Object _source>
	//    5    9:return          
	}

	public static DupDetector rootDetector(JsonGenerator jsongenerator)
	{
		return new DupDetector(((Object) (jsongenerator)));
	//    0    0:new             #2   <Class DupDetector>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #24  <Method void DupDetector(Object)>
	//    4    8:areturn         
	}

	public static DupDetector rootDetector(JsonParser jsonparser)
	{
		return new DupDetector(((Object) (jsonparser)));
	//    0    0:new             #2   <Class DupDetector>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #24  <Method void DupDetector(Object)>
	//    4    8:areturn         
	}

	public DupDetector child()
	{
		return new DupDetector(_source);
	//    0    0:new             #2   <Class DupDetector>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Object _source>
	//    4    8:invokespecial   #24  <Method void DupDetector(Object)>
	//    5   11:areturn         
	}

	public JsonLocation findLocation()
	{
		if(_source instanceof JsonParser)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Object _source>
	//*   2    4:instanceof      #31  <Class JsonParser>
	//*   3    7:ifeq            21
			return ((JsonParser)_source).getCurrentLocation();
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field Object _source>
	//    6   14:checkcast       #31  <Class JsonParser>
	//    7   17:invokevirtual   #34  <Method JsonLocation JsonParser.getCurrentLocation()>
	//    8   20:areturn         
		else
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
	}

	public Object getSource()
	{
		return _source;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Object _source>
	//    2    4:areturn         
	}

	public boolean isDup(String s)
		throws JsonParseException
	{
		if(_firstName == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field String _firstName>
	//*   2    4:ifnonnull       14
		{
			_firstName = s;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #42  <Field String _firstName>
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		}
		if(s.equals(((Object) (_firstName))))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #42  <Field String _firstName>
	//*  11   19:invokevirtual   #48  <Method boolean String.equals(Object)>
	//*  12   22:ifeq            27
			return true;
	//   13   25:iconst_1        
	//   14   26:ireturn         
		if(_secondName == null)
	//*  15   27:aload_0         
	//*  16   28:getfield        #50  <Field String _secondName>
	//*  17   31:ifnonnull       41
		{
			_secondName = s;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:putfield        #50  <Field String _secondName>
			return false;
	//   21   39:iconst_0        
	//   22   40:ireturn         
		}
		if(s.equals(((Object) (_secondName))))
	//*  23   41:aload_1         
	//*  24   42:aload_0         
	//*  25   43:getfield        #50  <Field String _secondName>
	//*  26   46:invokevirtual   #48  <Method boolean String.equals(Object)>
	//*  27   49:ifeq            54
			return true;
	//   28   52:iconst_1        
	//   29   53:ireturn         
		if(_seen == null)
	//*  30   54:aload_0         
	//*  31   55:getfield        #52  <Field HashSet _seen>
	//*  32   58:ifnonnull       98
		{
			_seen = new HashSet(16);
	//   33   61:aload_0         
	//   34   62:new             #54  <Class HashSet>
	//   35   65:dup             
	//   36   66:bipush          16
	//   37   68:invokespecial   #57  <Method void HashSet(int)>
	//   38   71:putfield        #52  <Field HashSet _seen>
			_seen.add(((Object) (_firstName)));
	//   39   74:aload_0         
	//   40   75:getfield        #52  <Field HashSet _seen>
	//   41   78:aload_0         
	//   42   79:getfield        #42  <Field String _firstName>
	//   43   82:invokevirtual   #60  <Method boolean HashSet.add(Object)>
	//   44   85:pop             
			_seen.add(((Object) (_secondName)));
	//   45   86:aload_0         
	//   46   87:getfield        #52  <Field HashSet _seen>
	//   47   90:aload_0         
	//   48   91:getfield        #50  <Field String _secondName>
	//   49   94:invokevirtual   #60  <Method boolean HashSet.add(Object)>
	//   50   97:pop             
		}
		return _seen.add(((Object) (s))) ^ true;
	//   51   98:aload_0         
	//   52   99:getfield        #52  <Field HashSet _seen>
	//   53  102:aload_1         
	//   54  103:invokevirtual   #60  <Method boolean HashSet.add(Object)>
	//   55  106:iconst_1        
	//   56  107:ixor            
	//   57  108:ireturn         
	}

	public void reset()
	{
		_firstName = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #42  <Field String _firstName>
		_secondName = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #50  <Field String _secondName>
		_seen = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #52  <Field HashSet _seen>
	//    9   15:return          
	}

	protected String _firstName;
	protected String _secondName;
	protected HashSet _seen;
	protected final Object _source;
}
