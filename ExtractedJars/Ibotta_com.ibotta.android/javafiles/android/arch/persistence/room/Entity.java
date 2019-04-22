// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import java.lang.annotation.Annotation;

// Referenced classes of package android.arch.persistence.room:
//			ForeignKey, Index

public interface Entity
	extends Annotation
{

	public abstract ForeignKey[] foreignKeys();

	public abstract Index[] indices();

	public abstract boolean inheritSuperIndices();

	public abstract String[] primaryKeys();

	public abstract String tableName();
}
