// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.graphics.PathParser;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.graphics.drawable:
//			VectorDrawableCompat, AndroidResources

private static class VectorDrawableCompat$VClipPath extends VectorDrawableCompat.VPath
{

	private void updateStateFromTypedArray(TypedArray typedarray)
	{
		String s = typedarray.getString(0);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #24  <Method String TypedArray.getString(int)>
	//    3    5:astore_2        
		if(s != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          15
			mPathName = s;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #28  <Field String mPathName>
		typedarray = ((TypedArray) (typedarray.getString(1)));
	//    9   15:aload_1         
	//   10   16:iconst_1        
	//   11   17:invokevirtual   #24  <Method String TypedArray.getString(int)>
	//   12   20:astore_1        
		if(typedarray != null)
	//*  13   21:aload_1         
	//*  14   22:ifnull          33
			mNodes = PathParser.createNodesFromPathData(((String) (typedarray)));
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:invokestatic    #34  <Method android.support.v4.graphics.PathParser$PathDataNode[] PathParser.createNodesFromPathData(String)>
	//   18   30:putfield        #38  <Field android.support.v4.graphics.PathParser$PathDataNode[] mNodes>
	//   19   33:return          
	}

	public void inflate(Resources resources, AttributeSet attributeset, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser)
	{
		if(!TypedArrayUtils.hasAttribute(xmlpullparser, "pathData"))
	//*   0    0:aload           4
	//*   1    2:ldc1            #42  <String "pathData">
	//*   2    4:invokestatic    #48  <Method boolean TypedArrayUtils.hasAttribute(XmlPullParser, String)>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			resources = ((Resources) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH)));
	//    5   11:aload_1         
	//    6   12:aload_3         
	//    7   13:aload_2         
	//    8   14:getstatic       #54  <Field int[] AndroidResources.STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH>
	//    9   17:invokestatic    #58  <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   10   20:astore_1        
			updateStateFromTypedArray(((TypedArray) (resources)));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #60  <Method void updateStateFromTypedArray(TypedArray)>
			((TypedArray) (resources)).recycle();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #63  <Method void TypedArray.recycle()>
			return;
	//   16   30:return          
		}
	}

	public boolean isClipPath()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public VectorDrawableCompat$VClipPath()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void VectorDrawableCompat$VPath()>
	//    2    4:return          
	}

	public VectorDrawableCompat$VClipPath(VectorDrawableCompat$VClipPath vectordrawablecompat$vclippath)
	{
		super(((VectorDrawableCompat.VPath) (vectordrawablecompat$vclippath)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void VectorDrawableCompat$VPath(VectorDrawableCompat$VPath)>
	//    3    5:return          
	}
}
