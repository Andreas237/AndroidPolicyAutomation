.class public Lcom/huawei/hwcloudmodel/model/unite/StressBasic;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private lastScore:Ljava/lang/Integer;

.field private maxScore:Ljava/lang/Integer;

.field private meanScore:Ljava/lang/Integer;

.field private measureCount:Ljava/lang/Integer;

.field private minScore:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configLastScore(Ljava/lang/Integer;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->lastScore:Ljava/lang/Integer;

    .line 53
    return-void
.end method

.method public configMaxScore(Ljava/lang/Integer;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->maxScore:Ljava/lang/Integer;

    .line 29
    return-void
.end method

.method public configMeanScore(Ljava/lang/Integer;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->meanScore:Ljava/lang/Integer;

    .line 45
    return-void
.end method

.method public configMeasureCount(Ljava/lang/Integer;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->measureCount:Ljava/lang/Integer;

    .line 21
    return-void
.end method

.method public configMinScore(Ljava/lang/Integer;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->minScore:Ljava/lang/Integer;

    .line 37
    return-void
.end method

.method public fetchLastScore()Ljava/lang/Integer;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->lastScore:Ljava/lang/Integer;

    return-object v0
.end method

.method public fetchMaxScore()Ljava/lang/Integer;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->maxScore:Ljava/lang/Integer;

    return-object v0
.end method

.method public fetchMeanScore()Ljava/lang/Integer;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->meanScore:Ljava/lang/Integer;

    return-object v0
.end method

.method public fetchMeasureCount()Ljava/lang/Integer;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->measureCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public fetchMinScore()Ljava/lang/Integer;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/StressBasic;->minScore:Ljava/lang/Integer;

    return-object v0
.end method
