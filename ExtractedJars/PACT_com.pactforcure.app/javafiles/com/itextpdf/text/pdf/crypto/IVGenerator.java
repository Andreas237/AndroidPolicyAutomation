// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.crypto;


// Referenced classes of package com.itextpdf.text.pdf.crypto:
//			ARCFOUREncryption

public final class IVGenerator
{

	private IVGenerator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
	//    2    4:return          
	}

	public static byte[] getIV()
	{
		return getIV(16);
	//    0    0:bipush          16
	//    1    2:invokestatic    #62  <Method byte[] getIV(int)>
	//    2    5:areturn         
	}

	public static byte[] getIV(int i)
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_0         
	//    1    1:newarray        byte[]
	//    2    3:astore_2        
		synchronized(arcfour)
	//*   3    4:getstatic       #15  <Field ARCFOUREncryption arcfour>
	//*   4    7:astore_1        
	//*   5    8:aload_1         
	//*   6    9:monitorenter    
		{
			arcfour.encryptARCFOUR(abyte0);
	//    7   10:getstatic       #15  <Field ARCFOUREncryption arcfour>
	//    8   13:aload_2         
	//    9   14:invokevirtual   #65  <Method void ARCFOUREncryption.encryptARCFOUR(byte[])>
		}
	//   10   17:aload_1         
	//   11   18:monitorexit     
		return abyte0;
	//   12   19:aload_2         
	//   13   20:areturn         
		exception;
	//   14   21:astore_2        
		arcfourencryption;
	//   15   22:aload_1         
		JVM INSTR monitorexit ;
	//   16   23:monitorexit     
		throw exception;
	//   17   24:aload_2         
	//   18   25:athrow          
	}

	private static ARCFOUREncryption arcfour;

	static 
	{
		arcfour = new ARCFOUREncryption();
	//    0    0:new             #10  <Class ARCFOUREncryption>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void ARCFOUREncryption()>
	//    3    7:putstatic       #15  <Field ARCFOUREncryption arcfour>
		long l = System.currentTimeMillis();
	//    4   10:invokestatic    #21  <Method long System.currentTimeMillis()>
	//    5   13:lstore_0        
		long l1 = Runtime.getRuntime().freeMemory();
	//    6   14:invokestatic    #27  <Method Runtime Runtime.getRuntime()>
	//    7   17:invokevirtual   #30  <Method long Runtime.freeMemory()>
	//    8   20:lstore_2        
		String s = (new StringBuilder()).append(l).append("+").append(l1).toString();
	//    9   21:new             #32  <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #33  <Method void StringBuilder()>
	//   12   28:lload_0         
	//   13   29:invokevirtual   #37  <Method StringBuilder StringBuilder.append(long)>
	//   14   32:ldc1            #39  <String "+">
	//   15   34:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   16   37:lload_2         
	//   17   38:invokevirtual   #37  <Method StringBuilder StringBuilder.append(long)>
	//   18   41:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   19   44:astore          4
		arcfour.prepareARCFOURKey(s.getBytes());
	//   20   46:getstatic       #15  <Field ARCFOUREncryption arcfour>
	//   21   49:aload           4
	//   22   51:invokevirtual   #52  <Method byte[] String.getBytes()>
	//   23   54:invokevirtual   #56  <Method void ARCFOUREncryption.prepareARCFOURKey(byte[])>
	//*  24   57:return          
	}
}
