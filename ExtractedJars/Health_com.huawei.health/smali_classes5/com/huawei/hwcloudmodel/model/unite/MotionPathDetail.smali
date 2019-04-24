.class public Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private abnormalTrack:Ljava/lang/Integer;

.field private attribute:Ljava/lang/String;

.field private coordinate:Ljava/lang/String;

.field private deviceCode:Ljava/lang/Long;

.field private duplicateTrack:Ljava/lang/Integer;

.field private endTime:Ljava/lang/Long;

.field private heartRateList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;>;"
        }
    .end annotation
.end field

.field private location:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/Location;>;"
        }
    .end annotation
.end field

.field private paceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Float;>;"
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

.field private pathImageUri:Ljava/lang/String;

.field private recordId:Ljava/lang/String;

.field private runState:Ljava/lang/Integer;

.field private samplePoints:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;>;"
        }
    .end annotation
.end field

.field private sportDataSource:Ljava/lang/Integer;

.field private sportType:Ljava/lang/Integer;

.field private startTime:Ljava/lang/Long;

.field private timeZone:Ljava/lang/String;

.field private totalCalories:Ljava/lang/Integer;

.field private totalDistance:Ljava/lang/Integer;

.field private totalSteps:Ljava/lang/Integer;

.field private totalTime:Ljava/lang/Long;

.field private vendor:Ljava/lang/String;

.field private version:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public clone()Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;
    .locals 2

    .line 365
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 366
    :catch_0
    move-exception v1

    .line 367
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 28
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->clone()Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;

    move-result-object v0

    return-object v0
.end method

.method public getAbnormalTrack()Ljava/lang/Integer;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->abnormalTrack:Ljava/lang/Integer;

    return-object v0
.end method

.method public getAttribute()Ljava/lang/String;
    .locals 1

    .line 305
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->attribute:Ljava/lang/String;

    return-object v0
.end method

.method public getCoordinate()Ljava/lang/String;
    .locals 1

    .line 297
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->coordinate:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public getDuplicateTrack()Ljava/lang/Integer;
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->duplicateTrack:Ljava/lang/Integer;

    return-object v0
.end method

.method public getEndTime()Ljava/lang/Long;
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->endTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getHeartRateList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;>;"
        }
    .end annotation

    .line 257
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->heartRateList:Ljava/util/List;

    return-object v0
.end method

.method public getLocation()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/Location;>;"
        }
    .end annotation

    .line 313
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->location:Ljava/util/List;

    return-object v0
.end method

.method public getPaceMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 281
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->paceMap:Ljava/util/Map;

    return-object v0
.end method

.method public getPartTimeMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;"
        }
    .end annotation

    .line 321
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->partTimeMap:Ljava/util/Map;

    return-object v0
.end method

.method public getPathImageUri()Ljava/lang/String;
    .locals 1

    .line 249
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->pathImageUri:Ljava/lang/String;

    return-object v0
.end method

.method public getRecordId()Ljava/lang/String;
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->recordId:Ljava/lang/String;

    return-object v0
.end method

.method public getRunState()Ljava/lang/Integer;
    .locals 1

    .line 273
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->runState:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSamplePoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;>;"
        }
    .end annotation

    .line 169
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->samplePoints:Ljava/util/List;

    return-object v0
.end method

.method public getSportDataSource()Ljava/lang/Integer;
    .locals 1

    .line 333
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->sportDataSource:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSportType()Ljava/lang/Integer;
    .locals 1

    .line 265
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->sportType:Ljava/lang/Integer;

    return-object v0
.end method

.method public getStartTime()Ljava/lang/Long;
    .locals 1

    .line 177
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->startTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->timeZone:Ljava/lang/String;

    return-object v0
.end method

.method public getTotalCalories()Ljava/lang/Integer;
    .locals 1

    .line 233
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->totalCalories:Ljava/lang/Integer;

    return-object v0
.end method

.method public getTotalDistance()Ljava/lang/Integer;
    .locals 1

    .line 225
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->totalDistance:Ljava/lang/Integer;

    return-object v0
.end method

.method public getTotalSteps()Ljava/lang/Integer;
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->totalSteps:Ljava/lang/Integer;

    return-object v0
.end method

.method public getTotalTime()Ljava/lang/Long;
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->totalTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getVendor()Ljava/lang/String;
    .locals 1

    .line 289
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->vendor:Ljava/lang/String;

    return-object v0
.end method

.method public getVersion()Ljava/lang/Long;
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->version:Ljava/lang/Long;

    return-object v0
.end method

