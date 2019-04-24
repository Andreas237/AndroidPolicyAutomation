.class public Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;
.super Ljava/lang/Object;
.source "VenmoAppConfig.java"


# instance fields
.field private accountListText:Ljava/lang/String;

.field private cashOutText:Ljava/lang/String;

.field private enabled:Z

.field private hasBonus:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isShowAccountListText(Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;IZ)Z
    .locals 0

    .line 49
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;->getAccountListText()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    if-gtz p1, :cond_0

    if-nez p2, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isShowCashOutText(Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;Z)Z
    .locals 1

    .line 53
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;->getCashOutText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    iget-boolean p0, p0, Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;->hasBonus:Z

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public getAccountListText()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;->accountListText:Ljava/lang/String;

    return-object v0
.end method

.method public getCashOutText()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;->cashOutText:Ljava/lang/String;

    return-object v0
.end method

.method public isEnabled()Z
    .locals 1

    .line 33
    iget-boolean v0, p0, Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;->enabled:Z

    return v0
.end method

.method public isHasBonus()Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;->hasBonus:Z

    return v0
.end method

.method public setAccountListText(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;->accountListText:Ljava/lang/String;

    return-void
.end method

.method public setCashOutText(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;->cashOutText:Ljava/lang/String;

    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 37
    iput-boolean p1, p0, Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;->enabled:Z

    return-void
.end method

.method public setHasBonus(Z)V
    .locals 0

    .line 45
    iput-boolean p1, p0, Lcom/ibotta/android/state/app/config/venmo/VenmoAppConfig;->hasBonus:Z

    return-void
.end method
