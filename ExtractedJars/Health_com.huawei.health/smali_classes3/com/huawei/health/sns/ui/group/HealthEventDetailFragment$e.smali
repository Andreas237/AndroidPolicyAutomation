.class Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)V
    .locals 1

    .line 151
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 152
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$e;->e:Ljava/lang/ref/WeakReference;

    .line 153
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 157
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 158
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment$e;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;

    .line 159
    if-nez v1, :cond_0

    .line 160
    return-void

    .line 163
    :cond_0
    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 164
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 165
    :cond_1
    return-void

    .line 168
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 170
    :sswitch_0
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->e(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)V

    .line 171
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->b(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;)V

    .line 172
    goto :goto_0

    .line 174
    :sswitch_1
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;->d(Lcom/huawei/health/sns/ui/group/HealthEventDetailFragment;Landroid/os/Message;)V

    .line 175
    .line 180
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3e9 -> :sswitch_0
        0x3eb -> :sswitch_1
    .end sparse-switch
.end method
