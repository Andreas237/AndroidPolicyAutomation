.class public Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;
.super Ljava/lang/Object;
.source "ImErrorReducer.java"


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    return-void
.end method

.method private initErrorMessage(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/customer/Customer;)Ljava/lang/String;
    .locals 3

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getFormattedRetailerHost(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object v0

    .line 64
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 65
    invoke-virtual {p2}, Lcom/ibotta/api/model/customer/Customer;->getCredentialIntegrations()Ljava/util/List;

    move-result-object p2

    .line 64
    invoke-interface {v1, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getImConnectionStatusForRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object p2

    .line 67
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer$1;->$SwitchMap$com$ibotta$api$model$im$ImConnectionStatus:[I

    invoke-virtual {p2}, Lcom/ibotta/api/model/im/ImConnectionStatus;->ordinal()I

    move-result p2

    aget p2, v1, p2

    const/4 v1, 0x1

    const/4 v2, 0x0

    packed-switch p2, :pswitch_data_0

    .line 78
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const p2, 0x7f110384

    new-array v0, v2, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 73
    :pswitch_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v0, 0x7f110383

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-interface {p2, v0, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 69
    :pswitch_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const p2, 0x7f110382

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v2

    invoke-interface {p1, p2, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private initImConnectionViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/views/im/connection/ImConnectionViewState;
    .locals 2

    .line 58
    new-instance v0, Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getLargeIconUrl()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/ibotta/android/views/im/connection/ImConnectionViewState;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method private initImDetailHeaderViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/customer/Customer;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;
    .locals 2

    .line 42
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;->initErrorMessage(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/customer/Customer;)Ljava/lang/String;

    move-result-object p2

    .line 43
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;->initTitleText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object v0

    .line 44
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;->initImConnectionViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    move-result-object p1

    .line 46
    new-instance v1, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    invoke-direct {v1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;-><init>()V

    .line 47
    invoke-virtual {v1, v0}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->titleText(Ljava/lang/String;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    move-result-object v0

    .line 48
    invoke-virtual {v0, p2}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->primaryMessage(Ljava/lang/String;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    move-result-object p2

    .line 49
    invoke-virtual {p2, p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->imConnectionViewState(Lcom/ibotta/android/views/im/connection/ImConnectionViewState;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->build()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object p1

    return-object p1
.end method

.method private initTitleText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;
    .locals 3

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f110388

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public create(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/customer/Customer;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState;
    .locals 1
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/api/model/customer/Customer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_1

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 31
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;->initImDetailHeaderViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/customer/Customer;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object p1

    .line 33
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState;->builder()Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState$Builder;

    move-result-object p2

    .line 34
    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState$Builder;->imDetailHeaderViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState$Builder;

    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState;

    move-result-object p1

    goto :goto_1

    .line 29
    :cond_1
    :goto_0
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState;

    :goto_1
    return-object p1
.end method
