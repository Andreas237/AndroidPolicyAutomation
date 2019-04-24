.class public Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;
.super Ljava/lang/Object;
.source "ScanClickUtils.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/ScanClickUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GoToScanClickListener"
.end annotation


# instance fields
.field private appScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private clientFlagsManagerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/application/ClientFlagsManager;",
            ">;"
        }
    .end annotation
.end field

.field private dispatcherRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/url/URLDispatcher;",
            ">;"
        }
    .end annotation
.end field

.field private index:I

.field private locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/application/ClientFlagsManager;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;",
            "Lcom/shopkick/app/cpg/LocationDataSource;",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/url/URLDispatcher;",
            ">;",
            "Lcom/shopkick/app/application/ClientFlagsManager;",
            "I)V"
        }
    .end annotation

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 64
    iput-object p2, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    .line 65
    iput-object p3, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 66
    iput-object p4, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->dispatcherRef:Ljava/lang/ref/WeakReference;

    .line 67
    iput p6, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->index:I

    .line 68
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->clientFlagsManagerRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 72
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    .line 73
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_0

    .line 74
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->dispatcherRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/url/URLDispatcher;

    if-eqz p1, :cond_3

    .line 76
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "origin_element"

    const/16 v2, 0x91

    .line 77
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    iget-object v1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/util/Map;)Z

    goto :goto_2

    :cond_0
    if-eqz v0, :cond_3

    .line 82
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    .line 83
    iget-object v1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    :goto_0
    move-object v2, v1

    if-nez p1, :cond_2

    .line 87
    iget-object v1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    .line 88
    iget-object v1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object v3, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/shopkick/app/cpg/LocationDataSource;->getLocation(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 90
    iget-object p1, v1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->chainId:Ljava/lang/String;

    move-object v3, p1

    goto :goto_1

    :cond_2
    move-object v3, p1

    .line 94
    :goto_1
    iget-object v1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget v4, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->index:I

    iget-object v5, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;->clientFlagsManagerRef:Ljava/lang/ref/WeakReference;

    invoke-static/range {v0 .. v5}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->goToScan(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/lang/String;Ljava/lang/String;ILjava/lang/ref/WeakReference;)V

    :cond_3
    :goto_2
    return-void
.end method