.method public setAbnormalTrack(Ljava/lang/Integer;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->abnormalTrack:Ljava/lang/Integer;

    .line 158
    return-void
.end method

.method public setAttribute(Ljava/lang/String;)V
    .locals 0

    .line 309
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->attribute:Ljava/lang/String;

    .line 310
    return-void
.end method

.method public setCoordinate(Ljava/lang/String;)V
    .locals 0

    .line 301
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->coordinate:Ljava/lang/String;

    .line 302
    return-void
.end method

.method public setDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->deviceCode:Ljava/lang/Long;

    .line 198
    return-void
.end method

.method public setDuplicateTrack(Ljava/lang/Integer;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->duplicateTrack:Ljava/lang/Integer;

    .line 150
    return-void
.end method

.method public setEndTime(Ljava/lang/Long;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->endTime:Ljava/lang/Long;

    .line 190
    return-void
.end method

.method public setHeartRateList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;>;)V"
        }
    .end annotation

    .line 261
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->heartRateList:Ljava/util/List;

    .line 262
    return-void
.end method

.method public setLocation(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/Location;>;)V"
        }
    .end annotation

    .line 317
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->location:Ljava/util/List;

    .line 318
    return-void
.end method

.method public setPaceMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 285
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->paceMap:Ljava/util/Map;

    .line 286
    return-void
.end method

.method public setPartTimeMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;)V"
        }
    .end annotation

    .line 325
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->partTimeMap:Ljava/util/Map;

    .line 326
    return-void
.end method

.method public setPathImageUri(Ljava/lang/String;)V
    .locals 0

    .line 253
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->pathImageUri:Ljava/lang/String;

    .line 254
    return-void
.end method

.method public setRecordId(Ljava/lang/String;)V
    .locals 0

    .line 205
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->recordId:Ljava/lang/String;

    .line 206
    return-void
.end method

.method public setRunState(Ljava/lang/Integer;)V
    .locals 0

    .line 277
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->runState:Ljava/lang/Integer;

    .line 278
    return-void
.end method

.method public setSamplePoints(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;>;)V"
        }
    .end annotation

    .line 173
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->samplePoints:Ljava/util/List;

    .line 174
    return-void
.end method

.method public setSportDataSource(I)V
    .locals 1

    .line 329
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->sportDataSource:Ljava/lang/Integer;

    .line 330
    return-void
.end method

.method public setSportType(Ljava/lang/Integer;)V
    .locals 0

    .line 269
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->sportType:Ljava/lang/Integer;

    .line 270
    return-void
.end method

.method public setStartTime(Ljava/lang/Long;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->startTime:Ljava/lang/Long;

    .line 182
    return-void
.end method

.method public setTimeZone(Ljava/lang/String;)V
    .locals 0

    .line 213
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->timeZone:Ljava/lang/String;

    .line 214
    return-void
.end method

.method public setTotalCalories(Ljava/lang/Integer;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->totalCalories:Ljava/lang/Integer;

    .line 238
    return-void
.end method

.method public setTotalDistance(Ljava/lang/Integer;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->totalDistance:Ljava/lang/Integer;

    .line 230
    return-void
.end method

.method public setTotalSteps(Ljava/lang/Integer;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->totalSteps:Ljava/lang/Integer;

    .line 222
    return-void
.end method

.method public setTotalTime(Ljava/lang/Long;)V
    .locals 0

    .line 245
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->totalTime:Ljava/lang/Long;

    .line 246
    return-void
.end method

.method public setVendor(Ljava/lang/String;)V
    .locals 0

    .line 293
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->vendor:Ljava/lang/String;

    .line 294
    return-void
.end method

.method public setVersion(Ljava/lang/Long;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->version:Ljava/lang/Long;

    .line 166
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 338
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MotionPathDetail ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "startTime="

    .line 339
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->startTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime="

    .line 340
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->endTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceCode="

    .line 341
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->deviceCode:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", recordId="

    .line 342
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->recordId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timeZone="

    .line 343
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->timeZone:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totalSteps="

    .line 344
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->totalSteps:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totalDistance="

    .line 345
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->totalDistance:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totalCalories="

    .line 346
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->totalCalories:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totalTime="

    .line 347
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->totalTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", pathImageUri="

    .line 348
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->pathImageUri:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", heartRateList="

    .line 349
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->heartRateList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sportType="

    .line 350
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->sportType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", runState="

    .line 351
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->runState:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", paceMap="

    .line 352
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->paceMap:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", vendor="

    .line 353
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->vendor:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", coordinate="

    .line 354
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->coordinate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", attribute="

    .line 355
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->attribute:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", location="

    .line 356
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->location:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", partTimeMap="

    .line 357
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->partTimeMap:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", version="

    .line 358
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->version:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", abnormalTrack="

    .line 359
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->abnormalTrack:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    .line 360
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 338
    return-object v0
.end method
