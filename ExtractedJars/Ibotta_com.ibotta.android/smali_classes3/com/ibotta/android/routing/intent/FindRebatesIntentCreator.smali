.class public Lcom/ibotta/android/routing/intent/FindRebatesIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "FindRebatesIntentCreator.java"


# instance fields
.field private final addClearFlags:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 13
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 14
    iput-boolean p2, p0, Lcom/ibotta/android/routing/intent/FindRebatesIntentCreator;->addClearFlags:Z

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 19
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/FindRebatesIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 20
    iget-boolean v1, p0, Lcom/ibotta/android/routing/intent/FindRebatesIntentCreator;->addClearFlags:Z

    if-eqz v1, :cond_0

    .line 21
    invoke-virtual {p0, v0}, Lcom/ibotta/android/routing/intent/FindRebatesIntentCreator;->addClearFlags(Landroid/content/Intent;)V

    :cond_0
    return-object v0
.end method
