.class public Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "ReceiptViewerPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;"
    }
.end annotation


# instance fields
.field private position:I

.field private receiptByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private receiptId:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private receiptImgUrls:[Ljava/lang/String;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    const/4 p1, 0x0

    .line 34
    new-array p1, p1, [Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptImgUrls:[Ljava/lang/String;

    .line 41
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    return-void
.end method

.method static synthetic lambda$onFetchFinishedSuccessfully$0(Lcom/ibotta/android/service/api/job/SingleApiJob;)Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdResponse;
    .locals 0

    .line 65
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdResponse;

    return-object p0
.end method

.method static synthetic lambda$onFetchFinishedSuccessfully$1(Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdResponse;)Lcom/ibotta/api/model/receipt/Receipt;
    .locals 0

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdResponse;->getReceipt()Lcom/ibotta/api/model/receipt/Receipt;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$onFetchFinishedSuccessfully$2(Lcom/ibotta/api/model/receipt/Receipt;)Ljava/util/List;
    .locals 0

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/Receipt;->getReceiptImages()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$onFetchFinishedSuccessfully$3(Ljava/util/List;)Z
    .locals 0

    .line 68
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method static synthetic lambda$onFetchFinishedSuccessfully$4(Lcom/ibotta/api/model/receipt/ReceiptImage;)Ljava/lang/String;
    .locals 0

    .line 73
    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/ReceiptImage;->getUrl()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$onFetchFinishedSuccessfully$5(Ljava/lang/String;)Z
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private processReceivedImageUrls()V
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptImgUrls:[Ljava/lang/String;

    array-length v0, v0

    if-gtz v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;->showFailedToLoadReceipt()V

    goto :goto_0

    .line 141
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->updateView()V

    :goto_0
    return-void
.end method

.method private updateView()V
    .locals 5

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptImgUrls:[Ljava/lang/String;

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-le v0, v2, :cond_2

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;

    invoke-interface {v0, v2}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;->showNavButtons(Z)V

    .line 149
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->position:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 150
    :goto_0
    iget v3, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->position:I

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptImgUrls:[Ljava/lang/String;

    array-length v4, v4

    sub-int/2addr v4, v2

    if-ge v3, v4, :cond_1

    const/4 v1, 0x1

    .line 152
    :cond_1
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v3, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;

    invoke-interface {v3, v0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;->showLeftButton(Z)V

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;->showRightButton(Z)V

    goto :goto_1

    .line 155
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;->showNavButtons(Z)V

    .line 158
    :goto_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptImgUrls:[Ljava/lang/String;

    iget v3, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->position:I

    aget-object v1, v1, v3

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;->loadUrl(Ljava/lang/String;)V

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->position:I

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptImgUrls:[Ljava/lang/String;

    array-length v2, v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;->updateTitle(II)V

    return-void
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 46
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 48
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 49
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptId:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdCall;-><init>(II)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 50
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method

.method public getReceiptImgUrls()[Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptImgUrls:[Ljava/lang/String;

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 2

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 64
    invoke-static {v0}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$M-QfXgvUiOfimBgYX4sNBQ-m8Po;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$M-QfXgvUiOfimBgYX4sNBQ-m8Po;

    .line 65
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$BNYOCM38HfrWKlyYd8hm3Sr94w8;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$BNYOCM38HfrWKlyYd8hm3Sr94w8;

    .line 66
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$3afWUBveppNA3b9uZUAcUSsiMew;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$3afWUBveppNA3b9uZUAcUSsiMew;

    .line 67
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$yv9Ed-ynQeBgGxJJEHEz727tBfg;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$yv9Ed-ynQeBgGxJJEHEz727tBfg;

    .line 68
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->filter(Ljava9/util/function/Predicate;)Ljava9/util/Optional;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 69
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 72
    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$Id9SfgtD90JkFsjLDVltrOTqcuo;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$Id9SfgtD90JkFsjLDVltrOTqcuo;

    .line 73
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$L4b8g3ibpsxcj7mLh_b3o-C_1yM;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/receipt/-$$Lambda$ReceiptViewerPresenterImpl$L4b8g3ibpsxcj7mLh_b3o-C_1yM;

    .line 74
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 75
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 77
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptImgUrls:[Ljava/lang/String;

    .line 79
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->processReceivedImageUrls()V

    return-void
.end method

.method public onLeftClicked()V
    .locals 2

    .line 121
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->position:I

    add-int/lit8 v1, v0, -0x1

    if-ltz v1, :cond_0

    add-int/lit8 v0, v0, -0x1

    .line 122
    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->position:I

    .line 125
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->updateView()V

    return-void
.end method

.method public onReceiptLoadError()V
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;->hideScreenLoading()V

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;->showFailedToLoadReceipt()V

    return-void
.end method

.method public onReceiptLoadFinished()V
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;->hideScreenLoading()V

    return-void
.end method

.method public onReceiptLoadStarted()V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;->showScreenLoading()V

    return-void
.end method

.method public onRightClicked()V
    .locals 3

    .line 130
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->position:I

    add-int/lit8 v1, v0, 0x1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptImgUrls:[Ljava/lang/String;

    array-length v2, v2

    if-ge v1, v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 131
    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->position:I

    .line 134
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->updateView()V

    return-void
.end method

.method public setParameters(Ljava/lang/Integer;[Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 89
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptId:Ljava/lang/Integer;

    if-eqz p2, :cond_0

    .line 92
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptImgUrls:[Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 94
    new-array p2, p2, [Ljava/lang/String;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->receiptImgUrls:[Ljava/lang/String;

    :goto_0
    if-nez p1, :cond_1

    .line 99
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenterImpl;->processReceivedImageUrls()V

    :cond_1
    return-void
.end method
