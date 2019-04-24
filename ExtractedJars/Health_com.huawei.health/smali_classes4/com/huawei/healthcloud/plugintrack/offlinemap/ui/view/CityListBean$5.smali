.class final Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Parcel;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;
    .locals 1

    .line 27
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;

    invoke-direct {v0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public b(I)[Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;
    .locals 1

    .line 32
    new-array v0, p1, [Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 24
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean$5;->b(Landroid/os/Parcel;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 24
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean$5;->b(I)[Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;

    move-result-object v0

    return-object v0
.end method
