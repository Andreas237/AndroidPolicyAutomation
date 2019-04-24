// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;

public class zzaps
	implements BleApi
{

	public zzaps()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public PendingResult claimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice)
	{
		return PendingResults.zza(zzaVm, googleapiclient);
	//    0    0:getstatic       #18  <Field Status zzaVm>
	//    1    3:aload_1         
	//    2    4:invokestatic    #29  <Method PendingResult PendingResults.zza(Status, GoogleApiClient)>
	//    3    7:areturn         
	}

	public PendingResult claimBleDevice(GoogleApiClient googleapiclient, String s)
	{
		return PendingResults.zza(zzaVm, googleapiclient);
	//    0    0:getstatic       #18  <Field Status zzaVm>
	//    1    3:aload_1         
	//    2    4:invokestatic    #29  <Method PendingResult PendingResults.zza(Status, GoogleApiClient)>
	//    3    7:areturn         
	}

	public PendingResult listClaimedBleDevices(GoogleApiClient googleapiclient)
	{
		return PendingResults.zza(((com.google.android.gms.common.api.Result) (BleDevicesResult.zzad(zzaVm))), googleapiclient);
	//    0    0:getstatic       #18  <Field Status zzaVm>
	//    1    3:invokestatic    #41  <Method BleDevicesResult BleDevicesResult.zzad(Status)>
	//    2    6:aload_1         
	//    3    7:invokestatic    #44  <Method PendingResult PendingResults.zza(com.google.android.gms.common.api.Result, GoogleApiClient)>
	//    4   10:areturn         
	}

	public PendingResult startBleScan(GoogleApiClient googleapiclient, StartBleScanRequest startblescanrequest)
	{
		return PendingResults.zza(zzaVm, googleapiclient);
	//    0    0:getstatic       #18  <Field Status zzaVm>
	//    1    3:aload_1         
	//    2    4:invokestatic    #29  <Method PendingResult PendingResults.zza(Status, GoogleApiClient)>
	//    3    7:areturn         
	}

	public PendingResult stopBleScan(GoogleApiClient googleapiclient, BleScanCallback blescancallback)
	{
		return PendingResults.zza(zzaVm, googleapiclient);
	//    0    0:getstatic       #18  <Field Status zzaVm>
	//    1    3:aload_1         
	//    2    4:invokestatic    #29  <Method PendingResult PendingResults.zza(Status, GoogleApiClient)>
	//    3    7:areturn         
	}

	public PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice)
	{
		return PendingResults.zza(zzaVm, googleapiclient);
	//    0    0:getstatic       #18  <Field Status zzaVm>
	//    1    3:aload_1         
	//    2    4:invokestatic    #29  <Method PendingResult PendingResults.zza(Status, GoogleApiClient)>
	//    3    7:areturn         
	}

	public PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, String s)
	{
		return PendingResults.zza(zzaVm, googleapiclient);
	//    0    0:getstatic       #18  <Field Status zzaVm>
	//    1    3:aload_1         
	//    2    4:invokestatic    #29  <Method PendingResult PendingResults.zza(Status, GoogleApiClient)>
	//    3    7:areturn         
	}

	private static final Status zzaVm = new Status(5007);

	static 
	{
	//    0    0:new             #12  <Class Status>
	//    1    3:dup             
	//    2    4:sipush          5007
	//    3    7:invokespecial   #16  <Method void Status(int)>
	//    4   10:putstatic       #18  <Field Status zzaVm>
	//*   5   13:return          
	}
}
