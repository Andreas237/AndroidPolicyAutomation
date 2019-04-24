// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.widget.ImageView;

// Referenced classes of package android.support.v4.widget:
//			ImageViewCompat, TintableImageSourceView

static class ImageViewCompat$BaseViewCompatImpl
	implements 
{

	public ColorStateList getImageTintList(ImageView imageview)
	{
		if(imageview instanceof TintableImageSourceView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #18  <Class TintableImageSourceView>
	//*   2    4:ifeq            17
			return ((TintableImageSourceView)imageview).getSupportImageTintList();
	//    3    7:aload_1         
	//    4    8:checkcast       #18  <Class TintableImageSourceView>
	//    5   11:invokeinterface #22  <Method ColorStateList TintableImageSourceView.getSupportImageTintList()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public android.graphics.PorterDuff.Mode getImageTintMode(ImageView imageview)
	{
		if(imageview instanceof TintableImageSourceView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #18  <Class TintableImageSourceView>
	//*   2    4:ifeq            17
			return ((TintableImageSourceView)imageview).getSupportImageTintMode();
	//    3    7:aload_1         
	//    4    8:checkcast       #18  <Class TintableImageSourceView>
	//    5   11:invokeinterface #28  <Method android.graphics.PorterDuff$Mode TintableImageSourceView.getSupportImageTintMode()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public void setImageTintList(ImageView imageview, ColorStateList colorstatelist)
	{
		if(imageview instanceof TintableImageSourceView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #18  <Class TintableImageSourceView>
	//*   2    4:ifeq            17
			((TintableImageSourceView)imageview).setSupportImageTintList(colorstatelist);
	//    3    7:aload_1         
	//    4    8:checkcast       #18  <Class TintableImageSourceView>
	//    5   11:aload_2         
	//    6   12:invokeinterface #34  <Method void TintableImageSourceView.setSupportImageTintList(ColorStateList)>
	//    7   17:return          
	}

	public void setImageTintMode(ImageView imageview, android.graphics.PorterDuff.Mode mode)
	{
		if(imageview instanceof TintableImageSourceView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #18  <Class TintableImageSourceView>
	//*   2    4:ifeq            17
			((TintableImageSourceView)imageview).setSupportImageTintMode(mode);
	//    3    7:aload_1         
	//    4    8:checkcast       #18  <Class TintableImageSourceView>
	//    5   11:aload_2         
	//    6   12:invokeinterface #40  <Method void TintableImageSourceView.setSupportImageTintMode(android.graphics.PorterDuff$Mode)>
	//    7   17:return          
	}

	ImageViewCompat$BaseViewCompatImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
