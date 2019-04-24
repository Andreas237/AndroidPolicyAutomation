.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;)V
    .locals 1

    .line 99
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 100
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$c;->d:Ljava/lang/ref/WeakReference;

    .line 101
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 105
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 106
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$c;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;

    .line 107
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 108
    :cond_0
    return-void

    .line 110
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 112
    :sswitch_0
    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->c(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;)V

    .line 113
    .line 117
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3e9 -> :sswitch_0
    .end sparse-switch
.end method
