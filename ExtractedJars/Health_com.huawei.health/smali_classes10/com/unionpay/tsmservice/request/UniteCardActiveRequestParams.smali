.class public Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;
.super Lcom/unionpay/tsmservice/request/RequestParams;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private mActiveCode:Ljava/lang/String;

.field private mPanId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    new-instance v0, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;->mPanId:Ljava/lang/String;

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;->mActiveCode:Ljava/lang/String;

    .line 31
    return-void
.end method


# virtual methods
.method public getActiveCode()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;->mActiveCode:Ljava/lang/String;

    return-object v0
.end method

.method public getMPanId()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;->mPanId:Ljava/lang/String;

    return-object v0
.end method

.method public setActiveCode(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;->mActiveCode:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public setMPanId(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;->mPanId:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 36
    invoke-super {p0, p1, p2}, Lcom/unionpay/tsmservice/request/RequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    .line 37
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;->mPanId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;->mActiveCode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 39
    return-void
.end method
