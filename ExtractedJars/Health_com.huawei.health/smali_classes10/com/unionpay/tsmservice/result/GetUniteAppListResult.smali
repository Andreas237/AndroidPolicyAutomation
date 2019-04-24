.class public Lcom/unionpay/tsmservice/result/GetUniteAppListResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/result/GetUniteAppListResult;>;"
        }
    .end annotation
.end field


# instance fields
.field private mUniteAppList:[Lcom/unionpay/tsmservice/data/UniteAppDetail;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Lcom/unionpay/tsmservice/result/GetUniteAppListResult$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/result/GetUniteAppListResult$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/result/GetUniteAppListResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    sget-object v0, Lcom/unionpay/tsmservice/data/UniteAppDetail;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/unionpay/tsmservice/data/UniteAppDetail;

    iput-object v0, p0, Lcom/unionpay/tsmservice/result/GetUniteAppListResult;->mUniteAppList:[Lcom/unionpay/tsmservice/data/UniteAppDetail;

    .line 31
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 35
    const/4 v0, 0x0

    return v0
.end method

.method public getAppList()[Lcom/unionpay/tsmservice/data/UniteAppDetail;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetUniteAppListResult;->mUniteAppList:[Lcom/unionpay/tsmservice/data/UniteAppDetail;

    return-object v0
.end method

.method public setAppList([Lcom/unionpay/tsmservice/data/UniteAppDetail;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/unionpay/tsmservice/result/GetUniteAppListResult;->mUniteAppList:[Lcom/unionpay/tsmservice/data/UniteAppDetail;

    .line 49
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetUniteAppListResult;->mUniteAppList:[Lcom/unionpay/tsmservice/data/UniteAppDetail;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    .line 41
    return-void
.end method
