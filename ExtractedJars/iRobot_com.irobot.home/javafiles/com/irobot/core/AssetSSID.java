// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			AssetId

public abstract class AssetSSID
{
	private static final class CppProxy extends AssetSSID
	{

		private native void nativeDestroy(long l);

		private native boolean native_isAssetSoftAPNetwork(long l);

		private native boolean native_isValidAssedId(long l);

		private native boolean native_isValidLength(long l);

		private native boolean native_matches(long l, String s);

		private native boolean native_matchesAssetId(long l, AssetId assetid);

		private native String native_robotId(long l);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #51  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #53  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #56  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #60  <Method void Object.finalize()>
		//    4    8:return          
		}

		public boolean isAssetSoftAPNetwork()
		{
			return native_isAssetSoftAPNetwork(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #64  <Method boolean native_isAssetSoftAPNetwork(long)>
		//    4    8:ireturn         
		}

		public boolean isValidAssedId()
		{
			return native_isValidAssedId(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #67  <Method boolean native_isValidAssedId(long)>
		//    4    8:ireturn         
		}

		public boolean isValidLength()
		{
			return native_isValidLength(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #70  <Method boolean native_isValidLength(long)>
		//    4    8:ireturn         
		}

		public boolean matches(String s)
		{
			return native_matches(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #74  <Method boolean native_matches(long, String)>
		//    5    9:ireturn         
		}

		public boolean matchesAssetId(AssetId assetid)
		{
			return native_matchesAssetId(nativeRef, assetid);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #78  <Method boolean native_matchesAssetId(long, AssetId)>
		//    5    9:ireturn         
		}

		public String robotId()
		{
			return native_robotId(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #82  <Method String native_robotId(long)>
		//    4    8:areturn         
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
		//    1    1:invokespecial   #19  <Method void AssetSSID()>
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


	public AssetSSID()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static native AssetSSID create(String s);

	public abstract boolean isAssetSoftAPNetwork();

	public abstract boolean isValidAssedId();

	public abstract boolean isValidLength();

	public abstract boolean matches(String s);

	public abstract boolean matchesAssetId(AssetId assetid);

	public abstract String robotId();
}
