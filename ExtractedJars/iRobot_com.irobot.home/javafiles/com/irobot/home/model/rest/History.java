// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import com.irobot.core.AssetAccumulatedHistoryEvent;

public class History
{

	public History()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		status = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #20  <String "">
	//    4    7:putfield        #22  <Field String status>
		error = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #20  <String "">
	//    7   13:putfield        #24  <Field String error>
	//    8   16:return          
	}

	public int getDirtDetectCount()
	{
		return dirt_detect_count;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int dirt_detect_count>
	//    2    4:ireturn         
	}

	public String getError()
	{
		return error;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String error>
	//    2    4:areturn         
	}

	public int getNumberOfCleaningJobs()
	{
		return number_of_cleaning_jobs;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int number_of_cleaning_jobs>
	//    2    4:ireturn         
	}

	public String getStatus()
	{
		return status;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String status>
	//    2    4:areturn         
	}

	public int getTotalAreaCleaned()
	{
		return total_area_cleaned;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int total_area_cleaned>
	//    2    4:ireturn         
	}

	public int getTotalJobTime()
	{
		return total_job_time;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int total_job_time>
	//    2    4:ireturn         
	}

	public void update(History history)
	{
		total_job_time = history.total_job_time;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #41  <Field int total_job_time>
	//    3    5:putfield        #41  <Field int total_job_time>
		number_of_cleaning_jobs = history.number_of_cleaning_jobs;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #34  <Field int number_of_cleaning_jobs>
	//    7   13:putfield        #34  <Field int number_of_cleaning_jobs>
		total_distance_traveled = history.total_distance_traveled;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #45  <Field int total_distance_traveled>
	//   11   21:putfield        #45  <Field int total_distance_traveled>
		dirt_detect_count = history.dirt_detect_count;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #29  <Field int dirt_detect_count>
	//   15   29:putfield        #29  <Field int dirt_detect_count>
		total_area_cleaned = history.total_area_cleaned;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:getfield        #38  <Field int total_area_cleaned>
	//   19   37:putfield        #38  <Field int total_area_cleaned>
		average_time_per_job = history.average_time_per_job;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:getfield        #47  <Field int average_time_per_job>
	//   23   45:putfield        #47  <Field int average_time_per_job>
		status = history.status;
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:getfield        #22  <Field String status>
	//   27   53:putfield        #22  <Field String status>
		error = history.error;
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:getfield        #24  <Field String error>
	//   31   61:putfield        #24  <Field String error>
	//   32   64:return          
	}

	public void updateFromEvent(AssetAccumulatedHistoryEvent assetaccumulatedhistoryevent)
	{
		total_job_time = assetaccumulatedhistoryevent.totalJobMinutes();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #54  <Method int AssetAccumulatedHistoryEvent.totalJobMinutes()>
	//    3    5:putfield        #41  <Field int total_job_time>
		number_of_cleaning_jobs = assetaccumulatedhistoryevent.numberOfCleaningJobs();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #57  <Method int AssetAccumulatedHistoryEvent.numberOfCleaningJobs()>
	//    7   13:putfield        #34  <Field int number_of_cleaning_jobs>
		total_distance_traveled = assetaccumulatedhistoryevent.totalFeetTraveled();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #60  <Method int AssetAccumulatedHistoryEvent.totalFeetTraveled()>
	//   11   21:putfield        #45  <Field int total_distance_traveled>
		dirt_detect_count = assetaccumulatedhistoryevent.dirtDetectCount();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #63  <Method int AssetAccumulatedHistoryEvent.dirtDetectCount()>
	//   15   29:putfield        #29  <Field int dirt_detect_count>
		total_area_cleaned = assetaccumulatedhistoryevent.totalSquareFeetCleaned();
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #66  <Method int AssetAccumulatedHistoryEvent.totalSquareFeetCleaned()>
	//   19   37:putfield        #38  <Field int total_area_cleaned>
		average_time_per_job = assetaccumulatedhistoryevent.averageMinutesPerJob();
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #69  <Method int AssetAccumulatedHistoryEvent.averageMinutesPerJob()>
	//   23   45:putfield        #47  <Field int average_time_per_job>
	//   24   48:return          
	}

	private int average_time_per_job;
	private int dirt_detect_count;
	private String error;
	private int number_of_cleaning_jobs;
	private String status;
	private int total_area_cleaned;
	private int total_distance_traveled;
	private int total_job_time;
}
