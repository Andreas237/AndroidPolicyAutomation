.class final Lcom/huawei/hwid/core/datatype/DeviceInfo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/datatype/DeviceInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/datatype/DeviceInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 238
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/datatype/DeviceInfo;
    .locals 2

    .line 240
    new-instance v1, Lcom/huawei/hwid/core/datatype/DeviceInfo;

    invoke-direct {v1}, Lcom/huawei/hwid/core/datatype/DeviceInfo;-><init>()V

    .line 241
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/DeviceInfo;->a(Lcom/huawei/hwid/core/datatype/DeviceInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 242
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/DeviceInfo;->b(Lcom/huawei/hwid/core/datatype/DeviceInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 243
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/DeviceInfo;->c(Lcom/huawei/hwid/core/datatype/DeviceInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 244
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/DeviceInfo;->d(Lcom/huawei/hwid/core/datatype/DeviceInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 245
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/DeviceInfo;->e(Lcom/huawei/hwid/core/datatype/DeviceInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 246
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/DeviceInfo;->f(Lcom/huawei/hwid/core/datatype/DeviceInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 247
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/DeviceInfo;->g(Lcom/huawei/hwid/core/datatype/DeviceInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 249
    return-object v1
.end method

.method public a(I)[Lcom/huawei/hwid/core/datatype/DeviceInfo;
    .locals 1

    .line 253
    new-array v0, p1, [Lcom/huawei/hwid/core/datatype/DeviceInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 238
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/datatype/DeviceInfo$1;->a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/datatype/DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 238
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/datatype/DeviceInfo$1;->a(I)[Lcom/huawei/hwid/core/datatype/DeviceInfo;

    move-result-object v0

    return-object v0
.end method
