.class public Lcom/ibotta/android/routing/intent/LoyaltyCardIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "LoyaltyCardIntentCreator.java"


# instance fields
.field private final retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 21
    new-instance p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;-><init>()V

    .line 22
    invoke-virtual {p1, p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setId(I)V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/LoyaltyCardIntentCreator;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 27
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/LoyaltyCardIntentCreator;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 33
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/LoyaltyCardIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "retailer"

    .line 34
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/LoyaltyCardIntentCreator;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method
