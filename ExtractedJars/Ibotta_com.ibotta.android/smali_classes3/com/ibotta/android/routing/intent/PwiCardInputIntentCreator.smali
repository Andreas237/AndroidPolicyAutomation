.class public Lcom/ibotta/android/routing/intent/PwiCardInputIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "PwiCardInputIntentCreator.java"


# instance fields
.field private final isFirstTimeCard:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 19
    iput-boolean p2, p0, Lcom/ibotta/android/routing/intent/PwiCardInputIntentCreator;->isFirstTimeCard:Z

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 24
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/PwiCardInputIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "pwi_first_time_card"

    .line 25
    iget-boolean v2, p0, Lcom/ibotta/android/routing/intent/PwiCardInputIntentCreator;->isFirstTimeCard:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object v0
.end method
