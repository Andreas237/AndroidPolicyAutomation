.class public Lcom/unionpay/tsmservice/result/GetAccountBalanceResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/result/GetAccountBalanceResult;>;"
        }
    .end annotation
.end field


# instance fields
.field private mAssociatedCardBalance:Lcom/unionpay/tsmservice/data/AssociatedCardBalance;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Lcom/unionpay/tsmservice/result/GetAccountBalanceResult$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/result/GetAccountBalanceResult$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/result/GetAccountBalanceResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const-class v0, Lcom/unionpay/tsmservice/data/AssociatedCardBalance;

    .line 33
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/data/AssociatedCardBalance;

    iput-object v0, p0, Lcom/unionpay/tsmservice/result/GetAccountBalanceResult;->mAssociatedCardBalance:Lcom/unionpay/tsmservice/data/AssociatedCardBalance;

    .line 34
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 39
    const/4 v0, 0x0

    return v0
.end method

.method public getAssociatedCardBalance()Lcom/unionpay/tsmservice/data/AssociatedCardBalance;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetAccountBalanceResult;->mAssociatedCardBalance:Lcom/unionpay/tsmservice/data/AssociatedCardBalance;

    return-object v0
.end method

.method public setAssociatedCardBalance(Lcom/unionpay/tsmservice/data/AssociatedCardBalance;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/unionpay/tsmservice/result/GetAccountBalanceResult;->mAssociatedCardBalance:Lcom/unionpay/tsmservice/data/AssociatedCardBalance;

    .line 55
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetAccountBalanceResult;->mAssociatedCardBalance:Lcom/unionpay/tsmservice/data/AssociatedCardBalance;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 46
    return-void
.end method
