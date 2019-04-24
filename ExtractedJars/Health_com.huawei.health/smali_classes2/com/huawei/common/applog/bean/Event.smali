.class public Lcom/huawei/common/applog/bean/Event;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private appPackageName:Ljava/lang/String;

.field private appVersionName:Ljava/lang/String;

.field private clientErrorCode:Ljava/lang/String;

.field private connTime:Ljava/lang/String;

.field private dnsTime:Ljava/lang/String;

.field private domain:Ljava/lang/String;

.field private errorReason:Ljava/lang/String;

.field private extraData:Lcom/huawei/common/applog/bean/ExtraBundle;

.field private operationType:Ljava/lang/String;

.field private preTranTime:Ljava/lang/String;

.field private resourcePath:Ljava/lang/String;

.field private returnCode:Ljava/lang/String;

.field private serverIp:Ljava/lang/String;

.field private sizeDownload:Ljava/lang/String;

.field private sizeUpload:Ljava/lang/String;

.field private startTranTime:Ljava/lang/String;

.field private totalTime:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppPackageName()Ljava/lang/String;
    .locals 1

    .line 175
    iget-object v0, p0, Lcom/huawei/common/applog/bean/Event;->appPackageName:Ljava/lang/String;

    return-object v0
.end method

.method public getAppVersionName()Ljava/lang/String;
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/huawei/common/applog/bean/Event;->appVersionName:Ljava/lang/String;

    return-object v0
.end method

.method public getClientErrorCode()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/common/applog/bean/Event;->clientErrorCode:Ljava/lang/String;

    return-object v0
.end method

.method public getConnTime()Ljava/lang/String;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/huawei/common/applog/bean/Event;->connTime:Ljava/lang/String;

    return-object v0
.end method

.method public getDnsTime()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/huawei/common/applog/bean/Event;->dnsTime:Ljava/lang/String;

    return-object v0
.end method

.method public getDomain()Ljava/lang/String;
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/huawei/common/applog/bean/Event;->domain:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorReason()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/common/applog/bean/Event;->errorReason:Ljava/lang/String;

    return-object v0
.end method

.method public getExtraData()Lcom/huawei/common/applog/bean/ExtraBundle;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/common/applog/bean/Event;->extraData:Lcom/huawei/common/applog/bean/ExtraBundle;

    return-object v0
.end method

.method public getOperationType()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/common/applog/bean/Event;->operationType:Ljava/lang/String;

    return-object v0
.end method

.method public getPreTranTime()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/huawei/common/applog/bean/Event;->preTranTime:Ljava/lang/String;

    return-object v0
.end method

.method public getResourcePath()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/common/applog/bean/Event;->resourcePath:Ljava/lang/String;

    return-object v0
.end method

.method public getReturnCode()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/common/applog/bean/Event;->returnCode:Ljava/lang/String;

    return-object v0
.end method

.method public getServerIp()Ljava/lang/String;
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/huawei/common/applog/bean/Event;->serverIp:Ljava/lang/String;

    return-object v0
.end method

.method public getSizeDownload()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/common/applog/bean/Event;->sizeDownload:Ljava/lang/String;

    return-object v0
.end method

.method public getSizeUpload()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/huawei/common/applog/bean/Event;->sizeUpload:Ljava/lang/String;

    return-object v0
.end method

.method public getStartTranTime()Ljava/lang/String;
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/huawei/common/applog/bean/Event;->startTranTime:Ljava/lang/String;

    return-object v0
.end method

.method public getTotalTime()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/huawei/common/applog/bean/Event;->totalTime:Ljava/lang/String;

    return-object v0
.end method

.method public setAppPackageName(Ljava/lang/String;)V
    .locals 0

    .line 179
    iput-object p1, p0, Lcom/huawei/common/applog/bean/Event;->appPackageName:Ljava/lang/String;

    .line 180
    return-void
.end method

.method public setAppVersionName(Ljava/lang/String;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lcom/huawei/common/applog/bean/Event;->appVersionName:Ljava/lang/String;

    .line 188
    return-void
.end method

.method public setClientErrorCode(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/common/applog/bean/Event;->clientErrorCode:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public setConnTime(Ljava/lang/String;)V
    .locals 0

    .line 139
    iput-object p1, p0, Lcom/huawei/common/applog/bean/Event;->connTime:Ljava/lang/String;

    .line 140
    return-void
.end method

.method public setDnsTime(Ljava/lang/String;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lcom/huawei/common/applog/bean/Event;->dnsTime:Ljava/lang/String;

    .line 148
    return-void
.end method

.method public setDomain(Ljava/lang/String;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lcom/huawei/common/applog/bean/Event;->domain:Ljava/lang/String;

    .line 164
    return-void
.end method

.method public setErrorReason(Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/huawei/common/applog/bean/Event;->errorReason:Ljava/lang/String;

    .line 84
    return-void
.end method

.method public setExtraData(Lcom/huawei/common/applog/bean/ExtraBundle;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/common/applog/bean/Event;->extraData:Lcom/huawei/common/applog/bean/ExtraBundle;

    .line 52
    return-void
.end method

.method public setOperationType(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/common/applog/bean/Event;->operationType:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public setPreTranTime(Ljava/lang/String;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/huawei/common/applog/bean/Event;->preTranTime:Ljava/lang/String;

    .line 132
    return-void
.end method

.method public setResourcePath(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/common/applog/bean/Event;->resourcePath:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public setReturnCode(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/common/applog/bean/Event;->returnCode:Ljava/lang/String;

    .line 92
    return-void
.end method

.method public setServerIp(Ljava/lang/String;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lcom/huawei/common/applog/bean/Event;->serverIp:Ljava/lang/String;

    .line 156
    return-void
.end method

.method public setSizeDownload(Ljava/lang/String;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lcom/huawei/common/applog/bean/Event;->sizeDownload:Ljava/lang/String;

    .line 108
    return-void
.end method

.method public setSizeUpload(Ljava/lang/String;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/huawei/common/applog/bean/Event;->sizeUpload:Ljava/lang/String;

    .line 100
    return-void
.end method

.method public setStartTranTime(Ljava/lang/String;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lcom/huawei/common/applog/bean/Event;->startTranTime:Ljava/lang/String;

    .line 124
    return-void
.end method

.method public setTotalTime(Ljava/lang/String;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lcom/huawei/common/applog/bean/Event;->totalTime:Ljava/lang/String;

    .line 116
    return-void
.end method
