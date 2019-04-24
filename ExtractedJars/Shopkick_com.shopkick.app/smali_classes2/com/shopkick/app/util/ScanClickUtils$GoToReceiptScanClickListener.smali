.class public Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;
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
    name = "GoToReceiptScanClickListener"
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

.field private locationDataSourceRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/cpg/LocationDataSource;",
            ">;"
        }
    .end annotation
.end field

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ILjava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            "I",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/cpg/LocationDataSource;",
            ">;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/url/URLDispatcher;",
            ">;",
            "Lcom/shopkick/app/application/ClientFlagsManager;",
            ")V"
        }
    .end annotation

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    iput-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 114
    iput-object p3, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 115
    iput-object p5, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->dispatcherRef:Ljava/lang/ref/WeakReference;

    .line 116
    iput-object p4, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->locationDataSourceRef:Ljava/lang/ref/WeakReference;

    .line 117
    iput p2, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->index:I

    .line 118
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->clientFlagsManagerRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 11

    .line 124
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->locationDataSourceRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/cpg/LocationDataSource;

    if-eqz p1, :cond_4

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->shouldShowLocationAvailableButton(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    .line 128
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/cpg/LocationDataSource;->getLocation(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 130
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->chainId:Ljava/lang/String;

    .line 131
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p1, v2

    move-object v0, p1

    :goto_0
    move-object v7, p1

    move-object v6, v0

    goto :goto_1

    .line 134
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    .line 135
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    move-object v7, p1

    move-object v6, v0

    .line 138
    :goto_1
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    .line 139
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    .line 142
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    move-object v9, v2

    goto :goto_3

    :cond_3
    :goto_2
    move-object v9, v2

    .line 144
    :goto_3
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/shopkick/app/screens/AppScreen;

    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->dispatcherRef:Ljava/lang/ref/WeakReference;

    .line 145
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/shopkick/app/url/URLDispatcher;

    iget v5, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->index:I

    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v8, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    const/16 v10, 0x91

    .line 144
    invoke-static/range {v3 .. v10}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->goToReceiptScanScreen(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/url/URLDispatcher;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    :cond_4
    return-void
.end method
