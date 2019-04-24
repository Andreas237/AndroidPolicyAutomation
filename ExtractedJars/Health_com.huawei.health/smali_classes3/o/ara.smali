.class public final Lo/ara;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ara$a;
    }
.end annotation


# static fields
.field private static c:Lo/ara;


# instance fields
.field private a:Lo/ara$a;

.field private final b:Ljava/util/concurrent/Executor;

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lo/aqz;>;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/Object;

.field private i:Lo/azh;


# direct methods
.method private constructor <init>()V
    .locals 8

    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/ara;->d:Ljava/util/Map;

    .line 74
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/ara;->e:Ljava/lang/Object;

    .line 84
    new-instance v0, Lo/ara$3;

    invoke-direct {v0, p0}, Lo/ara$3;-><init>(Lo/ara;)V

    iput-object v0, p0, Lo/ara;->i:Lo/azh;

    .line 197
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v7, Lo/bre;

    const-string v1, "thread-pool-upload"

    const/16 v2, 0xa

    invoke-direct {v7, v1, v2}, Lo/bre;-><init>(Ljava/lang/String;I)V

    const/4 v1, 0x1

    const/4 v2, 0x1

    const-wide/16 v3, 0x1e

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, Lo/ara;->b:Ljava/util/concurrent/Executor;

    .line 200
    return-void
.end method

.method private a(Ljava/lang/String;)Lo/aqz;
    .locals 4

    .line 383
    iget-object v1, p0, Lo/ara;->d:Ljava/util/Map;

    monitor-enter v1

    .line 385
    const/4 v2, 0x0

    .line 386
    :try_start_0
    iget-object v0, p0, Lo/ara;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 388
    iget-object v0, p0, Lo/ara;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/aqz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 390
    :cond_0
    monitor-exit v1

    return-object v2

    .line 391
    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3
.end method

.method private a(Ljava/lang/String;Lo/aqz;)V
    .locals 3

    .line 402
    iget-object v1, p0, Lo/ara;->d:Ljava/util/Map;

    monitor-enter v1

    .line 404
    :try_start_0
    iget-object v0, p0, Lo/ara;->d:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 405
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 406
    :goto_0
    return-void
.end method

.method private a(Lo/aqz;)V
    .locals 3

    .line 327
    if-nez p1, :cond_0

    .line 329
    return-void

    .line 331
    :cond_0
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/ara;->b:Ljava/util/concurrent/Executor;

    new-instance v2, Lo/ara$1;

    invoke-direct {v2, p0}, Lo/ara$1;-><init>(Lo/ara;)V

    invoke-virtual {v0, v1, p1, v2}, Lo/brb;->c(Ljava/util/concurrent/Executor;Lo/brd;Lo/brc;)Lo/bqy;

    .line 343
    return-void
.end method

.method private b()V
    .locals 13

    .line 150
    iget-object v3, p0, Lo/ara;->d:Ljava/util/Map;

    monitor-enter v3

    .line 152
    const-string v0, "MediaDownloadManager"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "executeAllWaitUploadTask uploadTaskList.size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/ara;->d:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    const/4 v6, 0x0

    .line 157
    iget-object v0, p0, Lo/ara;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .line 159
    invoke-static {}, Lo/bcd;->a()Ljava/lang/String;

    move-result-object v8

    .line 160
    const/4 v9, 0x0

    .line 161
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    const-string v0, "MediaDownloadManager"

    const-string v1, "executeAllWaitUploadTask mCode is null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    const/4 v9, 0x1

    .line 167
    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 169
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 170
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aqz;

    .line 171
    invoke-virtual {v4}, Lo/aqz;->c()Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;

    move-result-object v5

    .line 172
    if-eqz v9, :cond_1

    .line 174
    invoke-virtual {v4}, Lo/aqz;->e()Lo/bqx;

    move-result-object v10

    .line 175
    invoke-virtual {v10}, Lo/bqx;->a()Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;

    move-result-object v11

    .line 176
    const-string v0, "executeAllWaitUploadTask mCode is null. invalidate!"

    invoke-interface {v11, v0}, Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;->onFailed(Ljava/lang/String;)V

    .line 177
    goto :goto_0

    .line 180
    :cond_1
    iput-object v8, v5, Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;->mcode_:Ljava/lang/String;

    .line 181
    invoke-direct {p0, v4}, Lo/ara;->a(Lo/aqz;)V

    goto :goto_0

    .line 185
    :cond_2
    if-eqz v9, :cond_3

    .line 187
    iget-object v0, p0, Lo/ara;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    :cond_3
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v12

    monitor-exit v3

    throw v12

    .line 190
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/ara;)Ljava/lang/Object;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/ara;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public static declared-synchronized c()Lo/ara;
    .locals 3

    const-class v1, Lo/ara;

    monitor-enter v1

    .line 209
    :try_start_0
    sget-object v0, Lo/ara;->c:Lo/ara;

    if-nez v0, :cond_0

    .line 211
    new-instance v0, Lo/ara;

    invoke-direct {v0}, Lo/ara;-><init>()V

    sput-object v0, Lo/ara;->c:Lo/ara;

    .line 213
    :cond_0
    sget-object v0, Lo/ara;->c:Lo/ara;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private d(Ljava/lang/String;Z)Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;
    .locals 3

    .line 354
    const/4 v1, 0x0

    .line 356
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 358
    const/4 v0, 0x0

    return-object v0

    .line 360
    :cond_0
    if-eqz p2, :cond_1

    .line 362
    new-instance v2, Lcom/huawei/health/sns/logic/chat/media/SingleUploadMediaRequest;

    invoke-direct {v2}, Lcom/huawei/health/sns/logic/chat/media/SingleUploadMediaRequest;-><init>()V

    .line 363
    iput-object p1, v2, Lcom/huawei/health/sns/logic/chat/media/SingleUploadMediaRequest;->uID_:Ljava/lang/String;

    .line 364
    move-object v1, v2

    .line 365
    goto :goto_0

    .line 368
    :cond_1
    new-instance v2, Lcom/huawei/health/sns/logic/chat/media/GroupUploadMediaRequest;

    invoke-direct {v2}, Lcom/huawei/health/sns/logic/chat/media/GroupUploadMediaRequest;-><init>()V

    .line 369
    iput-object p1, v2, Lcom/huawei/health/sns/logic/chat/media/GroupUploadMediaRequest;->groupID_:Ljava/lang/String;

    .line 370
    move-object v1, v2

    .line 372
    :goto_0
    return-object v1
