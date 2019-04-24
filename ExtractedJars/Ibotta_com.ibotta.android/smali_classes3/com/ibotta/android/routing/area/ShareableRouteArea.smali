.class public Lcom/ibotta/android/routing/area/ShareableRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "ShareableRouteArea.java"


# instance fields
.field private final activityLifecycleListener:Lcom/ibotta/android/ActivityLifecycleListener;

.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/ActivityLifecycleListener;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/routing/area/ShareableRouteArea;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 38
    iput-object p2, p0, Lcom/ibotta/android/routing/area/ShareableRouteArea;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 39
    iput-object p3, p0, Lcom/ibotta/android/routing/area/ShareableRouteArea;->activityLifecycleListener:Lcom/ibotta/android/ActivityLifecycleListener;

    return-void
.end method

.method private getAppMessages()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/sharing/AppMessage;",
            ">;"
        }
    .end annotation

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/routing/area/ShareableRouteArea;->appCache:Lcom/ibotta/android/appcache/AppCache;

    new-instance v1, Lcom/ibotta/api/call/sharing/AppMessagesCall;

    iget-object v2, p0, Lcom/ibotta/android/routing/area/ShareableRouteArea;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 85
    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-direct {v1, v2}, Lcom/ibotta/api/call/sharing/AppMessagesCall;-><init>(I)V

    .line 84
    invoke-interface {v0, v1}, Lcom/ibotta/android/appcache/AppCache;->getIfNotExpired(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/sharing/AppMessagesResponse;

    if-eqz v0, :cond_0

    .line 88
    invoke-virtual {v0}, Lcom/ibotta/api/call/sharing/AppMessagesResponse;->getMessages()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
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

    .line 75
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    const-string v1, "^/share/message.*"

    .line 76
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "^/referral.*"

    .line 77
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 5
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "^/share/message/.*"

    .line 44
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/ShareableRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "^/referral/.*"

    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/ShareableRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    :goto_0
    const v0, 0x7f1105d5

    .line 45
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1105d4

    .line 46
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 48
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/ShareableRouteArea;->getAppMessages()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 51
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/sharing/AppMessage;

    .line 52
    invoke-virtual {v3}, Lcom/ibotta/api/model/sharing/AppMessage;->getKey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 53
    invoke-virtual {v3}, Lcom/ibotta/api/model/sharing/AppMessage;->getSubject()Ljava/lang/String;

    move-result-object v0

    .line 54
    invoke-virtual {v3}, Lcom/ibotta/api/model/sharing/AppMessage;->getBody()Ljava/lang/String;

    move-result-object v1

    .line 60
    :cond_3
    iget-object p2, p0, Lcom/ibotta/android/routing/area/ShareableRouteArea;->activityLifecycleListener:Lcom/ibotta/android/ActivityLifecycleListener;

    invoke-virtual {p2}, Lcom/ibotta/android/ActivityLifecycleListener;->getExistingCount()I

    move-result p2

    const/4 v2, 0x1

    if-le p2, v2, :cond_4

    .line 63
    new-instance p2, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;

    invoke-direct {p2, p1, v0, v1}, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    .line 66
    :cond_4
    new-instance p2, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;

    invoke-direct {p2, p1, v0, v1}, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;->forFeatured(Z)Lcom/ibotta/android/routing/intent/ShareableIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/ShareableIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
