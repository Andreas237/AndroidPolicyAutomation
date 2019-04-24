.class public Lcom/unionpay/tsmservice/result/GetTransElementsResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/result/GetTransElementsResult;>;"
        }
    .end annotation
.end field


# instance fields
.field private mCreditElements:[Lcom/unionpay/tsmservice/data/TransElement;

.field private mDebitElements:[Lcom/unionpay/tsmservice/data/TransElement;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/unionpay/tsmservice/result/GetTransElementsResult$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/result/GetTransElementsResult$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/result/GetTransElementsResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const-class v0, Lcom/unionpay/tsmservice/data/TransElement;

    .line 35
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelableArray(Ljava/lang/ClassLoader;)[Landroid/os/Parcelable;

    move-result-object v2

    .line 36
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 37
    array-length v0, v2

    const-class v1, [Lcom/unionpay/tsmservice/data/TransElement;

    invoke-static {v2, v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/unionpay/tsmservice/data/TransElement;

    iput-object v0, p0, Lcom/unionpay/tsmservice/result/GetTransElementsResult;->mDebitElements:[Lcom/unionpay/tsmservice/data/TransElement;

    .line 40
    :cond_0
    const-class v0, Lcom/unionpay/tsmservice/data/TransElement;

    .line 41
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelableArray(Ljava/lang/ClassLoader;)[Landroid/os/Parcelable;

    move-result-object v3

    .line 42
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 43
    array-length v0, v3

    const-class v1, [Lcom/unionpay/tsmservice/data/TransElement;

    invoke-static {v3, v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/unionpay/tsmservice/data/TransElement;

    iput-object v0, p0, Lcom/unionpay/tsmservice/result/GetTransElementsResult;->mCreditElements:[Lcom/unionpay/tsmservice/data/TransElement;

    .line 46
    :cond_1
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 50
    const/4 v0, 0x0

    return v0
.end method

.method public getCreditElements()[Lcom/unionpay/tsmservice/data/TransElement;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetTransElementsResult;->mCreditElements:[Lcom/unionpay/tsmservice/data/TransElement;

    return-object v0
.end method

.method public getDebitElements()[Lcom/unionpay/tsmservice/data/TransElement;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetTransElementsResult;->mDebitElements:[Lcom/unionpay/tsmservice/data/TransElement;

    return-object v0
.end method

.method public setCreditElements([Lcom/unionpay/tsmservice/data/TransElement;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/unionpay/tsmservice/result/GetTransElementsResult;->mCreditElements:[Lcom/unionpay/tsmservice/data/TransElement;

    .line 73
    return-void
.end method

.method public setDebitElements([Lcom/unionpay/tsmservice/data/TransElement;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/unionpay/tsmservice/result/GetTransElementsResult;->mDebitElements:[Lcom/unionpay/tsmservice/data/TransElement;

    .line 65
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetTransElementsResult;->mDebitElements:[Lcom/unionpay/tsmservice/data/TransElement;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelableArray([Landroid/os/Parcelable;I)V

    .line 56
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetTransElementsResult;->mCreditElements:[Lcom/unionpay/tsmservice/data/TransElement;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelableArray([Landroid/os/Parcelable;I)V

    .line 57
    return-void
.end method
