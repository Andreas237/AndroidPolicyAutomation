.class public Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "PwiBarcodeIntentCreator.java"


# instance fields
.field private retailerId:I

.field private rewardAmount:Ljava/lang/String;

.field private final transactionId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, -0x1

    .line 15
    iput p1, p0, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;->retailerId:I

    const-string p1, ""

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;->rewardAmount:Ljava/lang/String;

    .line 20
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;->transactionId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 35
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "bgc_txn_id"

    .line 36
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;->transactionId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "reward_amount"

    .line 37
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;->rewardAmount:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 39
    iget v1, p0, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;->retailerId:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const-string v2, "retailer_id"

    .line 40
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    :cond_0
    return-object v0
.end method

.method public setRetailerId(I)Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;
    .locals 0

    .line 24
    iput p1, p0, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;->retailerId:I

    return-object p0
.end method

.method public setRewardAmount(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;->rewardAmount:Ljava/lang/String;

    return-object p0
.end method
