.class public Lcom/shopkick/app/overlays/common/RateTheAppOverlay;
.super Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;
.source "RateTheAppOverlay.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;-><init>()V

    return-void
.end method

.method private rateIntentForUrl(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 5

    .line 54
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    const-string v2, "%s?id=%s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 p1, 0x1

    aput-object p2, v3, p1

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 p1, 0x48080000    # 139264.0f

    .line 55
    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    return-object v0
.end method


# virtual methods
.method protected onSecondaryPositivePressed(Landroid/content/Context;)V
    .locals 3

    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "market://details"

    .line 45
    invoke-direct {p0, v2, v0}, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;->rateIntentForUrl(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    .line 46
    invoke-static {p1, v2, v1}, Landroid/support/v4/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v2, "https://play.google.com/store/apps/details"

    .line 48
    invoke-direct {p0, v2, v0}, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;->rateIntentForUrl(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 49
    invoke-static {p1, v0, v1}, Landroid/support/v4/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    :goto_0
    return-void
.end method

.method protected setUpPromptElements()V
    .locals 1

    const/16 v0, 0x129

    .line 25
    iput v0, p0, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;->elementPrimaryYes:I

    const/16 v0, 0x12a

    .line 26
    iput v0, p0, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;->elementPrimaryNo:I

    const/16 v0, 0x12d

    .line 27
    iput v0, p0, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;->elementSecondaryYes:I

    const/16 v0, 0x12e

    .line 28
    iput v0, p0, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;->elementSecondaryNo:I

    const/16 v0, 0x12b

    .line 29
    iput v0, p0, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;->elementSurveyYes:I

    const/16 v0, 0x12c

    .line 30
    iput v0, p0, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;->elementSurveyNo:I

    .line 32
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->rateTheAppPrimerQuestion:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;->primaryQuestion:Ljava/lang/String;

    .line 33
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->rateTheAppRatingMessage:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;->secondaryQuestion:Ljava/lang/String;

    .line 34
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->rateTheAppSurveyQuestion:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;->surveyQuestion:Ljava/lang/String;

    .line 35
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->rateTheAppSurveyUrl:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;->surveyUrl:Ljava/lang/String;

    return-void
.end method
