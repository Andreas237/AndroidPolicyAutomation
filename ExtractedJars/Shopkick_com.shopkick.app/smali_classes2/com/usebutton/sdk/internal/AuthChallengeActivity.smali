.class public Lcom/usebutton/sdk/internal/AuthChallengeActivity;
.super Lcom/usebutton/sdk/internal/base/BaseActivity;
.source "AuthChallengeActivity.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/AuthChallengeController;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/usebutton/sdk/internal/base/BaseActivity<",
        "Lcom/usebutton/sdk/internal/AuthChallengePresenter;",
        ">;",
        "Lcom/usebutton/sdk/internal/AuthChallengeController;"
    }
.end annotation


# static fields
.field public static final EXTRA_AUTH_CHALLENGE:Ljava/lang/String; = "auth_challenge"

.field public static final EXTRA_AUTH_CHALLENGE_META:Ljava/lang/String; = "meta"

.field public static final EXTRA_AUTH_CHALLENGE_SSO_URI:Ljava/lang/String; = "bttn://com.usebutton.sso"

.field public static final REQUEST_AUTH_CHALLENGE:I = 0x5607

.field private static final TAG:Ljava/lang/String; = "AuthChallengeActivity"


# instance fields
.field presenter:Lcom/usebutton/sdk/internal/AuthChallengePresenter;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field webView:Lcom/usebutton/sdk/internal/views/OverlayWebView;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/base/BaseActivity;-><init>()V

    return-void
.end method

