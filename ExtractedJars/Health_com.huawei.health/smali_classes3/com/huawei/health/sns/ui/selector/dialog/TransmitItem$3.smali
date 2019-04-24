.class final Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 132
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem$3;->e(Landroid/os/Parcel;)Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;

    move-result-object v0

    return-object v0
.end method

.method public d(I)[Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;
    .locals 1

    .line 143
    new-array v0, p1, [Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;
    .locals 2

    .line 137
    new-instance v0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;-><init>(Landroid/os/Parcel;Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem$3;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 132
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem$3;->d(I)[Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;

    move-result-object v0

    return-object v0
.end method
