.class public Lo/fnq;
.super Lo/fnl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fnq$8;
    }
.end annotation


# static fields
.field private static final a:Lo/fty;


# instance fields
.field private final b:Lo/fpo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/fpo<Lo/fob;Lo/fnp;>;"
        }
    .end annotation
.end field

.field private final c:Lo/fpo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/fpo<Lo/fob;Lo/fns;>;"
        }
    .end annotation
.end field

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 137
    const-class v0, Lo/fnq;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fnq;->a:Lo/fty;

    return-void
.end method

.method public constructor <init>(Lo/fmw;)V
    .locals 6

    .line 177
    invoke-direct {p0}, Lo/fnl;-><init>()V

    .line 179
    const-string v0, "MAX_MESSAGE_SIZE"

    const/16 v1, 0x400

    invoke-virtual {p1, v0, v1}, Lo/fmw;->c(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/fnq;->e:I

    .line 180
    const-string v0, "PREFERRED_BLOCK_SIZE"

    const/16 v1, 0x200

    invoke-virtual {p1, v0, v1}, Lo/fmw;->c(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/fnq;->f:I

    .line 181
    iget v0, p0, Lo/fnq;->f:I

    invoke-static {v0}, Lo/fll;->d(I)I

    move-result v0

    iput v0, p0, Lo/fnq;->k:I

    .line 182
    const-string v0, "BLOCKWISE_STATUS_LIFETIME"

    const v1, 0x493e0

    invoke-virtual {p1, v0, v1}, Lo/fmw;->c(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/fnq;->g:I

    .line 184
    const-string v0, "MAX_RESOURCE_BODY_SIZE"

    const/16 v1, 0x2000

    invoke-virtual {p1, v0, v1}, Lo/fmw;->c(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/fnq;->h:I

    .line 186
    const-string v0, "MAX_ACTIVE_PEERS"

    const v1, 0x249f0

    invoke-virtual {p1, v0, v1}, Lo/fmw;->c(Ljava/lang/String;I)I

    move-result v5

    .line 188
    new-instance v0, Lo/fpo;

    iget v1, p0, Lo/fnq;->g:I

    div-int/lit16 v1, v1, 0x3e8

    int-to-long v1, v1

    invoke-direct {v0, v5, v1, v2}, Lo/fpo;-><init>(IJ)V

    iput-object v0, p0, Lo/fnq;->c:Lo/fpo;

    .line 189
    new-instance v0, Lo/fpo;

    iget v1, p0, Lo/fnq;->g:I

    div-int/lit16 v1, v1, 0x3e8

    int-to-long v1, v1

    invoke-direct {v0, v5, v1, v2}, Lo/fpo;-><init>(IJ)V

    iput-object v0, p0, Lo/fnq;->b:Lo/fpo;

    .line 191
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "BlockwiseLayer uses MAX_MESSAGE_SIZE={}, PREFERRED_BLOCK_SIZE={}, BLOCKWISE_STATUS_LIFETIME={} and MAX_RESOURCE_BODY_SIZE={}"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lo/fnq;->e:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lo/fnq;->f:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget v3, p0, Lo/fnq;->g:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    iget v3, p0, Lo/fnq;->h:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    return-void
.end method

.method private a(Lo/flq;Lo/fob;)Lo/fls;
    .locals 1

    .line 1124
    new-instance v0, Lo/fnq$3;

    invoke-direct {v0, p0, p2}, Lo/fnq$3;-><init>(Lo/fnq;Lo/fob;)V

    .line 1136
    invoke-virtual {p1, v0}, Lo/flq;->c(Lo/fls;)V

    .line 1137
    return-object v0
.end method

.method private a(Lo/fob;)Lo/fns;
    .locals 8

    .line 1038
    iget-object v5, p0, Lo/fnq;->c:Lo/fpo;

    monitor-enter v5

    .line 1039
    :try_start_0
    iget-object v0, p0, Lo/fnq;->c:Lo/fpo;

    invoke-virtual {v0, p1}, Lo/fpo;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fns;

    .line 1040
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "removing block1 tracker [{}], block1 transfers still in progress: {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    iget-object v3, p0, Lo/fnq;->c:Lo/fpo;

    invoke-virtual {v3}, Lo/fpo;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1042
    monitor-exit v5

    return-object v6

    .line 1043
    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7
.end method

.method private a(Lo/fmb;Lo/fly;Lo/fob;Lo/fns;)V
    .locals 9

    .line 737
    invoke-virtual {p2}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->j()Lo/fll;

    move-result-object v3

    .line 738
    invoke-virtual {p4}, Lo/fns;->k()I

    move-result v4

    .line 741
    invoke-virtual {v3}, Lo/fll;->d()I

    move-result v0

    if-ge v0, v4, :cond_0

    .line 742
    invoke-virtual {v3}, Lo/fll;->d()I

    move-result v5

    .line 743
    invoke-virtual {v3}, Lo/fll;->c()I

    move-result v6

    goto :goto_0

    .line 745
    :cond_0
    move v5, v4

    .line 746
    invoke-virtual {p4}, Lo/fns;->h()I

    move-result v6

    .line 748
    :goto_0
    invoke-virtual {p4}, Lo/fns;->b()I

    move-result v0

    div-int v1, v4, v5

    add-int v7, v0, v1

    .line 749
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "sending next Block1 num={}"

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 750
    invoke-virtual {p4, v7, v6}, Lo/fns;->b(II)Lo/fma;

    move-result-object v8

    .line 752
    invoke-virtual {p2}, Lo/fly;->k()Lo/flz;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/fma;->e(Lo/flz;)Lo/flq;

    .line 753
    invoke-virtual {p2}, Lo/fly;->r()Lo/fow;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/fma;->e(Lo/fow;)Lo/fma;

    .line 754
    invoke-direct {p0, v8, p3}, Lo/fnq;->a(Lo/flq;Lo/fob;)Lo/fls;

    .line 756
    invoke-virtual {p1, v8}, Lo/fmb;->e(Lo/fma;)V

    .line 757
    invoke-virtual {p0, p4, p3}, Lo/fnq;->c(Lo/fns;Lo/fob;)V

    .line 758
    invoke-virtual {p0}, Lo/fnq;->b()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, v8}, Lo/fod;->e(Lo/fmb;Lo/fma;)V

    .line 759
    return-void
.end method

.method private a(Lo/fmb;Lo/fly;Lo/fll;)Z
    .locals 6

    .line 1071
    invoke-virtual {p2}, Lo/fly;->g()I

    move-result v0

    iget v1, p0, Lo/fnq;->e:I

    if-le v0, v1, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 1072
    :goto_0
    if-eqz p3, :cond_3

    .line 1074
    if-nez v5, :cond_1

    invoke-virtual {p2}, Lo/fly;->g()I

    move-result v0

    invoke-virtual {p3}, Lo/fll;->d()I

    move-result v1

    if-le v0, v1, :cond_2

    :cond_1
    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    .line 1076
    :cond_3
    :goto_1
    if-eqz v5, :cond_4

    .line 1077
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "response body [{}/{}] requires blockwise transfer"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p2}, Lo/fly;->g()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lo/fnq;->e:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1080
    :cond_4
    return v5
.end method

.method private b(Ljava/lang/Runnable;)Ljava/util/concurrent/ScheduledFuture;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Runnable;)Ljava/util/concurrent/ScheduledFuture<*>;"
        }
    .end annotation

    .line 1188
    iget-object v0, p0, Lo/fnq;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1189
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "Endpoint is being destroyed: skipping block clean-up"

    invoke-interface {v0, v1}, Lo/fty;->e(Ljava/lang/String;)V

    .line 1190
    const/4 v0, 0x0

    return-object v0

    .line 1193
    :cond_0
    iget-object v0, p0, Lo/fnq;->d:Ljava/util/concurrent/ScheduledExecutorService;

    iget v1, p0, Lo/fnq;->g:I

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, p1, v1, v2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    return-object v0
.end method

