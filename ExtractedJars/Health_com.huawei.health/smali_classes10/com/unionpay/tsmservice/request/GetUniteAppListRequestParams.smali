.class public Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;
.super Lcom/unionpay/tsmservice/request/RequestParams;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private mStatus:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;->mStatus:[Ljava/lang/String;

    .line 31
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 43
    const/4 v0, 0x0

    return v0
.end method

.method public getStatus()[Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;->mStatus:[Ljava/lang/String;

    return-object v0
.end method

.method public setStatus([Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;->mStatus:[Ljava/lang/String;

    .line 39
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;->mStatus:[Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 49
    return-void
.end method
