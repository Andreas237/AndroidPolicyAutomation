.class final Lcom/huawei/health/sns/ui/user/FriendListFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/FriendListFragment;->a(Landroid/os/Handler;)Lo/brc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/lang/Integer;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Landroid/os/Handler;


# direct methods
.method constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 485
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment$3;->c:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 489
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment$3;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 490
    const/4 v0, 0x1

    iput v0, v1, Landroid/os/Message;->what:I

    .line 491
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Integer;

    .line 492
    if-eqz v2, :cond_0

    .line 494
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 495
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment$3;->c:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 497
    :cond_0
    return-void
.end method
