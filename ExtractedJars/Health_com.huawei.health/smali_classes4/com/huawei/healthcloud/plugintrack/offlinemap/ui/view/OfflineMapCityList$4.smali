.class final Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;
    .locals 1

    .line 85
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;

    invoke-direct {v0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 82
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList$4;->a(Landroid/os/Parcel;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;

    move-result-object v0

    return-object v0
.end method

.method public d(I)[Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;
    .locals 1

    .line 90
    new-array v0, p1, [Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 82
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList$4;->d(I)[Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;

    move-result-object v0

    return-object v0
.end method
