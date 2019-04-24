.class public Lcom/huawei/datatype/MotionPath;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final BRITISH_PACEMAP_TAG:Ljava/lang/String; = "tp=b-p-m"

.field public static final HEARTRATElIST_TAG:Ljava/lang/String; = "tp=h-r"

.field public static final INTERVAL_BRITISH_PACEMAP_TAG:Ljava/lang/String; = "tp=pm-b"

.field public static final INTERVAL_NORMAL_PACEMAP_TAG:Ljava/lang/String; = "tp=pm-n"

.field public static final LBSDATAMAP_TAG:Ljava/lang/String; = "tp=lbs"

.field public static final PACEMAP_TAG:Ljava/lang/String; = "tp=p-m"

.field public static final RUNNING_POSTURE_TAG:Ljava/lang/String; = "tp=rp"

.field public static final STEPRATElIST_TAG:Ljava/lang/String; = "tp=s-r"

.field public static final TRACKALTITUDE_TAG:Ljava/lang/String; = "tp=alti"

.field public static final TRACKPULLFREQDATA_TAG:Ljava/lang/String; = "tp=p-f"

.field public static final TRACKSPEEDDATA_TAG:Ljava/lang/String; = "tp=rs"

.field public static final TRACKSWOLFDATA_TAG:Ljava/lang/String; = "tp=swf"

.field public static final VERSION:Ljava/lang/String; = "version=1001"

.field private static final serialVersionUID:J = -0x189d130e1a20536dL


# instance fields
.field private altitudeList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/datatype/TrackAltitudeData;>;"
        }
    .end annotation
.end field

.field private britishIntervalPaceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private britishPaceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private heartRateList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/datatype/HeartRateData;>;"
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

.field private mPullFreqList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/datatype/TrackPullFreqData;>;"
        }
    .end annotation
.end field

.field private mSpeedList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/datatype/TrackSpeedData;>;"
        }
    .end annotation
.end field

.field private mSwolfList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/datatype/TrackSwolfData;>;"
        }
    .end annotation
.end field

.field private normalIntervalPaceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
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

.field private runningPostureList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/cvv;>;"
        }
    .end annotation
.end field

.field private stepRateList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/datatype/StepRateData;>;"
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

.method private runningPostureListToStr(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 325
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 326
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->runningPostureList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 327
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->runningPostureList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 328
    const-string v0, "tp=rp"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->runningPostureList:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cvv;

    invoke-virtual {v1}, Lo/cvv;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "gct="

    .line 329
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->runningPostureList:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cvv;

    invoke-virtual {v1}, Lo/cvv;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "gia="

    .line 330
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->runningPostureList:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cvv;

    invoke-virtual {v1}, Lo/cvv;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "sa="

    .line 331
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->runningPostureList:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cvv;

    invoke-virtual {v1}, Lo/cvv;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "ee="

    .line 332
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->runningPostureList:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cvv;

    invoke-virtual {v1}, Lo/cvv;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "fsp="

    .line 333
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->runningPostureList:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cvv;

    invoke-virtual {v1}, Lo/cvv;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "wsp="

    .line 334
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->runningPostureList:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cvv;

    invoke-virtual {v1}, Lo/cvv;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "hsp="

    .line 335
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->runningPostureList:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cvv;

    invoke-virtual {v1}, Lo/cvv;->i()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    .line 336
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 337
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 338
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 327
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 341
    :cond_0
    return-void
.end method


# virtual methods
.method public getAltitudeList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/datatype/TrackAltitudeData;>;"
        }
    .end annotation

    .line 173
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->altitudeList:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public getBritishIntervalPaceMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 157
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->britishIntervalPaceMap:Ljava/util/Map;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public getBritishPaceMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 120
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->britishPaceMap:Ljava/util/Map;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public getHeartRateList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/datatype/HeartRateData;>;"
        }
    .end annotation

    .line 130
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->heartRateList:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public getLbsDataMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Long;[D>;"
        }
    .end annotation

    .line 96
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->lbsDataMap:Ljava/util/Map;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public getNormalIntervalPaceMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 149
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->normalIntervalPaceMap:Ljava/util/Map;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public getPaceMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 110
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->paceMap:Ljava/util/Map;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public getPullFreqList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/datatype/TrackPullFreqData;>;"
        }
    .end annotation

    .line 197
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->mPullFreqList:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public getSpeedList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/datatype/TrackSpeedData;>;"
        }
    .end annotation

    .line 165
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->mSpeedList:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public getStepRateList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/datatype/StepRateData;>;"
        }
    .end annotation

    .line 140
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->stepRateList:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public getSwolfList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/datatype/TrackSwolfData;>;"
        }
    .end annotation

    .line 181
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->mSwolfList:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public localePaceMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 409
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 410
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->britishPaceMap:Ljava/util/Map;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0

    .line 412
    :cond_0
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->paceMap:Ljava/util/Map;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public requestRunningPostureList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/cvv;>;"
        }
    .end annotation

    .line 189
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->runningPostureList:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public saveRunningPostureList(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/cvv;>;)V"
        }
    .end annotation

    .line 193
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/huawei/datatype/MotionPath;->runningPostureList:Ljava/util/ArrayList;

    .line 194
    return-void
