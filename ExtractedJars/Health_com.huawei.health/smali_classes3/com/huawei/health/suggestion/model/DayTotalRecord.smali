.class public Lcom/huawei/health/suggestion/model/DayTotalRecord;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/model/DayTotalRecord;>;"
        }
    .end annotation
.end field


# instance fields
.field private calorie:F

.field private date:I

.field private duration:I

.field private id:I

.field private isLastRecord:I

.field private status:I

.field private timeStamp:J

.field private totalCalorie:F

.field private totalDuration:I

.field private userId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 126
    new-instance v0, Lcom/huawei/health/suggestion/model/DayTotalRecord$1;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/model/DayTotalRecord$1;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->id:I

    .line 140
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->userId:Ljava/lang/String;

    .line 141
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->date:I

    .line 142
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->timeStamp:J

    .line 143
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->calorie:F

    .line 144
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->duration:I

    .line 145
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->status:I

    .line 146
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->totalCalorie:F

    .line 147
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->totalDuration:I

    .line 148
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->isLastRecord:I

    .line 149
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 109
    const/4 v0, 0x0

    return v0
.end method

.method public getCalorie()F
    .locals 1

    .line 57
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->calorie:F

    return v0
.end method

.method public getDate()I
    .locals 1

    .line 41
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->date:I

    return v0
.end method

.method public getDuration()I
    .locals 1

    .line 65
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->duration:I

    return v0
.end method

.method public getId()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->id:I

    return v0
.end method

.method public getIsLastRecord()I
    .locals 1

    .line 97
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->isLastRecord:I

    return v0
.end method

.method public getStatus()I
    .locals 1

    .line 73
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->status:I

    return v0
.end method

.method public getTimeStamp()J
    .locals 2

    .line 49
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->timeStamp:J

    return-wide v0
.end method

.method public getTotalCalorie()F
    .locals 1

    .line 81
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->totalCalorie:F

    return v0
.end method

.method public getTotalDuration()I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->totalDuration:I

    return v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public setCalorie(F)V
    .locals 0

    .line 61
    iput p1, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->calorie:F

    .line 62
    return-void
.end method

.method public setDate(I)V
    .locals 0

    .line 45
    iput p1, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->date:I

    .line 46
    return-void
.end method

.method public setDuration(I)V
    .locals 0

    .line 69
    iput p1, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->duration:I

    .line 70
    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 37
    iput p1, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->id:I

    .line 38
    return-void
.end method

.method public setIsLastRecord(I)V
    .locals 0

    .line 101
    iput p1, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->isLastRecord:I

    .line 102
    return-void
.end method

.method public setStatus(I)V
    .locals 0

    .line 77
    iput p1, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->status:I

    .line 78
    return-void
.end method

.method public setTimeStamp(J)V
    .locals 0

    .line 53
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->timeStamp:J

    .line 54
    return-void
.end method

.method public setTotalCalorie(F)V
    .locals 0

    .line 85
    iput p1, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->totalCalorie:F

    .line 86
    return-void
.end method

.method public setTotalDuration(I)V
    .locals 0

    .line 93
    iput p1, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->totalDuration:I

    .line 94
    return-void
.end method

.method public setUserId(Ljava/lang/String;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->userId:Ljava/lang/String;

    .line 157
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 114
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 115
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->userId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 116
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->date:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 117
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->timeStamp:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 118
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->calorie:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 119
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->duration:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 120
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->status:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 121
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->totalCalorie:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 122
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->totalDuration:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 123
    iget v0, p0, Lcom/huawei/health/suggestion/model/DayTotalRecord;->isLastRecord:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 124
    return-void
.end method
