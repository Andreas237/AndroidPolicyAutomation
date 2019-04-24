.class public Lcom/huawei/datatype/WorkoutRecordSpeechPlay;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private workout_record_speech_play_report_status:I

.field private workout_record_speech_play_request_report:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getWorkout_record_speech_play_report_status()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/huawei/datatype/WorkoutRecordSpeechPlay;->workout_record_speech_play_report_status:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getWorkout_record_speech_play_request_report()I
    .locals 1

    .line 23
    iget v0, p0, Lcom/huawei/datatype/WorkoutRecordSpeechPlay;->workout_record_speech_play_request_report:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public setWorkout_record_speech_play_report_status(I)V
    .locals 1

    .line 35
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/WorkoutRecordSpeechPlay;->workout_record_speech_play_report_status:I

    .line 36
    return-void
.end method

.method public setWorkout_record_speech_play_request_report(I)V
    .locals 1

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/WorkoutRecordSpeechPlay;->workout_record_speech_play_request_report:I

    .line 28
    return-void
.end method
