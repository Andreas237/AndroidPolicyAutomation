.class final Lcom/huawei/health/sns/ui/user/UserNotifyFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;Landroid/os/Handler;I)Lo/brc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Landroid/os/Handler;

.field final synthetic d:I

.field final synthetic e:Lcom/huawei/health/sns/ui/user/UserNotifyFragment;


# direct methods
.method constructor <init>(Landroid/os/Handler;Lcom/huawei/health/sns/ui/user/UserNotifyFragment;I)V
    .locals 0

    .line 587
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$1;->c:Landroid/os/Handler;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$1;->e:Lcom/huawei/health/sns/ui/user/UserNotifyFragment;

    iput p3, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$1;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;>;)V"
        }
    .end annotation

    .line 591
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$1;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v3

    .line 592
    const/16 v0, 0x251

    iput v0, v3, Landroid/os/Message;->what:I

    .line 593
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 594
    if-eqz v4, :cond_0

    .line 596
    const-string v0, "UserNotifyFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 598
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$1;->e:Lcom/huawei/health/sns/ui/user/UserNotifyFragment;

    invoke-static {v0, v4}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;Ljava/util/List;)V

    .line 599
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 600
    const-string v0, "keyUserNotifyList"

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 601
    const-string v0, "bundleQueryNotifyType"

    iget v1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$1;->d:I

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 602
    invoke-virtual {v3, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 604
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$1;->c:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 605
    return-void
.end method
