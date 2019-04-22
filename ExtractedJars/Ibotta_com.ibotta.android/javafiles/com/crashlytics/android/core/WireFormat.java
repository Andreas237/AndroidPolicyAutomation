// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


final class WireFormat
{

	static int makeTag(int i, int j)
	{
		return i << 3 | j;
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:ishl            
	//    3    3:iload_1         
	//    4    4:ior             
	//    5    5:ireturn         
	}

	static final int MESSAGE_SET_ITEM_END_TAG = makeTag(1, 4);
	static final int MESSAGE_SET_ITEM_TAG = makeTag(1, 3);
	static final int MESSAGE_SET_MESSAGE_TAG = makeTag(3, 2);
	static final int MESSAGE_SET_TYPE_ID_TAG = makeTag(2, 0);

	static 
	{
	//    0    0:iconst_1        
	//    1    1:iconst_3        
	//    2    2:invokestatic    #15  <Method int makeTag(int, int)>
	//    3    5:putstatic       #17  <Field int MESSAGE_SET_ITEM_TAG>
	//    4    8:iconst_1        
	//    5    9:iconst_4        
	//    6   10:invokestatic    #15  <Method int makeTag(int, int)>
	//    7   13:putstatic       #19  <Field int MESSAGE_SET_ITEM_END_TAG>
	//    8   16:iconst_2        
	//    9   17:iconst_0        
	//   10   18:invokestatic    #15  <Method int makeTag(int, int)>
	//   11   21:putstatic       #21  <Field int MESSAGE_SET_TYPE_ID_TAG>
	//   12   24:iconst_3        
	//   13   25:iconst_2        
	//   14   26:invokestatic    #15  <Method int makeTag(int, int)>
	//   15   29:putstatic       #23  <Field int MESSAGE_SET_MESSAGE_TAG>
	//*  16   32:return          
	}
}
