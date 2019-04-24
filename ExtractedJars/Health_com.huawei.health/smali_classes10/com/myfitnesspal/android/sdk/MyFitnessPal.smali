.class public Lcom/myfitnesspal/android/sdk/MyFitnessPal;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DEFAULT_AUTH_ACTIVITY_CODE:I = 0x14d0e245

.field private static final TAG:Ljava/lang/String; = "MFP-authorize"


# instance fields
.field private accessToken:Ljava/lang/String;

.field private authCode:Ljava/lang/String;

.field private authListener:Lcom/myfitnesspal/android/sdk/MfpAuthListener;

.field private clientId:Ljava/lang/String;

.field private parentActivity:Landroid/app/Activity;

.field private parentRequestCode:I

.field private refreshToken:Ljava/lang/String;

.field private requestData:Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;

.field private suffix:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 40
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    if-nez p1, :cond_0

    .line 53
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You must specify your application ID when instantiating a MyFitnessPal object. See README for details."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 58
    :cond_0
    iput-object p1, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->clientId:Ljava/lang/String;

    .line 59
    iput-object p2, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->suffix:Ljava/lang/String;

    .line 60
    return-void
.end method

.method static synthetic access$000(Lcom/myfitnesspal/android/sdk/MyFitnessPal;Landroid/os/Bundle;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->persistDataAndInvokeCallbacks(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic access$100(Lcom/myfitnesspal/android/sdk/MyFitnessPal;Lcom/myfitnesspal/android/sdk/MfpWebError;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->onMfpWebError(Lcom/myfitnesspal/android/sdk/MfpWebError;)V

    return-void
.end method

.method static synthetic access$200(Lcom/myfitnesspal/android/sdk/MyFitnessPal;Lcom/myfitnesspal/android/sdk/MfpAuthError;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->onGenericMfpError(Lcom/myfitnesspal/android/sdk/MfpAuthError;)V

    return-void
.end method

.method static synthetic access$300(Lcom/myfitnesspal/android/sdk/MyFitnessPal;Landroid/os/Bundle;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->onUserCanceled(Landroid/os/Bundle;)V

    return-void
.end method

.method private createActivityIntent()Landroid/content/Intent;
    .locals 5

    .line 211
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.myfitnesspal.android"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "com.myfitnesspal.android.login.AUTHORIZE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->requestData:Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;

    invoke-virtual {v1}, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->asBundle()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v4

    .line 216
    invoke-virtual {v4}, Landroid/content/Intent;->getFlags()I

    move-result v0

    const v1, -0x10000001

    and-int/2addr v0, v1

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 217
    const-string v0, "SDK connect intent action = %s, flags = 0x%x"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/content/Intent;->getFlags()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 220
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->parentActivity:Landroid/app/Activity;

    const/4 v1, 0x1

    invoke-static {v0, v4, v1}, Lcom/myfitnesspal/android/sdk/Util;->validateActivityIntent(Landroid/content/Context;Landroid/content/Intent;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, v4

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private createApi()Lcom/myfitnesspal/shared/api/AppGalleryApi;
    .locals 1

    .line 567
    new-instance v0, Lcom/myfitnesspal/shared/api/AppGalleryApiImpl;

    invoke-direct {v0}, Lcom/myfitnesspal/shared/api/AppGalleryApiImpl;-><init>()V

    return-object v0
.end method

.method private createTestActivityIntent()Landroid/content/Intent;
    .locals 6

    .line 225
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->parentActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 226
    const-string v0, "com.myfitnesspal.marketplacetest"

    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v5

    .line 228
    if-nez v5, :cond_0

    .line 230
    const/4 v0, 0x0

    return-object v0

    .line 233
    :cond_0
    const-string v0, "operation"

    const-string v1, "mfpconnect"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "action"

    const-string v2, "authorize"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->requestData:Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;

    invoke-virtual {v1}, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->asBundle()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 237
    invoke-virtual {v5}, Landroid/content/Intent;->getFlags()I

    move-result v0

    const v1, -0x10000001

    and-int/2addr v0, v1

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 238
    const-string v0, "SDK connect intent action = %s, flags = 0x%x"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Landroid/content/Intent;->getFlags()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 241
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->parentActivity:Landroid/app/Activity;

    const/4 v1, 0x0

    invoke-static {v0, v5, v1}, Lcom/myfitnesspal/android/sdk/Util;->validateActivityIntent(Landroid/content/Context;Landroid/content/Intent;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, v5

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private onAndroidError(Landroid/content/Intent;)V
    .locals 5

    .line 547
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Login failed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "error"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 548
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->authListener:Lcom/myfitnesspal/android/sdk/MfpAuthListener;

    new-instance v1, Lcom/myfitnesspal/android/sdk/MfpWebError;

    const-string v2, "error"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "error_code"

    const/4 v4, -0x1

    invoke-virtual {p1, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    const-string v4, "failing_url"

    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/myfitnesspal/android/sdk/MfpWebError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/myfitnesspal/android/sdk/MfpAuthListener;->onError(Lcom/myfitnesspal/android/sdk/MfpWebError;)V

    .line 553
    return-void
.end method

.method private onAuthComplete(Landroid/os/Bundle;)V
    .locals 1

    .line 498
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->authListener:Lcom/myfitnesspal/android/sdk/MfpAuthListener;

    invoke-interface {v0, p1}, Lcom/myfitnesspal/android/sdk/MfpAuthListener;->onComplete(Landroid/os/Bundle;)V

    .line 499
    return-void
.end method

.method private onGenericMfpError(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 3

    .line 517
    const-string v0, "error_description"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 518
    if-eqz v2, :cond_0

    .line 520
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 523
    :cond_0
    invoke-direct {p0, p2}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->onGenericMfpError(Ljava/lang/String;)V

    .line 524
    return-void
.end method

.method private onGenericMfpError(Lcom/myfitnesspal/android/sdk/MfpAuthError;)V
    .locals 2

    .line 533
    invoke-virtual {p1}, Lcom/myfitnesspal/android/sdk/MfpAuthError;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 534
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->authListener:Lcom/myfitnesspal/android/sdk/MfpAuthListener;

    invoke-interface {v0, p1}, Lcom/myfitnesspal/android/sdk/MfpAuthListener;->onMfpError(Lcom/myfitnesspal/android/sdk/MfpAuthError;)V

    .line 535
    return-void
.end method

.method private onGenericMfpError(Ljava/lang/String;)V
    .locals 1

    .line 528
    new-instance v0, Lcom/myfitnesspal/android/sdk/MfpAuthError;

    invoke-direct {v0, p1}, Lcom/myfitnesspal/android/sdk/MfpAuthError;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->onGenericMfpError(Lcom/myfitnesspal/android/sdk/MfpAuthError;)V

    .line 529
    return-void
.end method

.method private onMfpWebError(Lcom/myfitnesspal/android/sdk/MfpWebError;)V
    .locals 2

    .line 511
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Login failed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 512
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->authListener:Lcom/myfitnesspal/android/sdk/MfpAuthListener;

    invoke-interface {v0, p1}, Lcom/myfitnesspal/android/sdk/MfpAuthListener;->onError(Lcom/myfitnesspal/android/sdk/MfpWebError;)V

    .line 513
    return-void
.end method

.method private onResultCanceled(Landroid/content/Intent;)V
    .locals 1

    .line 416
    if-eqz p1, :cond_0

    .line 418
    invoke-direct {p0, p1}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->onAndroidError(Landroid/content/Intent;)V

    goto :goto_0

    .line 422
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->onUserCanceled(Landroid/os/Bundle;)V

    .line 424
    :goto_0
    return-void
.end method

.method private onResultOK(Landroid/content/Intent;)V
    .locals 3

    .line 428
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lcom/myfitnesspal/shared/utils/UriUtils;->getQueryParams(Landroid/net/Uri;)Landroid/os/Bundle;

    move-result-object v1

    .line 429
    const-string v0, "error"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 432
    if-eqz v2, :cond_2

    .line 434
    const-string v0, "service_disabled"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 436
    invoke-direct {p0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->onSingleSignOnDisabled()V

    goto :goto_0

    .line 438
    :cond_0
    const-string v0, "access_denied"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 440
    invoke-direct {p0, v1}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->onUserCanceled(Landroid/os/Bundle;)V

    goto :goto_0

    .line 444
    :cond_1
    invoke-direct {p0, v1, v2}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->onGenericMfpError(Landroid/os/Bundle;Ljava/lang/String;)V

    goto :goto_0

    .line 449
    :cond_2
    invoke-direct {p0, v1}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->persistDataAndInvokeCallbacks(Landroid/os/Bundle;)V

    .line 453
    :goto_0
    return-void
.end method

.method private onSingleSignOnDisabled()V
    .locals 2

    .line 539
    const-string v0, "Hosted auth currently disabled. Retrying dialog auth..."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 541
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->parentActivity:Landroid/app/Activity;

    invoke-direct {p0, v0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->startDialogAuth(Landroid/app/Activity;)V

    .line 542
    return-void
.end method

.method private onUserCanceled(Landroid/os/Bundle;)V
    .locals 3

    .line 504
    if-eqz p1, :cond_0

    move-object v2, p1

    goto :goto_0

    :cond_0
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 505
    :goto_0
    const-string v0, "userCanceled"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 506
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->authListener:Lcom/myfitnesspal/android/sdk/MfpAuthListener;

    invoke-interface {v0, v2}, Lcom/myfitnesspal/android/sdk/MfpAuthListener;->onCancel(Landroid/os/Bundle;)V

    .line 507
    return-void
.end method

.method private persistDataAndInvokeCallbacks(Landroid/os/Bundle;)V
    .locals 5

    .line 473
    invoke-virtual {p1}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 474
    const-string v0, "redirect_uri"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 477
    if-eqz v4, :cond_0

    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->requestData:Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;

    invoke-virtual {v0}, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->getRedirectUri()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/myfitnesspal/shared/utils/Strings;->equals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 479
    :cond_0
    invoke-direct {p0, p1}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->setDataFromBundle(Landroid/os/Bundle;)V

    goto :goto_0

    .line 483
    :cond_1
    const-string v0, "Got redirectUrl = %s but doesn\'t match %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    iget-object v2, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->requestData:Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;

    invoke-virtual {v2}, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->getRedirectUri()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 486
    :goto_0
    invoke-virtual {p0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->hasValidData()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 488
    invoke-direct {p0, p1}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->onAuthComplete(Landroid/os/Bundle;)V

    goto :goto_1

    .line 492
    :cond_2
    const-string v0, "Failed to receive %s."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->requestData:Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;

    invoke-virtual {v2}, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->getResponseType()Lcom/myfitnesspal/android/sdk/ResponseType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/myfitnesspal/android/sdk/ResponseType;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->onGenericMfpError(Ljava/lang/String;)V

    .line 494
    :goto_1
    return-void
.end method

.method private setAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 380
    iput-object p1, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->accessToken:Ljava/lang/String;

    .line 381
    return-void
.end method

.method private setAuthCode(Ljava/lang/String;)V
    .locals 0

    .line 411
    iput-object p1, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->authCode:Ljava/lang/String;

    .line 412
    return-void
.end method

.method private setDataFromBundle(Landroid/os/Bundle;)V
    .locals 4

    .line 557
    const-string v0, "setDataFromBundle: Response type = %s, code = %s, accessToken = %s, refreshToken = %s"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->requestData:Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;

    invoke-virtual {v2}, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->getResponseType()Lcom/myfitnesspal/android/sdk/ResponseType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/myfitnesspal/android/sdk/ResponseType;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->getAuthCode()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->getAccessToken()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->getRefreshToken()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 560
    const-string v0, "code"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->setAuthCode(Ljava/lang/String;)V

    .line 561
    const-string v0, "access_token"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->setAccessToken(Ljava/lang/String;)V

    .line 562
    const-string v0, "refresh_token"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->setRefreshToken(Ljava/lang/String;)V

    .line 563
    return-void
.end method

.method private setRefreshToken(Ljava/lang/String;)V
    .locals 0

    .line 396
    iput-object p1, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->refreshToken:Ljava/lang/String;

    .line 397
    return-void
.end method

.method private startDialogAuth(Landroid/app/Activity;)V
    .locals 2

    .line 252
    invoke-static {p1}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    .line 253
    const-string v0, "authorize"

    new-instance v1, Lcom/myfitnesspal/android/sdk/MyFitnessPal$1;

    invoke-direct {v1, p0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal$1;-><init>(Lcom/myfitnesspal/android/sdk/MyFitnessPal;)V

    invoke-virtual {p0, p1, v0, v1}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->dialog(Landroid/content/Context;Ljava/lang/String;Lcom/myfitnesspal/android/sdk/MfpAuthListener;)V

    .line 277
    return-void
.end method

.method private startSingleSignOn(Landroid/app/Activity;I)Z
    .locals 4

    .line 188
    const/4 v1, 0x1

    .line 190
    invoke-direct {p0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->createActivityIntent()Landroid/content/Intent;

    move-result-object v2

    .line 192
    if-nez v2, :cond_0

    .line 194
    const/4 v0, 0x0

    return v0

    .line 199
    :cond_0
    :try_start_0
    invoke-virtual {p1, v2, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 204
    goto :goto_0

    .line 201
    :catch_0
    move-exception v3

    .line 203
    const/4 v1, 0x0

    .line 206
    :goto_0
    return v1
.end method

.method private wantsCode()Z
    .locals 3

    .line 457
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->requestData:Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;

    invoke-virtual {v0}, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->getResponseType()Lcom/myfitnesspal/android/sdk/ResponseType;

    move-result-object v1

    .line 458
    sget-object v0, Lcom/myfitnesspal/android/sdk/ResponseType;->Code:Lcom/myfitnesspal/android/sdk/ResponseType;

    if-eq v1, v0, :cond_0

    sget-object v0, Lcom/myfitnesspal/android/sdk/ResponseType;->Both:Lcom/myfitnesspal/android/sdk/ResponseType;

    if-ne v1, v0, :cond_1

    :cond_0
    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 460
    :goto_0
    return v2
.end method

.method private wantsTokens()Z
    .locals 3

    .line 465
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->requestData:Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;

    invoke-virtual {v0}, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->getResponseType()Lcom/myfitnesspal/android/sdk/ResponseType;

    move-result-object v1

    .line 466
    sget-object v0, Lcom/myfitnesspal/android/sdk/ResponseType;->Token:Lcom/myfitnesspal/android/sdk/ResponseType;

    if-eq v1, v0, :cond_0

    sget-object v0, Lcom/myfitnesspal/android/sdk/ResponseType;->Both:Lcom/myfitnesspal/android/sdk/ResponseType;

    if-ne v1, v0, :cond_1

    :cond_0
    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 468
    :goto_0
    return v2
.end method


# virtual methods
.method public authorize(Landroid/app/Activity;ILcom/myfitnesspal/android/sdk/Scope;Lcom/myfitnesspal/android/sdk/MfpAuthListener;)V
    .locals 6

    .line 84
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    sget-object v4, Lcom/myfitnesspal/android/sdk/ResponseType;->Token:Lcom/myfitnesspal/android/sdk/ResponseType;

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->authorize(Landroid/app/Activity;ILcom/myfitnesspal/android/sdk/Scope;Lcom/myfitnesspal/android/sdk/ResponseType;Lcom/myfitnesspal/android/sdk/MfpAuthListener;)V

    .line 85
    return-void
.end method

.method public authorize(Landroid/app/Activity;ILcom/myfitnesspal/android/sdk/Scope;Lcom/myfitnesspal/android/sdk/ResponseType;Lcom/myfitnesspal/android/sdk/MfpAuthListener;)V
    .locals 4

    .line 143
    const-string v0, "authorize"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 144
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->setAccessToken(Ljava/lang/String;)V

    .line 145
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->setRefreshToken(Ljava/lang/String;)V

    .line 146
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->setAuthCode(Ljava/lang/String;)V

    .line 148
    iput-object p1, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->parentActivity:Landroid/app/Activity;

    .line 149
    iput p2, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->parentRequestCode:I

    .line 150
    new-instance v0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;

    iget-object v1, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->clientId:Ljava/lang/String;

    iget-object v2, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->suffix:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p3, p4}, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/myfitnesspal/android/sdk/Scope;Lcom/myfitnesspal/android/sdk/ResponseType;)V

    iput-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->requestData:Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;

    .line 151
    iput-object p5, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->authListener:Lcom/myfitnesspal/android/sdk/MfpAuthListener;

    .line 156
    invoke-direct {p0, p1, p2}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->startSingleSignOn(Landroid/app/Activity;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 158
    new-instance v0, Lcom/myfitnesspal/android/sdk/DownloadManager;

    invoke-direct {v0}, Lcom/myfitnesspal/android/sdk/DownloadManager;-><init>()V

    iget-object v1, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->clientId:Ljava/lang/String;

    iget-object v2, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->suffix:Ljava/lang/String;

    iget-object v3, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->requestData:Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;

    invoke-virtual {v3}, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->getRedirectUri()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/myfitnesspal/android/sdk/DownloadManager;->redirectToDownloadPage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    :cond_0
    return-void
.end method

.method public authorize(Landroid/app/Activity;Lcom/myfitnesspal/android/sdk/Scope;Lcom/myfitnesspal/android/sdk/MfpAuthListener;)V
    .locals 1

    .line 71
    const v0, 0x14d0e245

    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->authorize(Landroid/app/Activity;ILcom/myfitnesspal/android/sdk/Scope;Lcom/myfitnesspal/android/sdk/MfpAuthListener;)V

    .line 72
    return-void
.end method

.method public authorize(Landroid/app/Activity;Lcom/myfitnesspal/android/sdk/Scope;Lcom/myfitnesspal/android/sdk/ResponseType;Lcom/myfitnesspal/android/sdk/MfpAuthListener;)V
    .locals 6

    .line 90
    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    const v2, 0x14d0e245

    invoke-virtual/range {v0 .. v5}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->authorize(Landroid/app/Activity;ILcom/myfitnesspal/android/sdk/Scope;Lcom/myfitnesspal/android/sdk/ResponseType;Lcom/myfitnesspal/android/sdk/MfpAuthListener;)V

    .line 91
    return-void
.end method

.method public authorizeCallback(IILandroid/content/Intent;)V
    .locals 4

    .line 294
    const-string v0, "auth callback: req = %s, result = %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 296
    iget v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->parentRequestCode:I

    if-ne p1, v0, :cond_0

    .line 298
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 301
    :sswitch_0
    invoke-direct {p0, p3}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->onResultOK(Landroid/content/Intent;)V

    .line 302
    goto :goto_0

    .line 305
    :sswitch_1
    invoke-direct {p0, p3}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->onResultCanceled(Landroid/content/Intent;)V

    .line 309
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x1 -> :sswitch_0
        0x0 -> :sswitch_1
    .end sparse-switch
.end method

.method public dialog(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/myfitnesspal/android/sdk/MfpAuthListener;)V
    .locals 6

    .line 344
    const-string v0, "android.permission.INTERNET"

    invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 346
    const-string v0, "Error"

    const-string v1, "Application requires permission to access the Internet"

    invoke-static {p1, v0, v1}, Lcom/myfitnesspal/android/sdk/Util;->showAlert(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 351
    :cond_0
    new-instance v0, Lcom/myfitnesspal/android/sdk/MfpDialog;

    const-string v2, "authorize"

    iget-object v3, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->requestData:Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;

    move-object v1, p1

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/myfitnesspal/android/sdk/MfpDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;Landroid/os/Bundle;Lcom/myfitnesspal/android/sdk/MfpAuthListener;)V

    invoke-virtual {v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->show()V

    .line 353
    :goto_0
    return-void
.end method

.method public dialog(Landroid/content/Context;Ljava/lang/String;Lcom/myfitnesspal/android/sdk/MfpAuthListener;)V
    .locals 1

    .line 325
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->dialog(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/myfitnesspal/android/sdk/MfpAuthListener;)V

    .line 326
    return-void
.end method

.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .line 375
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public getAuthCode()Ljava/lang/String;
    .locals 1

    .line 406
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->authCode:Ljava/lang/String;

    return-object v0
.end method

.method public getRefreshToken()Ljava/lang/String;
    .locals 1

    .line 391
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->refreshToken:Ljava/lang/String;

    return-object v0
.end method

.method public hasValidData()Z
    .locals 4

    .line 360
    const-string v0, "hasValidData: wantsCode = %s, code = %s, wantsTokens = %s, accessToken = %s, refreshToken = %s"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->wantsCode()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->getAuthCode()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {p0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->wantsTokens()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->getAccessToken()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->getRefreshToken()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 362
    invoke-direct {p0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->wantsTokens()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->getRefreshToken()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    :cond_0
    invoke-direct {p0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->wantsCode()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->getAuthCode()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
