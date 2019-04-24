// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.FileNotFoundException;

// Referenced classes of package android.support.v4.print:
//			PrintHelper

static interface PrintHelper$PrintHelperVersionImpl
{

	public abstract int getColorMode();

	public abstract int getOrientation();

	public abstract int getScaleMode();

	public abstract void printBitmap(String s, Bitmap bitmap, PrintHelper.OnPrintFinishCallback onprintfinishcallback);

	public abstract void printBitmap(String s, Uri uri, PrintHelper.OnPrintFinishCallback onprintfinishcallback)
		throws FileNotFoundException;

	public abstract void setColorMode(int i);

	public abstract void setOrientation(int i);

	public abstract void setScaleMode(int i);
}
