// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			gg, dc, dk

public abstract class cu
	implements gg
{

	public cu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzbtk = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field int zzbtk>
	//    5    9:return          
	}

	void a(int i)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #23  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final dc d()
	{
		Object obj;
		try
		{
			obj = ((Object) (dc.c(h())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method int h()>
	//    2    4:invokestatic    #38  <Method dk dc.c(int)>
	//    3    7:astore_1        
			a(((dk) (obj)).b());
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #44  <Method dt dk.b()>
	//    7   13:invokevirtual   #47  <Method void a(dt)>
			obj = ((Object) (((dk) (obj)).a()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #49  <Method dc dk.a()>
	//   10   20:astore_1        
		}
	//*  11   21:aload_1         
	//*  12   22:areturn         
		catch(IOException ioexception)
	//*  13   23:astore_1        
		{
			String s = ((Object)this).getClass().getName();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #53  <Method Class Object.getClass()>
	//   16   28:invokevirtual   #59  <Method String Class.getName()>
	//   17   31:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 62 + String.valueOf("ByteString").length());
	//   18   32:new             #61  <Class StringBuilder>
	//   19   35:dup             
	//   20   36:aload_2         
	//   21   37:invokestatic    #67  <Method String String.valueOf(Object)>
	//   22   40:invokevirtual   #70  <Method int String.length()>
	//   23   43:bipush          62
	//   24   45:iadd            
	//   25   46:ldc1            #72  <String "ByteString">
	//   26   48:invokestatic    #67  <Method String String.valueOf(Object)>
	//   27   51:invokevirtual   #70  <Method int String.length()>
	//   28   54:iadd            
	//   29   55:invokespecial   #74  <Method void StringBuilder(int)>
	//   30   58:astore_3        
			stringbuilder.append("Serializing ");
	//   31   59:aload_3         
	//   32   60:ldc1            #76  <String "Serializing ">
	//   33   62:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   34   65:pop             
			stringbuilder.append(s);
	//   35   66:aload_3         
	//   36   67:aload_2         
	//   37   68:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   38   71:pop             
			stringbuilder.append(" to a ");
	//   39   72:aload_3         
	//   40   73:ldc1            #82  <String " to a ">
	//   41   75:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   42   78:pop             
			stringbuilder.append("ByteString");
	//   43   79:aload_3         
	//   44   80:ldc1            #72  <String "ByteString">
	//   45   82:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   46   85:pop             
			stringbuilder.append(" threw an IOException (should never happen).");
	//   47   86:aload_3         
	//   48   87:ldc1            #84  <String " threw an IOException (should never happen).">
	//   49   89:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   50   92:pop             
			throw new RuntimeException(stringbuilder.toString(), ((Throwable) (ioexception)));
	//   51   93:new             #86  <Class RuntimeException>
	//   52   96:dup             
	//   53   97:aload_3         
	//   54   98:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   55  101:aload_1         
	//   56  102:invokespecial   #92  <Method void RuntimeException(String, Throwable)>
	//   57  105:athrow          
		}
		return ((dc) (obj));
	}

	int e()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #23  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private static boolean zzbtl = false;
	protected int zzbtk;

	static 
	{
	//    0    0:return          
	}
}
