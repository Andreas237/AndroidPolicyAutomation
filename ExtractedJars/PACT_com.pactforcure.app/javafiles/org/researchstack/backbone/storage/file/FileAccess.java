// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.storage.file;

import android.content.Context;
import org.researchstack.backbone.storage.file.aes.Encrypter;

public interface FileAccess
{

	public abstract void clearData(Context context, String s);

	public abstract boolean dataExists(Context context, String s);

	public abstract void moveData(Context context, String s, String s1);

	public abstract byte[] readData(Context context, String s);

	public abstract void setEncrypter(Encrypter encrypter);

	public abstract void writeData(Context context, String s, byte abyte0[]);
}
