.class public Lcom/unionpay/tsmservice/data/TransElement;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/data/TransElement;>;"
        }
    .end annotation
.end field


# instance fields
.field private isMustShow:Z

.field private mHint:Ljava/lang/String;

.field private mLabel:Ljava/lang/String;

.field private mName:Ljava/lang/String;

.field private mType:Ljava/lang/String;

.field private mVerfyRule:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    new-instance v0, Lcom/unionpay/tsmservice/data/TransElement$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/data/TransElement$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/data/TransElement;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->isMustShow:Z

    .line 9
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mLabel:Ljava/lang/String;

    .line 10
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mName:Ljava/lang/String;

    .line 11
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mHint:Ljava/lang/String;

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mVerfyRule:Ljava/lang/String;

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mType:Ljava/lang/String;

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->isMustShow:Z

    .line 9
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mLabel:Ljava/lang/String;

    .line 10
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mName:Ljava/lang/String;

    .line 11
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mHint:Ljava/lang/String;

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mVerfyRule:Ljava/lang/String;

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mType:Ljava/lang/String;

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->isMustShow:Z

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mLabel:Ljava/lang/String;

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mName:Ljava/lang/String;

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mHint:Ljava/lang/String;

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mVerfyRule:Ljava/lang/String;

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mType:Ljava/lang/String;

    .line 40
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 44
    const/4 v0, 0x0

    return v0
.end method

.method public getHint()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mHint:Ljava/lang/String;

    return-object v0
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mType:Ljava/lang/String;

    return-object v0
.end method

.method public getVerfyRule()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mVerfyRule:Ljava/lang/String;

    return-object v0
.end method

.method public isMustShow()Z
    .locals 1

    .line 58
    iget-boolean v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->isMustShow:Z

    return v0
.end method

.method public setHint(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/TransElement;->mHint:Ljava/lang/String;

    .line 87
    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/TransElement;->mLabel:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public setMustShow(Z)V
    .locals 0

    .line 62
    iput-boolean p1, p0, Lcom/unionpay/tsmservice/data/TransElement;->isMustShow:Z

    .line 63
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/TransElement;->mName:Ljava/lang/String;

    .line 79
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/TransElement;->mType:Ljava/lang/String;

    .line 103
    return-void
.end method

.method public setVerfyRule(Ljava/lang/String;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/TransElement;->mVerfyRule:Ljava/lang/String;

    .line 95
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 49
    iget-boolean v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->isMustShow:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 50
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mLabel:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mHint:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 53
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mVerfyRule:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 54
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/TransElement;->mType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 55
    return-void
.end method
