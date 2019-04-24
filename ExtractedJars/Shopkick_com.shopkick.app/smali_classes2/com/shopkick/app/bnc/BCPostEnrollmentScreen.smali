.class public Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "BCPostEnrollmentScreen.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;


# static fields
.field public static final BUY_AND_COLLECT_ENROLL_COMPLETE:Ljava/lang/String; = "BUY_AND_COLLECT_ENROLL_COMPLETE"


# instance fields
.field apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

.field private listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

.field private listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

.field logger:Lcom/shopkick/app/application/SKLogger;

.field private loyaltyProgramId:I

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private numCardsPreviouslyEnrolled:I

.field private progress:Landroid/widget/ProgressBar;

.field private screenContent:Landroid/view/View;

.field successCallbackRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectSuccessCallbackRequest;

.field userAcct:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private createScreenForNewBCPostEnrollmentView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    const/4 v0, 0x0

    const v1, 0x7f0c0030

    .line 91
    invoke-virtual {p1, v1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f110050

    .line 92
    invoke-virtual {p0, p2}, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->setAppScreenTitle(I)V

    const p2, 0x7f09054a

    .line 93
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->progress:Landroid/widget/ProgressBar;

    const p2, 0x7f090626

    .line 94
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->screenContent:Landroid/view/View;

    .line 95
    iget-object p2, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->progress:Landroid/widget/ProgressBar;

    invoke-virtual {p2, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 96
    iget-object p2, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->screenContent:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    const p2, 0x7f09041a

    .line 98
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    .line 99
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x15

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 100
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    const/4 v3, 0x1

    .line 101
    iput-boolean v3, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 102
    iget-object v4, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, v0, v4, v1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 103
    new-instance v0, Lcom/shopkick/app/bnc/-$$Lambda$BCPostEnrollmentScreen$Vhv1ibsyQfX1QbPYRZESWovW81M;

    invoke-direct {v0, p0}, Lcom/shopkick/app/bnc/-$$Lambda$BCPostEnrollmentScreen$Vhv1ibsyQfX1QbPYRZESWovW81M;-><init>(Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090282

    .line 104
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    .line 105
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x14

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 106
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 107
    iput-boolean v3, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 108
    iget-object v2, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, v0, v2, v1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 109
    new-instance v0, Lcom/shopkick/app/bnc/-$$Lambda$BCPostEnrollmentScreen$dVHLKE2WoZ1851Brv2iX2E3ag1g;

    invoke-direct {v0, p0}, Lcom/shopkick/app/bnc/-$$Lambda$BCPostEnrollmentScreen$dVHLKE2WoZ1851Brv2iX2E3ag1g;-><init>(Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p1
.end method

.method public static synthetic lambda$createScreenForNewBCPostEnrollmentView$21(Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;Landroid/view/View;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->showLoyaltyChooser()V

    return-void
.end method

.method public static synthetic lambda$createScreenForNewBCPostEnrollmentView$22(Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;Landroid/view/View;)V
    .locals 2

    .line 110
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v0, "stores_filter_type"

    const/4 v1, 0x0

    .line 112
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 111
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    const-class v0, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v1, Lcom/shopkick/app/store/FilteredStoresScreen;

    invoke-virtual {p0, v0, v1, p1}, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method private showLoyaltyChooser()V
    .locals 10

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->canEnrollAnotherVisaCard(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v6, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v6, v2

    .line 142
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->canEnrollAnotherMastercardCard(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move v7, v1

    goto :goto_3

    :cond_3
    :goto_2
    move v7, v2

    .line 143
    :goto_3
    new-instance v0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    invoke-virtual {p0}, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    iget-object v5, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v9, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    move-object v3, v0

    move-object v8, p0

    invoke-direct/range {v3 .. v9}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;-><init>(Landroid/app/Activity;Lcom/shopkick/app/application/ClientFlagsManager;ZZLcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    .line 149
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->showDialog()V

    return-void
.end method

.method private updateScreen()V
    .locals 2

    .line 153
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->successCallbackRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectSuccessCallbackRequest;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    if-nez v0, :cond_0

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->progress:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 155
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->screenContent:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 156
    sget-object v0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->removeResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public buttonTapped(I)V
    .locals 2

    .line 181
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    if-eqz v0, :cond_0

    .line 182
    invoke-virtual {v0}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->dismissDialog()V

    const/4 v0, 0x0

    .line 183
    iput-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    .line 185
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    const-string p1, "origin_element"

    const/16 v1, 0x19

    .line 187
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    const-class p1, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->setRootScreenForCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    if-ne p1, v1, :cond_2

    const-string p1, "origin_element"

    const/16 v1, 0x1a

    .line 190
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    const-class p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->setRootScreenForCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 162
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->successCallbackRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectSuccessCallbackRequest;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    .line 164
    iput-object v1, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->successCallbackRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectSuccessCallbackRequest;

    .line 165
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->updateScreen()V

    goto :goto_0

    .line 166
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    if-ne p1, v0, :cond_2

    .line 167
    iput-object v1, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    .line 168
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_1

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_1

    .line 169
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    iput-object p1, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    .line 171
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->updateScreen()V

    :cond_2
    :goto_0
    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 79
    new-instance p3, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectSuccessCallbackRequest;

    invoke-direct {p3}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectSuccessCallbackRequest;-><init>()V

    iput-object p3, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->successCallbackRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectSuccessCallbackRequest;

    .line 80
    iget-object p3, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->successCallbackRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectSuccessCallbackRequest;

    iget v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->loyaltyProgramId:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p3, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectSuccessCallbackRequest;->loyaltyProgramId:Ljava/lang/Integer;

    .line 81
    iget-object p3, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->successCallbackRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectSuccessCallbackRequest;

    iget v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->numCardsPreviouslyEnrolled:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p3, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectSuccessCallbackRequest;->numCardsPreviouslyEnrolled:Ljava/lang/Integer;

    .line 82
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->createScreenForNewBCPostEnrollmentView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 83
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    .line 84
    iget-object p2, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object p3, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    invoke-virtual {p2, p3, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    .line 85
    iget-object p2, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object p3, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->successCallbackRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectSuccessCallbackRequest;

    invoke-virtual {p2, p3, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    .line 86
    iget-object p2, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "BUY_AND_COLLECT_ENROLL_COMPLETE"

    invoke-virtual {p2, p3}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-object p1
.end method

.method public dialogCanceled()V
    .locals 1

    const/4 v0, 0x0

    .line 197
    iput-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    return-void
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 64
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 65
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iput-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 66
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 67
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 68
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p1, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    const-string p1, "loyalty_program_id"

    .line 70
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->toInteger(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->loyaltyProgramId:I

    const-string p1, "num_previous_cards"

    .line 72
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->toInteger(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->numCardsPreviouslyEnrolled:I

    .line 73
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->addResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 121
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->successCallbackRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectSuccessCallbackRequest;

    if-eqz v0, :cond_0

    .line 122
    iget-object v1, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 124
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    if-eqz v0, :cond_1

    .line 125
    iget-object v1, p0, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 127
    :cond_1
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public requestResult()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    .line 136
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public shouldHideBack()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
