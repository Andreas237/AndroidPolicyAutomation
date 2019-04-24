.class public Lcom/unionpay/tsmservice/request/SendApduRequestParams;
.super Lcom/unionpay/tsmservice/request/RequestParams;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/SendApduRequestParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private channel:Ljava/lang/String;

.field private hexApdu:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    new-instance v0, Lcom/unionpay/tsmservice/request/SendApduRequestParams$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/request/SendApduRequestParams$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/request/SendApduRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SendApduRequestParams;->channel:Ljava/lang/String;

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SendApduRequestParams;->hexApdu:Ljava/lang/String;

    .line 30
    return-void
.end method


# virtual methods
.method public getChannel()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SendApduRequestParams;->channel:Ljava/lang/String;

    return-object v0
.end method

.method public getHexApdu()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SendApduRequestParams;->hexApdu:Ljava/lang/String;

    return-object v0
.end method

.method public setChannel(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SendApduRequestParams;->channel:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public setHexApdu(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SendApduRequestParams;->hexApdu:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SendApduRequestParams;->channel:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 35
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SendApduRequestParams;->hexApdu:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 36
    return-void
.end method
