.class final Lcom/huawei/multisimservice/model/MultiSimDeviceInfo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 153
    invoke-virtual {p0, p1}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo$5;->d(Landroid/os/Parcel;)Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/os/Parcel;)Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;
    .locals 1

    .line 157
    new-instance v0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-direct {v0, p1}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public d(I)[Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;
    .locals 1

    .line 162
    new-array v0, p1, [Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 153
    invoke-virtual {p0, p1}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo$5;->d(I)[Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    move-result-object v0

    return-object v0
.end method
