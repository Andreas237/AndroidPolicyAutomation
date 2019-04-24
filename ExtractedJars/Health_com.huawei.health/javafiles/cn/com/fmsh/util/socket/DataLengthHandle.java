// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util.socket;

import java.io.DataInputStream;
import java.io.IOException;

public interface DataLengthHandle
{

	public abstract int getDataSize(DataInputStream datainputstream)
		throws IOException;

	public abstract byte[] initDataSize(int i);
}
