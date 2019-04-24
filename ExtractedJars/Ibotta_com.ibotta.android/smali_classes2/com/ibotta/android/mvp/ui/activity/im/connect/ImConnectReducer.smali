.class public Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;
.super Ljava/lang/Object;
.source "ImConnectReducer.java"


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final flippedFlowVariant:Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

.field private final imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/factory/VariantFactory;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 33
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    const-string p1, "flipped_flow"

    .line 34
    const-class p2, Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    invoke-interface {p4, p1, p2}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->flippedFlowVariant:Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    return-void
.end method

.method private createViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Z)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;
    .locals 4

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->initInstructionsText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Z)Ljava/lang/String;

    move-result-object v0

    .line 47
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->flippedFlowVariant:Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 48
    invoke-interface {v3, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getFormattedRetailerHost(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object v3

    .line 47
    invoke-interface {v1, v2, v3, p2}, Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;->getConnectButtonString(Lcom/ibotta/android/util/AppHelper;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    .line 49
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->initLinkTextViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Z)Lcom/ibotta/android/views/base/text/LinkTextViewState;

    move-result-object v2

    .line 51
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->initImDetailHeaderViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object v0

    .line 53
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->builder()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;

    move-result-object v3

    .line 54
    invoke-virtual {v3, v0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;->imDetailHeaderViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;

    move-result-object v0

    .line 55
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;->buttonText(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;

    move-result-object v0

    .line 56
    invoke-virtual {v0, v2}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;->linkTextViewState(Lcom/ibotta/android/views/base/text/LinkTextViewState;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;

    move-result-object v0

    .line 57
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->initLinkAction(Z)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;->linkAction(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;

    move-result-object v0

    .line 58
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->initButtonAction(Z)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;->buttonAction(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;

    move-result-object p2

    .line 59
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->initDisclaimerRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;->disclaimer(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;

    move-result-object p1

    .line 60
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;

    move-result-object p1

    return-object p1
.end method

.method private initButtonAction(Z)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->flippedFlowVariant:Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    invoke-interface {v0}, Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;->isFlippedFlow()Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 120
    :cond_0
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->CREATE:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    return-object p1

    .line 119
    :cond_1
    :goto_0
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->LOGIN:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    return-object p1
.end method

.method private initDisclaimerRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;
    .locals 3

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 66
    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getImDataDisclaimerRetailers()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    .line 67
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p1

    .line 64
    invoke-static {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImDisclaimerHelper;->getDisclaimerText(Lcom/ibotta/android/util/AppHelper;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private initImConnectTitleText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;
    .locals 3

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f11036c

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private initImConnectionViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/views/im/connection/ImConnectionViewState;
    .locals 2

    .line 83
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getLargeIconUrl()Ljava/lang/String;

    move-result-object p1

    .line 85
    new-instance v0, Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lcom/ibotta/android/views/im/connection/ImConnectionViewState;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method private initImDetailHeaderViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;
    .locals 2

    .line 71
    new-instance v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;-><init>()V

    .line 72
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->initImConnectionViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->imConnectionViewState(Lcom/ibotta/android/views/im/connection/ImConnectionViewState;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    move-result-object v0

    .line 73
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->initImConnectTitleText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->titleText(Ljava/lang/String;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    move-result-object p1

    .line 74
    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->primaryMessage(Ljava/lang/String;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    move-result-object p1

    .line 75
    invoke-virtual {p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->build()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object p1

    return-object p1
.end method

.method private initInstructionsText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Z)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz p2, :cond_0

    .line 90
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v3, 0x7f110369

    new-array v2, v2, [Ljava/lang/Object;

    .line 92
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 93
    invoke-interface {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getFormattedRetailerHost(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v0

    .line 90
    invoke-interface {p2, v3, v2}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 95
    :cond_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v3, 0x7f11038c

    new-array v2, v2, [Ljava/lang/Object;

    .line 97
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 98
    invoke-interface {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getFormattedRetailerHost(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v0

    .line 95
    invoke-interface {p2, v3, v2}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private initLinkAction(Z)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->flippedFlowVariant:Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    invoke-interface {v0}, Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;->isFlippedFlow()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->CREATE:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    return-object p1

    :cond_0
    if-eqz p1, :cond_1

    .line 127
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->LOGIN:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    return-object p1

    .line 128
    :cond_1
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->DISABLED:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    return-object p1
.end method

.method private initLinkText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;
    .locals 3

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->flippedFlowVariant:Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    invoke-interface {v2, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getFormattedRetailerHost(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;->getConnectLinkString(Lcom/ibotta/android/util/AppHelper;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private initLinkTextViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Z)Lcom/ibotta/android/views/base/text/LinkTextViewState;
    .locals 1

    if-nez p2, :cond_0

    .line 104
    sget-object p1, Lcom/ibotta/android/views/base/text/LinkTextViewState;->EMPTY:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    return-object p1

    .line 106
    :cond_0
    new-instance p2, Lcom/ibotta/android/views/base/text/LinkTextViewState;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->initLinkText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->initLinkifyText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lcom/ibotta/android/views/base/text/LinkTextViewState;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method

.method private initLinkifyText()Ljava/lang/String;
    .locals 2

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->flippedFlowVariant:Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, v1}, Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;->getConnectLinkifyString(Lcom/ibotta/android/util/AppHelper;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public create(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Z)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;
    .locals 1
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_1

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 42
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;->createViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Z)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;

    move-result-object p1

    return-object p1

    .line 39
    :cond_1
    :goto_0
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;

    return-object p1
.end method