.method public static createIntent(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/AuthChallenge;Lcom/usebutton/sdk/internal/models/MetaInfo;I)Landroid/content/Intent;
    .locals 2

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 51
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/usebutton/sdk/internal/AuthChallengeActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "auth_challenge"

    .line 52
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p0, "meta"

    .line 53
    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p0, "bttn://com.usebutton.sso"

    .line 54
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 55
    const-class p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    .line 56
    const-class p0, Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    .line 57
    invoke-virtual {v0, p3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    return-object v0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static shouldStartActivityForResult(Landroid/app/Activity;Landroid/content/Intent;)Z
    .locals 1

    .line 65
    const-class v0, Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    if-eqz p0, :cond_0

    .line 66
    instance-of p0, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public executeScript(Ljava/lang/String;)V
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->webView:Lcom/usebutton/sdk/internal/views/OverlayWebView;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/views/OverlayWebView;->evaluateJavascript(Ljava/lang/String;)V

    return-void
.end method

.method public finishAuthActivity()V
    .locals 0

    .line 172
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->finish()V

    return-void
.end method

.method public hideOverlayProgress()V
    .locals 2

    .line 182
    sget v0, Lcom/usebutton/sdk/R$id;->overlay_progress:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public hideProgress()V
    .locals 2

    .line 129
    sget v0, Lcom/usebutton/sdk/R$id;->auth_progress:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public hideWebView()V
    .locals 2

    .line 167
    iget-object v0, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->webView:Lcom/usebutton/sdk/internal/views/OverlayWebView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/views/OverlayWebView;->setVisibility(I)V

    return-void
.end method

.method public loadUrl(Ljava/lang/String;)V
    .locals 2

    .line 134
    iget-object v0, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->webView:Lcom/usebutton/sdk/internal/views/OverlayWebView;

    new-instance v1, Lcom/usebutton/sdk/internal/AuthChallengeActivity$4;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity$4;-><init>(Lcom/usebutton/sdk/internal/AuthChallengeActivity;)V

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/views/OverlayWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 146
    iget-object v0, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->webView:Lcom/usebutton/sdk/internal/views/OverlayWebView;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/views/OverlayWebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    const/16 p2, 0x5607

    if-eq p2, p1, :cond_0

    return-void

    .line 201
    :cond_0
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string p2, "meta"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 202
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object p2

    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getPackageObserver()Lcom/usebutton/sdk/internal/util/PackageObserver;

    move-result-object p2

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getStoreId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/usebutton/sdk/internal/util/PackageObserver;->isInstalled(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 203
    sget-object p2, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->TAG:Ljava/lang/String;

    const-string v0, "%s App does not exist. Closing AuthChallengeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getStoreId()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-static {p2, v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->finishAuthActivity()V

    .line 208
    :cond_1
    iget-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->presenter:Lcom/usebutton/sdk/internal/AuthChallengePresenter;

    invoke-virtual {p0, p3}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->resultFromData(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->onSSOAuthResult(Ljava/lang/String;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->webView:Lcom/usebutton/sdk/internal/views/OverlayWebView;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/OverlayWebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->webView:Lcom/usebutton/sdk/internal/views/OverlayWebView;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/OverlayWebView;->goBack()V

    goto :goto_0

    .line 190
    :cond_0
    invoke-super {p0}, Lcom/usebutton/sdk/internal/base/BaseActivity;->onBackPressed()V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 71
    invoke-super {p0, p1}, Lcom/usebutton/sdk/internal/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 72
    sget v0, Lcom/usebutton/sdk/R$layout;->btn_activity_auth_challenge:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->setContentView(I)V

    .line 73
    sget v0, Lcom/usebutton/sdk/R$id;->auth_web_view:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/views/OverlayWebView;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->webView:Lcom/usebutton/sdk/internal/views/OverlayWebView;

    .line 75
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    .line 76
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "auth_challenge"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/models/AuthChallenge;

    .line 77
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "meta"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 79
    new-instance v3, Lcom/usebutton/sdk/internal/AuthChallengePresenter;

    invoke-direct {v3, v0, v1, v2}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;-><init>(Lcom/usebutton/sdk/internal/ButtonPrivate;Lcom/usebutton/sdk/internal/models/AuthChallenge;Lcom/usebutton/sdk/internal/models/MetaInfo;)V

    iput-object v3, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->presenter:Lcom/usebutton/sdk/internal/AuthChallengePresenter;

    .line 80
    iget-object v0, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->presenter:Lcom/usebutton/sdk/internal/AuthChallengePresenter;

    invoke-virtual {p0, v0, p0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->attachPresenterToLifecycle(Lcom/usebutton/sdk/internal/base/BasePresenter;Lcom/usebutton/sdk/internal/base/BaseViewController;)V

    .line 82
    sget v0, Lcom/usebutton/sdk/R$id;->auth_cancel:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/usebutton/sdk/internal/AuthChallengeActivity$1;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity$1;-><init>(Lcom/usebutton/sdk/internal/AuthChallengeActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    sget v0, Lcom/usebutton/sdk/R$id;->overlay_cancel:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/usebutton/sdk/internal/AuthChallengeActivity$2;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity$2;-><init>(Lcom/usebutton/sdk/internal/AuthChallengeActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-nez p1, :cond_0

    .line 97
    iget-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->presenter:Lcom/usebutton/sdk/internal/AuthChallengePresenter;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->onAuthChallengeStart()V

    :cond_0
    return-void
.end method

.method resultFromData(Landroid/content/Intent;)Ljava/lang/String;
    .locals 7
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    if-eqz p1, :cond_4

    .line 213
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 217
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 218
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 219
    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 220
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 222
    :try_start_0
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 223
    instance-of v4, v3, Ljava/lang/String;

    if-nez v4, :cond_2

    instance-of v4, v3, Ljava/lang/Integer;

    if-eqz v4, :cond_1

    .line 224
    :cond_2
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 227
    sget-object v3, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->TAG:Ljava/lang/String;

    const-string v4, "Exception parsing sso auth data %s"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-virtual {v2}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v5, v6

    invoke-static {v3, v4, v5}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 230
    :cond_3
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public setStatusTextColor(I)V
    .locals 1

    .line 103
    sget v0, Lcom/usebutton/sdk/R$id;->auth_text:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public setStatusTextCopy(Ljava/lang/String;)V
    .locals 1

    .line 108
    sget v0, Lcom/usebutton/sdk/R$id;->auth_text:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public showOverlayProgress()V
    .locals 2

    .line 177
    sget v0, Lcom/usebutton/sdk/R$id;->overlay_progress:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public showProgress()V
    .locals 2

    .line 113
    sget v0, Lcom/usebutton/sdk/R$id;->auth_progress:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public showProgress(J)V
    .locals 2

    .line 118
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->showProgress()V

    .line 119
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/usebutton/sdk/internal/AuthChallengeActivity$3;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity$3;-><init>(Lcom/usebutton/sdk/internal/AuthChallengeActivity;)V

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public showWebView()V
    .locals 4

    .line 157
    iget-object v0, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->webView:Lcom/usebutton/sdk/internal/views/OverlayWebView;

    new-instance v1, Lcom/usebutton/sdk/internal/AuthChallengeActivity$5;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/AuthChallengeActivity$5;-><init>(Lcom/usebutton/sdk/internal/AuthChallengeActivity;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lcom/usebutton/sdk/internal/views/OverlayWebView;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
