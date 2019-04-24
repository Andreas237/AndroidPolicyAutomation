.class public Lcom/ibotta/android/state/pwi/PwiUserStateImpl;
.super Ljava/lang/Object;
.source "PwiUserStateImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/pwi/PwiUserState;


# static fields
.field private static final KEY_PWI_GOOGLE_PAY_DEFAULT_PAYMENT:Ljava/lang/String; = "pwi_google_pay_default_payment"

.field private static final KEY_PWI_ONBOARDING_COMPLETED:Ljava/lang/String; = "pwi_onboarding_completed"

.field private static final KEY_PWI_PENDING_TXNS:Ljava/lang/String; = "pwi_pending_txns"

.field private static final KEY_PWI_SHOW_CONFIRM_PURCHASE:Ljava/lang/String; = "pwi_show_confirm_purchase"


# instance fields
.field private final ibottaJson:Lcom/ibotta/android/json/IbottaJson;

.field private final sharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;Lcom/ibotta/android/json/IbottaJson;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->sharedPreferences:Landroid/content/SharedPreferences;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    return-void
.end method

.method private getPendingTransactionsMap()Ljava/util/HashMap;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DefaultLocale"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/ArrayList;",
            ">;"
        }
    .end annotation

    .line 120
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    iget-object v1, p0, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v2, "pwi_pending_txns"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Ljava/lang/Integer;

    const-class v3, Ljava/util/ArrayList;

    invoke-interface {v0, v1, v2, v3}, Lcom/ibotta/android/json/IbottaJson;->fromJsonToHashMap(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/HashMap;

    move-result-object v0
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 122
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 123
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0
.end method

.method private savePendingTransactionsMap(Ljava/util/Map;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DefaultLocale"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/ArrayList;",
            ">;)V"
        }
    .end annotation

    .line 111
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "pwi_pending_txns"

    iget-object v2, p0, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    invoke-interface {v2, p1}, Lcom/ibotta/android/json/IbottaJson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 113
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public addPendingTransaction(Ljava/lang/String;I)V
    .locals 2

    .line 56
    invoke-direct {p0}, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->getPendingTransactionsMap()Ljava/util/HashMap;

    move-result-object v0

    .line 57
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 60
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 63
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    invoke-direct {p0, v0}, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->savePendingTransactionsMap(Ljava/util/Map;)V

    return-void
.end method

.method public clearAll()V
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public getEarliestPendingTransactionId(I)Ljava/lang/String;
    .locals 1

    .line 48
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->hasPendingTransaction(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    invoke-direct {p0}, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->getPendingTransactionsMap()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method public hasCompletedOnboarding()Z
    .locals 3

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "pwi_onboarding_completed"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public hasPendingTransaction(I)Ljava/lang/Boolean;
    .locals 1

    .line 42
    invoke-direct {p0}, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->getPendingTransactionsMap()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    .line 43
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public isConfirmPurchaseAgain()Z
    .locals 3

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "pwi_show_confirm_purchase"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isGooglePayDefaultPayment()Ljava/lang/Boolean;
    .locals 3

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "pwi_google_pay_default_payment"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public onLogOut(Z)V
    .locals 0

    .line 105
    invoke-virtual {p0}, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->clearAll()V

    return-void
.end method

.method public onOnboardingCompleted()V
    .locals 3

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "pwi_onboarding_completed"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public removePendingTransaction(Ljava/lang/String;I)V
    .locals 2

    .line 70
    invoke-direct {p0}, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->getPendingTransactionsMap()Ljava/util/HashMap;

    move-result-object v0

    .line 71
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-nez v1, :cond_0

    return-void

    .line 77
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 79
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 80
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 82
    :cond_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    :goto_0
    invoke-direct {p0, v0}, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->savePendingTransactionsMap(Ljava/util/Map;)V

    return-void
.end method

.method public setGooglePayAsDefaultPayment(Z)V
    .locals 2

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "pwi_google_pay_default_payment"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public showConfirmPurchaseAgain(Z)V
    .locals 2

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "pwi_show_confirm_purchase"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
