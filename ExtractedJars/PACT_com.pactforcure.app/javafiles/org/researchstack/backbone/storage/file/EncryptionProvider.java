// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.storage.file;

import android.content.Context;
import org.researchstack.backbone.storage.file.aes.Encrypter;

// Referenced classes of package org.researchstack.backbone.storage.file:
//			PinCodeConfig

public interface EncryptionProvider
{

	public abstract void changePinCode(Context context, String s, String s1);

	public abstract void createPinCode(Context context, String s);

	public abstract Encrypter getEncrypter();

	public abstract boolean hasPinCode(Context context);

	public abstract void logAccessTime();

	public abstract boolean needsAuth(Context context, PinCodeConfig pincodeconfig);

	public abstract void removePinCode(Context context);

	public abstract void startWithPassphrase(Context context, String s);
}
