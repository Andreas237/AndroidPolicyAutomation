.class public Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "StoreTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;
    }
.end annotation


# static fields
.field private static final CHAIN_LOGO_DIMENSION_DIP:I = 0x30

.field private static final LOGO_CIRCLE_RADIUS:I = 0x18


# instance fields
.field protected appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field protected appScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field protected clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field protected context:Landroid/content/Context;

.field protected locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

.field protected mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

.field protected searchKeyword:Ljava/lang/String;

.field private storeType:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

.field protected urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field protected userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 1

    .line 82
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 83
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 84
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 85
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 86
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    .line 87
    iput-object p5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 88
    iput-object p6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 89
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->context:Landroid/content/Context;

    .line 90
    iput-object p8, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 92
    sget-object p1, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->NEARBY:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->storeType:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    return-void
.end method

.method private determineStoreType(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMCommerceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 131
    invoke-static {p1}, Lcom/shopkick/app/util/Affiliate;->isOnlineStore(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 132
    sget-object p1, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->ONLINE:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->storeType:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    goto :goto_0

    .line 134
    :cond_0
    sget-object p1, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->NEARBY:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->storeType:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    :goto_0
    return-void
.end method

.method private setupBottomSeparator(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    .line 456
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    const v1, 0x7f09009a

    if-eqz v0, :cond_0

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 457
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 459
    :cond_0
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private setupCartDataAndStrikethrough(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 5

    const v0, 0x7f0904da

    .line 389
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v1, 0x7f0904db

    .line 390
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKTextView;

    const v2, 0x7f0904dc

    .line 391
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    .line 394
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStorePurchaseKickAmountText:Ljava/lang/String;

    invoke-static {v2}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v2

    const/16 v3, 0x8

    if-nez v2, :cond_1

    const/4 v2, 0x0

    .line 395
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 396
    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 397
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStorePurchaseKickAmountText:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 400
    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v4}, Lcom/shopkick/app/util/FeatureFlagHelper;->isStrikethroughPricingEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreEnablePriceHighlight:Ljava/lang/Boolean;

    .line 401
    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 403
    invoke-virtual {v0}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0800cd

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 405
    invoke-virtual {v0}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f060123

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const/4 v0, 0x1

    .line 406
    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    .line 408
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreStrikePrice:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 410
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreStrikePrice:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 412
    invoke-virtual {p1, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 414
    new-instance p2, Landroid/text/SpannableString;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 415
    new-instance v0, Landroid/text/style/StrikethroughSpan;

    invoke-direct {v0}, Landroid/text/style/StrikethroughSpan;-><init>()V

    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/16 v3, 0x21

    invoke-interface {p2, v0, v2, v1, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 416
    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 419
    :cond_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v4, 0x7f0800cc

    invoke-virtual {p2, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 420
    invoke-virtual {v0}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f060022

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {v1, p2}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 421
    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    .line 422
    invoke-virtual {p1, v3}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    goto :goto_0

    .line 425
    :cond_1
    invoke-virtual {v1, v3}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 426
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 427
    invoke-virtual {p1, v3}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method private setupChainName(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    const v0, 0x7f0900e9

    .line 159
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p1

    .line 160
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private setupDistanceText(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 5

    const v0, 0x7f09021f

    .line 164
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p1

    .line 166
    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$1;->$SwitchMap$com$shopkick$app$tileViewHolderConfigurators$StoreTileViewHolderConfigurator$StoreType:[I

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->storeType:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    invoke-virtual {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v0, 0x0

    .line 172
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 173
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->latitude:Ljava/lang/Double;

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->longitude:Ljava/lang/Double;

    if-eqz v0, :cond_0

    .line 174
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->latitude:Ljava/lang/Double;

    .line 177
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->longitude:Ljava/lang/Double;

    .line 178
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    .line 176
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/app/location/LocationNotifier;->getDistanceInMetersFrom(DD)F

    move-result p2

    float-to-double v0, p2

    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 175
    invoke-static {v0, v1, p2}, Lcom/shopkick/app/util/NumberFormatter;->formattedDistanceString(DLcom/shopkick/app/account/UserAccount;)Ljava/lang/String;

    move-result-object p2

    .line 174
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 182
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    const/16 p2, 0x8

    .line 168
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private setupForStoreType(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    .line 189
    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$1;->$SwitchMap$com$shopkick$app$tileViewHolderConfigurators$StoreTileViewHolderConfigurator$StoreType:[I

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->storeType:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    invoke-virtual {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 197
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 191
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->setupNearbyStores(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    goto :goto_0

    .line 194
    :pswitch_1
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->setupOnlineStores(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private setupLayoutOnClick(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    .line 448
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/shopkick/app/util/CommonClickUtils$StoreTileClickListener;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-direct {v0, v1, p2}, Lcom/shopkick/app/util/CommonClickUtils$StoreTileClickListener;-><init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private setupLinkButton(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    const v0, 0x7f09041b

    .line 433
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object p1

    .line 434
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->storeType:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->ONLINE:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 435
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/store/EarnScreen;

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    .line 436
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 437
    new-instance v0, Lcom/shopkick/app/util/CommonClickUtils$OnlineStoreButtonClickListener;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->mCommerceManager:Lcom/shopkick/app/store/MCommerceManager;

    invoke-direct {v0, v1, p2}, Lcom/shopkick/app/util/CommonClickUtils$OnlineStoreButtonClickListener;-><init>(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    const/16 p2, 0x8

    .line 442
    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 5

    .line 464
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 466
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x62

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v1, v2, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 467
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dealId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setDealId(Ljava/lang/String;)V

    .line 468
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 469
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 470
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 471
    invoke-static {p2}, Lcom/shopkick/app/util/Affiliate;->isOnlineStore(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsOnlineStore(Ljava/lang/Boolean;)V

    .line 472
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->searchKeyword:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 473
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->searchKeyword:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSearchText(Ljava/lang/String;)V

    .line 477
    :cond_0
    new-instance v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v0}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 478
    invoke-virtual {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 479
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v2, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 480
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 481
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast v2, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    .line 482
    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, v1, v4, v0}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 485
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->storeType:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;->ONLINE:Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator$StoreType;

    if-ne v0, v1, :cond_1

    const v0, 0x7f09041b

    .line 486
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    .line 487
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x132

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 488
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 490
    new-instance p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 491
    invoke-virtual {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    const/4 v2, 0x1

    .line 492
    iput-boolean v2, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 493
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v2, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 494
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 496
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v1, p1, p2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    :cond_1
    return-void
.end method

.method private setupLogo(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    const p2, 0x7f0900e7

    .line 139
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object p1

    const/4 p2, 0x0

    .line 140
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 141
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private setupNearbyStores(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const v3, 0x7f0903d9

    .line 203
    invoke-virtual {v1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    const v4, 0x7f090762

    .line 204
    invoke-virtual {v1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    const/16 v6, 0x8

    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    const v4, 0x7f0906f6

    .line 206
    invoke-virtual {v1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    const v7, 0x7f0906f4

    .line 207
    invoke-virtual {v1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/ImageView;

    const v8, 0x7f0906f2

    .line 208
    invoke-virtual {v1, v8}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/ImageView;

    const v9, 0x7f0906f3

    .line 209
    invoke-virtual {v1, v9}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v9

    .line 210
    invoke-virtual {v1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    const v10, 0x7f09028f

    .line 212
    invoke-virtual {v1, v10}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v10

    const v11, 0x7f090651

    .line 213
    invoke-virtual {v1, v11}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v11

    const v12, 0x7f09075b

    .line 214
    invoke-virtual {v1, v12}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v12

    .line 215
    invoke-virtual {v10, v6}, Landroid/view/View;->setVisibility(I)V

    .line 216
    invoke-virtual {v11, v6}, Landroid/view/View;->setVisibility(I)V

    .line 217
    invoke-virtual {v12, v6}, Landroid/view/View;->setVisibility(I)V

    const v13, 0x7f09081a

    .line 218
    invoke-virtual {v1, v13}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v13

    const v14, 0x7f09060c

    .line 219
    invoke-virtual {v1, v14}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v14

    const v15, 0x7f09057b

    .line 220
    invoke-virtual {v1, v15}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v15

    const v6, 0x7f09058c

    .line 221
    invoke-virtual {v1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v6

    const v5, 0x7f09025e

    .line 222
    invoke-virtual {v1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    .line 227
    iget-object v5, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->walkinKickAmount:Ljava/lang/Integer;

    invoke-static {v5}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v5

    move-object/from16 v16, v3

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    .line 228
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 229
    invoke-virtual {v13, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 231
    iget-object v5, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->walkinKickAmount:Ljava/lang/Integer;

    invoke-static {v5}, Lcom/shopkick/app/util/NumberFormatter;->formatShortKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v5

    .line 232
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->bonusWalkinKicksAvailable:Ljava/lang/Boolean;

    invoke-static {v3}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "+"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 233
    :goto_0
    invoke-virtual {v13, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 234
    iget-object v3, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v3}, Lcom/shopkick/app/util/FeatureFlagHelper;->isWalkinBonusCountdownEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 236
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v17

    const-wide/high16 v19, 0x3fe0000000000000L    # 0.5

    cmpg-double v3, v17, v19

    if-gez v3, :cond_1

    const v3, 0x7f060118

    .line 237
    invoke-direct {v0, v4, v13, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->updateBonusKicks(Landroid/widget/ImageView;Landroid/widget/TextView;I)V

    goto :goto_1

    :cond_1
    const v3, 0x7f060022

    .line 240
    invoke-direct {v0, v4, v13, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->updateBonusKicks(Landroid/widget/ImageView;Landroid/widget/TextView;I)V

    goto :goto_1

    :cond_2
    const v3, 0x7f060022

    .line 243
    invoke-direct {v0, v4, v13, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->updateBonusKicks(Landroid/widget/ImageView;Landroid/widget/TextView;I)V

    :goto_1
    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/16 v3, 0x8

    .line 247
    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 248
    invoke-virtual {v13, v3}, Landroid/widget/TextView;->setVisibility(I)V

    const/4 v5, 0x0

    .line 252
    :goto_2
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanKickAmount:Ljava/lang/Integer;

    invoke-static {v3}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v3

    const/4 v4, 0x2

    if-eqz v3, :cond_4

    const/4 v3, 0x0

    .line 253
    invoke-virtual {v7, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 254
    invoke-virtual {v14, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 256
    iget-object v7, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanKickAmount:Ljava/lang/Integer;

    invoke-static {v7}, Lcom/shopkick/app/util/NumberFormatter;->formatShortKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v7

    .line 257
    invoke-virtual {v14, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    add-int/lit8 v5, v5, 0x1

    if-ne v5, v4, :cond_5

    .line 262
    invoke-virtual {v10, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    const/16 v10, 0x8

    .line 265
    invoke-virtual {v14, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 266
    invoke-virtual {v7, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 270
    :cond_5
    :goto_3
    iget-object v7, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->purchaseKickAmountText:Ljava/lang/String;

    invoke-static {v7}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_6

    .line 271
    invoke-virtual {v8, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 272
    invoke-virtual {v15, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 273
    iget-object v7, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->purchaseKickAmountText:Ljava/lang/String;

    invoke-virtual {v15, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    add-int/lit8 v5, v5, 0x1

    if-lt v5, v4, :cond_7

    .line 280
    invoke-virtual {v11, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    :cond_6
    const/16 v3, 0x8

    .line 284
    invoke-virtual {v8, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 285
    invoke-virtual {v15, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 289
    :cond_7
    :goto_4
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptKickAmountText:Ljava/lang/String;

    invoke-static {v3}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_9

    .line 290
    iget-object v3, v0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v7, 0x7f060022

    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const v3, 0x7f0802dd

    .line 291
    invoke-virtual {v9, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    const/4 v3, 0x0

    .line 292
    invoke-virtual {v9, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 293
    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 295
    iget-object v7, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptKickAmountText:Ljava/lang/String;

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    add-int/lit8 v5, v5, 0x1

    if-lt v5, v4, :cond_8

    .line 303
    invoke-virtual {v12, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_8
    const/16 v3, 0x8

    goto :goto_5

    :cond_9
    const/16 v3, 0x8

    .line 307
    invoke-virtual {v9, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 308
    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 311
    :goto_5
    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->flagText:Ljava/lang/String;

    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_a

    .line 312
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->flagText:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v2, 0x0

    .line 313
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_6

    :cond_a
    const/4 v2, 0x0

    .line 315
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_6
    if-nez v5, :cond_b

    move-object/from16 v1, v16

    .line 319
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_7

    :cond_b
    move-object/from16 v1, v16

    .line 321
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_7
    return-void
.end method

.method private setupOnlineStores(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 9

    const v0, 0x7f0903d9

    .line 326
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f090762

    .line 327
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0904dd

    .line 329
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    const v3, 0x7f0904d7

    .line 330
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f0904de

    .line 331
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v4

    const v5, 0x7f0904d8

    .line 332
    invoke-virtual {p1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v5

    const v6, 0x7f0907f8

    .line 334
    invoke-virtual {p1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    const v7, 0x7f0907f9

    .line 335
    invoke-virtual {p1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    .line 336
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    .line 337
    invoke-virtual {v7, v1}, Landroid/view/View;->setVisibility(I)V

    .line 342
    iget-object v7, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickAmount:Ljava/lang/Integer;

    invoke-static {v7}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_0

    iget-object v7, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickCompleted:Ljava/lang/Boolean;

    .line 343
    invoke-static {v7}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    .line 344
    iget-object v7, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreClickKickAmount:Ljava/lang/Integer;

    invoke-static {v7}, Lcom/shopkick/app/util/NumberFormatter;->formatShortKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v7

    .line 345
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 347
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 348
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setVisibility(I)V

    move v0, v8

    goto :goto_0

    .line 351
    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 352
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setVisibility(I)V

    move v0, v2

    .line 356
    :goto_0
    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v4}, Lcom/shopkick/app/util/FeatureFlagHelper;->isOnlineOffersEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreTotalAvailableOnlineOfferKicks:Ljava/lang/Integer;

    .line 357
    invoke-static {v4}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 358
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreTotalAvailableOnlineOfferKicks:Ljava/lang/Integer;

    invoke-static {v1}, Lcom/shopkick/app/util/NumberFormatter;->formatShortKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v1

    .line 359
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 361
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 362
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setVisibility(I)V

    add-int/2addr v0, v8

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 365
    invoke-virtual {v6, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 368
    :cond_1
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 369
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 373
    :cond_2
    :goto_1
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->setupCartDataAndStrikethrough(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method

.method private setupTeaser(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    const v0, 0x7f090730

    .line 146
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p1

    .line 148
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->teaserText:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 149
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->teaserText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p2, 0x0

    .line 150
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 153
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 p2, 0x8

    .line 154
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private updateBonusKicks(Landroid/widget/ImageView;Landroid/widget/TextView;I)V
    .locals 1

    .line 384
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-static {v0, p3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/support/v4/widget/ImageViewCompat;->setImageTintList(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    .line 385
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-static {p1, p3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f0900e7

    .line 516
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01dc

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 3

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f0900e7

    .line 508
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x30

    .line 509
    invoke-static {v1, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    const/16 v2, 0x18

    .line 510
    invoke-static {v2, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v2

    .line 511
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequests;->asBitmap()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequest;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/GlideRequest;->override(I)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    const/4 p2, 0x2

    new-array p2, p2, [Lcom/bumptech/glide/load/Transformation;

    const/4 p3, 0x0

    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;

    invoke-direct {v1}, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;-><init>()V

    aput-object v1, p2, p3

    const/4 p3, 0x1

    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;

    invoke-direct {v1, v2}, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;-><init>(I)V

    aput-object v1, p2, p3

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequest;->transforms([Lcom/bumptech/glide/load/Transformation;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 107
    invoke-direct {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->determineStoreType(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 110
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->setupLogo(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 111
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->setupChainName(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 112
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->setupDistanceText(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 113
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->setupTeaser(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 114
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->setupBottomSeparator(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 117
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->setupForStoreType(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 119
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->setupLinkButton(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 120
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->setupLayoutOnClick(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 122
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method

.method public setSearchKeyword(Ljava/lang/String;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/StoreTileViewHolderConfigurator;->searchKeyword:Ljava/lang/String;

    return-void
.end method
