.class public abstract Lo/cjm;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/String;J)J
    .locals 7

    const-wide/16 v2, 0x0

    :try_start_0
    new-instance v4, Ljava/text/SimpleDateFormat;

    invoke-direct {v4, p0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v2, v0

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "DatesUtils"

    const-string v1, "onEvent(): ParseException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-wide v2
.end method

.method public static e(Landroid/content/Context;)V
    .locals 4

    if-nez p0, :cond_0

    const-string v0, "DatesUtils"

    const-string v1, "onCleanData null context"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "stat_v2"

    invoke-static {p0, v0}, Lo/cjs;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    const-string v0, "events"

    invoke-interface {v3, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_1
    const-string v0, "cached_v2"

    invoke-static {p0, v0}, Lo/cjv;->b(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
