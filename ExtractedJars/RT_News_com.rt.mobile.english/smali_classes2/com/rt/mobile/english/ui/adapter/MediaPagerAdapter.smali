.class public Lcom/rt/mobile/english/ui/adapter/MediaPagerAdapter;
.super Landroid/support/v4/app/FragmentStatePagerAdapter;
.source "MediaPagerAdapter.java"


# instance fields
.field private listMessage:Lcom/rt/mobile/english/data/Message;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/media/Media;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentManager;Lcom/rt/mobile/english/data/Message;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/FragmentManager;",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/media/Media;",
            ">;>;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentStatePagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 24
    iput-object p2, p0, Lcom/rt/mobile/english/ui/adapter/MediaPagerAdapter;->listMessage:Lcom/rt/mobile/english/data/Message;

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/rt/mobile/english/ui/adapter/MediaPagerAdapter;->listMessage:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 3

    .line 29
    iget-object v0, p0, Lcom/rt/mobile/english/ui/adapter/MediaPagerAdapter;->listMessage:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 p1, p1, 0x1

    sub-int/2addr v0, p1

    .line 30
    iget-object p1, p0, Lcom/rt/mobile/english/ui/adapter/MediaPagerAdapter;->listMessage:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/data/media/Media;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/media/Media;->getType()Ljava/lang/String;

    move-result-object p1

    const-string v1, "video"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 31
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v1, "url_string"

    .line 32
    iget-object v2, p0, Lcom/rt/mobile/english/ui/adapter/MediaPagerAdapter;->listMessage:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/data/media/Media;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/media/Media;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    new-instance v0, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment;

    invoke-direct {v0}, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment;-><init>()V

    .line 34
    invoke-virtual {v0, p1}, Lcom/rt/mobile/english/ui/MediaVideoRecyclerViewFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0

    .line 37
    :cond_0
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v1, "url_string"

    .line 38
    iget-object v2, p0, Lcom/rt/mobile/english/ui/adapter/MediaPagerAdapter;->listMessage:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/data/media/Media;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/media/Media;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    new-instance v0, Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment;

    invoke-direct {v0}, Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment;-><init>()V

    .line 40
    invoke-virtual {v0, p1}, Lcom/rt/mobile/english/ui/MediaGalleriesRecyclerViewFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 2

    .line 47
    iget-object v0, p0, Lcom/rt/mobile/english/ui/adapter/MediaPagerAdapter;->listMessage:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/adapter/MediaPagerAdapter;->listMessage:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 p1, p1, 0x1

    sub-int/2addr v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/data/media/Media;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/media/Media;->getTitle()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
