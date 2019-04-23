// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import androidx.versionedparcelable.VersionedParcelable;

interface AudioAttributesImpl
	extends VersionedParcelable
{

	public abstract Object getAudioAttributes();

	public abstract int getContentType();

	public abstract int getFlags();

	public abstract int getLegacyStreamType();

	public abstract int getRawLegacyStreamType();

	public abstract int getUsage();

	public abstract int getVolumeControlStream();

	public abstract Bundle toBundle();
}
