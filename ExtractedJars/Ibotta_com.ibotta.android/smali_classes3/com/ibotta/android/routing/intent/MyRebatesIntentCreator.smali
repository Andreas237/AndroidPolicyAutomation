.class public Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "MyRebatesIntentCreator.java"


# instance fields
.field private auxiliaryEnabled:Z

.field private imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private retailerId:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private retailerName:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private verificationType:Lcom/ibotta/api/model/common/VerificationType;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->retailerId:Ljava/lang/Integer;

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->verificationType:Lcom/ibotta/api/model/common/VerificationType;

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    const/4 p1, 0x0

    .line 29
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->auxiliaryEnabled:Z

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 4

    .line 56
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 58
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->retailerId:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    .line 59
    new-instance v1, Landroid/content/ComponentName;

    iget-object v2, p0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->context:Landroid/content/Context;

    const-class v3, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 61
    new-instance v1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;-><init>()V

    .line 62
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setId(I)V

    .line 63
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->retailerName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setName(Ljava/lang/String;)V

    .line 64
    iget-boolean v2, p0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->auxiliaryEnabled:Z

    invoke-virtual {v1, v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setAuxiliaryLoyaltyEnabled(Z)V

    .line 65
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->verificationType:Lcom/ibotta/api/model/common/VerificationType;

    if-eqz v2, :cond_0

    .line 66
    invoke-virtual {v1, v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setVerificationType(Lcom/ibotta/api/model/common/VerificationType;)V

    :cond_0
    const-string v2, "retailer"

    .line 69
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v1, "im_connection_status"

    .line 70
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    goto :goto_0

    .line 72
    :cond_1
    new-instance v1, Landroid/content/ComponentName;

    iget-object v2, p0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->context:Landroid/content/Context;

    const-class v3, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 73
    invoke-virtual {p0, v0}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->addClearFlags(Landroid/content/Intent;)V

    :goto_0
    return-object v0
.end method

.method public imConnectionStatus(Lcom/ibotta/api/model/im/ImConnectionStatus;)Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    return-object p0
.end method

.method public retailerId(I)Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;
    .locals 0

    .line 36
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->retailerId:Ljava/lang/Integer;

    return-object p0
.end method

.method public retailerName(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->retailerName:Ljava/lang/String;

    return-object p0
.end method

.method public verificationType(Lcom/ibotta/api/model/common/VerificationType;)Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->verificationType:Lcom/ibotta/api/model/common/VerificationType;

    return-object p0
.end method
