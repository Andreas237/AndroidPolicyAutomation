// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.res.ColorStateList;

class TintInfo
{

	TintInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	void clear()
	{
		mTintList = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #19  <Field ColorStateList mTintList>
		mHasTintList = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #21  <Field boolean mHasTintList>
		mTintMode = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #23  <Field android.graphics.PorterDuff$Mode mTintMode>
		mHasTintMode = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #25  <Field boolean mHasTintMode>
	//   12   20:return          
	}

	public boolean mHasTintList;
	public boolean mHasTintMode;
	public ColorStateList mTintList;
	public android.graphics.PorterDuff.Mode mTintMode;
}
