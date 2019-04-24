.class final Lcom/huawei/hihealth/HiHealthClient$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/HiHealthClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiHealthClient;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 37
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiHealthClient$3;->e(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiHealthClient;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiHealthClient;
    .locals 1

    .line 40
    new-instance v0, Lcom/huawei/hihealth/HiHealthClient;

    invoke-direct {v0, p1}, Lcom/huawei/hihealth/HiHealthClient;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public e(I)[Lcom/huawei/hihealth/HiHealthClient;
    .locals 1

    .line 45
    new-array v0, p1, [Lcom/huawei/hihealth/HiHealthClient;

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 37
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiHealthClient$3;->e(I)[Lcom/huawei/hihealth/HiHealthClient;

    move-result-object v0

    return-object v0
.end method
