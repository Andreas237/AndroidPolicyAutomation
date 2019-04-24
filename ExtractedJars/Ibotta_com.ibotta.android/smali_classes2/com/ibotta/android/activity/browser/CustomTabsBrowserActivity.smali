.class public Lcom/ibotta/android/activity/browser/CustomTabsBrowserActivity;
.super Lcom/ibotta/android/activity/browser/BrowserActivity;
.source "CustomTabsBrowserActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/ibotta/android/activity/browser/BrowserActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public loadUrl(Ljava/lang/String;)V
    .locals 3

    .line 41
    new-instance v0, Landroid/support/customtabs/CustomTabsIntent$Builder;

    invoke-direct {v0}, Landroid/support/customtabs/CustomTabsIntent$Builder;-><init>()V

    .line 42
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/CustomTabsBrowserActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060171

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/customtabs/CustomTabsIntent$Builder;->setToolbarColor(I)Landroid/support/customtabs/CustomTabsIntent$Builder;

    .line 43
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/CustomTabsBrowserActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060027

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/customtabs/CustomTabsIntent$Builder;->setSecondaryToolbarColor(I)Landroid/support/customtabs/CustomTabsIntent$Builder;

    .line 44
    invoke-virtual {v0}, Landroid/support/customtabs/CustomTabsIntent$Builder;->build()Landroid/support/customtabs/CustomTabsIntent;

    move-result-object v0

    .line 46
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/support/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 21
    invoke-super {p0, p1}, Lcom/ibotta/android/activity/browser/BrowserActivity;->onCreate(Landroid/os/Bundle;)V

    .line 22
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/CustomTabsBrowserActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "viewer_uri"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/CustomTabsBrowserActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string p1, "viewer_uri"

    .line 28
    invoke-virtual {v0, p1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    if-eqz p1, :cond_1

    .line 33
    invoke-virtual {p0, p1}, Lcom/ibotta/android/activity/browser/CustomTabsBrowserActivity;->loadUrl(Ljava/lang/String;)V

    .line 36
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/CustomTabsBrowserActivity;->finish()V

    return-void
.end method
