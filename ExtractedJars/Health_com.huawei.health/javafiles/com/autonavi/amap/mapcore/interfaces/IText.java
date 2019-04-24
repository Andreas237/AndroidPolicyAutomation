// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;

import android.graphics.Typeface;
import android.os.RemoteException;

// Referenced classes of package com.autonavi.amap.mapcore.interfaces:
//			IOverlayImage

public interface IText
	extends IOverlayImage
{

	public abstract int getAlignX()
		throws RemoteException;

	public abstract int getAlignY()
		throws RemoteException;

	public abstract int getBackgroundColor()
		throws RemoteException;

	public abstract int getFontColor()
		throws RemoteException;

	public abstract int getFontSize()
		throws RemoteException;

	public abstract String getText()
		throws RemoteException;

	public abstract Typeface getTypeface()
		throws RemoteException;

	public abstract void setAlign(int i, int j)
		throws RemoteException;

	public abstract void setBackgroundColor(int i)
		throws RemoteException;

	public abstract void setFontColor(int i)
		throws RemoteException;

	public abstract void setFontSize(int i)
		throws RemoteException;

	public abstract void setText(String s)
		throws RemoteException;

	public abstract void setTypeface(Typeface typeface)
		throws RemoteException;
}
