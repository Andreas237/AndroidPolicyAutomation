.class public Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;
.super Lcom/shopkick/app/webview/WebViewScreen;
.source "ProgrammaticSurveyScreen.java"


# instance fields
.field private completedUrl:Ljava/lang/String;

.field private dialogDataError:Landroid/app/Dialog;

.field private didSurveyUrlError:Z

.field private isPopping:Z

.field private surveyID:Ljava/lang/String;

.field private surveyUrl:Ljava/lang/String;

.field private termiantedUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/shopkick/app/webview/WebViewScreen;-><init>()V

    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->isPopping:Z

    return-void
.end method

.method private checkParamsForErrors()V
    .locals 2

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->surveyID:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 55
    iput-boolean v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->didSurveyUrlError:Z

    goto :goto_0

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->surveyUrl:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 59
    iput-boolean v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->didSurveyUrlError:Z

    :cond_1
    :goto_0
    return-void
.end method

.method private checkScreenValid()V
    .locals 8

    .line 72
    invoke-virtual {p0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 79
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->didSurveyUrlError:Z

    if-eqz v0, :cond_2

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->dialogDataError:Landroid/app/Dialog;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 81
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v2, 0x0

    const v0, 0x7f1106f3

    .line 82
    invoke-virtual {p0, v0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f110142

    .line 83
    invoke-virtual {p0, v4}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 84
    invoke-virtual {p0, v0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/shopkick/app/surveys/-$$Lambda$ProgrammaticSurveyScreen$llNMgorTn0pj8KBkz4bX9LvpQLE;

    invoke-direct {v6, p0}, Lcom/shopkick/app/surveys/-$$Lambda$ProgrammaticSurveyScreen$llNMgorTn0pj8KBkz4bX9LvpQLE;-><init>(Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;)V

    const/4 v7, 0x0

    .line 81
    invoke-virtual/range {v1 .. v7}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :cond_2
    return-void
.end method

.method public static synthetic lambda$checkScreenValid$242(Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 86
    invoke-virtual {p0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->popScreen()V

    .line 87
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method public static synthetic lambda$promptUserBeforeBack$243(Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;Ljava/lang/ref/WeakReference;)V
    .locals 1

    const/4 v0, 0x1

    .line 108
    iput-boolean v0, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->isPopping:Z

    .line 109
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method public static synthetic lambda$promptUserBeforeBack$244(Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;Ljava/lang/ref/WeakReference;)V
    .locals 1

    const/4 v0, 0x0

    .line 113
    iput-boolean v0, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->isPopping:Z

    .line 114
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method public static synthetic lambda$promptUserBeforeBack$245(Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;)V
    .locals 1

    .line 117
    iget-boolean v0, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->isPopping:Z

    if-eqz v0, :cond_0

    .line 118
    invoke-virtual {p0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->popScreen()V

    :cond_0
    return-void
.end method

.method private logBackButtonWithSurveyData()V
    .locals 5

    .line 191
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x13d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x19

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v0, v2, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    const/16 v2, 0xb2

    .line 192
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScreen(Ljava/lang/Integer;)V

    .line 193
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 194
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 197
    iget-object v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->surveyID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyId(Ljava/lang/String;)V

    .line 200
    iget-object v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->surveyUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyUrl(Ljava/lang/String;)V

    .line 203
    iget-object v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {v1}, Lcom/shopkick/app/webview/SKWebView;->getUrlFromActualWebView()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyWebviewCurrentUrl(Ljava/lang/String;)V

    .line 206
    iget-object v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->completedUrl:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 207
    iget-object v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->completedUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyCompletedUrl(Ljava/lang/String;)V

    .line 211
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->termiantedUrl:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 212
    iget-object v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->termiantedUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyTerminatedUrl(Ljava/lang/String;)V

    .line 215
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method private logUrlHit(Z)V
    .locals 2

    .line 219
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v1, 0xb2

    .line 220
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScreen(Ljava/lang/Integer;)V

    const/16 v1, 0x180

    .line 221
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    if-eqz p1, :cond_0

    const p1, 0xdbba2

    .line 224
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_0
    const p1, 0xdbba3

    .line 226
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    .line 230
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->surveyID:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyId(Ljava/lang/String;)V

    .line 233
    iget-object p1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->surveyUrl:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyUrl(Ljava/lang/String;)V

    .line 236
    iget-object p1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p1}, Lcom/shopkick/app/webview/SKWebView;->getUrlFromActualWebView()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyWebviewCurrentUrl(Ljava/lang/String;)V

    .line 239
    iget-object p1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->completedUrl:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 240
    iget-object p1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->completedUrl:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyCompletedUrl(Ljava/lang/String;)V

    .line 244
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->termiantedUrl:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 245
    iget-object p1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->termiantedUrl:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyTerminatedUrl(Ljava/lang/String;)V

    .line 248
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method private promptUserBeforeBack()V
    .locals 10

    .line 97
    iget-object v0, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 98
    invoke-virtual {p0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->popScreen()V

    return-void

    .line 103
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v2, 0x1

    const v0, 0x7f1106f5

    .line 104
    invoke-virtual {p0, v0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v0, 0x7f1106f4

    .line 105
    invoke-virtual {p0, v0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v0, 0x7f1106f3

    .line 106
    invoke-virtual {p0, v0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/shopkick/app/surveys/-$$Lambda$ProgrammaticSurveyScreen$xxxc5MDHorciXbhQL_lAvPWCeaA;

    invoke-direct {v6, p0}, Lcom/shopkick/app/surveys/-$$Lambda$ProgrammaticSurveyScreen$xxxc5MDHorciXbhQL_lAvPWCeaA;-><init>(Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;)V

    const v0, 0x7f1106f2

    .line 111
    invoke-virtual {p0, v0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lcom/shopkick/app/surveys/-$$Lambda$ProgrammaticSurveyScreen$BxGycMo3NXcbnifgsXBML9M1UJA;

    invoke-direct {v8, p0}, Lcom/shopkick/app/surveys/-$$Lambda$ProgrammaticSurveyScreen$BxGycMo3NXcbnifgsXBML9M1UJA;-><init>(Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;)V

    new-instance v9, Lcom/shopkick/app/surveys/-$$Lambda$ProgrammaticSurveyScreen$Xb4NVuNDl5TcZAfMRFjzpnXWURA;

    invoke-direct {v9, p0}, Lcom/shopkick/app/surveys/-$$Lambda$ProgrammaticSurveyScreen$Xb4NVuNDl5TcZAfMRFjzpnXWURA;-><init>(Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;)V

    .line 103
    invoke-virtual/range {v1 .. v9}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogConfirmOrDeny(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void
.end method


# virtual methods
.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 2

    .line 127
    iget-boolean v0, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->isPopping:Z

    if-eqz v0, :cond_0

    .line 128
    invoke-direct {p0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->logBackButtonWithSurveyData()V

    .line 129
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->PERFORM_SCREEN_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0

    .line 133
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->completedUrl:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {v0}, Lcom/shopkick/app/webview/SKWebView;->getUrlFromActualWebView()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->completedUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 134
    invoke-direct {p0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->logBackButtonWithSurveyData()V

    .line 135
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->PERFORM_SCREEN_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0

    .line 137
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->promptUserBeforeBack()V

    .line 138
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->DONT_GO_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 151
    invoke-super {p0, p1, p2, p3}, Lcom/shopkick/app/webview/WebViewScreen;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 156
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0xdbba5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    const/16 v1, 0xb2

    .line 157
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScreen(Ljava/lang/Integer;)V

    .line 159
    iget-object v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->surveyID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyId(Ljava/lang/String;)V

    .line 160
    iget-object v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->surveyUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyUrl(Ljava/lang/String;)V

    .line 161
    iget-object v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->completedUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyCompletedUrl(Ljava/lang/String;)V

    .line 162
    iget-object v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->termiantedUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyTerminatedUrl(Ljava/lang/String;)V

    .line 163
    iget-object v1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {v1}, Lcom/shopkick/app/webview/SKWebView;->getUrlFromActualWebView()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyWebviewCurrentUrl(Ljava/lang/String;)V

    .line 165
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "errorCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "    -    desc: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "    -    url: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "    -    webView.getOriginalUrl(): "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    invoke-virtual {p1}, Landroid/webkit/WebView;->getOriginalUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 165
    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSurveyWebviewErrorInfo(Ljava/lang/String;)V

    .line 171
    iget-object p1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 0

    .line 65
    invoke-super {p0}, Lcom/shopkick/app/webview/WebViewScreen;->onScreenDidShow()V

    .line 67
    invoke-direct {p0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->checkScreenValid()V

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

    .line 43
    invoke-super {p0, p1}, Lcom/shopkick/app/webview/WebViewScreen;->setParams(Ljava/util/Map;)V

    const-string/jumbo v0, "surveyId"

    .line 44
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->surveyID:Ljava/lang/String;

    const-string/jumbo v0, "surveyUrl"

    .line 45
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->surveyUrl:Ljava/lang/String;

    const-string v0, "completedUrl"

    .line 46
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->completedUrl:Ljava/lang/String;

    const-string/jumbo v0, "terminatedUrl"

    .line 47
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->termiantedUrl:Ljava/lang/String;

    .line 48
    invoke-direct {p0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->checkParamsForErrors()V

    return-void
.end method

.method protected setWebViewStatusCallback()V
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/webview/SKWebView;->setStatusCallback(Lcom/shopkick/app/webview/IWebViewStatusCallback;)V

    return-void
.end method

.method public shouldOverrideURLLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    .line 177
    invoke-static {p2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    .line 178
    iget-object p1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->completedUrl:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->completedUrl:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 179
    invoke-direct {p0, p1}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->logUrlHit(Z)V

    goto :goto_0

    .line 180
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->termiantedUrl:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->termiantedUrl:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 181
    invoke-direct {p0, v0}, Lcom/shopkick/app/surveys/ProgrammaticSurveyScreen;->logUrlHit(Z)V

    :cond_1
    :goto_0
    return v0
.end method
