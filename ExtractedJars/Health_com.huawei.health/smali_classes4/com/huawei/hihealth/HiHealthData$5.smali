.class final Lcom/huawei/hihealth/HiHealthData$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/HiHealthData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiHealthData;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiHealthData;
    .locals 1

    .line 97
    new-instance v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v0, p1}, Lcom/huawei/hihealth/HiHealthData;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 94
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiHealthData$5;->c(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    return-object v0
.end method

.method public d(I)[Lcom/huawei/hihealth/HiHealthData;
    .locals 1

    .line 102
    new-array v0, p1, [Lcom/huawei/hihealth/HiHealthData;

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 94
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiHealthData$5;->d(I)[Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    return-object v0
.end method
