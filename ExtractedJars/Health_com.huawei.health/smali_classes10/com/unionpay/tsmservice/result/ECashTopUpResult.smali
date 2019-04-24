.class public Lcom/unionpay/tsmservice/result/ECashTopUpResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/result/ECashTopUpResult;>;"
        }
    .end annotation
.end field


# instance fields
.field private balance:Ljava/lang/String;

.field private overdraw:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Lcom/unionpay/tsmservice/result/ECashTopUpResult$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/result/ECashTopUpResult$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/result/ECashTopUpResult;->CREATOR:Landroid/os/Parcelable$Creator;

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
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/result/ECashTopUpResult;->balance:Ljava/lang/String;

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/result/ECashTopUpResult;->overdraw:Ljava/lang/String;

    .line 33
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 37
    const/4 v0, 0x0

    return v0
.end method

.method public getBalance()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/ECashTopUpResult;->balance:Ljava/lang/String;

    return-object v0
.end method

.method public getOverdraw()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/ECashTopUpResult;->overdraw:Ljava/lang/String;

    return-object v0
.end method

.method public setBalance(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/unionpay/tsmservice/result/ECashTopUpResult;->balance:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public setOverdraw(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/unionpay/tsmservice/result/ECashTopUpResult;->overdraw:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/ECashTopUpResult;->balance:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/ECashTopUpResult;->overdraw:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 44
    return-void
.end method
