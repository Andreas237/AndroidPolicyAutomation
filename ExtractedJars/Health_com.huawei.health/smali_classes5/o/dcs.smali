.class public Lo/dcs;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static e:Lo/dcs;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 20
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 21
    new-instance v0, Lo/dcw;

    invoke-direct {v0}, Lo/dcw;-><init>()V

    .line 22
    invoke-virtual {v0, p0}, Lo/dcw;->c(Lo/dcs;)V

    .line 25
    return-void
.end method

.method public static declared-synchronized e()Lo/dcs;
    .locals 6

    const-class v4, Lo/dcs;

    monitor-enter v4

    .line 28
    const-string v0, "MigrateDBManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance() context"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    sget-object v0, Lo/dcs;->e:Lo/dcs;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 30
    new-instance v0, Lo/dcs;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dcs;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dcs;->e:Lo/dcs;

    .line 32
    :cond_0
    sget-object v0, Lo/dcs;->e:Lo/dcs;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 64
    new-instance v1, Lo/dcw;

    invoke-direct {v1}, Lo/dcw;-><init>()V

    .line 65
    invoke-virtual {v1, p0, p1, p2}, Lo/dcw;->c(Lo/dcs;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 74
    new-instance v1, Lo/dcw;

    invoke-direct {v1}, Lo/dcw;-><init>()V

    .line 75
    invoke-virtual {v1, p0, p1, p2}, Lo/dcw;->d(Lo/dcs;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public b(Lo/dcu;)J
    .locals 3

    .line 37
    new-instance v2, Lo/dcw;

    invoke-direct {v2}, Lo/dcw;-><init>()V

    .line 38
    invoke-virtual {p1}, Lo/dcu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lo/dcu;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, p0, v0, v1}, Lo/dcw;->g(Lo/dcs;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    const-wide/16 v0, 0x0

    return-wide v0

    .line 41
    :cond_0
    invoke-virtual {v2, p0, p1}, Lo/dcw;->c(Lo/dcs;Lo/dcu;)J

    move-result-wide v0

    return-wide v0
.end method

.method public c()I
    .locals 2

    .line 46
    new-instance v1, Lo/dcw;

    invoke-direct {v1}, Lo/dcw;-><init>()V

    .line 47
    invoke-virtual {v1, p0}, Lo/dcw;->d(Lo/dcs;)I

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 79
    new-instance v1, Lo/dcw;

    invoke-direct {v1}, Lo/dcw;-><init>()V

    .line 80
    invoke-virtual {v1, p0, p1, p2}, Lo/dcw;->a(Lo/dcs;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 69
    new-instance v1, Lo/dcw;

    invoke-direct {v1}, Lo/dcw;-><init>()V

    .line 70
    invoke-virtual {v1, p0, p1, p2}, Lo/dcw;->b(Lo/dcs;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 59
    new-instance v1, Lo/dcw;

    invoke-direct {v1}, Lo/dcw;-><init>()V

    .line 60
    invoke-virtual {v1, p0, p1, p2}, Lo/dcw;->e(Lo/dcs;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Lo/dcu;>;"
        }
    .end annotation

    .line 55
    new-instance v1, Lo/dcw;

    invoke-direct {v1}, Lo/dcw;-><init>()V

    .line 56
    invoke-virtual {v1, p0, p1}, Lo/dcw;->a(Lo/dcs;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 85
    const/16 v0, 0x4e28

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
