.class public Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;
.super Ljava/util/ArrayList;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean$5;

    invoke-direct {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean$5;-><init>()V

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    const-class v0, Lcom/amap/api/maps/offlinemap/OfflineMapCity;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;->addAll(Ljava/util/Collection;)Z

    .line 22
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 38
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 44
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 45
    return-void
.end method
