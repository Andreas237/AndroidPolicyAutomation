// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity_

class MapCustomizationActivity_$4
	implements Runnable
{

	public void run()
	{
		MapCustomizationActivity_.a(c, a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field MapCustomizationActivity_ c>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field CharSequence a>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field int b>
	//    6   12:invokestatic    #31  <Method void MapCustomizationActivity_.a(MapCustomizationActivity_, CharSequence, int)>
	//    7   15:return          
	}

	final CharSequence a;
	final int b;
	final MapCustomizationActivity_ c;

	MapCustomizationActivity_$4(MapCustomizationActivity_ mapcustomizationactivity_, CharSequence charsequence, int i)
	{
		c = mapcustomizationactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field MapCustomizationActivity_ c>
		a = charsequence;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field CharSequence a>
		b = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #24  <Field int b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
