.class public Lcom/huawei/hihealth/HiTimeInterval;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiTimeInterval;>;"
        }
    .end annotation
.end field


# instance fields
.field private endTime:J

.field private startTime:J

.field private timeZone:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 59
    new-instance v0, Lcom/huawei/hihealth/HiTimeInterval$4;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiTimeInterval$4;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiTimeInterval;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    return-void
.end method

.method public constructor <init>(IJJ)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput p1, p0, Lcom/huawei/hihealth/HiTimeInterval;->timeZone:I

    .line 49
    iput-wide p2, p0, Lcom/huawei/hihealth/HiTimeInterval;->endTime:J

    .line 50
    iput-wide p4, p0, Lcom/huawei/hihealth/HiTimeInterval;->startTime:J

    .line 51
    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-wide p1, p0, Lcom/huawei/hihealth/HiTimeInterval;->startTime:J

    .line 44
    iput-wide p3, p0, Lcom/huawei/hihealth/HiTimeInterval;->endTime:J

    .line 45
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiTimeInterval;->startTime:J

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiTimeInterval;->endTime:J

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiTimeInterval;->timeZone:I

    .line 57
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 97
    const/4 v0, 0x0

    return v0
.end method

.method public getEndTime()J
    .locals 2

    .line 80
    iget-wide v0, p0, Lcom/huawei/hihealth/HiTimeInterval;->endTime:J

    return-wide v0
.end method

.method public getStartTime()J
    .locals 2

    .line 72
    iget-wide v0, p0, Lcom/huawei/hihealth/HiTimeInterval;->startTime:J

    return-wide v0
.end method

.method public getTimeZone()I
    .locals 1

    .line 88
    iget v0, p0, Lcom/huawei/hihealth/HiTimeInterval;->timeZone:I

    return v0
.end method

.method public setEndTime(J)V
    .locals 0

    .line 84
    iput-wide p1, p0, Lcom/huawei/hihealth/HiTimeInterval;->endTime:J

    .line 85
    return-void
.end method

.method public setStartTime(J)V
    .locals 0

    .line 76
    iput-wide p1, p0, Lcom/huawei/hihealth/HiTimeInterval;->startTime:J

    .line 77
    return-void
.end method

.method public setTimeZone(I)V
    .locals 0

    .line 92
    iput p1, p0, Lcom/huawei/hihealth/HiTimeInterval;->timeZone:I

    .line 93
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 31
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "HiTimeInterval{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 32
    const-string v0, "startTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealth/HiTimeInterval;->startTime:J

    invoke-static {v1, v2}, Lo/cnk;->o(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 33
    const-string v0, ", endTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealth/HiTimeInterval;->endTime:J

    invoke-static {v1, v2}, Lo/cnk;->o(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 34
    const-string v0, ", timeZone="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiTimeInterval;->timeZone:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 35
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 36
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 102
    iget-wide v0, p0, Lcom/huawei/hihealth/HiTimeInterval;->startTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 103
    iget-wide v0, p0, Lcom/huawei/hihealth/HiTimeInterval;->endTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 104
    iget v0, p0, Lcom/huawei/hihealth/HiTimeInterval;->timeZone:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 105
    return-void
.end method
