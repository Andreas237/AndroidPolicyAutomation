.class public Lo/exu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static i:Lo/exu;


# instance fields
.field private a:I

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;>;"
        }
    .end annotation
.end field

.field private c:Lo/exo;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;>;"
        }
    .end annotation
.end field

.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    const/4 v0, 0x0

    sput-object v0, Lo/exu;->i:Lo/exu;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/exu;->c:Lo/exo;

    .line 30
    const/4 v0, 0x0

    iput v0, p0, Lo/exu;->a:I

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/exu;->d:Ljava/util/List;

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/exu;->b:Ljava/util/List;

    .line 38
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/exu;->e:Landroid/content/Context;

    .line 39
    iget-object v0, p0, Lo/exu;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/exo;->d(Landroid/content/Context;)Lo/exo;

    move-result-object v0

    iput-object v0, p0, Lo/exu;->c:Lo/exo;

    .line 40
    return-void
.end method

.method public static e(Landroid/content/Context;)Lo/exu;
    .locals 2

    .line 43
    sget-object v0, Lo/exu;->i:Lo/exu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 44
    new-instance v0, Lo/exu;

    invoke-direct {v0, p0}, Lo/exu;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/exu;->i:Lo/exu;

    .line 46
    :cond_0
    sget-object v0, Lo/exu;->i:Lo/exu;

    return-object v0
.end method


# virtual methods
.method public a(Lo/egg;)V
    .locals 4

    .line 144
    iget-object v0, p0, Lo/exu;->c:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 145
    const-string v0, "FitnessThirdPartyDataInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestGoogleFitPonitDatas "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-object v0, p0, Lo/exu;->c:Lo/exo;

    new-instance v1, Lo/exu$3;

    invoke-direct {v1, p0, p1}, Lo/exu$3;-><init>(Lo/exu;Lo/egg;)V

    invoke-virtual {v0, v1}, Lo/exo;->b(Lo/egg;)V

    .line 154
    :cond_0
    return-void
.end method

.method public b(Ljava/util/Date;Lo/egg;)V
    .locals 8

    .line 119
    const-string v0, "FitnessThirdPartyDataInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestMyfitnessPalDatas nowDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v6

    .line 122
    const-string v0, "FitnessThirdPartyDataInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestMyfitnessPalDatas startMyftTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lo/exu;->c:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 125
    const-string v0, "FitnessThirdPartyDataInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestMyfitnessPalDatas FITNESS_TYPE_MYFIT_WALK_DETAIL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    iget-object v0, p0, Lo/exu;->c:Lo/exo;

    move-wide v1, v6

    sget-object v4, Lo/exn$d;->k:Lo/exn$d;

    new-instance v5, Lo/exu$1;

    invoke-direct {v5, p0, p2}, Lo/exu$1;-><init>(Lo/exu;Lo/egg;)V

    const/16 v3, 0xdd

    invoke-virtual/range {v0 .. v5}, Lo/exo;->e(JILo/exn$d;Lo/egg;)V

    .line 137
    :cond_0
    return-void
.end method

.method public d(Lo/egg;)V
    .locals 4

    .line 162
    iget-object v0, p0, Lo/exu;->c:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 163
    const-string v0, "FitnessThirdPartyDataInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestGoogleFitSegentDatas"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    iget-object v0, p0, Lo/exu;->c:Lo/exo;

    new-instance v1, Lo/exu$5;

    invoke-direct {v1, p0, p1}, Lo/exu$5;-><init>(Lo/exu;Lo/egg;)V

    invoke-virtual {v0, v1}, Lo/exo;->c(Lo/egg;)V

    .line 172
    :cond_0
    return-void
.end method
