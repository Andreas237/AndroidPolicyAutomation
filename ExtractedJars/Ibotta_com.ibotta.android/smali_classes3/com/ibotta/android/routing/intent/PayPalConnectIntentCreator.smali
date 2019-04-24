.class public Lcom/ibotta/android/routing/intent/PayPalConnectIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "PayPalConnectIntentCreator.java"


# instance fields
.field private final password:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 13
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/PayPalConnectIntentCreator;->password:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 18
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/PayPalConnectIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/paypal/PayPalConnectActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "password"

    iget-object v2, p0, Lcom/ibotta/android/routing/intent/PayPalConnectIntentCreator;->password:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method
