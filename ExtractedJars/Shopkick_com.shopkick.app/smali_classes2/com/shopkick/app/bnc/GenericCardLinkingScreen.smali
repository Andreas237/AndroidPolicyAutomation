.class public Lcom/shopkick/app/bnc/GenericCardLinkingScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "GenericCardLinkingScreen.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/bnc/LinkedCardsViewController$ILinkedCardsViewCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/bnc/GenericCardLinkingScreen$LearnMoreClickListener;,
        Lcom/shopkick/app/bnc/GenericCardLinkingScreen$ActionButtonClickListener;
    }
.end annotation


# static fields
.field private static final HOW_IT_WORKS_BANNER_1X_HEIGHT:I = 0x64

.field private static final HOW_IT_WORKS_BANNER_1X_WIDTH:I = 0x140


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private cardsViewController:Lcom/shopkick/app/bnc/LinkedCardsViewController;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private contentView:Landroid/widget/ScrollView;

.field private dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

.field private listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

.field private listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

.field private mainView:Landroid/view/View;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/bnc/GenericCardLinkingScreen;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->showLoyaltyProgramDialog()V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/bnc/GenericCardLinkingScreen;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->launchLearnMoreWebView()V

    return-void
.end method

.method private configureActionButton(Landroid/view/View;I)V
    .locals 4

    const v0, 0x7f090014

    .line 162
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    .line 164
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0xf

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 165
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    const/4 v3, 0x1

    .line 166
    iput-boolean v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 167
    iget-object v3, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v1, v3, v2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 169
    new-instance v1, Lcom/shopkick/app/bnc/GenericCardLinkingScreen$ActionButtonClickListener;

    invoke-direct {v1, p0}, Lcom/shopkick/app/bnc/GenericCardLinkingScreen$ActionButtonClickListener;-><init>(Lcom/shopkick/app/bnc/GenericCardLinkingScreen;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 170
    invoke-virtual {v0, p2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    const p2, 0x7f0900c0

    .line 171
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const p2, 0x7f110098

    .line 172
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method private launchLearnMoreWebView()V
    .locals 3

    .line 186
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x78

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 187
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 189
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;->aboutWebviewSkUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method

.method private populateView()V
    .locals 10

    .line 124
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->mainView:Landroid/view/View;

    const v1, 0x7f090434

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->contentView:Landroid/widget/ScrollView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->setVisibility(I)V

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->mainView:Landroid/view/View;

    const v3, 0x7f0902ec

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 128
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 129
    invoke-virtual {v3, v2, v2, v2, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 130
    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->mainView:Landroid/view/View;

    const v3, 0x7f0902ee

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 132
    iget-object v3, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->mainView:Landroid/view/View;

    const v4, 0x7f0902ed

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 133
    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->mainView:Landroid/view/View;

    const v5, 0x7f090229

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 134
    iget-object v5, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->mainView:Landroid/view/View;

    const v6, 0x7f090063

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const/16 v6, 0x140

    const/16 v7, 0x64

    .line 135
    invoke-static {v5, v6, v7}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithEqualDimensionScaling(Landroid/view/View;II)V

    .line 138
    iget-object v5, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->mainView:Landroid/view/View;

    const v6, 0x7f09041e

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 139
    iget-object v6, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->mainView:Landroid/view/View;

    const v7, 0x7f0906db

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    .line 140
    iget-object v7, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->mainView:Landroid/view/View;

    const v8, 0x7f0906da

    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 141
    iget-object v8, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->mainView:Landroid/view/View;

    const v9, 0x7f09040b

    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    new-instance v9, Lcom/shopkick/app/bnc/GenericCardLinkingScreen$LearnMoreClickListener;

    invoke-direct {v9, p0}, Lcom/shopkick/app/bnc/GenericCardLinkingScreen$LearnMoreClickListener;-><init>(Lcom/shopkick/app/bnc/GenericCardLinkingScreen;)V

    invoke-virtual {v8, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 142
    iget-object v8, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;->enrolledCards:Ljava/util/List;

    if-eqz v8, :cond_0

    iget-object v8, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;->enrolledCards:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_0

    .line 143
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 144
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f11009e

    .line 145
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(I)V

    .line 146
    invoke-virtual {v5, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 147
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    .line 148
    invoke-virtual {v7, v1}, Landroid/view/View;->setVisibility(I)V

    .line 149
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->cardsViewController:Lcom/shopkick/app/bnc/LinkedCardsViewController;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;->enrolledCards:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->configureEnrolledCards(Ljava/util/List;)V

    goto :goto_0

    .line 151
    :cond_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 152
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f11009f

    .line 153
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(I)V

    .line 154
    invoke-virtual {v5, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 155
    invoke-virtual {v6, v2}, Landroid/view/View;->setVisibility(I)V

    .line 156
    invoke-virtual {v7, v2}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f110097

    .line 157
    invoke-direct {p0, v6, v0}, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->configureActionButton(Landroid/view/View;I)V

    :goto_0
    return-void
.end method

.method private refresh()V
    .locals 3

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->contentView:Landroid/widget/ScrollView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setVisibility(I)V

    .line 115
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->mainView:Landroid/view/View;

    const v2, 0x7f0906db

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 116
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    if-nez v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->mainView:Landroid/view/View;

    const v1, 0x7f090434

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 118
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    .line 119
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_0
    return-void
.end method

.method private showLoyaltyProgramDialog()V
    .locals 8

    .line 176
    new-instance v7, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    invoke-virtual {p0}, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    .line 178
    invoke-static {v0}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->canEnrollAnotherVisaCard(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)Z

    move-result v3

    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    .line 179
    invoke-static {v0}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->canEnrollAnotherMastercardCard(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)Z

    move-result v4

    iget-object v6, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    move-object v0, v7

    move-object v5, p0

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;-><init>(Landroid/app/Activity;Lcom/shopkick/app/application/ClientFlagsManager;ZZLcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object v7, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->showDialog()V

    return-void
.end method


# virtual methods
.method public buttonTapped(I)V
    .locals 2

    .line 194
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    if-eqz v0, :cond_0

    .line 195
    invoke-virtual {v0}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->dismissDialog()V

    const/4 v0, 0x0

    .line 196
    iput-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    .line 198
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    const-string p1, "origin_element"

    const/16 v1, 0x19

    .line 200
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    const-class p1, Lcom/shopkick/app/activities/BncActivity;

    const-class v1, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;

    invoke-virtual {p0, p1, v1, v0}, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    if-ne p1, v1, :cond_2

    const-string p1, "origin_element"

    const/16 v1, 0x1a

    .line 203
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    const-class p1, Lcom/shopkick/app/activities/BncActivity;

    const-class v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-virtual {p0, p1, v1, v0}, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 219
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    if-ne p1, v0, :cond_1

    .line 220
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->mainView:Landroid/view/View;

    const v0, 0x7f090434

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x0

    .line 221
    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    if-eqz p2, :cond_0

    .line 222
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_0

    .line 223
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->removeResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    .line 224
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    .line 225
    invoke-direct {p0}, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->populateView()V

    goto :goto_0

    .line 227
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    const p3, 0x7f0c00cf

    const/4 v0, 0x0

    .line 75
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->mainView:Landroid/view/View;

    const p1, 0x7f1100a5

    .line 76
    invoke-virtual {p0, p1}, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->setAppScreenTitle(I)V

    .line 77
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->mainView:Landroid/view/View;

    const p2, 0x7f09019c

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ScrollView;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->contentView:Landroid/widget/ScrollView;

    .line 78
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "BUY_AND_COLLECT_ENROLL_COMPLETE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 79
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "BUY_AND_COLLECT_UNENROLL_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 80
    new-instance p1, Lcom/shopkick/app/bnc/LinkedCardsViewController;

    .line 82
    invoke-virtual {p0}, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object p2, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->mainView:Landroid/view/View;

    const p3, 0x7f09041e

    .line 84
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    move-object v5, p2

    check-cast v5, Landroid/widget/RelativeLayout;

    iget-object v6, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v7, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v8, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    move-object v0, p1

    move-object v1, p0

    move-object v2, p0

    invoke-direct/range {v0 .. v8}, Lcom/shopkick/app/bnc/LinkedCardsViewController;-><init>(Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;Lcom/shopkick/app/bnc/LinkedCardsViewController$ILinkedCardsViewCallback;Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Landroid/widget/RelativeLayout;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)V

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->cardsViewController:Lcom/shopkick/app/bnc/LinkedCardsViewController;

    .line 88
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->mainView:Landroid/view/View;

    return-object p1
.end method

.method public dialogCanceled()V
    .locals 1

    const/4 v0, 0x0

    .line 210
    iput-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    return-void
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
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
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object p2, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 65
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 66
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p2, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 67
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p2, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 68
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p2}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 69
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 70
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->addResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    if-eqz v0, :cond_0

    .line 102
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 104
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->cardsViewController:Lcom/shopkick/app/bnc/LinkedCardsViewController;

    if-eqz v0, :cond_1

    .line 105
    invoke-virtual {v0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->destroy()V

    .line 107
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->dialogController:Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;

    if-eqz v0, :cond_2

    .line 108
    invoke-virtual {v0}, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;->destroy()V

    .line 110
    :cond_2
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "BUY_AND_COLLECT_ENROLL_COMPLETE"

    .line 234
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 235
    iput-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    goto :goto_0

    :cond_0
    const-string p2, "BUY_AND_COLLECT_UNENROLL_SUCCESS"

    .line 236
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 237
    iput-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    .line 238
    invoke-direct {p0}, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->refresh()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onLinkAnotherCardClicked()V
    .locals 0

    .line 244
    invoke-direct {p0}, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->showLoyaltyProgramDialog()V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    if-nez v0, :cond_0

    .line 94
    invoke-direct {p0}, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;->refresh()V

    :cond_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
