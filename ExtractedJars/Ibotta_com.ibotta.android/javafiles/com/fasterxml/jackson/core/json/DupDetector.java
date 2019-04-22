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
		String s1 = _firstName;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String _firstName>
	//    2    4:astore_2        
		if(s1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       16
		{
			_firstName = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #35  <Field String _firstName>
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		}
		if(s.equals(((Object) (s1))))
	//*  10   16:aload_1         
	//*  11   17:aload_2         
	//*  12   18:invokevirtual   #41  <Method boolean String.equals(Object)>
	//*  13   21:ifeq            26
			return true;
	//   14   24:iconst_1        
	//   15   25:ireturn         
		s1 = _secondName;
	//   16   26:aload_0         
	//   17   27:getfield        #43  <Field String _secondName>
	//   18   30:astore_2        
		if(s1 == null)
	//*  19   31:aload_2         
	//*  20   32:ifnonnull       42
		{
			_secondName = s;
	//   21   35:aload_0         
	//   22   36:aload_1         
	//   23   37:putfield        #43  <Field String _secondName>
			return false;
	//   24   40:iconst_0        
	//   25   41:ireturn         
		}
		if(s.equals(((Object) (s1))))
	//*  26   42:aload_1         
	//*  27   43:aload_2         
	//*  28   44:invokevirtual   #41  <Method boolean String.equals(Object)>
	//*  29   47:ifeq            52
			return true;
	//   30   50:iconst_1        
	//   31   51:ireturn         
		if(_seen == null)
	//*  32   52:aload_0         
	//*  33   53:getfield        #45  <Field HashSet _seen>
	//*  34   56:ifnonnull       96
		{
			_seen = new HashSet(16);
	//   35   59:aload_0         
	//   36   60:new             #47  <Class HashSet>
	//   37   63:dup             
	//   38   64:bipush          16
	//   39   66:invokespecial   #50  <Method void HashSet(int)>
	//   40   69:putfield        #45  <Field HashSet _seen>
			_seen.add(((Object) (_firstName)));
	//   41   72:aload_0         
	//   42   73:getfield        #45  <Field HashSet _seen>
	//   43   76:aload_0         
	//   44   77:getfield        #35  <Field String _firstName>
	//   45   80:invokevirtual   #53  <Method boolean HashSet.add(Object)>
	//   46   83:pop             
			_seen.add(((Object) (_secondName)));
	//   47   84:aload_0         
	//   48   85:getfield        #45  <Field HashSet _seen>
	//   49   88:aload_0         
	//   50   89:getfield        #43  <Field String _secondName>
	//   51   92:invokevirtual   #53  <Method boolean HashSet.add(Object)>
	//   52   95:pop             
		}
		return _seen.add(((Object) (s))) ^ true;
	//   53   96:aload_0         
	//   54   97:getfield        #45  <Field HashSet _seen>
	//   55  100:aload_1         
	//   56  101:invokevirtual   #53  <Method boolean HashSet.add(Object)>
	//   57  104:iconst_1        
	//   58  105:ixor            
	//   59  106:ireturn         
	}

	public void reset()
	{
		_firstName = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #35  <Field String _firstName>
		_secondName = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #43  <Field String _secondName>
		_seen = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #45  <Field HashSet _seen>
	//    9   15:return          
	}

	protected String _firstName;
	protected String _secondName;
	protected HashSet _seen;
	protected final Object _source;
}
