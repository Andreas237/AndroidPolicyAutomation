.class public Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "WebViewBrowserIntentCreator.java"


# instance fields
.field private final exitUrls:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private slideFromBottom:Z

.field private viewerUri:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private withXForNavIcon:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->viewerUri:Ljava/lang/String;

    .line 25
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->exitUrls:Ljava/util/ArrayList;

    const/4 p1, 0x0

    .line 26
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->withXForNavIcon:Z

    .line 27
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->slideFromBottom:Z

    return-void
.end method

.method private addAlternateSlashVersion(Ljava/lang/String;)V
    .locals 4

    .line 88
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/4 v2, 0x0

    const/16 v3, 0x2f

    if-eq v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->exitUrls:Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 92
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v3, 0x2

    if-lt v0, v3, :cond_2

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->exitUrls:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public addExitUrl(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 73
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->exitUrls:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->addAlternateSlashVersion(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public create()Landroid/content/Intent;
    .locals 3

    .line 100
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 102
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->viewerUri:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "viewer_uri"

    .line 103
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    const-string v1, "urls"

    .line 106
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->exitUrls:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    const-string v1, "use_x_for_nav_icon"

    .line 107
    iget-boolean v2, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->withXForNavIcon:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v1, "slide_from_bottom"

    .line 108
    iget-boolean v2, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->slideFromBottom:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object v0
.end method

.method public forContactSupport()Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;
    .locals 2

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->context:Landroid/content/Context;

    const v1, 0x7f110149

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->viewerUri:Ljava/lang/String;

    return-object p0
.end method

.method public forHelpDesk()Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->context:Landroid/content/Context;

    const v1, 0x7f110187

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->viewerUri:Ljava/lang/String;

    return-object p0
.end method

.method public forHowToUseIbotta()Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;
    .locals 2

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->context:Landroid/content/Context;

    const v1, 0x7f110194

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->viewerUri:Ljava/lang/String;

    return-object p0
.end method

.method public forUrl(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->viewerUri:Ljava/lang/String;

    return-object p0
.end method

.method public withSlideFromBottom(Z)Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;
    .locals 0

    .line 63
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->slideFromBottom:Z

    return-object p0
.end method

.method public withXForNavIcon(Z)Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;
    .locals 0

    .line 58
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->withXForNavIcon:Z

    return-object p0
.end method
