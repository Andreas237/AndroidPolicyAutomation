.class public Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;
.super Ljava/lang/Object;
.source "ImTermsReducer.java"


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 20
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    return-void
.end method

.method private initImConnectionViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/views/im/connection/ImConnectionViewState;
    .locals 2

    .line 58
    new-instance v0, Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getLargeIconUrl()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lcom/ibotta/android/views/im/connection/ImConnectionViewState;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method private initImDetailHeaderViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;
    .locals 2

    .line 46
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;->initImConnectionViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    move-result-object v0

    .line 47
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;->initTitleText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 48
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;->initPrimaryMessage(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object p1

    .line 50
    new-instance v1, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    invoke-direct {v1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;-><init>()V

    .line 51
    invoke-virtual {v1, v0}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->imConnectionViewState(Lcom/ibotta/android/views/im/connection/ImConnectionViewState;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    move-result-object v0

    .line 52
    invoke-virtual {v0, p2}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->titleText(Ljava/lang/String;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    move-result-object p2

    .line 53
    invoke-virtual {p2, p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->primaryMessage(Ljava/lang/String;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->build()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object p1

    return-object p1
.end method

.method private initPrimaryMessage(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;
    .locals 3

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f11039c

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private initShareInfo()Ljava/lang/String;
    .locals 3

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const v2, 0x7f11039e

    invoke-interface {v0, v2, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private initTitleText(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f110396

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public create(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;
    .locals 2
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_1

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getFormattedRetailerHost(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object v0

    .line 31
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;->initImDetailHeaderViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object p1

    .line 33
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;->initShareInfo()Ljava/lang/String;

    move-result-object v0

    .line 35
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;->builder()Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;

    move-result-object v1

    .line 36
    invoke-virtual {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;->imDetailHeaderViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;

    move-result-object p1

    .line 37
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;->shareInfo(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;

    move-result-object p1

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;

    move-result-object p1

    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;

    :goto_1
    return-object p1
.end method
