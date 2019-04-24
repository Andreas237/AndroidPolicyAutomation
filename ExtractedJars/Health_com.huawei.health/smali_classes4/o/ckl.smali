.class public final Lo/ckl;
.super Ljava/lang/Object;

# interfaces
.implements Lo/ckx;


# static fields
.field private static d:Lo/ckl;


# instance fields
.field private e:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ckl;->e:Landroid/content/Context;

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lo/ckl;
    .locals 3

    const-class v2, Lo/ckl;

    monitor-enter v2

    :try_start_0
    sget-object v0, Lo/ckl;->d:Lo/ckl;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Lo/ckl;

    invoke-direct {v0, p0}, Lo/ckl;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/ckl;->d:Lo/ckl;

    :cond_0
    sget-object v0, Lo/ckl;->d:Lo/ckl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method private a()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ApplySharedPref"
        }
    .end annotation

    const-string v0, "HiAnalytics"

    const-string v1, "clear data file start!"

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lo/ckl;->e:Landroid/content/Context;

    const-string v1, "stat_v2"

    invoke-static {v0, v1}, Lo/cjs;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    const-string v0, "events"

    invoke-interface {v3, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    iget-object v0, p0, Lo/ckl;->e:Landroid/content/Context;

    const-string v1, "cached_v2"

    invoke-static {v0, v1}, Lo/cjv;->b(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private c(Ljava/util/List;Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ckn;>;Ljava/lang/String;)V"
        }
    .end annotation

    iget-object v0, p0, Lo/ckl;->e:Landroid/content/Context;

    invoke-static {p1, v0}, Lo/ckv;->d(Ljava/util/List;Landroid/content/Context;)Lo/ckh;

    move-result-object v2

    invoke-virtual {v2}, Lo/ckh;->a()[Lo/cke;

    move-result-object v3

    array-length v0, v3

    if-lez v0, :cond_1

    invoke-static {}, Lo/cle;->a()Lo/cle;

    move-result-object v4

    if-eqz v4, :cond_0

    new-instance v0, Lo/ckp;

    iget-object v1, p0, Lo/ckl;->e:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p2}, Lo/ckp;-><init>(Landroid/content/Context;Lo/ckh;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Lo/cle;->e(Lo/ckx;)V

    goto :goto_0

    :cond_0
    const-string v0, "HiAnalytics"

    const-string v1, "falied to start data send task!"

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    goto :goto_1

    :cond_1
    const-string v0, "HiAnalytics"

    const-string v1, "empty event data, no need to send"

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method private d(Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lo/cky;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;T2:Ljava/lang/Object;>(Ljava/util/List<TT;>;Ljava/util/List<TT2;>;Ljava/util/Map<Ljava/lang/Object;Ljava/lang/String;>;Lo/cky;Ljava/lang/String;)V"
        }
    .end annotation

    const-string v0, "EventReportTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "choiceHandleEvents type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ciy;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lo/cke;

    invoke-interface {p2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [Lo/cke;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lo/ckd;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, [Lo/ckd;

    invoke-static {v4, v3}, Lo/ckv;->d([Lo/ckd;[Lo/cke;)Ljava/util/List;

    move-result-object v5

    invoke-interface {p3, p5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "HiAnalytics"

    const-string v1, "no upload url now"

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "preins"

    invoke-virtual {v0, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lo/ckw;

    iget-object v1, p0, Lo/ckl;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/ckw;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lo/ckw;->d()V

    :cond_0
    invoke-direct {p0, v5, p5}, Lo/ckl;->e(Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method private e(Ljava/util/List;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ckn;>;Ljava/lang/String;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    add-int/lit16 v4, v3, 0x1f4

    if-le v4, v2, :cond_0

    move v0, v2

    goto :goto_1

    :cond_0
    move v0, v4

    :goto_1
    move v4, v0

    invoke-interface {p1, v3, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v5

    :try_start_0
    invoke-direct {p0, v5, p2}, Lo/ckl;->c(Ljava/util/List;Ljava/lang/String;)V
    :try_end_0
    .catch Lo/cjq$b; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v6

    const-string v0, "EventReportTask"

    const-string v1, "doHandleEvents(): RSAEncryptionException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    move v3, v4

    goto :goto_0

    :cond_1
    goto :goto_3

    :cond_2
    const-string v0, "HiAnalytics"

    const-string v1, "no events to send"

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    return-void
.end method

.method private varargs e([Ljava/lang/Object;[Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>([TT;[Ljava/util/List<TT;>;)V"
        }
    .end annotation

    const/4 v1, 0x0

    :goto_0
    array-length v0, p1

    if-ge v1, v0, :cond_5

    aget-object v2, p1, v1

    const-string v3, ""

    instance-of v0, v2, Lo/ckd;

    if-eqz v0, :cond_0

    move-object v4, v2

    check-cast v4, Lo/ckd;

    invoke-virtual {v4}, Lo/ckd;->c()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_0
    move-object v4, v2

    check-cast v4, Lo/cke;

    invoke-virtual {v4}, Lo/cke;->c()Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "oper"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x0

    aget-object v0, p2, v0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    const-string v0, "maint"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    aget-object v0, p2, v0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    const-string v0, "preins"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x2

    aget-object v0, p2, v0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_5
    return-void
.end method


# virtual methods
.method public run()V
    .locals 17

    const-string v0, "HiAnalytics"

    const-string v1, "run report"

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lo/ckt;->b()Lo/cky;

    move-result-object v6

    invoke-interface {v6}, Lo/cky;->d()Lo/cit;

    move-result-object v7

    invoke-virtual {v7}, Lo/cit;->y()Ljava/util/HashMap;

    move-result-object v8

    if-nez v8, :cond_0

    return-void

    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ckl;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cjn;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/ckl;->e:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/ckd;->e(Landroid/content/SharedPreferences;Landroid/content/Context;)[Lo/ckd;

    move-result-object v9

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/util/List;

    const/4 v1, 0x0

    aput-object v10, v0, v1

    const/4 v1, 0x1

    aput-object v11, v0, v1

    const/4 v1, 0x2

    aput-object v12, v0, v1

    move-object/from16 v1, p0

    invoke-direct {v1, v9, v0}, Lo/ckl;->e([Ljava/lang/Object;[Ljava/util/List;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ckl;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cjn;->d(Landroid/content/Context;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lo/cke;->c(Lorg/json/JSONObject;)[Lo/cke;

    move-result-object v16

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/util/List;

    const/4 v1, 0x0

    aput-object v13, v0, v1

    const/4 v1, 0x1

    aput-object v14, v0, v1

    const/4 v1, 0x2

    aput-object v15, v0, v1

    move-object/from16 v1, p0

    move-object/from16 v2, v16

    invoke-direct {v1, v2, v0}, Lo/ckl;->e([Ljava/lang/Object;[Ljava/util/List;)V

    invoke-direct/range {p0 .. p0}, Lo/ckl;->a()V

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ckl;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cjh;->b(Landroid/content/Context;)Lo/cjh;

    move-result-object v0

    invoke-static {}, Lo/cjq;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cjh;->c(Ljava/lang/String;)V

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    :cond_1
    move-object/from16 v0, p0

    move-object v1, v10

    move-object v2, v13

    move-object v3, v8

    move-object v4, v6

    const-string v5, "oper"

    invoke-direct/range {v0 .. v5}, Lo/ckl;->d(Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lo/cky;Ljava/lang/String;)V

    :cond_2
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_3

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    :cond_3
    move-object/from16 v0, p0

    move-object v1, v11

    move-object v2, v14

    move-object v3, v8

    move-object v4, v6

    const-string v5, "maint"

    invoke-direct/range {v0 .. v5}, Lo/ckl;->d(Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lo/cky;Ljava/lang/String;)V

    :cond_4
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_5

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    :cond_5
    move-object/from16 v0, p0

    move-object v1, v12

    move-object v2, v15

    move-object v3, v8

    move-object v4, v6

    const-string v5, "preins"

    invoke-direct/range {v0 .. v5}, Lo/ckl;->d(Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lo/cky;Ljava/lang/String;)V

    :cond_6
    return-void
.end method
