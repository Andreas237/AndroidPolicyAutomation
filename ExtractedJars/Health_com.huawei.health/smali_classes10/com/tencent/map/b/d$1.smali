.class final Lcom/tencent/map/b/d$1;
.super Ljava/lang/Thread;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/map/b/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic a:Lcom/tencent/map/b/d;


# direct methods
.method constructor <init>(Lcom/tencent/map/b/d;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/map/b/d$1;->a:Lcom/tencent/map/b/d;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/tencent/map/b/d$1;->a:Lcom/tencent/map/b/d;

    invoke-static {v0}, Lcom/tencent/map/b/d;->d(Lcom/tencent/map/b/d;)Landroid/telephony/TelephonyManager;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/map/b/d$1;->a:Lcom/tencent/map/b/d;

    invoke-static {v0}, Lcom/tencent/map/b/d;->d(Lcom/tencent/map/b/d;)Landroid/telephony/TelephonyManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNeighboringCellInfo()Ljava/util/List;

    move-result-object v2

    iget-object v0, p0, Lcom/tencent/map/b/d$1;->a:Lcom/tencent/map/b/d;

    invoke-static {v0}, Lcom/tencent/map/b/d;->e(Lcom/tencent/map/b/d;)[B

    move-result-object v3

    monitor-enter v3

    if-eqz v2, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/tencent/map/b/d$1;->a:Lcom/tencent/map/b/d;

    invoke-static {v0}, Lcom/tencent/map/b/d;->f(Lcom/tencent/map/b/d;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/tencent/map/b/d$1;->a:Lcom/tencent/map/b/d;

    invoke-static {v0}, Lcom/tencent/map/b/d;->f(Lcom/tencent/map/b/d;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v3

    throw v2

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/map/b/d$1;->a:Lcom/tencent/map/b/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/tencent/map/b/d;->a(Lcom/tencent/map/b/d;Z)Z

    return-void
.end method
