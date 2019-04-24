.class public Lcom/unionpay/tsmservice/result/GetTransRecordResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/result/GetTransRecordResult;>;"
        }
    .end annotation
.end field


# instance fields
.field private mTransRecord:[Lcom/unionpay/tsmservice/data/TransRecord;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Lcom/unionpay/tsmservice/result/GetTransRecordResult$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/result/GetTransRecordResult$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/result/GetTransRecordResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const-class v0, Lcom/unionpay/tsmservice/data/TransRecord;

    .line 33
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 32
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelableArray(Ljava/lang/ClassLoader;)[Landroid/os/Parcelable;

    move-result-object v2

    .line 34
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 35
    array-length v0, v2

    const-class v1, [Lcom/unionpay/tsmservice/data/TransRecord;

    invoke-static {v2, v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/unionpay/tsmservice/data/TransRecord;

    iput-object v0, p0, Lcom/unionpay/tsmservice/result/GetTransRecordResult;->mTransRecord:[Lcom/unionpay/tsmservice/data/TransRecord;

    .line 38
    :cond_0
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 42
    const/4 v0, 0x0

    return v0
.end method

.method public getTransRecord()[Lcom/unionpay/tsmservice/data/TransRecord;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetTransRecordResult;->mTransRecord:[Lcom/unionpay/tsmservice/data/TransRecord;

    return-object v0
.end method

.method public setTransRecord([Lcom/unionpay/tsmservice/data/TransRecord;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/unionpay/tsmservice/result/GetTransRecordResult;->mTransRecord:[Lcom/unionpay/tsmservice/data/TransRecord;

    .line 56
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetTransRecordResult;->mTransRecord:[Lcom/unionpay/tsmservice/data/TransRecord;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelableArray([Landroid/os/Parcelable;I)V

    .line 48
    return-void
.end method
