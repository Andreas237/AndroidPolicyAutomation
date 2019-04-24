.class public final Lo/aru;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;

.field private static b:Lo/aru;


# instance fields
.field private e:Lo/arq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 40
    const-class v0, Lo/aru;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/aru;->a:Ljava/lang/String;

    .line 57
    new-instance v0, Lo/aru;

    invoke-direct {v0}, Lo/aru;-><init>()V

    sput-object v0, Lo/aru;->b:Lo/aru;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aru;->e:Lo/arq;

    .line 64
    new-instance v0, Lo/arq;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/arq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/aru;->e:Lo/arq;

    .line 65
    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 38
    sget-object v0, Lo/aru;->a:Ljava/lang/String;

    return-object v0
.end method

.method private a(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/health/sns/model/circle/CircleActionParam;>;"
        }
    .end annotation

    .line 133
    iget-object v0, p0, Lo/aru;->e:Lo/arq;

    invoke-virtual {v0, p1}, Lo/arq;->b(I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lo/aru;Lcom/huawei/health/sns/model/user/User;ILandroid/os/Handler;)Lo/brd;
    .locals 1

    .line 38
    invoke-static {p0, p1, p2, p3}, Lo/aru;->b(Lo/aru;Lcom/huawei/health/sns/model/user/User;ILandroid/os/Handler;)Lo/brd;

    move-result-object v0

    return-object v0
.end method

