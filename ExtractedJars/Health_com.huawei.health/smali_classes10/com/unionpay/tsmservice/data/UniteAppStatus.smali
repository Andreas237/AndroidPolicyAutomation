.class public Lcom/unionpay/tsmservice/data/UniteAppStatus;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final ACTIVELESS:Ljava/lang/String; = "02"

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/data/UniteAppStatus;>;"
        }
    .end annotation
.end field

.field public static final DELETED:Ljava/lang/String; = "06"

.field public static final FINE:Ljava/lang/String; = "01"

.field public static final ILLEGAL:Ljava/lang/String; = "99"

.field public static final INSTALLLESS:Ljava/lang/String; = "04"

.field public static final LOCKED:Ljava/lang/String; = "05"

.field public static final NONE:Ljava/lang/String; = "03"


# instance fields
.field private mStatus:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Lcom/unionpay/tsmservice/data/UniteAppStatus$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/data/UniteAppStatus$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/data/UniteAppStatus;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const-string v0, "03"

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppStatus;->mStatus:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const-string v0, "03"

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppStatus;->mStatus:Ljava/lang/String;

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppStatus;->mStatus:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const-string v0, "03"

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppStatus;->mStatus:Ljava/lang/String;

    .line 43
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppStatus;->mStatus:Ljava/lang/String;

    .line 44
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 52
    const/4 v0, 0x0

    return v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppStatus;->mStatus:Ljava/lang/String;

    return-object v0
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/UniteAppStatus;->mStatus:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/UniteAppStatus;->mStatus:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 58
    return-void
.end method
