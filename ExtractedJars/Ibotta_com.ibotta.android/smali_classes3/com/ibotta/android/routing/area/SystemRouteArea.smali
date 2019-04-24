.class public Lcom/ibotta/android/routing/area/SystemRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "SystemRouteArea.java"


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/routing/area/SystemRouteArea;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method private getIntentForFeedback()Landroid/content/Intent;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 50
    new-instance v0, Lcom/ibotta/android/routing/intent/OSIntentCreator;

    iget-object v1, p0, Lcom/ibotta/android/routing/area/SystemRouteArea;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-direct {v0, v1}, Lcom/ibotta/android/routing/intent/OSIntentCreator;-><init>(Lcom/ibotta/android/util/AppHelper;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/OSIntentCreator;->forFeedback()Lcom/ibotta/android/routing/intent/OSIntentCreator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/OSIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method private getIntentForUpgrade(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 45
    new-instance v0, Lcom/ibotta/android/routing/intent/OSIntentCreator;

    iget-object v1, p0, Lcom/ibotta/android/routing/area/SystemRouteArea;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-direct {v0, v1}, Lcom/ibotta/android/routing/intent/OSIntentCreator;-><init>(Lcom/ibotta/android/util/AppHelper;)V

    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/OSIntentCreator;->forUpgrade(Landroid/content/Context;)Lcom/ibotta/android/routing/intent/OSIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/OSIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1
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

    .line 55
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    const-string v1, "^/upgrade.*"

    .line 56
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "^/feedback.*"

    .line 57
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "^/upgrade(/)?(\\?.*)?$"

    .line 34
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/SystemRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 35
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/area/SystemRouteArea;->getIntentForUpgrade(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "^/feedback(/)?(\\?.*)?$"

    .line 36
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/routing/area/SystemRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/SystemRouteArea;->getIntentForFeedback()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
