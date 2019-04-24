.class public Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;
.super Ljava/lang/Object;
.source "EngagementPresenterState$$Parcelable.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lorg/parceler/ParcelWrapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Lorg/parceler/ParcelWrapper<",
        "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private engagementPresenterState$$0:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable$1;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;->engagementPresenterState$$0:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    return-void
.end method

.method public static read(Landroid/os/Parcel;Lorg/parceler/IdentityCollection;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;
    .locals 8

    .line 93
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 94
    invoke-virtual {p1, v0}, Lorg/parceler/IdentityCollection;->containsKey(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 95
    invoke-virtual {p1, v0}, Lorg/parceler/IdentityCollection;->isReserved(I)Z

    move-result p0

    if-nez p0, :cond_0

    .line 98
    invoke-virtual {p1, v0}, Lorg/parceler/IdentityCollection;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    return-object p0

    .line 96
    :cond_0
    new-instance p0, Lorg/parceler/ParcelerRuntimeException;

    const-string p1, "An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory."

    invoke-direct {p0, p1}, Lorg/parceler/ParcelerRuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 101
    :cond_1
    invoke-virtual {p1}, Lorg/parceler/IdentityCollection;->reserve()I

    move-result v1

    .line 102
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-direct {v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;-><init>()V

    .line 103
    invoke-virtual {p1, v1, v2}, Lorg/parceler/IdentityCollection;->put(ILjava/lang/Object;)V

    .line 104
    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, v2, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->linkedRewardId:J

    .line 105
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    iput-boolean v4, v2, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->permissionsNeeded:Z

    .line 106
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->offerName:Ljava/lang/String;

    .line 107
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v2, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->offerSegmentId:I

    .line 108
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v4, 0x0

    if-gez v1, :cond_3

    goto :goto_3

    .line 113
    :cond_3
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5, v1}, Ljava/util/HashMap;-><init>(I)V

    :goto_1
    if-ge v3, v1, :cond_5

    .line 115
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-gez v6, :cond_4

    move-object v6, v4

    goto :goto_2

    .line 120
    :cond_4
    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    .line 123
    :goto_2
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    .line 124
    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    move-object v4, v5

    .line 127
    :goto_3
    iput-object v4, v2, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->engagementResponses:Ljava/util/Map;

    .line 128
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v2, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->segmentId:I

    .line 129
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v2, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->offerId:I

    .line 130
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v2, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->linkedOfferId:I

    .line 131
    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, v2, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->currentRewardId:J

    .line 132
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v2, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->retailerId:I

    .line 133
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v2, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->currentValue:Ljava/lang/String;

    .line 135
    invoke-virtual {p1, v0, v2}, Lorg/parceler/IdentityCollection;->put(ILjava/lang/Object;)V

    return-object v2
.end method

.method public static write(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;Landroid/os/Parcel;ILorg/parceler/IdentityCollection;)V
    .locals 3

    .line 50
    invoke-virtual {p3, p0}, Lorg/parceler/IdentityCollection;->getKey(Ljava/lang/Object;)I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 52
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto/16 :goto_3

    .line 54
    :cond_0
    invoke-virtual {p3, p0}, Lorg/parceler/IdentityCollection;->put(Ljava/lang/Object;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 55
    iget-wide p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->linkedRewardId:J

    invoke-virtual {p1, p2, p3}, Landroid/os/Parcel;->writeLong(J)V

    .line 56
    iget-boolean p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->permissionsNeeded:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 57
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->offerName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 58
    iget p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->offerSegmentId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 59
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->engagementResponses:Ljava/util/Map;

    if-nez p2, :cond_1

    .line 60
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    .line 62
    :cond_1
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->engagementResponses:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 63
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->engagementResponses:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    .line 64
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    .line 65
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    .line 67
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 68
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Landroid/os/Parcel;->writeLong(J)V

    .line 70
    :goto_1
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 73
    :cond_3
    :goto_2
    iget p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->segmentId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 74
    iget p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->offerId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 75
    iget p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->linkedOfferId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 76
    iget-wide p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->currentRewardId:J

    invoke-virtual {p1, p2, p3}, Landroid/os/Parcel;->writeLong(J)V

    .line 77
    iget p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->retailerId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 78
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->currentValue:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_3
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getParcel()Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;->engagementPresenterState$$0:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    return-object v0
.end method

.method public bridge synthetic getParcel()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;->getParcel()Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;->engagementPresenterState$$0:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    new-instance v1, Lorg/parceler/IdentityCollection;

    invoke-direct {v1}, Lorg/parceler/IdentityCollection;-><init>()V

    invoke-static {v0, p1, p2, v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState$$Parcelable;->write(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;Landroid/os/Parcel;ILorg/parceler/IdentityCollection;)V

    return-void
.end method
