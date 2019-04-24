.class public Lcom/unionpay/tsmservice/result/GetDefaultCardResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/result/GetDefaultCardResult;>;"
        }
    .end annotation
.end field


# instance fields
.field private mDefaultCard:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    new-instance v0, Lcom/unionpay/tsmservice/result/GetDefaultCardResult$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/result/GetDefaultCardResult$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/result/GetDefaultCardResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/result/GetDefaultCardResult;->mDefaultCard:Ljava/lang/String;

    .line 30
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 34
    const/4 v0, 0x0

    return v0
.end method

.method public getDefaultCard()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetDefaultCardResult;->mDefaultCard:Ljava/lang/String;

    return-object v0
.end method

.method public setDefaultCard(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/unionpay/tsmservice/result/GetDefaultCardResult;->mDefaultCard:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetDefaultCardResult;->mDefaultCard:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 40
    return-void
.end method
