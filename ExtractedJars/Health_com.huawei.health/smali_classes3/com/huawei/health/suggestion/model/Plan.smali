.class public Lcom/huawei/health/suggestion/model/Plan;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/model/Plan;>;"
        }
    .end annotation
.end field


# instance fields
.field private calorie:F

.field private createTime:J

.field private days:I

.field private description:Ljava/lang/String;

.field private difficulty:I

.field private distance:F

.field private endDate:Ljava/lang/String;

.field private excludedDates:Ljava/util/TreeSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeSet<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private goal:I

.field private id:Ljava/lang/String;

.field private modified:J

.field private name:Ljava/lang/String;

.field private picture:Ljava/lang/String;

.field private remindTime:I

.field private startDate:Ljava/lang/String;

.field private type:I

.field private version:Ljava/lang/String;

.field private weekCount:I

.field private weekTimes:I

.field private workoutCount:I

.field private workouts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 301
    new-instance v0, Lcom/huawei/health/suggestion/model/Plan$1;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/model/Plan$1;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/model/Plan;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 245
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 246
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 277
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 278
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->id:Ljava/lang/String;

    .line 279
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/Plan;->type:I

    .line 280
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->name:Ljava/lang/String;

    .line 281
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->description:Ljava/lang/String;

    .line 282
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/Plan;->weekCount:I

    .line 283
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->startDate:Ljava/lang/String;

    .line 284
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->endDate:Ljava/lang/String;

    .line 285
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/Plan;->days:I

    .line 286
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/Plan;->workoutCount:I

    .line 287
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/Plan;->calorie:F

    .line 288
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->version:Ljava/lang/String;

    .line 289
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/Plan;->modified:J

    .line 290
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/model/Plan;->createTime:J

    .line 291
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/Plan;->difficulty:I

    .line 292
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->picture:Ljava/lang/String;

    .line 293
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/Plan;->distance:F

    .line 294
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/Plan;->goal:I

    .line 295
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/TreeSet;

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->excludedDates:Ljava/util/TreeSet;

    .line 296
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/Plan;->weekTimes:I

    .line 297
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->workouts:Ljava/util/List;

    .line 298
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->workouts:Ljava/util/List;

    const-class v1, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 299
    return-void
.end method

.method public static getCREATOR()Landroid/os/Parcelable$Creator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/model/Plan;>;"
        }
    .end annotation

    .line 236
    sget-object v0, Lcom/huawei/health/suggestion/model/Plan;->CREATOR:Landroid/os/Parcelable$Creator;

    return-object v0
.end method


# virtual methods
.method public acquireExcludedDates()Ljava/util/TreeSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/TreeSet<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 212
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->excludedDates:Ljava/util/TreeSet;

    return-object v0
.end method

.method public acquireGoal()I
    .locals 1

    .line 195
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->goal:I

    return v0
.end method

.method public acquireId()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->id:Ljava/lang/String;

    return-object v0
.end method

.method public acquireName()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->name:Ljava/lang/String;

    return-object v0
.end method

.method public acquireStartDate()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->startDate:Ljava/lang/String;

    return-object v0
.end method

.method public acquireType()I
    .locals 1

    .line 163
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->type:I

    return v0
.end method

.method public acquireVersion()Ljava/lang/String;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->version:Ljava/lang/String;

    return-object v0
.end method

.method public acquireWeekTimes()I
    .locals 1

    .line 220
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->weekTimes:I

    return v0
.end method

.method public acquireWorkouts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;"
        }
    .end annotation

    .line 91
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->workouts:Ljava/util/List;

    return-object v0
.end method

.method public acquirecreateTime()J
    .locals 2

    .line 203
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/Plan;->createTime:J

    return-wide v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 5

    .line 316
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/suggestion/model/Plan;

    .line 318
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->workouts:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 319
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 320
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->workouts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 321
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/PlanWorkout;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 322
    goto :goto_0

    .line 323
    :cond_0
    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/model/Plan;->saveWorkouts(Ljava/util/List;)V

    .line 326
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->excludedDates:Ljava/util/TreeSet;

    if-eqz v0, :cond_2

    .line 327
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->excludedDates:Ljava/util/TreeSet;

    invoke-virtual {v0}, Ljava/util/TreeSet;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/TreeSet;

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/Plan;->setExcludedDates(Ljava/util/TreeSet;)V
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 330
    :cond_2
    return-object v1

    .line 331
    :catch_0
    move-exception v1

    .line 332
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public describeContents()I
    .locals 1

    .line 250
    const/4 v0, 0x0

    return v0
.end method

.method public getCalorie()F
    .locals 1

    .line 131
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->calorie:F

    return v0
.end method

.method public getDays()I
    .locals 1

    .line 99
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->days:I

    return v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getDifficulty()I
    .locals 1

    .line 171
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->difficulty:I

    return v0
