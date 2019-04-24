.class public Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;
.source "SourceFile"


# instance fields
.field public session_expire_:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/AssistResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    const-string v0, "LoginAssistantServerResponse se:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    iget v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerResponse;->session_expire_:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
