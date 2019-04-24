.class public Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/loginSNS"


# instance fields
.field private appID_:Ljava/lang/String;

.field private appVersion_:Ljava/lang/String;

.field private channel_:Ljava/lang/String;

.field private deviceID_:Ljava/lang/String;

.field private deviceType_:I

.field private fromPkg_:Ljava/lang/String;

.field private phoneType_:Ljava/lang/String;

.field private pushToken_:Ljava/lang/String;

.field private romVersion_:Ljava/lang/String;

.field private serviceToken_:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 102
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 103
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->isSerial:Z

    .line 104
    const-string v0, "/loginSNS"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->method:Ljava/lang/String;

    .line 105
    const-string v0, "ISNS"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->module:Ljava/lang/String;

    .line 106
    iput p1, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->deviceType_:I

    .line 107
    iput-object p2, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->deviceID_:Ljava/lang/String;

    .line 108
    iput-object p3, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->serviceToken_:Ljava/lang/String;

    .line 109
    const-string v0, "com.huawei.health"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->appID_:Ljava/lang/String;

    .line 110
    const v0, 0x2aea541

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->channel_:Ljava/lang/String;

    .line 111
    iput-object p4, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->pushToken_:Ljava/lang/String;

    .line 113
    invoke-static {}, Lo/bar;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->phoneType_:Ljava/lang/String;

    .line 114
    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->romVersion_:Ljava/lang/String;

    .line 115
    invoke-static {}, Lo/brg;->d()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->appVersion_:Ljava/lang/String;

    .line 116
    iput-object p5, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->fromPkg_:Ljava/lang/String;

    .line 117
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 122
    new-instance v0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;-><init>()V

    return-object v0
.end method

.method public getAppID_()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->appID_:Ljava/lang/String;

    return-object v0
.end method

.method public getChannel_()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->channel_:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceID_()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->deviceID_:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceType_()I
    .locals 1

    .line 63
    iget v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->deviceType_:I

    return v0
.end method

.method public getFromPkg_()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->fromPkg_:Ljava/lang/String;

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 133
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    const-string v0, "LoginFriendSeverRequest av:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->appVersion_:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPhoneType_()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->phoneType_:Ljava/lang/String;

    return-object v0
.end method

.method public getPushToken()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->pushToken_:Ljava/lang/String;

    return-object v0
.end method

.method public getRomVersion_()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->romVersion_:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceToken_()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->serviceToken_:Ljava/lang/String;

    return-object v0
.end method

.method public setAppID_(Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->appID_:Ljava/lang/String;

    .line 84
    return-void
.end method

.method public setChannel_(Ljava/lang/String;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->channel_:Ljava/lang/String;

    .line 100
    return-void
.end method

.method public setDeviceID_(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->deviceID_:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public setDeviceType_(I)V
    .locals 0

    .line 67
    iput p1, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->deviceType_:I

    .line 68
    return-void
.end method

.method public setFromPkg_(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->fromPkg_:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public setPhoneType_(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->phoneType_:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public setRomVersion_(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->romVersion_:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public setServiceToken_(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverRequest;->serviceToken_:Ljava/lang/String;

    .line 92
    return-void
.end method