.end method

.method public getDistance()F
    .locals 1

    .line 187
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->distance:F

    return v0
.end method

.method public getEndDate()Ljava/lang/String;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->endDate:Ljava/lang/String;

    return-object v0
.end method

.method public getModified()J
    .locals 2

    .line 139
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/Plan;->modified:J

    return-wide v0
.end method

.method public getPicture()Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->picture:Ljava/lang/String;

    return-object v0
.end method

.method public getRemindTime()I
    .locals 1

    .line 228
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->remindTime:I

    return v0
.end method

.method public getWeekCount()I
    .locals 1

    .line 155
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->weekCount:I

    return v0
.end method

.method public getWorkoutCount()I
    .locals 1

    .line 107
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->workoutCount:I

    return v0
.end method

.method public putName(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Plan;->name:Ljava/lang/String;

    .line 80
    return-void
.end method

.method public saveCalorie(F)V
    .locals 0

    .line 135
    iput p1, p0, Lcom/huawei/health/suggestion/model/Plan;->calorie:F

    .line 136
    return-void
.end method

.method public saveCreateTime(J)V
    .locals 0

    .line 207
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/Plan;->createTime:J

    .line 208
    return-void
.end method

.method public saveDays(I)V
    .locals 0

    .line 103
    iput p1, p0, Lcom/huawei/health/suggestion/model/Plan;->days:I

    .line 104
    return-void
.end method

.method public saveEndDate(Ljava/lang/String;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Plan;->endDate:Ljava/lang/String;

    .line 128
    return-void
.end method

.method public saveId(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Plan;->id:Ljava/lang/String;

    .line 72
    return-void
.end method

.method public savePicture(Ljava/lang/String;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Plan;->picture:Ljava/lang/String;

    .line 184
    return-void
.end method

.method public saveStartDate(Ljava/lang/String;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Plan;->startDate:Ljava/lang/String;

    .line 120
    return-void
.end method

.method public saveType(I)V
    .locals 0

    .line 167
    iput p1, p0, Lcom/huawei/health/suggestion/model/Plan;->type:I

    .line 168
    return-void
.end method

.method public saveWeekCount(I)V
    .locals 0

    .line 159
    iput p1, p0, Lcom/huawei/health/suggestion/model/Plan;->weekCount:I

    .line 160
    return-void
.end method

.method public saveWorkoutCount(I)V
    .locals 0

    .line 111
    iput p1, p0, Lcom/huawei/health/suggestion/model/Plan;->workoutCount:I

    .line 112
    return-void
.end method

.method public final saveWorkouts(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;)V"
        }
    .end annotation

    .line 95
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Plan;->workouts:Ljava/util/List;

    .line 96
    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Plan;->description:Ljava/lang/String;

    .line 88
    return-void
.end method

.method public setDifficulty(I)V
    .locals 0

    .line 175
    iput p1, p0, Lcom/huawei/health/suggestion/model/Plan;->difficulty:I

    .line 176
    return-void
.end method

.method public setDistance(F)V
    .locals 0

    .line 191
    iput p1, p0, Lcom/huawei/health/suggestion/model/Plan;->distance:F

    .line 192
    return-void
.end method

.method public final setExcludedDates(Ljava/util/TreeSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/TreeSet<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 216
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Plan;->excludedDates:Ljava/util/TreeSet;

    .line 217
    return-void
.end method

.method public setGoal(I)V
    .locals 0

    .line 199
    iput p1, p0, Lcom/huawei/health/suggestion/model/Plan;->goal:I

    .line 200
    return-void
.end method

.method public setModified(J)V
    .locals 0

    .line 143
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/Plan;->modified:J

    .line 144
    return-void
.end method

.method public setRemindTime(I)V
    .locals 0

    .line 232
    iput p1, p0, Lcom/huawei/health/suggestion/model/Plan;->remindTime:I

    .line 233
    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Plan;->version:Ljava/lang/String;

    .line 152
    return-void
.end method

.method public setWeekTimes(I)V
    .locals 0

    .line 224
    iput p1, p0, Lcom/huawei/health/suggestion/model/Plan;->weekTimes:I

    .line 225
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 241
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 255
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 256
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 257
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 258
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->description:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 259
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->weekCount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 260
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->startDate:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 261
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->endDate:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 262
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->days:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 263
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->workoutCount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 264
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->calorie:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 265
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->version:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 266
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/Plan;->modified:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 267
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/Plan;->createTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 268
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->difficulty:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 269
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->picture:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 270
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->distance:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 271
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->goal:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 272
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->excludedDates:Ljava/util/TreeSet;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 273
    iget v0, p0, Lcom/huawei/health/suggestion/model/Plan;->weekTimes:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 274
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Plan;->workouts:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 275
    return-void
.end method
