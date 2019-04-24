.class final Lcom/huawei/health/sns/model/circle/CircleActionParam$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/model/circle/CircleActionParam;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/circle/CircleActionParam;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)[Lcom/huawei/health/sns/model/circle/CircleActionParam;
    .locals 1

    .line 81
    new-array v0, p1, [Lcom/huawei/health/sns/model/circle/CircleActionParam;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 70
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/model/circle/CircleActionParam$3;->d(Landroid/os/Parcel;)Lcom/huawei/health/sns/model/circle/CircleActionParam;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/os/Parcel;)Lcom/huawei/health/sns/model/circle/CircleActionParam;
    .locals 1

    .line 75
    new-instance v0, Lcom/huawei/health/sns/model/circle/CircleActionParam;

    invoke-direct {v0, p1}, Lcom/huawei/health/sns/model/circle/CircleActionParam;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 70
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/model/circle/CircleActionParam$3;->a(I)[Lcom/huawei/health/sns/model/circle/CircleActionParam;

    move-result-object v0

    return-object v0
.end method
