.class final Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 164
    invoke-virtual {p0, p1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData$2;->d(Landroid/os/Parcel;)Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/os/Parcel;)Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;
    .locals 2

    .line 167
    new-instance v0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;-><init>(Landroid/os/Parcel;Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData$2;)V

    return-object v0
.end method

.method public d(I)[Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;
    .locals 1

    .line 172
    new-array v0, p1, [Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 164
    invoke-virtual {p0, p1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData$2;->d(I)[Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    move-result-object v0

    return-object v0
.end method
