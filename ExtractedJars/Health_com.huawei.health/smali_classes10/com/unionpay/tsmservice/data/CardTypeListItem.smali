.class public Lcom/unionpay/tsmservice/data/CardTypeListItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/data/CardTypeListItem;>;"
        }
    .end annotation
.end field


# instance fields
.field private mBankLogoUrl:Ljava/lang/String;

.field private mBankName:Ljava/lang/String;

.field private mCardType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Lcom/unionpay/tsmservice/data/CardTypeListItem$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/data/CardTypeListItem$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mCardType:Ljava/lang/String;

    .line 9
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mBankName:Ljava/lang/String;

    .line 10
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mBankLogoUrl:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mCardType:Ljava/lang/String;

    .line 9
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mBankName:Ljava/lang/String;

    .line 10
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mBankLogoUrl:Ljava/lang/String;

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mCardType:Ljava/lang/String;

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mBankName:Ljava/lang/String;

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mBankLogoUrl:Ljava/lang/String;

    .line 34
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 38
    const/4 v0, 0x0

    return v0
.end method

.method public getBankLogoUrl()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mBankLogoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getBankName()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mBankName:Ljava/lang/String;

    return-object v0
.end method

.method public getCardType()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mCardType:Ljava/lang/String;

    return-object v0
.end method

.method public setBankLogoUrl(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mBankLogoUrl:Ljava/lang/String;

    .line 70
    return-void
.end method

.method public setBankName(Ljava/lang/String;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mBankName:Ljava/lang/String;

    .line 62
    return-void
.end method

.method public setCardType(Ljava/lang/String;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mCardType:Ljava/lang/String;

    .line 54
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mCardType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 44
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mBankName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/CardTypeListItem;->mBankLogoUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 46
    return-void
.end method
