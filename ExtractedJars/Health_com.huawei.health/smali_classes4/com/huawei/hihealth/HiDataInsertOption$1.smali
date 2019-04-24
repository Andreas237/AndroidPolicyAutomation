.class final Lcom/huawei/hihealth/HiDataInsertOption$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/HiDataInsertOption;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiDataInsertOption;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiDataInsertOption;
    .locals 1

    .line 48
    new-instance v0, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v0, p1}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 45
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiDataInsertOption$1;->c(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiDataInsertOption;

    move-result-object v0

    return-object v0
.end method

.method public d(I)[Lcom/huawei/hihealth/HiDataInsertOption;
    .locals 1

    .line 53
    new-array v0, p1, [Lcom/huawei/hihealth/HiDataInsertOption;

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 45
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiDataInsertOption$1;->d(I)[Lcom/huawei/hihealth/HiDataInsertOption;

    move-result-object v0

    return-object v0
.end method
