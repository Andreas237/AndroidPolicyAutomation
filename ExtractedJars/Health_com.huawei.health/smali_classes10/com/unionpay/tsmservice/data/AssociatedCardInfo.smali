.class public Lcom/unionpay/tsmservice/data/AssociatedCardInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/data/AssociatedCardInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private mCardNo:Ljava/lang/String;

.field private mCardType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Lcom/unionpay/tsmservice/data/AssociatedCardInfo$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/data/AssociatedCardInfo$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/data/AssociatedCardInfo;->CREATOR:Landroid/os/Parcelable$Creator;

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
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AssociatedCardInfo;->mCardType:Ljava/lang/String;

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AssociatedCardInfo;->mCardNo:Ljava/lang/String;

    .line 32
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 36
    const/4 v0, 0x0

    return v0
.end method

.method public getCardNo()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AssociatedCardInfo;->mCardNo:Ljava/lang/String;

    return-object v0
.end method

.method public getCardType()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AssociatedCardInfo;->mCardType:Ljava/lang/String;

    return-object v0
.end method

.method public setCardNo(Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AssociatedCardInfo;->mCardNo:Ljava/lang/String;

    .line 59
    return-void
.end method

.method public setCardType(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AssociatedCardInfo;->mCardType:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AssociatedCardInfo;->mCardType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 42
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AssociatedCardInfo;->mCardNo:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    return-void
.end method
