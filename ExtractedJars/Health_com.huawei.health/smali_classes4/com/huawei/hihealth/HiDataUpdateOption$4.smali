.class final Lcom/huawei/hihealth/HiDataUpdateOption$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/HiDataUpdateOption;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiDataUpdateOption;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiDataUpdateOption$4;->d(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiDataUpdateOption;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiDataUpdateOption;
    .locals 1

    .line 47
    new-instance v0, Lcom/huawei/hihealth/HiDataUpdateOption;

    invoke-direct {v0, p1}, Lcom/huawei/hihealth/HiDataUpdateOption;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public d(I)[Lcom/huawei/hihealth/HiDataUpdateOption;
    .locals 1

    .line 52
    new-array v0, p1, [Lcom/huawei/hihealth/HiDataUpdateOption;

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiDataUpdateOption$4;->d(I)[Lcom/huawei/hihealth/HiDataUpdateOption;

    move-result-object v0

    return-object v0
.end method
