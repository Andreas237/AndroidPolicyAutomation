.class Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;)V
    .locals 1

    .line 92
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 93
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$c;->b:Ljava/lang/ref/WeakReference;

    .line 94
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 99
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$c;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;

    .line 102
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 104
    :cond_0
    return-void

    .line 107
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2710

    if-ne v0, v1, :cond_2

    .line 109
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 110
    invoke-static {v2, v3}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->e(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 111
    goto :goto_0

    .line 112
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 114
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 115
    const/4 v4, 0x0

    .line 116
    if-eqz v3, :cond_3

    .line 118
    const-string v0, "picMessageList"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 119
    const-string v0, "index"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 120
    if-eqz v4, :cond_3

    .line 122
    invoke-static {v2, v4, v5}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->a(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;Ljava/util/ArrayList;I)V

    .line 126
    :cond_3
    :goto_0
    return-void
.end method
