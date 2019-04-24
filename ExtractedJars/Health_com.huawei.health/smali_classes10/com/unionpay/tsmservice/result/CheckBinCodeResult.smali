.class public Lcom/unionpay/tsmservice/result/CheckBinCodeResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/result/CheckBinCodeResult;>;"
        }
    .end annotation
.end field


# instance fields
.field private mCheckBinCodeInfo:Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    new-instance v0, Lcom/unionpay/tsmservice/result/CheckBinCodeResult$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/result/CheckBinCodeResult$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/result/CheckBinCodeResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const-class v0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;

    .line 31
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;

    iput-object v0, p0, Lcom/unionpay/tsmservice/result/CheckBinCodeResult;->mCheckBinCodeInfo:Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;

    .line 32
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 41
    const/4 v0, 0x0

    return v0
.end method

.method public getCheckBinCodeInfo()Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/CheckBinCodeResult;->mCheckBinCodeInfo:Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;

    return-object v0
.end method

.method public setCheckBinCodeInfo(Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/unionpay/tsmservice/result/CheckBinCodeResult;->mCheckBinCodeInfo:Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;

    .line 56
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/CheckBinCodeResult;->mCheckBinCodeInfo:Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 48
    return-void
.end method
