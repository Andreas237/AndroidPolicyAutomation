.class public Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "LinkedOfferIntentCreator.java"


# instance fields
.field private offerId:I

.field private originRetailerId:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private rewardId:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 24
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;->originRetailerId:Ljava/lang/Integer;

    const/4 p1, -0x1

    .line 20
    iput p1, p0, Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;->offerId:I

    const-wide/16 v0, -0x1

    .line 21
    iput-wide v0, p0, Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;->rewardId:J

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 4

    .line 44
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 46
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;->originRetailerId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    const-string v1, "offer_id"

    .line 47
    iget v2, p0, Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;->offerId:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    :cond_0
    const-string v1, "offer_id"

    .line 50
    iget v2, p0, Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;->offerId:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "reward_id"

    .line 51
    iget-wide v2, p0, Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;->rewardId:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    return-object v0
.end method

.method public setOfferId(I)Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;
    .locals 0

    .line 33
    iput p1, p0, Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;->offerId:I

    return-object p0
.end method

.method public setOriginRetailerId(Ljava/lang/Integer;)Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;->originRetailerId:Ljava/lang/Integer;

    return-object p0
.end method

.method public setRewardId(J)Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;
    .locals 0

    .line 38
    iput-wide p1, p0, Lcom/ibotta/android/routing/intent/LinkedOfferIntentCreator;->rewardId:J

    return-object p0
.end method
