.class public Lo/dom;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/dom;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lo/dom;
    .locals 2

    const-class v1, Lo/dom;

    monitor-enter v1

    .line 25
    :try_start_0
    sget-object v0, Lo/dom;->a:Lo/dom;

    if-nez v0, :cond_0

    .line 26
    new-instance v0, Lo/dom;

    invoke-direct {v0}, Lo/dom;-><init>()V

    sput-object v0, Lo/dom;->a:Lo/dom;

    .line 28
    :cond_0
    sget-object v0, Lo/dom;->a:Lo/dom;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;)I
    .locals 2

    .line 44
    invoke-static {p1}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/dnm;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 45
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 46
    const/4 v0, 0x0

    return v0

    .line 48
    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 32
    invoke-static {p1}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/dnm;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 34
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 35
    const/4 v4, 0x0

    goto :goto_0

    .line 37
    :cond_0
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 39
    :goto_0
    add-int/lit8 v4, v4, 0x1

    .line 40
    invoke-static {p1}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p2, v1, v2}, Lo/dnm;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 41
    return-void
.end method
