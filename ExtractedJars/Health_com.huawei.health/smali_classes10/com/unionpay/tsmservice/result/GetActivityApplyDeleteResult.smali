.class public Lcom/unionpay/tsmservice/result/GetActivityApplyDeleteResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/result/GetActivityApplyDeleteResult;>;"
        }
    .end annotation
.end field


# instance fields
.field private mAppApplyDeleteRecord:Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Lcom/unionpay/tsmservice/result/GetActivityApplyDeleteResult$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/result/GetActivityApplyDeleteResult$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/result/GetActivityApplyDeleteResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const-class v0, Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;

    .line 31
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;

    iput-object v0, p0, Lcom/unionpay/tsmservice/result/GetActivityApplyDeleteResult;->mAppApplyDeleteRecord:Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;

    .line 32
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 36
    const/4 v0, 0x0

    return v0
.end method

.method public getApplyDeleteResult()Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetActivityApplyDeleteResult;->mAppApplyDeleteRecord:Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;

    return-object v0
.end method

.method public setApplyDeleteResult(Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/unionpay/tsmservice/result/GetActivityApplyDeleteResult;->mAppApplyDeleteRecord:Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;

    .line 50
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/unionpay/tsmservice/result/GetActivityApplyDeleteResult;->mAppApplyDeleteRecord:Lcom/unionpay/tsmservice/data/AppApplyDeleteRecord;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 42
    return-void
.end method
