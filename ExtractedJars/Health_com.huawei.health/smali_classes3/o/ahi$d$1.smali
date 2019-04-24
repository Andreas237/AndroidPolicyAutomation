.class Lo/ahi$d$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ahi$d;->a(Lo/ahi$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ahi$d;

.field final synthetic e:Lo/ahi$a;


# direct methods
.method constructor <init>(Lo/ahi$d;Lo/ahi$a;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lo/ahi$d$1;->c:Lo/ahi$d;

    iput-object p2, p0, Lo/ahi$d$1;->e:Lo/ahi$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 240
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 242
    :try_start_0
    iget-object v0, p0, Lo/ahi$d$1;->c:Lo/ahi$d;

    iget-object v0, v0, Lo/ahi$d;->b:Lo/ahi$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 243
    iget-object v0, p0, Lo/ahi$d$1;->c:Lo/ahi$d;

    iget-object v0, v0, Lo/ahi$d;->b:Lo/ahi$e;

    iget-object v1, p0, Lo/ahi$d$1;->e:Lo/ahi$a;

    invoke-interface {v0, v1}, Lo/ahi$e;->onEvent(Lo/ahi$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 247
    :cond_0
    iget-object v0, p0, Lo/ahi$d$1;->c:Lo/ahi$d;

    iget-object v0, v0, Lo/ahi$d;->a:Landroid/os/Handler;

    if-nez v0, :cond_3

    .line 248
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v6, v0, v4

    .line 249
    const-wide/16 v0, 0x1388

    cmp-long v0, v6, v0

    if-lez v0, :cond_1

    .line 250
    iget-object v0, p0, Lo/ahi$d$1;->c:Lo/ahi$d;

    iget-object v0, v0, Lo/ahi$d;->b:Lo/ahi$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 251
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/ahi$d$1;->c:Lo/ahi$d;

    iget-object v2, v2, Lo/ahi$d;->b:Lo/ahi$e;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " takes too long ("

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "ms)!"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    :cond_1
    goto :goto_0

    .line 247
    :catchall_0
    move-exception v8

    iget-object v0, p0, Lo/ahi$d$1;->c:Lo/ahi$d;

    iget-object v0, v0, Lo/ahi$d;->a:Landroid/os/Handler;

    if-nez v0, :cond_2

    .line 248
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v9, v0, v4

    .line 249
    const-wide/16 v0, 0x1388

    cmp-long v0, v9, v0

    if-lez v0, :cond_2

    .line 250
    iget-object v0, p0, Lo/ahi$d$1;->c:Lo/ahi$d;

    iget-object v0, v0, Lo/ahi$d;->b:Lo/ahi$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 251
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/ahi$d$1;->c:Lo/ahi$d;

    iget-object v2, v2, Lo/ahi$d;->b:Lo/ahi$e;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " takes too long ("

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "ms)!"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    :cond_2
    throw v8

    .line 256
    :cond_3
    :goto_0
    return-void
.end method
