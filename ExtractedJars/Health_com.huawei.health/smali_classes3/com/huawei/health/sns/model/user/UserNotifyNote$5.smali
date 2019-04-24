.class final Lcom/huawei/health/sns/model/user/UserNotifyNote$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/model/user/UserNotifyNote;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Parcel;)Lcom/huawei/health/sns/model/user/UserNotifyNote;
    .locals 2

    .line 94
    new-instance v0, Lcom/huawei/health/sns/model/user/UserNotifyNote;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/huawei/health/sns/model/user/UserNotifyNote;-><init>(Landroid/os/Parcel;Lcom/huawei/health/sns/model/user/UserNotifyNote$5;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 91
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/model/user/UserNotifyNote$5;->b(Landroid/os/Parcel;)Lcom/huawei/health/sns/model/user/UserNotifyNote;

    move-result-object v0

    return-object v0
.end method

.method public d(I)[Lcom/huawei/health/sns/model/user/UserNotifyNote;
    .locals 1

    .line 99
    new-array v0, p1, [Lcom/huawei/health/sns/model/user/UserNotifyNote;

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 91
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/model/user/UserNotifyNote$5;->d(I)[Lcom/huawei/health/sns/model/user/UserNotifyNote;

    move-result-object v0

    return-object v0
.end method
