.class Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)V
    .locals 1

    .line 349
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 350
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$c;->e:Ljava/lang/ref/WeakReference;

    .line 351
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 356
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 357
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    .line 358
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 360
    :cond_0
    return-void

    .line 362
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 366
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/ArrayList;

    .line 367
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 369
    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->e(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)V

    .line 370
    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->a(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->a(Ljava/util/ArrayList;)V

    .line 371
    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->a(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->notifyDataSetChanged()V

    goto :goto_0

    .line 375
    :cond_2
    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->a(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->c()V

    .line 376
    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->a(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->notifyDataSetChanged()V

    .line 377
    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->c(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)V

    .line 379
    goto :goto_0

    .line 383
    :pswitch_1
    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->a(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->c()V

    .line 384
    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->k(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)V

    .line 385
    goto :goto_0

    .line 389
    :pswitch_2
    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->a(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->notifyDataSetChanged()V

    .line 390
    .line 395
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
