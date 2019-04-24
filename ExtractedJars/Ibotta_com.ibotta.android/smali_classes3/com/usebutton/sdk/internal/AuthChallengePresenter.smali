.class public Lcom/usebutton/sdk/internal/AuthChallengePresenter;
.super Lcom/usebutton/sdk/internal/base/BasePresenter;
.source "AuthChallengePresenter.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/core/FailableReceiver;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/usebutton/sdk/internal/base/BasePresenter<",
        "Lcom/usebutton/sdk/internal/AuthChallengeController;",
        ">;",
        "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field static final AUTH_RESULT_DENIED:Ljava/lang/String; = "denied"

.field static final AUTH_RESULT_ERROR:Ljava/lang/String; = "error"

.field static final AUTH_RESULT_SUCCESS:Ljava/lang/String; = "success"

.field private static final TAG:Ljava/lang/String; = "AuthChallengePresenter"


# instance fields
.field private authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

.field private final button:Lcom/usebutton/sdk/internal/ButtonPrivate;

.field private metaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/ButtonPrivate;Lcom/usebutton/sdk/internal/models/AuthChallenge;Lcom/usebutton/sdk/internal/models/MetaInfo;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/base/BasePresenter;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->button:Lcom/usebutton/sdk/internal/ButtonPrivate;

    .line 32
    iput-object p2, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    .line 33
    iput-object p3, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->metaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    return-void
.end method

