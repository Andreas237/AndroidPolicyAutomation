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
		if(_sourceRef == null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #37  <Field Object _sourceRef>
	//*  19   31:ifnonnull       43
		{
			if(((JsonLocation) (obj))._sourceRef != null)
	//*  20   34:aload_1         
	//*  21   35:getfield        #37  <Field Object _sourceRef>
	//*  22   38:ifnull          59
				return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
		} else
		if(!_sourceRef.equals(((JsonLocation) (obj))._sourceRef))
	//*  25   43:aload_0         
	//*  26   44:getfield        #37  <Field Object _sourceRef>
	//*  27   47:aload_1         
	//*  28   48:getfield        #37  <Field Object _sourceRef>
	//*  29   51:invokevirtual   #49  <Method boolean Object.equals(Object)>
	//*  30   54:ifne            59
			return false;
	//   31   57:iconst_0        
	//   32   58:ireturn         
		return _lineNr == ((JsonLocation) (obj))._lineNr && _columnNr == ((JsonLocation) (obj))._columnNr && _totalChars == ((JsonLocation) (obj))._totalChars && getByteOffset() == ((JsonLocation) (obj)).getByteOffset();
	//   33   59:aload_0         
	//   34   60:getfield        #43  <Field int _lineNr>
	//   35   63:aload_1         
	//   36   64:getfield        #43  <Field int _lineNr>
	//   37   67:icmpne          107
	//   38   70:aload_0         
	//   39   71:getfield        #45  <Field int _columnNr>
	//   40   74:aload_1         
	//   41   75:getfield        #45  <Field int _columnNr>
	//   42   78:icmpne          107
	//   43   81:aload_0         
	//   44   82:getfield        #41  <Field long _totalChars>
	//   45   85:aload_1         
	//   46   86:getfield        #41  <Field long _totalChars>
	//   47   89:lcmp            
	//   48   90:ifne            107
	//   49   93:aload_0         
	//   50   94:invokevirtual   #53  <Method long getByteOffset()>
	//   51   97:aload_1         
	//   52   98:invokevirtual   #53  <Method long getByteOffset()>
	//   53  101:lcmp            
	//   54  102:ifne            107
	//   55  105:iconst_1        
	//   56  106:ireturn         
	//   57  107:iconst_0        
	//   58  108:ireturn         
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
	//*   2    4:ifnonnull       12
			i = 1;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            20
			i = _sourceRef.hashCode();
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field Object _sourceRef>
	//    8   16:invokevirtual   #62  <Method int Object.hashCode()>
	//    9   19:istore_1        
		return ((i ^ _lineNr) + _columnNr ^ (int)_totalChars) + (int)_totalBytes;
	//   10   20:iload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #43  <Field int _lineNr>
	//   13   25:ixor            
	//   14   26:aload_0         
	//   15   27:getfield        #45  <Field int _columnNr>
	//   16   30:iadd            
	//   17   31:aload_0         
	//   18   32:getfield        #41  <Field long _totalChars>
	//   19   35:l2i             
	//   20   36:ixor            
	//   21   37:aload_0         
	//   22   38:getfield        #39  <Field long _totalBytes>
	//   23   41:l2i             
	//   24   42:iadd            
	//   25   43:ireturn         
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
	//*  11   21:ifnonnull       34
			stringbuilder.append("UNKNOWN");
	//   12   24:aload_1         
	//   13   25:ldc1            #77  <String "UNKNOWN">
	//   14   27:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
		else
	//*  16   31:goto            46
			stringbuilder.append(_sourceRef.toString());
	//   17   34:aload_1         
	//   18   35:aload_0         
	//   19   36:getfield        #37  <Field Object _sourceRef>
	//   20   39:invokevirtual   #79  <Method String Object.toString()>
	//   21   42:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   22   45:pop             
		stringbuilder.append("; line: ");
	//   23   46:aload_1         
	//   24   47:ldc1            #81  <String "; line: ">
	//   25   49:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
		stringbuilder.append(_lineNr);
	//   27   53:aload_1         
	//   28   54:aload_0         
	//   29   55:getfield        #43  <Field int _lineNr>
	//   30   58:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//   31   61:pop             
		stringbuilder.append(", column: ");
	//   32   62:aload_1         
	//   33   63:ldc1            #86  <String ", column: ">
	//   34   65:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
		stringbuilder.append(_columnNr);
	//   36   69:aload_1         
	//   37   70:aload_0         
	//   38   71:getfield        #45  <Field int _columnNr>
	//   39   74:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//   40   77:pop             
		stringbuilder.append(']');
	//   41   78:aload_1         
	//   42   79:bipush          93
	//   43   81:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//   44   84:pop             
		return stringbuilder.toString();
	//   45   85:aload_1         
	//   46   86:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   47   89:areturn         
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
