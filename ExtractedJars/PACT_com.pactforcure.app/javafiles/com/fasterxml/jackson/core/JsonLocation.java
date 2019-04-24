// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import java.io.Serializable;

public class JsonLocation
	implements Serializable
{

	public JsonLocation(Object obj, long l, int i, int j)
	{
		this(obj, -1L, l, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2w           #24  <Long -1L>
	//    3    5:lload_2         
	//    4    6:iload           4
	//    5    8:iload           5
	//    6   10:invokespecial   #29  <Method void JsonLocation(Object, long, long, int, int)>
	//    7   13:return          
	}

	public JsonLocation(Object obj, long l, long l1, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		_sourceRef = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field Object _sourceRef>
		_totalBytes = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #39  <Field long _totalBytes>
		_totalChars = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #41  <Field long _totalChars>
		_lineNr = i;
	//   11   20:aload_0         
	//   12   21:iload           6
	//   13   23:putfield        #43  <Field int _lineNr>
		_columnNr = j;
	//   14   26:aload_0         
	//   15   27:iload           7
	//   16   29:putfield        #45  <Field int _columnNr>
	//   17   32:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag2;
		boolean flag3;
		flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		flag3 = false;
	//    2    2:iconst_0        
	//    3    3:istore          4
		if(obj != this) goto _L2; else goto _L1
	//    4    5:aload_1         
	//    5    6:aload_0         
	//    6    7:if_acmpne       14
_L1:
		boolean flag = true;
	//    7   10:iconst_1        
	//    8   11:istore_2        
_L4:
		return flag;
	//    9   12:iload_2         
	//   10   13:ireturn         
_L2:
		flag = flag3;
	//   11   14:iload           4
	//   12   16:istore_2        
		if(obj == null) goto _L4; else goto _L3
	//   13   17:aload_1         
	//   14   18:ifnull          12
_L3:
		flag = flag3;
	//   15   21:iload           4
	//   16   23:istore_2        
		if(!(obj instanceof JsonLocation)) goto _L4; else goto _L5
	//   17   24:aload_1         
	//   18   25:instanceof      #2   <Class JsonLocation>
	//   19   28:ifeq            12
_L5:
		obj = ((Object) ((JsonLocation)obj));
	//   20   31:aload_1         
	//   21   32:checkcast       #2   <Class JsonLocation>
	//   22   35:astore_1        
		if(_sourceRef != null)
			break MISSING_BLOCK_LABEL_103;
	//   23   36:aload_0         
	//   24   37:getfield        #37  <Field Object _sourceRef>
	//   25   40:ifnonnull       103
		flag = flag3;
	//   26   43:iload           4
	//   27   45:istore_2        
		if(((JsonLocation) (obj))._sourceRef != null) goto _L4; else goto _L6
	//   28   46:aload_1         
	//   29   47:getfield        #37  <Field Object _sourceRef>
	//   30   50:ifnonnull       12
_L6:
		boolean flag1;
		if(_lineNr == ((JsonLocation) (obj))._lineNr && _columnNr == ((JsonLocation) (obj))._columnNr && _totalChars == ((JsonLocation) (obj))._totalChars && getByteOffset() == ((JsonLocation) (obj)).getByteOffset())
	//*  31   53:aload_0         
	//*  32   54:getfield        #43  <Field int _lineNr>
	//*  33   57:aload_1         
	//*  34   58:getfield        #43  <Field int _lineNr>
	//*  35   61:icmpne          119
	//*  36   64:aload_0         
	//*  37   65:getfield        #45  <Field int _columnNr>
	//*  38   68:aload_1         
	//*  39   69:getfield        #45  <Field int _columnNr>
	//*  40   72:icmpne          119
	//*  41   75:aload_0         
	//*  42   76:getfield        #41  <Field long _totalChars>
	//*  43   79:aload_1         
	//*  44   80:getfield        #41  <Field long _totalChars>
	//*  45   83:lcmp            
	//*  46   84:ifne            119
	//*  47   87:aload_0         
	//*  48   88:invokevirtual   #51  <Method long getByteOffset()>
	//*  49   91:aload_1         
	//*  50   92:invokevirtual   #51  <Method long getByteOffset()>
	//*  51   95:lcmp            
	//*  52   96:ifne            119
			flag1 = flag2;
	//   53   99:iload_3         
	//   54  100:istore_2        
		else
	//*  55  101:iload_2         
	//*  56  102:ireturn         
	//*  57  103:aload_0         
	//*  58  104:getfield        #37  <Field Object _sourceRef>
	//*  59  107:aload_1         
	//*  60  108:getfield        #37  <Field Object _sourceRef>
	//*  61  111:invokevirtual   #53  <Method boolean Object.equals(Object)>
	//*  62  114:ifne            53
	//*  63  117:iconst_0        
	//*  64  118:ireturn         
			flag1 = false;
	//   65  119:iconst_0        
	//   66  120:istore_2        
		return flag1;
		if(!_sourceRef.equals(((JsonLocation) (obj))._sourceRef))
			return false;
		  goto _L6
	//*  67  121:goto            101
	}

	public long getByteOffset()
	{
		return _totalBytes;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field long _totalBytes>
	//    2    4:lreturn         
	}

	public long getCharOffset()
	{
		return _totalChars;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field long _totalChars>
	//    2    4:lreturn         
	}

	public int getColumnNr()
	{
		return _columnNr;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int _columnNr>
	//    2    4:ireturn         
	}

	public int getLineNr()
	{
		return _lineNr;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int _lineNr>
	//    2    4:ireturn         
	}

	public Object getSourceRef()
	{
		return _sourceRef;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Object _sourceRef>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		int i;
		if(_sourceRef == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object _sourceRef>
	//*   2    4:ifnonnull       33
			i = 1;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #43  <Field int _lineNr>
	//*   8   14:ixor            
	//*   9   15:aload_0         
	//*  10   16:getfield        #45  <Field int _columnNr>
	//*  11   19:iadd            
	//*  12   20:aload_0         
	//*  13   21:getfield        #41  <Field long _totalChars>
	//*  14   24:l2i             
	//*  15   25:ixor            
	//*  16   26:aload_0         
	//*  17   27:getfield        #39  <Field long _totalBytes>
	//*  18   30:l2i             
	//*  19   31:iadd            
	//*  20   32:ireturn         
			i = _sourceRef.hashCode();
	//   21   33:aload_0         
	//   22   34:getfield        #37  <Field Object _sourceRef>
	//   23   37:invokevirtual   #62  <Method int Object.hashCode()>
	//   24   40:istore_1        
		return ((i ^ _lineNr) + _columnNr ^ (int)_totalChars) + (int)_totalBytes;
	//*  25   41:goto            9
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(80);
	//    0    0:new             #66  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          80
	//    3    6:invokespecial   #69  <Method void StringBuilder(int)>
	//    4    9:astore_1        
		stringbuilder.append("[Source: ");
	//    5   10:aload_1         
	//    6   11:ldc1            #71  <String "[Source: ">
	//    7   13:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		if(_sourceRef == null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #37  <Field Object _sourceRef>
	//*  11   21:ifnonnull       75
			stringbuilder.append("UNKNOWN");
	//   12   24:aload_1         
	//   13   25:ldc1            #77  <String "UNKNOWN">
	//   14   27:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
		else
	//*  16   31:aload_1         
	//*  17   32:ldc1            #79  <String "; line: ">
	//*  18   34:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  19   37:pop             
	//*  20   38:aload_1         
	//*  21   39:aload_0         
	//*  22   40:getfield        #43  <Field int _lineNr>
	//*  23   43:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//*  24   46:pop             
	//*  25   47:aload_1         
	//*  26   48:ldc1            #84  <String ", column: ">
	//*  27   50:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  28   53:pop             
	//*  29   54:aload_1         
	//*  30   55:aload_0         
	//*  31   56:getfield        #45  <Field int _columnNr>
	//*  32   59:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//*  33   62:pop             
	//*  34   63:aload_1         
	//*  35   64:bipush          93
	//*  36   66:invokevirtual   #87  <Method StringBuilder StringBuilder.append(char)>
	//*  37   69:pop             
	//*  38   70:aload_1         
	//*  39   71:invokevirtual   #89  <Method String StringBuilder.toString()>
	//*  40   74:areturn         
			stringbuilder.append(_sourceRef.toString());
	//   41   75:aload_1         
	//   42   76:aload_0         
	//   43   77:getfield        #37  <Field Object _sourceRef>
	//   44   80:invokevirtual   #90  <Method String Object.toString()>
	//   45   83:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   46   86:pop             
		stringbuilder.append("; line: ");
		stringbuilder.append(_lineNr);
		stringbuilder.append(", column: ");
		stringbuilder.append(_columnNr);
		stringbuilder.append(']');
		return stringbuilder.toString();
	//*  47   87:goto            31
	}

	public static final JsonLocation NA = new JsonLocation("N/A", -1L, -1L, -1, -1);
	private static final long serialVersionUID = 1L;
	final int _columnNr;
	final int _lineNr;
	final transient Object _sourceRef;
	final long _totalBytes;
	final long _totalChars;

	static 
	{
	//    0    0:new             #2   <Class JsonLocation>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "N/A">
	//    3    6:ldc2w           #24  <Long -1L>
	//    4    9:ldc2w           #24  <Long -1L>
	//    5   12:iconst_m1       
	//    6   13:iconst_m1       
	//    7   14:invokespecial   #29  <Method void JsonLocation(Object, long, long, int, int)>
	//    8   17:putstatic       #31  <Field JsonLocation NA>
	//*   9   20:return          
	}
}
