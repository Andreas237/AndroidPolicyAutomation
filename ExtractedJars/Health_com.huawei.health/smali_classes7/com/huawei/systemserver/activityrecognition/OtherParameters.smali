.class public Lcom/huawei/systemserver/activityrecognition/OtherParameters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/systemserver/activityrecognition/OtherParameters;>;"
        }
    .end annotation
.end field


# instance fields
.field private mParam1:D

.field private mParam2:D

.field private mParam3:D

.field private mParam4:D

.field private mParam5:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 62
    new-instance v0, Lcom/huawei/systemserver/activityrecognition/OtherParameters$2;

    invoke-direct {v0}, Lcom/huawei/systemserver/activityrecognition/OtherParameters$2;-><init>()V

    sput-object v0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 78
    return-void
.end method

.method public constructor <init>(DDDDLjava/lang/String;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-wide p1, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam1:D

    .line 16
    iput-wide p3, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam2:D

    .line 17
    iput-wide p5, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam3:D

    .line 18
    iput-wide p7, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam4:D

    .line 19
    iput-object p9, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam5:Ljava/lang/String;

    .line 20
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 82
    const/4 v0, 0x0

    return v0
.end method

.method public getmParam1()D
    .locals 2

    .line 43
    iget-wide v0, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam1:D

    return-wide v0
.end method

.method public getmParam2()D
    .locals 2

    .line 47
    iget-wide v0, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam2:D

    return-wide v0
.end method

.method public getmParam3()D
    .locals 2

    .line 51
    iget-wide v0, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam3:D

    return-wide v0
.end method

.method public getmParam4()D
    .locals 2

    .line 55
    iget-wide v0, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam4:D

    return-wide v0
.end method

.method public getmParam5()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam5:Ljava/lang/String;

    return-object v0
.end method

.method public setmParam1(D)V
    .locals 0

    .line 23
    iput-wide p1, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam1:D

    .line 24
    return-void
.end method

.method public setmParam2(D)V
    .locals 0

    .line 27
    iput-wide p1, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam2:D

    .line 28
    return-void
.end method

.method public setmParam3(D)V
    .locals 0

    .line 31
    iput-wide p1, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam3:D

    .line 32
    return-void
.end method

.method public setmParam4(D)V
    .locals 0

    .line 35
    iput-wide p1, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam4:D

    .line 36
    return-void
.end method

.method public setmParam5(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam5:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 97
    const-string v0, "Param1=%s, Param2=%s, Param3=%s, Param4=%s, Param5=%s"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    .line 98
    iget-wide v2, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam1:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam2:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-wide v2, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam3:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-wide v2, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam4:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam5:Ljava/lang/String;

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 96
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 87
    iget-wide v0, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam1:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 88
    iget-wide v0, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam2:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 89
    iget-wide v0, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam3:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 90
    iget-wide v0, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam4:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 91
    iget-object v0, p0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->mParam5:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 92
    return-void
.end method
