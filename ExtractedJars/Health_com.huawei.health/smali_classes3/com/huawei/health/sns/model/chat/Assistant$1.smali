.class final Lcom/huawei/health/sns/model/chat/Assistant$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/model/chat/Assistant;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/chat/Assistant;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 185
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/model/chat/Assistant$1;->e(Landroid/os/Parcel;)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Lcom/huawei/health/sns/model/chat/Assistant;
    .locals 2

    .line 190
    new-instance v0, Lcom/huawei/health/sns/model/chat/Assistant;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/huawei/health/sns/model/chat/Assistant;-><init>(Landroid/os/Parcel;Lcom/huawei/health/sns/model/chat/Assistant$1;)V

    return-object v0
.end method

.method public e(I)[Lcom/huawei/health/sns/model/chat/Assistant;
    .locals 1

    .line 196
    new-array v0, p1, [Lcom/huawei/health/sns/model/chat/Assistant;

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 185
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/model/chat/Assistant$1;->e(I)[Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v0

    return-object v0
.end method
