// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.nativead;

import android.graphics.Bitmap;
import com.startapp.common.a;

// Referenced classes of package com.startapp.android.publish.ads.nativead:
//			NativeAdDetails

class NativeAdDetails$1
	implements com.startapp.common.a.a
{

	public void a(Bitmap bitmap, int i)
	{
		a.a(bitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field NativeAdDetails a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #26  <Method void com.startapp.android.publish.ads.nativead.NativeAdDetails.a(Bitmap)>
		(new a(a.getSecondaryImageUrl(), new com.startapp.common.a.a() {

			public void a(Bitmap bitmap1, int j)
			{
				a.a.b(bitmap1);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field NativeAdDetails$1 a>
			//    2    4:getfield        #23  <Field NativeAdDetails com.startapp.android.publish.ads.nativead.NativeAdDetails$1.a>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #29  <Method void NativeAdDetails.b(Bitmap)>
				a.a.a();
			//    5   11:aload_0         
			//    6   12:getfield        #16  <Field NativeAdDetails$1 a>
			//    7   15:getfield        #23  <Field NativeAdDetails com.startapp.android.publish.ads.nativead.NativeAdDetails$1.a>
			//    8   18:invokevirtual   #31  <Method void com.startapp.android.publish.ads.nativead.NativeAdDetails.a()>
			//    9   21:return          
			}

			final NativeAdDetails._cls1 a;

			
			{
				a = NativeAdDetails._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field NativeAdDetails$1 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, i)).a();
	//    4    8:new             #28  <Class a>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field NativeAdDetails a>
	//    8   16:invokevirtual   #32  <Method String NativeAdDetails.getSecondaryImageUrl()>
	//    9   19:new             #13  <Class NativeAdDetails$1$1>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #35  <Method void NativeAdDetails$1$1(NativeAdDetails$1)>
	//   13   27:iload_2         
	//   14   28:invokespecial   #38  <Method void a(String, com.startapp.common.a$a, int)>
	//   15   31:invokevirtual   #40  <Method void a.a()>
	//   16   34:return          
	}

	final NativeAdDetails a;

	NativeAdDetails$1(NativeAdDetails nativeaddetails)
	{
		a = nativeaddetails;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field NativeAdDetails a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
