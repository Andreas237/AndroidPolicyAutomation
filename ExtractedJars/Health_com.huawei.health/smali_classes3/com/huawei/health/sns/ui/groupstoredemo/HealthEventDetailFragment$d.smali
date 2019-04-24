.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)V
    .locals 1

    .line 132
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 133
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment$d;->b:Ljava/lang/ref/WeakReference;

    .line 134
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 138
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment$d;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

    .line 140
    if-nez v1, :cond_0

    .line 141
    return-void

    .line 144
    :cond_0
    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 145
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 146
    :cond_1
    return-void

    .line 149
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 151
    :sswitch_0
    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)V

    .line 152
    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)V

    .line 153
    goto :goto_0

    .line 155
    :sswitch_1
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;Landroid/os/Message;)V

    .line 156
    .line 161
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3e9 -> :sswitch_0
        0x3eb -> :sswitch_1
    .end sparse-switch
.end method
