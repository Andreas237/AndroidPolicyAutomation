.class Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)V
    .locals 1

    .line 152
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 153
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$a;->c:Ljava/lang/ref/WeakReference;

    .line 154
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 158
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 159
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;

    .line 160
    if-nez v1, :cond_0

    .line 161
    return-void

    .line 164
    :cond_0
    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 165
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 166
    :cond_1
    return-void

    .line 169
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 171
    :pswitch_0
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->c(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;Landroid/os/Message;)V

    .line 172
    goto :goto_0

    .line 174
    :pswitch_1
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->e(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)V

    .line 175
    goto :goto_0

    .line 177
    :pswitch_2
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->a(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)V

    .line 178
    goto :goto_0

    .line 180
    :pswitch_3
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->d(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;Landroid/os/Message;)V

    .line 181
    goto :goto_0

    .line 183
    :pswitch_4
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;->b(Lcom/huawei/health/sns/ui/group/HealthEventRankFragment;)V

    .line 184
    .line 189
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
