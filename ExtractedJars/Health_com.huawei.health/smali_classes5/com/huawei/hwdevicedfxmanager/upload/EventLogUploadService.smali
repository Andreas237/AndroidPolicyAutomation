.class public Lcom/huawei/hwdevicedfxmanager/upload/EventLogUploadService;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "EventLogUploadService"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 18
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    .line 64
    const-string v0, "EventLogUploadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 66
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/AppContext;->getInstance()Lcom/huawei/hwdevicedfxmanager/utils/AppContext;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hwdevicedfxmanager/upload/EventLogUploadService;->getApplication()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/AppContext;->setApplication(Landroid/app/Application;)V

    .line 67
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 7

    .line 23
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 24
    const-string v0, "EventLogUploadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    const/4 v0, 0x2

    return v0

    .line 28
    :cond_0
    new-instance v4, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;

    invoke-direct {v4}, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;-><init>()V

    .line 29
    const-string v0, "appId"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->setAppId(Ljava/lang/String;)V

    .line 30
    const-string v0, "deviceId"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->setDeviceId(Ljava/lang/String;)V

    .line 31
    const-string v0, "iversion"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->setIversion(I)V

    .line 32
    const-string v0, "siteId"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->setSiteId(I)V

    .line 33
    const-string v0, "source"

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->setSource(I)V

    .line 34
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken()Ljava/lang/String;

    move-result-object v5

    .line 35
    invoke-virtual {v4, v5}, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->setToken(Ljava/lang/String;)V

    .line 36
    const-string v0, "tokenType"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->setTokenType(I)V

    .line 37
    const-string v0, "ts"

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->setTs(J)V

    .line 39
    new-instance v6, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;

    invoke-direct {v6}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;-><init>()V

    .line 40
    const-string v0, "x-huid"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->setHuid(Ljava/lang/String;)V

    .line 41
    const-string v0, "x-version"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->setVersion(Ljava/lang/String;)V

    .line 42
    const-string v0, "filePath"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->setPath(Ljava/lang/String;)V

    .line 43
    invoke-virtual {v6, v4}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->setInfo(Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;)V

    .line 46
    const-string v0, "countryCode"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->setCountryCode(Ljava/lang/String;)V

    .line 47
    const-string v0, "emuiVersion"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->setEmuiVersion(Ljava/lang/String;)V

    .line 48
    const-string v0, "model"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->setModel(Ljava/lang/String;)V

    .line 49
    const-string v0, "osVersion"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->setOsVersion(Ljava/lang/String;)V

    .line 50
    const-string v0, "romVersion"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->setRomVersion(Ljava/lang/String;)V

    .line 51
    const-string v0, "shaSN"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->setShaSN(Ljava/lang/String;)V

    .line 54
    const-string v0, "EventLogUploadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "evenLogUpload "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwdevicedfxmanager/upload/EventLogUploadTask;

    invoke-direct {v1, v6}, Lcom/huawei/hwdevicedfxmanager/upload/EventLogUploadTask;-><init>(Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 57
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method
