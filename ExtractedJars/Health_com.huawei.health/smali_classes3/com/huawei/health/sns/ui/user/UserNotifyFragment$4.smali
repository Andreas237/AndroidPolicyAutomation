.class Lcom/huawei/health/sns/ui/user/UserNotifyFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/user/UserNotifyFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)V
    .locals 0

    .line 431
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$4;->d:Lcom/huawei/health/sns/ui/user/UserNotifyFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 435
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$4;->d:Lcom/huawei/health/sns/ui/user/UserNotifyFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$4;->d:Lcom/huawei/health/sns/ui/user/UserNotifyFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 438
    invoke-static {}, Lo/aob;->a()V

    .line 440
    :cond_0
    return-void
.end method
