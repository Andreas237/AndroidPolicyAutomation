.class public Lcom/unionpay/tsmservice/result/GetEncryptDataResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/result/GetEncryptDataResult;>;"
        }
    .end annotation
.end field


# instance fields
.field private mData:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    new-instance v0, Lcom/unionpay/tsmservice/result/GetEncryptDataResult$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/result/GetEncryptDataResult$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/result/GetEncryptDataResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/result/GetEncryptDataResult;->mData:Ljava/lang/String;

    .line 29
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 34
    const/4 v0, 0x0

    return v0
.end method

.method public getData()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetEncryptDataResult;->mData:Ljava/lang/String;

    return-object v0
.end method

.method public setData(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/unionpay/tsmservice/result/GetEncryptDataResult;->mData:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetEncryptDataResult;->mData:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 41
    return-void
.end method
