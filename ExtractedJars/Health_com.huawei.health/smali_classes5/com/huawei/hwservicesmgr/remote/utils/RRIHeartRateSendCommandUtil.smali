.class public Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final FEATURE_LENGTH:I = 0x30

.field private static final FEATURE_SIZE:I = 0xc

.field private static final TAG:Ljava/lang/String; = "RRIHeartRateSendCommandUtil"

.field private static mInstance:Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil; = null


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    return-void
.end method

.method public static getInstance()Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil;
    .locals 2

    .line 30
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil;->mInstance:Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 31
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil;

    invoke-direct {v0}, Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil;->mInstance:Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil;

    .line 33
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil;->mInstance:Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil;

    return-object v0
.end method


# virtual methods
.method public pushPressAutoMonitor(I)V
    .locals 6

    .line 47
    const/4 v0, 0x1

    if-eq v0, p1, :cond_0

    const/4 v0, 0x2

    if-eq v0, p1, :cond_0

    .line 48
    const-string v0, "RRIHeartRateSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pushPressAutoMonitor   has wrong params:----openOrClose is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";this param should be 1 or 2"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    return-void

    .line 52
    :cond_0
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 53
    const/16 v0, 0x20

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 54
    const/16 v0, 0x9

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 57
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 59
    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 60
    invoke-static {p1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 65
    invoke-static {}, Lo/dgx;->e()Lo/dgx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil$1;

    invoke-direct {v1, p0, v5, v4}, Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil$1;-><init>(Lcom/huawei/hwservicesmgr/remote/utils/RRIHeartRateSendCommandUtil;Ljava/lang/StringBuilder;Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    invoke-virtual {v0, v1}, Lo/dgx;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 112
    :cond_1
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 113
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 114
    const-string v0, "RRIHeartRateSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.32.9 send cmd : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 117
    :goto_0
    return-void
.end method
