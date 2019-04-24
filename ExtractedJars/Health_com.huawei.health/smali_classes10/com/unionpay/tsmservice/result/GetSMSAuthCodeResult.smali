.class public Lcom/unionpay/tsmservice/result/GetSMSAuthCodeResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/result/GetSMSAuthCodeResult;>;"
        }
    .end annotation
.end field


# instance fields
.field private smsAuthCode:Lcom/unionpay/tsmservice/data/SMSAuthCode;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Lcom/unionpay/tsmservice/result/GetSMSAuthCodeResult$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/result/GetSMSAuthCodeResult$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/result/GetSMSAuthCodeResult;->CREATOR:Landroid/os/Parcelable$Creator;

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
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const-class v0, Lcom/unionpay/tsmservice/data/SMSAuthCode;

    .line 32
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 31
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/data/SMSAuthCode;

    iput-object v0, p0, Lcom/unionpay/tsmservice/result/GetSMSAuthCodeResult;->smsAuthCode:Lcom/unionpay/tsmservice/data/SMSAuthCode;

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

.method public getSmsAuthCode()Lcom/unionpay/tsmservice/data/SMSAuthCode;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetSMSAuthCodeResult;->smsAuthCode:Lcom/unionpay/tsmservice/data/SMSAuthCode;

    return-object v0
.end method

.method public setSmsAuthCode(Lcom/unionpay/tsmservice/data/SMSAuthCode;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/unionpay/tsmservice/result/GetSMSAuthCodeResult;->smsAuthCode:Lcom/unionpay/tsmservice/data/SMSAuthCode;

    .line 53
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetSMSAuthCodeResult;->smsAuthCode:Lcom/unionpay/tsmservice/data/SMSAuthCode;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 44
    return-void
.end method
