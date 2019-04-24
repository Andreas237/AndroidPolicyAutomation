.class final Lcom/huawei/hihealth/HiDataReadOption$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/HiDataReadOption;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiDataReadOption;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)[Lcom/huawei/hihealth/HiDataReadOption;
    .locals 1

    .line 100
    new-array v0, p1, [Lcom/huawei/hihealth/HiDataReadOption;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 92
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiDataReadOption$1;->e(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiDataReadOption;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiDataReadOption;
    .locals 1

    .line 95
    new-instance v0, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v0, p1}, Lcom/huawei/hihealth/HiDataReadOption;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 92
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiDataReadOption$1;->c(I)[Lcom/huawei/hihealth/HiDataReadOption;

    move-result-object v0

    return-object v0
.end method
