.class public Lcom/huawei/hihealthservice/old/model/MotionPath;
.super Lcom/huawei/hihealthservice/old/model/HealthData;
.source "SourceFile"


# static fields
.field public static final RUN_STATE_DEFAULT:I = 0x0

.field public static final RUN_STATE_END:I = 0x3

.field public static final RUN_STATE_RUNNING:I = 0x2

.field public static final RUN_STATE_START:I = 0x1

.field private static final serialVersionUID:J = -0x189d130e1a20536dL


# instance fields
.field private endAddress:Ljava/lang/String;

.field private heartrateList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;>;"
        }
    .end annotation
.end field

.field private lbsDataMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Long;[D>;"
        }
    .end annotation
.end field

.field private paceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private partTimeMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private pathImageURI:Ljava/lang/String;

.field private realSteps:I

.field private realStoreys:I

.field private runState:I

.field private startAddress:Ljava/lang/String;

.field private totalCalories:I

.field private totalDistance:I

.field private totalSteps:I

.field private totalStoreys:I

.field private totalTime:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;-><init>()V

    .line 115
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->runState:I

    return-void
.end method

.method private initData(Lcom/huawei/hihealthservice/old/model/MotionPath;)V
    .locals 1

    .line 314
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getTotalCalories()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setTotalCalories(I)V

    .line 315
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getTotalDistance()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setTotalDistance(I)V

    .line 316
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getTotalSteps()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setTotalSteps(I)V

    .line 317
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getTotalStoreys()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->setTotalStoreys(I)V

    .line 318
    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Lcom/huawei/hihealthservice/old/model/HealthData;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->clone()Lcom/huawei/hihealthservice/old/model/MotionPath;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/model/MotionPath;
    .locals 2

    .line 305
    invoke-super {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;->clone()Lcom/huawei/hihealthservice/old/model/HealthData;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/hihealthservice/old/model/MotionPath;

    .line 306
    if-eqz v1, :cond_0

    .line 308
    invoke-direct {p0, v1}, Lcom/huawei/hihealthservice/old/model/MotionPath;->initData(Lcom/huawei/hihealthservice/old/model/MotionPath;)V

    .line 310
    :cond_0
    return-object v1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 28
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->clone()Lcom/huawei/hihealthservice/old/model/MotionPath;

    move-result-object v0

    return-object v0
.end method

.method public getEndAddress()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->endAddress:Ljava/lang/String;

    return-object v0
.end method

.method public getHeartrateList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;>;"
        }
    .end annotation

    .line 258
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->heartrateList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getLbsDataMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Long;[D>;"
        }
    .end annotation

    .line 155
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->lbsDataMap:Ljava/util/Map;

    return-object v0
.end method

.method public getPaceMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 168
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->paceMap:Ljava/util/Map;

    return-object v0
.end method

.method public getPartTimeMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;"
        }
    .end annotation

    .line 177
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->partTimeMap:Ljava/util/Map;

    return-object v0
.end method

.method public getPathImageURI()Ljava/lang/String;
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->pathImageURI:Ljava/lang/String;

    return-object v0
.end method

.method public getRealSteps()I
    .locals 1

    .line 344
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->realSteps:I

    return v0
.end method

.method public getRealStoreys()I
    .locals 1

    .line 332
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->realStoreys:I

    return v0
.end method

.method public getRunState()I
    .locals 1

    .line 120
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->runState:I

    return v0
.end method

.method public getStartAddress()Ljava/lang/String;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->startAddress:Ljava/lang/String;

    return-object v0
.end method

.method public getTotalCalories()I
    .locals 1

    .line 235
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->totalCalories:I

    return v0
.end method

.method public getTotalDistance()I
    .locals 1

    .line 205
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->totalDistance:I

    return v0
.end method

.method public getTotalSteps()I
    .locals 1

    .line 247
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->totalSteps:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->totalSteps:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getTotalStoreys()I
    .locals 1

    .line 322
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->totalStoreys:I

    return v0
.end method

.method public getTotalTime()J
    .locals 2

    .line 221
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->totalTime:J

    return-wide v0
.end method

.method public initFunctionAv()V
    .locals 0

    .line 359
    return-void
.end method

.method public initFunctionBv()V
    .locals 0

    .line 363
    return-void
.end method

.method public initFunctionCv()V
    .locals 0

    .line 367
    return-void
.end method

.method public setEndAddress(Ljava/lang/String;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->endAddress:Ljava/lang/String;

    .line 146
    return-void
.end method

.method public setHeartrateList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;>;)V"
        }
    .end annotation

    .line 263
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->heartrateList:Ljava/util/ArrayList;

    .line 264
    return-void
.end method

.method public setLbsDataMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Long;[D>;)V"
        }
    .end annotation

    .line 163
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->lbsDataMap:Ljava/util/Map;

    .line 164
    return-void
.end method

.method public setPaceMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 173
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->paceMap:Ljava/util/Map;

    .line 174
    return-void
.end method

.method public setPartTimeMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;)V"
        }
    .end annotation

    .line 181
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->partTimeMap:Ljava/util/Map;

    .line 182
    return-void
.end method

.method public setPathImageURI(Ljava/lang/String;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->pathImageURI:Ljava/lang/String;

    .line 198
    return-void
.end method

.method public setRealSteps(I)V
    .locals 0

    .line 351
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->realSteps:I

    .line 352
    return-void
.end method

.method public setRealStoreys(I)V
    .locals 0

    .line 337
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->realStoreys:I

    .line 338
    return-void
.end method

.method public setRunState(I)V
    .locals 0

    .line 125
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->runState:I

    .line 126
    return-void
.end method

.method public setStartAddress(Ljava/lang/String;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->startAddress:Ljava/lang/String;

    .line 136
    return-void
.end method

.method public setTotalCalories(I)V
    .locals 0

    .line 241
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->totalCalories:I

    .line 242
    return-void
.end method

.method public setTotalDistance(I)V
    .locals 0

    .line 213
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->totalDistance:I

    .line 214
    return-void
.end method

.method public setTotalSteps(I)V
    .locals 0

    .line 253
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->totalSteps:I

    .line 254
    return-void
.end method

.method public setTotalStoreys(I)V
    .locals 0

    .line 327
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->totalStoreys:I

    .line 328
    return-void
.end method

.method public setTotalTime(J)V
    .locals 0

    .line 229
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->totalTime:J

    .line 230
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 269
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 270
    const-string v0, "MotionPath [startAddress="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->startAddress:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    const-string v0, ", endAddress="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->endAddress:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    const-string v0, ", paceMap="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->paceMap:Ljava/util/Map;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 278
    const-string v0, ", heartrateList="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->heartrateList:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 280
    const-string v0, ", partTimeMap="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->partTimeMap:Ljava/util/Map;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 282
    const-string v0, ", totalDistance="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->totalDistance:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 284
    const-string v0, ", totalTime="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->totalTime:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 286
    const-string v0, ", pathImageURI="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/MotionPath;->pathImageURI:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    const-string v0, ", getTotalCalories()="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getTotalCalories()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 290
    const-string v0, ", realSteps="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getRealSteps()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 292
    const-string v0, ", getTotalSteps()="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/model/MotionPath;->getTotalSteps()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 294
    const-string v0, ", super="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    invoke-super {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    const-string v0, ", getClass()="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 298
    const-string v0, ", hashCode()="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 300
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