.end method

.method public setAltitudeList(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/datatype/TrackAltitudeData;>;)V"
        }
    .end annotation

    .line 177
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/huawei/datatype/MotionPath;->altitudeList:Ljava/util/ArrayList;

    .line 178
    return-void
.end method

.method public setBritishIntervalPaceMap(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 161
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lcom/huawei/datatype/MotionPath;->britishIntervalPaceMap:Ljava/util/Map;

    .line 162
    return-void
.end method

.method public setBritishPaceMap(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 125
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lcom/huawei/datatype/MotionPath;->britishPaceMap:Ljava/util/Map;

    .line 126
    return-void
.end method

.method public setHeartRateList(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/datatype/HeartRateData;>;)V"
        }
    .end annotation

    .line 135
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/huawei/datatype/MotionPath;->heartRateList:Ljava/util/ArrayList;

    .line 136
    return-void
.end method

.method public setLbsDataMap(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Long;[D>;)V"
        }
    .end annotation

    .line 105
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lcom/huawei/datatype/MotionPath;->lbsDataMap:Ljava/util/Map;

    .line 106
    return-void
.end method

.method public setNormalIntervalPaceMap(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 153
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lcom/huawei/datatype/MotionPath;->normalIntervalPaceMap:Ljava/util/Map;

    .line 154
    return-void
.end method

.method public setPaceMap(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 115
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lcom/huawei/datatype/MotionPath;->paceMap:Ljava/util/Map;

    .line 116
    return-void
.end method

.method public setPullFreqList(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/datatype/TrackPullFreqData;>;)V"
        }
    .end annotation

    .line 201
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/huawei/datatype/MotionPath;->mPullFreqList:Ljava/util/ArrayList;

    .line 202
    return-void
.end method

.method public setSpeedList(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/datatype/TrackSpeedData;>;)V"
        }
    .end annotation

    .line 169
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/huawei/datatype/MotionPath;->mSpeedList:Ljava/util/ArrayList;

    .line 170
    return-void
.end method

.method public setStepRateList(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/datatype/StepRateData;>;)V"
        }
    .end annotation

    .line 145
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/huawei/datatype/MotionPath;->stepRateList:Ljava/util/ArrayList;

    .line 146
    return-void
.end method

