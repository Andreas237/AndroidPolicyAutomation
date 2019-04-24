.class public Lcom/unionpay/tsmservice/result/OpenChannelResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/result/OpenChannelResult;>;"
        }
    .end annotation
.end field


# instance fields
.field private channel:Ljava/lang/String;

.field private outHexApdu:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    new-instance v0, Lcom/unionpay/tsmservice/result/OpenChannelResult$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/result/OpenChannelResult$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/result/OpenChannelResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/result/OpenChannelResult;->outHexApdu:Ljava/lang/String;

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/result/OpenChannelResult;->channel:Ljava/lang/String;

    .line 31
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 36
    const/4 v0, 0x0

    return v0
.end method

.method public getChannel()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/OpenChannelResult;->channel:Ljava/lang/String;

    return-object v0
.end method

.method public getOutHexApdu()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/OpenChannelResult;->outHexApdu:Ljava/lang/String;

    return-object v0
.end method

.method public setChannel(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/unionpay/tsmservice/result/OpenChannelResult;->channel:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public setOutHexApdu(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/unionpay/tsmservice/result/OpenChannelResult;->outHexApdu:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/OpenChannelResult;->outHexApdu:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/OpenChannelResult;->channel:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 44
    return-void
.end method
