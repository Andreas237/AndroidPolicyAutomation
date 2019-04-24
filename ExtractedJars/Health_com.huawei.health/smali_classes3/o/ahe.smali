.class public Lo/ahe;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lo/ahe;


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ahe;->b:Ljava/util/List;

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ahe;->c:Ljava/util/List;

    .line 43
    iget-object v0, p0, Lo/ahe;->b:Ljava/util/List;

    const-string v1, "BODY_WEIGHT"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    iget-object v0, p0, Lo/ahe;->b:Ljava/util/List;

    const-string v1, "BODYFAT_RATE"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    iget-object v0, p0, Lo/ahe;->c:Ljava/util/List;

    const-string v1, "BLOODPRESSURE_SYSTOLIC"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    iget-object v0, p0, Lo/ahe;->c:Ljava/util/List;

    const-string v1, "BLOODPRESSURE_DIASTOLIC"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    return-void
.end method

.method public static b()Lo/ahe;
    .locals 1

    .line 37
    sget-object v0, Lo/ahe;->e:Lo/ahe;

    if-nez v0, :cond_0

    .line 38
    new-instance v0, Lo/ahe;

    invoke-direct {v0}, Lo/ahe;-><init>()V

    sput-object v0, Lo/ahe;->e:Lo/ahe;

    .line 40
    :cond_0
    sget-object v0, Lo/ahe;->e:Lo/ahe;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/huawei/hihealth/device/open/data/MeasureResult;)Lo/afz;
    .locals 9

    .line 51
    invoke-interface {p1}, Lcom/huawei/hihealth/device/open/data/MeasureResult;->getRecords()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/device/open/data/MeasureRecord;

    .line 52
    invoke-interface {v4}, Lcom/huawei/hihealth/device/open/data/MeasureRecord;->getDataTypes()Ljava/util/ArrayList;

    move-result-object v5

    .line 53
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 54
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 55
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "convertData:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    goto :goto_0

    .line 59
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_8

    .line 60
    iget-object v0, p0, Lo/ahe;->b:Ljava/util/List;

    invoke-interface {v5, v0}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/ahe;->b:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 61
    new-instance v6, Lo/agg;

    invoke-direct {v6}, Lo/agg;-><init>()V

    .line 62
    iget-object v0, p0, Lo/ahe;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v4, v0}, Lcom/huawei/hihealth/device/open/data/MeasureRecord;->getValue(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {v6, v0}, Lo/agg;->e(F)V

    .line 63
    iget-object v0, p0, Lo/ahe;->b:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v4, v0}, Lcom/huawei/hihealth/device/open/data/MeasureRecord;->getValue(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {v6, v0}, Lo/agg;->b(F)V

    .line 64
    invoke-interface {v4}, Lcom/huawei/hihealth/device/open/data/MeasureRecord;->getMeasureTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/agg;->e(J)V

    .line 65
    invoke-interface {v4}, Lcom/huawei/hihealth/device/open/data/MeasureRecord;->getMeasureTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/agg;->d(J)V

    .line 66
    return-object v6

    .line 67
    :cond_1
    iget-object v0, p0, Lo/ahe;->c:Ljava/util/List;

    invoke-interface {v5, v0}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/ahe;->c:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 68
    new-instance v6, Lo/age;

    invoke-direct {v6}, Lo/age;-><init>()V

    .line 69
    iget-object v0, p0, Lo/ahe;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v4, v0}, Lcom/huawei/hihealth/device/open/data/MeasureRecord;->getValue(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-int v0, v0

    int-to-short v0, v0

    invoke-virtual {v6, v0}, Lo/age;->c(S)V

    .line 70
    iget-object v0, p0, Lo/ahe;->c:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v4, v0}, Lcom/huawei/hihealth/device/open/data/MeasureRecord;->getValue(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-int v0, v0

    int-to-short v0, v0

    invoke-virtual {v6, v0}, Lo/age;->a(S)V

    .line 71
    invoke-interface {v4}, Lcom/huawei/hihealth/device/open/data/MeasureRecord;->getMeasureTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/age;->e(J)V

    .line 72
    invoke-interface {v4}, Lcom/huawei/hihealth/device/open/data/MeasureRecord;->getMeasureTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/age;->d(J)V

    .line 73
    return-object v6

    .line 74
    :cond_2
    const-string v0, "HEART_RATE"

    invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "RRI_SQI_RESULT"

    .line 75
    invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "ACC_RESULT"

    .line 76
    invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "VOICE_PROMPTS_RESULT"

    .line 77
    invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 78
    :cond_3
    new-instance v6, Lo/aga;

    invoke-direct {v6}, Lo/aga;-><init>()V

    .line 80
    const-string v0, "HEART_RATE"

    invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 81
    const-string v0, "HEART_RATE"

    invoke-interface {v4, v0}, Lcom/huawei/hihealth/device/open/data/MeasureRecord;->getValue(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/aga;->e(Ljava/lang/Integer;)V

    goto :goto_1

    .line 83
    :cond_4
    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/aga;->e(Ljava/lang/Integer;)V

    .line 85
    :goto_1
    return-object v6

    .line 86
    :cond_5
    const-string v0, "SEQUENCE_NUMBER"

    invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 87
    const/4 v6, 0x0

    .line 88
    const/4 v7, 0x0

    :goto_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_7

    .line 89
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "BLOOD_SUGAR"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 90
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v4, v0}, Lcom/huawei/hihealth/device/open/data/MeasureRecord;->getValue(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v6

    .line 91
    goto :goto_3

    .line 88
    :cond_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 94
    :cond_7
    :goto_3
    const-string v0, "SEQUENCE_NUMBER"

    invoke-interface {v4, v0}, Lcom/huawei/hihealth/device/open/data/MeasureRecord;->getValue(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v7

    .line 95
    new-instance v8, Lo/afy;

    invoke-direct {v8}, Lo/afy;-><init>()V

    .line 96
    invoke-virtual {v8, v6}, Lo/afy;->b(F)V

    .line 97
    invoke-interface {v4}, Lcom/huawei/hihealth/device/open/data/MeasureRecord;->getMeasureTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/afy;->e(J)V

    .line 98
    invoke-interface {v4}, Lcom/huawei/hihealth/device/open/data/MeasureRecord;->getMeasureTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/afy;->d(J)V

    .line 99
    invoke-virtual {v8, v7}, Lo/afy;->c(I)V

    .line 100
    return-object v8

    .line 103
    :cond_8
    const/4 v0, 0x0

    return-object v0
.end method
