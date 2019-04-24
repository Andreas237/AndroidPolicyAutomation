.class Lcom/huawei/health/sns/ui/chat/ChatActivity$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/ChatActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/chat/ChatActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;)V
    .locals 1

    .line 237
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 238
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$e;->b:Ljava/lang/ref/WeakReference;

    .line 239
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 244
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 246
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$e;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/chat/ChatActivity;

    .line 247
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 249
    :cond_0
    return-void

    .line 251
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 255
    :sswitch_0
    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->b(Lcom/huawei/health/sns/ui/chat/ChatActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_2

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/health/sns/model/chat/MessageItem;

    if-eqz v0, :cond_2

    .line 257
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    goto :goto_0

    .line 263
    :sswitch_1
    invoke-static {v2, p1}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->d(Lcom/huawei/health/sns/ui/chat/ChatActivity;Landroid/os/Message;)V

    .line 264
    goto :goto_0

    .line 268
    :sswitch_2
    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 269
    if-eqz v3, :cond_2

    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->b(Lcom/huawei/health/sns/ui/chat/ChatActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 271
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->d(ILjava/lang/Object;)V

    goto :goto_0

    .line 277
    :sswitch_3
    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->D()V

    .line 278
    .line 283
    :cond_2
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x16 -> :sswitch_1
        0x17 -> :sswitch_0
        0x7e7 -> :sswitch_3
        0x7e9 -> :sswitch_2
    .end sparse-switch
.end method
