.class public Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;
.super Lcom/unionpay/tsmservice/request/RequestParams;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private mApplyActivityStyle:Lcom/unionpay/tsmservice/data/ApplyActivityStyle;

.field private mBankName:Ljava/lang/String;

.field private mCardType:Ljava/lang/String;

.field private mSpan:Ljava/lang/String;

.field private mTCUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    new-instance v0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mSpan:Ljava/lang/String;

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mTCUrl:Ljava/lang/String;

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mBankName:Ljava/lang/String;

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mCardType:Ljava/lang/String;

    .line 42
    const-class v0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;

    .line 43
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mApplyActivityStyle:Lcom/unionpay/tsmservice/data/ApplyActivityStyle;

    .line 44
    return-void
.end method


# virtual methods
.method public getBankName()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mBankName:Ljava/lang/String;

    return-object v0
.end method

.method public getCardType()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mCardType:Ljava/lang/String;

    return-object v0
.end method

.method public getSpan()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mSpan:Ljava/lang/String;

    return-object v0
.end method

.method public getTCUrl()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mTCUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getmApplyActivityStyle()Lcom/unionpay/tsmservice/data/ApplyActivityStyle;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mApplyActivityStyle:Lcom/unionpay/tsmservice/data/ApplyActivityStyle;

    return-object v0
.end method

.method public setBankName(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mBankName:Ljava/lang/String;

    .line 86
    return-void
.end method

.method public setCardType(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mCardType:Ljava/lang/String;

    .line 94
    return-void
.end method

.method public setSpan(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mSpan:Ljava/lang/String;

    .line 70
    return-void
.end method

.method public setTCUrl(Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mTCUrl:Ljava/lang/String;

    .line 78
    return-void
.end method

.method public setmApplyActivityStyle(Lcom/unionpay/tsmservice/data/ApplyActivityStyle;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mApplyActivityStyle:Lcom/unionpay/tsmservice/data/ApplyActivityStyle;

    .line 62
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 48
    invoke-super {p0, p1, p2}, Lcom/unionpay/tsmservice/request/RequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    .line 49
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mSpan:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 50
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mTCUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mBankName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mCardType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 53
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->mApplyActivityStyle:Lcom/unionpay/tsmservice/data/ApplyActivityStyle;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 54
    return-void
.end method
