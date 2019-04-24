// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;

import java.util.Arrays;

public class FixedPreloadSizeProvider
	implements com.bumptech.glide.ListPreloader.PreloadSizeProvider
{

	public FixedPreloadSizeProvider(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		size = (new int[] {
			i, j
		});
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:iload_1         
	//    8   11:iastore         
	//    9   12:dup             
	//   10   13:iconst_1        
	//   11   14:iload_2         
	//   12   15:iastore         
	//   13   16:putfield        #16  <Field int[] size>
	//   14   19:return          
	}

	public int[] getPreloadSize(Object obj, int i, int j)
	{
		return Arrays.copyOf(size, size.length);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int[] size>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field int[] size>
	//    4    8:arraylength     
	//    5    9:invokestatic    #25  <Method int[] Arrays.copyOf(int[], int)>
	//    6   12:areturn         
	}

	private final int size[];
}
