.class Lcom/huawei/openalliance/ad/views/a/c$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/views/a/c;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/a/a;

.field final synthetic b:Lcom/huawei/openalliance/ad/views/a/c;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/a/c;Lcom/huawei/openalliance/ad/views/a/a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/a/c$4;->b:Lcom/huawei/openalliance/ad/views/a/c;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/views/a/c$4;->a:Lcom/huawei/openalliance/ad/views/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 20

    const-string v0, "GifPlayView"

    const-string v1, "fetch next"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/c$4;->a:Lcom/huawei/openalliance/ad/views/a/a;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/a/a;->a()Lcom/huawei/openalliance/ad/views/a/b;

    move-result-object v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long v10, v8, v5

    const-string v0, "GifPlayView"

    const-string v1, "frame fetch - decoding duration: %d gif: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v7, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/c$4;->b:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0, v7, v10, v11}, Lcom/huawei/openalliance/ad/views/a/c;->a(Lcom/huawei/openalliance/ad/views/a/c;Lcom/huawei/openalliance/ad/views/a/b;J)Z

    move-result v12

    const-string v0, "GifPlayView"

    const-string v1, "need reduce size: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v7}, Lcom/huawei/openalliance/ad/views/a/b;->a()Lcom/huawei/openalliance/ad/views/a/b;

    move-result-object v13

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/c$4;->b:Lcom/huawei/openalliance/ad/views/a/c;

    iget-object v1, v7, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    invoke-static {v0, v1, v12}, Lcom/huawei/openalliance/ad/views/a/c;->a(Lcom/huawei/openalliance/ad/views/a/c;Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, v13, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/c$4;->b:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/a/c;->b(Lcom/huawei/openalliance/ad/views/a/c;)Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0, v13}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "GifPlayView"

    const-string v1, "fail to add frame to cache"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget v0, v13, Lcom/huawei/openalliance/ad/views/a/b;->c:I

    int-to-long v0, v0

    cmp-long v0, v10, v0

    if-gtz v0, :cond_1

    const-string v0, "GifPlayView"

    const-string v1, "send to render directly"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/c$4;->b:Lcom/huawei/openalliance/ad/views/a/c;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/views/a/c$4;->b:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/views/a/c;->b(Lcom/huawei/openalliance/ad/views/a/c;)Ljava/util/Queue;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/openalliance/ad/views/a/b;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/views/a/c;->a(Lcom/huawei/openalliance/ad/views/a/c;Lcom/huawei/openalliance/ad/views/a/b;)V

    goto :goto_1

    :cond_1
    long-to-double v0, v10

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    iget v2, v13, Lcom/huawei/openalliance/ad/views/a/b;->c:I

    int-to-double v2, v2

    div-double/2addr v0, v2

    double-to-int v14, v0

    const/4 v0, 0x5

    if-le v14, v0, :cond_2

    const/4 v0, 0x5

    goto :goto_0

    :cond_2
    move v0, v14

    :goto_0
    move v14, v0

    const-string v0, "GifPlayView"

    const-string v1, "preferred cached frame num: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/c$4;->b:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/a/c;->b(Lcom/huawei/openalliance/ad/views/a/c;)Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    if-lt v0, v14, :cond_3

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/c$4;->b:Lcom/huawei/openalliance/ad/views/a/c;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/views/a/c$4;->b:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/views/a/c;->b(Lcom/huawei/openalliance/ad/views/a/c;)Ljava/util/Queue;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/openalliance/ad/views/a/b;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/views/a/c;->a(Lcom/huawei/openalliance/ad/views/a/c;Lcom/huawei/openalliance/ad/views/a/b;)V

    goto :goto_1

    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/c$4;->b:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/a/c;->c(Lcom/huawei/openalliance/ad/views/a/c;)V

    :goto_1
    goto :goto_3

    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/c$4;->b:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/a/c;->b(Lcom/huawei/openalliance/ad/views/a/c;)Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/openalliance/ad/views/a/b;

    const/4 v0, 0x0

    if-eq v0, v12, :cond_5

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/c$4;->b:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0, v12}, Lcom/huawei/openalliance/ad/views/a/c;->a(Lcom/huawei/openalliance/ad/views/a/c;Lcom/huawei/openalliance/ad/views/a/b;)V

    goto :goto_3

    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/c$4;->b:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/a/c;->d(Lcom/huawei/openalliance/ad/views/a/c;)J

    move-result-wide v0

    sub-long v15, v13, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/c$4;->b:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/a/c;->e(Lcom/huawei/openalliance/ad/views/a/c;)I

    move-result v0

    int-to-long v0, v0

    cmp-long v0, v15, v0

    if-gez v0, :cond_6

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/c$4;->b:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/a/c;->e(Lcom/huawei/openalliance/ad/views/a/c;)I

    move-result v0

    int-to-long v0, v0

    sub-long v17, v0, v15

    :try_start_0
    invoke-static/range {v17 .. v18}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v19

    const-string v0, "GifPlayView"

    const-string v1, "InterruptedException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/c$4;->b:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/a/c;->f(Lcom/huawei/openalliance/ad/views/a/c;)V

    :goto_3
    return-void
.end method
