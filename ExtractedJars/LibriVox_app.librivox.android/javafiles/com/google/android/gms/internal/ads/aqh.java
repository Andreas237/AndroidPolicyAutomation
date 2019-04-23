// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			atv, aqq, aqy, arh

public abstract class aqh
	implements atv
{

	public aqh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzfkx = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field int zzfkx>
	//    5    9:return          
	}

	void a(int k)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #23  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final aqq h()
	{
		Object obj;
		try
		{
			obj = ((Object) (aqq.b(l())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method int l()>
	//    2    4:invokestatic    #38  <Method aqy aqq.b(int)>
	//    3    7:astore_1        
			a(((aqy) (obj)).b());
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #43  <Method arh aqy.b()>
	//    7   13:invokevirtual   #46  <Method void a(arh)>
			obj = ((Object) (((aqy) (obj)).a()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #48  <Method aqq aqy.a()>
	//   10   20:astore_1        
		}
	//*  11   21:aload_1         
	//*  12   22:areturn         
		catch(IOException ioexception)
	//*  13   23:astore_1        
		{
			String s = ((Object)this).getClass().getName();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #52  <Method Class Object.getClass()>
	//   16   28:invokevirtual   #58  <Method String Class.getName()>
	//   17   31:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 62 + String.valueOf("ByteString").length());
	//   18   32:new             #60  <Class StringBuilder>
	//   19   35:dup             
	//   20   36:aload_2         
	//   21   37:invokestatic    #66  <Method String String.valueOf(Object)>
	//   22   40:invokevirtual   #69  <Method int String.length()>
	//   23   43:bipush          62
	//   24   45:iadd            
	//   25   46:ldc1            #71  <String "ByteString">
	//   26   48:invokestatic    #66  <Method String String.valueOf(Object)>
	//   27   51:invokevirtual   #69  <Method int String.length()>
	//   28   54:iadd            
	//   29   55:invokespecial   #73  <Method void StringBuilder(int)>
	//   30   58:astore_3        
			stringbuilder.append("Serializing ");
	//   31   59:aload_3         
	//   32   60:ldc1            #75  <String "Serializing ">
	//   33   62:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   34   65:pop             
			stringbuilder.append(s);
	//   35   66:aload_3         
	//   36   67:aload_2         
	//   37   68:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   38   71:pop             
			stringbuilder.append(" to a ");
	//   39   72:aload_3         
	//   40   73:ldc1            #81  <String " to a ">
	//   41   75:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   42   78:pop             
			stringbuilder.append("ByteString");
	//   43   79:aload_3         
	//   44   80:ldc1            #71  <String "ByteString">
	//   45   82:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   46   85:pop             
			stringbuilder.append(" threw an IOException (should never happen).");
	//   47   86:aload_3         
	//   48   87:ldc1            #83  <String " threw an IOException (should never happen).">
	//   49   89:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   50   92:pop             
			throw new RuntimeException(stringbuilder.toString(), ((Throwable) (ioexception)));
	//   51   93:new             #85  <Class RuntimeException>
	//   52   96:dup             
	//   53   97:aload_3         
	//   54   98:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   55  101:aload_1         
	//   56  102:invokespecial   #91  <Method void RuntimeException(String, Throwable)>
	//   57  105:athrow          
		}
		return ((aqq) (obj));
	}

	public final byte[] i()
	{
		byte abyte0[];
		try
		{
			abyte0 = new byte[l()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method int l()>
	//    2    4:newarray        byte[]
	//    3    6:astore_1        
			arh arh1 = arh.a(abyte0);
	//    4    7:aload_1         
	//    5    8:invokestatic    #98  <Method arh arh.a(byte[])>
	//    6   11:astore_2        
			a(arh1);
	//    7   12:aload_0         
	//    8   13:aload_2         
	//    9   14:invokevirtual   #46  <Method void a(arh)>
			arh1.c();
	//   10   17:aload_2         
	//   11   18:invokevirtual   #101 <Method void arh.c()>
		}
	//*  12   21:aload_1         
	//*  13   22:areturn         
		catch(IOException ioexception)
	//*  14   23:astore_1        
		{
			String s = ((Object)this).getClass().getName();
	//   15   24:aload_0         
	//   16   25:invokevirtual   #52  <Method Class Object.getClass()>
	//   17   28:invokevirtual   #58  <Method String Class.getName()>
	//   18   31:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 62 + String.valueOf("byte array").length());
	//   19   32:new             #60  <Class StringBuilder>
	//   20   35:dup             
	//   21   36:aload_2         
	//   22   37:invokestatic    #66  <Method String String.valueOf(Object)>
	//   23   40:invokevirtual   #69  <Method int String.length()>
	//   24   43:bipush          62
	//   25   45:iadd            
	//   26   46:ldc1            #103 <String "byte array">
	//   27   48:invokestatic    #66  <Method String String.valueOf(Object)>
	//   28   51:invokevirtual   #69  <Method int String.length()>
	//   29   54:iadd            
	//   30   55:invokespecial   #73  <Method void StringBuilder(int)>
	//   31   58:astore_3        
			stringbuilder.append("Serializing ");
	//   32   59:aload_3         
	//   33   60:ldc1            #75  <String "Serializing ">
	//   34   62:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   35   65:pop             
			stringbuilder.append(s);
	//   36   66:aload_3         
	//   37   67:aload_2         
	//   38   68:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   39   71:pop             
			stringbuilder.append(" to a ");
	//   40   72:aload_3         
	//   41   73:ldc1            #81  <String " to a ">
	//   42   75:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
			stringbuilder.append("byte array");
	//   44   79:aload_3         
	//   45   80:ldc1            #103 <String "byte array">
	//   46   82:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   47   85:pop             
			stringbuilder.append(" threw an IOException (should never happen).");
	//   48   86:aload_3         
	//   49   87:ldc1            #83  <String " threw an IOException (should never happen).">
	//   50   89:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   51   92:pop             
			throw new RuntimeException(stringbuilder.toString(), ((Throwable) (ioexception)));
	//   52   93:new             #85  <Class RuntimeException>
	//   53   96:dup             
	//   54   97:aload_3         
	//   55   98:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   56  101:aload_1         
	//   57  102:invokespecial   #91  <Method void RuntimeException(String, Throwable)>
	//   58  105:athrow          
		}
		return abyte0;
	}

	int j()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #23  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private static boolean zzfky = false;
	protected int zzfkx;

	static 
	{
	//    0    0:return          
	}
}
