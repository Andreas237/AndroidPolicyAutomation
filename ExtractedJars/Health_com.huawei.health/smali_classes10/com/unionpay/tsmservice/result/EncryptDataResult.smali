.class public Lcom/unionpay/tsmservice/result/EncryptDataResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/result/EncryptDataResult;>;"
        }
    .end annotation
.end field


# instance fields
.field private mEncryptData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Lcom/unionpay/tsmservice/result/EncryptDataResult$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/result/EncryptDataResult$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/result/EncryptDataResult;->CREATOR:Landroid/os/Parcelable$Creator;

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
    .locals 2

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/result/EncryptDataResult;->mEncryptData:Ljava/util/List;

    .line 32
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/EncryptDataResult;->mEncryptData:Ljava/util/List;

    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

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

.method public getEncryptData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/EncryptDataResult;->mEncryptData:Ljava/util/List;

    return-object v0
.end method

.method public setEncryptData(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 50
    iput-object p1, p0, Lcom/unionpay/tsmservice/result/EncryptDataResult;->mEncryptData:Ljava/util/List;

    .line 51
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/EncryptDataResult;->mEncryptData:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 43
    return-void
.end method
