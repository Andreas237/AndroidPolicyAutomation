.class public Lcom/ibotta/android/routing/area/AccountRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "AccountRouteArea.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;-><init>()V

    return-void
.end method

.method private getIntentForGiftCard(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;
    .locals 1

    const-string v0, "gift_card_txn_uuid"

    .line 76
    invoke-virtual {p2, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 77
    new-instance v0, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;->create()Landroid/content/Intent;

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

    .line 69
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    const-string v1, "^/setting(s)?.*"

    .line 70
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "^/account.*"

    .line 71
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "^/setting(s)?(/)?(\\?.*)?$"

    .line 42
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/AccountRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_a

    const-string v0, "^/account/settings(/)?(\\?.*)?$"

    .line 43
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/AccountRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v0, "^/setting(s)?/profile(/)?(\\?.*)?$"

    .line 45
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/AccountRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_9

    const-string v0, "^/account/settings/profile(/)?(\\?.*)?$"

    .line 46
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/AccountRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const-string v0, "^/setting(s)?/social(/(?<social_network>facebook))?(/)?(\\?.*)?$"

    .line 48
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/AccountRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 49
    new-instance p2, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;

    sget-object v0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;->CONNECTED:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    invoke-direct {p2, p1, v0}, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_2
    const-string v0, "^/account/settings/(app|email)-alerts(/)?(\\?.*)?$"

    .line 50
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/AccountRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 51
    new-instance p2, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;

    sget-object v0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;->PREFS:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    invoke-direct {p2, p1, v0}, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_3
    const-string v0, "^/account/my-earnings(/)?(\\?.*)?$"

    .line 52
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/AccountRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 53
    new-instance p2, Lcom/ibotta/android/routing/intent/MyEarningsIntentCreator;

    invoke-direct {p2, p1}, Lcom/ibotta/android/routing/intent/MyEarningsIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/MyEarningsIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_4
    const-string v0, "^/account(/)?(\\?.*)?$"

    .line 54
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/AccountRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 55
    new-instance p2, Lcom/ibotta/android/routing/intent/AccountIntentCreator;

    invoke-direct {p2, p1}, Lcom/ibotta/android/routing/intent/AccountIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/AccountIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_5
    const-string v0, "^/account/wallet/gift-cards(/)?(\\?.*)?$"

    .line 56
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/AccountRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 57
    new-instance p2, Lcom/ibotta/android/routing/intent/WalletIntentCreator;

    invoke-direct {p2, p1}, Lcom/ibotta/android/routing/intent/WalletIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/WalletIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_6
    const-string v0, "^/account/wallet/payment-methods(/)?(\\?.*)?$"

    .line 58
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/AccountRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 59
    new-instance p2, Lcom/ibotta/android/routing/intent/WalletIntentCreator;

    invoke-direct {p2, p1}, Lcom/ibotta/android/routing/intent/WalletIntentCreator;-><init>(Landroid/content/Context;)V

    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->PAYMENT_METHODS:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/routing/intent/WalletIntentCreator;->setGoToViewPagerTab(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;)Lcom/ibotta/android/routing/intent/WalletIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/WalletIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_7
    const-string v0, "^/account/wallet/gift-cards/(?<gift_card_txn_uuid>txn_\\d*)(/)?(\\?.*)?$"

    .line 60
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/AccountRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 61
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/area/AccountRouteArea;->getIntentForGiftCard(Landroid/content/Context;Lcom/google/code/regexp/Matcher;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    :cond_8
    const/4 p1, 0x0

    return-object p1

    .line 47
    :cond_9
    :goto_0
    new-instance p2, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;

    sget-object v0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;->PROFILE:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    invoke-direct {p2, p1, v0}, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    .line 44
    :cond_a
    :goto_1
    new-instance p2, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;

    sget-object v0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;->SETTINGS:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    invoke-direct {p2, p1, v0}, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/SettingsIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
