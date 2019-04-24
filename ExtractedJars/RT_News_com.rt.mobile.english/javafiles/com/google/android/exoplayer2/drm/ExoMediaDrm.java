// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.media.*;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			ExoMediaCrypto

public interface ExoMediaDrm
{
	public static final class DefaultKeyRequest
		implements KeyRequest
	{

		public byte[] getData()
		{
			return data;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field byte[] data>
		//    2    4:areturn         
		}

		public String getDefaultUrl()
		{
			return defaultUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field String defaultUrl>
		//    2    4:areturn         
		}

		private final byte data[];
		private final String defaultUrl;

		public DefaultKeyRequest(byte abyte0[], String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			data = abyte0;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field byte[] data>
			defaultUrl = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field String defaultUrl>
		//    8   14:return          
		}
	}

	public static final class DefaultKeyStatus
		implements KeyStatus
	{

		public byte[] getKeyId()
		{
			return keyId;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field byte[] keyId>
		//    2    4:areturn         
		}

		public int getStatusCode()
		{
			return statusCode;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field int statusCode>
		//    2    4:ireturn         
		}

		private final byte keyId[];
		private final int statusCode;

		DefaultKeyStatus(int i, byte abyte0[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			statusCode = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #20  <Field int statusCode>
			keyId = abyte0;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field byte[] keyId>
		//    8   14:return          
		}
	}

	public static final class DefaultProvisionRequest
		implements ProvisionRequest
	{

		public byte[] getData()
		{
			return data;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field byte[] data>
		//    2    4:areturn         
		}

		public String getDefaultUrl()
		{
			return defaultUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field String defaultUrl>
		//    2    4:areturn         
		}

		private final byte data[];
		private final String defaultUrl;

		public DefaultProvisionRequest(byte abyte0[], String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			data = abyte0;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field byte[] data>
			defaultUrl = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field String defaultUrl>
		//    8   14:return          
		}
	}

	public static interface KeyRequest
	{

		public abstract byte[] getData();

		public abstract String getDefaultUrl();
	}

	public static interface KeyStatus
	{

		public abstract byte[] getKeyId();

		public abstract int getStatusCode();
	}

	public static interface OnEventListener
	{

		public abstract void onEvent(ExoMediaDrm exomediadrm, byte abyte0[], int i, int j, byte abyte1[]);
	}

	public static interface OnKeyStatusChangeListener
	{

		public abstract void onKeyStatusChange(ExoMediaDrm exomediadrm, byte abyte0[], List list, boolean flag);
	}

	public static interface ProvisionRequest
	{

		public abstract byte[] getData();

		public abstract String getDefaultUrl();
	}


	public abstract void closeSession(byte abyte0[]);

	public abstract ExoMediaCrypto createMediaCrypto(byte abyte0[])
		throws MediaCryptoException;

	public abstract KeyRequest getKeyRequest(byte abyte0[], byte abyte1[], String s, int i, HashMap hashmap)
		throws NotProvisionedException;

	public abstract byte[] getPropertyByteArray(String s);

	public abstract String getPropertyString(String s);

	public abstract ProvisionRequest getProvisionRequest();

	public abstract byte[] openSession()
		throws MediaDrmException;

	public abstract byte[] provideKeyResponse(byte abyte0[], byte abyte1[])
		throws NotProvisionedException, DeniedByServerException;

	public abstract void provideProvisionResponse(byte abyte0[])
		throws DeniedByServerException;

	public abstract Map queryKeyStatus(byte abyte0[]);

	public abstract void release();

	public abstract void restoreKeys(byte abyte0[], byte abyte1[]);

	public abstract void setOnEventListener(OnEventListener oneventlistener);

	public abstract void setOnKeyStatusChangeListener(OnKeyStatusChangeListener onkeystatuschangelistener);

	public abstract void setPropertyByteArray(String s, byte abyte0[]);

	public abstract void setPropertyString(String s, String s1);

	public static final int EVENT_KEY_EXPIRED = 3;
	public static final int EVENT_KEY_REQUIRED = 2;
	public static final int EVENT_PROVISION_REQUIRED = 1;
	public static final int KEY_TYPE_OFFLINE = 2;
	public static final int KEY_TYPE_RELEASE = 3;
	public static final int KEY_TYPE_STREAMING = 1;
}
