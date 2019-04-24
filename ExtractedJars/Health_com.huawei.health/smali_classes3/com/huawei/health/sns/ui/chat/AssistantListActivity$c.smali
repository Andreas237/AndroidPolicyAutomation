.class Lcom/huawei/health/sns/ui/chat/AssistantListActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/AssistantListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/chat/AssistantListActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantListActivity;)V
    .locals 1

    .line 222
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 223
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$c;->d:Ljava/lang/ref/WeakReference;

    .line 224
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 229
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 230
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$c;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;

    .line 231
    if-nez v1, :cond_0

    .line 233
    return-void

    .line 235
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 240
    :sswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 241
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 242
    if-eqz v2, :cond_1

    .line 244
    const-string v0, "assistant_list"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 246
    :cond_1
    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->b(Lcom/huawei/health/sns/ui/chat/AssistantListActivity;)Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;->d(Ljava/util/ArrayList;)V

    .line 247
    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->b(Lcom/huawei/health/sns/ui/chat/AssistantListActivity;)Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;->notifyDataSetChanged()V

    .line 248
    goto :goto_0

    .line 253
    :sswitch_1
    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->e(Lcom/huawei/health/sns/ui/chat/AssistantListActivity;)V

    .line 254
    .line 259
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x15 -> :sswitch_1
    .end sparse-switch
.end method
