.class public Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "SpotlightIntentCreator.java"


# instance fields
.field private customRebateRewardMessage:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private newRebateRewarded:Z

.field private offerIds:[I
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private rebateRewarded:Z

.field private relatedBonusId:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private retailerCategoryId:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private retailerId:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->offerIds:[I

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->relatedBonusId:Ljava/lang/Integer;

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->retailerId:Ljava/lang/Integer;

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->retailerCategoryId:Ljava/lang/Integer;

    const/4 v0, 0x0

    .line 27
    iput-boolean v0, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->rebateRewarded:Z

    .line 28
    iput-boolean v0, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->newRebateRewarded:Z

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->customRebateRewardMessage:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 72
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 74
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->offerIds:[I

    if-eqz v1, :cond_0

    const-string v2, "offer_ids"

    .line 75
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    .line 78
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->relatedBonusId:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    const-string v2, "related_bonus_id"

    .line 79
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 82
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->retailerId:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    const-string v2, "retailer_id"

    .line 83
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 86
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->retailerCategoryId:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    const-string v2, "retailer_category_id"

    .line 87
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 90
    :cond_3
    iget-boolean v1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->rebateRewarded:Z

    if-eqz v1, :cond_4

    const-string v2, "rebate_rewarded"

    .line 91
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 94
    :cond_4
    iget-boolean v1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->newRebateRewarded:Z

    if-eqz v1, :cond_5

    const-string v2, "new_rebate_rewarded"

    .line 95
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 98
    :cond_5
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->customRebateRewardMessage:Ljava/lang/String;

    if-eqz v1, :cond_6

    const-string v2, "custom_rebate_reward_message"

    .line 99
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_6
    return-object v0
.end method

.method public customRebateRewardMessage(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->customRebateRewardMessage:Ljava/lang/String;

    return-object p0
.end method

.method public newRebateRewarded(Z)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;
    .locals 0

    .line 61
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->newRebateRewarded:Z

    return-object p0
.end method

.method public varargs offerIds([I)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->offerIds:[I

    return-object p0
.end method

.method public rebateRewarded(Z)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;
    .locals 0

    .line 56
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->rebateRewarded:Z

    return-object p0
.end method

.method public relatedBonusId(Ljava/lang/Integer;)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->relatedBonusId:Ljava/lang/Integer;

    return-object p0
.end method

.method public retailerCategoryId(Ljava/lang/Integer;)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 51
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->retailerCategoryId:Ljava/lang/Integer;

    return-object p0
.end method

.method public retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 46
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->retailerId:Ljava/lang/Integer;

    return-object p0
.end method
