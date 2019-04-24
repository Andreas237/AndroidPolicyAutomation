.class public Lcom/huawei/health/sns/server/circle/LoginCircleResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/CircleResponseBean;
.source "SourceFile"


# instance fields
.field public session_expire_:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/CircleResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    invoke-super {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/CircleResponseBean;->getRespLog()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    const-string v0, ", LoginCircleResponse, se:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    iget v0, p0, Lcom/huawei/health/sns/server/circle/LoginCircleResponse;->session_expire_:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
