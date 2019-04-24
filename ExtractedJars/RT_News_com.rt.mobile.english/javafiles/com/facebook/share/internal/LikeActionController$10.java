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
	//*   1    1:ifnull          194
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
	//*  19   37:goto            51
				s = LikeActionController.access$700(LikeActionController.this);
	//   20   40:aload_0         
	//   21   41:getfield        #17  <Field LikeActionController this$0>
	//   22   44:invokestatic    #43  <Method String LikeActionController.access$700(LikeActionController)>
	//   23   47:astore_3        
	//*  24   48:goto            37
			String s1;
			if(bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE"))
	//*  25   51:aload_1         
	//*  26   52:ldc1            #45  <String "com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE">
	//*  27   54:invokevirtual   #30  <Method boolean Bundle.containsKey(String)>
	//*  28   57:ifeq            71
				s1 = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
	//   29   60:aload_1         
	//   30   61:ldc1            #45  <String "com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE">
	//   31   63:invokevirtual   #39  <Method String Bundle.getString(String)>
	//   32   66:astore          4
			else
	//*  33   68:goto            83
				s1 = LikeActionController.access$800(LikeActionController.this);
	//   34   71:aload_0         
	//   35   72:getfield        #17  <Field LikeActionController this$0>
	//   36   75:invokestatic    #48  <Method String LikeActionController.access$800(LikeActionController)>
	//   37   78:astore          4
	//*  38   80:goto            68
			String s2;
			if(bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE"))
	//*  39   83:aload_1         
	//*  40   84:ldc1            #50  <String "com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE">
	//*  41   86:invokevirtual   #30  <Method boolean Bundle.containsKey(String)>
	//*  42   89:ifeq            103
				s2 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
	//   43   92:aload_1         
	//   44   93:ldc1            #50  <String "com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE">
	//   45   95:invokevirtual   #39  <Method String Bundle.getString(String)>
	//   46   98:astore          5
			else
	//*  47  100:goto            115
				s2 = LikeActionController.access$900(LikeActionController.this);
	//   48  103:aload_0         
	//   49  104:getfield        #17  <Field LikeActionController this$0>
	//   50  107:invokestatic    #53  <Method String LikeActionController.access$900(LikeActionController)>
	//   51  110:astore          5
	//*  52  112:goto            100
			String s3;
			if(bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE"))
	//*  53  115:aload_1         
	//*  54  116:ldc1            #55  <String "com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE">
	//*  55  118:invokevirtual   #30  <Method boolean Bundle.containsKey(String)>
	//*  56  121:ifeq            135
				s3 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
	//   57  124:aload_1         
	//   58  125:ldc1            #55  <String "com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE">
	//   59  127:invokevirtual   #39  <Method String Bundle.getString(String)>
	//   60  130:astore          6
			else
	//*  61  132:goto            147
				s3 = LikeActionController.access$1000(LikeActionController.this);
	//   62  135:aload_0         
	//   63  136:getfield        #17  <Field LikeActionController this$0>
	//   64  139:invokestatic    #58  <Method String LikeActionController.access$1000(LikeActionController)>
	//   65  142:astore          6
	//*  66  144:goto            132
			if(bundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN"))
	//*  67  147:aload_1         
	//*  68  148:ldc1            #60  <String "com.facebook.platform.extra.UNLIKE_TOKEN">
	//*  69  150:invokevirtual   #30  <Method boolean Bundle.containsKey(String)>
	//*  70  153:ifeq            166
				bundle = ((Bundle) (bundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN")));
	//   71  156:aload_1         
	//   72  157:ldc1            #60  <String "com.facebook.platform.extra.UNLIKE_TOKEN">
	//   73  159:invokevirtual   #39  <Method String Bundle.getString(String)>
	//   74  162:astore_1        
			else
	//*  75  163:goto            177
				bundle = ((Bundle) (LikeActionController.access$1100(LikeActionController.this)));
	//   76  166:aload_0         
	//   77  167:getfield        #17  <Field LikeActionController this$0>
	//   78  170:invokestatic    #63  <Method String LikeActionController.access$1100(LikeActionController)>
	//   79  173:astore_1        
	//*  80  174:goto            163
			LikeActionController.access$1300(LikeActionController.this, flag, s, s1, s2, s3, ((String) (bundle)));
	//   81  177:aload_0         
	//   82  178:getfield        #17  <Field LikeActionController this$0>
	//   83  181:iload_2         
	//   84  182:aload_3         
	//   85  183:aload           4
	//   86  185:aload           5
	//   87  187:aload           6
	//   88  189:aload_1         
	//   89  190:invokestatic    #67  <Method void LikeActionController.access$1300(LikeActionController, boolean, String, String, String, String, String)>
			return;
	//   90  193:return          
		} else
		{
			return;
	//   91  194:return          
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
