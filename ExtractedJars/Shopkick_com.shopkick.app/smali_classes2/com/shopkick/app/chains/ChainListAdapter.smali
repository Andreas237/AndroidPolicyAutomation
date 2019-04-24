.class public Lcom/shopkick/app/chains/ChainListAdapter;
.super Lcom/shopkick/app/adapter/SKAdapter;
.source "ChainListAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/chains/ChainListAdapter$ChainListClickListener;
    }
.end annotation


# instance fields
.field private chainListScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/chains/ChainListScreen;",
            ">;"
        }
    .end annotation
.end field

.field private chainName:Ljava/lang/String;

.field private childIds:[I

.field private context:Landroid/content/Context;

.field private locNotifier:Lcom/shopkick/app/location/LocationNotifier;

.field private locationId:Ljava/lang/String;

.field private locations:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field private userAccount:Lcom/shopkick/app/account/UserAccount;

.field private userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/chains/ChainListScreen;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Lcom/shopkick/app/adapter/SKAdapter;-><init>()V

    const/4 v0, 0x6

    .line 39
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/shopkick/app/chains/ChainListAdapter;->childIds:[I

    .line 49
    iput-object p1, p0, Lcom/shopkick/app/chains/ChainListAdapter;->context:Landroid/content/Context;

    .line 50
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/chains/ChainListAdapter;->chainListScreenRef:Ljava/lang/ref/WeakReference;

    .line 51
    iput-object p3, p0, Lcom/shopkick/app/chains/ChainListAdapter;->locNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 52
    iput-object p4, p0, Lcom/shopkick/app/chains/ChainListAdapter;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 53
    iput-object p7, p0, Lcom/shopkick/app/chains/ChainListAdapter;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 54
    iput-object p5, p0, Lcom/shopkick/app/chains/ChainListAdapter;->locationId:Ljava/lang/String;

    .line 55
    iput-object p6, p0, Lcom/shopkick/app/chains/ChainListAdapter;->chainName:Ljava/lang/String;

    .line 56
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/chains/ChainListScreen;->addResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    return-void

    :array_0
    .array-data 4
        0x7f0900e0
        0x7f0900e2
        0x7f0900eb
        0x7f0900ea
        0x7f0900e4
        0x7f0900e1
    .end array-data
.end method

.method private getChainListView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    if-nez p2, :cond_0

    .line 162
    iget-object p2, p0, Lcom/shopkick/app/chains/ChainListAdapter;->context:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c005e

    const/4 v1, 0x0

    .line 163
    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 164
    new-instance p3, Lcom/shopkick/app/adapter/ViewHolder;

    invoke-direct {p3}, Lcom/shopkick/app/adapter/ViewHolder;-><init>()V

    .line 165
    invoke-virtual {p3, p2}, Lcom/shopkick/app/adapter/ViewHolder;->populate(Landroid/view/View;)V

    .line 166
    new-instance v0, Lcom/shopkick/app/adapter/ViewDefaults;

    iget-object v1, p0, Lcom/shopkick/app/chains/ChainListAdapter;->childIds:[I

    invoke-direct {v0, p2, v1}, Lcom/shopkick/app/adapter/ViewDefaults;-><init>(Landroid/view/View;[I)V

    invoke-virtual {p3, v0}, Lcom/shopkick/app/adapter/ViewHolder;->setViewDefaults(Lcom/shopkick/app/adapter/ViewDefaults;)V

    .line 167
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 169
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/adapter/ViewHolder;

    .line 170
    invoke-virtual {p3}, Lcom/shopkick/app/adapter/ViewHolder;->resetViewDefaults()V

    :goto_0
    const v0, 0x7f0900e0

    .line 173
    invoke-virtual {p3, v0}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0900e2

    .line 174
    invoke-virtual {p3, v1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f0900e1

    .line 175
    invoke-virtual {p3, v2}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/LinearLayout;

    .line 177
    invoke-virtual {p0, p1}, Lcom/shopkick/app/chains/ChainListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    .line 179
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->address:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    iget-object v3, p0, Lcom/shopkick/app/chains/ChainListAdapter;->locNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->latitude:Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    iget-object v6, v2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->longitude:Ljava/lang/Double;

    .line 181
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    .line 180
    invoke-virtual {v3, v4, v5, v6, v7}, Lcom/shopkick/app/location/LocationNotifier;->getDistanceInMetersFrom(DD)F

    move-result v3

    float-to-double v3, v3

    iget-object v5, p0, Lcom/shopkick/app/chains/ChainListAdapter;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-static {v3, v4, v5}, Lcom/shopkick/app/util/NumberFormatter;->formattedDistanceString(DLcom/shopkick/app/account/UserAccount;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 183
    iget-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    iget-object v3, p0, Lcom/shopkick/app/chains/ChainListAdapter;->locationId:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 184
    iget-object v1, p0, Lcom/shopkick/app/chains/ChainListAdapter;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f060120

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 185
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainListAdapter;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0600c5

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 188
    :cond_1
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x88

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 189
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 190
    iget-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSelectedLocationId(Ljava/lang/String;)V

    .line 191
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    const/4 v3, 0x1

    .line 192
    iput-boolean v3, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 193
    move-object v4, p2

    check-cast v4, Lcom/shopkick/app/widget/UserEventFrameLayout;

    iget-object v5, p0, Lcom/shopkick/app/chains/ChainListAdapter;->userEventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v4, v0, v5, v1}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 196
    new-instance v0, Lcom/shopkick/app/chains/ChainListAdapter$ChainListClickListener;

    iget-object v1, p0, Lcom/shopkick/app/chains/ChainListAdapter;->chainListScreenRef:Ljava/lang/ref/WeakReference;

    sub-int/2addr p1, v3

    invoke-direct {v0, v1, v2, p1}, Lcom/shopkick/app/chains/ChainListAdapter$ChainListClickListener;-><init>(Ljava/lang/ref/WeakReference;Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 197
    new-instance v0, Lcom/shopkick/app/chains/ChainListAdapter$ChainListClickListener;

    iget-object v1, p0, Lcom/shopkick/app/chains/ChainListAdapter;->chainListScreenRef:Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1, v2, p1}, Lcom/shopkick/app/chains/ChainListAdapter$ChainListClickListener;-><init>(Ljava/lang/ref/WeakReference;Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;I)V

    invoke-virtual {p3, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p2
.end method

.method private getChainNameView(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    if-nez p1, :cond_0

    .line 140
    iget-object p1, p0, Lcom/shopkick/app/chains/ChainListAdapter;->context:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c0060

    const/4 v1, 0x0

    .line 141
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 142
    new-instance p2, Lcom/shopkick/app/adapter/ViewHolder;

    invoke-direct {p2}, Lcom/shopkick/app/adapter/ViewHolder;-><init>()V

    .line 143
    invoke-virtual {p2, p1}, Lcom/shopkick/app/adapter/ViewHolder;->populate(Landroid/view/View;)V

    .line 144
    new-instance v0, Lcom/shopkick/app/adapter/ViewDefaults;

    iget-object v1, p0, Lcom/shopkick/app/chains/ChainListAdapter;->childIds:[I

    invoke-direct {v0, p1, v1}, Lcom/shopkick/app/adapter/ViewDefaults;-><init>(Landroid/view/View;[I)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/adapter/ViewHolder;->setViewDefaults(Lcom/shopkick/app/adapter/ViewDefaults;)V

    .line 145
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 147
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/adapter/ViewHolder;

    .line 148
    invoke-virtual {p2}, Lcom/shopkick/app/adapter/ViewHolder;->resetViewDefaults()V

    :goto_0
    const v0, 0x7f0900eb

    .line 152
    invoke-virtual {p2, v0}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 153
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainListAdapter;->chainName:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p1
.end method


# virtual methods
.method public addLocations(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 69
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 73
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->name:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/chains/ChainListAdapter;->chainName:Ljava/lang/String;

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/chains/ChainListAdapter;->locations:Ljava/util/ArrayList;

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainListAdapter;->locations:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public destroyAdapter()V
    .locals 1

    const/4 v0, 0x0

    .line 61
    iput-object v0, p0, Lcom/shopkick/app/chains/ChainListAdapter;->locations:Ljava/util/ArrayList;

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainListAdapter;->locations:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 86
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainListAdapter;->locations:Ljava/util/ArrayList;

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    if-nez p1, :cond_0

    .line 120
    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/chains/ChainListAdapter;->getChainNameView(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    .line 122
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/chains/ChainListAdapter;->chainListScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/chains/ChainListScreen;

    if-eqz v0, :cond_1

    .line 124
    sget-object v1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/chains/ChainListScreen;->removeResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    .line 127
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/chains/ChainListAdapter;->getChainListView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public getViewTypeCount()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
