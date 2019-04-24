.class public Lo/cku;
.super Ljava/lang/Object;


# static fields
.field private static b:J

.field private static c:Lo/cit;

.field private static e:Landroid/content/Context;


# direct methods
.method public static b(Landroid/content/Context;)V
    .locals 7

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    sget-object v0, Lo/cku;->e:Landroid/content/Context;

    if-eqz v0, :cond_0

    sget-object v0, Lo/cku;->c:Lo/cit;

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/cjo;->a(ILo/cit;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "HiAnalytics/Server"

    const-string v1, "onPause null context or SDK was not init."

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lo/cku;->b:J

    sget-object v0, Lo/cku;->e:Landroid/content/Context;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    const-string v5, "$AppOnResume"

    const-string v6, "OnResume"

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lo/cku;->e(Landroid/content/Context;Ljava/lang/String;JLjava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static b(Landroid/content/Context;Ljava/lang/String;Ljava/util/LinkedHashMap;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;Ljava/util/LinkedHashMap<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sget-wide v0, Lo/cku;->b:J

    sub-long v9, v7, v0

    move-object v0, p0

    move-object v1, p1

    sget-wide v2, Lo/cku;->b:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    const-wide/16 v2, 0x0

    goto :goto_0

    :cond_0
    move-wide v2, v9

    :goto_0
    move-object v4, p2

    const-string v5, "$AppOnPause"

    const-string v6, "OnPause"

    invoke-static/range {v0 .. v6}, Lo/cku;->e(Landroid/content/Context;Ljava/lang/String;JLjava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static b(Landroid/content/Context;Lo/cit;)V
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cku;->e:Landroid/content/Context;

    sput-object p1, Lo/cku;->c:Lo/cit;

    invoke-static {p0}, Lo/ckq;->e(Landroid/content/Context;)V

    return-void
.end method

.method public static c()V
    .locals 1

    sget-object v0, Lo/cku;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cku;->c(Landroid/content/Context;)V

    return-void
.end method

.method public static c(ILjava/lang/String;Ljava/util/LinkedHashMap;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Ljava/util/LinkedHashMap<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    sget-object v0, Lo/cku;->e:Landroid/content/Context;

    sget-object v1, Lo/cku;->c:Lo/cit;

    invoke-static {v0, p0, p1, p2, v1}, Lo/cjo;->b(Landroid/content/Context;ILjava/lang/String;Ljava/util/LinkedHashMap;Lo/cit;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p2}, Lo/cjn;->e(Ljava/util/LinkedHashMap;)Lorg/json/JSONObject;

    move-result-object v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    const/4 v0, 0x2

    if-ne v0, p0, :cond_1

    const-string v0, "yyyy-MM-dd"

    invoke-static {v0, v8, v9}, Lo/cjm;->a(Ljava/lang/String;J)J

    move-result-wide v8

    :cond_1
    new-instance v0, Lo/ckm;

    sget-object v1, Lo/cku;->e:Landroid/content/Context;

    move v2, p0

    move-object v3, p1

    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    move-wide v5, v8

    invoke-direct/range {v0 .. v6}, Lo/ckm;-><init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;J)V

    move-object v10, v0

    invoke-static {v10}, Lo/cku;->d(Lo/ckx;)V

    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 3

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    sget-object v0, Lo/cku;->e:Landroid/content/Context;

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "HiAnalytics/Server"

    const-string v1, "onPause null context or SDK was not init."

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {p0}, Lo/ckl;->a(Landroid/content/Context;)Lo/ckl;

    move-result-object v2

    invoke-static {v2}, Lo/cku;->d(Lo/ckx;)V

    return-void
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const-string v0, "HiAnalytics/Server"

    const-string v1, "onEvent null context"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v0, Lo/cku;->e:Landroid/content/Context;

    sget-object v1, Lo/cku;->c:Lo/cit;

    invoke-static {v0, p1, p2, v1}, Lo/cjo;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lo/cit;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "_constants"

    :try_start_0
    invoke-virtual {v6, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v7

    const-string v0, "HiAnalytics/Server"

    const-string v1, "onEvent(): JSONException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v0, Lo/ckm;

    move-object v1, p0

    move-object v2, p1

    move-object v3, v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Lo/ckm;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V

    move-object v8, v0

    invoke-static {v8}, Lo/cku;->d(Lo/ckx;)V

    return-void
.end method

.method static d(Lo/ckx;)V
    .locals 6

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const-string v0, "HiAnalytics/Server"

    const-string v1, "runTaskHandler - task is null"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lo/cle;->c()Lo/cle;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5, p0}, Lo/cle;->e(Lo/ckx;)V

    goto :goto_0

    :cond_1
    const-string v0, "HiAnalytics/Server"

    const-string v1, "SessionHandler is NULL, failed to call task: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static e(Landroid/content/Context;)V
    .locals 3

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    sget-object v0, Lo/cku;->e:Landroid/content/Context;

    if-eqz v0, :cond_0

    sget-object v0, Lo/cku;->c:Lo/cit;

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/cjo;->a(ILo/cit;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "HiAnalytics/Server"

    const-string v1, "onPause null context or SDK was not init."

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    sget-object v0, Lo/cku;->e:Landroid/content/Context;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/cku;->b(Landroid/content/Context;Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    const-wide/16 v0, 0x0

    sput-wide v0, Lo/cku;->b:J

    return-void
.end method

.method private static e(Landroid/content/Context;Ljava/lang/String;JLjava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;JLjava/util/LinkedHashMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    invoke-static {p1, p2, p3, p4, p6}, Lo/cjo;->a(Ljava/lang/String;JLjava/util/LinkedHashMap;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    new-instance v0, Lo/ckm;

    move-object v1, p0

    move-object v2, p5

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Lo/ckm;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V

    move-object v7, v0

    invoke-static {v7}, Lo/cku;->d(Lo/ckx;)V

    return-void
.end method
