.class final Lo/aru$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aru;->b(Lo/aru;Lcom/huawei/health/sns/model/user/User;ILandroid/os/Handler;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/model/user/User;

.field final synthetic b:Landroid/os/Handler;

.field final synthetic c:I

.field final synthetic d:Lo/aru;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/model/user/User;Lo/aru;ILandroid/os/Handler;)V
    .locals 0

    .line 212
    iput-object p1, p0, Lo/aru$2;->a:Lcom/huawei/health/sns/model/user/User;

    iput-object p2, p0, Lo/aru$2;->d:Lo/aru;

    iput p3, p0, Lo/aru$2;->c:I

    iput-object p4, p0, Lo/aru$2;->b:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 212
    invoke-virtual {p0, p1}, Lo/aru$2;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 10

    .line 216
    iget-object v0, p0, Lo/aru$2;->a:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v6

    .line 217
    new-instance v8, Lcom/huawei/health/sns/server/circle/GetCircleRequest;

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-direct {v8, v6, v7, v0, v1}, Lcom/huawei/health/sns/server/circle/GetCircleRequest;-><init>(JJ)V

    .line 218
    invoke-static {v8}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->a(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v9

    .line 219
    iget v0, v9, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_0

    .line 221
    iget-object v0, p0, Lo/aru$2;->d:Lo/aru;

    iget v1, p0, Lo/aru$2;->c:I

    iget-object v2, p0, Lo/aru$2;->b:Landroid/os/Handler;

    move-wide v3, v6

    move-object v5, v9

    invoke-static/range {v0 .. v5}, Lo/aru;->e(Lo/aru;ILandroid/os/Handler;JLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    goto :goto_0

    .line 225
    :cond_0
    invoke-static {}, Lo/aru;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get dynamic sumamry error! responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v9, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    iget-object v0, p0, Lo/aru$2;->b:Landroid/os/Handler;

    iget-object v1, p0, Lo/aru$2;->b:Landroid/os/Handler;

    iget v2, v9, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v3, 0xaaa

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v2, v4}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 229
    :goto_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
