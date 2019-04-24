.class public Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;
.super Lcom/unionpay/tsmservice/request/RequestParams;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private mApplyActivityStyle:Lcom/unionpay/tsmservice/data/ApplyActivityStyle;

.field private mBankName:Ljava/lang/String;

.field private mCaptureMethod:I

.field private mCardType:Ljava/lang/String;

.field private mChntUsrId:Ljava/lang/String;

.field private mFullDeviceNumber:Ljava/lang/String;

.field private mSpan:Ljava/lang/String;

.field private mTCUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    new-instance v0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 21
    const/4 v0, 0x4

    iput v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mCaptureMethod:I

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mChntUsrId:Ljava/lang/String;

    .line 25
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mFullDeviceNumber:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 21
    const/4 v0, 0x4

    iput v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mCaptureMethod:I

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mChntUsrId:Ljava/lang/String;

    .line 25
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mFullDeviceNumber:Ljava/lang/String;

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mSpan:Ljava/lang/String;

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mTCUrl:Ljava/lang/String;

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mBankName:Ljava/lang/String;

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mCardType:Ljava/lang/String;

    .line 51
    const-class v0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;

    .line 52
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mApplyActivityStyle:Lcom/unionpay/tsmservice/data/ApplyActivityStyle;

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mCaptureMethod:I

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mChntUsrId:Ljava/lang/String;

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mFullDeviceNumber:Ljava/lang/String;

    .line 56
    return-void
.end method


# virtual methods
.method public getBankName()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mBankName:Ljava/lang/String;

    return-object v0
.end method

.method public getCaptureMethod()I
    .locals 1

    .line 112
    iget v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mCaptureMethod:I

    return v0
.end method

.method public getCardType()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mCardType:Ljava/lang/String;

    return-object v0
.end method

.method public getChntUsrId()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mChntUsrId:Ljava/lang/String;

    return-object v0
.end method

.method public getFullDeviceNumber()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mFullDeviceNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getSpan()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mSpan:Ljava/lang/String;

    return-object v0
.end method

.method public getTCUrl()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mTCUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getmApplyActivityStyle()Lcom/unionpay/tsmservice/data/ApplyActivityStyle;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mApplyActivityStyle:Lcom/unionpay/tsmservice/data/ApplyActivityStyle;

    return-object v0
.end method

.method public setBankName(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mBankName:Ljava/lang/String;

    .line 101
    return-void
.end method

.method public setCaptureMethod(I)V
    .locals 0

    .line 116
    iput p1, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mCaptureMethod:I

    .line 117
    return-void
.end method

.method public setCardType(Ljava/lang/String;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mCardType:Ljava/lang/String;

    .line 109
    return-void
.end method

.method public setChntUsrId(Ljava/lang/String;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mChntUsrId:Ljava/lang/String;

    .line 125
    return-void
.end method

.method public setFullDeviceNumber(Ljava/lang/String;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mFullDeviceNumber:Ljava/lang/String;

    .line 133
    return-void
.end method

.method public setSpan(Ljava/lang/String;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mSpan:Ljava/lang/String;

    .line 85
    return-void
.end method

.method public setTCUrl(Ljava/lang/String;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mTCUrl:Ljava/lang/String;

    .line 93
    return-void
.end method

.method public setmApplyActivityStyle(Lcom/unionpay/tsmservice/data/ApplyActivityStyle;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mApplyActivityStyle:Lcom/unionpay/tsmservice/data/ApplyActivityStyle;

    .line 77
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 60
    invoke-super {p0, p1, p2}, Lcom/unionpay/tsmservice/request/RequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    .line 61
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mSpan:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 62
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mTCUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mBankName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 64
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mCardType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mApplyActivityStyle:Lcom/unionpay/tsmservice/data/ApplyActivityStyle;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 66
    iget v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mCaptureMethod:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 67
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mChntUsrId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->mFullDeviceNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 69
    return-void
.end method
