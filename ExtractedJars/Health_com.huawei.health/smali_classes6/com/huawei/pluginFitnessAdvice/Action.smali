.class public Lcom/huawei/pluginFitnessAdvice/Action;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private audios:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Audio;>;"
        }
    .end annotation
.end field

.field private covers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Cover;>;"
        }
    .end annotation
.end field

.field private description:Ljava/lang/String;

.field private difficulty:I

.field private equipments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Equipment;>;"
        }
    .end annotation
.end field

.field private frequency:I

.field private goals:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Goal;>;"
        }
    .end annotation
.end field

.field private gyro:I

.field private id:Ljava/lang/String;

.field private logoImgUrl:Ljava/lang/String;

.field private measurementType:I

.field private modified:J

.field private name:Ljava/lang/String;

.field private publishDate:J

.field private trainingpoints:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Trainingpoint;>;"
        }
    .end annotation
.end field

.field private type:I

.field private version:Ljava/lang/String;

.field private videos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Video;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireId()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->id:Ljava/lang/String;

    return-object v0
.end method

.method public acquireMeasurementType()I
    .locals 1

    .line 79
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->measurementType:I

    return v0
.end method

.method public getAudios()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Audio;>;"
        }
    .end annotation

    .line 212
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->audios:Ljava/util/List;

    return-object v0
.end method

.method public getCovers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Cover;>;"
        }
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->covers:Ljava/util/List;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getDifficulty()I
    .locals 1

    .line 111
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->difficulty:I

    return v0
.end method

.method public getEquipments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Equipment;>;"
        }
    .end annotation

    .line 151
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->equipments:Ljava/util/List;

    return-object v0
.end method

.method public getFrequency()I
    .locals 1

    .line 175
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->frequency:I

    return v0
.end method

.method public getGoals()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Goal;>;"
        }
    .end annotation

    .line 143
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->goals:Ljava/util/List;

    return-object v0
.end method

.method public getGyro()I
    .locals 1

    .line 135
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->gyro:I

    return v0
.end method

.method public getLogoImgUrl()Ljava/lang/String;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->logoImgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getModified()J
    .locals 2

    .line 199
    iget-wide v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->modified:J

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPublishDate()J
    .locals 2

    .line 191
    iget-wide v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->publishDate:J

    return-wide v0
.end method

.method public getTrainingpoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Trainingpoint;>;"
        }
    .end annotation

    .line 159
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->trainingpoints:Ljava/util/List;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 167
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->type:I

    return v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->version:Ljava/lang/String;

    return-object v0
.end method

.method public getVideos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Video;>;"
        }
    .end annotation

    .line 103
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Action;->videos:Ljava/util/List;

    return-object v0
.end method

.method public saveAudios(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Audio;>;)V"
        }
    .end annotation

    .line 216
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->audios:Ljava/util/List;

    .line 217
    return-void
.end method

.method public saveCovers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Cover;>;)V"
        }
    .end annotation

    .line 99
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->covers:Ljava/util/List;

    .line 100
    return-void
.end method

.method public saveDescription(Ljava/lang/String;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->description:Ljava/lang/String;

    .line 124
    return-void
.end method

.method public saveDifficulty(I)V
    .locals 0

    .line 115
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->difficulty:I

    .line 116
    return-void
.end method

.method public saveEquipments(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Equipment;>;)V"
        }
    .end annotation

    .line 155
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->equipments:Ljava/util/List;

    .line 156
    return-void
.end method

.method public saveFrequency(I)V
    .locals 0

    .line 179
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->frequency:I

    .line 180
    return-void
.end method

.method public saveId(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->id:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public saveLogoImgUrl(Ljava/lang/String;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->logoImgUrl:Ljava/lang/String;

    .line 128
    return-void
.end method

.method public saveMeasurementType(I)V
    .locals 0

    .line 83
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->measurementType:I

    .line 84
    return-void
.end method

.method public saveName(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->name:Ljava/lang/String;

    .line 92
    return-void
.end method

.method public saveTrainingpoints(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Trainingpoint;>;)V"
        }
    .end annotation

    .line 163
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->trainingpoints:Ljava/util/List;

    .line 164
    return-void
.end method

.method public saveType(I)V
    .locals 0

    .line 171
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->type:I

    .line 172
    return-void
.end method

.method public saveVersion(Ljava/lang/String;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->version:Ljava/lang/String;

    .line 188
    return-void
.end method

.method public saveVideos(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Video;>;)V"
        }
    .end annotation

    .line 107
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->videos:Ljava/util/List;

    .line 108
    return-void
.end method

.method public setGoals(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Goal;>;)V"
        }
    .end annotation

    .line 147
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->goals:Ljava/util/List;

    .line 148
    return-void
.end method

.method public setGyro(I)V
    .locals 0

    .line 139
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->gyro:I

    .line 140
    return-void
.end method

.method public setModified(J)V
    .locals 0

    .line 203
    iput-wide p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->modified:J

    .line 204
    return-void
.end method

.method public setPublishDate(J)V
    .locals 0

    .line 195
    iput-wide p1, p0, Lcom/huawei/pluginFitnessAdvice/Action;->publishDate:J

    .line 196
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 208
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
