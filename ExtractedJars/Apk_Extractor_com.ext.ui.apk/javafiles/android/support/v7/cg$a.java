// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.graphics.Bitmap;
import android.widget.ImageView;

// Referenced classes of package android.support.v7:
//			cg

class cg$a
	implements Runnable
{

	public void run()
	{
		while(c.a(b) || a == null) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field cg c>
	//*   2    4:aload_0         
	//*   3    5:getfield        #25  <Field cg$b b>
	//*   4    8:invokevirtual   #30  <Method boolean cg.a(cg$b)>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
	//    7   15:aload_0         
	//    8   16:getfield        #23  <Field Bitmap a>
	//    9   19:ifnull          14
		b.b.setImageBitmap(a);
	//   10   22:aload_0         
	//   11   23:getfield        #25  <Field cg$b b>
	//   12   26:getfield        #35  <Field ImageView cg$b.b>
	//   13   29:aload_0         
	//   14   30:getfield        #23  <Field Bitmap a>
	//   15   33:invokevirtual   #41  <Method void ImageView.setImageBitmap(Bitmap)>
	//   16   36:return          
	}

	Bitmap a;
	cg$b b;
	final cg c;

	public cg$a(cg cg1, Bitmap bitmap, cg$b cg$b1)
	{
		c = cg1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field cg c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		a = bitmap;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Bitmap a>
		b = cg$b1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field cg$b b>
	//   11   19:return          
	}
}
