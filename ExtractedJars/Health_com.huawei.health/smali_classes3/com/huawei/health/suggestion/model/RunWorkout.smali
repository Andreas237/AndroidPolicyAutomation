.class public Lcom/huawei/health/suggestion/model/RunWorkout;
.super Lcom/huawei/pluginFitnessAdvice/Workout;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/model/RunWorkout;>;"
        }
    .end annotation
.end field


# instance fields
.field private cooldown:Lcom/huawei/health/suggestion/model/ExerciseProfile;

.field private dayNumber:I

.field private distance:I

.field private phraseNumber:I

.field public repeats:I

.field private rest:Lcom/huawei/health/suggestion/model/ExerciseProfile;

.field private trainingEffect:I

.field private warmup:Lcom/huawei/health/suggestion/model/ExerciseProfile;

.field private weekPhraseNumber:I

.field private work:Lcom/huawei/health/suggestion/model/ExerciseProfile;

.field private workoutDate:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 192
    new-instance v0, Lcom/huawei/health/suggestion/model/RunWorkout$1;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/model/RunWorkout$1;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/model/RunWorkout;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 174
    invoke-direct {p0}, Lcom/huawei/pluginFitnessAdvice/Workout;-><init>()V

    .line 175
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 178
    invoke-direct {p0, p1}, Lcom/huawei/pluginFitnessAdvice/Workout;-><init>(Landroid/os/Parcel;)V

    .line 179
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->workoutDate:Ljava/lang/String;

    .line 180
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->dayNumber:I

    .line 181
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->phraseNumber:I

    .line 182
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->repeats:I

    .line 183
    const-class v0, Lcom/huawei/health/suggestion/model/ExerciseProfile;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/ExerciseProfile;

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->warmup:Lcom/huawei/health/suggestion/model/ExerciseProfile;

    .line 184
    const-class v0, Lcom/huawei/health/suggestion/model/ExerciseProfile;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/ExerciseProfile;

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->work:Lcom/huawei/health/suggestion/model/ExerciseProfile;

    .line 185
    const-class v0, Lcom/huawei/health/suggestion/model/ExerciseProfile;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/ExerciseProfile;

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->rest:Lcom/huawei/health/suggestion/model/ExerciseProfile;

    .line 186
    const-class v0, Lcom/huawei/health/suggestion/model/ExerciseProfile;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/ExerciseProfile;

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->cooldown:Lcom/huawei/health/suggestion/model/ExerciseProfile;

    .line 187
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->weekPhraseNumber:I

    .line 188
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->trainingEffect:I

    .line 189
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->distance:I

    .line 190
    return-void
.end method


# virtual methods
.method public acquireDistance()I
    .locals 1

    .line 137
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->distance:I

    return v0
.end method

.method public acquireWorkoutDate()Ljava/lang/String;
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->workoutDate:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .line 155
    const/4 v0, 0x0

    return v0
.end method

.method public getCooldown()Lcom/huawei/health/suggestion/model/ExerciseProfile;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->cooldown:Lcom/huawei/health/suggestion/model/ExerciseProfile;

    return-object v0
.end method

.method public getDayNumber()I
    .locals 1

    .line 65
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->dayNumber:I

    return v0
.end method

.method public getPhraseNumber()I
    .locals 1

    .line 73
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->phraseNumber:I

    return v0
.end method

.method public getRepeats()I
    .locals 1

    .line 81
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->repeats:I

    return v0
.end method

.method public getRest()Lcom/huawei/health/suggestion/model/ExerciseProfile;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->rest:Lcom/huawei/health/suggestion/model/ExerciseProfile;

    return-object v0
.end method

.method public getTrainingEffect()I
    .locals 1

    .line 129
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->trainingEffect:I

    return v0
.end method

.method public getWarmup()Lcom/huawei/health/suggestion/model/ExerciseProfile;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->warmup:Lcom/huawei/health/suggestion/model/ExerciseProfile;

    return-object v0
.end method

