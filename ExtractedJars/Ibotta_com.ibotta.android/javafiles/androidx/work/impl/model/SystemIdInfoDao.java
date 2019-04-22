// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;


// Referenced classes of package androidx.work.impl.model:
//			SystemIdInfo

public interface SystemIdInfoDao
{

	public abstract SystemIdInfo getSystemIdInfo(String s);

	public abstract void insertSystemIdInfo(SystemIdInfo systemidinfo);

	public abstract void removeSystemIdInfo(String s);
}
