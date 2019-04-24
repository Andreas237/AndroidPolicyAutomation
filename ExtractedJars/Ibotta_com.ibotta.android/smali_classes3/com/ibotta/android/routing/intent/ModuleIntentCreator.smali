.class public Lcom/ibotta/android/routing/intent/ModuleIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "ModuleIntentCreator.java"


# instance fields
.field private final moduleId:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 21
    iput p2, p0, Lcom/ibotta/android/routing/intent/ModuleIntentCreator;->moduleId:I

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 26
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/ModuleIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/module/ModuleActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "module_id"

    .line 27
    iget v2, p0, Lcom/ibotta/android/routing/intent/ModuleIntentCreator;->moduleId:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-object v0
.end method
