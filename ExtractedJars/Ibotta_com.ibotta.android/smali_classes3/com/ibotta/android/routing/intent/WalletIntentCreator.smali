.class public Lcom/ibotta/android/routing/intent/WalletIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "WalletIntentCreator.java"


# instance fields
.field private goToViewPagerTab:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 28
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/WalletIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 30
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/WalletIntentCreator;->goToViewPagerTab:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "pwi_wallet_tab"

    .line 31
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    return-object v0
.end method

.method public setGoToViewPagerTab(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;)Lcom/ibotta/android/routing/intent/WalletIntentCreator;
    .locals 0

    .line 22
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->name()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/WalletIntentCreator;->goToViewPagerTab:Ljava/lang/String;

    return-object p0
.end method
