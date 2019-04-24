// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.style;


public class StyleElement
{

	public StyleElement()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		value = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #16  <Field int value>
		textureId = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #18  <Field int textureId>
		opacity = 1.0F;
	//    8   14:aload_0         
	//    9   15:fconst_1        
	//   10   16:putfield        #20  <Field float opacity>
	//   11   19:return          
	}

	public float opacity;
	public int styleElementType;
	public int textureId;
	public int value;
}
