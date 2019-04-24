.class public Lcom/huawei/multisimservice/model/SimInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/multisimservice/model/SimInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private mActive:Z

.field private mICCID:Ljava/lang/String;

.field private mIMSI:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 65
    new-instance v0, Lcom/huawei/multisimservice/model/SimInfo$3;

    invoke-direct {v0}, Lcom/huawei/multisimservice/model/SimInfo$3;-><init>()V

    sput-object v0, Lcom/huawei/multisimservice/model/SimInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mIMSI:Ljava/lang/String;

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mICCID:Ljava/lang/String;

    .line 9
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mActive:Z

    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mIMSI:Ljava/lang/String;

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mICCID:Ljava/lang/String;

    .line 9
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mActive:Z

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mIMSI:Ljava/lang/String;

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mICCID:Ljava/lang/String;

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mActive:Z

    .line 20
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mIMSI:Ljava/lang/String;

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mICCID:Ljava/lang/String;

    .line 9
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mActive:Z

    .line 24
    iput-object p1, p0, Lcom/huawei/multisimservice/model/SimInfo;->mIMSI:Ljava/lang/String;

    .line 25
    iput-object p2, p0, Lcom/huawei/multisimservice/model/SimInfo;->mICCID:Ljava/lang/String;

    .line 26
    iput-boolean p3, p0, Lcom/huawei/multisimservice/model/SimInfo;->mActive:Z

    .line 27
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 55
    const/4 v0, 0x0

    return v0
.end method

.method public getICCID()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mICCID:Ljava/lang/String;

    return-object v0
.end method

.method public getIMSI()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mIMSI:Ljava/lang/String;

    return-object v0
.end method

.method public isActive()Z
    .locals 1

    .line 46
    iget-boolean v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mActive:Z

    return v0
.end method

.method public setActive(Z)V
    .locals 0

    .line 50
    iput-boolean p1, p0, Lcom/huawei/multisimservice/model/SimInfo;->mActive:Z

    .line 51
    return-void
.end method

.method public setICCID(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/multisimservice/model/SimInfo;->mICCID:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public setIMSI(Ljava/lang/String;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/multisimservice/model/SimInfo;->mIMSI:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mIMSI:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 61
    iget-object v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mICCID:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 62
    iget-boolean v0, p0, Lcom/huawei/multisimservice/model/SimInfo;->mActive:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 63
    return-void
.end method
