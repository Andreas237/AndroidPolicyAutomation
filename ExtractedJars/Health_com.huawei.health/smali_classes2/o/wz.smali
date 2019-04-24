.class public Lo/wz;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lo/wz;


# instance fields
.field private c:Ljava/util/concurrent/ExecutorService;


# direct methods
.method private constructor <init>()V
    .locals 4

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const-string v0, "SocialMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SocialMgrStorage Constructor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    return-void
.end method

.method public static d()Lo/wz;
    .locals 4

    .line 18
    const-string v0, "SocialMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance() context"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    sget-object v0, Lo/wz;->e:Lo/wz;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 20
    new-instance v0, Lo/wz;

    invoke-direct {v0}, Lo/wz;-><init>()V

    sput-object v0, Lo/wz;->e:Lo/wz;

    .line 22
    :cond_0
    sget-object v0, Lo/wz;->e:Lo/wz;

    return-object v0
.end method


# virtual methods
.method public a(Lo/wr;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/wr;)Ljava/util/ArrayList<Lcom/huawei/bone/social/manager/db/AssistentTable;>;"
        }
    .end annotation

    .line 61
    new-instance v0, Lo/wt;

    invoke-direct {v0}, Lo/wt;-><init>()V

    .line 62
    invoke-virtual {v0, p1}, Lo/wt;->c(Lo/wr;)Ljava/util/ArrayList;

    move-result-object v1

    .line 63
    return-object v1
.end method

.method public e(Lo/wr;)V
    .locals 2

    .line 35
    iget-object v0, p0, Lo/wz;->c:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    .line 36
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/wz;->c:Ljava/util/concurrent/ExecutorService;

    .line 38
    :cond_0
    iget-object v0, p0, Lo/wz;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/wz$3;

    invoke-direct {v1, p0, p1}, Lo/wz$3;-><init>(Lo/wz;Lo/wr;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 58
    return-void
.end method
