.class public Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LoginSNSRsp"
.end annotation


# instance fields
.field private config_:Ljava/lang/String;

.field private digestKey_:Ljava/lang/String;

.field private frdListVersion_:Ljava/lang/String;

.field private grpListVersion_:Ljava/lang/String;

.field private isFirstLogin_:I

.field private sessionValidTime_:I

.field private userID_:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 35
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 45
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->userID_:J

    .line 47
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->digestKey_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getDigestKey_()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->digestKey_:Ljava/lang/String;

    .line 84
    return-object v0
.end method

.method public getFrdListVersion_()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->frdListVersion_:Ljava/lang/String;

    .line 54
    return-object v0
.end method

.method public getGrpLimit()I
    .locals 5

    .line 94
    const/4 v3, 0x0

    .line 96
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->config_:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 100
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->config_:Ljava/lang/String;

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 101
    const-string v0, "grpLimit"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move v3, v0

    .line 102
    const-string v0, "LoginFriendSeverResponse"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "grp limit is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    goto :goto_0

    .line 104
    :catch_0
    move-exception v4

    .line 106
    const-string v0, "LoginFriendSeverResponse"

    const-string v1, "parse sns login response config error,JSONException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    :cond_0
    :goto_0
    return v3
.end method

.method public getGrpListVersion_()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->grpListVersion_:Ljava/lang/String;

    .line 60
    return-object v0
.end method

.method public getIsFirstLogin_()I
    .locals 1

    .line 65
    iget v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->isFirstLogin_:I

    .line 66
    return v0
.end method

.method public getSessionValidTime_()I
    .locals 1

    .line 71
    iget v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->sessionValidTime_:I

    .line 72
    return v0
.end method

.method public getUserID_()J
    .locals 2

    .line 77
    iget-wide v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->userID_:J

    .line 78
    return-wide v0
.end method
