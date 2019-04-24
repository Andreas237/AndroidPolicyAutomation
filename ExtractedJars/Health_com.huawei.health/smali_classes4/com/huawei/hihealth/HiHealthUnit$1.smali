.class final Lcom/huawei/hihealth/HiHealthUnit$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/HiHealthUnit;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiHealthUnit;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiHealthUnit;
    .locals 1

    .line 129
    new-instance v0, Lcom/huawei/hihealth/HiHealthUnit;

    invoke-direct {v0, p1}, Lcom/huawei/hihealth/HiHealthUnit;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public b(I)[Lcom/huawei/hihealth/HiHealthUnit;
    .locals 1

    .line 134
    new-array v0, p1, [Lcom/huawei/hihealth/HiHealthUnit;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 126
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiHealthUnit$1;->b(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiHealthUnit;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 126
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiHealthUnit$1;->b(I)[Lcom/huawei/hihealth/HiHealthUnit;

    move-result-object v0

    return-object v0
.end method
