// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

class LikeActionController$10
	implements com.facebook.internal.mpletedListener
{

	public void completed(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          179
		{
			if(!bundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED"))
	//*   2    4:aload_1         
	//*   3    5:ldc1            #24  <String "com.facebook.platform.extra.OBJECT_IS_LIKED">
	//*   4    7:invokevirtual   #30  <Method boolean Bundle.containsKey(String)>
	//*   5   10:ifne            14
				return;
	//    6   13:return          
			boolean flag = bundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
	//    7   14:aload_1         
	//    8   15:ldc1            #24  <String "com.facebook.platform.extra.OBJECT_IS_LIKED">
	//    9   17:invokevirtual   #33  <Method boolean Bundle.getBoolean(String)>
	//   10   20:istore_2        
			String s;
			if(bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE"))
	//*  11   21:aload_1         
	//*  12   22:ldc1            #35  <String "com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE">
	//*  13   24:invokevirtual   #30  <Method boolean Bundle.containsKey(String)>
	//*  14   27:ifeq            40
				s = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
	//   15   30:aload_1         
	//   16   31:ldc1            #35  <String "com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE">
	//   17   33:invokevirtual   #39  <Method String Bundle.getString(String)>
	//   18   36:astore_3        
			else
	//*  19   37:goto            48
				s = LikeActionController.access$700(LikeActionController.this);
	//   20   40:aload_0         
	//   21   41:getfield        #17  <Field LikeActionController this$0>
	//   22   44:invokestatic    #43  <Method String LikeActionController.access$700(LikeActionController)>
	//   23   47:astore_3        
			String s1;
			if(bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE"))
	//*  24   48:aload_1         
	//*  25   49:ldc1            #45  <String "com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE">
	//*  26   51:invokevirtual   #30  <Method boolean Bundle.containsKey(String)>
	//*  27   54:ifeq            68
				s1 = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
	//   28   57:aload_1         
	//   29   58:ldc1            #45  <String "com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE">
	//   30   60:invokevirtual   #39  <Method String Bundle.getString(String)>
	//   31   63:astore          4
			else
	//*  32   65:goto            77
				s1 = LikeActionController.access$800(LikeActionController.this);
	//   33   68:aload_0         
	//   34   69:getfield        #17  <Field LikeActionController this$0>
	//   35   72:invokestatic    #48  <Method String LikeActionController.access$800(LikeActionController)>
	//   36   75:astore          4
			String s2;
			if(bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE"))
	//*  37   77:aload_1         
	//*  38   78:ldc1            #50  <String "com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE">
	//*  39   80:invokevirtual   #30  <Method boolean Bundle.containsKey(String)>
	//*  40   83:ifeq            97
				s2 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
	//   41   86:aload_1         
	//   42   87:ldc1            #50  <String "com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE">
	//   43   89:invokevirtual   #39  <Method String Bundle.getString(String)>
	//   44   92:astore          5
			else
	//*  45   94:goto            106
				s2 = LikeActionController.access$900(LikeActionController.this);
	//   46   97:aload_0         
	//   47   98:getfield        #17  <Field LikeActionController this$0>
	//   48  101:invokestatic    #53  <Method String LikeActionController.access$900(LikeActionController)>
	//   49  104:astore          5
			String s3;
			if(bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE"))
	//*  50  106:aload_1         
	//*  51  107:ldc1            #55  <String "com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE">
	//*  52  109:invokevirtual   #30  <Method boolean Bundle.containsKey(String)>
	//*  53  112:ifeq            126
				s3 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
	//   54  115:aload_1         
	//   55  116:ldc1            #55  <String "com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE">
	//   56  118:invokevirtual   #39  <Method String Bundle.getString(String)>
	//   57  121:astore          6
			else
	//*  58  123:goto            135
				s3 = LikeActionController.access$1000(LikeActionController.this);
	//   59  126:aload_0         
	//   60  127:getfield        #17  <Field LikeActionController this$0>
	//   61  130:invokestatic    #58  <Method String LikeActionController.access$1000(LikeActionController)>
	//   62  133:astore          6
			if(bundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN"))
	//*  63  135:aload_1         
	//*  64  136:ldc1            #60  <String "com.facebook.platform.extra.UNLIKE_TOKEN">
	//*  65  138:invokevirtual   #30  <Method boolean Bundle.containsKey(String)>
	//*  66  141:ifeq            154
				bundle = ((Bundle) (bundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN")));
	//   67  144:aload_1         
	//   68  145:ldc1            #60  <String "com.facebook.platform.extra.UNLIKE_TOKEN">
	//   69  147:invokevirtual   #39  <Method String Bundle.getString(String)>
	//   70  150:astore_1        
			else
	//*  71  151:goto            162
				bundle = ((Bundle) (LikeActionController.access$1100(LikeActionController.this)));
	//   72  154:aload_0         
	//   73  155:getfield        #17  <Field LikeActionController this$0>
	//   74  158:invokestatic    #63  <Method String LikeActionController.access$1100(LikeActionController)>
	//   75  161:astore_1        
			LikeActionController.access$1300(LikeActionController.this, flag, s, s1, s2, s3, ((String) (bundle)));
	//   76  162:aload_0         
	//   77  163:getfield        #17  <Field LikeActionController this$0>
	//   78  166:iload_2         
	//   79  167:aload_3         
	//   80  168:aload           4
	//   81  170:aload           5
	//   82  172:aload           6
	//   83  174:aload_1         
	//   84  175:invokestatic    #67  <Method void LikeActionController.access$1300(LikeActionController, boolean, String, String, String, String, String)>
			return;
	//   85  178:return          
		} else
		{
			return;
	//   86  179:return          
		}
	}

	final LikeActionController this$0;

	LikeActionController$10()
	{
		this$0 = LikeActionController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field LikeActionController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
