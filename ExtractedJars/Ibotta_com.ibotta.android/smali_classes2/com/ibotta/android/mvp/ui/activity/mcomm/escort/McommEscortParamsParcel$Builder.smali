.class public abstract Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
.super Ljava/lang/Object;
.source "McommEscortParamsParcel.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;
.end method

.method public abstract dealId(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
.end method

.method protected abstract eventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
    .param p1    # Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract offerId(Ljava/lang/Integer;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
.end method

.method public abstract productId(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
.end method

.method protected abstract retailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
.end method

.method public abstract searchTerm(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
