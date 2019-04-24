.class public Lcom/ibotta/android/routing/area/InternalBrowserRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "InternalBrowserRouteArea.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;-><init>()V

    return-void
.end method


# virtual methods
.method protected getAreaRegexes()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 51
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    const-string v1, "^/web/.*$"

    .line 52
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 4
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "^/web/(?<url>.*)$"

    .line 28
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/InternalBrowserRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object p2

    .line 30
    invoke-virtual {p2}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "url"

    .line 35
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "liferewarded.ibotta.com"

    .line 36
    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "%s uri detected. Routing to internal browser"

    const/4 v1, 0x1

    .line 38
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "liferewarded.ibotta.com"

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    new-instance v0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;

    invoke-direct {v0, p1}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;-><init>(Landroid/content/Context;)V

    .line 40
    invoke-virtual {v0, p2}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->forUrl(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;

    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    .line 43
    :cond_1
    new-instance v0, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/CustomTabsBrowserIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    :goto_0
    return-object p1
.end method
