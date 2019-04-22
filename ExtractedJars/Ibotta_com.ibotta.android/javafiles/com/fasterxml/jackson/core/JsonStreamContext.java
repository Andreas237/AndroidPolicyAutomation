// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharTypes;

// Referenced classes of package com.fasterxml.jackson.core:
//			JsonLocation

public abstract class JsonStreamContext
{

	protected JsonStreamContext()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	protected JsonStreamContext(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		_type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #15  <Field int _type>
		_index = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #17  <Field int _index>
	//    8   14:return          
	}

	protected JsonStreamContext(JsonStreamContext jsonstreamcontext)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		_type = jsonstreamcontext._type;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #15  <Field int _type>
	//    5    9:putfield        #15  <Field int _type>
		_index = jsonstreamcontext._index;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #17  <Field int _index>
	//    9   17:putfield        #17  <Field int _index>
	//   10   20:return          
	}

	public final int getCurrentIndex()
	{
		int j = _index;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int _index>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j < 0)
	//*   5    7:iload_2         
	//*   6    8:ifge            13
			i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_1        
		return i;
	//    9   13:iload_1         
	//   10   14:ireturn         
	}

	public abstract String getCurrentName();

	public Object getCurrentValue()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final int getEntryCount()
	{
		return _index + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int _index>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public abstract JsonStreamContext getParent();

	public JsonLocation getStartLocation(Object obj)
	{
		return JsonLocation.NA;
	//    0    0:getstatic       #35  <Field JsonLocation JsonLocation.NA>
	//    1    3:areturn         
	}

	public final boolean inArray()
	{
		return _type == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int _type>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final boolean inObject()
	{
		return _type == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int _type>
	//    2    4:iconst_2        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final boolean inRoot()
	{
		return _type == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int _type>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void setCurrentValue(Object obj)
	{
	//    0    0:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(64);
	//    0    0:new             #44  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          64
	//    3    6:invokespecial   #47  <Method void StringBuilder(int)>
	//    4    9:astore_1        
		switch(_type)
	//*   5   10:aload_0         
	//*   6   11:getfield        #15  <Field int _type>
		{
	//*   7   14:tableswitch     0 1: default 36
	//	               0 100
	//	               1 74
		default:
			stringbuilder.append('{');
	//    8   36:aload_1         
	//    9   37:bipush          123
	//   10   39:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//   11   42:pop             
			String s = getCurrentName();
	//   12   43:aload_0         
	//   13   44:invokevirtual   #53  <Method String getCurrentName()>
	//   14   47:astore_2        
			if(s != null)
	//*  15   48:aload_2         
	//*  16   49:ifnull          110
			{
				stringbuilder.append('"');
	//   17   52:aload_1         
	//   18   53:bipush          34
	//   19   55:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//   20   58:pop             
				CharTypes.appendQuoted(stringbuilder, s);
	//   21   59:aload_1         
	//   22   60:aload_2         
	//   23   61:invokestatic    #59  <Method void CharTypes.appendQuoted(StringBuilder, String)>
				stringbuilder.append('"');
	//   24   64:aload_1         
	//   25   65:bipush          34
	//   26   67:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//   27   70:pop             
			} else
	//*  28   71:goto            117
	//*  29   74:aload_1         
	//*  30   75:bipush          91
	//*  31   77:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//*  32   80:pop             
	//*  33   81:aload_1         
	//*  34   82:aload_0         
	//*  35   83:invokevirtual   #61  <Method int getCurrentIndex()>
	//*  36   86:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
	//*  37   89:pop             
	//*  38   90:aload_1         
	//*  39   91:bipush          93
	//*  40   93:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//*  41   96:pop             
	//*  42   97:goto            124
	//*  43  100:aload_1         
	//*  44  101:ldc1            #66  <String "/">
	//*  45  103:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//*  46  106:pop             
	//*  47  107:goto            124
			{
				stringbuilder.append('?');
	//   48  110:aload_1         
	//   49  111:bipush          63
	//   50  113:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//   51  116:pop             
			}
			stringbuilder.append('}');
	//   52  117:aload_1         
	//   53  118:bipush          125
	//   54  120:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//   55  123:pop             
			break;

		case 1: // '\001'
			stringbuilder.append('[');
			stringbuilder.append(getCurrentIndex());
			stringbuilder.append(']');
			break;

		case 0: // '\0'
			stringbuilder.append("/");
			break;
		}
		return stringbuilder.toString();
	//   56  124:aload_1         
	//   57  125:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   58  128:areturn         
	}

	public String typeDesc()
	{
		switch(_type)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field int _type>
		{
	//*   2    4:tableswitch     0 2: default 32
	//	               0 41
	//	               1 38
	//	               2 35
		default:
			return "?";
	//    3   32:ldc1            #74  <String "?">
	//    4   34:areturn         

		case 2: // '\002'
			return "Object";
	//    5   35:ldc1            #76  <String "Object">
	//    6   37:areturn         

		case 1: // '\001'
			return "Array";
	//    7   38:ldc1            #78  <String "Array">
	//    8   40:areturn         

		case 0: // '\0'
			return "root";
	//    9   41:ldc1            #80  <String "root">
	//   10   43:areturn         
		}
	}

	protected int _index;
	protected int _type;
}
