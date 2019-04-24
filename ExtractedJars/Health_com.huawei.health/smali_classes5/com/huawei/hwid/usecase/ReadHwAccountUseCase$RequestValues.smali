.class public final Lcom/huawei/hwid/usecase/ReadHwAccountUseCase$RequestValues;
.super Lcom/huawei/hwid/UseCase$RequestValues;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/usecase/ReadHwAccountUseCase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RequestValues"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/usecase/ReadHwAccountUseCase$RequestValues;>;"
        }
    .end annotation
.end field


# instance fields
.field a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 60
    new-instance v0, Lcom/huawei/hwid/usecase/ReadHwAccountUseCase$RequestValues$1;

    invoke-direct {v0}, Lcom/huawei/hwid/usecase/ReadHwAccountUseCase$RequestValues$1;-><init>()V

    sput-object v0, Lcom/huawei/hwid/usecase/ReadHwAccountUseCase$RequestValues;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 56
    invoke-direct {p0}, Lcom/huawei/hwid/UseCase$RequestValues;-><init>()V

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/hwid/usecase/ReadHwAccountUseCase$RequestValues;->a:Z

    .line 58
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/huawei/hwid/UseCase$RequestValues;-><init>()V

    .line 43
    iput-boolean p1, p0, Lcom/huawei/hwid/usecase/ReadHwAccountUseCase$RequestValues;->a:Z

    .line 44
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 48
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 53
    iget-boolean v0, p0, Lcom/huawei/hwid/usecase/ReadHwAccountUseCase$RequestValues;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 54
    return-void
.end method
