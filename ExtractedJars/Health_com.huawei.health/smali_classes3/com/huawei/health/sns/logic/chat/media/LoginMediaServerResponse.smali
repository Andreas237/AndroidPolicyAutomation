.class public Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
.source "SourceFile"


# instance fields
.field private errcode_:I

.field private errmsg_:Ljava/lang/String;

.field private session_expire_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;-><init>()V

    .line 10
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;->errcode_:I

    return-void
.end method


# virtual methods
.method public getErrCode()I
    .locals 1

    .line 50
    iget v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;->errcode_:I

    .line 51
    return v0
.end method

.method public getErrMsg()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;->errmsg_:Ljava/lang/String;

    .line 57
    return-object v0
.end method

.method public getErrmsg_()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;->errmsg_:Ljava/lang/String;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    const-string v0, "LoginMediaServerResponse session_expire:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    iget v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;->session_expire_:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    const-string v0, ", errcode:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    iget v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;->errcode_:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSessionExpire()I
    .locals 1

    .line 62
    iget v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;->session_expire_:I

    .line 63
    return v0
.end method

.method public getSession_expire_()I
    .locals 1

    .line 28
    iget v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;->session_expire_:I

    return v0
.end method

.method public setErrmsg_(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;->errmsg_:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public setSession_expire_(I)V
    .locals 0

    .line 32
    iput p1, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;->session_expire_:I

    .line 33
    return-void
.end method