.method public getWeekPhraseNumber()I
    .locals 1

    .line 121
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->weekPhraseNumber:I

    return v0
.end method

.method public getWork()Lcom/huawei/health/suggestion/model/ExerciseProfile;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->work:Lcom/huawei/health/suggestion/model/ExerciseProfile;

    return-object v0
.end method

.method public putWorkoutDate(Ljava/lang/String;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->workoutDate:Ljava/lang/String;

    .line 150
    return-void
.end method

.method public setCooldown(Lcom/huawei/health/suggestion/model/ExerciseProfile;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->cooldown:Lcom/huawei/health/suggestion/model/ExerciseProfile;

    .line 118
    return-void
.end method

.method public setDayNumber(I)V
    .locals 0

    .line 69
    iput p1, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->dayNumber:I

    .line 70
    return-void
.end method

.method public setDistance(I)V
    .locals 0

    .line 141
    iput p1, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->distance:I

    .line 142
    return-void
.end method

.method public setPhraseNumber(I)V
    .locals 0

    .line 77
    iput p1, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->phraseNumber:I

    .line 78
    return-void
.end method

.method public setRepeats(I)V
    .locals 0

    .line 85
    iput p1, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->repeats:I

    .line 86
    return-void
.end method

.method public setRest(Lcom/huawei/health/suggestion/model/ExerciseProfile;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->rest:Lcom/huawei/health/suggestion/model/ExerciseProfile;

    .line 110
    return-void
.end method

.method public setTrainingEffect(I)V
    .locals 0

    .line 133
    iput p1, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->trainingEffect:I

    .line 134
    return-void
.end method

.method public setWarmup(Lcom/huawei/health/suggestion/model/ExerciseProfile;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->warmup:Lcom/huawei/health/suggestion/model/ExerciseProfile;

    .line 94
    return-void
.end method

.method public setWeekPhraseNumber(I)V
    .locals 0

    .line 125
    iput p1, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->weekPhraseNumber:I

    .line 126
    return-void
.end method

.method public setWork(Lcom/huawei/health/suggestion/model/ExerciseProfile;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->work:Lcom/huawei/health/suggestion/model/ExerciseProfile;

    .line 102
    return-void
.end method

.method public uadpDC10()V
    .locals 0

    .line 228
    return-void
.end method

.method public uadpDC11()V
    .locals 0

    .line 233
    return-void
.end method

.method public uadpDC12()V
    .locals 0

    .line 238
    return-void
.end method

.method public uadpDC13()V
    .locals 0

    .line 242
    return-void
.end method

.method public uadpDC14()V
    .locals 0

    .line 246
    return-void
.end method

.method public uadpDC15()V
    .locals 0

    .line 250
    return-void
.end method

.method public uadpDC16()V
    .locals 0

    .line 254
    return-void
.end method

.method public uadpDC5()V
    .locals 0

    .line 207
    return-void
.end method

.method public uadpDC6()V
    .locals 0

    .line 211
    return-void
.end method

.method public uadpDC7()V
    .locals 0

    .line 215
    return-void
.end method

.method public uadpDC8()V
    .locals 0

    .line 219
    return-void
.end method

.method public uadpDC9()V
    .locals 0

    .line 223
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 160
    invoke-super {p0, p1, p2}, Lcom/huawei/pluginFitnessAdvice/Workout;->writeToParcel(Landroid/os/Parcel;I)V

    .line 161
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->workoutDate:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 162
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->dayNumber:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 163
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->phraseNumber:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 164
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->repeats:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 165
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->warmup:Lcom/huawei/health/suggestion/model/ExerciseProfile;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 166
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->work:Lcom/huawei/health/suggestion/model/ExerciseProfile;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 167
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->rest:Lcom/huawei/health/suggestion/model/ExerciseProfile;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 168
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->cooldown:Lcom/huawei/health/suggestion/model/ExerciseProfile;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 169
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->weekPhraseNumber:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 170
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->trainingEffect:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 171
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunWorkout;->distance:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 172
    return-void
.end method
