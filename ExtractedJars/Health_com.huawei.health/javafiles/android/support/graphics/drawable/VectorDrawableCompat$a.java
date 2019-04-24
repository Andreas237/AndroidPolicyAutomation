// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.content.res.TypedArrayUtils;
import android.util.AttributeSet;
import o.ae;
import o.ag;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.graphics.drawable:
//			VectorDrawableCompat, PathParser

static class VectorDrawableCompat$a extends VectorDrawableCompat$e
{

	private void b(TypedArray typedarray)
	{
		String s = typedarray.getString(0);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #24  <Method String TypedArray.getString(int)>
	//    3    5:astore_2        
		if(s != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          15
			p = s;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #28  <Field String p>
		typedarray = ((TypedArray) (typedarray.getString(1)));
	//    9   15:aload_1         
	//   10   16:iconst_1        
	//   11   17:invokevirtual   #24  <Method String TypedArray.getString(int)>
	//   12   20:astore_1        
		if(typedarray != null)
	//*  13   21:aload_1         
	//*  14   22:ifnull          33
			l = PathParser.c(((String) (typedarray)));
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:invokestatic    #34  <Method PathParser$PathDataNode[] PathParser.c(String)>
	//   18   30:putfield        #38  <Field PathParser$PathDataNode[] l>
	//   19   33:return          
	}

	public void a(Resources resources, AttributeSet attributeset, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser)
	{
		if(!TypedArrayUtils.hasAttribute(xmlpullparser, "pathData"))
	//*   0    0:aload           4
	//*   1    2:ldc1            #41  <String "pathData">
	//*   2    4:invokestatic    #47  <Method boolean TypedArrayUtils.hasAttribute(XmlPullParser, String)>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			resources = ((Resources) (ag.obtainAttributes(resources, theme, attributeset, ae.c)));
	//    5   11:aload_1         
	//    6   12:aload_3         
	//    7   13:aload_2         
	//    8   14:getstatic       #52  <Field int[] ae.c>
	//    9   17:invokestatic    #58  <Method TypedArray ag.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   10   20:astore_1        
			b(((TypedArray) (resources)));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #60  <Method void b(TypedArray)>
			((TypedArray) (resources)).recycle();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #63  <Method void TypedArray.recycle()>
			return;
	//   16   30:return          
		}
	}

	public boolean d()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public VectorDrawableCompat$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void VectorDrawableCompat$e()>
	//    2    4:return          
	}

	public VectorDrawableCompat$a(VectorDrawableCompat$a vectordrawablecompat$a)
	{
		super(((VectorDrawableCompat$e) (vectordrawablecompat$a)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void VectorDrawableCompat$e(VectorDrawableCompat$e)>
	//    3    5:return          
	}
}
