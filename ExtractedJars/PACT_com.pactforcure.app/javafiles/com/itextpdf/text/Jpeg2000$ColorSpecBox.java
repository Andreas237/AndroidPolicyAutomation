// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text:
//			Jpeg2000

public static class Jpeg2000$ColorSpecBox extends ArrayList
{

	public int getApprox()
	{
		return ((Integer)get(2)).intValue();
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #21  <Method Object get(int)>
	//    3    5:checkcast       #23  <Class Integer>
	//    4    8:invokevirtual   #26  <Method int Integer.intValue()>
	//    5   11:ireturn         
	}

	public byte[] getColorProfile()
	{
		return colorProfile;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field byte[] colorProfile>
	//    2    4:areturn         
	}

	public int getEnumCs()
	{
		return ((Integer)get(3)).intValue();
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokevirtual   #21  <Method Object get(int)>
	//    3    5:checkcast       #23  <Class Integer>
	//    4    8:invokevirtual   #26  <Method int Integer.intValue()>
	//    5   11:ireturn         
	}

	public int getMeth()
	{
		return ((Integer)get(0)).intValue();
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #21  <Method Object get(int)>
	//    3    5:checkcast       #23  <Class Integer>
	//    4    8:invokevirtual   #26  <Method int Integer.intValue()>
	//    5   11:ireturn         
	}

	public int getPrec()
	{
		return ((Integer)get(1)).intValue();
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #21  <Method Object get(int)>
	//    3    5:checkcast       #23  <Class Integer>
	//    4    8:invokevirtual   #26  <Method int Integer.intValue()>
	//    5   11:ireturn         
	}

	void setColorProfile(byte abyte0[])
	{
		colorProfile = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field byte[] colorProfile>
	//    3    5:return          
	}

	private byte colorProfile[];

	public Jpeg2000$ColorSpecBox()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ArrayList()>
	//    2    4:return          
	}
}
