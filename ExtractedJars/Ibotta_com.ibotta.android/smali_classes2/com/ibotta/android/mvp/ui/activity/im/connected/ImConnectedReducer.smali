.class public Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;
.super Ljava/lang/Object;
.source "ImConnectedReducer.java"


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method private initButtonText()Ljava/lang/String;
    .locals 3

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const v2, 0x7f11036d

    invoke-interface {v0, v2, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private initImConnectTitleText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;
    .locals 3

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f110371

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private initImConnectionViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/views/im/connection/ImConnectionViewState;
    .locals 2

    .line 50
    new-instance v0, Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getLargeIconUrl()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lcom/ibotta/android/views/im/connection/ImConnectionViewState;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method private initImDetailHeaderViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;
    .locals 2

    .line 42
    new-instance v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;-><init>()V

    .line 43
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;->initImConnectionViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->imConnectionViewState(Lcom/ibotta/android/views/im/connection/ImConnectionViewState;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    move-result-object v0

    .line 44
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;->initImConnectTitleText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->titleText(Ljava/lang/String;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    move-result-object p1

    .line 45
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;->initInstructionsText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->primaryMessage(Ljava/lang/String;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->build()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object p1

    return-object p1
.end method

.method private initInstructionsText()Ljava/lang/String;
    .locals 3

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const v2, 0x7f11036e

    invoke-interface {v0, v2, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private initLinkTextViewState()Lcom/ibotta/android/views/base/text/LinkTextViewState;
    .locals 4

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const v3, 0x7f11036f

    invoke-interface {v0, v3, v2}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 67
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-array v1, v1, [Ljava/lang/Object;

    const v3, 0x7f110370

    invoke-interface {v2, v3, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 69
    new-instance v2, Lcom/ibotta/android/views/base/text/LinkTextViewState;

    invoke-direct {v2, v0, v1}, Lcom/ibotta/android/views/base/text/LinkTextViewState;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method


# virtual methods
.method public create(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;
    .locals 3
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 25
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;

    goto :goto_0

    .line 27
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;->initImDetailHeaderViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object p1

    .line 28
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;->initButtonText()Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;->initLinkTextViewState()Lcom/ibotta/android/views/base/text/LinkTextViewState;

    move-result-object v1

    .line 31
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;->builder()Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;

    move-result-object v2

    .line 32
    invoke-virtual {v2, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;->imDetailHeaderViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;

    move-result-object p1

    .line 33
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;->buttonText(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;

    move-result-object p1

    .line 34
    invoke-virtual {p1, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;->linkTextViewState(Lcom/ibotta/android/views/base/text/LinkTextViewState;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;

    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;

    move-result-object p1

    :goto_0
    return-object p1
.end method
