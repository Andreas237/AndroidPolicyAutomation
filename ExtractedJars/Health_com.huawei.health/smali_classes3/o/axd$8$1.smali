.class Lo/axd$8$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axd$8;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/axd$8;


# direct methods
.method constructor <init>(Lo/axd$8;)V
    .locals 0

    .line 401
    iput-object p1, p0, Lo/axd$8$1;->a:Lo/axd$8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 401
    invoke-virtual {p0, p1}, Lo/axd$8$1;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 406
    iget-object v0, p0, Lo/axd$8$1;->a:Lo/axd$8;

    iget-object v0, v0, Lo/axd$8;->b:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 409
    new-instance v4, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsRequest;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsRequest;-><init>()V

    .line 410
    iget-object v0, p0, Lo/axd$8$1;->a:Lo/axd$8;

    iget-object v0, v0, Lo/axd$8;->b:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    iput-wide v0, v4, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsRequest;->frdUID_:J

    .line 411
    iget-object v0, p0, Lo/axd$8$1;->a:Lo/axd$8;

    iget-object v0, v0, Lo/axd$8;->c:Ljava/lang/String;

    iput-object v0, v4, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsRequest;->remarkName_:Ljava/lang/String;

    .line 412
    invoke-static {v4}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 413
    iget-object v0, p0, Lo/axd$8$1;->a:Lo/axd$8;

    iget-object v0, v0, Lo/axd$8;->e:Lo/axd;

    iget-object v1, p0, Lo/axd$8$1;->a:Lo/axd$8;

    iget v1, v1, Lo/axd$8;->a:I

    iget-object v2, p0, Lo/axd$8$1;->a:Lo/axd$8;

    iget-object v2, v2, Lo/axd$8;->b:Lcom/huawei/health/sns/model/user/User;

    iget-object v3, p0, Lo/axd$8$1;->a:Lo/axd$8;

    iget-object v3, v3, Lo/axd$8;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v5}, Lo/axd;->c(Lo/axd;ILcom/huawei/health/sns/model/user/User;Ljava/lang/String;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 414
    goto :goto_0

    .line 418
    :cond_0
    iget-object v0, p0, Lo/axd$8$1;->a:Lo/axd$8;

    iget-object v0, v0, Lo/axd$8;->b:Lcom/huawei/health/sns/model/user/User;

    iget-object v1, p0, Lo/axd$8$1;->a:Lo/axd$8;

    iget-object v1, v1, Lo/axd$8;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/user/User;->setRemarkName(Ljava/lang/String;)V

    .line 419
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-object v1, p0, Lo/axd$8$1;->a:Lo/axd$8;

    iget-object v1, v1, Lo/axd$8;->b:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0, v1}, Lo/axa;->c(Lcom/huawei/health/sns/model/user/User;)Z

    .line 421
    iget-object v0, p0, Lo/axd$8$1;->a:Lo/axd$8;

    iget-object v0, v0, Lo/axd$8;->e:Lo/axd;

    iget-object v0, v0, Lo/axd;->d:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 423
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 424
    const-string v0, "keyBundleUserID"

    iget-object v1, p0, Lo/axd$8$1;->a:Lo/axd$8;

    iget-object v1, v1, Lo/axd$8;->b:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 425
    const-string v0, "keyBundleremarkName"

    iget-object v1, p0, Lo/axd$8$1;->a:Lo/axd$8;

    iget-object v1, v1, Lo/axd$8;->c:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    iget-object v0, p0, Lo/axd$8$1;->a:Lo/axd$8;

    iget-object v0, v0, Lo/axd$8;->e:Lo/axd;

    iget-object v0, v0, Lo/axd;->d:Landroid/os/Handler;

    iget-object v1, p0, Lo/axd$8$1;->a:Lo/axd$8;

    iget v1, v1, Lo/axd$8;->a:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 427
    invoke-virtual {v5, v4}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 428
    iget-object v0, p0, Lo/axd$8$1;->a:Lo/axd$8;

    iget-object v0, v0, Lo/axd$8;->e:Lo/axd;

    iget-object v0, v0, Lo/axd;->d:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 432
    :cond_1
    :goto_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
