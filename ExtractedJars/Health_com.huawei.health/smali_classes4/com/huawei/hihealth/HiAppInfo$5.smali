.class final Lcom/huawei/hihealth/HiAppInfo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/HiAppInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiAppInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)[Lcom/huawei/hihealth/HiAppInfo;
    .locals 1

    .line 62
    new-array v0, p1, [Lcom/huawei/hihealth/HiAppInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 54
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiAppInfo$5;->e(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiAppInfo;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiAppInfo;
    .locals 1

    .line 57
    new-instance v0, Lcom/huawei/hihealth/HiAppInfo;

    invoke-direct {v0, p1}, Lcom/huawei/hihealth/HiAppInfo;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 54
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiAppInfo$5;->b(I)[Lcom/huawei/hihealth/HiAppInfo;

    move-result-object v0

    return-object v0
.end method
