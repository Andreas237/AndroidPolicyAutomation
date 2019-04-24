// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.graphics.Bitmap;
import android.net.Uri;

// Referenced classes of package android.support.v4.print:
//			PrintHelper

static final class PrintHelper$PrintHelperStubImpl
	implements pl
{

	public int getColorMode()
	{
		return mColorMode;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int mColorMode>
	//    2    4:ireturn         
	}

	public int getOrientation()
	{
		return mOrientation;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int mOrientation>
	//    2    4:ireturn         
	}

	public int getScaleMode()
	{
		return mScaleMode;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int mScaleMode>
	//    2    4:ireturn         
	}

	public void printBitmap(String s, Bitmap bitmap, k k)
	{
	//    0    0:return          
	}

	public void printBitmap(String s, Uri uri, k k)
	{
	//    0    0:return          
	}

	public void setColorMode(int i)
	{
		mColorMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field int mColorMode>
	//    3    5:return          
	}

	public void setOrientation(int i)
	{
		mOrientation = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #23  <Field int mOrientation>
	//    3    5:return          
	}

	public void setScaleMode(int i)
	{
		mScaleMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #19  <Field int mScaleMode>
	//    3    5:return          
	}

	int mColorMode;
	int mOrientation;
	int mScaleMode;

	private PrintHelper$PrintHelperStubImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mScaleMode = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #19  <Field int mScaleMode>
		mColorMode = 2;
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:putfield        #21  <Field int mColorMode>
		mOrientation = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #23  <Field int mOrientation>
	//   11   19:return          
	}

	PrintHelper$PrintHelperStubImpl(PrintHelper._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void PrintHelper$PrintHelperStubImpl()>
	//    2    4:return          
	}
}
