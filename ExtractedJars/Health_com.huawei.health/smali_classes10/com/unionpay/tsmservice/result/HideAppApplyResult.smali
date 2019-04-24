.class public Lcom/unionpay/tsmservice/result/HideAppApplyResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/result/HideAppApplyResult;>;"
        }
    .end annotation
.end field


# instance fields
.field private isSuccess:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    new-instance v0, Lcom/unionpay/tsmservice/result/HideAppApplyResult$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/result/HideAppApplyResult$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/result/HideAppApplyResult;->CREATOR:Landroid/os/Parcelable$Creator;

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
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/unionpay/tsmservice/result/HideAppApplyResult;->isSuccess:Z

    .line 29
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 33
    const/4 v0, 0x0

    return v0
.end method

.method public isSuccess()Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Lcom/unionpay/tsmservice/result/HideAppApplyResult;->isSuccess:Z

    return v0
.end method

.method public setSuccess(Z)V
    .locals 0

    .line 46
    iput-boolean p1, p0, Lcom/unionpay/tsmservice/result/HideAppApplyResult;->isSuccess:Z

    .line 47
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 38
    iget-boolean v0, p0, Lcom/unionpay/tsmservice/result/HideAppApplyResult;->isSuccess:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 39
    return-void
.end method