.method private b(Lo/fob;)Lo/fnp;
    .locals 8

    .line 1047
    iget-object v5, p0, Lo/fnq;->b:Lo/fpo;

    monitor-enter v5

    .line 1048
    :try_start_0
    iget-object v0, p0, Lo/fnq;->b:Lo/fpo;

    invoke-virtual {v0, p1}, Lo/fpo;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fnp;

    .line 1049
    if-eqz v6, :cond_0

    .line 1050
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "removing block2 tracker [{}], block2 transfers still in progress: {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    iget-object v3, p0, Lo/fnq;->b:Lo/fpo;

    invoke-virtual {v3}, Lo/fpo;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1053
    :cond_0
    monitor-exit v5

    return-object v6

    .line 1054
    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7
.end method

.method private b(Lo/fob;Lo/fmb;Lo/fma;)Lo/fns;
    .locals 8

    .line 944
    iget-object v5, p0, Lo/fnq;->c:Lo/fpo;

    monitor-enter v5

    .line 945
    :try_start_0
    iget-object v0, p0, Lo/fnq;->c:Lo/fpo;

    invoke-virtual {v0, p1}, Lo/fpo;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fns;

    .line 946
    if-nez v6, :cond_0

    .line 947
    iget v0, p0, Lo/fnq;->f:I

    invoke-static {p2, p3, v0}, Lo/fns;->e(Lo/fmb;Lo/fma;I)Lo/fns;

    move-result-object v6

    .line 948
    iget-object v0, p0, Lo/fnq;->c:Lo/fpo;

    invoke-virtual {v0, p1, v6}, Lo/fpo;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 949
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "created tracker for outbound block1 transfer {}, transfers in progress: {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    iget-object v3, p0, Lo/fnq;->c:Lo/fpo;

    invoke-virtual {v3}, Lo/fpo;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 952
    :cond_0
    monitor-exit v5

    return-object v6

    .line 953
    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7
.end method

