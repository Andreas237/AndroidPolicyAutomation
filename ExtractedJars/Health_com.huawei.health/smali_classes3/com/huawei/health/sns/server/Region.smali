.class public Lcom/huawei/health/sns/server/Region;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/server/Region;>;"
        }
    .end annotation
.end field


# instance fields
.field private city_:Ljava/lang/String;

.field private province_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    new-instance v0, Lcom/huawei/health/sns/server/Region$1;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/Region$1;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/server/Region;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 10
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/Region;->province_:Ljava/lang/String;

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/Region;->city_:Ljava/lang/String;

    .line 17
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 10
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/Region;->province_:Ljava/lang/String;

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/Region;->city_:Ljava/lang/String;

    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/Region;->province_:Ljava/lang/String;

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/Region;->city_:Ljava/lang/String;

    .line 23
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 65
    const/4 v0, 0x0

    return v0
.end method

.method public getCity_()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/sns/server/Region;->city_:Ljava/lang/String;

    .line 43
    return-object v0
.end method

.method public getProvince_()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/server/Region;->province_:Ljava/lang/String;

    .line 54
    return-object v0
.end method

.method public setCity_(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/health/sns/server/Region;->city_:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public setProvince_(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/health/sns/server/Region;->province_:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/health/sns/server/Region;->province_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 72
    iget-object v0, p0, Lcom/huawei/health/sns/server/Region;->city_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 73
    return-void
.end method
