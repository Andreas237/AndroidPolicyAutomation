.class public Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;
.super Ljava/lang/Object;
.source "CommonClickUtils.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/CommonClickUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DistanceClick"
.end annotation


# instance fields
.field private address:Ljava/lang/String;

.field private appScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private chainId:Ljava/lang/String;

.field private districtId:Ljava/lang/String;

.field private latitude:Ljava/lang/Double;

.field private locationId:Ljava/lang/String;

.field private longitude:Ljava/lang/Double;

.field private originElement:I

.field private storeName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            "I)V"
        }
    .end annotation

    .line 370
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 371
    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 372
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->latitude:Ljava/lang/Double;

    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->latitude:Ljava/lang/Double;

    .line 373
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->longitude:Ljava/lang/Double;

    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->longitude:Ljava/lang/Double;

    .line 374
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->storeName:Ljava/lang/String;

    .line 375
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->locationId:Ljava/lang/String;

    .line 376
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->districtId:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->districtId:Ljava/lang/String;

    .line 377
    iput p3, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->originElement:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/ref/WeakReference;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 387
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 388
    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 389
    iput-object p2, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->latitude:Ljava/lang/Double;

    .line 390
    iput-object p3, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->longitude:Ljava/lang/Double;

    .line 391
    iput-object p4, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->storeName:Ljava/lang/String;

    .line 392
    iput-object p6, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->locationId:Ljava/lang/String;

    .line 393
    iput-object p7, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->chainId:Ljava/lang/String;

    if-eqz p5, :cond_0

    const-string p1, "\n"

    const-string p2, ", "

    .line 395
    invoke-virtual {p5, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->address:Ljava/lang/String;

    .line 397
    :cond_0
    iput p8, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->originElement:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 402
    iget-object p1, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-eqz p1, :cond_0

    .line 404
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "district_id"

    .line 405
    iget-object v2, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->districtId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "location_id"

    .line 406
    iget-object v2, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "chain_id"

    .line 407
    iget-object v2, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "latitude"

    .line 408
    iget-object v2, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->latitude:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "longitude"

    .line 409
    iget-object v2, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->longitude:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "location_name"

    .line 410
    iget-object v2, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->storeName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "location_address"

    .line 411
    iget-object v2, p0, Lcom/shopkick/app/util/CommonClickUtils$DistanceClick;->address:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    const-class v1, Lcom/shopkick/app/location/LocationMapScreen;

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/screens/AppScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    :cond_0
    return-void
.end method
