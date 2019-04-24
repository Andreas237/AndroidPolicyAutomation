.class public Lcom/ibotta/android/routing/area/ExternalBrowserRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "ExternalBrowserRouteArea.java"


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/routing/area/ExternalBrowserRouteArea;->appHelper:Lcom/ibotta/android/util/AppHelper;

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

    .line 45
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    const-string v1, "^/url/.*$"

    .line 46
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "^/?http.*$"

    .line 47
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string p1, "^/url/(?<url>.*)$"

    .line 33
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/routing/area/ExternalBrowserRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_1

    const-string p1, "^/?(?<url>http.*)$"

    .line 34
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/routing/area/ExternalBrowserRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    :goto_0
    const-string p2, "url"

    .line 36
    invoke-virtual {p1, p2}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 37
    new-instance p2, Lcom/ibotta/android/routing/intent/OSIntentCreator;

    iget-object v0, p0, Lcom/ibotta/android/routing/area/ExternalBrowserRouteArea;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-direct {p2, v0}, Lcom/ibotta/android/routing/intent/OSIntentCreator;-><init>(Lcom/ibotta/android/util/AppHelper;)V

    invoke-virtual {p2, p1}, Lcom/ibotta/android/routing/intent/OSIntentCreator;->forExternalBrowser(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/OSIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/OSIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
