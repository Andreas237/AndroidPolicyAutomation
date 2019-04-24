.class public Lcom/huawei/health/sns/model/circle/CircleActionParam;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/circle/CircleActionParam;>;"
        }
    .end annotation
.end field


# instance fields
.field private actionParamKey:Ljava/lang/String;

.field private actionParamValue:Ljava/lang/String;

.field private circleId:I

.field private id:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 69
    new-instance v0, Lcom/huawei/health/sns/model/circle/CircleActionParam$3;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/circle/CircleActionParam$3;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/circle/CircleActionParam;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/circle/CircleActionParam;->id:I

    .line 88
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/circle/CircleActionParam;->circleId:I

    .line 89
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/circle/CircleActionParam;->actionParamKey:Ljava/lang/String;

    .line 90
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/circle/CircleActionParam;->actionParamValue:Ljava/lang/String;

    .line 91
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 57
    const/4 v0, 0x0

    return v0
.end method

.method public getActionParamKey()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/CircleActionParam;->actionParamKey:Ljava/lang/String;

    .line 27
    return-object v0
.end method

.method public getActionParamValue()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/CircleActionParam;->actionParamValue:Ljava/lang/String;

    .line 38
    return-object v0
.end method

.method public setActionParamKey(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/health/sns/model/circle/CircleActionParam;->actionParamKey:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public setActionParamValue(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/health/sns/model/circle/CircleActionParam;->actionParamValue:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public setCircleId(I)V
    .locals 0

    .line 21
    iput p1, p0, Lcom/huawei/health/sns/model/circle/CircleActionParam;->circleId:I

    .line 22
    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 16
    iput p1, p0, Lcom/huawei/health/sns/model/circle/CircleActionParam;->id:I

    .line 17
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 63
    iget v0, p0, Lcom/huawei/health/sns/model/circle/CircleActionParam;->id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 64
    iget v0, p0, Lcom/huawei/health/sns/model/circle/CircleActionParam;->circleId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 65
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/CircleActionParam;->actionParamKey:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/CircleActionParam;->actionParamValue:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 67
    return-void
.end method
