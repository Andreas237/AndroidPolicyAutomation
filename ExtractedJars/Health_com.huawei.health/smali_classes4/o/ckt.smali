.class public final Lo/ckt;
.super Ljava/lang/Object;

# interfaces
.implements Lo/cky;


# static fields
.field private static a:Lo/cit;

.field private static volatile b:Z

.field private static d:Lo/ckt;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field private static e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lo/ckt;->b:Z

    new-instance v0, Lo/ckt;

    invoke-direct {v0}, Lo/ckt;-><init>()V

    sput-object v0, Lo/ckt;->d:Lo/ckt;

    const/4 v0, 0x0

    sput-object v0, Lo/ckt;->e:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/content/Context;Lo/civ;)V
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/ckt;->e:Landroid/content/Context;

    new-instance v0, Lo/cit;

    invoke-direct {v0}, Lo/cit;-><init>()V

    sput-object v0, Lo/ckt;->a:Lo/cit;

    invoke-static {p1}, Lo/ckt;->c(Lo/civ;)Z

    sget-object v0, Lo/ckt;->a:Lo/cit;

    invoke-static {p0, v0}, Lo/cku;->b(Landroid/content/Context;Lo/cit;)V

    return-void
.end method

.method private static a(Lo/civ;)V
    .locals 8

    invoke-virtual {p0}, Lo/civ;->b()Ljava/util/HashMap;

    move-result-object v2

    sget-object v0, Lo/ckt;->e:Landroid/content/Context;

    const-string v1, "global_v2"

    invoke-static {v0, v1}, Lo/cjs;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v3

    if-eqz v3, :cond_2

    const-string v0, "upload_url"

    const-string v1, ""

    invoke-static {v3, v0, v1}, Lo/cjs;->d(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "preins"

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lo/ckt;->a:Lo/cit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cit;->a(Z)V

    goto :goto_0

    :cond_0
    sget-object v0, Lo/ckt;->a:Lo/cit;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cit;->a(Z)V

    :goto_0
    const-string v0, "uuid"

    const-string v1, ""

    invoke-static {v3, v0, v1}, Lo/cjs;->d(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v0, "-"

    const-string v1, ""

    invoke-virtual {v6, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    sget-object v0, Lo/ckt;->a:Lo/cit;

    invoke-virtual {v0, v7}, Lo/cit;->n(Ljava/lang/String;)V

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "uuid"

    invoke-interface {v0, v1, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_1

    :cond_1
    sget-object v0, Lo/ckt;->a:Lo/cit;

    invoke-virtual {v0, v5}, Lo/cit;->n(Ljava/lang/String;)V

    :cond_2
    :goto_1
    const-string v0, "oper"

    invoke-static {v2, v0}, Lo/ckt;->d(Ljava/util/Map;Ljava/lang/String;)V

    const-string v0, "maint"

    invoke-static {v2, v0}, Lo/ckt;->d(Ljava/util/Map;Ljava/lang/String;)V

    sget-object v0, Lo/ckt;->a:Lo/cit;

    invoke-virtual {v0}, Lo/cit;->x()V

    sget-object v0, Lo/ckt;->a:Lo/cit;

    invoke-virtual {v0, v2}, Lo/cit;->b(Ljava/util/HashMap;)V

    return-void
.end method

.method public static declared-synchronized a()Z
    .locals 3

    const-class v1, Lo/ckt;

    monitor-enter v1

    :try_start_0
    sget-boolean v0, Lo/ckt;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static b()Lo/cky;
    .locals 1

    invoke-static {}, Lo/ckt;->e()Lo/ckt;

    move-result-object v0

    return-object v0
.end method

.method private static c(Lo/civ;)Z
    .locals 4

    sget-object v0, Lo/ckt;->a:Lo/cit;

    invoke-virtual {v0}, Lo/cit;->z()V

    sget-object v0, Lo/ckt;->a:Lo/cit;

    sget-object v1, Lo/ckt;->e:Landroid/content/Context;

    invoke-static {v0, p0, v1}, Lo/cjo;->a(Lo/cit;Lo/civ;Landroid/content/Context;)V

    sget-object v0, Lo/ckt;->a:Lo/cit;

    invoke-static {}, Lo/cjx;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cit;->e(Ljava/lang/String;)V

    sget-object v0, Lo/ckt;->a:Lo/cit;

    sget-object v1, Lo/ckt;->e:Landroid/content/Context;

    invoke-static {v1}, Lo/cjx;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cit;->a(Ljava/lang/String;)V

    sget-object v0, Lo/ckt;->a:Lo/cit;

    sget-object v1, Lo/ckt;->e:Landroid/content/Context;

    invoke-static {v1}, Lo/cjx;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cit;->d(Ljava/lang/String;)V

    sget-object v0, Lo/ckt;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cjx;->a(Landroid/content/Context;)Landroid/util/Pair;

    move-result-object v2

    sget-object v0, Lo/ckt;->a:Lo/cit;

    iget-object v1, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/cit;->b(Ljava/lang/String;)V

    sget-object v0, Lo/ckt;->a:Lo/cit;

    iget-object v1, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/cit;->c(Ljava/lang/String;)V

    invoke-static {p0}, Lo/ckt;->a(Lo/civ;)V

    sget-object v0, Lo/ckt;->a:Lo/cit;

    invoke-virtual {v0}, Lo/cit;->s()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lo/ckt;->a:Lo/cit;

    invoke-virtual {v0, v3}, Lo/cit;->p(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lo/ckt;->a:Lo/cit;

    sget-object v1, Lo/ckt;->e:Landroid/content/Context;

    invoke-static {v1}, Lo/cjn;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cit;->p(Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private static d(Ljava/util/Map;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Object;Ljava/lang/String;>;Ljava/lang/String;)V"
        }
    .end annotation

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "(https://)[\\w-]+\\.[\\w-]+(\\.hicloud\\.com:)[\\d]{2,5}(\\\\|\\/)?"

    invoke-static {v2, v0}, Lo/cjo;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "AnalyticsImpl"

    const-string v1, "collectURL Parameter error!"

    invoke-static {v0, v1}, Lo/ciy;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public static declared-synchronized d(Lo/civ;Z)V
    .locals 3

    const-class v2, Lo/ckt;

    monitor-enter v2

    :try_start_0
    sget-boolean v0, Lo/ckt;->b:Z

    if-eqz v0, :cond_2

    const-string v0, "HiAnalytics"

    const-string v1, "Builder.refresh(boolean enableCleanData) is execute."

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lo/ckt;->a:Lo/cit;

    if-nez v0, :cond_0

    const-string v0, "AnalyticsImpl"

    const-string v1, "refresh() HiAnalyticsConf is null"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :cond_0
    if-eqz p1, :cond_1

    sget-object v0, Lo/ckt;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cjm;->e(Landroid/content/Context;)V

    :cond_1
    invoke-static {p0}, Lo/ckt;->c(Lo/civ;)Z

    goto :goto_0

    :cond_2
    const-string v0, "HiAnalytics"

    const-string v1, "Please execute Builder.create()"

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v2

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method private static declared-synchronized e()Lo/ckt;
    .locals 3

    const-class v1, Lo/ckt;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lo/ckt;->d:Lo/ckt;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static declared-synchronized e(Lo/civ;Landroid/content/Context;)V
    .locals 3

    const-class v2, Lo/ckt;

    monitor-enter v2

    :try_start_0
    sget-boolean v0, Lo/ckt;->b:Z

    if-nez v0, :cond_2

    const-string v0, "HiAnalytics"

    const-string v1, "HiAnalyticsImpl.init() is execute."

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    const-string v0, "AnalyticsImpl"

    const-string v1, "init() HiAnalyticsConf is null"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit v2

    return-void

    :cond_1
    invoke-static {p1, p0}, Lo/ckt;->a(Landroid/content/Context;Lo/civ;)V

    const/4 v0, 0x1

    sput-boolean v0, Lo/ckt;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit v2

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method


# virtual methods
.method public c()V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {}, Lo/cis;->d()J

    move-result-wide v0

    sub-long v0, v4, v0

    const-wide/16 v2, 0x7530

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const-string v0, "AnalyticsImpl"

    const-string v1, "begin to call onReport!"

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4, v5}, Lo/cis;->c(J)V

    invoke-static {}, Lo/cku;->c()V

    :cond_0
    return-void
.end method

.method public d()Lo/cit;
    .locals 1

    sget-object v0, Lo/ckt;->a:Lo/cit;

    return-object v0
.end method
