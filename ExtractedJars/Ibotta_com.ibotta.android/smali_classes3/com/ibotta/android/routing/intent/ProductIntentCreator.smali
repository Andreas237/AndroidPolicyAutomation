.class public Lcom/ibotta/android/routing/intent/ProductIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "ProductIntentCreator.java"


# instance fields
.field private final productId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 19
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/ProductIntentCreator;->productId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 24
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/ProductIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/product/ProductActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "product_id"

    .line 25
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/ProductIntentCreator;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method