.method public setSwolfList(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/datatype/TrackSwolfData;>;)V"
        }
    .end annotation

    .line 185
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/huawei/datatype/MotionPath;->mSwolfList:Ljava/util/ArrayList;

    .line 186
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 206
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 208
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 210
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 212
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->lbsDataMap:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 213
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->lbsDataMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 214
    const-string v0, "tp=lbs"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "lat="

    .line 215
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [D

    const/4 v2, 0x0

    aget-wide v1, v1, v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "lon="

    .line 216
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [D

    const/4 v2, 0x1

    aget-wide v1, v1, v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "alt="

    .line 217
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [D

    const/4 v2, 0x2

    aget-wide v1, v1, v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "t="

    .line 218
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [D

    const/4 v2, 0x3

    aget-wide v1, v1, v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 219
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 220
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 221
    goto/16 :goto_0

    .line 223
    :cond_0
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->paceMap:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 224
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->paceMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 225
    const-string v0, "tp=p-m"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "v="

    .line 226
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 227
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 229
    goto :goto_1

    .line 232
    :cond_1
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->britishPaceMap:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 233
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->britishPaceMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 234
    const-string v0, "tp=b-p-m"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "v="

    .line 235
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 236
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 238
    goto :goto_2

    .line 241
    :cond_2
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->heartRateList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 242
    const/4 v6, 0x0

    :goto_3
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->heartRateList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 243
    const-string v0, "tp=h-r"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->heartRateList:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/HeartRateData;

    invoke-virtual {v1}, Lcom/huawei/datatype/HeartRateData;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "v="

    .line 244
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->heartRateList:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/HeartRateData;

    invoke-virtual {v1}, Lcom/huawei/datatype/HeartRateData;->getHeartRate()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 245
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 242
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 250
    :cond_3
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->stepRateList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 251
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 252
    const/4 v6, 0x0

    :goto_4
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->stepRateList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_4

    .line 253
    const-string v0, "tp=s-r"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->stepRateList:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/StepRateData;

    invoke-virtual {v1}, Lcom/huawei/datatype/StepRateData;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "v="

    .line 254
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->stepRateList:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/StepRateData;

    invoke-virtual {v1}, Lcom/huawei/datatype/StepRateData;->getStepRate()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 255
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 252
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    .line 259
    :cond_4
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->normalIntervalPaceMap:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 260
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->normalIntervalPaceMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 261
    const-string v0, "tp=pm-n"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "v="

    .line 262
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 263
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 265
    goto :goto_5

    .line 268
    :cond_5
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->britishIntervalPaceMap:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 269
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->britishIntervalPaceMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 270
    const-string v0, "tp=pm-b"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "v="

    .line 271
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 272
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 274
    goto :goto_6

    .line 278
    :cond_6
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->altitudeList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 279
    const/4 v6, 0x0

    :goto_7
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->altitudeList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_7

    .line 280
    const-string v0, "tp=alti"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->altitudeList:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/TrackAltitudeData;

    invoke-virtual {v1}, Lcom/huawei/datatype/TrackAltitudeData;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "v="

    .line 281
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->altitudeList:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/TrackAltitudeData;

    invoke-virtual {v1}, Lcom/huawei/datatype/TrackAltitudeData;->getAltitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 282
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 279
    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    .line 288
    :cond_7
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->mSwolfList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 289
    const/4 v6, 0x0

    :goto_8
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->mSwolfList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_8

    .line 290
    const-string v0, "tp=swf"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->mSwolfList:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/TrackSwolfData;

    invoke-virtual {v1}, Lcom/huawei/datatype/TrackSwolfData;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "v="

    .line 291
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->mSwolfList:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/TrackSwolfData;

    invoke-virtual {v1}, Lcom/huawei/datatype/TrackSwolfData;->getSwolf()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 292
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 289
    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    .line 298
    :cond_8
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->mPullFreqList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 299
    const/4 v6, 0x0

    :goto_9
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->mPullFreqList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_9

    .line 300
    const-string v0, "tp=p-f"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->mPullFreqList:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/TrackPullFreqData;

    invoke-virtual {v1}, Lcom/huawei/datatype/TrackPullFreqData;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "v="

    .line 301
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->mPullFreqList:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/TrackPullFreqData;

    invoke-virtual {v1}, Lcom/huawei/datatype/TrackPullFreqData;->getPullFreq()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 302
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 303
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 299
    add-int/lit8 v6, v6, 0x1

    goto :goto_9

    .line 308
    :cond_9
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->mSpeedList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    .line 309
    const/4 v6, 0x0

    :goto_a
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->mSpeedList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_a

    .line 310
    const-string v0, "tp=rs"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->mSpeedList:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/TrackSpeedData;

    invoke-virtual {v1}, Lcom/huawei/datatype/TrackSpeedData;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "v="

    .line 311
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/MotionPath;->mSpeedList:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/TrackSpeedData;

    invoke-virtual {v1}, Lcom/huawei/datatype/TrackSpeedData;->getRTSpeed()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 312
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 309
    add-int/lit8 v6, v6, 0x1

    goto :goto_a

    .line 317
    :cond_a
    invoke-direct {p0, v3}, Lcom/huawei/datatype/MotionPath;->runningPostureListToStr(Ljava/util/ArrayList;)V

    .line 318
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 319
    invoke-virtual {v4, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 320
    goto :goto_b

    .line 321
    :cond_b
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public validBritishPaceMap()Z
    .locals 1

    .line 371
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->britishPaceMap:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 372
    const/4 v0, 0x0

    return v0

    .line 375
    :cond_0
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->britishPaceMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 376
    const/4 v0, 0x1

    return v0

    .line 379
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public validHeartRateList()Z
    .locals 1

    .line 345
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->heartRateList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 346
    const/4 v0, 0x0

    return v0

    .line 349
    :cond_0
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->heartRateList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 350
    const/4 v0, 0x1

    return v0

    .line 353
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public validLbsDataMap()Z
    .locals 1

    .line 384
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->lbsDataMap:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 385
    const/4 v0, 0x0

    return v0

    .line 388
    :cond_0
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->lbsDataMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 389
    const/4 v0, 0x1

    return v0

    .line 392
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public validPaceMap()Z
    .locals 1

    .line 358
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->paceMap:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 359
    const/4 v0, 0x0

    return v0

    .line 362
    :cond_0
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->paceMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 363
    const/4 v0, 0x1

    return v0

    .line 366
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public validRunningPostureList()Z
    .locals 1

    .line 417
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->runningPostureList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 418
    const/4 v0, 0x0

    return v0

    .line 421
    :cond_0
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->runningPostureList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 422
    const/4 v0, 0x1

    return v0

    .line 425
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public validStepRateList()Z
    .locals 1

    .line 397
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->stepRateList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 398
    const/4 v0, 0x0

    return v0

    .line 401
    :cond_0
    iget-object v0, p0, Lcom/huawei/datatype/MotionPath;->stepRateList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 402
    const/4 v0, 0x1

    return v0

    .line 405
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
