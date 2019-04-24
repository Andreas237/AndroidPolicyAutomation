.class Lio/branch/referral/ServerRequestQueue;
.super Ljava/lang/Object;
.source "ServerRequestQueue.java"


# static fields
.field private static final MAX_ITEMS:I = 0x19

.field private static final PREF_KEY:Ljava/lang/String; = "BNCServerRequestQueue"

.field private static SharedInstance:Lio/branch/referral/ServerRequestQueue;

.field private static final reqQueueLockObject:Ljava/lang/Object;


# instance fields
.field private editor:Landroid/content/SharedPreferences$Editor;

.field private final queue:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/branch/referral/ServerRequest;",
            ">;"
        }
    .end annotation
.end field

.field private sharedPref:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "BNC_Server_Request_Queue"

    const/4 v1, 0x0

    .line 61
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/ServerRequestQueue;->sharedPref:Landroid/content/SharedPreferences;

    .line 62
    iget-object v0, p0, Lio/branch/referral/ServerRequestQueue;->sharedPref:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/ServerRequestQueue;->editor:Landroid/content/SharedPreferences$Editor;

    .line 63
    invoke-direct {p0, p1}, Lio/branch/referral/ServerRequestQueue;->retrieve(Landroid/content/Context;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    return-void
.end method

.method static synthetic access$000()Ljava/lang/Object;
    .locals 1

    .line 23
    sget-object v0, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$100(Lio/branch/referral/ServerRequestQueue;)Ljava/util/List;
    .locals 0

    .line 23
    iget-object p0, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$200(Lio/branch/referral/ServerRequestQueue;)Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 23
    iget-object p0, p0, Lio/branch/referral/ServerRequestQueue;->editor:Landroid/content/SharedPreferences$Editor;

    return-object p0
.end method

.method public static getInstance(Landroid/content/Context;)Lio/branch/referral/ServerRequestQueue;
    .locals 2

    .line 43
    sget-object v0, Lio/branch/referral/ServerRequestQueue;->SharedInstance:Lio/branch/referral/ServerRequestQueue;

    if-nez v0, :cond_1

    .line 44
    const-class v0, Lio/branch/referral/ServerRequestQueue;

    monitor-enter v0

    .line 45
    :try_start_0
    sget-object v1, Lio/branch/referral/ServerRequestQueue;->SharedInstance:Lio/branch/referral/ServerRequestQueue;

    if-nez v1, :cond_0

    .line 46
    new-instance v1, Lio/branch/referral/ServerRequestQueue;

    invoke-direct {v1, p0}, Lio/branch/referral/ServerRequestQueue;-><init>(Landroid/content/Context;)V

    sput-object v1, Lio/branch/referral/ServerRequestQueue;->SharedInstance:Lio/branch/referral/ServerRequestQueue;

    .line 48
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 50
    :cond_1
    :goto_0
    sget-object p0, Lio/branch/referral/ServerRequestQueue;->SharedInstance:Lio/branch/referral/ServerRequestQueue;

    return-object p0
.end method

.method private persist()V
    .locals 2

    .line 67
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lio/branch/referral/ServerRequestQueue$1;

    invoke-direct {v1, p0}, Lio/branch/referral/ServerRequestQueue$1;-><init>(Lio/branch/referral/ServerRequestQueue;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 96
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method private retrieve(Landroid/content/Context;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lio/branch/referral/ServerRequest;",
            ">;"
        }
    .end annotation

    .line 100
    iget-object v0, p0, Lio/branch/referral/ServerRequestQueue;->sharedPref:Landroid/content/SharedPreferences;

    const-string v1, "BNCServerRequestQueue"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 101
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 102
    sget-object v2, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    monitor-enter v2

    if-eqz v0, :cond_1

    .line 105
    :try_start_0
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 106
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    const/16 v5, 0x19

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    :goto_0
    if-ge v0, v4, :cond_1

    .line 107
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 108
    invoke-static {v5, p1}, Lio/branch/referral/ServerRequest;->fromJSON(Lorg/json/JSONObject;Landroid/content/Context;)Lio/branch/referral/ServerRequest;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 110
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 116
    :catch_0
    :cond_1
    :try_start_1
    monitor-exit v2

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method clear()V
    .locals 2

    .line 273
    sget-object v0, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    monitor-enter v0

    .line 275
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 276
    invoke-direct {p0}, Lio/branch/referral/ServerRequestQueue;->persist()V
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 279
    :catch_0
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method containsClose()Z
    .locals 4

    .line 290
    sget-object v0, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    monitor-enter v0

    .line 291
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/branch/referral/ServerRequest;

    if-eqz v2, :cond_0

    .line 293
    invoke-virtual {v2}, Lio/branch/referral/ServerRequest;->getRequestPath()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lio/branch/referral/Defines$RequestPath;->RegisterClose:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v3}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    .line 294
    monitor-exit v0

    return v1

    .line 297
    :cond_1
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method containsInstallOrOpen()Z
    .locals 4

    .line 309
    sget-object v0, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    monitor-enter v0

    .line 310
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/branch/referral/ServerRequest;

    if-eqz v2, :cond_0

    .line 311
    instance-of v3, v2, Lio/branch/referral/ServerRequestRegisterInstall;

    if-nez v3, :cond_1

    instance-of v2, v2, Lio/branch/referral/ServerRequestRegisterOpen;

    if-eqz v2, :cond_0

    :cond_1
    const/4 v1, 0x1

    .line 313
    monitor-exit v0

    return v1

    .line 316
    :cond_2
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method dequeue()Lio/branch/referral/ServerRequest;
    .locals 4

    .line 158
    sget-object v0, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 160
    :try_start_0
    iget-object v2, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/branch/referral/ServerRequest;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    :try_start_1
    invoke-direct {p0}, Lio/branch/referral/ServerRequestQueue;->persist()V
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/NoSuchElementException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-object v2, v1

    .line 164
    :catch_1
    :goto_0
    :try_start_2
    monitor-exit v0

    return-object v2

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method enqueue(Lio/branch/referral/ServerRequest;)V
    .locals 2

    .line 139
    sget-object v0, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p1, :cond_1

    .line 141
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 142
    invoke-virtual {p0}, Lio/branch/referral/ServerRequestQueue;->getSize()I

    move-result p1

    const/16 v1, 0x19

    if-lt p1, v1, :cond_0

    .line 143
    iget-object p1, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 145
    :cond_0
    invoke-direct {p0}, Lio/branch/referral/ServerRequestQueue;->persist()V

    .line 147
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getSize()I
    .locals 2

    .line 128
    sget-object v0, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    monitor-enter v0

    .line 129
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 130
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method insert(Lio/branch/referral/ServerRequest;I)V
    .locals 2

    .line 216
    sget-object v0, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    monitor-enter v0

    .line 218
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v1, p2, :cond_0

    .line 219
    iget-object p2, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    .line 221
    :cond_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    invoke-interface {v1, p2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 222
    invoke-direct {p0}, Lio/branch/referral/ServerRequestQueue;->persist()V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 225
    :catch_0
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method moveInstallOrOpenToFront(Lio/branch/referral/ServerRequest;ILio/branch/referral/Branch$BranchReferralInitListener;)V
    .locals 3

    .line 332
    sget-object p3, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    monitor-enter p3

    .line 333
    :try_start_0
    iget-object v0, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 334
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 335
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/branch/referral/ServerRequest;

    if-eqz v1, :cond_0

    .line 336
    instance-of v2, v1, Lio/branch/referral/ServerRequestRegisterInstall;

    if-nez v2, :cond_1

    instance-of v1, v1, Lio/branch/referral/ServerRequestRegisterOpen;

    if-eqz v1, :cond_0

    .line 339
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 343
    :cond_2
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_3

    const/4 p2, 0x0

    goto :goto_0

    :cond_3
    const/4 p2, 0x1

    .line 345
    :goto_0
    invoke-virtual {p0, p1, p2}, Lio/branch/referral/ServerRequestQueue;->insert(Lio/branch/referral/ServerRequest;I)V

    return-void

    :catchall_0
    move-exception p1

    .line 343
    :try_start_1
    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method peek()Lio/branch/referral/ServerRequest;
    .locals 3

    .line 176
    sget-object v0, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    monitor-enter v0

    .line 178
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/branch/referral/ServerRequest;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    const/4 v1, 0x0

    .line 181
    :goto_0
    :try_start_1
    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method peekAt(I)Lio/branch/referral/ServerRequest;
    .locals 2

    .line 197
    sget-object v0, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    monitor-enter v0

    .line 199
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/branch/referral/ServerRequest;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    const/4 p1, 0x0

    .line 202
    :goto_0
    :try_start_1
    monitor-exit v0

    return-object p1

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public remove(Lio/branch/referral/ServerRequest;)Z
    .locals 3

    .line 259
    sget-object v0, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 261
    :try_start_0
    iget-object v2, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v1

    .line 262
    invoke-direct {p0}, Lio/branch/referral/ServerRequestQueue;->persist()V
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 265
    :catch_0
    :goto_0
    :try_start_1
    monitor-exit v0

    return v1

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public removeAt(I)Lio/branch/referral/ServerRequest;
    .locals 3

    .line 240
    sget-object v0, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 242
    :try_start_0
    iget-object v2, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/branch/referral/ServerRequest;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 243
    :try_start_1
    invoke-direct {p0}, Lio/branch/referral/ServerRequestQueue;->persist()V
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-object p1, v1

    .line 246
    :catch_1
    :goto_0
    :try_start_2
    monitor-exit v0

    return-object p1

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method setInstallOrOpenCallback(Lio/branch/referral/Branch$BranchReferralInitListener;)V
    .locals 4

    .line 354
    sget-object v0, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    monitor-enter v0

    .line 355
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/branch/referral/ServerRequest;

    if-eqz v2, :cond_0

    .line 357
    instance-of v3, v2, Lio/branch/referral/ServerRequestRegisterInstall;

    if-eqz v3, :cond_1

    .line 358
    check-cast v2, Lio/branch/referral/ServerRequestRegisterInstall;

    invoke-virtual {v2, p1}, Lio/branch/referral/ServerRequestRegisterInstall;->setInitFinishedCallback(Lio/branch/referral/Branch$BranchReferralInitListener;)V

    goto :goto_0

    .line 359
    :cond_1
    instance-of v3, v2, Lio/branch/referral/ServerRequestRegisterOpen;

    if-eqz v3, :cond_0

    .line 360
    check-cast v2, Lio/branch/referral/ServerRequestRegisterOpen;

    invoke-virtual {v2, p1}, Lio/branch/referral/ServerRequestRegisterOpen;->setInitFinishedCallback(Lio/branch/referral/Branch$BranchReferralInitListener;)V

    goto :goto_0

    .line 364
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method setStrongMatchWaitLock()V
    .locals 4

    .line 384
    sget-object v0, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    monitor-enter v0

    .line 385
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/branch/referral/ServerRequest;

    if-eqz v2, :cond_0

    .line 387
    instance-of v3, v2, Lio/branch/referral/ServerRequestInitSession;

    if-eqz v3, :cond_0

    .line 388
    sget-object v3, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->STRONG_MATCH_PENDING_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    invoke-virtual {v2, v3}, Lio/branch/referral/ServerRequest;->addProcessWaitLock(Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V

    goto :goto_0

    .line 392
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method unlockProcessWait(Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V
    .locals 3

    .line 371
    sget-object v0, Lio/branch/referral/ServerRequestQueue;->reqQueueLockObject:Ljava/lang/Object;

    monitor-enter v0

    .line 372
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestQueue;->queue:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/branch/referral/ServerRequest;

    if-eqz v2, :cond_0

    .line 374
    invoke-virtual {v2, p1}, Lio/branch/referral/ServerRequest;->removeProcessWaitLock(Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;)V

    goto :goto_0

    .line 377
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
