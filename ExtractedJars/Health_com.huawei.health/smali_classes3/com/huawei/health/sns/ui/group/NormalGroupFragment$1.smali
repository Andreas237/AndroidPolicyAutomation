.class Lcom/huawei/health/sns/ui/group/NormalGroupFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->f()V
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
.field final synthetic a:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V
    .locals 0

    .line 602
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$1;->a:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 602
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$1;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 606
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$1;->a:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$1;->a:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->a(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lo/ath;->e(J)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->d(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;I)I

    .line 607
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$1;->a:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->k(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 609
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$1;->a:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->k(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 610
    const/16 v0, 0x156

    iput v0, v4, Landroid/os/Message;->what:I

    .line 611
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 612
    const-string v0, "groupMemberSize"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$1;->a:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->h(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 613
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 614
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$1;->a:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->k(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 616
    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
