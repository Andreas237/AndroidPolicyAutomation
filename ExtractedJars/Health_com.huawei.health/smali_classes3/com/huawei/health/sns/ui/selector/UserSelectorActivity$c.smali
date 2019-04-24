.class Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)V
    .locals 1

    .line 184
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 185
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$c;->a:Ljava/lang/ref/WeakReference;

    .line 186
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 191
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 193
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    .line 194
    if-nez v1, :cond_0

    .line 196
    return-void

    .line 198
    :cond_0
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->e(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Landroid/os/Message;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 200
    return-void

    .line 202
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 206
    :sswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 207
    const/4 v3, 0x0

    .line 208
    if-eqz v2, :cond_2

    .line 210
    const-string v0, "bundleKeyFriendList"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 211
    invoke-static {v1, v3}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->e(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 217
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Ljava/lang/Object;)V

    .line 218
    goto :goto_0

    .line 222
    :sswitch_2
    invoke-static {v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->b(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)V

    .line 223
    iget v0, p1, Landroid/os/Message;->arg2:I

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;I)V

    .line 224
    goto :goto_0

    .line 228
    :sswitch_3
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->a(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Landroid/os/Message;)V

    .line 229
    goto :goto_0

    .line 233
    :sswitch_4
    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->finish()V

    .line 234
    goto :goto_0

    .line 238
    :sswitch_5
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->c(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Landroid/os/Message;)V

    .line 239
    .line 244
    :cond_2
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_5
        0xa1 -> :sswitch_3
        0xa2 -> :sswitch_2
        0xe4 -> :sswitch_4
        0x110 -> :sswitch_0
        0x111 -> :sswitch_1
    .end sparse-switch
.end method
