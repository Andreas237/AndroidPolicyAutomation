// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			AssetId, PMIAssetInfo

public abstract class AssetInfo
{
	private static final class CppProxy extends AssetInfo
	{

		private native void nativeDestroy(long l);

		private native String native_asJson(long l);

		private native PMIAssetInfo native_convertToPMI(long l);

		private native boolean native_equals(long l, AssetInfo assetinfo);

		private native AssetId native_getAssetId(long l);

		private native String native_getCapabilityJson(long l);

		private native String native_getName(long l);

		private native String native_getProtocolType(long l);

		private native String native_getSku(long l);

		private native String native_getSoftwareVersion(long l);

		private native boolean native_isVirtual(long l);

		private native void native_setName(long l, String s);

		private native void native_setSku(long l, String s);

		private native void native_setSoftwareVersion(long l, String s);

		public String asJson()
		{
			return native_asJson(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #59  <Method String native_asJson(long)>
		//    4    8:areturn         
		}

		public PMIAssetInfo convertToPMI()
		{
			return native_convertToPMI(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #63  <Method PMIAssetInfo native_convertToPMI(long)>
		//    4    8:areturn         
		}

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #68  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #70  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		public boolean equals(AssetInfo assetinfo)
		{
			return native_equals(nativeRef, assetinfo);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #74  <Method boolean native_equals(long, AssetInfo)>
		//    5    9:ireturn         
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #77  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #81  <Method void Object.finalize()>
		//    4    8:return          
		}

		public AssetId getAssetId()
		{
			return native_getAssetId(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #85  <Method AssetId native_getAssetId(long)>
		//    4    8:areturn         
		}

		public String getCapabilityJson()
		{
			return native_getCapabilityJson(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #88  <Method String native_getCapabilityJson(long)>
		//    4    8:areturn         
		}

		public String getName()
		{
			return native_getName(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #91  <Method String native_getName(long)>
		//    4    8:areturn         
		}

		public String getProtocolType()
		{
			return native_getProtocolType(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #94  <Method String native_getProtocolType(long)>
		//    4    8:areturn         
		}

		public String getSku()
		{
			return native_getSku(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #97  <Method String native_getSku(long)>
		//    4    8:areturn         
		}

		public String getSoftwareVersion()
		{
			return native_getSoftwareVersion(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #100 <Method String native_getSoftwareVersion(long)>
		//    4    8:areturn         
		}

		public boolean isVirtual()
		{
			return native_isVirtual(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #104 <Method boolean native_isVirtual(long)>
		//    4    8:ireturn         
		}

		public void setName(String s)
		{
			native_setName(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #107 <Method void native_setName(long, String)>
		//    5    9:return          
		}

		public void setSku(String s)
		{
			native_setSku(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #110 <Method void native_setSku(long, String)>
		//    5    9:return          
		}

		public void setSoftwareVersion(String s)
		{
			native_setSoftwareVersion(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #113 <Method void native_setSoftwareVersion(long, String)>
		//    5    9:return          
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
		//    1    1:invokespecial   #19  <Method void AssetInfo()>
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


	public AssetInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static native AssetInfo create(AssetId assetid, String s, String s1, String s2, String s3, String s4);

	public static native AssetInfo createFromJson(String s);

	public static native AssetInfo createVirtualRoomba970(AssetId assetid);

	public abstract String asJson();

	public abstract PMIAssetInfo convertToPMI();

	public abstract boolean equals(AssetInfo assetinfo);

	public abstract AssetId getAssetId();

	public abstract String getCapabilityJson();

	public abstract String getName();

	public abstract String getProtocolType();

	public abstract String getSku();

	public abstract String getSoftwareVersion();

	public abstract boolean isVirtual();

	public abstract void setName(String s);

	public abstract void setSku(String s);

	public abstract void setSoftwareVersion(String s);
}
