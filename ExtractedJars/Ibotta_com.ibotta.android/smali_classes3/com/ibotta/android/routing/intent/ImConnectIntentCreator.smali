.class public Lcom/ibotta/android/routing/intent/ImConnectIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "ImConnectIntentCreator.java"


# instance fields
.field private final retailerId:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 15
    iput p2, p0, Lcom/ibotta/android/routing/intent/ImConnectIntentCreator;->retailerId:I

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 20
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/ImConnectIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "retailer_id"

    iget v2, p0, Lcom/ibotta/android/routing/intent/ImConnectIntentCreator;->retailerId:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method
