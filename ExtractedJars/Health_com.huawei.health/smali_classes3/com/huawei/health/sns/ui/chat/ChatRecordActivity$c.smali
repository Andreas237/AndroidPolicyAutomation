.class Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)V
    .locals 1

    .line 116
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 117
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$c;->c:Ljava/lang/ref/WeakReference;

    .line 118
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 123
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 124
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    .line 125
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 127
    :cond_0
    return-void

    .line 129
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 131
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 132
    if-eqz v3, :cond_2

    .line 134
    const-string v0, "bundleKeyRecordMessageList"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 135
    if-eqz v4, :cond_2

    .line 137
    invoke-static {v2, v4}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->d(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;Ljava/util/ArrayList;)V

    .line 140
    :cond_2
    goto :goto_0

    .line 141
    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 143
    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 144
    if-eqz v3, :cond_4

    .line 146
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 147
    invoke-virtual {v2, v4}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 150
    :cond_4
    :goto_0
    return-void
.end method
