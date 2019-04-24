.class final Lcom/huawei/hihealth/HiTimeInterval$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/HiTimeInterval;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiTimeInterval;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiTimeInterval;
    .locals 1

    .line 62
    new-instance v0, Lcom/huawei/hihealth/HiTimeInterval;

    invoke-direct {v0, p1}, Lcom/huawei/hihealth/HiTimeInterval;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public b(I)[Lcom/huawei/hihealth/HiTimeInterval;
    .locals 1

    .line 67
    new-array v0, p1, [Lcom/huawei/hihealth/HiTimeInterval;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 59
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiTimeInterval$4;->a(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiTimeInterval;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 59
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiTimeInterval$4;->b(I)[Lcom/huawei/hihealth/HiTimeInterval;

    move-result-object v0

    return-object v0
.end method
