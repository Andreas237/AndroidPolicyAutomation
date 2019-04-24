.class public Lcom/unionpay/tsmservice/request/InitRequestParams;
.super Lcom/unionpay/tsmservice/request/RequestParams;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/InitRequestParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private mType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    new-instance v0, Lcom/unionpay/tsmservice/request/InitRequestParams$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/request/InitRequestParams$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/request/InitRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 50
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/InitRequestParams;->mType:I

    .line 40
    return-void
.end method


# virtual methods
.method public getType()I
    .locals 1

    .line 53
    iget v0, p0, Lcom/unionpay/tsmservice/request/InitRequestParams;->mType:I

    return v0
.end method

.method public setType(I)V
    .locals 0

    .line 57
    iput p1, p0, Lcom/unionpay/tsmservice/request/InitRequestParams;->mType:I

    .line 58
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 44
    invoke-super {p0, p1, p2}, Lcom/unionpay/tsmservice/request/RequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    .line 45
    iget v0, p0, Lcom/unionpay/tsmservice/request/InitRequestParams;->mType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 46
    return-void
.end method
