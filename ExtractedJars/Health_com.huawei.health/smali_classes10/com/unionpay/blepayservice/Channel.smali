.class public Lcom/unionpay/blepayservice/Channel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/blepayservice/Channel;>;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "UPBLEPayChannel"


# instance fields
.field private channelID:I

.field private mIbleTransCMDService:Lo/fki;

.field private selectResp:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Lcom/unionpay/blepayservice/Channel$5;

    invoke-direct {v0}, Lcom/unionpay/blepayservice/Channel$5;-><init>()V

    sput-object v0, Lcom/unionpay/blepayservice/Channel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 23
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Lo/fki;)V
    .locals 3

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput p1, p0, Lcom/unionpay/blepayservice/Channel;->channelID:I

    .line 28
    iput-object p2, p0, Lcom/unionpay/blepayservice/Channel;->selectResp:Ljava/lang/String;

    .line 29
    iput-object p3, p0, Lcom/unionpay/blepayservice/Channel;->mIbleTransCMDService:Lo/fki;

    .line 30
    const-string v0, "union_pay"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "channelID="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    const-string v0, "union_pay"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "selectResp="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    const-string v0, "union_pay"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "null == mIbleTransCMDService"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    iget-object v2, p0, Lcom/unionpay/blepayservice/Channel;->mIbleTransCMDService:Lo/fki;

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 32
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/blepayservice/Channel;->channelID:I

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/blepayservice/Channel;->selectResp:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/fki$d;->c(Landroid/os/IBinder;)Lo/fki;

    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/unionpay/blepayservice/Channel;->mIbleTransCMDService:Lo/fki;

    .line 43
    const-string v0, "union_pay"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "null == mIbleTransCMDService"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    iget-object v2, p0, Lcom/unionpay/blepayservice/Channel;->mIbleTransCMDService:Lo/fki;

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 66
    :try_start_0
    iget-object v0, p0, Lcom/unionpay/blepayservice/Channel;->mIbleTransCMDService:Lo/fki;

    invoke-interface {v0}, Lo/fki;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/unionpay/blepayservice/Channel;->mIbleTransCMDService:Lo/fki;

    invoke-interface {v0}, Lo/fki;->a()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    goto :goto_0

    :catch_0
    move-exception v1

    .line 70
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 72
    :cond_0
    :goto_0
    return-void
.end method

.method public describeContents()I
    .locals 1

    .line 90
    const/4 v0, 0x0

    return v0
.end method

.method public getChannelID()I
    .locals 1

    .line 53
    iget v0, p0, Lcom/unionpay/blepayservice/Channel;->channelID:I

    return v0
.end method

.method public getResp()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/unionpay/blepayservice/Channel;->selectResp:Ljava/lang/String;

    return-object v0
.end method

.method public setChannelID(I)V
    .locals 0

    .line 49
    iput p1, p0, Lcom/unionpay/blepayservice/Channel;->channelID:I

    .line 50
    return-void
.end method

.method public setResp(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/unionpay/blepayservice/Channel;->selectResp:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public transmit([B)[B
    .locals 4

    .line 75
    const-string v0, "UPBLEPayChannel"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cmd="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    :try_start_0
    iget-object v0, p0, Lcom/unionpay/blepayservice/Channel;->mIbleTransCMDService:Lo/fki;

    invoke-interface {v0}, Lo/fki;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 78
    const-string v0, "UPBLEPayChannel"

    const-string v1, "trans data"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    iget-object v0, p0, Lcom/unionpay/blepayservice/Channel;->mIbleTransCMDService:Lo/fki;

    invoke-interface {v0, p1}, Lo/fki;->d([B)[B
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 80
    return-object v3

    .line 82
    :catch_0
    move-exception v3

    .line 83
    invoke-virtual {v3}, Landroid/os/RemoteException;->printStackTrace()V

    .line 85
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 95
    iget v0, p0, Lcom/unionpay/blepayservice/Channel;->channelID:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 96
    iget-object v0, p0, Lcom/unionpay/blepayservice/Channel;->selectResp:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 98
    :try_start_0
    iget-object v0, p0, Lcom/unionpay/blepayservice/Channel;->mIbleTransCMDService:Lo/fki;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStrongInterface(Landroid/os/IInterface;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    goto :goto_0

    :catch_0
    move-exception v1

    .line 100
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 103
    :goto_0
    return-void
.end method
