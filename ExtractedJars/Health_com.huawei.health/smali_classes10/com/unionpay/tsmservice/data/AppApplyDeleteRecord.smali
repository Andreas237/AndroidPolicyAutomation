.class public Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;>;"
        }
    .end annotation
.end field


# instance fields
.field private mAppID:Lcom/unionpay/tsmservice/AppID;

.field private mResult:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;->CREATOR:Landroid/os/Parcelable$Creator;

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
    const-class v0, Lcom/unionpay/tsmservice/AppID;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/AppID;

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;->mAppID:Lcom/unionpay/tsmservice/AppID;

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;->mResult:Ljava/lang/String;

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

.method public getAppID()Lcom/unionpay/tsmservice/AppID;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;->mAppID:Lcom/unionpay/tsmservice/AppID;

    return-object v0
.end method

.method public getResult()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;->mResult:Ljava/lang/String;

    return-object v0
.end method

.method public setAppID(Lcom/unionpay/tsmservice/AppID;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;->mAppID:Lcom/unionpay/tsmservice/AppID;

    .line 52
    return-void
.end method

.method public setResult(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;->mResult:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;->mAppID:Lcom/unionpay/tsmservice/AppID;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 43
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;->mResult:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 44
    return-void
.end method
