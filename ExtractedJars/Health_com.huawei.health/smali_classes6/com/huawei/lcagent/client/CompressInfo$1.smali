.class Lcom/huawei/lcagent/client/CompressInfo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/lcagent/client/CompressInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/huawei/lcagent/client/CompressInfo;
    .locals 2

    .line 64
    new-instance v0, Lcom/huawei/lcagent/client/CompressInfo;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/huawei/lcagent/client/CompressInfo;-><init>(Landroid/os/Parcel;Lcom/huawei/lcagent/client/CompressInfo;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/lcagent/client/CompressInfo$1;->createFromParcel(Landroid/os/Parcel;)Lcom/huawei/lcagent/client/CompressInfo;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/huawei/lcagent/client/CompressInfo;
    .locals 1

    .line 69
    new-array v0, p1, [Lcom/huawei/lcagent/client/CompressInfo;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/lcagent/client/CompressInfo$1;->newArray(I)[Lcom/huawei/lcagent/client/CompressInfo;

    move-result-object v0

    return-object v0
.end method
