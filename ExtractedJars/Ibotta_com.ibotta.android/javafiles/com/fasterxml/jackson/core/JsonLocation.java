// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import java.io.Serializable;
import java.nio.charset.Charset;

public class JsonLocation
	implements Serializable
{

	public JsonLocation(Object obj, long l, int i, int j)
	{
		this(obj, -1L, l, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2w           #22  <Long -1L>
	//    3    5:lload_2         
	//    4    6:iload           4
	//    5    8:iload           5
	//    6   10:invokespecial   #27  <Method void JsonLocation(Object, long, long, int, int)>
	//    7   13:return          
	}

	public JsonLocation(Object obj, long l, long l1, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		_sourceRef = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field Object _sourceRef>
		_totalBytes = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #37  <Field long _totalBytes>
		_totalChars = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #39  <Field long _totalChars>
		_lineNr = i;
	//   11   20:aload_0         
	//   12   21:iload           6
	//   13   23:putfield        #41  <Field int _lineNr>
		_columnNr = j;
	//   14   26:aload_0         
	//   15   27:iload           7
	//   16   29:putfield        #43  <Field int _columnNr>
	//   17   32:return          
	}

	private int _append(StringBuilder stringbuilder, String s)
	{
		stringbuilder.append('"');
	//    0    0:aload_1         
	//    1    1:bipush          34
	//    2    3:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//    3    6:pop             
		stringbuilder.append(s);
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    7   12:pop             
		stringbuilder.append('"');
	//    8   13:aload_1         
	//    9   14:bipush          34
	//   10   16:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//   11   19:pop             
		return s.length();
	//   12   20:aload_2         
	//   13   21:invokevirtual   #60  <Method int String.length()>
	//   14   24:ireturn         
	}

	protected StringBuilder _appendSourceDesc(StringBuilder stringbuilder)
	{
		Object obj1 = _sourceRef;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object _sourceRef>
	//    2    4:astore          6
		if(obj1 == null)
	//*   3    6:aload           6
	//*   4    8:ifnonnull       20
		{
			stringbuilder.append("UNKNOWN");
	//    5   11:aload_1         
	//    6   12:ldc1            #64  <String "UNKNOWN">
	//    7   14:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
			return stringbuilder;
	//    9   18:aload_1         
	//   10   19:areturn         
		}
		Object obj;
		if(obj1 instanceof Class)
	//*  11   20:aload           6
	//*  12   22:instanceof      #66  <Class Class>
	//*  13   25:ifeq            38
			obj = ((Object) ((Class)obj1));
	//   14   28:aload           6
	//   15   30:checkcast       #66  <Class Class>
	//   16   33:astore          4
		else
	//*  17   35:goto            45
			obj = ((Object) (obj1.getClass()));
	//   18   38:aload           6
	//   19   40:invokevirtual   #70  <Method Class Object.getClass()>
	//   20   43:astore          4
		String s = ((Class) (obj)).getName();
	//   21   45:aload           4
	//   22   47:invokevirtual   #74  <Method String Class.getName()>
	//   23   50:astore          5
		if(s.startsWith("java."))
	//*  24   52:aload           5
	//*  25   54:ldc1            #76  <String "java.">
	//*  26   56:invokevirtual   #80  <Method boolean String.startsWith(String)>
	//*  27   59:ifeq            72
			obj = ((Object) (((Class) (obj)).getSimpleName()));
	//   28   62:aload           4
	//   29   64:invokevirtual   #83  <Method String Class.getSimpleName()>
	//   30   67:astore          4
		else
	//*  31   69:goto            103
		if(obj1 instanceof byte[])
	//*  32   72:aload           6
	//*  33   74:instanceof      #85  <Class byte[]>
	//*  34   77:ifeq            87
		{
			obj = "byte[]";
	//   35   80:ldc1            #87  <String "byte[]">
	//   36   82:astore          4
		} else
	//*  37   84:goto            103
		{
			obj = ((Object) (s));
	//   38   87:aload           5
	//   39   89:astore          4
			if(obj1 instanceof char[])
	//*  40   91:aload           6
	//*  41   93:instanceof      #89  <Class char[]>
	//*  42   96:ifeq            103
				obj = "char[]";
	//   43   99:ldc1            #91  <String "char[]">
	//   44  101:astore          4
		}
		stringbuilder.append('(');
	//   45  103:aload_1         
	//   46  104:bipush          40
	//   47  106:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//   48  109:pop             
		stringbuilder.append(((String) (obj)));
	//   49  110:aload_1         
	//   50  111:aload           4
	//   51  113:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   52  116:pop             
		stringbuilder.append(')');
	//   53  117:aload_1         
	//   54  118:bipush          41
	//   55  120:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//   56  123:pop             
		obj = " chars";
	//   57  124:ldc1            #93  <String " chars">
	//   58  126:astore          4
		boolean flag = obj1 instanceof CharSequence;
	//   59  128:aload           6
	//   60  130:instanceof      #95  <Class CharSequence>
	//   61  133:istore_3        
		int i = 0;
	//   62  134:iconst_0        
	//   63  135:istore_2        
		if(flag)
	//*  64  136:iload_3         
	//*  65  137:ifeq            186
		{
			CharSequence charsequence = (CharSequence)obj1;
	//   66  140:aload           6
	//   67  142:checkcast       #95  <Class CharSequence>
	//   68  145:astore          5
			i = charsequence.length();
	//   69  147:aload           5
	//   70  149:invokeinterface #96  <Method int CharSequence.length()>
	//   71  154:istore_2        
			i -= _append(stringbuilder, charsequence.subSequence(0, Math.min(i, 500)).toString());
	//   72  155:iload_2         
	//   73  156:aload_0         
	//   74  157:aload_1         
	//   75  158:aload           5
	//   76  160:iconst_0        
	//   77  161:iload_2         
	//   78  162:sipush          500
	//   79  165:invokestatic    #102 <Method int Math.min(int, int)>
	//   80  168:invokeinterface #106 <Method CharSequence CharSequence.subSequence(int, int)>
	//   81  173:invokeinterface #109 <Method String CharSequence.toString()>
	//   82  178:invokespecial   #111 <Method int _append(StringBuilder, String)>
	//   83  181:isub            
	//   84  182:istore_2        
		} else
	//*  85  183:goto            290
		if(obj1 instanceof char[])
	//*  86  186:aload           6
	//*  87  188:instanceof      #89  <Class char[]>
	//*  88  191:ifeq            233
		{
			char ac[] = (char[])obj1;
	//   89  194:aload           6
	//   90  196:checkcast       #89  <Class char[]>
	//   91  199:astore          5
			i = ac.length;
	//   92  201:aload           5
	//   93  203:arraylength     
	//   94  204:istore_2        
			i -= _append(stringbuilder, new String(ac, 0, Math.min(i, 500)));
	//   95  205:iload_2         
	//   96  206:aload_0         
	//   97  207:aload_1         
	//   98  208:new             #56  <Class String>
	//   99  211:dup             
	//  100  212:aload           5
	//  101  214:iconst_0        
	//  102  215:iload_2         
	//  103  216:sipush          500
	//  104  219:invokestatic    #102 <Method int Math.min(int, int)>
	//  105  222:invokespecial   #114 <Method void String(char[], int, int)>
	//  106  225:invokespecial   #111 <Method int _append(StringBuilder, String)>
	//  107  228:isub            
	//  108  229:istore_2        
		} else
	//* 109  230:goto            290
		if(obj1 instanceof byte[])
	//* 110  233:aload           6
	//* 111  235:instanceof      #85  <Class byte[]>
	//* 112  238:ifeq            290
		{
			obj = ((Object) ((byte[])obj1));
	//  113  241:aload           6
	//  114  243:checkcast       #85  <Class byte[]>
	//  115  246:astore          4
			i = Math.min(obj.length, 500);
	//  116  248:aload           4
	//  117  250:arraylength     
	//  118  251:sipush          500
	//  119  254:invokestatic    #102 <Method int Math.min(int, int)>
	//  120  257:istore_2        
			_append(stringbuilder, new String(((byte []) (obj)), 0, i, Charset.forName("UTF-8")));
	//  121  258:aload_0         
	//  122  259:aload_1         
	//  123  260:new             #56  <Class String>
	//  124  263:dup             
	//  125  264:aload           4
	//  126  266:iconst_0        
	//  127  267:iload_2         
	//  128  268:ldc1            #116 <String "UTF-8">
	//  129  270:invokestatic    #122 <Method Charset Charset.forName(String)>
	//  130  273:invokespecial   #125 <Method void String(byte[], int, int, Charset)>
	//  131  276:invokespecial   #111 <Method int _append(StringBuilder, String)>
	//  132  279:pop             
			i = obj.length - i;
	//  133  280:aload           4
	//  134  282:arraylength     
	//  135  283:iload_2         
	//  136  284:isub            
	//  137  285:istore_2        
			obj = " bytes";
	//  138  286:ldc1            #127 <String " bytes">
	//  139  288:astore          4
		}
		if(i > 0)
	//* 140  290:iload_2         
	//* 141  291:ifle            321
		{
			stringbuilder.append("[truncated ");
	//  142  294:aload_1         
	//  143  295:ldc1            #129 <String "[truncated ">
	//  144  297:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  145  300:pop             
			stringbuilder.append(i);
	//  146  301:aload_1         
	//  147  302:iload_2         
	//  148  303:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//  149  306:pop             
			stringbuilder.append(((String) (obj)));
	//  150  307:aload_1         
	//  151  308:aload           4
	//  152  310:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//  153  313:pop             
			stringbuilder.append(']');
	//  154  314:aload_1         
	//  155  315:bipush          93
	//  156  317:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//  157  320:pop             
		}
		return stringbuilder;
	//  158  321:aload_1         
	//  159  322:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(!(obj instanceof JsonLocation))
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class JsonLocation>
	//*  11   17:ifne            22
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		obj = ((Object) ((JsonLocation)obj));
	//   14   22:aload_1         
	//   15   23:checkcast       #2   <Class JsonLocation>
	//   16   26:astore_1        
		Object obj1 = _sourceRef;
	//   17   27:aload_0         
	//   18   28:getfield        #35  <Field Object _sourceRef>
	//   19   31:astore_2        
		if(obj1 == null)
	//*  20   32:aload_2         
	//*  21   33:ifnonnull       45
		{
			if(((JsonLocation) (obj))._sourceRef != null)
	//*  22   36:aload_1         
	//*  23   37:getfield        #35  <Field Object _sourceRef>
	//*  24   40:ifnull          58
				return false;
	//   25   43:iconst_0        
	//   26   44:ireturn         
		} else
		if(!obj1.equals(((JsonLocation) (obj))._sourceRef))
	//*  27   45:aload_2         
	//*  28   46:aload_1         
	//*  29   47:getfield        #35  <Field Object _sourceRef>
	//*  30   50:invokevirtual   #136 <Method boolean Object.equals(Object)>
	//*  31   53:ifne            58
			return false;
	//   32   56:iconst_0        
	//   33   57:ireturn         
		return _lineNr == ((JsonLocation) (obj))._lineNr && _columnNr == ((JsonLocation) (obj))._columnNr && _totalChars == ((JsonLocation) (obj))._totalChars && getByteOffset() == ((JsonLocation) (obj)).getByteOffset();
	//   34   58:aload_0         
	//   35   59:getfield        #41  <Field int _lineNr>
	//   36   62:aload_1         
	//   37   63:getfield        #41  <Field int _lineNr>
	//   38   66:icmpne          106
	//   39   69:aload_0         
	//   40   70:getfield        #43  <Field int _columnNr>
	//   41   73:aload_1         
	//   42   74:getfield        #43  <Field int _columnNr>
	//   43   77:icmpne          106
	//   44   80:aload_0         
	//   45   81:getfield        #39  <Field long _totalChars>
	//   46   84:aload_1         
	//   47   85:getfield        #39  <Field long _totalChars>
	//   48   88:lcmp            
	//   49   89:ifne            106
	//   50   92:aload_0         
	//   51   93:invokevirtual   #140 <Method long getByteOffset()>
	//   52   96:aload_1         
	//   53   97:invokevirtual   #140 <Method long getByteOffset()>
	//   54  100:lcmp            
	//   55  101:ifne            106
	//   56  104:iconst_1        
	//   57  105:ireturn         
	//   58  106:iconst_0        
	//   59  107:ireturn         
	}

	public long getByteOffset()
	{
		return _totalBytes;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long _totalBytes>
	//    2    4:lreturn         
	}

	public int hashCode()
	{
		Object obj = _sourceRef;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object _sourceRef>
	//    2    4:astore_2        
		int i;
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       14
			i = 1;
	//    5    9:iconst_1        
	//    6   10:istore_1        
		else
	//*   7   11:goto            19
			i = obj.hashCode();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #143 <Method int Object.hashCode()>
	//   10   18:istore_1        
		return ((i ^ _lineNr) + _columnNr ^ (int)_totalChars) + (int)_totalBytes;
	//   11   19:iload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #41  <Field int _lineNr>
	//   14   24:ixor            
	//   15   25:aload_0         
	//   16   26:getfield        #43  <Field int _columnNr>
	//   17   29:iadd            
	//   18   30:aload_0         
	//   19   31:getfield        #39  <Field long _totalChars>
	//   20   34:l2i             
	//   21   35:ixor            
	//   22   36:aload_0         
	//   23   37:getfield        #37  <Field long _totalBytes>
	//   24   40:l2i             
	//   25   41:iadd            
	//   26   42:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(80);
	//    0    0:new             #47  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          80
	//    3    6:invokespecial   #146 <Method void StringBuilder(int)>
	//    4    9:astore_1        
		stringbuilder.append("[Source: ");
	//    5   10:aload_1         
	//    6   11:ldc1            #148 <String "[Source: ">
	//    7   13:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		_appendSourceDesc(stringbuilder);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #150 <Method StringBuilder _appendSourceDesc(StringBuilder)>
	//   12   22:pop             
		stringbuilder.append("; line: ");
	//   13   23:aload_1         
	//   14   24:ldc1            #152 <String "; line: ">
	//   15   26:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
		stringbuilder.append(_lineNr);
	//   17   30:aload_1         
	//   18   31:aload_0         
	//   19   32:getfield        #41  <Field int _lineNr>
	//   20   35:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//   21   38:pop             
		stringbuilder.append(", column: ");
	//   22   39:aload_1         
	//   23   40:ldc1            #154 <String ", column: ">
	//   24   42:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   25   45:pop             
		stringbuilder.append(_columnNr);
	//   26   46:aload_1         
	//   27   47:aload_0         
	//   28   48:getfield        #43  <Field int _columnNr>
	//   29   51:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//   30   54:pop             
		stringbuilder.append(']');
	//   31   55:aload_1         
	//   32   56:bipush          93
	//   33   58:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
	//   34   61:pop             
		return stringbuilder.toString();
	//   35   62:aload_1         
	//   36   63:invokevirtual   #155 <Method String StringBuilder.toString()>
	//   37   66:areturn         
	}

	public static final JsonLocation NA = new JsonLocation(((Object) (null)), -1L, -1L, -1, -1);
	private static final long serialVersionUID = 1L;
	protected final int _columnNr;
	protected final int _lineNr;
	final transient Object _sourceRef;
	protected final long _totalBytes;
	protected final long _totalChars;

	static 
	{
	//    0    0:new             #2   <Class JsonLocation>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:ldc2w           #22  <Long -1L>
	//    4    8:ldc2w           #22  <Long -1L>
	//    5   11:iconst_m1       
	//    6   12:iconst_m1       
	//    7   13:invokespecial   #27  <Method void JsonLocation(Object, long, long, int, int)>
	//    8   16:putstatic       #29  <Field JsonLocation NA>
	//*   9   19:return          
	}
}
