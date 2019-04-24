.class public Lcom/ibotta/android/routing/intent/AccountIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "AccountIntentCreator.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 20
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/AccountIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/account/AccountActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 21
    invoke-virtual {p0, v0}, Lcom/ibotta/android/routing/intent/AccountIntentCreator;->addClearFlags(Landroid/content/Intent;)V

    return-object v0
.end method
