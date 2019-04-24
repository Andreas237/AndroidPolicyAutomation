.class public Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "BonusDetailIntentCreator.java"


# instance fields
.field private bonusIds:[I
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private bonusName:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private explicitRequest:Z

.field private isQuest:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusName:Ljava/lang/String;

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusIds:[I

    const/4 p1, 0x0

    .line 22
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->explicitRequest:Z

    .line 23
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->isQuest:Z

    return-void
.end method


# virtual methods
.method public varargs bonusIds([I)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusIds:[I

    return-object p0
.end method

.method public bonusName(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusName:Ljava/lang/String;

    return-object p0
.end method

.method public create()Landroid/content/Intent;
    .locals 3

    .line 51
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/bonus/BonusDetailActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 53
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusName:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "bonus_name"

    .line 54
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 57
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusIds:[I

    if-eqz v1, :cond_1

    const-string v2, "bonus_ids"

    .line 58
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    :cond_1
    const-string v1, "explicit_request"

    .line 61
    iget-boolean v2, p0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->explicitRequest:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v1, "is_quest"

    .line 63
    iget-boolean v2, p0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->isQuest:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object v0
.end method

.method public explicitRequest(Z)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;
    .locals 0

    .line 40
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->explicitRequest:Z

    return-object p0
.end method

.method public isQuest(Z)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;
    .locals 0

    .line 45
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->isQuest:Z

    return-object p0
.end method
