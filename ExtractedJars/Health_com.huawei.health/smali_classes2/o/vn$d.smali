.class final Lo/vn$d;
.super Lo/vr$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/vn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "d"
.end annotation


# instance fields
.field final synthetic d:Lo/vn;


# direct methods
.method private constructor <init>(Lo/vn;)V
    .locals 0

    .line 273
    iput-object p1, p0, Lo/vn$d;->d:Lo/vn;

    invoke-direct {p0}, Lo/vr$a;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/vn;Lo/vn$5;)V
    .locals 0

    .line 273
    invoke-direct {p0, p1}, Lo/vn$d;-><init>(Lo/vn;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;IJJLjava/lang/String;)V
    .locals 13

    .line 276
    const-string v0, "PowerKitApi"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onPowerOverUsing moudle:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " resource:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " duration:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-wide/from16 v2, p3

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " time:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-wide/from16 v2, p5

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " extend:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p7

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 277
    iget-object v0, p0, Lo/vn$d;->d:Lo/vn;

    invoke-static {v0}, Lo/vn;->e(Lo/vn;)Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8

    .line 278
    :try_start_0
    iget-object v0, p0, Lo/vn$d;->d:Lo/vn;

    invoke-static {v0}, Lo/vn;->a(Lo/vn;)Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 279
    monitor-exit v8

    return-void

    .line 282
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/vn$d;->d:Lo/vn;

    invoke-static {v0}, Lo/vn;->a(Lo/vn;)Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/vp;

    .line 283
    iget-object v0, p0, Lo/vn$d;->d:Lo/vn;

    invoke-static {v0}, Lo/vn;->c(Lo/vn;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/util/ArrayList;

    .line 284
    if-eqz v11, :cond_1

    const/16 v0, 0x32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 285
    move-object v0, v10

    move-object v1, p1

    move v2, p2

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-object/from16 v7, p7

    invoke-interface/range {v0 .. v7}, Lo/vp;->a(Ljava/lang/String;IJJLjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 287
    :cond_1
    goto :goto_0

    .line 288
    :cond_2
    monitor-exit v8

    goto :goto_1

    :catchall_0
    move-exception v12

    monitor-exit v8

    throw v12

    .line 289
    :goto_1
    return-void
.end method
