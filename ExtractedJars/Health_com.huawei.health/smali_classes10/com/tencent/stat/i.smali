.class Lcom/tencent/stat/i;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/i;->a:Landroid/content/Context;

    iput-object p1, p0, Lcom/tencent/stat/i;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    iget-object v0, p0, Lcom/tencent/stat/i;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/stat/StatNativeCrashReport;->a(Landroid/content/Context;)Ljava/util/LinkedHashSet;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/io/File;

    invoke-static {v8}, Lcom/tencent/stat/StatNativeCrashReport;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v9

    new-instance v0, Lcom/tencent/stat/a/d;

    iget-object v1, p0, Lcom/tencent/stat/i;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/tencent/stat/i;->a:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I

    move-result v2

    move-object v3, v9

    const/4 v4, 0x3

    const/16 v5, 0x2800

    invoke-direct/range {v0 .. v5}, Lcom/tencent/stat/a/d;-><init>(Landroid/content/Context;ILjava/lang/String;II)V

    move-object v10, v0

    invoke-static {v8}, Lcom/tencent/stat/StatNativeCrashReport;->b(Ljava/io/File;)J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/tencent/stat/a/d;->a(J)V

    iget-object v0, p0, Lcom/tencent/stat/i;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/stat/i;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/k;

    invoke-direct {v1, v10}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "delete tombstone file:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method
