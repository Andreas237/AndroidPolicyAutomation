.class public interface abstract Lcom/huawei/operation/adapter/PluginOperationAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eab;


# virtual methods
.method public abstract breatheControl(IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract calibrationControl(IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract canFinish(Landroid/app/Activity;)I
.end method

.method public abstract checkCalibration(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract checkConnected(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract checkCurrentUrlAuth(Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public abstract checkWhiteUrl(Ljava/lang/String;)Z
.end method

.method public abstract deleteSleepQuestionnaireResult(JLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract gameControl(IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract getAnnualInitalData()Ljava/lang/String;
.end method

.method public abstract getAnnualReport(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract getAuthType(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public abstract getHealthData(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract getHealthStat(Ljava/lang/String;Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract getInfo([Ljava/lang/String;)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end method

.method public abstract getJanusDeviceConnect()I
.end method

.method public abstract getMotionPathData(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract getPersonalPrivacySettingValue(I)Ljava/lang/String;
.end method

.method public abstract getRecordsByDateRange(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
        }
    .end annotation
.end method

.method public abstract getServiceIdByUrl(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract getSportData()Lcom/huawei/operation/adapter/SportData;
.end method

.method public abstract getSportData(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract getUserInfo(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract go2PersonalPrivacySettingsActivity()V
.end method

.method public abstract queryServiceNameByID(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract querySleepQuestionnaireResults(JLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract queryUrlList(Ljava/lang/String;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end method

.method public abstract queryWebViewConfig()Lcom/huawei/operation/beans/WebViewConfig;
.end method

.method public abstract relaxControl(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract resetCalibration(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract setAchieveEvent(Ljava/lang/String;Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation
.end method

.method public abstract share(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract showServiceTips(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract startAchieveAwardShare(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract startFitnessList()V
.end method

.method public abstract startFitnessPage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract startGPSTrackPage(Landroid/content/Context;ILjava/lang/String;F)V
.end method

.method public abstract startSocialDetailPage(Landroid/content/Context;J)V
.end method

.method public abstract stressAbort(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
.end method

.method public abstract stressControl(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract uploadSleepQuestionnaireResults(JLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract vmallAgrQuery(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method

.method public abstract vmallAgrSign(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end method
