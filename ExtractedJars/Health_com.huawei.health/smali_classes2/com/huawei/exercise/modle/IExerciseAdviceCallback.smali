.class public interface abstract Lcom/huawei/exercise/modle/IExerciseAdviceCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
.end method

.method public abstract getDeviceCapability()Lorg/json/JSONObject;
.end method

.method public abstract getDeviceETEState(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract getDeviceFitnessPlanParamter(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract pushFitnessPlan(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract registerConnectionStatusChangeNotification(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract registerServiceConnectedListener(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract setMetricUnit(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract setRunPlanReminderSwitch(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method
