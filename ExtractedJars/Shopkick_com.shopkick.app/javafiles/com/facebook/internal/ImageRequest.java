// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import com.facebook.FacebookSdk;
import java.util.Locale;

// Referenced classes of package com.facebook.internal:
//			Validate, ServerProtocol, ImageResponse

public class ImageRequest
{
	public static class Builder
	{

		public ImageRequest build()
		{
			return new ImageRequest(this);
		//    0    0:new             #6   <Class ImageRequest>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #56  <Method void ImageRequest(ImageRequest$Builder, ImageRequest$1)>
		//    5    9:areturn         
		}

		public Builder setAllowCachedRedirects(boolean flag)
		{
			allowCachedRedirects = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #47  <Field boolean allowCachedRedirects>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setCallback(Callback callback1)
		{
			callback = callback1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #43  <Field ImageRequest$Callback callback>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setCallerTag(Object obj)
		{
			callerTag = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #51  <Field Object callerTag>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private boolean allowCachedRedirects;
		private Callback callback;
		private Object callerTag;
		private Context context;
		private Uri imageUrl;


/*
		static Context access$000(Builder builder)
		{
			return builder.context;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field Context context>
		//    2    4:areturn         
		}

*/


/*
		static Uri access$100(Builder builder)
		{
			return builder.imageUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field Uri imageUrl>
		//    2    4:areturn         
		}

*/


/*
		static Callback access$200(Builder builder)
		{
			return builder.callback;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field ImageRequest$Callback callback>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$300(Builder builder)
		{
			return builder.allowCachedRedirects;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field boolean allowCachedRedirects>
		//    2    4:ireturn         
		}

*/


/*
		static Object access$400(Builder builder)
		{
			return builder.callerTag;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field Object callerTag>
		//    2    4:areturn         
		}

*/

		public Builder(Context context1, Uri uri)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			Validate.notNull(((Object) (uri)), "imageUri");
		//    2    4:aload_2         
		//    3    5:ldc1            #24  <String "imageUri">
		//    4    7:invokestatic    #30  <Method void Validate.notNull(Object, String)>
			context = context1;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #32  <Field Context context>
			imageUrl = uri;
		//    8   15:aload_0         
		//    9   16:aload_2         
		//   10   17:putfield        #34  <Field Uri imageUrl>
		//   11   20:return          
		}
	}

	public static interface Callback
	{

		public abstract void onCompleted(ImageResponse imageresponse);
	}


	private ImageRequest(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		context = builder.context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #50  <Method Context ImageRequest$Builder.access$000(ImageRequest$Builder)>
	//    5    9:putfield        #52  <Field Context context>
		imageUri = builder.imageUrl;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #56  <Method Uri ImageRequest$Builder.access$100(ImageRequest$Builder)>
	//    9   17:putfield        #58  <Field Uri imageUri>
		callback = builder.callback;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #62  <Method ImageRequest$Callback ImageRequest$Builder.access$200(ImageRequest$Builder)>
	//   13   25:putfield        #64  <Field ImageRequest$Callback callback>
		allowCachedRedirects = builder.allowCachedRedirects;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #68  <Method boolean ImageRequest$Builder.access$300(ImageRequest$Builder)>
	//   17   33:putfield        #70  <Field boolean allowCachedRedirects>
		if(builder.callerTag == null)
	//*  18   36:aload_1         
	//*  19   37:invokestatic    #74  <Method Object ImageRequest$Builder.access$400(ImageRequest$Builder)>
	//*  20   40:ifnonnull       54
			builder = ((Builder) (new Object()));
	//   21   43:new             #4   <Class Object>
	//   22   46:dup             
	//   23   47:invokespecial   #46  <Method void Object()>
	//   24   50:astore_1        
		else
	//*  25   51:goto            59
			builder = ((Builder) (builder.callerTag));
	//   26   54:aload_1         
	//   27   55:invokestatic    #74  <Method Object ImageRequest$Builder.access$400(ImageRequest$Builder)>
	//   28   58:astore_1        
		callerTag = ((Object) (builder));
	//   29   59:aload_0         
	//   30   60:aload_1         
	//   31   61:putfield        #76  <Field Object callerTag>
	//   32   64:return          
	}


	public static Uri getProfilePictureUri(String s, int i, int j)
	{
		Validate.notNullOrEmpty(s, "userId");
	//    0    0:aload_0         
	//    1    1:ldc1            #84  <String "userId">
	//    2    3:invokestatic    #90  <Method void Validate.notNullOrEmpty(String, String)>
		i = Math.max(i, 0);
	//    3    6:iload_1         
	//    4    7:iconst_0        
	//    5    8:invokestatic    #96  <Method int Math.max(int, int)>
	//    6   11:istore_1        
		j = Math.max(j, 0);
	//    7   12:iload_2         
	//    8   13:iconst_0        
	//    9   14:invokestatic    #96  <Method int Math.max(int, int)>
	//   10   17:istore_2        
		if(i == 0 && j == 0)
	//*  11   18:iload_1         
	//*  12   19:ifne            39
	//*  13   22:iload_2         
	//*  14   23:ifeq            29
	//*  15   26:goto            39
			throw new IllegalArgumentException("Either width or height must be greater than 0");
	//   16   29:new             #98  <Class IllegalArgumentException>
	//   17   32:dup             
	//   18   33:ldc1            #100 <String "Either width or height must be greater than 0">
	//   19   35:invokespecial   #103 <Method void IllegalArgumentException(String)>
	//   20   38:athrow          
		s = ((String) (Uri.parse(ServerProtocol.getGraphUrlBase()).buildUpon().path(String.format(Locale.US, "%s/%s/picture", new Object[] {
			FacebookSdk.getGraphApiVersion(), s
		}))));
	//   21   39:invokestatic    #109 <Method String ServerProtocol.getGraphUrlBase()>
	//   22   42:invokestatic    #115 <Method Uri Uri.parse(String)>
	//   23   45:invokevirtual   #119 <Method android.net.Uri$Builder Uri.buildUpon()>
	//   24   48:getstatic       #125 <Field Locale Locale.US>
	//   25   51:ldc1            #25  <String "%s/%s/picture">
	//   26   53:iconst_2        
	//   27   54:anewarray       Object[]
	//   28   57:dup             
	//   29   58:iconst_0        
	//   30   59:invokestatic    #130 <Method String FacebookSdk.getGraphApiVersion()>
	//   31   62:aastore         
	//   32   63:dup             
	//   33   64:iconst_1        
	//   34   65:aload_0         
	//   35   66:aastore         
	//   36   67:invokestatic    #136 <Method String String.format(Locale, String, Object[])>
	//   37   70:invokevirtual   #142 <Method android.net.Uri$Builder android.net.Uri$Builder.path(String)>
	//   38   73:astore_0        
		if(j != 0)
	//*  39   74:iload_2         
	//*  40   75:ifeq            89
			((android.net.Uri.Builder) (s)).appendQueryParameter("height", String.valueOf(j));
	//   41   78:aload_0         
	//   42   79:ldc1            #16  <String "height">
	//   43   81:iload_2         
	//   44   82:invokestatic    #146 <Method String String.valueOf(int)>
	//   45   85:invokevirtual   #150 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   46   88:pop             
		if(i != 0)
	//*  47   89:iload_1         
	//*  48   90:ifeq            104
			((android.net.Uri.Builder) (s)).appendQueryParameter("width", String.valueOf(i));
	//   49   93:aload_0         
	//   50   94:ldc1            #31  <String "width">
	//   51   96:iload_1         
	//   52   97:invokestatic    #146 <Method String String.valueOf(int)>
	//   53  100:invokevirtual   #150 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   54  103:pop             
		((android.net.Uri.Builder) (s)).appendQueryParameter("migration_overrides", "{october_2012:true}");
	//   55  104:aload_0         
	//   56  105:ldc1            #19  <String "migration_overrides">
	//   57  107:ldc1            #22  <String "{october_2012:true}">
	//   58  109:invokevirtual   #150 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   59  112:pop             
		return ((android.net.Uri.Builder) (s)).build();
	//   60  113:aload_0         
	//   61  114:invokevirtual   #154 <Method Uri android.net.Uri$Builder.build()>
	//   62  117:areturn         
	}

	public Callback getCallback()
	{
		return callback;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ImageRequest$Callback callback>
	//    2    4:areturn         
	}

	public Object getCallerTag()
	{
		return callerTag;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Object callerTag>
	//    2    4:areturn         
	}

	public Context getContext()
	{
		return context;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Context context>
	//    2    4:areturn         
	}

	public Uri getImageUri()
	{
		return imageUri;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Uri imageUri>
	//    2    4:areturn         
	}

	public boolean isCachedRedirectAllowed()
	{
		return allowCachedRedirects;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field boolean allowCachedRedirects>
	//    2    4:ireturn         
	}

	private static final String HEIGHT_PARAM = "height";
	private static final String MIGRATION_PARAM = "migration_overrides";
	private static final String MIGRATION_VALUE = "{october_2012:true}";
	private static final String PATH = "%s/%s/picture";
	public static final int UNSPECIFIED_DIMENSION = 0;
	private static final String WIDTH_PARAM = "width";
	private boolean allowCachedRedirects;
	private Callback callback;
	private Object callerTag;
	private Context context;
	private Uri imageUri;
}
