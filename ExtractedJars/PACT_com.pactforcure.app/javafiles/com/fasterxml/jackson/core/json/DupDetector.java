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
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		boolean flag;
		if(_firstName == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #42  <Field String _firstName>
	//*   4    6:ifnonnull       18
		{
			_firstName = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #42  <Field String _firstName>
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		} else
	//*  10   16:iload_2         
	//*  11   17:ireturn         
		{
			flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
			if(!s.equals(((Object) (_firstName))))
	//*  14   20:aload_1         
	//*  15   21:aload_0         
	//*  16   22:getfield        #42  <Field String _firstName>
	//*  17   25:invokevirtual   #48  <Method boolean String.equals(Object)>
	//*  18   28:ifne            16
			{
				if(_secondName == null)
	//*  19   31:aload_0         
	//*  20   32:getfield        #50  <Field String _secondName>
	//*  21   35:ifnonnull       45
				{
					_secondName = s;
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:putfield        #50  <Field String _secondName>
					return false;
	//   25   43:iconst_0        
	//   26   44:ireturn         
				}
				flag = flag1;
	//   27   45:iload_3         
	//   28   46:istore_2        
				if(!s.equals(((Object) (_secondName))))
	//*  29   47:aload_1         
	//*  30   48:aload_0         
	//*  31   49:getfield        #50  <Field String _secondName>
	//*  32   52:invokevirtual   #48  <Method boolean String.equals(Object)>
	//*  33   55:ifne            16
				{
					if(_seen == null)
	//*  34   58:aload_0         
	//*  35   59:getfield        #52  <Field HashSet _seen>
	//*  36   62:ifnonnull       102
					{
						_seen = new HashSet(16);
	//   37   65:aload_0         
	//   38   66:new             #54  <Class HashSet>
	//   39   69:dup             
	//   40   70:bipush          16
	//   41   72:invokespecial   #57  <Method void HashSet(int)>
	//   42   75:putfield        #52  <Field HashSet _seen>
						_seen.add(((Object) (_firstName)));
	//   43   78:aload_0         
	//   44   79:getfield        #52  <Field HashSet _seen>
	//   45   82:aload_0         
	//   46   83:getfield        #42  <Field String _firstName>
	//   47   86:invokevirtual   #60  <Method boolean HashSet.add(Object)>
	//   48   89:pop             
						_seen.add(((Object) (_secondName)));
	//   49   90:aload_0         
	//   50   91:getfield        #52  <Field HashSet _seen>
	//   51   94:aload_0         
	//   52   95:getfield        #50  <Field String _secondName>
	//   53   98:invokevirtual   #60  <Method boolean HashSet.add(Object)>
	//   54  101:pop             
					}
					flag = flag1;
	//   55  102:iload_3         
	//   56  103:istore_2        
					if(_seen.add(((Object) (s))))
	//*  57  104:aload_0         
	//*  58  105:getfield        #52  <Field HashSet _seen>
	//*  59  108:aload_1         
	//*  60  109:invokevirtual   #60  <Method boolean HashSet.add(Object)>
	//*  61  112:ifeq            16
						return false;
	//   62  115:iconst_0        
	//   63  116:ireturn         
				}
			}
		}
		return flag;
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
