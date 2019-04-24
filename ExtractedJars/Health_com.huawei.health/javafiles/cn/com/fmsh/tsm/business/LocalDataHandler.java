// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business;

import cn.com.fmsh.tsm.business.bean.BusinessOrder;
import cn.com.fmsh.tsm.business.bean.Notice;
import java.util.ArrayList;
import java.util.List;

public interface LocalDataHandler
{

	public abstract void deleteHistoryByFaceId(String s);

	public abstract void deleteHistoryById(String s);

	public abstract void deleteNotiecById(long l);

	public abstract String[] findAllFaceId();

	public abstract ArrayList findAllNotice();

	public abstract BusinessOrder findRechargeRecordByInfo(String s, String s1, String s2, String s3);

	public abstract BusinessOrder findRechargeRecordByOrder(String s);

	public abstract int getMaxNoticeId();

	public abstract String getVersion4StationInfo();

	public abstract void insertHistory(String s, int i, int j, String s1, int k, int l, String s2);

	public abstract void insertNotice(Notice notice);

	public abstract void insertTrade(String s, String s1, String s2, String s3, String s4, int i, String s5);

	public abstract int updateStationInfo(String s, List list);
}
