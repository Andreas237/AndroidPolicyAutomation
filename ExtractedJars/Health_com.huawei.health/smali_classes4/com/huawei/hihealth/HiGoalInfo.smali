.class public Lcom/huawei/hihealth/HiGoalInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiGoalInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private dealLine:I

.field private goalType:I

.field private goalUnit:I

.field private goalValue:D

.field private ownerId:I

.field private targetType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 59
    new-instance v0, Lcom/huawei/hihealth/HiGoalInfo$5;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiGoalInfo$5;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiGoalInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->ownerId:I

    .line 48
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->ownerId:I

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->goalType:I

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->goalValue:D

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->goalUnit:I

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->ownerId:I

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->targetType:I

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->dealLine:I

    .line 57
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 127
    const/4 v0, 0x0

    return v0
.end method

.method public getDealLine()I
    .locals 1

    .line 122
    iget v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->dealLine:I

    return v0
.end method

.method public getGoalType()I
    .locals 1

    .line 73
    iget v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->goalType:I

    return v0
.end method

.method public getGoalUnit()I
    .locals 1

    .line 93
    iget v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->goalUnit:I

    return v0
.end method

.method public getGoalValue()D
    .locals 2

    .line 83
    iget-wide v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->goalValue:D

    return-wide v0
.end method

.method public getOwnerId()I
    .locals 1

    .line 114
    iget v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->ownerId:I

    return v0
.end method

.method public getTargetType()I
    .locals 1

    .line 118
    iget v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->targetType:I

    return v0
.end method

.method public initFunctionAb()V
    .locals 0

    .line 158
    return-void
.end method

.method public initFunctionBb()V
    .locals 0

    .line 162
    return-void
.end method

.method public initFunctionCb()V
    .locals 0

    .line 166
    return-void
.end method

.method public setDealLine(I)V
    .locals 0

    .line 106
    iput p1, p0, Lcom/huawei/hihealth/HiGoalInfo;->dealLine:I

    .line 107
    return-void
.end method

.method public setGoalType(I)V
    .locals 0

    .line 78
    iput p1, p0, Lcom/huawei/hihealth/HiGoalInfo;->goalType:I

    .line 79
    return-void
.end method

.method public setGoalUnit(I)V
    .locals 0

    .line 98
    iput p1, p0, Lcom/huawei/hihealth/HiGoalInfo;->goalUnit:I

    .line 99
    return-void
.end method

.method public setGoalValue(D)V
    .locals 0

    .line 88
    iput-wide p1, p0, Lcom/huawei/hihealth/HiGoalInfo;->goalValue:D

    .line 89
    return-void
.end method

.method public setOwnerId(I)V
    .locals 0

    .line 110
    iput p1, p0, Lcom/huawei/hihealth/HiGoalInfo;->ownerId:I

    .line 111
    return-void
.end method

.method public setTargetType(I)V
    .locals 0

    .line 102
    iput p1, p0, Lcom/huawei/hihealth/HiGoalInfo;->targetType:I

    .line 103
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 142
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "HiGoalInfo{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 143
    const-string v0, "goalType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiGoalInfo;->goalType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 144
    const-string v0, ", goalValue="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealth/HiGoalInfo;->goalValue:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    .line 145
    const-string v0, ", goalUnit="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiGoalInfo;->goalUnit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 146
    const-string v0, ", ownerId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiGoalInfo;->ownerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 147
    const-string v0, ", targetType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiGoalInfo;->targetType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 148
    const-string v0, ", dealLine="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiGoalInfo;->dealLine:I

    int-to-long v1, v1

    invoke-static {v1, v2}, Lo/cnk;->o(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 149
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 150
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 132
    iget v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->goalType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 133
    iget-wide v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->goalValue:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 134
    iget v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->goalUnit:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 135
    iget v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->ownerId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 136
    iget v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->targetType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 137
    iget v0, p0, Lcom/huawei/hihealth/HiGoalInfo;->dealLine:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 138
    return-void
.end method
