.class public Lcom/shopkick/app/cpg/LocationAvailableAdapter;
.super Landroid/widget/BaseAdapter;
.source "LocationAvailableAdapter.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final CHAIN_LOGO_ROUNDED_RADIUS:I

.field private final CHAIN_LOGO_SIZE:I

.field private availabilityText:Ljava/lang/String;

.field private chainLogos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field

.field private context:Landroid/content/Context;

.field private isForReceiptScan:Z

.field private locationList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field private locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

.field private productFamilyId:Ljava/lang/String;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;

.field private userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/logging/UserEventLogger;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/shopkick/app/location/LocationNotifier;",
            "Lcom/shopkick/app/account/UserAccount;",
            "Lcom/shopkick/app/logging/UserEventLogger;",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    .line 60
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    const/16 v0, 0x22

    .line 39
    iput v0, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->CHAIN_LOGO_SIZE:I

    const/16 v0, 0x11

    .line 40
    iput v0, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->CHAIN_LOGO_ROUNDED_RADIUS:I

    .line 62
    iput-object p1, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->context:Landroid/content/Context;

    .line 63
    iput-object p2, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 64
    iput-object p3, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 65
    iput-object p4, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 67
    iput-object p5, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->locationList:Ljava/util/List;

    .line 68
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->chainLogos:Ljava/util/List;

    .line 69
    iput-object p6, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->productFamilyId:Ljava/lang/String;

    .line 70
    iput-object p7, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->availabilityText:Ljava/lang/String;

    .line 71
    iput-boolean p8, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->isForReceiptScan:Z

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 3

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->chainLogos:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 76
    iget-object v2, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->context:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/content/Context;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->locationList:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->locationList:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    const/16 v0, 0x8

    const v1, 0x7f09043e

    const/4 v2, 0x0

    if-nez p2, :cond_1

    .line 100
    iget-object p2, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->context:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v3, 0x7f0c0110

    .line 101
    invoke-virtual {p2, v3, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 102
    new-instance p3, Lcom/shopkick/app/adapter/ViewHolder;

    invoke-direct {p3}, Lcom/shopkick/app/adapter/ViewHolder;-><init>()V

    .line 103
    invoke-virtual {p3, p2}, Lcom/shopkick/app/adapter/ViewHolder;->populate(Landroid/view/View;)V

    .line 104
    invoke-virtual {p3, v1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    iget-boolean v4, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->isForReceiptScan:Z

    if-eqz v4, :cond_0

    move v4, v0

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 106
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_1

    .line 108
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/adapter/ViewHolder;

    .line 111
    :goto_1
    iget-object v3, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->locationList:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    const/4 v4, 0x1

    if-eqz v3, :cond_5

    const v5, 0x7f090445

    .line 114
    invoke-virtual {p3, v5}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v5

    iget-object v6, v3, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->name:Ljava/lang/String;

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v5, 0x7f09043d

    .line 116
    invoke-virtual {p3, v5}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v6

    .line 117
    iget-object v7, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->availabilityText:Ljava/lang/String;

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_2

    goto :goto_2

    .line 120
    :cond_2
    invoke-virtual {p3, v5}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v5, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->availabilityText:Ljava/lang/String;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 118
    :cond_3
    :goto_2
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 124
    :goto_3
    iget-boolean v0, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->isForReceiptScan:Z

    if-nez v0, :cond_4

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v5, v3, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->latitude:Ljava/lang/Double;

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    iget-object v7, v3, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->longitude:Ljava/lang/Double;

    .line 126
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    .line 125
    invoke-virtual {v0, v5, v6, v7, v8}, Lcom/shopkick/app/location/LocationNotifier;->getDistanceInMetersFrom(DD)F

    move-result v0

    float-to-double v5, v0

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-static {v5, v6, v0}, Lcom/shopkick/app/util/NumberFormatter;->formattedDistanceString(DLcom/shopkick/app/account/UserAccount;)Ljava/lang/String;

    move-result-object v0

    .line 128
    invoke-virtual {p3, v1}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    const v0, 0x7f0900e5

    .line 131
    invoke-virtual {p3, v0}, Lcom/shopkick/app/adapter/ViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object p3

    const/16 v0, 0x11

    .line 132
    invoke-static {v0, p3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v0

    const/16 v1, 0x22

    .line 133
    invoke-static {v1, p3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    .line 134
    iget-object v5, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->chainLogos:Ljava/util/List;

    invoke-interface {v5, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 135
    iget-object v5, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->context:Landroid/content/Context;

    invoke-static {v5}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v5

    iget-object v6, v3, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->chainLogoImageUrl:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v5

    invoke-virtual {v5, v1, v1}, Lcom/shopkick/app/util/GlideRequest;->override(II)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    const/4 v5, 0x2

    new-array v5, v5, [Lcom/bumptech/glide/load/Transformation;

    new-instance v6, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;

    invoke-direct {v6}, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;-><init>()V

    aput-object v6, v5, v2

    new-instance v2, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;

    invoke-direct {v2, v0}, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;-><init>(I)V

    aput-object v2, v5, v4

    .line 136
    invoke-virtual {v1, v5}, Lcom/shopkick/app/util/GlideRequest;->transforms([Lcom/bumptech/glide/load/Transformation;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 140
    :cond_5
    move-object p3, p2

    check-cast p3, Lcom/shopkick/app/logging/IUserEventView;

    .line 141
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    iget-boolean v1, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->isForReceiptScan:Z

    if-eqz v1, :cond_6

    const/16 v1, 0xc6

    goto :goto_4

    :cond_6
    const/16 v1, 0xc2

    .line 142
    :goto_4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    .line 143
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 144
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 145
    iget-object v1, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 146
    iget-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 148
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 149
    iput-object p2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 150
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 151
    iput-boolean v4, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 153
    iget-object p1, p0, Lcom/shopkick/app/cpg/LocationAvailableAdapter;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p3, v0, p1, v1}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-object p2
.end method
