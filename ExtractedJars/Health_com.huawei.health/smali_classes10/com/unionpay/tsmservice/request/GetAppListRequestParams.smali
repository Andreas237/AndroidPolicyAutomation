.class public Lcom/unionpay/tsmservice/request/GetAppListRequestParams;
.super Lcom/unionpay/tsmservice/request/RequestParams;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/GetAppListRequestParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private mKeyword:Ljava/lang/String;

.field private mStatus:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Lcom/unionpay/tsmservice/request/GetAppListRequestParams$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/request/GetAppListRequestParams$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/request/GetAppListRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/GetAppListRequestParams;->mKeyword:Ljava/lang/String;

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/GetAppListRequestParams;->mStatus:[Ljava/lang/String;

    .line 33
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 53
    const/4 v0, 0x0

    return v0
.end method

.method public getKeyword()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetAppListRequestParams;->mKeyword:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()[Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetAppListRequestParams;->mStatus:[Ljava/lang/String;

    return-object v0
.end method

.method public setKeyword(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/GetAppListRequestParams;->mKeyword:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public setStatus([Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/GetAppListRequestParams;->mStatus:[Ljava/lang/String;

    .line 49
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetAppListRequestParams;->mKeyword:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetAppListRequestParams;->mStatus:[Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 60
    return-void
.end method
