.class public Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;
.super Ljava/lang/Object;
.source "ImLoginReducer.java"


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final imLoginValidation:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;

.field private final imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->imLoginValidation:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 31
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method

.method private initCreateAccountLinkText(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f110392

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private initCreateAccountText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    const p1, 0x7f110391

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private initImConnectionViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/views/im/connection/ImConnectionViewState;
    .locals 2

    .line 91
    new-instance v0, Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getLargeIconUrl()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lcom/ibotta/android/views/im/connection/ImConnectionViewState;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method private initImDetailHeaderViewState(Ljava/lang/String;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;
    .locals 2

    .line 61
    new-instance v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;-><init>()V

    .line 62
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->initTitleText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->titleText(Ljava/lang/String;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    move-result-object v0

    .line 63
    invoke-direct {p0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->initInstructionsText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->primaryMessage(Ljava/lang/String;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    move-result-object p1

    .line 64
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->initImConnectionViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->imConnectionViewState(Lcom/ibotta/android/views/im/connection/ImConnectionViewState;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->build()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object p1

    return-object p1
.end method

.method private initInstructionsText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    const p1, 0x7f110394

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private initLinkTextViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;)Lcom/ibotta/android/views/base/text/LinkTextViewState;
    .locals 1

    .line 77
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->initCreateAccountText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 78
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->initCreateAccountLinkText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 80
    new-instance v0, Lcom/ibotta/android/views/base/text/LinkTextViewState;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/views/base/text/LinkTextViewState;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private initTitleText(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f110396

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private isConnectButtonEnabled(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->imLoginValidation:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;->isEmailValid(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->imLoginValidation:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;->isPasswordValid(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public create(Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;
    .locals 3
    .param p3    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p3, :cond_1

    .line 38
    invoke-virtual {p3}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    invoke-interface {v0, p3}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getFormattedRetailerHost(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object v0

    .line 43
    invoke-direct {p0, p3, v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->initLinkTextViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;)Lcom/ibotta/android/views/base/text/LinkTextViewState;

    move-result-object v1

    .line 44
    invoke-direct {p0, v0, p3}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->initImDetailHeaderViewState(Ljava/lang/String;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object v0

    .line 45
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;->builder()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;

    move-result-object v2

    .line 46
    invoke-virtual {v2, v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;->imDetailHeaderViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;

    move-result-object v0

    .line 47
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;->linkTextViewState(Lcom/ibotta/android/views/base/text/LinkTextViewState;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;

    move-result-object v0

    .line 48
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->isConnectButtonEnabled(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;->connectButtonEnabled(Z)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;

    move-result-object p1

    .line 49
    invoke-virtual {p3}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getCardSignupUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;->retailerCreateAccountUrl(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 52
    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getImDataDisclaimerRetailers()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p3}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    .line 53
    invoke-virtual {p3}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p3

    .line 50
    invoke-static {p2, v0, p3}, Lcom/ibotta/android/mvp/ui/activity/im/ImDisclaimerHelper;->getDisclaimerText(Lcom/ibotta/android/util/AppHelper;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;->disclaimer(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;

    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;

    move-result-object p1

    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;

    :goto_1
    return-object p1
.end method
