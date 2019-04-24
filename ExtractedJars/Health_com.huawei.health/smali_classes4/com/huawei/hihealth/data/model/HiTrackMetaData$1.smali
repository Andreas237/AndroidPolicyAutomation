.class final Lcom/huawei/hihealth/data/model/HiTrackMetaData$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/data/model/HiTrackMetaData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/data/model/HiTrackMetaData;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 294
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/huawei/hihealth/data/model/HiTrackMetaData;
    .locals 1

    .line 297
    new-instance v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-direct {v0, p1}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 294
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/data/model/HiTrackMetaData$1;->createFromParcel(Landroid/os/Parcel;)Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/huawei/hihealth/data/model/HiTrackMetaData;
    .locals 1

    .line 302
    new-array v0, p1, [Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 294
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/data/model/HiTrackMetaData$1;->newArray(I)[Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    move-result-object v0

    return-object v0
.end method
