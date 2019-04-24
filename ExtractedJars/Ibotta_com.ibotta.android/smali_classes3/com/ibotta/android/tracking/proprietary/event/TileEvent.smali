.class public Lcom/ibotta/android/tracking/proprietary/event/TileEvent;
.super Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;
.source "TileEvent.java"


# annotations
.annotation runtime Lcom/j256/ormlite/table/DatabaseTable;
    tableName = "tile_event"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;-><init>()V

    return-void
.end method

.method private static newTileEvent(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/proprietary/event/TileEvent;
    .locals 3

    .line 55
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;-><init>()V

    .line 57
    invoke-virtual {v0, p0}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    const/4 p0, 0x0

    .line 58
    invoke-virtual {v0, p0}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setReferrer(Ljava/lang/String;)V

    .line 59
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setEventAt(J)V

    const/4 v1, 0x1

    .line 60
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setCounter(I)V

    .line 61
    invoke-virtual {v0, p0}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setDuration(Ljava/lang/Float;)V

    .line 62
    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setRetailerCategoryId(Ljava/lang/Integer;)V

    .line 63
    invoke-virtual {v0, p3}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setRetailerId(Ljava/lang/Integer;)V

    .line 64
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setTileId(Ljava/lang/Integer;)V

    .line 65
    invoke-virtual {v0, p4}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setClicked(Ljava/lang/Boolean;)V

    if-eqz p4, :cond_0

    .line 67
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 68
    sget-object p0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->TILE:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    :cond_0
    return-object v0
.end method

.method public static trackCategoryClick(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;II)V
    .locals 3

    .line 38
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, p1, p2, v2, v1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->newTileEvent(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public static trackCategoryView(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;II)V
    .locals 2

    .line 18
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1, v1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->newTileEvent(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public static trackFeaturedCategoryClick(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;II)V
    .locals 3

    .line 42
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->FEATURED_CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, p1, p2, v2, v1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->newTileEvent(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public static trackFeaturedCategoryView(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;II)V
    .locals 2

    .line 22
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->FEATURED_CATEGORY:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1, v1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->newTileEvent(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public static trackFeaturedClick(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;I)V
    .locals 3

    .line 34
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->FEATURED:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v2, v1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->newTileEvent(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public static trackFeaturedView(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;I)V
    .locals 2

    .line 14
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->FEATURED:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, v1, v1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->newTileEvent(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public static trackGalleryClick(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;ILjava/lang/Integer;I)V
    .locals 2

    .line 50
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->GALLERY:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, p1, p2, p3, v1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->newTileEvent(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public static trackGalleryView(Lcom/ibotta/android/tracking/proprietary/TrackingQueue;ILjava/lang/Integer;Ljava/lang/Integer;)V
    .locals 2

    .line 30
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->GALLERY:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, p3, v1}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;->newTileEvent(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method


# virtual methods
.method public getPrime1()I
    .locals 1

    const/16 v0, 0x12b3

    return v0
.end method

.method public getPrime2()I
    .locals 1

    const/16 v0, 0x1df5

    return v0
.end method

.method public setClicked(Ljava/lang/Boolean;)V
    .locals 0

    .line 76
    invoke-super {p0, p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setClicked(Ljava/lang/Boolean;)V

    return-void
.end method

.method public toTrackEvent()Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;
    .locals 1

    .line 81
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->TILE:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    invoke-super {p0, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->toTrackEvent(Lcom/ibotta/android/tracking/proprietary/event/TrackType;)Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;

    move-result-object v0

    return-object v0
.end method
