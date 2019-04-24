.class public Lcom/huawei/pluginFitnessAdvice/Coordinate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/pluginFitnessAdvice/Coordinate;>;"
        }
    .end annotation
.end field


# instance fields
.field private id:Ljava/lang/String;

.field private tip:Ljava/lang/String;

.field private x:I

.field private y:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 82
    new-instance v0, Lcom/huawei/pluginFitnessAdvice/Coordinate$1;

    invoke-direct {v0}, Lcom/huawei/pluginFitnessAdvice/Coordinate$1;-><init>()V

    sput-object v0, Lcom/huawei/pluginFitnessAdvice/Coordinate;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Coordinate;->id:Ljava/lang/String;

    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/Coordinate;->x:I

    .line 78
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/Coordinate;->y:I

    .line 79
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Coordinate;->tip:Ljava/lang/String;

    .line 80
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 61
    const/4 v0, 0x0

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Coordinate;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getTip()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Coordinate;->tip:Ljava/lang/String;

    return-object v0
.end method

.method public getX()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Coordinate;->x:I

    return v0
.end method

.method public getY()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Coordinate;->y:I

    return v0
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Coordinate;->id:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public setTip(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Coordinate;->tip:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public setX(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Coordinate;->x:I

    .line 36
    return-void
.end method

.method public setY(I)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Coordinate;->y:I

    .line 44
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 56
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uadpDC1()V
    .locals 0

    .line 96
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 100
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 104
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 108
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Coordinate;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 67
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Coordinate;->x:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 68
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Coordinate;->y:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 69
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Coordinate;->tip:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 70
    return-void
.end method
