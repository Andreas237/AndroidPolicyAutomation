.class public Lcom/ibotta/android/routing/area/ConnectLoyaltyRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "ConnectLoyaltyRouteArea.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;-><init>()V

    return-void
.end method

.method private getIntentForConnectLoyalty(Landroid/content/Context;Lcom/google/code/regexp/Matcher;Z)Landroid/content/Intent;
    .locals 1

    const-string v0, "retailer_id"

    .line 36
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/area/ConnectLoyaltyRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    .line 40
    new-instance p3, Lcom/ibotta/android/routing/intent/ImConnectIntentCreator;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {p3, p1, p2}, Lcom/ibotta/android/routing/intent/ImConnectIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p3}, Lcom/ibotta/android/routing/intent/ImConnectIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    .line 42
    :cond_0
    new-instance p3, Lcom/ibotta/android/routing/intent/ImErrorIntentCreator;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {p3, p1, p2}, Lcom/ibotta/android/routing/intent/ImErrorIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p3}, Lcom/ibotta/android/routing/intent/ImErrorIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

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

    .line 51
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    const-string v1, "^/connect-loyalty.*"

    .line 52
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "^/connect-loyalty/(?<retailer_id>\\d+)(/)?(\\?.*)?$"

    .line 26
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/ConnectLoyaltyRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p2, 0x1

    .line 27
    invoke-direct {p0, p1, v0, p2}, Lcom/ibotta/android/routing/area/ConnectLoyaltyRouteArea;->getIntentForConnectLoyalty(Landroid/content/Context;Lcom/google/code/regexp/Matcher;Z)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string v0, "^/connect-loyalty-issue/(?<retailer_id>\\d+)(/)?(\\?.*)?$"

    .line 28
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/ConnectLoyaltyRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 29
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/routing/area/ConnectLoyaltyRouteArea;->getIntentForConnectLoyalty(Landroid/content/Context;Lcom/google/code/regexp/Matcher;Z)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
