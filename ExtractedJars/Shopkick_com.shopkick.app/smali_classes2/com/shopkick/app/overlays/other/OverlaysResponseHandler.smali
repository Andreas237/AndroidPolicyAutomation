.class public Lcom/shopkick/app/overlays/other/OverlaysResponseHandler;
.super Ljava/lang/Object;
.source "OverlaysResponseHandler.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/IAPICommonHandler;


# static fields
.field private static final DEBUG:Z = false

.field private static final LOG_TAG:Ljava/lang/String; = "OverlaysResponseHandler"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getOverlaysFromOverlaysResponse(Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 91
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;->overlays:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 92
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;->overlays:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 93
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;->overlays:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v0, :cond_0

    .line 94
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v1

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/overlays/OverlayInfo;->isServerSupportedKey(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 95
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method private getOverlaysFromPopupsResponse(Lcom/shopkick/app/fetchers/api/skapi/CommonPopupsResponse;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/CommonPopupsResponse;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 75
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPopupsResponse;->popups:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 76
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPopupsResponse;->popups:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 77
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPopupsResponse;->popups:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/Popup;

    .line 78
    invoke-static {v0}, Lcom/shopkick/app/overlays/controllers/PopupToOverlayConverter;->convert(Lcom/shopkick/app/fetchers/api/skapi/Popup;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 80
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public handle(Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/fetchers/api/IAPIObject;Z)Z
    .locals 4

    .line 36
    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    const/4 p4, 0x0

    if-nez p2, :cond_0

    return p4

    .line 44
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 45
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->popupsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPopupsResponse;

    invoke-direct {p0, v1, v0}, Lcom/shopkick/app/overlays/other/OverlaysResponseHandler;->getOverlaysFromPopupsResponse(Lcom/shopkick/app/fetchers/api/skapi/CommonPopupsResponse;Ljava/util/ArrayList;)V

    .line 46
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->overlaysResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;

    invoke-direct {p0, p2, v0}, Lcom/shopkick/app/overlays/other/OverlaysResponseHandler;->getOverlaysFromOverlaysResponse(Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;Ljava/util/ArrayList;)V

    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 50
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v2

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/overlays/OverlayInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 51
    const-class v3, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 52
    invoke-static {v1}, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->getPreloadUrlsFromOverlaySpec(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->preloadUrls:Ljava/util/List;

    goto :goto_0

    .line 53
    :cond_2
    const-class v3, Lcom/shopkick/app/overlays/common/BallSKOverlay;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 54
    invoke-static {v1}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->getPreloadUrlsFromOverlaySpec(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->preloadUrls:Ljava/util/List;

    goto :goto_0

    .line 55
    :cond_3
    const-class v3, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 56
    invoke-static {v1}, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->getPreloadUrlsFromOverlaySpec(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->preloadUrls:Ljava/util/List;

    goto :goto_0

    .line 59
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-gtz p2, :cond_5

    return p4

    .line 70
    :cond_5
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object p2

    invoke-virtual {p2, v0, p3, p1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlays(Ljava/util/ArrayList;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;)Z

    move-result p1

    return p1
.end method
