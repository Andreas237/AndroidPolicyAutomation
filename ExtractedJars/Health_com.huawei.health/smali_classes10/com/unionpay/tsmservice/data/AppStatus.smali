.class public Lcom/unionpay/tsmservice/data/AppStatus;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final APPLY:Ljava/lang/String; = "06"

.field public static final APPROVED:Ljava/lang/String; = "00"

.field public static final APPROVING:Ljava/lang/String; = "02"

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/data/AppStatus;>;"
        }
    .end annotation
.end field

.field public static final NOT_APPROVED:Ljava/lang/String; = "01"

.field public static final OPEN:Ljava/lang/String; = "05"

.field public static final VIEW:Ljava/lang/String; = "07"


# instance fields
.field private mStatus:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    new-instance v0, Lcom/unionpay/tsmservice/data/AppStatus$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/data/AppStatus$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/data/AppStatus;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppStatus;->mStatus:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppStatus;->mStatus:Ljava/lang/String;

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppStatus;->mStatus:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppStatus;->mStatus:Ljava/lang/String;

    .line 36
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppStatus;->mStatus:Ljava/lang/String;

    .line 37
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 45
    const/4 v0, 0x0

    return v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppStatus;->mStatus:Ljava/lang/String;

    return-object v0
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppStatus;->mStatus:Ljava/lang/String;

    .line 59
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppStatus;->mStatus:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 51
    return-void
.end method
