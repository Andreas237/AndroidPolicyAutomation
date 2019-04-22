// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.SerializableString;
import java.io.Serializable;

public abstract class CharacterEscapes
	implements Serializable
{

	public abstract int[] getEscapeCodesForAscii();

	public abstract SerializableString getEscapeSequence(int i);
}
