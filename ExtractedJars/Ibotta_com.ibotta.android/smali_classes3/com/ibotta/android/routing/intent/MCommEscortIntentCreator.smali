.class public Lcom/ibotta/android/routing/intent/MCommEscortIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "MCommEscortIntentCreator.java"


# instance fields
.field private final mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/MCommEscortIntentCreator;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 26
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/MCommEscortIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/MCommEscortActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "mcomm_escort_params_parcel"

    .line 27
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/MCommEscortIntentCreator;->mcommEscortParamsParcel:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    invoke-static {v2}, Lorg/parceler/Parcels;->wrap(Ljava/lang/Object;)Landroid/os/Parcelable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method
