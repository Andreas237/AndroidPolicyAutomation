.class public Lcom/shopkick/app/video/VideoScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "VideoScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# instance fields
.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private videoController:Lcom/shopkick/app/video/VideoController;

.field private videoTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private isInteger(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    .line 44
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 46
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x2d

    const/4 v3, 0x1

    if-ne v1, v3, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v2, :cond_1

    return v0

    .line 50
    :cond_1
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v2, :cond_2

    move v1, v3

    goto :goto_0

    :cond_2
    move v1, v0

    .line 51
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 52
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isDigit(C)Z

    move-result v2

    if-nez v2, :cond_3

    return v0

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return v3

    :cond_5
    :goto_1
    return v0
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c003a

    const/4 v0, 0x0

    .line 62
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 28
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iput-object v0, p0, Lcom/shopkick/app/video/VideoScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 29
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/video/VideoScreen;->videoTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 30
    iget-object v0, p0, Lcom/shopkick/app/video/VideoScreen;->videoTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const-string/jumbo v1, "video_url"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoUrl:Ljava/lang/String;

    .line 31
    iget-object v0, p0, Lcom/shopkick/app/video/VideoScreen;->videoTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const-string/jumbo v1, "video_id"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    const-string/jumbo v0, "video_type"

    .line 32
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/shopkick/app/video/VideoScreen;->isInteger(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    iget-object v0, p0, Lcom/shopkick/app/video/VideoScreen;->videoTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const-string/jumbo v1, "video_type"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoUrlType:Ljava/lang/Integer;

    :cond_0
    const-string v0, "kick_amount"

    .line 35
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v0, "kick_amount"

    .line 36
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/shopkick/app/video/VideoScreen;->isInteger(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 37
    iget-object v0, p0, Lcom/shopkick/app/video/VideoScreen;->videoTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const-string v1, "kick_amount"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 39
    :cond_1
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p1, p0, Lcom/shopkick/app/video/VideoScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 40
    iget-object p1, p0, Lcom/shopkick/app/video/VideoScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventExitFullScreen"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/video/VideoScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 89
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 76
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, 0x15bf20b3

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "EventExitFullScreen"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    .line 78
    :cond_2
    new-instance p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class p2, Lcom/shopkick/app/activities/HomeActivity;

    const-class v0, Lcom/shopkick/app/browse/BrowseScreen;

    iget-object v1, p0, Lcom/shopkick/app/video/VideoScreen;->params:Ljava/util/Map;

    invoke-direct {p1, p2, v0, v1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 79
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 80
    invoke-virtual {p0}, Lcom/shopkick/app/video/VideoScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    :cond_3
    :goto_2
    return-void
.end method

.method public onScreenDidShow()V
    .locals 2

    .line 68
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/video/VideoScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v1, p0, Lcom/shopkick/app/video/VideoScreen;->videoTileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/video/VideoController;->loadVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/video/VideoScreen;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->enterFullScreen()V

    return-void
.end method
