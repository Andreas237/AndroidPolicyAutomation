.class Lo/auf$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/auf;->b(Lo/aud;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/auf;

.field final synthetic e:Lo/aud;


# direct methods
.method constructor <init>(Lo/auf;Lo/aud;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lo/auf$4;->b:Lo/auf;

    iput-object p2, p0, Lo/auf$4;->e:Lo/aud;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public notifyResult(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 4

    .line 97
    if-eqz p2, :cond_2

    instance-of v0, p2, Lcom/huawei/health/sns/server/circle/LoginCircleResponse;

    if-eqz v0, :cond_2

    .line 99
    move-object v3, p2

    check-cast v3, Lcom/huawei/health/sns/server/circle/LoginCircleResponse;

    .line 101
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/circle/LoginCircleResponse;->getErrcode_()I

    move-result v0

    if-nez v0, :cond_0

    .line 103
    invoke-static {}, Lo/ayu;->e()Lo/ayu;

    move-result-object v0

    iget v1, v3, Lcom/huawei/health/sns/server/circle/LoginCircleResponse;->session_expire_:I

    invoke-virtual {v0, v1}, Lo/ayu;->c(I)V

    .line 104
    invoke-static {}, Lo/ayu;->e()Lo/ayu;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ayu;->a(Z)V

    .line 105
    iget-object v0, p0, Lo/auf$4;->e:Lo/aud;

    invoke-interface {v0}, Lo/aud;->a()V

    .line 106
    const-string v0, "CircleLoginRequest"

    const-string v1, "login circle server success"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 108
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/circle/LoginCircleResponse;->getErrcode_()I

    move-result v0

    const/16 v1, 0x3eb

    if-ne v0, v1, :cond_1

    .line 110
    const-string v0, "CircleLoginRequest"

    const-string v1, "login circle server st error."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    iget-object v0, p0, Lo/auf$4;->b:Lo/auf;

    iget-object v1, p0, Lo/auf$4;->e:Lo/aud;

    invoke-static {v0, v1}, Lo/aug;->d(Lo/aue;Lo/aud;)V

    goto :goto_0

    .line 116
    :cond_1
    const-string v0, "CircleLoginRequest"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "login circle server error errcode_:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/health/sns/server/circle/LoginCircleResponse;->getErrcode_()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " response.responseCode : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    iget-object v0, p0, Lo/auf$4;->e:Lo/aud;

    iget v1, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v3}, Lcom/huawei/health/sns/server/circle/LoginCircleResponse;->getErrcode_()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/aud;->e(II)V

    .line 121
    :cond_2
    :goto_0
    return-void
.end method
