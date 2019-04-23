// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftARBoundingBox, CraftARItem, CraftARImage

public class CraftARResult
{

	CraftARResult(CraftARItem craftaritem, CraftARImage craftarimage, int i, CraftARBoundingBox craftarboundingbox)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		item = craftaritem;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field CraftARItem item>
		matchedImage = craftarimage;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field CraftARImage matchedImage>
		score = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field int score>
		bbox = craftarboundingbox;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #25  <Field CraftARBoundingBox bbox>
	//   14   25:return          
	}

	public CraftARBoundingBox getBoundingBox()
	{
		return bbox;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field CraftARBoundingBox bbox>
	//    2    4:areturn         
	}

	public CraftARItem getItem()
	{
		return item;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CraftARItem item>
	//    2    4:areturn         
	}

	public CraftARImage getMatchedImage()
	{
		return matchedImage;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field CraftARImage matchedImage>
	//    2    4:areturn         
	}

	public int getScore()
	{
		return score;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int score>
	//    2    4:ireturn         
	}

	private CraftARBoundingBox bbox;
	private CraftARItem item;
	private CraftARImage matchedImage;
	private int score;
}
