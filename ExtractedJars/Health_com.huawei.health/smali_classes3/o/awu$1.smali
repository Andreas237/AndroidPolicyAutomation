.class final Lo/awu$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awu;->c(Landroid/os/Handler;Ljava/lang/String;I)Lo/brd;
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
.field final synthetic b:I

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Landroid/os/Handler;


# direct methods
.method constructor <init>(Ljava/lang/String;ILandroid/os/Handler;)V
    .locals 0

    .line 238
    iput-object p1, p0, Lo/awu$1;->d:Ljava/lang/String;

    iput p2, p0, Lo/awu$1;->b:I

    iput-object p3, p0, Lo/awu$1;->e:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 238
    invoke-virtual {p0, p1}, Lo/awu$1;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 243
    new-instance v1, Lcom/huawei/health/sns/server/user/FindUserRequest;

    invoke-direct {v1}, Lcom/huawei/health/sns/server/user/FindUserRequest;-><init>()V

    .line 244
    iget-object v2, p0, Lo/awu$1;->d:Ljava/lang/String;

    .line 245
    iget v3, p0, Lo/awu$1;->b:I

    .line 248
    const/4 v5, 0x0

    .line 249
    iget-object v0, p0, Lo/awu$1;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/bqz;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 251
    const/4 v4, 0x0

    .line 252
    iget-object v0, p0, Lo/awu$1;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/boh;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 256
    :cond_0
    const/4 v4, 0x1

    .line 258
    :goto_0
    invoke-virtual {v1, v3, v2, v4}, Lcom/huawei/health/sns/server/user/FindUserRequest;->setData(ILjava/lang/String;I)V

    .line 259
    invoke-static {v1}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 261
    iget-object v0, p0, Lo/awu$1;->e:Landroid/os/Handler;

    invoke-static {v5, v0}, Lo/awu;->a(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Landroid/os/Handler;)V

    .line 262
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
