// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			ProductInformationResponseHandler, AssetInfo

public abstract class RegistrationService
{
	private static final class CppProxy extends RegistrationService
	{

		private native void nativeDestroy(long l);

		private native void native_getProductInformationWithHandler(long l, String s, ProductInformationResponseHandler productinformationresponsehandler);

		private native String native_getProductSerialNumber(long l, String s);

		private native String native_getProductSku(long l, String s);

		private native void native_registerProductWithAssetInfo(long l, AssetInfo assetinfo);

		private native void native_registerProductWithAssetInfoAndProductName(long l, AssetInfo assetinfo, String s);

		private native void native_registerProductWithProductId(long l, String s);

		private native void native_registerProductWithProductIdAndProductName(long l, String s, String s1);

		private native void native_sendPendingRegistrations(long l);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #55  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #57  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #60  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #64  <Method void Object.finalize()>
		//    4    8:return          
		}

		public void getProductInformationWithHandler(String s, ProductInformationResponseHandler productinformationresponsehandler)
		{
			native_getProductInformationWithHandler(nativeRef, s, productinformationresponsehandler);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #68  <Method void native_getProductInformationWithHandler(long, String, ProductInformationResponseHandler)>
		//    6   10:return          
		}

		public String getProductSerialNumber(String s)
		{
			return native_getProductSerialNumber(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #72  <Method String native_getProductSerialNumber(long, String)>
		//    5    9:areturn         
		}

		public String getProductSku(String s)
		{
			return native_getProductSku(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #75  <Method String native_getProductSku(long, String)>
		//    5    9:areturn         
		}

		public void registerProductWithAssetInfo(AssetInfo assetinfo)
		{
			native_registerProductWithAssetInfo(nativeRef, assetinfo);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #79  <Method void native_registerProductWithAssetInfo(long, AssetInfo)>
		//    5    9:return          
		}

		public void registerProductWithAssetInfoAndProductName(AssetInfo assetinfo, String s)
		{
			native_registerProductWithAssetInfoAndProductName(nativeRef, assetinfo, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #83  <Method void native_registerProductWithAssetInfoAndProductName(long, AssetInfo, String)>
		//    6   10:return          
		}

		public void registerProductWithProductId(String s)
		{
			native_registerProductWithProductId(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #86  <Method void native_registerProductWithProductId(long, String)>
		//    5    9:return          
		}

		public void registerProductWithProductIdAndProductName(String s, String s1)
		{
			native_registerProductWithProductIdAndProductName(nativeRef, s, s1);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #90  <Method void native_registerProductWithProductIdAndProductName(long, String, String)>
		//    6   10:return          
		}

		public void sendPendingRegistrations()
		{
			native_sendPendingRegistrations(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #93  <Method void native_sendPendingRegistrations(long)>
		//    4    8:return          
		}

		static final boolean $assertionsDisabled = false;
		private final AtomicBoolean destroyed = new AtomicBoolean(false);
		private final long nativeRef;

		static 
		{
		//    0    0:return          
		}

		private CppProxy(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void RegistrationService()>
		//    2    4:aload_0         
		//    3    5:new             #21  <Class AtomicBoolean>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:invokespecial   #24  <Method void AtomicBoolean(boolean)>
		//    7   13:putfield        #26  <Field AtomicBoolean destroyed>
			if(l == 0L)
		//*   8   16:lload_1         
		//*   9   17:lconst_0        
		//*  10   18:lcmp            
		//*  11   19:ifne            32
			{
				throw new RuntimeException("nativeRef is zero");
		//   12   22:new             #28  <Class RuntimeException>
		//   13   25:dup             
		//   14   26:ldc1            #30  <String "nativeRef is zero">
		//   15   28:invokespecial   #33  <Method void RuntimeException(String)>
		//   16   31:athrow          
			} else
			{
				nativeRef = l;
		//   17   32:aload_0         
		//   18   33:lload_1         
		//   19   34:putfield        #35  <Field long nativeRef>
				return;
		//   20   37:return          
			}
		}
	}


	public RegistrationService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public abstract void getProductInformationWithHandler(String s, ProductInformationResponseHandler productinformationresponsehandler);

	public abstract String getProductSerialNumber(String s);

	public abstract String getProductSku(String s);

	public abstract void registerProductWithAssetInfo(AssetInfo assetinfo);

	public abstract void registerProductWithAssetInfoAndProductName(AssetInfo assetinfo, String s);

	public abstract void registerProductWithProductId(String s);

	public abstract void registerProductWithProductIdAndProductName(String s, String s1);

	public abstract void sendPendingRegistrations();
}
