.class final Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;
    .locals 1

    .line 50
    new-instance v0, Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;

    invoke-direct {v0, p1}, Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;
    .locals 1

    .line 55
    new-array v0, p1, [Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 47
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues$1;->a(Landroid/os/Parcel;)Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 47
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues$1;->a(I)[Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;

    move-result-object v0

    return-object v0
.end method
