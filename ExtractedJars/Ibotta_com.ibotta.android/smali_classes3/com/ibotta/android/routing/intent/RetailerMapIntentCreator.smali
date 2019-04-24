.class public Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "RetailerMapIntentCreator.java"


# instance fields
.field private cantFindIt:Z

.field private offerId:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final retailerId:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 21
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->cantFindIt:Z

    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->offerId:Ljava/lang/Integer;

    .line 26
    iput p2, p0, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->retailerId:I

    return-void
.end method


# virtual methods
.method public cantFindIt(Z)Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;
    .locals 0

    .line 30
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->cantFindIt:Z

    return-object p0
.end method

.method public create()Landroid/content/Intent;
    .locals 5

    .line 41
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "retailer_id"

    .line 42
    iget v2, p0, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->retailerId:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "cant_find_it"

    .line 43
    iget-boolean v2, p0, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->cantFindIt:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 45
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->offerId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    const-string v2, "offer_id"

    .line 46
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 50
    :cond_0
    iget-boolean v1, p0, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->cantFindIt:Z

    if-eqz v1, :cond_1

    .line 51
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->context:Landroid/content/Context;

    const v2, 0x7f110245

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 53
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->context:Landroid/content/Context;

    const v2, 0x7f11024c

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 56
    :goto_0
    new-instance v2, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    iget-object v3, p0, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->context:Landroid/content/Context;

    sget-object v4, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-direct {v2, v3, v4, v1, v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Ljava/lang/String;Landroid/content/Intent;)V

    const/4 v0, 0x0

    .line 57
    invoke-virtual {v2, v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->requestCode(I)Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public offerId(I)Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;
    .locals 0

    .line 35
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/RetailerMapIntentCreator;->offerId:Ljava/lang/Integer;

    return-object p0
.end method
