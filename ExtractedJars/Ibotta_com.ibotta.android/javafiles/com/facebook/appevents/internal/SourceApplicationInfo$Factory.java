// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import bolts.AppLinks;

// Referenced classes of package com.facebook.appevents.internal:
//			SourceApplicationInfo

public static class SourceApplicationInfo$Factory
{

	public static SourceApplicationInfo create(Activity activity)
	{
		String s = "";
	//    0    0:ldc1            #11  <String "">
	//    1    2:astore_3        
		Object obj = ((Object) (activity.getCallingActivity()));
	//    2    3:aload_0         
	//    3    4:invokevirtual   #17  <Method ComponentName Activity.getCallingActivity()>
	//    4    7:astore          4
		if(obj != null)
	//*   5    9:aload           4
	//*   6   11:ifnull          38
		{
			obj = ((Object) (((ComponentName) (obj)).getPackageName()));
	//    7   14:aload           4
	//    8   16:invokevirtual   #23  <Method String ComponentName.getPackageName()>
	//    9   19:astore          4
			s = ((String) (obj));
	//   10   21:aload           4
	//   11   23:astore_3        
			if(((String) (obj)).equals(((Object) (activity.getPackageName()))))
	//*  12   24:aload           4
	//*  13   26:aload_0         
	//*  14   27:invokevirtual   #24  <Method String Activity.getPackageName()>
	//*  15   30:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*  16   33:ifeq            38
				return null;
	//   17   36:aconst_null     
	//   18   37:areturn         
		}
		obj = ((Object) (activity.getIntent()));
	//   19   38:aload_0         
	//   20   39:invokevirtual   #34  <Method Intent Activity.getIntent()>
	//   21   42:astore          4
		boolean flag1 = false;
	//   22   44:iconst_0        
	//   23   45:istore_2        
		activity = ((Activity) (s));
	//   24   46:aload_3         
	//   25   47:astore_0        
		boolean flag = flag1;
	//   26   48:iload_2         
	//   27   49:istore_1        
		if(obj != null)
	//*  28   50:aload           4
	//*  29   52:ifnull          123
		{
			activity = ((Activity) (s));
	//   30   55:aload_3         
	//   31   56:astore_0        
			flag = flag1;
	//   32   57:iload_2         
	//   33   58:istore_1        
			if(!((Intent) (obj)).getBooleanExtra("_fbSourceApplicationHasBeenSet", false))
	//*  34   59:aload           4
	//*  35   61:ldc1            #36  <String "_fbSourceApplicationHasBeenSet">
	//*  36   63:iconst_0        
	//*  37   64:invokevirtual   #42  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  38   67:ifne            123
			{
				((Intent) (obj)).putExtra("_fbSourceApplicationHasBeenSet", true);
	//   39   70:aload           4
	//   40   72:ldc1            #36  <String "_fbSourceApplicationHasBeenSet">
	//   41   74:iconst_1        
	//   42   75:invokevirtual   #46  <Method Intent Intent.putExtra(String, boolean)>
	//   43   78:pop             
				Bundle bundle = AppLinks.getAppLinkData(((Intent) (obj)));
	//   44   79:aload           4
	//   45   81:invokestatic    #52  <Method Bundle AppLinks.getAppLinkData(Intent)>
	//   46   84:astore          5
				activity = ((Activity) (s));
	//   47   86:aload_3         
	//   48   87:astore_0        
				flag = flag1;
	//   49   88:iload_2         
	//   50   89:istore_1        
				if(bundle != null)
	//*  51   90:aload           5
	//*  52   92:ifnull          123
				{
					activity = ((Activity) (bundle.getBundle("referer_app_link")));
	//   53   95:aload           5
	//   54   97:ldc1            #54  <String "referer_app_link">
	//   55   99:invokevirtual   #60  <Method Bundle Bundle.getBundle(String)>
	//   56  102:astore_0        
					if(activity != null)
	//*  57  103:aload_0         
	//*  58  104:ifnull          119
					{
						activity = ((Activity) (((Bundle) (activity)).getString("package")));
	//   59  107:aload_0         
	//   60  108:ldc1            #62  <String "package">
	//   61  110:invokevirtual   #66  <Method String Bundle.getString(String)>
	//   62  113:astore_0        
						flag = true;
	//   63  114:iconst_1        
	//   64  115:istore_1        
					} else
	//*  65  116:goto            123
					{
						flag = true;
	//   66  119:iconst_1        
	//   67  120:istore_1        
						activity = ((Activity) (s));
	//   68  121:aload_3         
	//   69  122:astore_0        
					}
				}
			}
		}
		((Intent) (obj)).putExtra("_fbSourceApplicationHasBeenSet", true);
	//   70  123:aload           4
	//   71  125:ldc1            #36  <String "_fbSourceApplicationHasBeenSet">
	//   72  127:iconst_1        
	//   73  128:invokevirtual   #46  <Method Intent Intent.putExtra(String, boolean)>
	//   74  131:pop             
		return new SourceApplicationInfo(((String) (activity)), flag, ((SourceApplicationInfo._cls1) (null)));
	//   75  132:new             #6   <Class SourceApplicationInfo>
	//   76  135:dup             
	//   77  136:aload_0         
	//   78  137:iload_1         
	//   79  138:aconst_null     
	//   80  139:invokespecial   #70  <Method void SourceApplicationInfo(String, boolean, SourceApplicationInfo$1)>
	//   81  142:areturn         
	}
}
