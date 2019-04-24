.class final Lo/awm$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awm;->c(Landroid/app/Activity;Lo/bfh;Lo/awm$d;Ljava/lang/String;)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bio;

.field final synthetic b:Lo/bfh;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Landroid/app/Activity;

.field final synthetic e:Lo/awm$d;


# direct methods
.method constructor <init>(Lo/bio;Lo/awm$d;Lo/bfh;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 0

    .line 445
    iput-object p1, p0, Lo/awm$3;->a:Lo/bio;

    iput-object p2, p0, Lo/awm$3;->e:Lo/awm$d;

    iput-object p3, p0, Lo/awm$3;->b:Lo/bfh;

    iput-object p4, p0, Lo/awm$3;->c:Ljava/lang/String;

    iput-object p5, p0, Lo/awm$3;->d:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 450
    new-instance v3, Lo/aos;

    invoke-direct {v3}, Lo/aos;-><init>()V

    .line 451
    invoke-virtual {v3}, Lo/aos;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 453
    iget-object v0, p0, Lo/awm$3;->a:Lo/bio;

    if-eqz v0, :cond_2

    .line 455
    iget-object v0, p0, Lo/awm$3;->a:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    goto :goto_0

    .line 461
    :cond_0
    iget-object v0, p0, Lo/awm$3;->e:Lo/awm$d;

    iget-object v1, p0, Lo/awm$3;->b:Lo/bfh;

    iget-object v2, p0, Lo/awm$3;->c:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lo/awm$d;->d(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/AddFriendRequest;

    move-result-object v4

    .line 462
    if-nez v4, :cond_1

    .line 464
    return-void

    .line 466
    :cond_1
    invoke-static {}, Lo/awm;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "addFriendRequest"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 467
    iget-object v0, p0, Lo/awm$3;->d:Landroid/app/Activity;

    iget-object v1, p0, Lo/awm$3;->e:Lo/awm$d;

    iget-object v2, p0, Lo/awm$3;->a:Lo/bio;

    invoke-static {v0, v1, v2}, Lo/awm;->a(Landroid/content/Context;Lo/awm$d;Lo/bio;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->c(Lcom/huawei/health/sns/server/SNSRequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;

    .line 470
    :cond_2
    :goto_0
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 475
    iget-object v0, p0, Lo/awm$3;->a:Lo/bio;

    if-eqz v0, :cond_0

    .line 477
    iget-object v0, p0, Lo/awm$3;->a:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 479
    :cond_0
    iget-object v0, p0, Lo/awm$3;->d:Landroid/app/Activity;

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 480
    return-void
.end method
