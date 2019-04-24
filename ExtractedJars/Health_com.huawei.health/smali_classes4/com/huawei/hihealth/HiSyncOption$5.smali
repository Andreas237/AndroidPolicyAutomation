.class final Lcom/huawei/hihealth/HiSyncOption$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/HiSyncOption;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiSyncOption;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiSyncOption;
    .locals 1

    .line 179
    new-instance v0, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v0, p1}, Lcom/huawei/hihealth/HiSyncOption;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public c(I)[Lcom/huawei/hihealth/HiSyncOption;
    .locals 1

    .line 184
    new-array v0, p1, [Lcom/huawei/hihealth/HiSyncOption;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 176
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiSyncOption$5;->a(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiSyncOption;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 176
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiSyncOption$5;->c(I)[Lcom/huawei/hihealth/HiSyncOption;

    move-result-object v0

    return-object v0
.end method
