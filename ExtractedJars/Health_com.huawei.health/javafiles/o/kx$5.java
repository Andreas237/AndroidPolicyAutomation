// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			kx

static class kx$5
{

	static final int d[];

	static 
	{
		d = new int[android.widget.View.ScaleType.values().length];
	//    0    0:invokestatic    #18  <Method android.widget.ImageView$ScaleType[] android.widget.ImageView$ScaleType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] d>
		try
		{
			d[android.widget.View.ScaleType.FIT_CENTER.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] d>
	//    5   12:getstatic       #24  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
	//    6   15:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:goto            24
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   23:astore_0        
		try
		{
			d[android.widget.View.ScaleType.FIT_START.ordinal()] = 2;
	//   11   24:getstatic       #20  <Field int[] d>
	//   12   27:getstatic       #31  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_START>
	//   13   30:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//   14   33:iconst_2        
	//   15   34:iastore         
		}
	//*  16   35:goto            39
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   38:astore_0        
		try
		{
			d[android.widget.View.ScaleType.FIT_END.ordinal()] = 3;
	//   18   39:getstatic       #20  <Field int[] d>
	//   19   42:getstatic       #34  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_END>
	//   20   45:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//   21   48:iconst_3        
	//   22   49:iastore         
		}
	//*  23   50:goto            54
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   53:astore_0        
		try
		{
			d[android.widget.View.ScaleType.FIT_XY.ordinal()] = 4;
	//   25   54:getstatic       #20  <Field int[] d>
	//   26   57:getstatic       #37  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_XY>
	//   27   60:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//   28   63:iconst_4        
	//   29   64:iastore         
	//   30   65:return          
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   66:astore_0        
	//*  32   67:return          
	}
}
