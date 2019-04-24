.class Lcom/moat/analytics/mobile/spck/j$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/moat/analytics/mobile/spck/j;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/moat/analytics/mobile/spck/j;


# direct methods
.method constructor <init>(Lcom/moat/analytics/mobile/spck/j;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/j$2;->b:Lcom/moat/analytics/mobile/spck/j;

    iput-object p2, p0, Lcom/moat/analytics/mobile/spck/j$2;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "UPDATE_VIEW_INFO"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/j$2;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/j$2;->b:Lcom/moat/analytics/mobile/spck/j;

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/j;->c(Lcom/moat/analytics/mobile/spck/j;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    const-string v1, "JSUpdateLooper"

    iget-object v2, p0, Lcom/moat/analytics/mobile/spck/j$2;->b:Lcom/moat/analytics/mobile/spck/j;

    const-string v3, "No more active trackers"

    invoke-static {v0, v1, v2, v3}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/j$2;->b:Lcom/moat/analytics/mobile/spck/j;

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/j;->d(Lcom/moat/analytics/mobile/spck/j;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :cond_0
    :goto_0
    return-void
.end method
