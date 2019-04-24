.class public Lcom/ibotta/android/routing/area/NotificationsRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "NotificationsRouteArea.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
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

    .line 41
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    const-string v1, "^/activity.*"

    .line 42
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "^/activity/team(/)?(\\?.*)?$"

    .line 26
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/NotificationsRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    new-instance p2, Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;

    invoke-direct {p2, p1}, Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;-><init>(Landroid/content/Context;)V

    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->TEAMMATES:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    .line 28
    invoke-virtual {p2, p1}, Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;->tabSelection(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;)Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;

    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "^/activity(/)?(\\?.*)?$"

    .line 30
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/NotificationsRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 31
    new-instance p2, Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;

    invoke-direct {p2, p1}, Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;-><init>(Landroid/content/Context;)V

    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->MINE:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    .line 32
    invoke-virtual {p2, p1}, Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;->tabSelection(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;)Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;

    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/NotificationsIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
