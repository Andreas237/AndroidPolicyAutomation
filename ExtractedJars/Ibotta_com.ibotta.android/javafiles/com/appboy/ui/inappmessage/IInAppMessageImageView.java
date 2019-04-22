// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import com.appboy.enums.inappmessage.CropType;

public interface IInAppMessageImageView
{

	public abstract void setCornersRadiiPx(float f, float f1, float f2, float f3);

	public abstract void setCornersRadiusPx(float f);

	public abstract void setInAppMessageImageCropType(CropType croptype);
}
