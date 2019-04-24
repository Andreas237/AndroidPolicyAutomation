.class public Lcom/huawei/hwdevicedfxmanager/upload/EventLogUploadTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final TAG:Ljava/lang/String; = "EventLogUploadTask"


# instance fields
.field private mLogUpload:Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;


# direct methods
.method public constructor <init>(Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventLogUploadTask;->mLogUpload:Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;

    .line 17
    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 20
    const-string v0, "EventLogUploadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e0a\u4f20\u4efb\u52a1\u5f00\u59cb"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventLogUploadTask;->mLogUpload:Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 22
    const-string v0, "EventLogUploadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mLogUpload"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    return-void

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventLogUploadTask;->mLogUpload:Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->getPath()Ljava/lang/String;

    move-result-object v4

    .line 26
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 27
    return-void

    .line 29
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "event.log"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 34
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventLogUploadTask;->mLogUpload:Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/upload/UploadRequest;->upLoadHttpsEventLog(Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;)V

    goto :goto_0

    .line 37
    :cond_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "uploadperiod_type"

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/xt;->a(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v5

    .line 38
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    .line 39
    const-string v0, "EventLogUploadTaskLogUpload Service  errorcode=="

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "last_time="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "=now_time="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v5

    if-eqz v0, :cond_3

    cmp-long v0, v5, v7

    if-lez v0, :cond_3

    .line 41
    const-string v0, "EventLogUploadTaskLogUpload Service  errorcode=="

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u65f6\u95f4\u672a\u5230 \u670d\u52a1\u5668\u8fd4\u56de \u5468\u671f \uff0c \u4e0d\u4e0a\u4f20errorcode"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    return-void

    .line 44
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventLogUploadTask;->mLogUpload:Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadRequest;->getErrorcodLogUrl(Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;)V

    .line 46
    :goto_0
    return-void
.end method
