.class Lcom/huawei/health/sns/ui/user/AssistantSearchFragment$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)V
    .locals 1

    .line 159
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 160
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment$e;->b:Ljava/lang/ref/WeakReference;

    .line 161
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 166
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 167
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment$e;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;

    .line 168
    if-nez v2, :cond_0

    .line 170
    return-void

    .line 174
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    .line 175
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 177
    :cond_1
    return-void

    .line 179
    :cond_2
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->b(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)V

    .line 180
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->d(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)V

    .line 181
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 185
    :sswitch_0
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->e(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)V

    .line 186
    goto :goto_0

    .line 191
    :sswitch_1
    invoke-static {v2, p1}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->b(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;Landroid/os/Message;)V

    .line 192
    goto :goto_0

    .line 196
    :sswitch_2
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->a(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)V

    .line 197
    goto :goto_0

    .line 202
    :sswitch_3
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->d(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;II)V

    .line 203
    goto :goto_0

    .line 207
    :sswitch_4
    invoke-static {v2, p1}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->e(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;Landroid/os/Message;)V

    .line 208
    .line 213
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x300 -> :sswitch_4
        0x302 -> :sswitch_0
        0x303 -> :sswitch_3
        0x304 -> :sswitch_3
        0x3eb -> :sswitch_2
        0x2711 -> :sswitch_1
        0x2712 -> :sswitch_1
    .end sparse-switch
.end method
