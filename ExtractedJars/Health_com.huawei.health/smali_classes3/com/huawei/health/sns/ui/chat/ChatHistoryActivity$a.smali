.class Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;)V
    .locals 1

    .line 141
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 142
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$a;->a:Ljava/lang/ref/WeakReference;

    .line 143
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 148
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 149
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;

    .line 150
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    :cond_0
    return-void

    .line 154
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 158
    :pswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 159
    if-eqz v2, :cond_3

    .line 161
    const-string v0, "bundleKeyRecordMessageList"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 162
    if-eqz v3, :cond_2

    .line 164
    invoke-static {v1, v3}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->d(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;Ljava/util/ArrayList;)V

    .line 166
    :cond_2
    goto :goto_0

    .line 171
    :pswitch_1
    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 172
    if-eqz v2, :cond_3

    .line 174
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 175
    invoke-static {v1, v3}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->c(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;Ljava/lang/String;)V

    .line 176
    goto :goto_0

    .line 181
    :pswitch_2
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 182
    if-eqz v2, :cond_3

    .line 184
    const-string v0, "bundleKeyRecordInviteList"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 185
    if-eqz v3, :cond_3

    .line 187
    invoke-static {v1, v3}, Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;->d(Lcom/huawei/health/sns/ui/chat/ChatHistoryActivity;Ljava/util/ArrayList;)V

    .line 189
    .line 195
    :cond_3
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