.method private declared-synchronized a(ILandroid/os/Handler;JLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 12

    monitor-enter p0

    .line 245
    move-object/from16 v0, p5

    instance-of v0, v0, Lcom/huawei/health/sns/server/circle/GetCircleResponse;

    if-eqz v0, :cond_3

    .line 247
    move-object/from16 v3, p5

    :try_start_0
    check-cast v3, Lcom/huawei/health/sns/server/circle/GetCircleResponse;

    .line 249
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/circle/GetCircleResponse;->getErrcode_()I

    move-result v0

    if-nez v0, :cond_2

    .line 252
    move-wide v0, p3

    invoke-direct {p0, v0, v1, v3}, Lo/aru;->d(JLcom/huawei/health/sns/server/circle/GetCircleResponse;)Ljava/util/ArrayList;

    move-result-object v4

    .line 254
    move-wide v0, p3

    invoke-virtual {p0, v0, v1}, Lo/aru;->a(J)Ljava/util/ArrayList;

    move-result-object v5

    .line 256
    invoke-direct {p0, v5, v4}, Lo/aru;->a(Ljava/util/List;Ljava/util/List;)Z

    move-result v6

    .line 258
    if-eqz v6, :cond_1

    .line 261
    if-eqz p2, :cond_0

    .line 263
    invoke-virtual {p2}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 264
    iput p1, v7, Landroid/os/Message;->what:I

    .line 265
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 266
    const-string v0, "userCircleListBundleKey"

    invoke-virtual {v8, v0, v4}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 267
    invoke-virtual {v7, v8}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 268
    invoke-virtual {p2, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 272
    :cond_0
    invoke-direct {p0, v5}, Lo/aru;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    .line 274
    invoke-direct {p0, v4}, Lo/aru;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 276
    invoke-direct {p0, v7, v8}, Lo/aru;->b(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    .line 278
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/String;

    .line 280
    invoke-static {v11}, Lo/bbc;->e(Ljava/lang/String;)V

    .line 281
    invoke-static {v11}, Lo/bbc;->d(Ljava/lang/String;)V

    .line 282
    goto :goto_0

    .line 284
    :cond_1
    goto :goto_1

    .line 287
    :cond_2
    sget-object v0, Lo/aru;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get circle response error! errcode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/health/sns/server/circle/GetCircleResponse;->getErrcode_()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    if-eqz p2, :cond_3

    .line 290
    const/16 v0, 0x4b2

    invoke-virtual {p2, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 294
    :cond_3
    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private a(Ljava/util/List;Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/circle/UserCircle;>;Ljava/util/List<Lcom/huawei/health/sns/model/circle/UserCircle;>;)Z"
        }
    .end annotation

    .line 145
    iget-object v0, p0, Lo/aru;->e:Lo/arq;

    invoke-virtual {v0, p1, p2}, Lo/arq;->a(Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method private b(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/circle/UserCircle;>;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 335
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 336
    if-eqz p1, :cond_2

    .line 338
    const/4 v2, 0x0

    .line 340
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/circle/UserCircle;

    .line 342
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/circle/UserCircle;->getCircleContent()Ljava/util/List;

    move-result-object v2

    .line 343
    if-eqz v2, :cond_1

    .line 345
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/circle/UserCircleContent;

    .line 347
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircleContent;->getCircleType()I

    move-result v0

    if-nez v0, :cond_0

    .line 349
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/circle/UserCircleContent;->getCircleContent()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 351
    :cond_0
    goto :goto_1

    .line 353
    :cond_1
    goto :goto_0

    .line 355
    :cond_2
    return-object v1
.end method

.method private b(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 306
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 307
    const/4 v2, 0x0

    .line 308
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 310
    const/4 v2, 0x0

    .line 311
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 313
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 315
    const/4 v2, 0x1

    .line 316
    goto :goto_2

    .line 318
    :cond_0
    goto :goto_1

    .line 319
    :cond_1
    :goto_2
    if-nez v2, :cond_2

    .line 321
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 323
    :cond_2
    goto :goto_0

    .line 324
    :cond_3
    return-object v1
.end method

.method private static b(Lo/aru;Lcom/huawei/health/sns/model/user/User;ILandroid/os/Handler;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/aru;Lcom/huawei/health/sns/model/user/User;ILandroid/os/Handler;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 211
    new-instance v0, Lo/aru$2;

    invoke-direct {v0, p1, p0, p2, p3}, Lo/aru$2;-><init>(Lcom/huawei/health/sns/model/user/User;Lo/aru;ILandroid/os/Handler;)V

    return-object v0
.end method

.method private static c(Lo/aru;Lcom/huawei/health/sns/model/user/User;ILandroid/os/Handler;)Lo/aud;
    .locals 1

    .line 184
    new-instance v0, Lo/aru$3;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/aru$3;-><init>(Lo/aru;Lcom/huawei/health/sns/model/user/User;ILandroid/os/Handler;)V

    return-object v0
.end method

.method private d(JLcom/huawei/health/sns/server/circle/GetCircleResponse;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLcom/huawei/health/sns/server/circle/GetCircleResponse;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/circle/UserCircle;>;"
        }
    .end annotation

    .line 367
    const/4 v1, 0x0

    .line 368
    if-eqz p3, :cond_0

    .line 370
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/circle/GetCircleResponse;->getCircles_()Ljava/util/List;

    move-result-object v2

    .line 371
    if-eqz v2, :cond_0

    .line 374
    new-instance v4, Lo/art;

    invoke-direct {v4}, Lo/art;-><init>()V

    .line 375
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 376
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;

    .line 378
    invoke-virtual {v4, p1, p2, v6}, Lo/art;->e(JLcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;)Lcom/huawei/health/sns/model/circle/UserCircle;

    move-result-object v3

    .line 379
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 380
    goto :goto_0

    .line 383
    :cond_0
    return-object v1
.end method

.method public static d()Lo/aru;
    .locals 1

    .line 74
    sget-object v0, Lo/aru;->b:Lo/aru;

    return-object v0
.end method

.method static synthetic e(Lo/aru;ILandroid/os/Handler;JLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 0

    .line 38
    invoke-direct/range {p0 .. p5}, Lo/aru;->a(ILandroid/os/Handler;JLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    return-void
.end method


# virtual methods
.method public a(J)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/circle/UserCircle;>;"
        }
    .end annotation

    .line 85
    iget-object v0, p0, Lo/aru;->e:Lo/arq;

    invoke-virtual {v0, p1, p2}, Lo/arq;->a(J)Ljava/util/ArrayList;

    move-result-object v1

    .line 86
    if-eqz v1, :cond_0

    .line 89
    const/4 v2, 0x0

    .line 90
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/circle/UserCircle;

    .line 92
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/circle/UserCircle;->getId()I

    move-result v0

    invoke-direct {p0, v0}, Lo/aru;->a(I)Ljava/util/List;

    move-result-object v2

    .line 93
    invoke-virtual {v4, v2}, Lcom/huawei/health/sns/model/circle/UserCircle;->setActionParam(Ljava/util/List;)V

    .line 94
    goto :goto_0

    .line 96
    :cond_0
    return-object v1
.end method

.method public declared-synchronized d(J)V
    .locals 6

    monitor-enter p0

    .line 107
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lo/aru;->a(J)Ljava/util/ArrayList;

    move-result-object v1

    .line 109
    const/4 v0, 0x0

    invoke-direct {p0, v1, v0}, Lo/aru;->a(Ljava/util/List;Ljava/util/List;)Z

    move-result v2

    .line 111
    if-eqz v2, :cond_0

    .line 114
    invoke-direct {p0, v1}, Lo/aru;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    .line 116
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 118
    invoke-static {v5}, Lo/bbc;->e(Ljava/lang/String;)V

    .line 119
    invoke-static {v5}, Lo/bbc;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    goto :goto_0

    .line 122
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public d(Lcom/huawei/health/sns/model/user/User;ILandroid/os/Handler;)V
    .locals 1

    .line 158
    if-nez p1, :cond_0

    .line 160
    return-void

    .line 164
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getState()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getRelation()I

    move-result v0

    if-eqz v0, :cond_2

    .line 166
    :cond_1
    return-void

    .line 169
    :cond_2
    invoke-static {p0, p1, p2, p3}, Lo/aru;->c(Lo/aru;Lcom/huawei/health/sns/model/user/User;ILandroid/os/Handler;)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->d(Lo/aud;)V

    .line 170
    return-void
.end method
