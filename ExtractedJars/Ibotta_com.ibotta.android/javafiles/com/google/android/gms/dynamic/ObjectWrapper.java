// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import java.lang.reflect.Field;

// Referenced classes of package com.google.android.gms.dynamic:
//			IObjectWrapper

public final class ObjectWrapper extends IObjectWrapper.Stub
{

	private ObjectWrapper(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void IObjectWrapper$Stub()>
		zzabn = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Object zzabn>
	//    5    9:return          
	}

	public static Object unwrap(IObjectWrapper iobjectwrapper)
	{
		if(iobjectwrapper instanceof ObjectWrapper)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #2   <Class ObjectWrapper>
	//*   2    4:ifeq            15
			return ((ObjectWrapper)iobjectwrapper).zzabn;
	//    3    7:aload_0         
	//    4    8:checkcast       #2   <Class ObjectWrapper>
	//    5   11:getfield        #15  <Field Object zzabn>
	//    6   14:areturn         
		android.os.IBinder ibinder = iobjectwrapper.asBinder();
	//    7   15:aload_0         
	//    8   16:invokeinterface #30  <Method android.os.IBinder IObjectWrapper.asBinder()>
	//    9   21:astore          6
		Field afield[] = ((Object) (ibinder)).getClass().getDeclaredFields();
	//   10   23:aload           6
	//   11   25:invokevirtual   #36  <Method Class Object.getClass()>
	//   12   28:invokevirtual   #42  <Method Field[] Class.getDeclaredFields()>
	//   13   31:astore          7
		int i1 = afield.length;
	//   14   33:aload           7
	//   15   35:arraylength     
	//   16   36:istore          4
		int i = 0;
	//   17   38:iconst_0        
	//   18   39:istore_1        
		iobjectwrapper = null;
	//   19   40:aconst_null     
	//   20   41:astore_0        
		int k;
		int l;
		for(k = 0; i < i1; k = l)
	//*  21   42:iconst_0        
	//*  22   43:istore_2        
	//*  23   44:iload_1         
	//*  24   45:iload           4
	//*  25   47:icmpge          82
		{
			Field field = afield[i];
	//   26   50:aload           7
	//   27   52:iload_1         
	//   28   53:aaload          
	//   29   54:astore          5
			l = k;
	//   30   56:iload_2         
	//   31   57:istore_3        
			if(!field.isSynthetic())
	//*  32   58:aload           5
	//*  33   60:invokevirtual   #48  <Method boolean Field.isSynthetic()>
	//*  34   63:ifne            73
			{
				l = k + 1;
	//   35   66:iload_2         
	//   36   67:iconst_1        
	//   37   68:iadd            
	//   38   69:istore_3        
				iobjectwrapper = ((IObjectWrapper) (field));
	//   39   70:aload           5
	//   40   72:astore_0        
			}
			i++;
	//   41   73:iload_1         
	//   42   74:iconst_1        
	//   43   75:iadd            
	//   44   76:istore_1        
		}

	//   45   77:iload_3         
	//   46   78:istore_2        
	//*  47   79:goto            44
		if(k == 1)
	//*  48   82:iload_2         
	//*  49   83:iconst_1        
	//*  50   84:icmpne          142
		{
			if(!((Field) (iobjectwrapper)).isAccessible())
	//*  51   87:aload_0         
	//*  52   88:invokevirtual   #51  <Method boolean Field.isAccessible()>
	//*  53   91:ifne            132
			{
				((Field) (iobjectwrapper)).setAccessible(true);
	//   54   94:aload_0         
	//   55   95:iconst_1        
	//   56   96:invokevirtual   #55  <Method void Field.setAccessible(boolean)>
				try
				{
					iobjectwrapper = ((IObjectWrapper) (((Field) (iobjectwrapper)).get(((Object) (ibinder)))));
	//   57   99:aload_0         
	//   58  100:aload           6
	//   59  102:invokevirtual   #59  <Method Object Field.get(Object)>
	//   60  105:astore_0        
				}
	//*  61  106:aload_0         
	//*  62  107:areturn         
	//*  63  108:astore_0        
	//*  64  109:new             #61  <Class IllegalArgumentException>
	//*  65  112:dup             
	//*  66  113:ldc1            #63  <String "Could not access the field in remoteBinder.">
	//*  67  115:aload_0         
	//*  68  116:invokespecial   #66  <Method void IllegalArgumentException(String, Throwable)>
	//*  69  119:athrow          
				// Misplaced declaration of an exception variable
				catch(IObjectWrapper iobjectwrapper)
	//*  70  120:astore_0        
				{
					throw new IllegalArgumentException("Binder object is null.", ((Throwable) (iobjectwrapper)));
	//   71  121:new             #61  <Class IllegalArgumentException>
	//   72  124:dup             
	//   73  125:ldc1            #68  <String "Binder object is null.">
	//   74  127:aload_0         
	//   75  128:invokespecial   #66  <Method void IllegalArgumentException(String, Throwable)>
	//   76  131:athrow          
				}
				// Misplaced declaration of an exception variable
				catch(IObjectWrapper iobjectwrapper)
				{
					throw new IllegalArgumentException("Could not access the field in remoteBinder.", ((Throwable) (iobjectwrapper)));
				}
				return ((Object) (iobjectwrapper));
			} else
			{
				throw new IllegalArgumentException("IObjectWrapper declared field not private!");
	//   77  132:new             #61  <Class IllegalArgumentException>
	//   78  135:dup             
	//   79  136:ldc1            #70  <String "IObjectWrapper declared field not private!">
	//   80  138:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//   81  141:athrow          
			}
		} else
		{
			int j = afield.length;
	//   82  142:aload           7
	//   83  144:arraylength     
	//   84  145:istore_1        
			iobjectwrapper = ((IObjectWrapper) (new StringBuilder(64)));
	//   85  146:new             #75  <Class StringBuilder>
	//   86  149:dup             
	//   87  150:bipush          64
	//   88  152:invokespecial   #78  <Method void StringBuilder(int)>
	//   89  155:astore_0        
			((StringBuilder) (iobjectwrapper)).append("Unexpected number of IObjectWrapper declared fields: ");
	//   90  156:aload_0         
	//   91  157:ldc1            #80  <String "Unexpected number of IObjectWrapper declared fields: ">
	//   92  159:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   93  162:pop             
			((StringBuilder) (iobjectwrapper)).append(j);
	//   94  163:aload_0         
	//   95  164:iload_1         
	//   96  165:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   97  168:pop             
			throw new IllegalArgumentException(((StringBuilder) (iobjectwrapper)).toString());
	//   98  169:new             #61  <Class IllegalArgumentException>
	//   99  172:dup             
	//  100  173:aload_0         
	//  101  174:invokevirtual   #91  <Method String StringBuilder.toString()>
	//  102  177:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//  103  180:athrow          
		}
	}

	public static IObjectWrapper wrap(Object obj)
	{
		return ((IObjectWrapper) (new ObjectWrapper(obj)));
	//    0    0:new             #2   <Class ObjectWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #96  <Method void ObjectWrapper(Object)>
	//    4    8:areturn         
	}

	private final Object zzabn;
}
