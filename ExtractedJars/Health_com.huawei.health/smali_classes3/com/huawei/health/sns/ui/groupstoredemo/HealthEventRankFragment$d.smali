.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;)V
    .locals 1

    .line 136
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 137
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$d;->d:Ljava/lang/ref/WeakReference;

    .line 138
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 142
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment$d;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;

    .line 144
    if-nez v1, :cond_0

    .line 145
    return-void

    .line 148
    :cond_0
    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 149
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 150
    :cond_1
    return-void

    .line 153
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 155
    :pswitch_0
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;Landroid/os/Message;)V

    .line 156
    goto :goto_0

    .line 159
    :pswitch_1
    goto :goto_0

    .line 162
    :pswitch_2
    goto :goto_0

    .line 164
    :pswitch_3
    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;)V

    .line 165
    goto :goto_0

    .line 167
    :pswitch_4
    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventRankFragment;)V

    .line 168
    .line 173
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x59
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_4
    .end packed-switch
.end method
