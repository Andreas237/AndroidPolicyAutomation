// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;

import android.content.Context;
import android.graphics.BitmapFactory;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;

public class IconRequest
{

	public IconRequest(String s, int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		hash = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field String hash>
		iconResourceId = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int iconResourceId>
		width = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #21  <Field int width>
		height = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #23  <Field int height>
	//   14   25:return          
	}

	public static IconRequest build(Context context, String s)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(s != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          81
			try
			{
				int i = CommonUtils.getAppIconResourceId(context);
	//    4    6:aload_0         
	//    5    7:invokestatic    #34  <Method int CommonUtils.getAppIconResourceId(Context)>
	//    6   10:istore_2        
				Fabric.getLogger().d("Fabric", (new StringBuilder()).append("App icon resource ID is ").append(i).toString());
	//    7   11:invokestatic    #40  <Method Logger Fabric.getLogger()>
	//    8   14:ldc1            #42  <String "Fabric">
	//    9   16:new             #44  <Class StringBuilder>
	//   10   19:dup             
	//   11   20:invokespecial   #45  <Method void StringBuilder()>
	//   12   23:ldc1            #47  <String "App icon resource ID is ">
	//   13   25:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:iload_2         
	//   15   29:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   16   32:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   17   35:invokeinterface #64  <Method void Logger.d(String, String)>
				obj = ((Object) (new android.graphics.BitmapFactory.Options()));
	//   18   40:new             #66  <Class android.graphics.BitmapFactory$Options>
	//   19   43:dup             
	//   20   44:invokespecial   #67  <Method void android.graphics.BitmapFactory$Options()>
	//   21   47:astore_3        
				obj.inJustDecodeBounds = true;
	//   22   48:aload_3         
	//   23   49:iconst_1        
	//   24   50:putfield        #71  <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
				BitmapFactory.decodeResource(context.getResources(), i, ((android.graphics.BitmapFactory.Options) (obj)));
	//   25   53:aload_0         
	//   26   54:invokevirtual   #77  <Method android.content.res.Resources Context.getResources()>
	//   27   57:iload_2         
	//   28   58:aload_3         
	//   29   59:invokestatic    #83  <Method android.graphics.Bitmap BitmapFactory.decodeResource(android.content.res.Resources, int, android.graphics.BitmapFactory$Options)>
	//   30   62:pop             
				obj = ((Object) (new IconRequest(s, i, ((android.graphics.BitmapFactory.Options) (obj)).outWidth, ((android.graphics.BitmapFactory.Options) (obj)).outHeight)));
	//   31   63:new             #2   <Class IconRequest>
	//   32   66:dup             
	//   33   67:aload_1         
	//   34   68:iload_2         
	//   35   69:aload_3         
	//   36   70:getfield        #86  <Field int android.graphics.BitmapFactory$Options.outWidth>
	//   37   73:aload_3         
	//   38   74:getfield        #89  <Field int android.graphics.BitmapFactory$Options.outHeight>
	//   39   77:invokespecial   #91  <Method void IconRequest(String, int, int, int)>
	//   40   80:astore_3        
			}
	//*  41   81:aload_3         
	//*  42   82:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  43   83:astore_0        
			{
				Fabric.getLogger().e("Fabric", "Failed to load icon", ((Throwable) (context)));
	//   44   84:invokestatic    #40  <Method Logger Fabric.getLogger()>
	//   45   87:ldc1            #42  <String "Fabric">
	//   46   89:ldc1            #93  <String "Failed to load icon">
	//   47   91:aload_0         
	//   48   92:invokeinterface #97  <Method void Logger.e(String, String, Throwable)>
				return null;
	//   49   97:aconst_null     
	//   50   98:areturn         
			}
		return ((IconRequest) (obj));
	}

	public final String hash;
	public final int height;
	public final int iconResourceId;
	public final int width;
}
