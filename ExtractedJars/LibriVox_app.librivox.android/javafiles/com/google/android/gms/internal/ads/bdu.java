// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bdu
{

	private bdu(int ai[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		b = Arrays.copyOf(ai, ai.length);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:invokestatic    #30  <Method int[] Arrays.copyOf(int[], int)>
	//    7   11:putfield        #32  <Field int[] b>
		Arrays.sort(b);
	//    8   14:aload_0         
	//    9   15:getfield        #32  <Field int[] b>
	//   10   18:invokestatic    #36  <Method void Arrays.sort(int[])>
	//   11   21:aload_0         
	//   12   22:iconst_2        
	//   13   23:putfield        #38  <Field int c>
	//   14   26:return          
	}

	public final boolean a(int i)
	{
		return Arrays.binarySearch(b, i) >= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int[] b>
	//    2    4:iload_1         
	//    3    5:invokestatic    #43  <Method int Arrays.binarySearch(int[], int)>
	//    4    8:iflt            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof bdu))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class bdu>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((bdu)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class bdu>
	//   12   20:astore_1        
		return Arrays.equals(b, ((bdu) (obj)).b) && c == ((bdu) (obj)).c;
	//   13   21:aload_0         
	//   14   22:getfield        #32  <Field int[] b>
	//   15   25:aload_1         
	//   16   26:getfield        #32  <Field int[] b>
	//   17   29:invokestatic    #48  <Method boolean Arrays.equals(int[], int[])>
	//   18   32:ifeq            48
	//   19   35:aload_0         
	//   20   36:getfield        #38  <Field int c>
	//   21   39:aload_1         
	//   22   40:getfield        #38  <Field int c>
	//   23   43:icmpne          48
	//   24   46:iconst_1        
	//   25   47:ireturn         
	//   26   48:iconst_0        
	//   27   49:ireturn         
	}

	public final int hashCode()
	{
		return c + Arrays.hashCode(b) * 31;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int c>
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field int[] b>
	//    4    8:invokestatic    #53  <Method int Arrays.hashCode(int[])>
	//    5   11:bipush          31
	//    6   13:imul            
	//    7   14:iadd            
	//    8   15:ireturn         
	}

	public final String toString()
	{
		int i = c;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int c>
	//    2    4:istore_1        
		String s = Arrays.toString(b);
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field int[] b>
	//    5    9:invokestatic    #58  <Method String Arrays.toString(int[])>
	//    6   12:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 67);
	//    7   13:new             #60  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokestatic    #66  <Method String String.valueOf(Object)>
	//   11   21:invokevirtual   #69  <Method int String.length()>
	//   12   24:bipush          67
	//   13   26:iadd            
	//   14   27:invokespecial   #72  <Method void StringBuilder(int)>
	//   15   30:astore_3        
		stringbuilder.append("AudioCapabilities[maxChannelCount=");
	//   16   31:aload_3         
	//   17   32:ldc1            #74  <String "AudioCapabilities[maxChannelCount=">
	//   18   34:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
		stringbuilder.append(i);
	//   20   38:aload_3         
	//   21   39:iload_1         
	//   22   40:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   23   43:pop             
		stringbuilder.append(", supportedEncodings=");
	//   24   44:aload_3         
	//   25   45:ldc1            #83  <String ", supportedEncodings=">
	//   26   47:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
		stringbuilder.append(s);
	//   28   51:aload_3         
	//   29   52:aload_2         
	//   30   53:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   31   56:pop             
		stringbuilder.append("]");
	//   32   57:aload_3         
	//   33   58:ldc1            #85  <String "]">
	//   34   60:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   35   63:pop             
		return stringbuilder.toString();
	//   36   64:aload_3         
	//   37   65:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   38   68:areturn         
	}

	private static final bdu a = new bdu(new int[] {
		2
	}, 2);
	private final int b[];
	private final int c = 2;

	static 
	{
	//    0    0:new             #2   <Class bdu>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:newarray        int[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:iconst_2        
	//    7   10:iastore         
	//    8   11:iconst_2        
	//    9   12:invokespecial   #19  <Method void bdu(int[], int)>
	//   10   15:putstatic       #21  <Field bdu a>
	//*  11   18:return          
	}
}
