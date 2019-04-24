// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.net.Uri;
import android.support.v4.util.Preconditions;

// Referenced classes of package android.support.v4.provider:
//			FontsContractCompat

public static class FontsContractCompat$FontInfo
{

	public int getResultCode()
	{
		return mResultCode;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int mResultCode>
	//    2    4:ireturn         
	}

	public int getTtcIndex()
	{
		return mTtcIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mTtcIndex>
	//    2    4:ireturn         
	}

	public Uri getUri()
	{
		return mUri;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Uri mUri>
	//    2    4:areturn         
	}

	public int getWeight()
	{
		return mWeight;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int mWeight>
	//    2    4:ireturn         
	}

	public boolean isItalic()
	{
		return mItalic;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean mItalic>
	//    2    4:ireturn         
	}

	private final boolean mItalic;
	private final int mResultCode;
	private final int mTtcIndex;
	private final Uri mUri;
	private final int mWeight;

	public FontsContractCompat$FontInfo(Uri uri, int i, int j, boolean flag, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		mUri = (Uri)Preconditions.checkNotNull(((Object) (uri)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #40  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #42  <Class Uri>
	//    6   12:putfield        #44  <Field Uri mUri>
		mTtcIndex = i;
	//    7   15:aload_0         
	//    8   16:iload_2         
	//    9   17:putfield        #46  <Field int mTtcIndex>
		mWeight = j;
	//   10   20:aload_0         
	//   11   21:iload_3         
	//   12   22:putfield        #48  <Field int mWeight>
		mItalic = flag;
	//   13   25:aload_0         
	//   14   26:iload           4
	//   15   28:putfield        #50  <Field boolean mItalic>
		mResultCode = k;
	//   16   31:aload_0         
	//   17   32:iload           5
	//   18   34:putfield        #52  <Field int mResultCode>
	//   19   37:return          
	}
}
