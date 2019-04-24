.class public Lcom/shopkick/app/surveys/PreSurveyScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "PreSurveyScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field public static final EVENT_REQUEST_SURVEY_DATA_ERROR:Ljava/lang/String; = "EventRequestSurveyError"

.field public static final EVENT_REQUEST_SURVEY_DATA_SUCCESS:Ljava/lang/String; = "EventRequestSurveySuccess"

.field private static final HARDCODED_LUCID_PRIVACY_POLICY_URL:Ljava/lang/String; = "https://luc.id/privacy-policy/"

.field public static final PARAM_RESPONSE_FAILURE_REASON:Ljava/lang/String; = "ParamResponseFailureReason"

.field public static final PARAM_SURVEY_ID:Ljava/lang/String; = "ParamSurveyId"

.field public static final PARAM_SURVEY_TILE_NEW_STATE:Ljava/lang/String; = "ParamSurveyTileNewState"

.field public static final PARAM_SURVEY_URL:Ljava/lang/String; = "ParamSurveyUrl"

.field public static final PARAM_SURVEY_URL_COMPLETED:Ljava/lang/String; = "ParamSurveyUrlCompleted"

.field public static final PARAM_SURVEY_URL_TERMINATED:Ljava/lang/String; = "ParamSurveyUrlTerminated"

.field private static final SPANNABLE_DEFAULT_LENGTH:I = 0xf


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private btnNegative:Lcom/shopkick/app/widget/SKButton;

.field private btnPositive:Lcom/shopkick/app/widget/SKButton;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private legalView:Landroid/widget/TextView;

.field private mHandler:Landroid/os/Handler;

.field private mainView:Landroid/view/ViewGroup;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private progressPositive:Landroid/widget/ProgressBar;

.field private requestSurveyUrl:Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlRequest;

.field private surveyTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private forceResponseFailureWithReason(I)V
    .locals 2

    .line 287
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "ParamResponseFailureReason"

    .line 288
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    iget-object p1, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EventRequestSurveyError"

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 290
    invoke-virtual {p0}, Lcom/shopkick/app/surveys/PreSurveyScreen;->popScreen()V

    return-void
.end method

.method private instantiateViews()V
    .locals 2

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f090629

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->btnNegative:Lcom/shopkick/app/widget/SKButton;

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09062a

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->btnPositive:Lcom/shopkick/app/widget/SKButton;

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09062b

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->progressPositive:Landroid/widget/ProgressBar;

    .line 135
    iget-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09062d

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->legalView:Landroid/widget/TextView;

    return-void
.end method

