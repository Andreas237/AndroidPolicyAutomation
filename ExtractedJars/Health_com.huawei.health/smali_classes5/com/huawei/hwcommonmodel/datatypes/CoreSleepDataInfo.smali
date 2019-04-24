.class public Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private info:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo$5;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo$5;-><init>()V

    sput-object v0, Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 39
    const/4 v0, 0x0

    return v0
.end method

.method public getInfo()[B
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo;->info:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public setInfo([B)V
    .locals 1

    .line 20
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo;->info:[B

    .line 21
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo;->info:[B

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 45
    return-void
.end method
