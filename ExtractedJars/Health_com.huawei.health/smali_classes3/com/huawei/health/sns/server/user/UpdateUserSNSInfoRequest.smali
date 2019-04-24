.class public Lcom/huawei/health/sns/server/user/UpdateUserSNSInfoRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/updateUserSNSInfo"


# instance fields
.field public privacySetFlags_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 34
    const-string v0, "/updateUserSNSInfo"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserSNSInfoRequest;->method:Ljava/lang/String;

    .line 35
    const-string v0, "IFriend"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserSNSInfoRequest;->module:Ljava/lang/String;

    .line 36
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 41
    new-instance v0, Lcom/huawei/health/sns/server/user/UpdateUserSNSInfoResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/UpdateUserSNSInfoResponse;-><init>()V

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 47
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    const-string v0, "UpdateUserSNSInfoRequest f:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPrivacySetFlags_()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserSNSInfoRequest;->privacySetFlags_:Ljava/lang/String;

    return-object v0
.end method

.method public setPrivacySetFlags_(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/UpdateUserSNSInfoRequest;->privacySetFlags_:Ljava/lang/String;

    .line 24
    return-void
.end method
