.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)V
    .locals 1

    .line 70
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 71
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$b;->a:Ljava/lang/ref/WeakReference;

    .line 72
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 76
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 77
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$b;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;

    .line 78
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    :cond_0
    return-void

    .line 81
    :cond_1
    return-void
.end method
