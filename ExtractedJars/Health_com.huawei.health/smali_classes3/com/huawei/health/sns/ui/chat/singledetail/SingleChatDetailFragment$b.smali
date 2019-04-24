.class Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V
    .locals 1

    .line 247
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 248
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment$b;->c:Ljava/lang/ref/WeakReference;

    .line 249
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 254
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 255
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment$b;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;

    .line 256
    if-nez v2, :cond_0

    .line 258
    return-void

    .line 260
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->e(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;I)Z

    move-result v3

    .line 261
    if-eqz v3, :cond_1

    .line 263
    return-void

    .line 265
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 269
    :sswitch_0
    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->b(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V

    .line 270
    goto :goto_0

    .line 274
    :sswitch_1
    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->d(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V

    .line 275
    goto :goto_0

    .line 279
    :sswitch_2
    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->c(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V

    .line 280
    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->b(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V

    .line 281
    goto :goto_0

    .line 285
    :sswitch_3
    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->d(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V

    .line 286
    goto :goto_0

    .line 290
    :sswitch_4
    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->c(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V

    .line 291
    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->b(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V

    .line 292
    const-string v0, "SingleChatDetailFragment"

    const-string v1, "UserFriendSettingsTask.USER_FLAG_SETTING_REQUEST_COMPLETED"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    goto :goto_0

    .line 297
    :sswitch_5
    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->c(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V

    .line 298
    goto :goto_0

    .line 302
    :sswitch_6
    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->c(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V

    .line 303
    const-string v0, "SingleChatDetailFragment"

    const-string v1, "UserFriendSettingsTask.USER_FLAG_SETTING_REQUEST_FAILED"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    goto :goto_0

    .line 308
    :sswitch_7
    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->c(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V

    .line 309
    goto :goto_0

    .line 313
    :sswitch_8
    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;->c(Lcom/huawei/health/sns/ui/chat/singledetail/SingleChatDetailFragment;)V

    .line 314
    .line 319
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x15 -> :sswitch_0
        0x66 -> :sswitch_1
        0x67 -> :sswitch_3
        0x68 -> :sswitch_2
        0x69 -> :sswitch_4
        0x6a -> :sswitch_5
        0x6b -> :sswitch_6
        0x6c -> :sswitch_7
        0x70 -> :sswitch_8
    .end sparse-switch
.end method
