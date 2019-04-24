.class public Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private mBankName:Ljava/lang/String;

.field private mCardType:Ljava/lang/String;

.field private mIssuerUrl:Ljava/lang/String;

.field private mTCUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    new-instance v0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;->mTCUrl:Ljava/lang/String;

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;->mBankName:Ljava/lang/String;

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;->mCardType:Ljava/lang/String;

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;->mIssuerUrl:Ljava/lang/String;

    .line 38
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 42
    const/4 v0, 0x0

    return v0
.end method

.method public getBankName()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;->mBankName:Ljava/lang/String;

    return-object v0
.end method

.method public getCardType()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;->mCardType:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerUrl()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;->mIssuerUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTCUrl()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;->mTCUrl:Ljava/lang/String;

    return-object v0
.end method

.method public setBankName(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;->mBankName:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public setCardType(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;->mCardType:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public setIssuerUrl(Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;->mIssuerUrl:Ljava/lang/String;

    .line 84
    return-void
.end method

.method public setTCUrl(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;->mTCUrl:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;->mTCUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 48
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;->mBankName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;->mCardType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 50
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/CheckBinCodeInfo;->mIssuerUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 52
    return-void
.end method
