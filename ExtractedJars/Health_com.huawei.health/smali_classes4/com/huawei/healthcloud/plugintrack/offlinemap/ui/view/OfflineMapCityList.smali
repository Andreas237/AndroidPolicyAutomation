.class public Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;>;"
        }
    .end annotation
.end field


# instance fields
.field private mAllCityMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;>;"
        }
    .end annotation
.end field

.field private transient mDownCityList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;"
        }
    .end annotation
.end field

.field private transient mLoadingCityList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;"
        }
    .end annotation
.end field

.field private transient mProvinceList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapProvince;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 82
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList$4;

    invoke-direct {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList$4;-><init>()V

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mProvinceList:Ljava/util/ArrayList;

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mDownCityList:Ljava/util/ArrayList;

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mLoadingCityList:Ljava/util/ArrayList;

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mAllCityMap:Ljava/util/HashMap;

    .line 45
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mProvinceList:Ljava/util/ArrayList;

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mDownCityList:Ljava/util/ArrayList;

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mLoadingCityList:Ljava/util/ArrayList;

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mAllCityMap:Ljava/util/HashMap;

    .line 59
    const-class v0, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mProvinceList:Ljava/util/ArrayList;

    .line 61
    const-class v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mAllCityMap:Ljava/util/HashMap;

    .line 62
    const-class v0, Lcom/amap/api/maps/offlinemap/OfflineMapCity;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mDownCityList:Ljava/util/ArrayList;

    .line 63
    const-class v0, Lcom/amap/api/maps/offlinemap/OfflineMapCity;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mLoadingCityList:Ljava/util/ArrayList;

    .line 64
    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapProvince;>;Ljava/util/HashMap<Ljava/lang/Integer;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;>;Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;)V"
        }
    .end annotation

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mProvinceList:Ljava/util/ArrayList;

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mDownCityList:Ljava/util/ArrayList;

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mLoadingCityList:Ljava/util/ArrayList;

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mAllCityMap:Ljava/util/HashMap;

    .line 52
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mProvinceList:Ljava/util/ArrayList;

    .line 53
    iput-object p2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mAllCityMap:Ljava/util/HashMap;

    .line 54
    iput-object p3, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mDownCityList:Ljava/util/ArrayList;

    .line 55
    iput-object p4, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mLoadingCityList:Ljava/util/ArrayList;

    .line 56
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 68
    const/4 v0, 0x0

    return v0
.end method

.method public getmCityMap()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/Integer;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;>;"
        }
    .end annotation

    .line 110
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mAllCityMap:Ljava/util/HashMap;

    return-object v0
.end method

.method public getmDownCityList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;"
        }
    .end annotation

    .line 120
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mDownCityList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getmLoadingCityList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;"
        }
    .end annotation

    .line 130
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mLoadingCityList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getmProvinceList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapProvince;>;"
        }
    .end annotation

    .line 96
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mProvinceList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public setmCityMap(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/Integer;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;>;)V"
        }
    .end annotation

    .line 115
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mAllCityMap:Ljava/util/HashMap;

    .line 116
    return-void
.end method

.method public setmDownCityList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;)V"
        }
    .end annotation

    .line 125
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mDownCityList:Ljava/util/ArrayList;

    .line 126
    return-void
.end method

.method public setmLoadingCityList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;)V"
        }
    .end annotation

    .line 135
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mLoadingCityList:Ljava/util/ArrayList;

    .line 136
    return-void
.end method

.method public setmProvinceList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapProvince;>;)V"
        }
    .end annotation

    .line 101
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mProvinceList:Ljava/util/ArrayList;

    .line 102
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 146
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OfflineMapCityList [mProvinceList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mProvinceList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mCityMap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mAllCityMap:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mDownCityList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mDownCityList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mLoadingCityList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mLoadingCityList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mProvinceList:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 76
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mAllCityMap:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 77
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mDownCityList:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 78
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->mLoadingCityList:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 80
    return-void
.end method