.method private logResponseFailure(ILjava/lang/Integer;)V
    .locals 2

    .line 319
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0xdbba1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    const/16 v1, 0xb3

    .line 320
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScreen(Ljava/lang/Integer;)V

    .line 323
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setHttpStatusCode(Ljava/lang/Integer;)V

    .line 326
    iget-object p1, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->surveyTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->surveyId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyId(Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 329
    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 330
    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPreSurveyScreenRequestFailureReason(Ljava/lang/Integer;)V

    .line 333
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method private logResponseSuccess(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 294
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0xdbba0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    const/16 v1, 0xb3

    .line 295
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScreen(Ljava/lang/Integer;)V

    .line 298
    iget-object v1, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->surveyTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->surveyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyId(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const-string v1, "ParamSurveyUrl"

    .line 301
    invoke-interface {p1, v1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "ParamSurveyUrl"

    .line 302
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyUrl(Ljava/lang/String;)V

    :cond_0
    if-eqz p1, :cond_1

    const-string v1, "ParamSurveyUrlCompleted"

    .line 306
    invoke-interface {p1, v1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "ParamSurveyUrlCompleted"

    .line 307
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyCompletedUrl(Ljava/lang/String;)V

    :cond_1
    if-eqz p1, :cond_2

    const-string v1, "ParamSurveyUrlTerminated"

    .line 311
    invoke-interface {p1, v1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "ParamSurveyUrlTerminated"

    .line 312
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyTerminatedUrl(Ljava/lang/String;)V

    .line 315
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method private requestSurveyData()V
    .locals 2

    .line 215
    invoke-direct {p0}, Lcom/shopkick/app/surveys/PreSurveyScreen;->setupUIForRequest()V

    .line 216
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->requestSurveyUrl:Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlRequest;

    .line 217
    iget-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->requestSurveyUrl:Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlRequest;

    iget-object v1, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->surveyTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->surveyId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlRequest;->surveyId:Ljava/lang/String;

    .line 219
    iget-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->requestSurveyUrl:Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method private setupLoggingOnViews()V
    .locals 5

    .line 153
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x1d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    const/16 v1, 0xb3

    .line 154
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScreen(Ljava/lang/Integer;)V

    .line 155
    iget-object v2, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->btnPositive:Lcom/shopkick/app/widget/SKButton;

    iget-object v3, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v3, v4}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 162
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x13d

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x19

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 163
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScreen(Ljava/lang/Integer;)V

    .line 164
    iget-object v1, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->btnNegative:Lcom/shopkick/app/widget/SKButton;

    iget-object v2, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0, v2, v4}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method private setupUIForRequest()V
    .locals 3

    .line 203
    iget-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->btnPositive:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    .line 204
    iget-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->btnPositive:Lcom/shopkick/app/widget/SKButton;

    const-string v2, ""

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->progressPositive:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method private setupUIForRequestTimeout()V
    .locals 0

    return-void
.end method

.method private setupViews()V
    .locals 6

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->btnNegative:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->btnPositive:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->legalView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 144
    new-instance v1, Landroid/text/SpannableString;

    iget-object v2, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->legalView:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 145
    new-instance v2, Landroid/text/style/StyleSpan;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0xf

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    invoke-interface {v1, v2, v3, v4, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 146
    new-instance v2, Landroid/text/style/UnderlineSpan;

    invoke-direct {v2}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0xf

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-interface {v1, v2, v3, v0, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->legalView:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->legalView:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private showLegalWebView()V
    .locals 5

    .line 189
    invoke-virtual {p0}, Lcom/shopkick/app/surveys/PreSurveyScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    .line 190
    invoke-virtual {p0}, Lcom/shopkick/app/surveys/PreSurveyScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lcom/shopkick/app/webview/WebViewScreen;

    new-instance v4, Lcom/shopkick/app/surveys/PreSurveyScreen$1;

    invoke-direct {v4, p0}, Lcom/shopkick/app/surveys/PreSurveyScreen$1;-><init>(Lcom/shopkick/app/surveys/PreSurveyScreen;)V

    invoke-direct {v1, v2, v3, v4}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 189
    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 4

    .line 229
    iget-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->requestSurveyUrl:Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlRequest;

    if-ne p1, v0, :cond_7

    .line 230
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_6

    .line 231
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlResponse;

    .line 234
    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->surveyTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 242
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->surveyId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 243
    invoke-virtual {p2}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result p1

    const/4 p2, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/surveys/PreSurveyScreen;->logResponseFailure(ILjava/lang/Integer;)V

    .line 244
    invoke-direct {p0, p2}, Lcom/shopkick/app/surveys/PreSurveyScreen;->forceResponseFailureWithReason(I)V

    return-void

    .line 247
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->surveyTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->surveyId:Ljava/lang/String;

    .line 252
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlResponse;->tileStatusToSet:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlResponse;->tileStatusToSet:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_2

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlResponse;->tileStatusToSet:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->values()[Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    move-result-object v2

    array-length v2, v2

    if-lt v1, v2, :cond_3

    .line 253
    :cond_2
    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->ERROR:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    invoke-virtual {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->ordinal()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlResponse;->tileStatusToSet:Ljava/lang/Integer;

    .line 255
    :cond_3
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlResponse;->tileStatusToSet:Ljava/lang/Integer;

    .line 259
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlResponse;->surveyUrl:Ljava/lang/String;

    invoke-static {v2}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 260
    invoke-virtual {p2}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result p1

    const/4 p2, 0x3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/surveys/PreSurveyScreen;->logResponseFailure(ILjava/lang/Integer;)V

    .line 261
    invoke-direct {p0, p2}, Lcom/shopkick/app/surveys/PreSurveyScreen;->forceResponseFailureWithReason(I)V

    return-void

    .line 264
    :cond_4
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlResponse;->surveyUrl:Ljava/lang/String;

    .line 267
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "ParamSurveyId"

    .line 268
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "ParamSurveyUrl"

    .line 269
    invoke-virtual {v2, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "ParamSurveyUrlCompleted"

    .line 270
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlResponse;->completedSurveyUrlPath:Ljava/lang/String;

    invoke-virtual {v2, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "ParamSurveyUrlTerminated"

    .line 271
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetSurveyUrlResponse;->terminatedSurveyUrlPath:Ljava/lang/String;

    invoke-virtual {v2, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "ParamSurveyTileNewState"

    .line 272
    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    invoke-direct {p0, v2}, Lcom/shopkick/app/surveys/PreSurveyScreen;->logResponseSuccess(Ljava/util/Map;)V

    .line 275
    iget-object p1, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventRequestSurveySuccess"

    invoke-virtual {p1, p2, v2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    goto :goto_1

    .line 235
    :cond_5
    :goto_0
    invoke-virtual {p2}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result p1

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/surveys/PreSurveyScreen;->logResponseFailure(ILjava/lang/Integer;)V

    .line 236
    invoke-direct {p0, p2}, Lcom/shopkick/app/surveys/PreSurveyScreen;->forceResponseFailureWithReason(I)V

    return-void

    .line 277
    :cond_6
    invoke-virtual {p2}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result p1

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/surveys/PreSurveyScreen;->logResponseFailure(ILjava/lang/Integer;)V

    .line 278
    iget-object p1, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventRequestSurveyError"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 281
    :goto_1
    iget-object p1, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->mHandler:Landroid/os/Handler;

    new-instance p2, Lcom/shopkick/app/surveys/-$$Lambda$jaXXiuk1sNkE_KdupLoxcbJ7mUg;

    invoke-direct {p2, p0}, Lcom/shopkick/app/surveys/-$$Lambda$jaXXiuk1sNkE_KdupLoxcbJ7mUg;-><init>(Lcom/shopkick/app/surveys/PreSurveyScreen;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_7
    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c019e

    const/4 v0, 0x0

    .line 122
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->mainView:Landroid/view/ViewGroup;

    .line 124
    invoke-direct {p0}, Lcom/shopkick/app/surveys/PreSurveyScreen;->instantiateViews()V

    .line 125
    invoke-direct {p0}, Lcom/shopkick/app/surveys/PreSurveyScreen;->setupViews()V

    .line 126
    invoke-direct {p0}, Lcom/shopkick/app/surveys/PreSurveyScreen;->setupLoggingOnViews()V

    .line 128
    iget-object p1, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->mainView:Landroid/view/ViewGroup;

    return-object p1
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

    .line 98
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 99
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object v0, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 100
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p1, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 101
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->mHandler:Landroid/os/Handler;

    .line 103
    invoke-virtual {p0, p2}, Lcom/shopkick/app/surveys/PreSurveyScreen;->setParams(Ljava/util/Map;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 175
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f09062d

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 180
    :pswitch_0
    invoke-direct {p0}, Lcom/shopkick/app/surveys/PreSurveyScreen;->requestSurveyData()V

    goto :goto_0

    .line 177
    :pswitch_1
    invoke-virtual {p0}, Lcom/shopkick/app/surveys/PreSurveyScreen;->popScreen()V

    goto :goto_0

    .line 183
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/surveys/PreSurveyScreen;->showLegalWebView()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7f090629
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public setParams(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 108
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->setParams(Ljava/util/Map;)V

    if-eqz p1, :cond_1

    const-string/jumbo v0, "tile_info"

    .line 111
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string/jumbo v0, "tile_info"

    .line 115
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/surveys/PreSurveyScreen;->surveyTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public shouldDisplayAppScreenHeader()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shouldHideBack()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
