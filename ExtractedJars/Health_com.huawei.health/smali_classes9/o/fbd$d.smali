.class Lo/fbd$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fbd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field final synthetic b:Lo/fbd;

.field private c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fbp;>;"
        }
    .end annotation
.end field

.field private e:Lo/fbm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "THistroyModelGroup;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 92
    const-class v0, Lo/fbd;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lo/fbd$d;->a:Z

    return-void
.end method

.method private constructor <init>(Lo/fbd;)V
    .locals 2

    .line 92
    iput-object p1, p0, Lo/fbd$d;->b:Lo/fbd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fbd$d;->e:Lo/fbm;

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fbd$d;->d:Ljava/util/List;

    .line 96
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/fbd$d;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method synthetic constructor <init>(Lo/fbd;Lo/fbd$2;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lo/fbd$d;-><init>(Lo/fbd;)V

    return-void
.end method

.method private a()Lo/fbp;
    .locals 9

    .line 301
    iget-object v0, p0, Lo/fbd$d;->e:Lo/fbm;

    move-object v2, v0

    check-cast v2, Lo/fbp;

    .line 303
    :goto_0
    if-eqz v2, :cond_7

    .line 305
    invoke-interface {v2}, Lo/fbp;->a()Ljava/util/List;

    move-result-object v3

    .line 307
    sget-boolean v0, Lo/fbd$d;->a:Z

    if-nez v0, :cond_0

    if-nez v3, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 309
    :cond_0
    invoke-interface {v2}, Lo/fbp;->e_()Lo/fbh;

    move-result-object v0

    sget-object v1, Lo/fbh;->d:Lo/fbh;

    if-ne v0, v1, :cond_1

    .line 310
    return-object v2

    .line 313
    :cond_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 314
    const/4 v0, 0x0

    return-object v0

    .line 317
    :cond_2
    const-wide/16 v4, 0x0

    .line 318
    move-object v6, v2

    .line 320
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/fbm;

    .line 321
    instance-of v0, v8, Lo/fbp;

    if-nez v0, :cond_3

    .line 322
    const/4 v0, 0x0

    return-object v0

    .line 324
    :cond_3
    invoke-interface {v8}, Lo/fbm;->d()J

    move-result-wide v0

    cmp-long v0, v0, v4

    if-lez v0, :cond_4

    .line 325
    move-object v2, v8

    check-cast v2, Lo/fbp;

    .line 327
    :cond_4
    goto :goto_1

    .line 329
    :cond_5
    if-ne v2, v6, :cond_6

    .line 331
    const/4 v0, 0x0

    return-object v0

    .line 333
    :cond_6
    goto :goto_0

    .line 335
    :cond_7
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic a(Lo/fbd$d;)Lo/fbp;
    .locals 1

    .line 92
    invoke-direct {p0}, Lo/fbd$d;->a()Lo/fbp;

    move-result-object v0

    return-object v0
.end method

.method private b()V
    .locals 2

    .line 99
    iget-object v0, p0, Lo/fbd$d;->b:Lo/fbd;

    invoke-virtual {v0}, Lo/fbd;->c()Lo/fbm;

    move-result-object v0

    iput-object v0, p0, Lo/fbd$d;->e:Lo/fbm;

    .line 100
    iget-object v0, p0, Lo/fbd$d;->e:Lo/fbm;

    instance-of v0, v0, Lo/fbp;

    if-nez v0, :cond_0

    .line 101
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "root data not group"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 103
    :cond_0
    iget-object v0, p0, Lo/fbd$d;->e:Lo/fbm;

    invoke-interface {v0}, Lo/fbm;->e_()Lo/fbh;

    move-result-object v0

    sget-object v1, Lo/fbh;->e:Lo/fbh;

    if-eq v0, v1, :cond_1

    .line 104
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "root data not ALL_DATAS"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 106
    :cond_1
    return-void
.end method

.method private c()V
    .locals 7

    .line 406
    new-instance v2, Ljava/util/Stack;

    invoke-direct {v2}, Ljava/util/Stack;-><init>()V

    .line 408
    iget-object v0, p0, Lo/fbd$d;->e:Lo/fbm;

    invoke-virtual {v2, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    :goto_0
    invoke-virtual {v2}, Ljava/util/Stack;->empty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 412
    invoke-virtual {v2}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fbm;

    .line 414
    invoke-interface {v3}, Lo/fbm;->e_()Lo/fbh;

    move-result-object v0

    sget-object v1, Lo/fbh;->d:Lo/fbh;

    if-ne v0, v1, :cond_0

    .line 415
    iget-object v0, p0, Lo/fbd$d;->d:Ljava/util/List;

    move-object v1, v3

    check-cast v1, Lo/fbp;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 416
    goto :goto_0

    .line 419
    :cond_0
    instance-of v0, v3, Lo/fbp;

    if-nez v0, :cond_1

    .line 420
    goto :goto_0

    .line 423
    :cond_1
    move-object v0, v3

    check-cast v0, Lo/fbp;

    invoke-interface {v0}, Lo/fbp;->a()Ljava/util/List;

    move-result-object v4

    .line 424
    sget-boolean v0, Lo/fbd$d;->a:Z

    if-nez v0, :cond_2

    if-nez v4, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 426
    :cond_2
    sget-object v0, Lo/fbm;->e:Ljava/util/Comparator;

    invoke-static {v4, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 428
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fbm;

    .line 429
    invoke-virtual {v2, v6}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    goto :goto_1

    .line 431
    :cond_3
    goto/16 :goto_0

    .line 433
    :cond_4
    iget-object v0, p0, Lo/fbd$d;->d:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 434
    iget-object v0, p0, Lo/fbd$d;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 435
    return-void
.end method

.method static synthetic c(Lo/fbd$d;)V
    .locals 0

    .line 92
    invoke-direct {p0}, Lo/fbd$d;->b()V

    return-void
.end method

.method private d(Lo/fbh;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fbh;Ljava/util/List<+Lo/fbm;>;)V"
        }
    .end annotation

    .line 202
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 203
    :cond_0
    return-void

    .line 206
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fbm;

    .line 208
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fbm;

    .line 209
    invoke-interface {v4, v2}, Lo/fbm;->e(Lo/fbm;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 210
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "checkModelListHasCommonParent failed"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 212
    :cond_2
    goto :goto_0

    .line 213
    :cond_3
    return-void
.end method


# virtual methods
.method public a(Lo/fbh;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fbh;Ljava/util/List<+Lo/fbm;>;)V"
        }
    .end annotation

    .line 118
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 119
    :cond_0
    return-void

    .line 122
    :cond_1
    invoke-direct {p0, p1, p2}, Lo/fbd$d;->d(Lo/fbh;Ljava/util/List;)V

    .line 124
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fbm;

    .line 126
    iget-object v3, p0, Lo/fbd$d;->e:Lo/fbm;

    .line 127
    instance-of v0, v3, Lo/fbp;

    if-nez v0, :cond_2

    .line 128
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mRootData not instance of IHistroyModelGroup"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 130
    :cond_2
    move-object v4, v3

    check-cast v4, Lo/fbp;

    .line 132
    invoke-virtual {p0, v4, v2, p2}, Lo/fbd$d;->c(Lo/fbp;Lo/fbm;Ljava/util/List;)V

    .line 133
    return-void
.end method

.method public c(Lo/fbp;Lo/fbm;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fbp;Lo/fbm;Ljava/util/List<+Lo/fbm;>;)V"
        }
    .end annotation

    .line 160
    move-object v2, p1

    .line 162
    :goto_0
    if-eqz v2, :cond_7

    .line 164
    invoke-interface {p2, v2}, Lo/fbm;->a(Lo/fbp;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 165
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "modelInsertTypical not in modelTranversBy\'s range"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 169
    :cond_0
    invoke-interface {v2}, Lo/fbp;->a()Ljava/util/List;

    move-result-object v3

    .line 171
    sget-boolean v0, Lo/fbd$d;->a:Z

    if-nez v0, :cond_1

    if-nez v3, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 174
    :cond_1
    invoke-interface {v2, p2}, Lo/fbp;->a(Lo/fbm;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 175
    invoke-interface {v2, p3}, Lo/fbp;->c(Ljava/util/List;)V

    .line 176
    goto :goto_3

    .line 179
    :cond_2
    move-object v4, v2

    .line 181
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fbm;

    .line 182
    instance-of v0, v6, Lo/fbp;

    if-nez v0, :cond_3

    .line 183
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "find model not instanceof IHistroyModelGroup when data can not mount directly"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 185
    :cond_3
    move-object v0, v6

    check-cast v0, Lo/fbp;

    invoke-interface {p2, v0}, Lo/fbm;->a(Lo/fbp;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 186
    move-object v2, v6

    check-cast v2, Lo/fbp;

    .line 187
    goto :goto_2

    .line 189
    :cond_4
    goto :goto_1

    .line 191
    :cond_5
    :goto_2
    if-ne v2, v4, :cond_6

    .line 194
    invoke-interface {p2}, Lo/fbm;->d()J

    move-result-wide v0

    invoke-interface {v2, v0, v1}, Lo/fbp;->a(J)Lo/fbp;

    move-result-object v5

    .line 195
    move-object v2, v5

    .line 198
    :cond_6
    goto/16 :goto_0

    .line 199
    :cond_7
    :goto_3
    return-void
.end method

.method public d()V
    .locals 2

    .line 438
    iget-object v0, p0, Lo/fbd$d;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 439
    iget-object v0, p0, Lo/fbd$d;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 440
    return-void
.end method

.method public d(Lo/fbd$c;)V
    .locals 3

    .line 217
    new-instance v2, Lo/fbd$d$1;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v2, p0, v0, p1}, Lo/fbd$d$1;-><init>(Lo/fbd$d;Landroid/os/Handler;Lo/fbd$c;)V

    .line 230
    new-instance v0, Lo/fbd$d$5;

    invoke-direct {v0, p0, v2}, Lo/fbd$d$5;-><init>(Lo/fbd$d;Lo/fbs;)V

    invoke-virtual {v2, v0}, Lo/fbs;->d(Lo/fbs$d;)V

    .line 251
    new-instance v0, Lo/fbd$d$3;

    invoke-direct {v0, p0, v2}, Lo/fbd$d$3;-><init>(Lo/fbd$d;Lo/fbs;)V

    invoke-virtual {v2, v0}, Lo/fbs;->d(Lo/fbs$d;)V

    .line 272
    new-instance v0, Lo/fbd$d$2;

    invoke-direct {v0, p0, v2}, Lo/fbd$d$2;-><init>(Lo/fbd$d;Lo/fbs;)V

    invoke-virtual {v2, v0}, Lo/fbs;->d(Lo/fbs$d;)V

    .line 297
    invoke-virtual {v2}, Lo/fbs;->b()V

    .line 298
    return-void
.end method

.method public e()I
    .locals 3

    .line 381
    iget-object v1, p0, Lo/fbd$d;->b:Lo/fbd;

    monitor-enter v1

    .line 382
    :try_start_0
    iget-object v0, p0, Lo/fbd$d;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 383
    invoke-direct {p0}, Lo/fbd$d;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 385
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 387
    :goto_0
    iget-object v0, p0, Lo/fbd$d;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public e(I)Lo/fbp;
    .locals 4

    .line 392
    iget-object v2, p0, Lo/fbd$d;->b:Lo/fbd;

    monitor-enter v2

    .line 393
    :try_start_0
    iget-object v0, p0, Lo/fbd$d;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 394
    invoke-direct {p0}, Lo/fbd$d;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 396
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 398
    :goto_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lo/fbd$d;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 399
    iget-object v0, p0, Lo/fbd$d;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fbp;

    return-object v0

    .line 402
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "group positiong is over mMonthSortedCacheList size"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(Lo/fbh;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fbh;Ljava/util/List<+Lo/fbm;>;)V"
        }
    .end annotation

    .line 137
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 138
    :cond_0
    return-void

    .line 143
    :cond_1
    iget-object v2, p0, Lo/fbd$d;->e:Lo/fbm;

    .line 144
    instance-of v0, v2, Lo/fbp;

    if-nez v0, :cond_2

    .line 145
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mRootData not instance of IHistroyModelGroup"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 147
    :cond_2
    move-object v3, v2

    check-cast v3, Lo/fbp;

    .line 149
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 151
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fbm;

    .line 152
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 153
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    invoke-virtual {p0, v3, v6, v4}, Lo/fbd$d;->c(Lo/fbp;Lo/fbm;Ljava/util/List;)V

    .line 155
    goto :goto_0

    .line 156
    :cond_3
    return-void
.end method

.method public e(Lo/fbh;Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fbh;Ljava/util/List<+Lo/fbm;>;Z)V"
        }
    .end annotation

    .line 109
    if-eqz p3, :cond_0

    .line 110
    invoke-virtual {p0, p1, p2}, Lo/fbd$d;->a(Lo/fbh;Ljava/util/List;)V

    .line 111
    return-void

    .line 113
    :cond_0
    invoke-virtual {p0, p1, p2}, Lo/fbd$d;->e(Lo/fbh;Ljava/util/List;)V

    .line 114
    return-void
.end method
