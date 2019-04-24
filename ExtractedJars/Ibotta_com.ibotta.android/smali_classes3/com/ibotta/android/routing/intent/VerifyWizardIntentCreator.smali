.class public Lcom/ibotta/android/routing/intent/VerifyWizardIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "VerifyWizardIntentCreator.java"


# instance fields
.field private offerId:I

.field private retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/VerifyWizardIntentCreator;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 27
    iput p3, p0, Lcom/ibotta/android/routing/intent/VerifyWizardIntentCreator;->offerId:I

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 32
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/VerifyWizardIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "offer_id"

    .line 34
    iget v2, p0, Lcom/ibotta/android/routing/intent/VerifyWizardIntentCreator;->offerId:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "retailer"

    .line 35
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/VerifyWizardIntentCreator;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method
