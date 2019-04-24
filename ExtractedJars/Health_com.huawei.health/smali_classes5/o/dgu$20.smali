.class Lo/dgu$20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgu;->F()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dgu;


# direct methods
.method constructor <init>(Lo/dgu;)V
    .locals 0

    .line 2051
    iput-object p1, p0, Lo/dgu$20;->e:Lo/dgu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 2055
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 2056
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "average rest heart rate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2057
    const/4 v4, 0x0

    .line 2058
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 2059
    int-to-float v0, v4

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    const-string v2, "restHeartRate"

    invoke-virtual {v1, v2}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v1

    add-float/2addr v0, v1

    float-to-int v4, v0

    .line 2058
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 2061
    :cond_0
    int-to-float v0, v4

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 2062
    iget-object v0, p0, Lo/dgu$20;->e:Lo/dgu;

    invoke-static {v0}, Lo/dgu;->e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setRestHeartRateDefault(I)V

    .line 2063
    goto :goto_1

    .line 2064
    :cond_1
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "there is no average rest heart rate!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2065
    iget-object v0, p0, Lo/dgu$20;->e:Lo/dgu;

    invoke-static {v0}, Lo/dgu;->e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v0

    const/16 v1, 0x3c

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setRestHeartRateDefault(I)V

    .line 2067
    :goto_1
    iget-object v0, p0, Lo/dgu$20;->e:Lo/dgu;

    invoke-static {v0}, Lo/dgu;->c(Lo/dgu;)V

    .line 2068
    return-void
.end method
