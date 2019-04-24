.class final Lcom/huawei/pluginachievement/manager/model/TrackData$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/manager/model/TrackData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/pluginachievement/manager/model/TrackData;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 84
    invoke-virtual {p0, p1}, Lcom/huawei/pluginachievement/manager/model/TrackData$2;->e(Landroid/os/Parcel;)Lcom/huawei/pluginachievement/manager/model/TrackData;

    move-result-object v0

    return-object v0
.end method

.method public d(I)[Lcom/huawei/pluginachievement/manager/model/TrackData;
    .locals 1

    .line 92
    new-array v0, p1, [Lcom/huawei/pluginachievement/manager/model/TrackData;

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Lcom/huawei/pluginachievement/manager/model/TrackData;
    .locals 1

    .line 87
    new-instance v0, Lcom/huawei/pluginachievement/manager/model/TrackData;

    invoke-direct {v0, p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 84
    invoke-virtual {p0, p1}, Lcom/huawei/pluginachievement/manager/model/TrackData$2;->d(I)[Lcom/huawei/pluginachievement/manager/model/TrackData;

    move-result-object v0

    return-object v0
.end method
