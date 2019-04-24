.class public Lcom/shopkick/app/debug/PresenceLocationsListAdapter;
.super Lcom/shopkick/app/adapter/SKAdapter;
.source "PresenceLocationsListAdapter.java"

# interfaces
.implements Lcom/shopkick/app/controllers/IImageControllerCallback2;


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

.field private final childIds:[I

.field private final clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private final context:Landroid/content/Context;

.field private final imageController:Lcom/shopkick/app/controllers/ListImageController2;

.field private final location:Landroid/location/Location;

.field private final presenceController:Lcom/shopkick/app/presence/PresenceController;

.field private transmitters:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;Lcom/shopkick/app/chains/ChainDataSource;Lcom/shopkick/app/presence/PresenceController;Lcom/shopkick/app/application/ClientFlagsManager;Landroid/widget/ListView;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lcom/shopkick/app/adapter/SKAdapter;-><init>()V

    const/4 p2, 0x3

    .line 47
    new-array p2, p2, [I

    fill-array-data p2, :array_0

    iput-object p2, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->childIds:[I

    .line 64
    iput-object p1, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->context:Landroid/content/Context;

    .line 65
    iput-object p4, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

    .line 66
    iput-object p5, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    .line 67
    iput-object p6, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 68
    new-instance p1, Lcom/shopkick/app/controllers/ListImageController2;

    invoke-direct {p1, p7, p0}, Lcom/shopkick/app/controllers/ListImageController2;-><init>(Landroid/widget/AbsListView;Lcom/shopkick/app/controllers/IImageControllerCallback2;)V

    iput-object p1, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->imageController:Lcom/shopkick/app/controllers/ListImageController2;

    const/4 p1, 0x0

    .line 71
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->location:Landroid/location/Location;

    .line 72
    iget-object p2, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->location:Landroid/location/Location;

    if-eqz p2, :cond_0

    .line 73
    invoke-virtual {p3}, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->getAllTransmitters()Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 75
    new-instance p2, Lcom/shopkick/app/debug/-$$Lambda$PresenceLocationsListAdapter$lDyucG88oTXLAkIudDKzNc4Gr9Q;

    invoke-direct {p2, p0}, Lcom/shopkick/app/debug/-$$Lambda$PresenceLocationsListAdapter$lDyucG88oTXLAkIudDKzNc4Gr9Q;-><init>(Lcom/shopkick/app/debug/PresenceLocationsListAdapter;)V

    invoke-static {p1, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_0
    if-eqz p1, :cond_1

    goto :goto_0

    .line 97
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    iput-object p1, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->transmitters:Ljava/util/ArrayList;

    return-void

    :array_0
    .array-data 4
        0x7f090308
        0x7f090767
        0x7f090708
    .end array-data
.end method

.method public static synthetic lambda$getView$71(Lcom/shopkick/app/debug/PresenceLocationsListAdapter;Ljava/lang/String;[IILandroid/view/View;)V
    .locals 13

    move-object v0, p0

    .line 157
    iget-object v1, v0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    .line 161
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    move-object v2, p1

    move-object v11, p2

    move/from16 v12, p3

    .line 157
    invoke-virtual/range {v1 .. v12}, Lcom/shopkick/app/presence/PresenceController;->presenceCodeDetected(Ljava/lang/String;I[B[BJIZLjava/util/ArrayList;[II)V

    return-void
.end method

.method public static synthetic lambda$new$70(Lcom/shopkick/app/debug/PresenceLocationsListAdapter;Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;)I
    .locals 6

    .line 77
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->latitude:Ljava/lang/Double;

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->longitude:Ljava/lang/Double;

    if-eqz v0, :cond_0

    .line 78
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->latitude:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->longitude:Ljava/lang/Double;

    .line 79
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    .line 78
    invoke-static {v2, v3, v4, v5}, Lcom/shopkick/app/location/LocationNotifier;->locationFromCoordinates(DD)Landroid/location/Location;

    move-result-object p1

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->location:Landroid/location/Location;

    invoke-virtual {v0, p1}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v1

    .line 83
    :goto_0
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->latitude:Ljava/lang/Double;

    if-eqz v0, :cond_1

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->longitude:Ljava/lang/Double;

    if-eqz v0, :cond_1

    .line 84
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->latitude:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->longitude:Ljava/lang/Double;

    .line 85
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    .line 84
    invoke-static {v0, v1, v2, v3}, Lcom/shopkick/app/location/LocationNotifier;->locationFromCoordinates(DD)Landroid/location/Location;

    move-result-object p2

    .line 86
    iget-object v0, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->location:Landroid/location/Location;

    invoke-virtual {v0, p2}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v1

    :cond_1
    cmpl-float p2, p1, v1

    if-nez p2, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_2
    cmpg-float p1, p1, v1

    if-gez p1, :cond_3

    const/4 p1, -0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public cancelImageLoading()V
    .locals 0

    return-void
.end method

.method public destroyAdapter()V
    .locals 1

    const/4 v0, 0x0

    .line 102
    iput-object v0, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->transmitters:Ljava/util/ArrayList;

    .line 103
    iget-object v0, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->imageController:Lcom/shopkick/app/controllers/ListImageController2;

    invoke-virtual {v0}, Lcom/shopkick/app/controllers/ListImageController2;->cancelAll()V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->transmitters:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->transmitters:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    .line 123
    iget-object v0, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->imageController:Lcom/shopkick/app/controllers/ListImageController2;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/controllers/ListImageController2;->fetchImages(I)V

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 128
    iget-object p2, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->context:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0c0157

    .line 129
    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 130
    new-instance p3, Lcom/shopkick/app/adapter/ViewHolder;

    invoke-direct {p3}, Lcom/shopkick/app/adapter/ViewHolder;-><init>()V

    .line 131
    invoke-virtual {p3, p2}, Lcom/shopkick/app/adapter/ViewHolder;->populate(Landroid/view/View;)V

    .line 132
    new-instance v1, Lcom/shopkick/app/adapter/ViewDefaults;

    iget-object v2, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->childIds:[I

    invoke-direct {v1, p2, v2}, Lcom/shopkick/app/adapter/ViewDefaults;-><init>(Landroid/view/View;[I)V

    invoke-virtual {p3, v1}, Lcom/shopkick/app/adapter/ViewHolder;->setViewDefaults(Lcom/shopkick/app/adapter/ViewDefaults;)V

    .line 133
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 135
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/adapter/ViewHolder;

    .line 136
    invoke-virtual {p3}, Lcom/shopkick/app/adapter/ViewHolder;->resetViewDefaults()V

    .line 139
    :goto_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;

    const v1, 0x7f090767

    .line 141
    invoke-virtual {p3, v1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 142
    iget-object v2, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    const-string v3, "fonts/AvenirLTStd-Medium.otf"

    invoke-static {v2, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v2

    .line 143
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 144
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Transmitter "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->transmitterId:Ljava/lang/Long;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v2, 0x7f090708

    .line 146
    invoke-virtual {p3, v2}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 147
    iget-object v2, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    const-string v3, "fonts/AvenirLTStd-Medium.otf"

    invoke-static {v2, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v2

    .line 148
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 149
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->latitude:Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->longitude:Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Lcom/shopkick/app/location/LocationNotifier;->locationFromCoordinates(DD)Landroid/location/Location;

    move-result-object v1

    .line 150
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    const-string v3, "%.01f km"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->location:Landroid/location/Location;

    invoke-virtual {v6, v1}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v1

    float-to-double v6, v1

    const-wide v8, 0x3f50624dd2f1a9fcL    # 0.001

    mul-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    aput-object v1, v5, v0

    invoke-static {v2, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string p3, "%06x-2"

    const/4 v1, 0x2

    .line 152
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->transmitterId:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    aput-object v2, v1, v4

    invoke-static {p3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    const/4 v1, -0x1

    .line 153
    iget-object v2, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocBitsToIgnore:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    shl-int/2addr v1, v2

    .line 154
    new-array v2, v4, [I

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->transmitterId:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->intValue()I

    move-result p1

    and-int/2addr p1, v1

    aput p1, v2, v0

    .line 156
    new-instance p1, Lcom/shopkick/app/debug/-$$Lambda$PresenceLocationsListAdapter$zpLKccWrOCOS_zouZOkAQ7_rSsg;

    invoke-direct {p1, p0, p3, v2, v1}, Lcom/shopkick/app/debug/-$$Lambda$PresenceLocationsListAdapter$zpLKccWrOCOS_zouZOkAQ7_rSsg;-><init>(Lcom/shopkick/app/debug/PresenceLocationsListAdapter;Ljava/lang/String;[II)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p2
.end method

.method public loadImagesForPosition(ILandroid/view/View;Z)V
    .locals 1

    .line 174
    invoke-virtual {p0, p1}, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;

    .line 175
    iget-object v0, p0, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->chainDataSource:Lcom/shopkick/app/chains/ChainDataSource;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->chainId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/chains/ChainDataSource;->getChainInfo(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 176
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;->chainWhiteLogoImageUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    const v0, 0x7f090308

    .line 177
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 179
    invoke-static {p2}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p2

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ChainInfo;->chainWhiteLogoImageUrl:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_0
    return-void
.end method
