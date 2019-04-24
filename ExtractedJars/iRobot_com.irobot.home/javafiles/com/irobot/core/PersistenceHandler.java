// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.HashMap;

// Referenced classes of package com.irobot.core:
//			KnownBlobsOnFileSystem

public abstract class PersistenceHandler
{

	public PersistenceHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract byte[] readBinary(String s, byte abyte0[]);

	public abstract boolean readBool(String s, boolean flag);

	public abstract boolean readBoolFromGroup(String s, String s1, boolean flag);

	public abstract float readFloat32(String s, float f);

	public abstract double readFloat64(String s, double d);

	public abstract int readInteger32(String s, int i);

	public abstract long readInteger64(String s, long l);

	public abstract String readJsonFilesAsString(KnownBlobsOnFileSystem knownblobsonfilesystem);

	public abstract String readString(String s, String s1);

	public abstract HashMap readStringsFromGroup(String s);

	public abstract void remove(String s);

	public abstract void removeFromGroup(String s, String s1);

	public abstract void removeGroup(String s);

	public abstract void writeBinary(String s, byte abyte0[]);

	public abstract void writeBool(String s, boolean flag);

	public abstract void writeBoolToGroup(String s, String s1, boolean flag);

	public abstract void writeFloat32(String s, float f);

	public abstract void writeFloat64(String s, double d);

	public abstract void writeInteger32(String s, int i);

	public abstract void writeInteger64(String s, long l);

	public abstract void writeString(String s, String s1);

	public abstract void writeStringToGroup(String s, String s1, String s2);
}
