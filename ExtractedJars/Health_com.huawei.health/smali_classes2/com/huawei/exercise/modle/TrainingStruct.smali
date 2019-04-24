.class public Lcom/huawei/exercise/modle/TrainingStruct;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private training_duration:I

.field private training_hr_limit_high:I

.field private training_hr_limit_low:I

.field private training_intensity_limit_high:I

.field private training_intensity_limit_low:I

.field private training_speed_limit_high:I

.field private training_speed_limit_low:I

.field private training_type:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getTraining_duration()I
    .locals 1

    .line 97
    iget v0, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_duration:I

    return v0
.end method

.method public getTraining_hr_limit_high()I
    .locals 1

    .line 65
    iget v0, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_hr_limit_high:I

    return v0
.end method

.method public getTraining_hr_limit_low()I
    .locals 1

    .line 73
    iget v0, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_hr_limit_low:I

    return v0
.end method

.method public getTraining_intensity_limit_high()I
    .locals 1

    .line 81
    iget v0, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_intensity_limit_high:I

    return v0
.end method

.method public getTraining_intensity_limit_low()I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_intensity_limit_low:I

    return v0
.end method

.method public getTraining_speed_limit_high()I
    .locals 1

    .line 49
    iget v0, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_speed_limit_high:I

    return v0
.end method

.method public getTraining_speed_limit_low()I
    .locals 1

    .line 57
    iget v0, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_speed_limit_low:I

    return v0
.end method

.method public getTraining_type()I
    .locals 1

    .line 41
    iget v0, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_type:I

    return v0
.end method

.method public setTraining_duration(I)V
    .locals 0

    .line 101
    iput p1, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_duration:I

    .line 102
    return-void
.end method

.method public setTraining_hr_limit_high(I)V
    .locals 0

    .line 69
    iput p1, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_hr_limit_high:I

    .line 70
    return-void
.end method

.method public setTraining_hr_limit_low(I)V
    .locals 0

    .line 77
    iput p1, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_hr_limit_low:I

    .line 78
    return-void
.end method

.method public setTraining_intensity_limit_high(I)V
    .locals 0

    .line 85
    iput p1, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_intensity_limit_high:I

    .line 86
    return-void
.end method

.method public setTraining_intensity_limit_low(I)V
    .locals 0

    .line 93
    iput p1, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_intensity_limit_low:I

    .line 94
    return-void
.end method

.method public setTraining_speed_limit_high(I)V
    .locals 0

    .line 53
    iput p1, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_speed_limit_high:I

    .line 54
    return-void
.end method

.method public setTraining_speed_limit_low(I)V
    .locals 0

    .line 61
    iput p1, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_speed_limit_low:I

    .line 62
    return-void
.end method

.method public setTraining_type(I)V
    .locals 0

    .line 45
    iput p1, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_type:I

    .line 46
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 107
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 109
    iget v0, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_type:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 110
    iget v0, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_speed_limit_high:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 111
    iget v0, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_speed_limit_low:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 112
    iget v0, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_hr_limit_high:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 113
    iget v0, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_hr_limit_low:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 114
    iget v0, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_intensity_limit_high:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 115
    iget v0, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_intensity_limit_low:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 116
    iget v0, p0, Lcom/huawei/exercise/modle/TrainingStruct;->training_duration:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 118
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
