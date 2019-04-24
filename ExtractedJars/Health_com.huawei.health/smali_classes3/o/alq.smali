.class public Lo/alq;
.super Lo/amg;
.source "SourceFile"


# static fields
.field private static b:Lo/alq;


# instance fields
.field private e:D

.field private k:Lo/ana;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const/4 v0, 0x0

    sput-object v0, Lo/alq;->b:Lo/alq;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 46
    invoke-direct {p0, p1}, Lo/amg;-><init>(Landroid/content/Context;)V

    .line 41
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/alq;->e:D

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alq;->k:Lo/ana;

    .line 50
    const-string v0, "Step_DistanceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init DistanceManager context="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    invoke-static {}, Lo/ana;->c()Lo/ana;

    move-result-object v0

    iput-object v0, p0, Lo/alq;->k:Lo/ana;

    .line 62
    return-void
.end method

.method private b(I)I
    .locals 7

    .line 110
    iget-object v0, p0, Lo/alq;->k:Lo/ana;

    invoke-virtual {v0}, Lo/ana;->e()F

    move-result v0

    invoke-static {p1, v0}, Lo/cbf;->d(IF)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double v4, v0, v2

    .line 111
    iget-wide v0, p0, Lo/alq;->e:D

    add-double/2addr v0, v4

    double-to-int v6, v0

    .line 112
    const-string v0, "Step_DistanceManager"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "computeDistanceStatic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " stepDistance="

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 113
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " mDistanceDiffStand="

    const/4 v3, 0x3

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/alq;->e:D

    .line 114
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " distanceStatic="

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 115
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 112
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    return v6
.end method

.method public static e(Landroid/content/Context;)Lo/alq;
    .locals 3

    .line 25
    const-class v1, Lo/alq;

    monitor-enter v1

    .line 26
    :try_start_0
    sget-object v0, Lo/alq;->b:Lo/alq;

    if-nez v0, :cond_0

    .line 27
    new-instance v0, Lo/alq;

    invoke-direct {v0, p0}, Lo/alq;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/alq;->b:Lo/alq;

    .line 29
    :cond_0
    sget-object v0, Lo/alq;->b:Lo/alq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 30
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a(JII)V
    .locals 5

    .line 173
    invoke-virtual {p0, p1, p2, p3}, Lo/alq;->c(JI)I

    move-result v4

    .line 175
    if-le p4, v4, :cond_0

    .line 177
    iget-wide v0, p0, Lo/alq;->e:D

    sub-int v2, p4, v4

    int-to-double v2, v2

    add-double/2addr v0, v2

    iput-wide v0, p0, Lo/alq;->e:D

    .line 178
    const-string v0, "Step_DistanceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDiffDistanceToFile total db mDistanceDiffStand "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/alq;->e:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    :cond_0
    return-void
.end method

.method public c(JI)I
    .locals 5

    .line 79
    invoke-direct {p0, p3}, Lo/alq;->b(I)I

    move-result v4

    .line 80
    const-string v0, "Step_DistanceManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tm : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " acquireDistance "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    return v4
.end method

.method public c()V
    .locals 2

    .line 219
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/alq;->e:D

    .line 235
    return-void
.end method
