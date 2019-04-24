.class public interface abstract Lcom/huawei/lcagent/client/ILogCollect;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/lcagent/client/ILogCollect$Stub;
    }
.end annotation


# virtual methods
.method public abstract allowUploadAlways(Z)I
.end method

.method public abstract allowUploadInMobileNetwork(Z)I
.end method

.method public abstract captureAllLog()Lcom/huawei/lcagent/client/LogMetricInfo;
.end method

.method public abstract captureLogMetric(I)Lcom/huawei/lcagent/client/LogMetricInfo;
.end method

.method public abstract clearLogMetric(J)V
.end method

.method public abstract configure(Ljava/lang/String;)I
.end method

.method public abstract configureAPlogs(I)I
.end method

.method public abstract configureBluetoothlogcat(ILjava/lang/String;)I
.end method

.method public abstract configureCoredump(I)I
.end method

.method public abstract configureGPS(I)I
.end method

.method public abstract configureLogcat(ILjava/lang/String;)I
.end method

.method public abstract configureModemlogcat(ILjava/lang/String;)I
.end method

.method public abstract configureUserType(I)I
.end method

.method public abstract configureWithPara(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract feedbackUploadResult(JI)I
.end method

.method public abstract forceUpload()I
.end method

.method public abstract getCompressInfo()Lcom/huawei/lcagent/client/CompressInfo;
.end method

.method public abstract getFirstErrorTime()J
.end method

.method public abstract getFirstErrorType()Ljava/lang/String;
.end method

.method public abstract getUserType()I
.end method

.method public abstract resetFirstErrorTime()I
.end method

.method public abstract setMetricCommonHeader(I[BI)I
.end method

.method public abstract setMetricStoargeHeader(I[BI)I
.end method

.method public abstract setMetricStoargeTail(I[BI)I
.end method

.method public abstract shouldSubmitMetric(II)Z
.end method

.method public abstract submitMetric(II[BI)I
.end method
