.class public Lcom/myfitnesspal/android/sdk/DownloadManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "MFP-download"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getMarketplaceUri(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 39
    invoke-direct {p0}, Lcom/myfitnesspal/android/sdk/DownloadManager;->isAmazonDevice()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v3, "http://www.amazon.com/Calorie-Counter-Diet-Tracker-MyFitnessPal/dp/B004H6WTJI"

    goto :goto_0

    :cond_0
    const-string v0, "market://details?id=com.myfitnesspal.android&referrer=%s"

    invoke-static {p1, v0}, Lcom/myfitnesspal/android/sdk/Util;->isUriAvailable(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v3, "market://details?id=com.myfitnesspal.android&referrer=%s"

    goto :goto_0

    :cond_1
    const-string v3, "https://play.google.com/store/apps/details?id=com.myfitnesspal.android&referrer=%s"

    .line 46
    :goto_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 47
    const-string v0, "utm_campaign"

    const-string v1, "mfpconnect"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    const-string v0, "utm_source"

    invoke-virtual {v4, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    const-string v0, "utm_medium"

    if-eqz p3, :cond_2

    move-object v1, p3

    goto :goto_1

    :cond_2
    const-string v1, ""

    :goto_1
    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    const-string v0, "utm_content"

    invoke-virtual {v4, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v4}, Lcom/myfitnesspal/shared/utils/UriUtils;->urlEncode(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private isAmazonDevice()Z
    .locals 2

    .line 57
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v1, "Amazon"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public redirectToDownloadPage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 28
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/myfitnesspal/android/sdk/DownloadManager;->getMarketplaceUri(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 29
    const-string v0, "app not on device, using download URL %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 31
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v0

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v4

    .line 34
    invoke-virtual {p1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 35
    return-void
.end method
