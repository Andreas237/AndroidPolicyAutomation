.class public Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;>;"
        }
    .end annotation
.end field


# instance fields
.field private detail:Ljava/lang/String;

.field private difficulty:I

.field private duration:I

.field private equipments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Equipment;>;"
        }
    .end annotation
.end field

.field private finishDate:Ljava/lang/String;

.field private gender:I

.field private isPlan:Z

.field private motions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;"
        }
    .end annotation
.end field

.field private picture:Ljava/lang/String;

.field private planId:Ljava/lang/String;

.field private planType:I

.field private startDate:Ljava/lang/String;

.field private tag:Ljava/lang/String;

.field private trainingpoints:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Trainingpoint;>;"
        }
    .end annotation
.end field

.field private workId:Ljava/lang/String;

.field private workOutName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 222
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData$4;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData$4;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 200
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 201
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 204
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->planId:Ljava/lang/String;

    .line 205
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->duration:I

    .line 206
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->tag:Ljava/lang/String;

    .line 207
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->workOutName:Ljava/lang/String;

    .line 208
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->workId:Ljava/lang/String;

    .line 209
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->isPlan:Z

    .line 210
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->startDate:Ljava/lang/String;

    .line 211
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->finishDate:Ljava/lang/String;

    .line 212
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/Equipment;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->equipments:Ljava/util/List;

    .line 213
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/Trainingpoint;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->trainingpoints:Ljava/util/List;

    .line 214
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->difficulty:I

    .line 215
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->detail:Ljava/lang/String;

    .line 216
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->picture:Ljava/lang/String;

    .line 217
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->gender:I

    .line 218
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->planType:I

    .line 219
    sget-object v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->motions:Ljava/util/List;

    .line 220
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/health/suggestion/ui/fitness/module/CoachData$4;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public acquireDuration()I
    .locals 1

    .line 140
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->duration:I

    return v0
.end method

.method public acquireMotions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;"
        }
    .end annotation

    .line 88
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->motions:Ljava/util/List;

    return-object v0
.end method

.method public acquireWorkId()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->workId:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .line 177
    const/4 v0, 0x0

    return v0
.end method

.method public getDetail()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->detail:Ljava/lang/String;

    return-object v0
.end method

.method public getDifficulty()I
    .locals 1

    .line 120
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->difficulty:I

    return v0
.end method

.method public getEquipments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Equipment;>;"
        }
    .end annotation

    .line 104
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->equipments:Ljava/util/List;

    return-object v0
.end method

.method public getGender()I
    .locals 1

    .line 160
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->gender:I

    return v0
.end method

.method public getPicture()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->picture:Ljava/lang/String;

    return-object v0
.end method

.method public getPlanId()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->planId:Ljava/lang/String;

    return-object v0
.end method

.method public getStartDate()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->startDate:Ljava/lang/String;

    return-object v0
.end method

.method public getTag()Ljava/lang/String;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public getTrainingpoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Trainingpoint;>;"
        }
    .end annotation

    .line 112
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->trainingpoints:Ljava/util/List;

    return-object v0
.end method

.method public isPlan()Z
    .locals 1

    .line 64
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->isPlan:Z

    return v0
.end method

.method public saveDuration(I)V
    .locals 0

    .line 144
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->duration:I

    .line 145
    return-void
.end method

.method public saveMotions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;)V"
        }
    .end annotation

    .line 92
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->motions:Ljava/util/List;

    .line 93
    return-void
.end method

.method public savePlanId(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->planId:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public saveWorkId(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->workId:Ljava/lang/String;

    .line 57
    return-void
.end method

.method public setDetail(Ljava/lang/String;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->detail:Ljava/lang/String;

    .line 133
    return-void
.end method

.method public setDifficulty(I)V
    .locals 0

    .line 124
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->difficulty:I

    .line 125
    return-void
.end method

.method public setEquipments(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Equipment;>;)V"
        }
    .end annotation

    .line 108
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->equipments:Ljava/util/List;

    .line 109
    return-void
.end method

.method public setGender(I)V
    .locals 0

    .line 164
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->gender:I

    .line 165
    return-void
.end method

.method public setPicture(Ljava/lang/String;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->picture:Ljava/lang/String;

    .line 157
    return-void
.end method

.method public setPlan(Z)V
    .locals 0

    .line 68
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->isPlan:Z

    .line 69
    return-void
.end method

.method public setStartDate(Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->startDate:Ljava/lang/String;

    .line 77
    return-void
.end method

.method public setTag(Ljava/lang/String;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->tag:Ljava/lang/String;

    .line 153
    return-void
.end method

.method public setTrainingpoints(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Trainingpoint;>;)V"
        }
    .end annotation

    .line 116
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->trainingpoints:Ljava/util/List;

    .line 117
    return-void
.end method

.method public uadpDC1()V
    .locals 0

    .line 237
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 241
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 245
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 249
    return-void
.end method

.method public uadpDC5()V
    .locals 0

    .line 253
    return-void
.end method

.method public uadpDC6()V
    .locals 0

    .line 257
    return-void
.end method

.method public uadpDC7()V
    .locals 0

    .line 261
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->planId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 183
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->duration:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 184
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->tag:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 185
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->workOutName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->workId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 187
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->isPlan:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 188
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->startDate:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 189
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->finishDate:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 190
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->equipments:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->trainingpoints:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 192
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->difficulty:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 193
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->detail:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->picture:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 195
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->gender:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 196
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->planType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 197
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->motions:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 198
    return-void
.end method
