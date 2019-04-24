// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.storage.database;

import java.util.List;
import org.researchstack.backbone.result.TaskResult;

public interface AppDatabase
{

	public abstract TaskResult loadLatestTaskResult(String s);

	public abstract List loadStepResults(String s);

	public abstract List loadTaskResults(String s);

	public abstract void saveTaskResult(TaskResult taskresult);

	public abstract void setEncryptionKey(String s);
}
