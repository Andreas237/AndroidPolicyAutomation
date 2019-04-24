.class Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)V
    .locals 1

    .line 222
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 223
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$b;->d:Ljava/lang/ref/WeakReference;

    .line 224
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 228
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 229
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$b;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    .line 232
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 233
    :cond_0
    return-void

    .line 236
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x35

    if-ne v0, v1, :cond_3

    .line 237
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 238
    const/4 v4, 0x0

    .line 239
    if-eqz v3, :cond_3

    .line 240
    const-string v0, "bundleKeyAlbumList"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 241
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 242
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->a(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Z)V

    .line 243
    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->b(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Z)V

    .line 245
    invoke-static {v2, v4}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->a(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Ljava/util/ArrayList;)V

    .line 246
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->c(Lcom/huawei/health/sns/model/chat/Album;)V

    goto :goto_0

    .line 248
    :cond_2
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->a(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Z)V

    .line 249
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->b(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Z)V

    .line 253
    :cond_3
    :goto_0
    return-void
.end method
