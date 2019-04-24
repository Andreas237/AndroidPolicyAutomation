// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business;

import cn.com.fmsh.tsm.business.enums.EnumIssueProcess;

public interface IssuerProcessHandler
{

	public abstract void handle(EnumIssueProcess enumissueprocess);
}
