.class public Lcom/ibotta/android/routing/intent/EngagementIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "EngagementIntentCreator.java"


# instance fields
.field private final needsLocationPermissions:Z

.field private final offerId:I

.field private retailerId:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;->retailerId:Ljava/lang/Integer;

    const/4 p1, 0x0

    .line 37
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;->needsLocationPermissions:Z

    .line 38
    iput p2, p0, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;->offerId:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ZI)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;->retailerId:Ljava/lang/Integer;

    .line 29
    iput-boolean p2, p0, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;->needsLocationPermissions:Z

    .line 30
    iput p3, p0, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;->offerId:I

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 5

    .line 48
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "offer_id"

    .line 49
    iget v2, p0, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;->offerId:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 51
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;->retailerId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    const-string v2, "retailer_id"

    .line 52
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 55
    :cond_0
    iget-boolean v1, p0, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;->needsLocationPermissions:Z

    if-eqz v1, :cond_1

    .line 56
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v1

    const v2, 0x7f11024c

    invoke-virtual {v1, v2}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 57
    new-instance v2, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    iget-object v3, p0, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;->context:Landroid/content/Context;

    sget-object v4, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-direct {v2, v3, v4, v1, v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Ljava/lang/String;Landroid/content/Intent;)V

    const/4 v0, 0x0

    .line 58
    invoke-virtual {v2, v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->requestCode(I)Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v0
.end method

.method public retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/routing/intent/EngagementIntentCreator;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 42
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/EngagementIntentCreator;->retailerId:Ljava/lang/Integer;

    return-object p0
.end method
