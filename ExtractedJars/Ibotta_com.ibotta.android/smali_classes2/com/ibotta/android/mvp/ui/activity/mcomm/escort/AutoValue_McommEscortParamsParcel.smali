.class final Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/AutoValue_McommEscortParamsParcel;
.super Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;
.source "AutoValue_McommEscortParamsParcel.java"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/AutoValue_McommEscortParamsParcel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/AutoValue_McommEscortParamsParcel$1;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/AutoValue_McommEscortParamsParcel$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/AutoValue_McommEscortParamsParcel;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 35
    invoke-direct/range {p0 .. p6}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/$AutoValue_McommEscortParamsParcel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 40
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/AutoValue_McommEscortParamsParcel;->getDealId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 41
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/AutoValue_McommEscortParamsParcel;->getDealId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 46
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/AutoValue_McommEscortParamsParcel;->getProductId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 47
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 50
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/AutoValue_McommEscortParamsParcel;->getProductId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 52
    :goto_1
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/AutoValue_McommEscortParamsParcel;->getSearchTerm()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 53
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    .line 55
    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 56
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/AutoValue_McommEscortParamsParcel;->getSearchTerm()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 58
    :goto_2
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/AutoValue_McommEscortParamsParcel;->getOfferId()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_3

    .line 59
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    .line 61
    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 62
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/AutoValue_McommEscortParamsParcel;->getOfferId()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 64
    :goto_3
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/AutoValue_McommEscortParamsParcel;->getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 65
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/AutoValue_McommEscortParamsParcel;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
