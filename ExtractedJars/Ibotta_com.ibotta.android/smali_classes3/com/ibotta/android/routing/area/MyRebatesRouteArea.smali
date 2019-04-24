.class public Lcom/ibotta/android/routing/area/MyRebatesRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "MyRebatesRouteArea.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;-><init>()V

    return-void
.end method

.method private getIntentForMyRebates(Landroid/content/Context;)Landroid/content/Intent;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 45
    new-instance v0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;

    invoke-direct {v0, p1}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method private getIntentForMyRebates(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "retailer_id"

    .line 39
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/area/MyRebatesRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 40
    new-instance v0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;

    invoke-direct {v0, p1}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p2}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->retailerId(I)Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->create()Landroid/content/Intent;

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

    .line 50
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    const-string v1, "^/unlocked.*"

    .line 51
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "^/unlocked/(?<retailer_id>\\d+)(/(?<unlocked_tab>rebates|discounts))?(/)?(\\?.*)?$"

    .line 28
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/MyRebatesRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 29
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/routing/area/MyRebatesRouteArea;->getIntentForMyRebates(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "^/unlocked(/any(/(?<unlocked_tab>rebates|discounts))?)?(/)?(\\?.*)?$"

    .line 30
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/MyRebatesRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 31
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/area/MyRebatesRouteArea;->getIntentForMyRebates(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
