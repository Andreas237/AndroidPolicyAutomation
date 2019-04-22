// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeBindings

static final class TypeBindings$AsKey
{

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
		if(obj.getClass() != ((Object)this).getClass())
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #34  <Method Class Object.getClass()>
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #34  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((TypeBindings$AsKey)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class TypeBindings$AsKey>
	//   18   30:astore_1        
		if(_hash == ((TypeBindings$AsKey) (obj))._hash && _raw == ((TypeBindings$AsKey) (obj))._raw)
	//*  19   31:aload_0         
	//*  20   32:getfield        #25  <Field int _hash>
	//*  21   35:aload_1         
	//*  22   36:getfield        #25  <Field int _hash>
	//*  23   39:icmpne          103
	//*  24   42:aload_0         
	//*  25   43:getfield        #21  <Field Class _raw>
	//*  26   46:aload_1         
	//*  27   47:getfield        #21  <Field Class _raw>
	//*  28   50:if_acmpne       103
		{
			obj = ((Object) (((TypeBindings$AsKey) (obj))._params));
	//   29   53:aload_1         
	//   30   54:getfield        #23  <Field JavaType[] _params>
	//   31   57:astore_1        
			int j = _params.length;
	//   32   58:aload_0         
	//   33   59:getfield        #23  <Field JavaType[] _params>
	//   34   62:arraylength     
	//   35   63:istore_3        
			if(j == obj.length)
	//*  36   64:iload_3         
	//*  37   65:aload_1         
	//*  38   66:arraylength     
	//*  39   67:icmpne          103
			{
				for(int i = 0; i < j; i++)
	//*  40   70:iconst_0        
	//*  41   71:istore_2        
	//*  42   72:iload_2         
	//*  43   73:iload_3         
	//*  44   74:icmpge          101
					if(!_params[i].equals(((Object) (obj[i]))))
	//*  45   77:aload_0         
	//*  46   78:getfield        #23  <Field JavaType[] _params>
	//*  47   81:iload_2         
	//*  48   82:aaload          
	//*  49   83:aload_1         
	//*  50   84:iload_2         
	//*  51   85:aaload          
	//*  52   86:invokevirtual   #38  <Method boolean JavaType.equals(Object)>
	//*  53   89:ifne            94
						return false;
	//   54   92:iconst_0        
	//   55   93:ireturn         

	//   56   94:iload_2         
	//   57   95:iconst_1        
	//   58   96:iadd            
	//   59   97:istore_2        
	//*  60   98:goto            72
				return true;
	//   61  101:iconst_1        
	//   62  102:ireturn         
			}
		}
		return false;
	//   63  103:iconst_0        
	//   64  104:ireturn         
	}

	public int hashCode()
	{
		return _hash;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int _hash>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #44  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(_raw.getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field Class _raw>
	//    7   13:invokevirtual   #50  <Method String Class.getName()>
	//    8   16:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append("<>");
	//   10   20:aload_1         
	//   11   21:ldc1            #56  <String "<>">
	//   12   23:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		return stringbuilder.toString();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   16   31:areturn         
	}

	private final int _hash;
	private final JavaType _params[];
	private final Class _raw;

	public TypeBindings$AsKey(Class class1, JavaType ajavatype[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		_raw = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Class _raw>
		_params = ajavatype;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field JavaType[] _params>
		_hash = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field int _hash>
	//   11   19:return          
	}
}
