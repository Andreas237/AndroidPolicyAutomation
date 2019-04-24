.class final Lorg/greenrobot/eventbus/PendingPost;
.super Ljava/lang/Object;
.source "PendingPost.java"


# static fields
.field private static final pendingPostPool:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/greenrobot/eventbus/PendingPost;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field event:Ljava/lang/Object;

.field next:Lorg/greenrobot/eventbus/PendingPost;

.field subscription:Lorg/greenrobot/eventbus/Subscription;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lorg/greenrobot/eventbus/PendingPost;->pendingPostPool:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lorg/greenrobot/eventbus/Subscription;)V
    .locals 0
    .param p1, "event"    # Ljava/lang/Object;
    .param p2, "subscription"    # Lorg/greenrobot/eventbus/Subscription;

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lorg/greenrobot/eventbus/PendingPost;->event:Ljava/lang/Object;

    .line 30
    iput-object p2, p0, Lorg/greenrobot/eventbus/PendingPost;->subscription:Lorg/greenrobot/eventbus/Subscription;

    .line 31
    return-void
.end method

.method static obtainPendingPost(Lorg/greenrobot/eventbus/Subscription;Ljava/lang/Object;)Lorg/greenrobot/eventbus/PendingPost;
    .locals 5
    .param p0, "subscription"    # Lorg/greenrobot/eventbus/Subscription;
    .param p1, "event"    # Ljava/lang/Object;

    .prologue
    .line 34
    sget-object v3, Lorg/greenrobot/eventbus/PendingPost;->pendingPostPool:Ljava/util/List;

    monitor-enter v3

    .line 35
    :try_start_0
    sget-object v2, Lorg/greenrobot/eventbus/PendingPost;->pendingPostPool:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    .line 36
    .local v1, "size":I
    if-lez v1, :cond_0

    .line 37
    sget-object v2, Lorg/greenrobot/eventbus/PendingPost;->pendingPostPool:Ljava/util/List;

    add-int/lit8 v4, v1, -0x1

    invoke-interface {v2, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/greenrobot/eventbus/PendingPost;

    .line 38
    .local v0, "pendingPost":Lorg/greenrobot/eventbus/PendingPost;
    iput-object p1, v0, Lorg/greenrobot/eventbus/PendingPost;->event:Ljava/lang/Object;

    .line 39
    iput-object p0, v0, Lorg/greenrobot/eventbus/PendingPost;->subscription:Lorg/greenrobot/eventbus/Subscription;

    .line 40
    const/4 v2, 0x0

    iput-object v2, v0, Lorg/greenrobot/eventbus/PendingPost;->next:Lorg/greenrobot/eventbus/PendingPost;

    .line 41
    monitor-exit v3

    .line 44
    .end local v0    # "pendingPost":Lorg/greenrobot/eventbus/PendingPost;
    :goto_0
    return-object v0

    .line 43
    :cond_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    new-instance v0, Lorg/greenrobot/eventbus/PendingPost;

    invoke-direct {v0, p1, p0}, Lorg/greenrobot/eventbus/PendingPost;-><init>(Ljava/lang/Object;Lorg/greenrobot/eventbus/Subscription;)V

    goto :goto_0

    .line 43
    .end local v1    # "size":I
    :catchall_0
    move-exception v2

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v2
.end method

.method static releasePendingPost(Lorg/greenrobot/eventbus/PendingPost;)V
    .locals 3
    .param p0, "pendingPost"    # Lorg/greenrobot/eventbus/PendingPost;

    .prologue
    const/4 v0, 0x0

    .line 48
    iput-object v0, p0, Lorg/greenrobot/eventbus/PendingPost;->event:Ljava/lang/Object;

    .line 49
    iput-object v0, p0, Lorg/greenrobot/eventbus/PendingPost;->subscription:Lorg/greenrobot/eventbus/Subscription;

    .line 50
    iput-object v0, p0, Lorg/greenrobot/eventbus/PendingPost;->next:Lorg/greenrobot/eventbus/PendingPost;

    .line 51
    sget-object v1, Lorg/greenrobot/eventbus/PendingPost;->pendingPostPool:Ljava/util/List;

    monitor-enter v1

    .line 53
    :try_start_0
    sget-object v0, Lorg/greenrobot/eventbus/PendingPost;->pendingPostPool:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v2, 0x2710

    if-ge v0, v2, :cond_0

    .line 54
    sget-object v0, Lorg/greenrobot/eventbus/PendingPost;->pendingPostPool:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    :cond_0
    monitor-exit v1

    .line 57
    return-void

    .line 56
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