.method private extractAuthResult(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "error"

    .line 143
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->splitQuery(Ljava/net/URL;)Ljava/util/Map;

    move-result-object p1

    .line 144
    iget-object v1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->getAuthResultQueryKey()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 146
    invoke-virtual {p1}, Ljava/net/MalformedURLException;->printStackTrace()V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method private handleAuthResult(Ljava/lang/String;)V
    .locals 2

    .line 153
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x6f4abffd

    if-eq v0, v1, :cond_2

    const v1, -0x4f988465

    if-eq v0, v1, :cond_1

    const v1, 0x5c4d208

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "error"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    const-string v0, "denied"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "success"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 161
    :pswitch_0
    invoke-static {}, Lcom/usebutton/sdk/internal/AuthChallengeObserver;->getInstance()Lcom/usebutton/sdk/internal/AuthChallengeObserver;

    move-result-object p1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/AuthChallengeObserver;->onAuthSuccess()V

    .line 162
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/AuthChallengeController;

    if-eqz p1, :cond_4

    .line 164
    invoke-interface {p1}, Lcom/usebutton/sdk/internal/AuthChallengeController;->finishAuthActivity()V

    goto :goto_2

    .line 158
    :pswitch_1
    iget-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->getAccessDeniedText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->setStatusText(Lcom/usebutton/sdk/internal/models/Text;)V

    goto :goto_2

    .line 155
    :pswitch_2
    iget-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->getGeneralErrorText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->setStatusText(Lcom/usebutton/sdk/internal/models/Text;)V

    :cond_4
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private setStatusText(Lcom/usebutton/sdk/internal/models/Text;)V
    .locals 2

    .line 174
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/AuthChallengeController;

    if-nez v0, :cond_0

    return-void

    .line 178
    :cond_0
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Text;->getColor()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/internal/AuthChallengeController;->setStatusTextColor(I)V

    .line 179
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/AuthChallengeController;->setStatusTextCopy(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method onAuthChallengeStart()V
    .locals 4

    .line 37
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/AuthChallengeController;

    if-nez v0, :cond_0

    return-void

    .line 42
    :cond_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    if-nez v1, :cond_1

    const-string v1, "AuthChallengePresenter"

    const-string v2, "Unable to start auth challenge activity - auth challenge is null"

    .line 43
    invoke-static {v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/AuthChallengeController;->finishAuthActivity()V

    .line 47
    :cond_1
    iget-object v1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->getWebViewLoadingText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->setStatusText(Lcom/usebutton/sdk/internal/models/Text;)V

    .line 49
    iget-object v1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->isSSOType()Z

    move-result v1

    if-eqz v1, :cond_2

    const-wide/16 v1, 0x3e8

    .line 50
    invoke-interface {v0, v1, v2}, Lcom/usebutton/sdk/internal/AuthChallengeController;->showProgress(J)V

    goto :goto_0

    .line 51
    :cond_2
    iget-object v1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->isOAuth2Type()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 52
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/AuthChallengeController;->showProgress()V

    .line 53
    iget-object v1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->getAuthUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/internal/AuthChallengeController;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const-string v1, "Unknown auth type: %s"

    .line 55
    iget-object v2, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->getType()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/AuthChallengeController;->finishAuthActivity()V

    :goto_0
    return-void
.end method

.method onCancelButtonClick()V
    .locals 1

    .line 100
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/AuthChallengeController;

    if-nez v0, :cond_0

    return-void

    .line 105
    :cond_0
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/AuthChallengeController;->finishAuthActivity()V

    return-void
.end method

.method public onError()V
    .locals 1

    .line 193
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/AuthChallengeController;

    if-eqz v0, :cond_0

    .line 195
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/AuthChallengeController;->hideProgress()V

    :cond_0
    const-string v0, "error"

    .line 197
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->handleAuthResult(Ljava/lang/String;)V

    return-void
.end method

.method onProgressDelayComplete()V
    .locals 2

    .line 61
    invoke-static {}, Lcom/usebutton/sdk/internal/AuthChallengeObserver;->getInstance()Lcom/usebutton/sdk/internal/AuthChallengeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/AuthChallengeObserver;->onSSOAuth(Lcom/usebutton/sdk/internal/models/AuthChallenge;)V

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .line 17
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->onResult(Ljava/lang/String;)V

    return-void
.end method

.method public onResult(Ljava/lang/String;)V
    .locals 1

    .line 184
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/AuthChallengeController;

    if-eqz v0, :cond_0

    .line 186
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/AuthChallengeController;->hideProgress()V

    .line 188
    :cond_0
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->handleAuthResult(Ljava/lang/String;)V

    return-void
.end method

.method onSSOAuthResult(Ljava/lang/String;)V
    .locals 8

    .line 109
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/AuthChallengeController;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    .line 115
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/AuthChallengeController;->hideProgress()V

    const-string p1, "denied"

    .line 116
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->handleAuthResult(Ljava/lang/String;)V

    return-void

    .line 120
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    if-nez v0, :cond_2

    return-void

    .line 124
    :cond_2
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->getAuthProcessingText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->setStatusText(Lcom/usebutton/sdk/internal/models/Text;)V

    .line 126
    iget-object v0, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->metaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    if-nez v0, :cond_3

    return-void

    .line 130
    :cond_3
    new-instance v0, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->button:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getApi()Lcom/usebutton/sdk/internal/api/ButtonApi;

    move-result-object v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->button:Lcom/usebutton/sdk/internal/ButtonPrivate;

    .line 131
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getStorage()Lcom/usebutton/sdk/internal/core/Storage;

    move-result-object v3

    iget-object v4, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->metaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 134
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v6

    move-object v1, v0

    move-object v5, p1

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/models/AuthChallenge;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    .line 136
    iget-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->button:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getCommandExecutor()Lcom/usebutton/sdk/internal/core/CommandExecutor;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->dispatchFirst(Lcom/usebutton/sdk/internal/core/Command;)V

    return-void
.end method

.method onUrlLoadComplete(Ljava/lang/String;)V
    .locals 2

    .line 65
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/AuthChallengeController;

    if-nez v0, :cond_0

    return-void

    .line 70
    :cond_0
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/AuthChallengeController;->hideOverlayProgress()V

    if-eqz p1, :cond_1

    .line 72
    iget-object v1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->getAuthResultUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 73
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/AuthChallengeController;->hideProgress()V

    .line 74
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->extractAuthResult(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->handleAuthResult(Ljava/lang/String;)V

    return-void

    .line 78
    :cond_1
    iget-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->getWebViewCustomizationScript()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 79
    iget-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->getWebViewCustomizationScript()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/AuthChallengeController;->executeScript(Ljava/lang/String;)V

    .line 82
    :cond_2
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/AuthChallengeController;->showWebView()V

    return-void
.end method

.method onUrlLoadStart(Ljava/lang/String;)V
    .locals 2

    .line 86
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/AuthChallengeController;

    if-nez v0, :cond_0

    return-void

    .line 91
    :cond_0
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/AuthChallengeController;->showOverlayProgress()V

    if-eqz p1, :cond_1

    .line 93
    iget-object v1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->getAuthProcessingUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 94
    iget-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->authChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->getAuthProcessingText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->setStatusText(Lcom/usebutton/sdk/internal/models/Text;)V

    .line 95
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/AuthChallengeController;->hideWebView()V

    :cond_1
    return-void
.end method
