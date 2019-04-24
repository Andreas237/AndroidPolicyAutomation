.class final Lcom/huawei/hihealth/HiDataDeleteOption$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/HiDataDeleteOption;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiDataDeleteOption;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)[Lcom/huawei/hihealth/HiDataDeleteOption;
    .locals 1

    .line 69
    new-array v0, p1, [Lcom/huawei/hihealth/HiDataDeleteOption;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 61
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiDataDeleteOption$5;->d(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiDataDeleteOption;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiDataDeleteOption;
    .locals 1

    .line 64
    new-instance v0, Lcom/huawei/hihealth/HiDataDeleteOption;

    invoke-direct {v0, p1}, Lcom/huawei/hihealth/HiDataDeleteOption;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 61
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiDataDeleteOption$5;->c(I)[Lcom/huawei/hihealth/HiDataDeleteOption;

    move-result-object v0

    return-object v0
.end method