.end method

.method static synthetic d(Lo/ara;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lo/ara;->b()V

    return-void
.end method


# virtual methods
.method public e(Ljava/lang/String;)V
    .locals 3

    .line 415
    iget-object v1, p0, Lo/ara;->d:Ljava/util/Map;

    monitor-enter v1

    .line 417
    :try_start_0
    iget-object v0, p0, Lo/ara;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 418
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 419
    :goto_0
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;)V
    .locals 8

    .line 228
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 230
    const-string v0, "MediaDownloadManager"

    const-string v1, "uploadMediaFile msgId is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    const-string v0, "msgId is invalidate!"

    invoke-interface {p5, v0}, Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;->onFailed(Ljava/lang/String;)V

    .line 232
    return-void

    .line 235
    :cond_0
    invoke-static {p2}, Lo/bot;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 237
    const-string v0, "MediaDownloadManager"

    const-string v1, "uploadMediaFile file is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    const-string v0, "file is not exists!"

    invoke-interface {p5, v0}, Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;->onFailed(Ljava/lang/String;)V

    .line 239
    return-void

    .line 243
    :cond_1
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 245
    const-string v0, "MediaDownloadManager"

    const-string v1, "uploadMediaFile uId is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    const-string v0, "uId or groupId is invalidate!"

    invoke-interface {p5, v0}, Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;->onFailed(Ljava/lang/String;)V

    .line 247
    return-void

    .line 251
    :cond_2
    invoke-direct {p0, p1}, Lo/ara;->a(Ljava/lang/String;)Lo/aqz;

    move-result-object v3

    .line 253
    if-eqz v3, :cond_3

    .line 255
    const-string v0, "MediaDownloadManager"

    const-string v1, "uploadMediaFile task is not null"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    invoke-virtual {v3}, Lo/aqz;->e()Lo/bqx;

    move-result-object v4

    .line 259
    invoke-virtual {v4, p5}, Lo/bqx;->e(Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;)V

    .line 260
    return-void

    .line 264
    :cond_3
    invoke-direct {p0, p3, p4}, Lo/ara;->d(Ljava/lang/String;Z)Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;

    move-result-object v4

    .line 265
    if-nez v4, :cond_4

    .line 267
    const-string v0, "MediaDownloadManager"

    const-string v1, "uploadMediaFile UploadMediaRequest is invalidate!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    return-void

    .line 270
    :cond_4
    sget-object v0, Lo/ayw;->a:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;->setUrl(Ljava/lang/String;)V

    .line 272
    invoke-virtual {v4, p2}, Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;->setFilePath(Ljava/lang/String;)V

    .line 275
    new-instance v5, Lo/bqx;

    invoke-direct {v5}, Lo/bqx;-><init>()V

    .line 276
    invoke-virtual {v5, p5}, Lo/bqx;->e(Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;)V

    .line 278
    invoke-virtual {v5, p1}, Lo/bqx;->d(Ljava/lang/String;)V

    .line 281
    invoke-static {}, Lo/bcd;->a()Ljava/lang/String;

    move-result-object v6

    .line 282
    iput-object v6, v4, Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;->mcode_:Ljava/lang/String;

    .line 283
    const-string v0, "MediaDownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "uploadMediaFile UploadMediaRequest is invalidate!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;->getPostfix()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    new-instance v3, Lo/aqz;

    invoke-direct {v3, v5}, Lo/aqz;-><init>(Lo/bqx;)V

    .line 287
    invoke-virtual {v3, v4}, Lo/aqz;->d(Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;)V

    .line 290
    invoke-direct {p0, p1, v3}, Lo/ara;->a(Ljava/lang/String;Lo/aqz;)V

    .line 292
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 295
    iget-object v0, p0, Lo/ara;->a:Lo/ara$a;

    if-nez v0, :cond_5

    .line 297
    new-instance v0, Lo/ara$a;

    invoke-direct {v0, p0}, Lo/ara$a;-><init>(Lo/ara;)V

    iput-object v0, p0, Lo/ara;->a:Lo/ara$a;

    .line 300
    :cond_5
    iget-object v0, p0, Lo/ara;->a:Lo/ara$a;

    invoke-static {v0}, Lo/ara$a;->c(Lo/ara$a;)Z

    move-result v7

    .line 301
    const-string v0, "MediaDownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "uploadMediaFile mcode is null. isThdRuning is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    if-eqz v7, :cond_6

    .line 304
    return-void

    .line 307
    :cond_6
    iget-object v0, p0, Lo/ara;->a:Lo/ara$a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ara$a;->c(Lo/ara$a;Z)Z

    .line 309
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    iget-object v1, p0, Lo/ara;->i:Lo/azh;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->b(Lo/azh;)V

    .line 310
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lo/ara;->a:Lo/ara$a;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 311
    goto :goto_0

    .line 315
    :cond_7
    invoke-direct {p0, v3}, Lo/ara;->a(Lo/aqz;)V

    .line 317
    :goto_0
    return-void
.end method
