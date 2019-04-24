.class public abstract Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;
.super Ljava/lang/Object;
.source "McommEscortParamsParcel.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
    .locals 2

    .line 32
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;-><init>()V

    new-instance v1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;-><init>()V

    .line 33
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->retailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->NONE:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    .line 34
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;->eventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static builder(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
    .locals 1
    .param p0    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p0, :cond_0

    .line 40
    new-instance p0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {p0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;-><init>()V

    :cond_0
    if-nez p1, :cond_1

    .line 44
    sget-object p1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->NONE:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    .line 47
    :cond_1
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;-><init>()V

    .line 48
    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel$Builder;->retailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;

    move-result-object p0

    .line 49
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;->eventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract getDealId()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
.end method

.method public abstract getOfferId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getProductId()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
.end method

.method public abstract getSearchTerm()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method abstract toBuilder()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;
.end method

.method public withRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;
    .locals 1
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 26
    new-instance p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;-><init>()V

    .line 28
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->toBuilder()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;->retailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    move-result-object p1

    return-object p1
.end method
