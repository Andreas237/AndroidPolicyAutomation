.class final Lcom/huawei/hwid/core/helper/handler/ErrorStatus$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/helper/handler/ErrorStatus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/helper/handler/ErrorStatus;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/helper/handler/ErrorStatus;
    .locals 2

    .line 135
    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    invoke-direct {v1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>()V

    .line 136
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->a(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;I)I

    .line 137
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->a(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    return-object v1
.end method

.method public a(I)[Lcom/huawei/hwid/core/helper/handler/ErrorStatus;
    .locals 1

    .line 142
    new-array v0, p1, [Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 132
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus$1;->a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 132
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus$1;->a(I)[Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    move-result-object v0

    return-object v0
.end method
