// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.content.res.Resources;
import java.io.InputStream;

// Referenced classes of package com.airbnb.lottie:
//			CompositionLoader, OnCompositionLoadedListener, LottieComposition

final class FileCompositionLoader extends CompositionLoader
{

	FileCompositionLoader(Resources resources, OnCompositionLoadedListener oncompositionloadedlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void CompositionLoader()>
		res = resources;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Resources res>
		loadedListener = oncompositionloadedlistener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field OnCompositionLoadedListener loadedListener>
	//    8   14:return          
	}

	protected transient LottieComposition doInBackground(InputStream ainputstream[])
	{
		return LottieComposition.Factory.fromInputStream(res, ainputstream[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Resources res>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:aaload          
	//    5    7:invokestatic    #27  <Method LottieComposition LottieComposition$Factory.fromInputStream(Resources, InputStream)>
	//    6   10:areturn         
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((InputStream[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class InputStream[]>
	//    3    5:invokevirtual   #32  <Method LottieComposition doInBackground(InputStream[])>
	//    4    8:areturn         
	}

	protected void onPostExecute(LottieComposition lottiecomposition)
	{
		loadedListener.onCompositionLoaded(lottiecomposition);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OnCompositionLoadedListener loadedListener>
	//    2    4:aload_1         
	//    3    5:invokeinterface #39  <Method void OnCompositionLoadedListener.onCompositionLoaded(LottieComposition)>
	//    4   10:return          
	}

	protected volatile void onPostExecute(Object obj)
	{
		onPostExecute((LottieComposition)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #42  <Class LottieComposition>
	//    3    5:invokevirtual   #44  <Method void onPostExecute(LottieComposition)>
	//    4    8:return          
	}

	private final OnCompositionLoadedListener loadedListener;
	private final Resources res;
}
