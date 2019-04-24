.class final Lcom/huawei/hihealth/HiDeviceInfo$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/HiDeviceInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiDeviceInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiDeviceInfo;
    .locals 1

    .line 157
    new-instance v0, Lcom/huawei/hihealth/HiDeviceInfo;

    invoke-direct {v0, p1}, Lcom/huawei/hihealth/HiDeviceInfo;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/huawei/hihealth/HiDeviceInfo;
    .locals 1

    .line 162
    new-array v0, p1, [Lcom/huawei/hihealth/HiDeviceInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 154
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiDeviceInfo$3;->a(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 154
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiDeviceInfo$3;->a(I)[Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v0

    return-object v0
.end method