.method private b(Lo/fmb;Lo/fly;)V
    .locals 16

    .line 770
    invoke-virtual/range {p2 .. p2}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->I()Lo/fll;

    move-result-object v5

    .line 771
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-static {v0, v1}, Lo/fnq;->e(Lo/fmb;Lo/fly;)Lo/fob;

    move-result-object v6

    .line 773
    invoke-virtual/range {p1 .. p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 778
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lo/fnq;->b(Lo/fob;)Lo/fnp;

    .line 780
    invoke-virtual/range {p2 .. p2}, Lo/fly;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 784
    invoke-virtual/range {p0 .. p0}, Lo/fnq;->c()Lo/fod;

    move-result-object v0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-interface {v0, v1, v2}, Lo/fod;->d(Lo/fmb;Lo/fly;)V

    goto/16 :goto_2

    .line 787
    :cond_0
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lo/fnq;->e(Lo/fly;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 789
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "requested resource body exceeds max buffer size [{}], aborting request"

    move-object/from16 v2, p0

    iget v2, v2, Lo/fnq;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 790
    invoke-virtual/range {p1 .. p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->A()V

    goto/16 :goto_2

    .line 794
    :cond_1
    move-object/from16 v7, p1

    monitor-enter v7

    .line 796
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    :try_start_0
    invoke-direct {v0, v6, v1, v2}, Lo/fnq;->e(Lo/fob;Lo/fmb;Lo/fly;)Lo/fnp;

    move-result-object v8

    .line 798
    invoke-virtual {v5}, Lo/fll;->b()I

    move-result v0

    invoke-virtual {v8}, Lo/fnp;->b()I

    move-result v1

    if-ne v0, v1, :cond_a

    invoke-virtual {v5}, Lo/fll;->b()I

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p2 .. p2}, Lo/fly;->k()Lo/flz;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v1

    invoke-virtual {v1}, Lo/fma;->k()Lo/flz;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/flz;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 803
    :cond_2
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "processing incoming block2 response [num={}]: {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Lo/fll;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 805
    invoke-virtual {v8}, Lo/fnp;->n()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 808
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/fmb;->c(Lo/fly;)V

    .line 809
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lo/fnq;->b(Lo/fob;)Lo/fnp;

    .line 810
    invoke-virtual/range {p0 .. p0}, Lo/fnq;->c()Lo/fod;

    move-result-object v0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-interface {v0, v1, v2}, Lo/fod;->d(Lo/fmb;Lo/fly;)V

    goto/16 :goto_1

    .line 812
    :cond_3
    move-object/from16 v0, p2

    invoke-virtual {v8, v0}, Lo/fnp;->a(Lo/fly;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 814
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "cannot process payload of block2 response, aborting request"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 815
    invoke-virtual/range {p1 .. p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 816
    monitor-exit v7

    return-void

    .line 818
    :cond_4
    :try_start_1
    invoke-virtual {v5}, Lo/fll;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 820
    invoke-virtual {v8}, Lo/fnp;->k()I

    move-result v9

    .line 823
    invoke-virtual {v5}, Lo/fll;->c()I

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fnq;->k:I

    if-le v0, v1, :cond_5

    .line 824
    move-object/from16 v0, p0

    iget v10, v0, Lo/fnq;->f:I

    .line 825
    move-object/from16 v0, p0

    iget v11, v0, Lo/fnq;->k:I

    goto :goto_0

    .line 827
    :cond_5
    move v10, v9

    .line 828
    invoke-virtual {v8}, Lo/fnp;->h()I

    move-result v11

    .line 830
    :goto_0
    invoke-virtual {v8}, Lo/fnp;->b()I

    move-result v0

    div-int v1, v9, v10

    add-int v12, v0, v1

    .line 832
    invoke-virtual/range {p1 .. p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v13

    .line 834
    new-instance v14, Lo/fma;

    invoke-virtual {v13}, Lo/fma;->E()Lo/flj$d;

    move-result-object v0

    invoke-direct {v14, v0}, Lo/fma;-><init>(Lo/flj$d;)V

    .line 836
    invoke-virtual {v13}, Lo/fma;->b()Lo/flj$e;

    move-result-object v0

    invoke-virtual {v14, v0}, Lo/fma;->d(Lo/flj$e;)Lo/flq;

    .line 837
    invoke-virtual/range {p2 .. p2}, Lo/fly;->r()Lo/fow;

    move-result-object v0

    invoke-virtual {v14, v0}, Lo/fma;->e(Lo/fow;)Lo/fma;

    .line 846
    invoke-virtual/range {p2 .. p2}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->L()Z

    move-result v0

    if-nez v0, :cond_6

    .line 847
    invoke-virtual/range {p2 .. p2}, Lo/fly;->k()Lo/flz;

    move-result-object v0

    invoke-virtual {v14, v0}, Lo/fma;->e(Lo/flz;)Lo/flq;

    .line 851
    :cond_6
    new-instance v0, Lo/flr;

    invoke-virtual {v13}, Lo/fma;->f()Lo/flr;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/flr;-><init>(Lo/flr;)V

    invoke-virtual {v14, v0}, Lo/fma;->e(Lo/flr;)Lo/flq;

    .line 852
    invoke-virtual {v14}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v11, v1, v12}, Lo/flr;->c(IZI)Lo/flr;

    .line 853
    invoke-virtual/range {p2 .. p2}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->e()I

    move-result v0

    if-lez v0, :cond_7

    .line 855
    invoke-virtual {v14}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lo/fly;->f()Lo/flr;

    move-result-object v1

    invoke-virtual {v1}, Lo/flr;->c()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lo/flr;->c([B)Lo/flr;

    .line 859
    :cond_7
    invoke-virtual {v14}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->J()Lo/flr;

    .line 863
    invoke-virtual {v13}, Lo/fma;->j()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v14, v0}, Lo/fma;->e(Ljava/util/List;)V

    .line 866
    move-object/from16 v0, p0

    invoke-direct {v0, v14, v6}, Lo/fnq;->e(Lo/flq;Lo/fob;)Lo/fls;

    .line 868
    invoke-virtual {v8, v12}, Lo/fnp;->b(I)V

    .line 870
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "requesting next Block2 [num={}]: {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v14, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 871
    move-object/from16 v0, p1

    invoke-virtual {v0, v14}, Lo/fmb;->e(Lo/fma;)V

    .line 872
    move-object/from16 v0, p0

    invoke-virtual {v0, v8, v6}, Lo/fnq;->b(Lo/fnp;Lo/fob;)V

    .line 873
    invoke-virtual/range {p0 .. p0}, Lo/fnq;->b()Lo/fod;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v0, v1, v14}, Lo/fod;->e(Lo/fmb;Lo/fma;)V

    .line 875
    goto/16 :goto_1

    .line 879
    :cond_8
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "all {} blocks have been retrieved, assembling response and delivering to application layer"

    invoke-virtual {v8}, Lo/fnp;->f()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 882
    new-instance v9, Lo/fly;

    invoke-virtual/range {p2 .. p2}, Lo/fly;->F()Lo/flj$b;

    move-result-object v0

    invoke-direct {v9, v0}, Lo/fly;-><init>(Lo/flj$b;)V

    .line 883
    invoke-virtual {v8, v9}, Lo/fnp;->a(Lo/flq;)V

    .line 886
    invoke-virtual/range {p1 .. p1}, Lo/fmb;->p()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lo/fly;->d(J)V

    .line 888
    invoke-virtual {v8}, Lo/fnp;->c()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 894
    invoke-virtual/range {p2 .. p2}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->L()Z

    move-result v0

    if-nez v0, :cond_9

    .line 896
    invoke-virtual/range {p1 .. p1}, Lo/fmb;->o()V

    .line 900
    :cond_9
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lo/fnq;->b(Lo/fob;)Lo/fnp;

    .line 901
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "assembled response: {}"

    invoke-interface {v0, v1, v9}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 905
    invoke-virtual/range {p1 .. p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/fmb;->e(Lo/fma;)V

    .line 907
    move-object/from16 v0, p1

    invoke-virtual {v0, v9}, Lo/fmb;->c(Lo/fly;)V

    .line 908
    invoke-virtual/range {p0 .. p0}, Lo/fnq;->c()Lo/fod;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v0, v1, v9}, Lo/fod;->d(Lo/fmb;Lo/fly;)V

    .line 909
    goto :goto_1

    .line 914
    :cond_a
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "ignoring block2 response with wrong block number {} (expected {}): {}"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Lo/fll;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v8}, Lo/fnp;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x2

    aput-object p2, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 918
    :goto_1
    monitor-exit v7

    goto :goto_2

    :catchall_0
    move-exception v15

    monitor-exit v7

    throw v15

    .line 920
    :cond_b
    :goto_2
    return-void
.end method

.method private b(Lo/fmb;Lo/fma;)V
    .locals 11

    .line 334
    invoke-direct {p0, p2}, Lo/fnq;->d(Lo/fma;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 336
    sget-object v0, Lo/flj$b;->s:Lo/flj$b;

    invoke-static {p2, v0}, Lo/fly;->b(Lo/fma;Lo/flj$b;)Lo/fly;

    move-result-object v7

    .line 337
    const-string v0, "body too large, can process %d bytes max"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lo/fnq;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/fly;->e(Ljava/lang/String;)Lo/flq;

    .line 338
    invoke-virtual {v7}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    iget v1, p0, Lo/fnq;->h:I

    invoke-virtual {v0, v1}, Lo/flr;->b(I)Lo/flr;

    .line 339
    invoke-virtual {p1, v7}, Lo/fmb;->e(Lo/fly;)V

    .line 340
    invoke-virtual {p0}, Lo/fnq;->b()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, v7}, Lo/fod;->a(Lo/fmb;Lo/fly;)V

    .line 342
    goto/16 :goto_0

    .line 344
    :cond_0
    invoke-virtual {p2}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->j()Lo/fll;

    move-result-object v7

    .line 345
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "inbound request contains block1 option {}"

    invoke-interface {v0, v1, v7}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 346
    invoke-static {p1, p2}, Lo/fnq;->c(Lo/fmb;Lo/fma;)Lo/fob;

    move-result-object v8

    .line 347
    invoke-direct {p0, v8, p1, p2}, Lo/fnq;->d(Lo/fob;Lo/fmb;Lo/fma;)Lo/fns;

    move-result-object v9

    .line 349
    invoke-virtual {v7}, Lo/fll;->b()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v9}, Lo/fns;->b()I

    move-result v0

    if-lez v0, :cond_1

    .line 350
    invoke-direct {p0, v8, p1, p2}, Lo/fnq;->c(Lo/fob;Lo/fmb;Lo/fma;)Lo/fns;

    move-result-object v9

    .line 353
    :cond_1
    invoke-virtual {v7}, Lo/fll;->b()I

    move-result v0

    invoke-virtual {v9}, Lo/fns;->b()I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 355
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "peer sent wrong block, expected no. {} but got {}. Responding with 4.08 (Request Entity Incomplete)"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v9}, Lo/fns;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v7}, Lo/fll;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    move-object v0, p0

    move-object v1, v8

    move-object v2, p1

    move-object v3, p2

    sget-object v4, Lo/flj$b;->o:Lo/flj$b;

    const-string v5, "wrong block number"

    invoke-direct/range {v0 .. v5}, Lo/fnq;->d(Lo/fob;Lo/fmb;Lo/fma;Lo/flj$b;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 361
    :cond_2
    invoke-virtual {p2}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->l()I

    move-result v0

    invoke-virtual {v9, v0}, Lo/fns;->a(I)Z

    move-result v0

    if-nez v0, :cond_3

    .line 363
    move-object v0, p0

    move-object v1, v8

    move-object v2, p1

    move-object v3, p2

    sget-object v4, Lo/flj$b;->o:Lo/flj$b;

    const-string v5, "unexpected Content-Format"

    invoke-direct/range {v0 .. v5}, Lo/fnq;->d(Lo/fob;Lo/fmb;Lo/fma;Lo/flj$b;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 365
    :cond_3
    invoke-virtual {p2}, Lo/fma;->l()[B

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/fns;->a([B)Z

    move-result v0

    if-nez v0, :cond_4

    .line 367
    move-object v0, p0

    move-object v1, v8

    move-object v2, p1

    move-object v3, p2

    sget-object v4, Lo/flj$b;->s:Lo/flj$b;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "body exceeded expected size "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v9}, Lo/fns;->g()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lo/fnq;->d(Lo/fob;Lo/fmb;Lo/fma;Lo/flj$b;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 372
    :cond_4
    invoke-virtual {v9}, Lo/fns;->b()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v9, v0}, Lo/fns;->b(I)V

    .line 373
    invoke-virtual {v7}, Lo/fll;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 377
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "acknowledging incoming block1 [num={}], expecting more blocks to come"

    invoke-virtual {v7}, Lo/fll;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 379
    sget-object v0, Lo/flj$b;->i:Lo/flj$b;

    invoke-static {p2, v0}, Lo/fly;->b(Lo/fma;Lo/flj$b;)Lo/fly;

    move-result-object v10

    .line 380
    invoke-virtual {v10}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v7}, Lo/fll;->c()I

    move-result v1

    invoke-virtual {v7}, Lo/fll;->b()I

    move-result v2

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Lo/flr;->b(IZI)Lo/flr;

    .line 381
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lo/fly;->k(Z)V

    .line 383
    invoke-virtual {p1, v10}, Lo/fmb;->e(Lo/fly;)V

    .line 384
    invoke-virtual {p0}, Lo/fnq;->b()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, v10}, Lo/fod;->a(Lo/fmb;Lo/fly;)V

    .line 386
    goto :goto_0

    .line 388
    :cond_5
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "peer has sent last block1 [num={}], delivering request to application layer"

    invoke-virtual {v7}, Lo/fll;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 391
    invoke-virtual {p1, v7}, Lo/fmb;->b(Lo/fll;)V

    .line 394
    new-instance v10, Lo/fma;

    invoke-virtual {p2}, Lo/fma;->E()Lo/flj$d;

    move-result-object v0

    invoke-direct {v10, v0}, Lo/fma;-><init>(Lo/flj$d;)V

    .line 395
    invoke-virtual {v9, v10}, Lo/fns;->a(Lo/flq;)V

    .line 400
    invoke-virtual {p2}, Lo/fma;->a()I

    move-result v0

    invoke-virtual {v10, v0}, Lo/fma;->d(I)Lo/flq;

    .line 401
    invoke-virtual {p2}, Lo/fma;->k()Lo/flz;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/fma;->e(Lo/flz;)Lo/flq;

    .line 404
    invoke-virtual {v10}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {p2}, Lo/fma;->f()Lo/flr;

    move-result-object v1

    invoke-virtual {v1}, Lo/flr;->I()Lo/fll;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/flr;->e(Lo/fll;)Lo/flr;

    .line 406
    invoke-direct {p0, v8}, Lo/fnq;->a(Lo/fob;)Lo/fns;

    .line 408
    invoke-virtual {p1, v10}, Lo/fmb;->d(Lo/fma;)V

    .line 409
    invoke-virtual {p0}, Lo/fnq;->c()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, v10}, Lo/fod;->a(Lo/fmb;Lo/fma;)V

    .line 413
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/fnq;Lo/fob;)Lo/fnp;
    .locals 1

    .line 98
    invoke-direct {p0, p1}, Lo/fnq;->b(Lo/fob;)Lo/fnp;

    move-result-object v0

    return-object v0
