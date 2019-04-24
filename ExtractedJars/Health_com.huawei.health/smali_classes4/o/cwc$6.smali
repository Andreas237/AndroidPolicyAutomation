.class Lo/cwc$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cwc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cwc;


# direct methods
.method constructor <init>(Lo/cwc;)V
    .locals 0

    .line 480
    iput-object p1, p0, Lo/cwc$6;->d:Lo/cwc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChange(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
    .locals 7

    .line 492
    if-nez p4, :cond_0

    .line 493
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onChange HiHealthData is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 494
    return-void

    .line 496
    :cond_0
    invoke-virtual {p4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v4

    .line 497
    invoke-virtual {p4}, Lcom/huawei/hihealth/HiHealthData;->getIntValue()I

    move-result v6

    .line 498
    const-string v0, "TRACKTrack_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "time: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; heartrate:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 499
    iget-object v0, p0, Lo/cwc$6;->d:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->h(Lo/cwc;)Lo/cer;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 500
    iget-object v0, p0, Lo/cwc$6;->d:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->h(Lo/cwc;)Lo/cer;

    move-result-object v0

    invoke-interface {v0, v6, v4, v5}, Lo/cer;->c(IJ)V

    .line 503
    :cond_1
    return-void
.end method

.method public onResult(Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 484
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 485
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerHeartRateListener success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 486
    iget-object v0, p0, Lo/cwc$6;->d:Lo/cwc;

    invoke-static {v0, p1}, Lo/cwc;->b(Lo/cwc;Ljava/util/List;)Ljava/util/List;

    .line 488
    :cond_0
    return-void
.end method
