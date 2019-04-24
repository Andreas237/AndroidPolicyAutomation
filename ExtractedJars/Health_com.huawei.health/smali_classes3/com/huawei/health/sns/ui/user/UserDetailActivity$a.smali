.class Lcom/huawei/health/sns/ui/user/UserDetailActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/user/UserDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/user/UserDetailActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/user/UserDetailActivity;)V
    .locals 1

    .line 254
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 255
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity$a;->a:Ljava/lang/ref/WeakReference;

    .line 256
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 261
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 262
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailActivity$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    .line 263
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 265
    :cond_0
    return-void

    .line 268
    :cond_1
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->d(Lcom/huawei/health/sns/ui/user/UserDetailActivity;Landroid/os/Message;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 271
    return-void

    .line 274
    :cond_2
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->b(Lcom/huawei/health/sns/ui/user/UserDetailActivity;Landroid/os/Message;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 277
    return-void

    .line 280
    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 284
    :sswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 285
    invoke-static {v1, v2}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->a(Lcom/huawei/health/sns/ui/user/UserDetailActivity;Landroid/os/Bundle;)V

    .line 286
    goto :goto_0

    .line 290
    :sswitch_1
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 291
    invoke-static {v1, v2}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->b(Lcom/huawei/health/sns/ui/user/UserDetailActivity;Landroid/os/Bundle;)V

    .line 292
    goto :goto_0

    .line 296
    :sswitch_2
    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->e(Lcom/huawei/health/sns/ui/user/UserDetailActivity;)V

    .line 297
    goto :goto_0

    .line 301
    :sswitch_3
    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->b(Lcom/huawei/health/sns/ui/user/UserDetailActivity;)V

    .line 302
    goto :goto_0

    .line 307
    :sswitch_4
    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->a(Lcom/huawei/health/sns/ui/user/UserDetailActivity;)V

    .line 308
    .line 313
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x24 -> :sswitch_2
        0x25 -> :sswitch_1
        0x26 -> :sswitch_0
        0xe4 -> :sswitch_3
        0x3e9 -> :sswitch_4
        0x1021 -> :sswitch_4
    .end sparse-switch
.end method