.end method

.method private c(Lo/fob;Lo/fmb;Lo/fly;)Lo/fnp;
    .locals 8

    .line 982
    iget-object v5, p0, Lo/fnq;->b:Lo/fpo;

    monitor-enter v5

    .line 983
    :try_start_0
    iget-object v0, p0, Lo/fnq;->b:Lo/fpo;

    invoke-virtual {v0, p1}, Lo/fpo;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fnp;

    .line 984
    if-nez v6, :cond_0

    .line 985
    iget v0, p0, Lo/fnq;->f:I

    invoke-static {p2, p3, v0}, Lo/fnp;->d(Lo/fmb;Lo/fly;I)Lo/fnp;

    move-result-object v6

    .line 986
    iget-object v0, p0, Lo/fnq;->b:Lo/fpo;

    invoke-virtual {v0, p1, v6}, Lo/fpo;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 987
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "created tracker for outbound block2 transfer {}, transfers in progress: {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    iget-object v3, p0, Lo/fnq;->b:Lo/fpo;

    invoke-virtual {v3}, Lo/fpo;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 991
    :cond_0
    invoke-virtual {p0, v6, p1}, Lo/fnq;->b(Lo/fnp;Lo/fob;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 992
    monitor-exit v5

    return-object v6

    .line 993
    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7
.end method

.method private c(Lo/fob;)Lo/fns;
    .locals 3

    .line 1025
    iget-object v1, p0, Lo/fnq;->c:Lo/fpo;

    monitor-enter v1

    .line 1026
    :try_start_0
    iget-object v0, p0, Lo/fnq;->c:Lo/fpo;

    invoke-virtual {v0, p1}, Lo/fpo;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fns;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 1027
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private c(Lo/fob;Lo/fmb;Lo/fma;)Lo/fns;
    .locals 7

    .line 973
    iget-object v4, p0, Lo/fnq;->c:Lo/fpo;

    monitor-enter v4

    .line 974
    :try_start_0
    iget-object v0, p0, Lo/fnq;->c:Lo/fpo;

    invoke-virtual {v0, p1}, Lo/fpo;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fns;

    .line 975
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "inbound block1 transfer reset at {} by peer: {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v5, v2, v3

    const/4 v3, 0x1

    aput-object p3, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 976
    invoke-direct {p0, p1, p2, p3}, Lo/fnq;->d(Lo/fob;Lo/fmb;Lo/fma;)Lo/fns;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v4

    return-object v0

    .line 977
    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6
.end method

.method private static c(Lo/fmb;Lo/fma;)Lo/fob;
    .locals 1

    .line 926
    invoke-virtual {p0}, Lo/fmb;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 927
    invoke-static {p1}, Lo/fob;->c(Lo/fma;)Lo/fob;

    move-result-object v0

    return-object v0

    .line 929
    :cond_0
    invoke-static {p1}, Lo/fob;->b(Lo/fma;)Lo/fob;

    move-result-object v0

    return-object v0
.end method

.method private c(Lo/fmb;Lo/fly;)V
    .locals 7

    .line 662
    invoke-virtual {p2}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->j()Lo/fll;

    move-result-object v2

    .line 663
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "received response acknowledging block1 {}"

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 666
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-static {p1, v0}, Lo/fnq;->c(Lo/fmb;Lo/fma;)Lo/fob;

    move-result-object v3

    .line 668
    iget-object v4, p0, Lo/fnq;->c:Lo/fpo;

    monitor-enter v4

    .line 670
    :try_start_0
    invoke-direct {p0, v3}, Lo/fnq;->c(Lo/fob;)Lo/fns;

    move-result-object v5

    .line 672
    if-nez v5, :cond_0

    .line 675
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "discarding unexpected block1 response: {}"

    invoke-interface {v0, v1, p2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 677
    :cond_0
    invoke-virtual {v5, p2}, Lo/fns;->c(Lo/fly;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 682
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "discarding obsolete block1 response: {}"

    invoke-interface {v0, v1, p2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 684
    :cond_1
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->y()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 686
    invoke-direct {p0, v3}, Lo/fnq;->a(Lo/fob;)Lo/fns;

    goto :goto_0

    .line 688
    :cond_2
    invoke-virtual {v5}, Lo/fns;->i()Z

    move-result v0

    if-nez v0, :cond_5

    .line 692
    invoke-virtual {v2}, Lo/fll;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 693
    invoke-virtual {p2}, Lo/fly;->F()Lo/flj$b;

    move-result-object v0

    sget-object v1, Lo/flj$b;->i:Lo/flj$b;

    if-ne v0, v1, :cond_3

    .line 696
    invoke-direct {p0, p1, p2, v3, v5}, Lo/fnq;->a(Lo/fmb;Lo/fly;Lo/fob;Lo/fns;)V

    goto :goto_0

    .line 699
    :cond_3
    invoke-direct {p0, v3}, Lo/fnq;->a(Lo/fob;)Lo/fns;

    .line 700
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fma;->c(Z)V

    goto :goto_0

    .line 715
    :cond_4
    invoke-direct {p0, p1, p2, v3, v5}, Lo/fnq;->a(Lo/fmb;Lo/fly;Lo/fob;Lo/fns;)V

    goto :goto_0

    .line 721
    :cond_5
    invoke-direct {p0, v3}, Lo/fnq;->a(Lo/fob;)Lo/fns;

    .line 723
    invoke-virtual {p2}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->E()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 724
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "Block1 followed by Block2 transfer"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 728
    :cond_6
    invoke-virtual {p1, p2}, Lo/fmb;->c(Lo/fly;)V

    .line 729
    invoke-virtual {p0}, Lo/fnq;->c()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->d(Lo/fmb;Lo/fly;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 732
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 733
    :goto_1
    return-void
.end method

.method private c(Lo/fma;)Z
    .locals 6

    .line 1058
    const/4 v5, 0x0

    .line 1059
    invoke-virtual {p1}, Lo/fma;->E()Lo/flj$d;

    move-result-object v0

    sget-object v1, Lo/flj$d;->a:Lo/flj$d;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lo/fma;->E()Lo/flj$d;

    move-result-object v0

    sget-object v1, Lo/flj$d;->c:Lo/flj$d;

    if-ne v0, v1, :cond_2

    .line 1060
    :cond_0
    invoke-virtual {p1}, Lo/fma;->g()I

    move-result v0

    iget v1, p0, Lo/fnq;->e:I

    if-le v0, v1, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    .line 1062
    :cond_2
    :goto_0
    if-eqz v5, :cond_3

    .line 1063
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "request body [{}/{}] requires blockwise transfer"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/fma;->g()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lo/fnq;->e:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1066
    :cond_3
    return v5
.end method

.method private d(Lo/fmb;Lo/fma;)Lo/fma;
    .locals 6

    .line 247
    invoke-static {p1, p2}, Lo/fnq;->c(Lo/fmb;Lo/fma;)Lo/fob;

    move-result-object v1

    .line 249
    iget-object v2, p0, Lo/fnq;->c:Lo/fpo;

    monitor-enter v2

    .line 251
    :try_start_0
    invoke-direct {p0, v1}, Lo/fnq;->c(Lo/fob;)Lo/fns;

    move-result-object v3

    .line 252
    if-eqz v3, :cond_0

    .line 255
    invoke-virtual {v3}, Lo/fns;->d()V

    .line 256
    invoke-direct {p0, v1}, Lo/fnq;->a(Lo/fob;)Lo/fns;

    .line 258
    :cond_0
    invoke-direct {p0, v1, p1, p2}, Lo/fnq;->b(Lo/fob;Lo/fmb;Lo/fma;)Lo/fns;

    move-result-object v3

    .line 260
    invoke-virtual {v3}, Lo/fns;->e()Lo/fma;

    move-result-object v4

    .line 262
    new-instance v0, Lo/fnq$4;

    invoke-direct {v0, p0, p2, v4, v1}, Lo/fnq$4;-><init>(Lo/fnq;Lo/fma;Lo/fma;Lo/fob;)V

    invoke-virtual {v4, v0}, Lo/fma;->c(Lo/fls;)V

    .line 285
    invoke-virtual {p0, v3, v1}, Lo/fnq;->c(Lo/fns;Lo/fob;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 286
    monitor-exit v2

    return-object v4

    .line 287
    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5
.end method

.method private d(Lo/fob;)Lo/fnp;
    .locals 3

    .line 1032
    iget-object v1, p0, Lo/fnq;->b:Lo/fpo;

    monitor-enter v1

    .line 1033
    :try_start_0
    iget-object v0, p0, Lo/fnq;->b:Lo/fpo;

    invoke-virtual {v0, p1}, Lo/fpo;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fnp;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 1034
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic d(Lo/fnq;Lo/fob;)Lo/fns;
    .locals 1

    .line 98
    invoke-direct {p0, p1}, Lo/fnq;->a(Lo/fob;)Lo/fns;

    move-result-object v0

    return-object v0
.end method

.method private d(Lo/fob;Lo/fmb;Lo/fma;)Lo/fns;
    .locals 8

    .line 958
    iget-object v5, p0, Lo/fnq;->c:Lo/fpo;

    monitor-enter v5

    .line 959
    :try_start_0
    iget-object v0, p0, Lo/fnq;->c:Lo/fpo;

    invoke-virtual {v0, p1}, Lo/fpo;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fns;

    .line 960
    if-nez v6, :cond_0

    .line 961
    iget v0, p0, Lo/fnq;->h:I

    invoke-static {p2, p3, v0}, Lo/fns;->a(Lo/fmb;Lo/fma;I)Lo/fns;

    move-result-object v6

    .line 962
    iget-object v0, p0, Lo/fnq;->c:Lo/fpo;

    invoke-virtual {v0, p1, v6}, Lo/fpo;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 963
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "created tracker for inbound block1 transfer {}, transfers in progress: {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    iget-object v3, p0, Lo/fnq;->c:Lo/fpo;

    invoke-virtual {v3}, Lo/fpo;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 967
    :cond_0
    invoke-virtual {p0, v6, p1}, Lo/fnq;->c(Lo/fns;Lo/fob;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 968
    monitor-exit v5

    return-object v6

    .line 969
    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7
.end method

.method static synthetic d()Lo/fty;
    .locals 1

    .line 98
    sget-object v0, Lo/fnq;->a:Lo/fty;

    return-object v0
.end method

.method private d(Lo/fob;Lo/fmb;Lo/fma;Lo/flj$b;Ljava/lang/String;)V
    .locals 6

    .line 418
    invoke-virtual {p3}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->j()Lo/fll;

    move-result-object v4

    .line 419
    invoke-static {p3, p4}, Lo/fly;->b(Lo/fma;Lo/flj$b;)Lo/fly;

    move-result-object v5

    .line 420
    invoke-virtual {v5}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v4}, Lo/fll;->c()I

    move-result v1

    invoke-virtual {v4}, Lo/fll;->a()Z

    move-result v2

    invoke-virtual {v4}, Lo/fll;->b()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/flr;->b(IZI)Lo/flr;

    .line 421
    invoke-virtual {v5, p5}, Lo/fly;->e(Ljava/lang/String;)Lo/flq;

    .line 422
    invoke-direct {p0, p1}, Lo/fnq;->a(Lo/fob;)Lo/fns;

    .line 423
    invoke-virtual {p2, v5}, Lo/fmb;->e(Lo/fly;)V

    .line 424
    invoke-virtual {p0}, Lo/fnq;->b()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p2, v5}, Lo/fod;->a(Lo/fmb;Lo/fly;)V

    .line 425
    return-void
.end method

.method private d(Lo/fma;)Z
    .locals 2

    .line 1092
    invoke-virtual {p1}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->G()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p0, Lo/fnq;->h:I

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e(Lo/flq;Lo/fob;)Lo/fls;
    .locals 1

    .line 1142
    new-instance v0, Lo/fnq$1;

    invoke-direct {v0, p0, p2}, Lo/fnq$1;-><init>(Lo/fnq;Lo/fob;)V

    .line 1154
    invoke-virtual {p1, v0}, Lo/flq;->c(Lo/fls;)V

    .line 1155
    return-object v0
.end method

.method private e(Lo/fob;Lo/fmb;Lo/fly;)Lo/fnp;
    .locals 8

    .line 998
    iget-object v5, p0, Lo/fnq;->b:Lo/fpo;

    monitor-enter v5

    .line 999
    :try_start_0
    iget-object v0, p0, Lo/fnq;->b:Lo/fpo;

    invoke-virtual {v0, p1}, Lo/fpo;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fnp;

    .line 1000
    if-nez v6, :cond_0

    .line 1001
    iget v0, p0, Lo/fnq;->h:I

    invoke-static {p2, p3, v0}, Lo/fnp;->e(Lo/fmb;Lo/fly;I)Lo/fnp;

    move-result-object v6

    .line 1002
    iget-object v0, p0, Lo/fnq;->b:Lo/fpo;

    invoke-virtual {v0, p1, v6}, Lo/fpo;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1003
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "created tracker for {} inbound block2 transfer {}, transfers in progress: {}, {}"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object v6, v2, v3

    iget-object v3, p0, Lo/fnq;->b:Lo/fpo;

    invoke-virtual {v3}, Lo/fpo;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const/4 v3, 0x3

    aput-object p3, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1006
    :cond_0
    monitor-exit v5

    return-object v6

    .line 1007
    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7
.end method

.method private static e(Lo/fmb;Lo/fly;)Lo/fob;
    .locals 1

    .line 935
    invoke-virtual {p0}, Lo/fmb;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 936
    invoke-virtual {p0}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->H()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/fob;->b(Ljava/lang/String;Lo/fly;)Lo/fob;

    move-result-object v0

    return-object v0

    .line 938
    :cond_0
    invoke-virtual {p0}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->H()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/fob;->d(Ljava/lang/String;Lo/fly;)Lo/fob;

    move-result-object v0

    return-object v0
.end method

.method private e(Lo/fmb;Lo/fma;Lo/fob;Lo/fnp;)V
    .locals 6

    .line 430
    move-object v2, p4

    monitor-enter v2

    .line 432
    :try_start_0
    invoke-virtual {p2}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->I()Lo/fll;

    move-result-object v3

    .line 433
    invoke-virtual {p4, v3}, Lo/fnp;->a(Lo/fll;)Lo/fly;

    move-result-object v4

    .line 434
    invoke-virtual {p4}, Lo/fnp;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 436
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "peer has requested last block of blockwise transfer: {}"

    invoke-interface {v0, v1, p4}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 437
    invoke-direct {p0, p3}, Lo/fnq;->b(Lo/fob;)Lo/fnp;

    goto :goto_0

    .line 439
    :cond_0
    invoke-virtual {p0, p4, p3}, Lo/fnq;->b(Lo/fnp;Lo/fob;)V

    .line 440
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "peer has requested intermediary block of blockwise transfer: {}"

    invoke-interface {v0, v1, p4}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 443
    :goto_0
    invoke-virtual {p1, v4}, Lo/fmb;->e(Lo/fly;)V

    .line 444
    invoke-virtual {p0}, Lo/fnq;->b()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, v4}, Lo/fod;->a(Lo/fmb;Lo/fly;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 445
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 446
    :goto_1
    return-void
.end method

.method private e()Z
    .locals 1

    .line 1084
    iget v0, p0, Lo/fnq;->h:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e(Lo/fly;)Z
    .locals 2

    .line 1088
    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->K()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->M()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p0, Lo/fnq;->h:I

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private g(Lo/fmb;Lo/fma;)Lo/fob;
    .locals 9

    .line 1012
    invoke-static {p1, p2}, Lo/fnq;->c(Lo/fmb;Lo/fma;)Lo/fob;

    move-result-object v5

    .line 1013
    iget-object v6, p0, Lo/fnq;->b:Lo/fpo;

    monitor-enter v6

    .line 1014
    :try_start_0
    invoke-static {p1, p2}, Lo/fnp;->e(Lo/fmb;Lo/fma;)Lo/fnp;

    move-result-object v7

    .line 1015
    iget-object v0, p0, Lo/fnq;->b:Lo/fpo;

    invoke-virtual {v0, v5, v7}, Lo/fpo;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1016
    invoke-direct {p0, p2, v5}, Lo/fnq;->e(Lo/flq;Lo/fob;)Lo/fls;

    .line 1017
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "created tracker for random access block2 retrieval {}, transfers in progress: {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    iget-object v3, p0, Lo/fnq;->b:Lo/fpo;

    invoke-virtual {v3}, Lo/fpo;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1019
    monitor-exit v6

    return-object v5

    .line 1020
    :catchall_0
    move-exception v8

    monitor-exit v6

    throw v8
.end method


# virtual methods
.method public a(Lo/fmb;Lo/fly;)V
    .locals 11

    .line 460
    move-object v5, p2

    .line 462
    invoke-direct {p0}, Lo/fnq;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 464
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->I()Lo/fll;

    move-result-object v6

    .line 465
    invoke-virtual {p2}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->I()Lo/fll;

    move-result-object v7

    .line 467
    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lo/fll;->b()I

    move-result v0

    if-lez v0, :cond_2

    .line 471
    if-eqz v7, :cond_0

    .line 476
    invoke-virtual {v6}, Lo/fll;->b()I

    move-result v0

    invoke-virtual {v7}, Lo/fll;->b()I

    move-result v1

    if-eq v0, v1, :cond_5

    .line 477
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "resource [{}] implementation error, peer requested block {} but resource returned block {}"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v3

    invoke-virtual {v3}, Lo/fma;->H()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v6}, Lo/fll;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v7}, Lo/fll;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    sget-object v1, Lo/flj$b;->t:Lo/flj$b;

    invoke-static {v0, v1}, Lo/fly;->b(Lo/fma;Lo/flj$b;)Lo/fly;

    move-result-object v5

    .line 481
    invoke-virtual {p2}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/fly;->d(Lo/flj$e;)Lo/flq;

    .line 482
    invoke-virtual {p2}, Lo/fly;->a()I

    move-result v0

    invoke-virtual {v5, v0}, Lo/fly;->d(I)Lo/flq;

    goto/16 :goto_1

    .line 485
    :cond_0
    invoke-virtual {p2, v6}, Lo/fly;->e(Lo/fll;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 490
    invoke-static {v5, v6}, Lo/fnp;->e(Lo/fly;Lo/fll;)V

    goto/16 :goto_1

    .line 495
    :cond_1
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    sget-object v1, Lo/flj$b;->k:Lo/flj$b;

    invoke-static {v0, v1}, Lo/fly;->b(Lo/fma;Lo/flj$b;)Lo/fly;

    move-result-object v5

    .line 496
    invoke-virtual {p2}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/fly;->d(Lo/flj$e;)Lo/flq;

    .line 497
    invoke-virtual {p2}, Lo/fly;->a()I

    move-result v0

    invoke-virtual {v5, v0}, Lo/fly;->d(I)Lo/flq;

    .line 498
    invoke-virtual {v5}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/flr;->e(Lo/fll;)Lo/flr;

    goto :goto_1

    .line 502
    :cond_2
    invoke-direct {p0, p1, p2, v6}, Lo/fnq;->a(Lo/fmb;Lo/fly;Lo/fll;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 507
    invoke-static {p1, p2}, Lo/fnq;->e(Lo/fmb;Lo/fly;)Lo/fob;

    move-result-object v8

    .line 510
    invoke-direct {p0, v8}, Lo/fnq;->b(Lo/fob;)Lo/fnp;

    .line 511
    invoke-direct {p0, v8, p1, p2}, Lo/fnq;->c(Lo/fob;Lo/fmb;Lo/fly;)Lo/fnp;

    move-result-object v9

    .line 512
    if-eqz v6, :cond_3

    move-object v10, v6

    goto :goto_0

    :cond_3
    new-instance v10, Lo/fll;

    iget v0, p0, Lo/fnq;->k:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v10, v0, v1, v2}, Lo/fll;-><init>(IZI)V

    .line 513
    :goto_0
    invoke-virtual {v9, v10}, Lo/fnp;->a(Lo/fll;)Lo/fly;

    move-result-object v5

    .line 515
    invoke-virtual {v9}, Lo/fnp;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 517
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "block2 transfer of response finished after first block: {}"

    invoke-interface {v0, v1, v9}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 518
    invoke-direct {p0, v8}, Lo/fnq;->b(Lo/fob;)Lo/fnp;

    goto :goto_1

    .line 520
    :cond_4
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "block2 transfer of response started: {}"

    invoke-interface {v0, v1, v9}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 521
    invoke-direct {p0, v5, v8}, Lo/fnq;->e(Lo/flq;Lo/fob;)Lo/fls;

    .line 526
    :cond_5
    :goto_1
    invoke-virtual {p1}, Lo/fmb;->k()Lo/fll;

    move-result-object v8

    .line 527
    if-eqz v8, :cond_6

    .line 528
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/fmb;->b(Lo/fll;)V

    .line 529
    invoke-virtual {v5}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/flr;->d(Lo/fll;)Lo/flr;

    .line 533
    :cond_6
    invoke-virtual {p1, v5}, Lo/fmb;->e(Lo/fly;)V

    .line 534
    invoke-virtual {p0}, Lo/fnq;->b()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, v5}, Lo/fod;->a(Lo/fmb;Lo/fly;)V

    .line 535
    return-void
.end method

.method public a(Lo/fmb;Lo/fma;)V
    .locals 5

    .line 293
    invoke-direct {p0}, Lo/fnq;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 295
    invoke-virtual {p2}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->I()Lo/fll;

    move-result-object v2

    .line 297
    invoke-virtual {p2}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->D()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 300
    invoke-direct {p0, p1, p2}, Lo/fnq;->b(Lo/fmb;Lo/fma;)V

    goto :goto_1

    .line 302
    :cond_0
    if-eqz v2, :cond_2

    .line 304
    invoke-static {p1, p2}, Lo/fnq;->c(Lo/fmb;Lo/fma;)Lo/fob;

    move-result-object v3

    .line 305
    invoke-direct {p0, v3}, Lo/fnq;->d(Lo/fob;)Lo/fnp;

    move-result-object v4

    .line 306
    if-nez v4, :cond_1

    .line 308
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "peer wants to retrieve individual block2 {}, delivering request to application layer"

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 311
    invoke-virtual {p1, p2}, Lo/fmb;->d(Lo/fma;)V

    .line 312
    invoke-virtual {p0}, Lo/fnq;->c()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->a(Lo/fmb;Lo/fma;)V

    goto :goto_0

    .line 316
    :cond_1
    invoke-direct {p0, p1, p2, v3, v4}, Lo/fnq;->e(Lo/fmb;Lo/fma;Lo/fob;Lo/fnp;)V

    .line 319
    :goto_0
    goto :goto_1

    .line 321
    :cond_2
    invoke-virtual {p1, p2}, Lo/fmb;->d(Lo/fma;)V

    .line 322
    invoke-virtual {p0}, Lo/fnq;->c()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->a(Lo/fmb;Lo/fma;)V

    .line 325
    :goto_1
    goto :goto_2

    .line 327
    :cond_3
    invoke-virtual {p1, p2}, Lo/fmb;->d(Lo/fma;)V

    .line 328
    invoke-virtual {p0}, Lo/fnq;->c()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->a(Lo/fmb;Lo/fma;)V

    .line 330
    :goto_2
    return-void
.end method

.method protected b(Lo/fnp;Lo/fob;)V
    .locals 3

    .line 1166
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "scheduling clean up task for block2 transfer {}"

    invoke-interface {v0, v1, p2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1167
    new-instance v0, Lo/fnq$5;

    invoke-direct {v0, p0, p1, p2}, Lo/fnq$5;-><init>(Lo/fnq;Lo/fnp;Lo/fob;)V

    invoke-direct {p0, v0}, Lo/fnq;->b(Ljava/lang/Runnable;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v2

    .line 1182
    invoke-virtual {p1, v2}, Lo/fnp;->b(Ljava/util/concurrent/ScheduledFuture;)V

    .line 1183
    return-void
.end method

.method protected c(Lo/fns;Lo/fob;)V
    .locals 3

    .line 1103
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "scheduling clean up task for block1 transfer {}"

    invoke-interface {v0, v1, p2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1104
    new-instance v0, Lo/fnq$2;

    invoke-direct {v0, p0, p1, p2}, Lo/fnq$2;-><init>(Lo/fnq;Lo/fns;Lo/fob;)V

    invoke-direct {p0, v0}, Lo/fnq;->b(Ljava/lang/Runnable;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v2

    .line 1119
    invoke-virtual {p1, v2}, Lo/fns;->b(Ljava/util/concurrent/ScheduledFuture;)V

    .line 1120
    return-void
.end method

.method public d(Lo/fmb;Lo/fly;)V
    .locals 9

    .line 555
    invoke-direct {p0}, Lo/fnq;->e()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 556
    invoke-virtual {p2}, Lo/fly;->M()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 558
    sget-object v0, Lo/fnq$8;->b:[I

    invoke-virtual {p2}, Lo/fly;->F()Lo/flj$b;

    move-result-object v1

    invoke-virtual {v1}, Lo/flj$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 563
    :sswitch_0
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    invoke-static {p1, v0}, Lo/fnq;->c(Lo/fmb;Lo/fma;)Lo/fob;

    move-result-object v5

    .line 564
    invoke-direct {p0, v5}, Lo/fnq;->a(Lo/fob;)Lo/fns;

    .line 569
    :goto_0
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v1

    if-eq v0, v1, :cond_1

    .line 571
    new-instance v5, Lo/fly;

    invoke-virtual {p2}, Lo/fly;->F()Lo/flj$b;

    move-result-object v0

    invoke-direct {v5, v0}, Lo/fly;-><init>(Lo/flj$b;)V

    .line 573
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->k()Lo/flz;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/fly;->e(Lo/flz;)Lo/flq;

    .line 574
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->c:Lo/flj$e;

    if-ne v0, v1, :cond_0

    .line 575
    sget-object v0, Lo/flj$e;->d:Lo/flj$e;

    invoke-virtual {v5, v0}, Lo/fly;->d(Lo/flj$e;)Lo/flq;

    .line 577
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->a()I

    move-result v0

    invoke-virtual {v5, v0}, Lo/fly;->d(I)Lo/flq;

    goto :goto_1

    .line 579
    :cond_0
    sget-object v0, Lo/flj$e;->e:Lo/flj$e;

    invoke-virtual {v5, v0}, Lo/fly;->d(Lo/flj$e;)Lo/flq;

    .line 581
    :goto_1
    invoke-virtual {p2}, Lo/fly;->r()Lo/fow;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/fly;->c(Lo/fow;)Lo/flq;

    .line 582
    invoke-virtual {p2}, Lo/fly;->l()[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/fly;->e([B)Lo/flq;

    .line 583
    invoke-virtual {p2}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/fly;->e(Lo/flr;)Lo/flq;

    .line 584
    invoke-virtual {p1}, Lo/fmb;->p()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lo/fly;->d(J)V

    .line 585
    invoke-virtual {p1, v5}, Lo/fmb;->c(Lo/fly;)V

    .line 586
    invoke-virtual {p0}, Lo/fnq;->c()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, v5}, Lo/fod;->d(Lo/fmb;Lo/fly;)V

    .line 587
    goto :goto_2

    .line 588
    :cond_1
    invoke-virtual {p0}, Lo/fnq;->c()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->d(Lo/fmb;Lo/fly;)V

    .line 590
    :goto_2
    return-void

    .line 593
    :cond_2
    invoke-static {p1, p2}, Lo/fnq;->e(Lo/fmb;Lo/fly;)Lo/fob;

    move-result-object v5

    .line 594
    invoke-virtual {p2}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->I()Lo/fll;

    move-result-object v6

    .line 595
    invoke-direct {p0, v5}, Lo/fnq;->d(Lo/fob;)Lo/fnp;

    move-result-object v7

    .line 596
    if-eqz v7, :cond_8

    .line 598
    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lo/fll;->b()I

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    const/4 v8, 0x1

    goto :goto_3

    :cond_4
    const/4 v8, 0x0

    .line 599
    :goto_3
    if-eqz v8, :cond_6

    .line 600
    invoke-virtual {v7, p2}, Lo/fnp;->c(Lo/fly;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 601
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "discarding outdated block2 transfer {}, current is [{}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v7}, Lo/fnp;->a()Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 604
    invoke-direct {p0, v5}, Lo/fnq;->b(Lo/fob;)Lo/fnp;

    .line 605
    invoke-virtual {v7, p1}, Lo/fnp;->a(Lo/fmb;)V

    goto :goto_4

    .line 607
    :cond_5
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "discarding old block2 transfer [{}], received during ongoing block2 transfer {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-virtual {v7}, Lo/fnp;->a()Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 610
    invoke-virtual {v7, p1}, Lo/fnp;->c(Lo/fmb;)V

    .line 611
    return-void

    .line 614
    :cond_6
    invoke-virtual {v7, p1}, Lo/fnp;->d(Lo/fmb;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 615
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "discarding outdate block2 response [{}, {}] received during ongoing block2 transfer {}"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/fmb;->n()Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-virtual {v7}, Lo/fnp;->a()Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 618
    invoke-virtual {v7, p1}, Lo/fnp;->c(Lo/fmb;)V

    .line 619
    return-void

    .line 621
    :cond_7
    :goto_4
    goto :goto_5

    .line 622
    :cond_8
    if-eqz v6, :cond_9

    invoke-virtual {v6}, Lo/fll;->b()I

    move-result v0

    if-eqz v0, :cond_9

    .line 623
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "discarding stale block2 response [{}, {}] received without ongoing block2 transfer for {}"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/fmb;->n()Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x2

    aput-object v5, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 626
    invoke-virtual {p1}, Lo/fmb;->l()V

    .line 627
    return-void

    .line 630
    :cond_9
    :goto_5
    invoke-virtual {p2}, Lo/fly;->I()Z

    move-result v0

    if-nez v0, :cond_a

    .line 633
    invoke-virtual {p1, p2}, Lo/fmb;->c(Lo/fly;)V

    .line 634
    invoke-virtual {p0}, Lo/fnq;->c()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->d(Lo/fmb;Lo/fly;)V

    goto :goto_6

    .line 638
    :cond_a
    invoke-virtual {p2}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->D()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 639
    invoke-direct {p0, p1, p2}, Lo/fnq;->c(Lo/fmb;Lo/fly;)V

    .line 642
    :cond_b
    invoke-virtual {p2}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->E()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 643
    invoke-direct {p0, p1, p2}, Lo/fnq;->b(Lo/fmb;Lo/fly;)V

    .line 647
    :cond_c
    :goto_6
    goto :goto_7

    .line 648
    :cond_d
    invoke-virtual {p1, p2}, Lo/fmb;->c(Lo/fly;)V

    .line 649
    invoke-virtual {p0}, Lo/fnq;->c()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->d(Lo/fmb;Lo/fly;)V

    .line 651
    :goto_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method public e(Lo/fmb;Lo/fma;)V
    .locals 6

    .line 199
    move-object v2, p2

    .line 201
    invoke-direct {p0}, Lo/fnq;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 203
    invoke-virtual {p2}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->I()Lo/fll;

    move-result-object v3

    .line 204
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lo/fll;->b()I

    move-result v0

    if-lez v0, :cond_0

    .line 211
    sget-object v0, Lo/fnq;->a:Lo/fty;

    const-string v1, "outbound request contains block2 option, creating random-access blockwise status"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 212
    invoke-direct {p0, p1, p2}, Lo/fnq;->g(Lo/fmb;Lo/fma;)Lo/fob;

    goto :goto_0

    .line 214
    :cond_0
    invoke-static {p1, p2}, Lo/fnq;->c(Lo/fmb;Lo/fma;)Lo/fob;

    move-result-object v4

    .line 215
    invoke-direct {p0, v4}, Lo/fnq;->d(Lo/fob;)Lo/fnp;

    move-result-object v5

    .line 216
    if-eqz v5, :cond_1

    .line 230
    invoke-direct {p0, v4}, Lo/fnq;->b(Lo/fob;)Lo/fnp;

    .line 231
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/fnp;->a(Lo/fmb;)V

    .line 234
    :cond_1
    invoke-direct {p0, p2}, Lo/fnq;->c(Lo/fma;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 236
    invoke-direct {p0, p1, p2}, Lo/fnq;->d(Lo/fmb;Lo/fma;)Lo/fma;

    move-result-object v2

    .line 241
    :cond_2
    :goto_0
    invoke-virtual {p1, v2}, Lo/fmb;->e(Lo/fma;)V

    .line 242
    invoke-virtual {p0}, Lo/fnq;->b()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, v2}, Lo/fod;->e(Lo/fmb;Lo/fma;)V

    .line 243
    return-void
.end method
