.class public Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "StoreDetailsAddressTileViewHolderConfigurator.java"


# static fields
.field private static final CHAIN_LOGO_DIMENSION_DIP:I = 0x1e

.field private static final LOGO_CIRCLE_RADIUS:I = 0xf


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

.field private chainLogoImageUrl:Ljava/lang/String;

.field private chainName:Ljava/lang/String;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private latitude:Ljava/lang/Double;

.field private locationId:Ljava/lang/String;

.field private locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

.field private longitude:Ljava/lang/Double;

.field private mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/account/UserAccount;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 59
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 60
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 61
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    .line 62
    iput-object p5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    return-void
.end method

.method private populateOfflineStore(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 12

    const v0, 0x7f0906e0

    .line 110
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f0906e1

    .line 111
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    const v3, 0x7f0906ec

    .line 112
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    const v4, 0x7f0900e9

    .line 114
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    const v4, 0x7f0904d9

    .line 115
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 117
    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->address:Ljava/lang/String;

    if-eqz v4, :cond_2

    .line 118
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    .line 119
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    .line 120
    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->address:Ljava/lang/String;

    const-string v5, "\n"

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 121
    array-length v5, v4

    const/4 v6, 0x0

    if-lez v5, :cond_0

    .line 122
    aget-object v2, v4, v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 124
    :cond_0
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    :goto_0
    array-length v0, v4

    const/4 v2, 0x1

    if-le v0, v2, :cond_1

    .line 127
    aget-object v0, v4, v2

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 129
    :cond_1
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->latitude:Ljava/lang/Double;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->longitude:Ljava/lang/Double;

    if-eqz v0, :cond_3

    .line 134
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    .line 135
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->latitude:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->longitude:Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/app/location/LocationNotifier;->getDistanceInMetersFrom(DD)F

    move-result v1

    float-to-double v1, v1

    .line 136
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-static {v1, v2, v3}, Lcom/shopkick/app/util/NumberFormatter;->formattedDistanceString(DLcom/shopkick/app/account/UserAccount;)Ljava/lang/String;

    move-result-object v1

    .line 137
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 138
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    new-instance v0, Lcom/shopkick/app/util/CommonClickUtils$StoreDetailsDistanceClick;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->latitude:Ljava/lang/Double;

    iget-object v5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->longitude:Ljava/lang/Double;

    iget-object v6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->chainName:Ljava/lang/String;

    iget-object v7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->address:Ljava/lang/String;

    iget-object v8, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->locationId:Ljava/lang/String;

    iget-object v9, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->chainId:Ljava/lang/String;

    const/16 v10, 0x73

    iget-object v11, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, Lcom/shopkick/app/util/CommonClickUtils$StoreDetailsDistanceClick;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/shopkick/app/logging/UserEventLogger;)V

    .line 151
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    return-void
.end method

.method private populateOnlineStore(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 156
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f0900e7

    .line 173
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01c6

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 3

    if-nez p2, :cond_0

    return-void

    :cond_0
    const p2, 0x7f0900e7

    .line 165
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object p2

    const/16 v0, 0x1e

    .line 166
    invoke-static {v0, p2}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v0

    const/16 v1, 0xf

    .line 167
    invoke-static {v1, p2}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    .line 168
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequests;->asBitmap()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->chainLogoImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/util/GlideRequest;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->override(I)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    const/4 p3, 0x2

    new-array p3, p3, [Lcom/bumptech/glide/load/Transformation;

    const/4 v0, 0x0

    new-instance v2, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;

    invoke-direct {v2}, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;-><init>()V

    aput-object v2, p3, v0

    const/4 v0, 0x1

    new-instance v2, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;

    invoke-direct {v2, v1}, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;-><init>(I)V

    aput-object v2, p3, v0

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->transforms([Lcom/bumptech/glide/load/Transformation;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    if-nez p2, :cond_0

    return-void

    .line 97
    :cond_0
    invoke-static {p2}, Lcom/shopkick/app/util/Affiliate;->isOnlineStore(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 98
    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMCommerceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 104
    :cond_1
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->chainLogoImageUrl:Ljava/lang/String;

    .line 105
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->populateOnlineStore(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_1

    .line 99
    :cond_2
    :goto_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    const p2, 0x7f0900e7

    .line 101
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 102
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->populateOfflineStore(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    :goto_1
    return-void
.end method

.method public setData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->chainLogoImageUrl:Ljava/lang/String;

    .line 73
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->address:Ljava/lang/String;

    .line 74
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->latitude:Ljava/lang/Double;

    .line 75
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->longitude:Ljava/lang/Double;

    .line 76
    iput-object p5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->locationId:Ljava/lang/String;

    .line 77
    iput-object p6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->chainName:Ljava/lang/String;

    .line 78
    iput-object p7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsAddressTileViewHolderConfigurator;->chainId:Ljava/lang/String;

    return-void
.end method
