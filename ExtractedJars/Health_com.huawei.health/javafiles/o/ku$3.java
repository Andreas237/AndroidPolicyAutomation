// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			ku

static class ku$3
{

	static final int b[];

	static 
	{
		b = new int[android.widget.View.ScaleType.values().length];
	//    0    0:invokestatic    #18  <Method android.widget.ImageView$ScaleType[] android.widget.ImageView$ScaleType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] b>
		try
		{
			b[android.widget.View.ScaleType.MATRIX.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] b>
	//    5   12:getstatic       #24  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//    6   15:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
	//    9   20:return          
		}
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   21:astore_0        
	//*  11   22:return          
	}
}
