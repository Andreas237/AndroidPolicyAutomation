.class Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V
    .locals 1

    .line 229
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 230
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$d;->c:Ljava/lang/ref/WeakReference;

    .line 231
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 235
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$d;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    .line 239
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 240
    :cond_0
    return-void

    .line 243
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x35

    if-ne v0, v1, :cond_3

    .line 244
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 245
    const/4 v4, 0x0

    .line 246
    if-eqz v3, :cond_3

    .line 247
    const-string v0, "bundleKeyAlbumList"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 248
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 249
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->a(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Z)V

    .line 250
    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->b(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Z)V

    .line 251
    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->c(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V

    .line 252
    invoke-static {v2, v4}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->b(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Ljava/util/ArrayList;)V

    .line 253
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->e(Lcom/huawei/health/sns/model/chat/Album;)V

    goto :goto_0

    .line 255
    :cond_2
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->a(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Z)V

    .line 256
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->b(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Z)V

    .line 257
    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->b(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V

    .line 261
    :cond_3
    :goto_0
    return-void
.end method
