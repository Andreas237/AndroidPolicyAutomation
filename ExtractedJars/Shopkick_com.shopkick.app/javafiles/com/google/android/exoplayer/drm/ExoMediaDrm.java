// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.drm;

import android.media.*;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.drm:
//			ExoMediaCrypto

public interface ExoMediaDrm
{
	public static interface KeyRequest
	{

		public abstract byte[] getData();

		public abstract String getDefaultUrl();
	}

	public static interface OnEventListener
	{

		public abstract void onEvent(ExoMediaDrm exomediadrm, byte abyte0[], int i, int j, byte abyte1[]);
	}

	public static interface ProvisionRequest
	{

		public abstract byte[] getData();

		public abstract String getDefaultUrl();
	}


	public abstract void closeSession(byte abyte0[]);

	public abstract ExoMediaCrypto createMediaCrypto(UUID uuid, byte abyte0[])
		throws MediaCryptoException;

	public abstract KeyRequest getKeyRequest(byte abyte0[], byte abyte1[], String s, int i, HashMap hashmap)
		throws NotProvisionedException;

	public abstract byte[] getPropertyByteArray(String s);

	public abstract String getPropertyString(String s);

	public abstract ProvisionRequest getProvisionRequest();

	public abstract byte[] openSession()
		throws NotProvisionedException, ResourceBusyException;

	public abstract byte[] provideKeyResponse(byte abyte0[], byte abyte1[])
		throws NotProvisionedException, DeniedByServerException;

	public abstract void provideProvisionResponse(byte abyte0[])
		throws DeniedByServerException;

	public abstract Map queryKeyStatus(byte abyte0[]);

	public abstract void release();

	public abstract void restoreKeys(byte abyte0[], byte abyte1[]);

	public abstract void setOnEventListener(OnEventListener oneventlistener);

	public abstract void setPropertyByteArray(String s, byte abyte0[]);

	public abstract void setPropertyString(String s, String s1);
}
