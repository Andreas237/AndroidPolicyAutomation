.class final Lcom/huawei/hihealth/data/model/HiStressGameMetaData$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/data/model/HiStressGameMetaData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/data/model/HiStressGameMetaData;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 255
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/huawei/hihealth/data/model/HiStressGameMetaData;
    .locals 1

    .line 258
    new-instance v0, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;

    invoke-direct {v0, p1}, Lcom/huawei/hihealth/data/model/HiStressGameMetaData;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 255
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/data/model/HiStressGameMetaData$1;->createFromParcel(Landroid/os/Parcel;)Lcom/huawei/hihealth/data/model/HiStressGameMetaData;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/huawei/hihealth/data/model/HiStressGameMetaData;
    .locals 1

    .line 263
    new-array v0, p1, [Lcom/huawei/hihealth/data/model/HiStressGameMetaData;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 255
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/data/model/HiStressGameMetaData$1;->newArray(I)[Lcom/huawei/hihealth/data/model/HiStressGameMetaData;

    move-result-object v0

    return-object v0
.end method
