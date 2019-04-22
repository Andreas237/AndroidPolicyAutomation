// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

// Referenced classes of package com.bumptech.glide.request:
//			BaseRequestOptions

public class RequestOptions extends BaseRequestOptions
{

	public RequestOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void BaseRequestOptions()>
	//    2    4:return          
	}

	public static RequestOptions decodeTypeOf(Class class1)
	{
		return (RequestOptions)(new RequestOptions()).decode(class1);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #23  <Method BaseRequestOptions decode(Class)>
	//    5   11:checkcast       #2   <Class RequestOptions>
	//    6   14:areturn         
	}

	public static RequestOptions diskCacheStrategyOf(DiskCacheStrategy diskcachestrategy)
	{
		return (RequestOptions)(new RequestOptions()).diskCacheStrategy(diskcachestrategy);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #33  <Method BaseRequestOptions diskCacheStrategy(DiskCacheStrategy)>
	//    5   11:checkcast       #2   <Class RequestOptions>
	//    6   14:areturn         
	}

	public static RequestOptions signatureOf(Key key)
	{
		return (RequestOptions)(new RequestOptions()).signature(key);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #39  <Method BaseRequestOptions signature(Key)>
	//    5   11:checkcast       #2   <Class RequestOptions>
	//    6   14:areturn         
	}

	public static RequestOptions skipMemoryCacheOf(boolean flag)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            37
		{
			if(skipMemoryCacheTrueOptions == null)
	//*   2    4:getstatic       #43  <Field RequestOptions skipMemoryCacheTrueOptions>
	//*   3    7:ifnonnull       33
				skipMemoryCacheTrueOptions = (RequestOptions)((RequestOptions)(new RequestOptions()).skipMemoryCache(true)).autoClone();
	//    4   10:new             #2   <Class RequestOptions>
	//    5   13:dup             
	//    6   14:invokespecial   #19  <Method void RequestOptions()>
	//    7   17:iconst_1        
	//    8   18:invokevirtual   #47  <Method BaseRequestOptions skipMemoryCache(boolean)>
	//    9   21:checkcast       #2   <Class RequestOptions>
	//   10   24:invokevirtual   #51  <Method BaseRequestOptions autoClone()>
	//   11   27:checkcast       #2   <Class RequestOptions>
	//   12   30:putstatic       #43  <Field RequestOptions skipMemoryCacheTrueOptions>
			return skipMemoryCacheTrueOptions;
	//   13   33:getstatic       #43  <Field RequestOptions skipMemoryCacheTrueOptions>
	//   14   36:areturn         
		}
		if(skipMemoryCacheFalseOptions == null)
	//*  15   37:getstatic       #53  <Field RequestOptions skipMemoryCacheFalseOptions>
	//*  16   40:ifnonnull       66
			skipMemoryCacheFalseOptions = (RequestOptions)((RequestOptions)(new RequestOptions()).skipMemoryCache(false)).autoClone();
	//   17   43:new             #2   <Class RequestOptions>
	//   18   46:dup             
	//   19   47:invokespecial   #19  <Method void RequestOptions()>
	//   20   50:iconst_0        
	//   21   51:invokevirtual   #47  <Method BaseRequestOptions skipMemoryCache(boolean)>
	//   22   54:checkcast       #2   <Class RequestOptions>
	//   23   57:invokevirtual   #51  <Method BaseRequestOptions autoClone()>
	//   24   60:checkcast       #2   <Class RequestOptions>
	//   25   63:putstatic       #53  <Field RequestOptions skipMemoryCacheFalseOptions>
		return skipMemoryCacheFalseOptions;
	//   26   66:getstatic       #53  <Field RequestOptions skipMemoryCacheFalseOptions>
	//   27   69:areturn         
	}

	private static RequestOptions skipMemoryCacheFalseOptions;
	private static RequestOptions skipMemoryCacheTrueOptions;
}
