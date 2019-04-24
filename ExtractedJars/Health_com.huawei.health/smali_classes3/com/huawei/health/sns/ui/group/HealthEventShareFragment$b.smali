.class Lcom/huawei/health/sns/ui/group/HealthEventShareFragment$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;)V
    .locals 1

    .line 101
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 102
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment$b;->e:Ljava/lang/ref/WeakReference;

    .line 103
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 107
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 108
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment$b;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;

    .line 109
    if-nez v1, :cond_0

    .line 110
    return-void

    .line 113
    :cond_0
    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 114
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 115
    :cond_1
    return-void

    .line 118
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 120
    :sswitch_0
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->c(Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;)V

    .line 121
    .line 126
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
    .end sparse-switch
.end method
