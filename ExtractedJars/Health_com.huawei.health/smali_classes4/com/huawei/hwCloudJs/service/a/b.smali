.class public final Lcom/huawei/hwCloudJs/service/a/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwCloudJs/service/a/b$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "AuthManager"

.field private static e:Lcom/huawei/hwCloudJs/service/a/b; = null


# instance fields
.field private final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/huawei/hwCloudJs/service/a/a/a;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private final d:Lcom/huawei/hwCloudJs/service/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/hwCloudJs/service/a/b;

    invoke-direct {v0}, Lcom/huawei/hwCloudJs/service/a/b;-><init>()V

    sput-object v0, Lcom/huawei/hwCloudJs/service/a/b;->e:Lcom/huawei/hwCloudJs/service/a/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b;->b:Ljava/util/HashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b;->c:Ljava/util/ArrayList;

    new-instance v0, Lcom/huawei/hwCloudJs/service/a/a;

    invoke-direct {v0}, Lcom/huawei/hwCloudJs/service/a/a;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b;->d:Lcom/huawei/hwCloudJs/service/a/a;

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwCloudJs/service/a/b;)Lcom/huawei/hwCloudJs/service/a/a;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b;->d:Lcom/huawei/hwCloudJs/service/a/a;

    return-object v0
.end method

.method public static a()Lcom/huawei/hwCloudJs/service/a/b;
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/service/a/b;->e:Lcom/huawei/hwCloudJs/service/a/b;

    return-object v0
.end method

.method private a(Lcom/huawei/hwCloudJs/service/a/a/a;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b;->d:Lcom/huawei/hwCloudJs/service/a/a;

    invoke-virtual {v0, p1}, Lcom/huawei/hwCloudJs/service/a/a;->a(Lcom/huawei/hwCloudJs/service/a/a/a;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwCloudJs/service/a/b;Ljava/lang/String;Lcom/huawei/hwCloudJs/service/a/a/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/hwCloudJs/service/a/b;->a(Ljava/lang/String;Lcom/huawei/hwCloudJs/service/a/a/a;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwCloudJs/service/a/b;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwCloudJs/service/a/b$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/hwCloudJs/service/a/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwCloudJs/service/a/b$a;)V

    return-void
.end method

.method private a(Ljava/lang/String;Lcom/huawei/hwCloudJs/service/a/a/a;)V
    .locals 3

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/a/b;->b:Ljava/util/HashMap;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwCloudJs/service/a/b$a;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;Lcom/huawei/hwCloudJs/service/a/b$a;)V"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hwCloudJs/d/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, -0x2

    invoke-interface {p4, v0}, Lcom/huawei/hwCloudJs/service/a/b$a;->a(I)V

    return-void

    :cond_0
    new-instance v2, Lcom/huawei/hwCloudJs/service/a/a/b;

    invoke-direct {v2, p1}, Lcom/huawei/hwCloudJs/service/a/a/b;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lcom/huawei/hwCloudJs/service/http/b;->a(Lcom/huawei/hwCloudJs/service/http/a/c;)Lcom/huawei/hwCloudJs/service/http/a/d;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hwCloudJs/service/a/a/c;

    invoke-virtual {v3}, Lcom/huawei/hwCloudJs/service/a/a/c;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    invoke-virtual {v3}, Lcom/huawei/hwCloudJs/service/a/a/c;->b()I

    move-result v0

    if-nez v0, :cond_2

    new-instance v4, Lcom/huawei/hwCloudJs/service/a/a/a;

    invoke-direct {v4}, Lcom/huawei/hwCloudJs/service/a/a/a;-><init>()V

    invoke-virtual {v3}, Lcom/huawei/hwCloudJs/service/a/a/c;->d()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwCloudJs/service/a/a/a;->b(Ljava/util/List;)V

    invoke-virtual {v3}, Lcom/huawei/hwCloudJs/service/a/a/c;->a()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwCloudJs/service/a/a/a;->a(Ljava/util/List;)V

    invoke-virtual {v4, p1}, Lcom/huawei/hwCloudJs/service/a/a/a;->a(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hwCloudJs/service/a/a/a;->a(J)V

    invoke-static {p2, p3, v4}, Lcom/huawei/hwCloudJs/service/a/c;->a(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwCloudJs/service/a/a/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {p4, v0}, Lcom/huawei/hwCloudJs/service/a/b$a;->a(I)V

    invoke-direct {p0, p1, v4}, Lcom/huawei/hwCloudJs/service/a/b;->a(Ljava/lang/String;Lcom/huawei/hwCloudJs/service/a/a/a;)V

    invoke-direct {p0, v4}, Lcom/huawei/hwCloudJs/service/a/b;->a(Lcom/huawei/hwCloudJs/service/a/a/a;)V

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    invoke-interface {p4, v0}, Lcom/huawei/hwCloudJs/service/a/b$a;->a(I)V

    :goto_0
    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lcom/huawei/hwCloudJs/service/a/a/c;->b()I

    move-result v0

    invoke-interface {p4, v0}, Lcom/huawei/hwCloudJs/service/a/b$a;->a(I)V

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Lcom/huawei/hwCloudJs/service/a/a/c;->f()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    invoke-virtual {v3}, Lcom/huawei/hwCloudJs/service/a/a/c;->e()I

    move-result v0

    invoke-interface {p4, v0}, Lcom/huawei/hwCloudJs/service/a/b$a;->a(I)V

    goto :goto_1

    :cond_4
    invoke-virtual {v3}, Lcom/huawei/hwCloudJs/service/a/a/c;->f()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    const/4 v0, -0x3

    invoke-interface {p4, v0}, Lcom/huawei/hwCloudJs/service/a/b$a;->a(I)V

    goto :goto_1

    :cond_5
    const/4 v0, -0x4

    invoke-interface {p4, v0}, Lcom/huawei/hwCloudJs/service/a/b$a;->a(I)V

    :goto_1
    return-void
.end method

.method private c(Ljava/lang/String;)Z
    .locals 9

    const/4 v2, 0x0

    :try_start_0
    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "AuthManager"

    const-string v1, "JS isUrlWhileList MalformedURLException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0

    :goto_0
    invoke-virtual {v2}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v4, p0, Lcom/huawei/hwCloudJs/service/a/b;->c:Ljava/util/ArrayList;

    monitor-enter v4

    :try_start_1
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "AuthManager"

    const-string v1, "JS getSercuredUrl empty ,true"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v4

    const/4 v0, 0x0

    return v0

    :cond_0
    :try_start_2
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "AuthManager"

    const-string v1, "JS pattern true"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v4

    const/4 v0, 0x1

    return v0

    :cond_1
    goto :goto_2

    :catch_1
    move-exception v7

    const-string v0, "AuthManager"

    const-string v1, "JS PatternSyntaxException"

    :try_start_4
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :goto_2
    goto :goto_1

    :cond_2
    const-string v0, "AuthManager"

    const-string v1, "JS isUrlWhileList false!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v4

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method private d(Ljava/lang/String;)Z
    .locals 6

    iget-object v2, p0, Lcom/huawei/hwCloudJs/service/a/b;->c:Ljava/util/ArrayList;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "AuthManager"

    const-string v1, "JS getSercuredUrl empty ,true"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    const/4 v0, 0x0

    return v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    monitor-exit v2

    const/4 v0, 0x1

    return v0

    :cond_1
    goto :goto_0

    :cond_2
    const-string v0, "AuthManager"

    const-string v1, "JS isUrlWhileList false!"

    :try_start_2
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v2

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 3

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/a/b;->c:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwCloudJs/service/a/b$a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;Lcom/huawei/hwCloudJs/service/a/b$a;)V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/hwCloudJs/service/a/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p4, v0}, Lcom/huawei/hwCloudJs/service/a/b$a;->a(I)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/hwCloudJs/service/a/b$1;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/huawei/hwCloudJs/service/a/b$1;-><init>(Lcom/huawei/hwCloudJs/service/a/b;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwCloudJs/service/a/b$a;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    new-instance v2, Lcom/huawei/hwCloudJs/service/a/a/b;

    invoke-direct {v2, p1}, Lcom/huawei/hwCloudJs/service/a/a/b;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lcom/huawei/hwCloudJs/service/http/b;->a(Lcom/huawei/hwCloudJs/service/http/a/c;)Lcom/huawei/hwCloudJs/service/http/a/d;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hwCloudJs/service/a/a/c;

    invoke-virtual {v3}, Lcom/huawei/hwCloudJs/service/a/a/c;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {v3}, Lcom/huawei/hwCloudJs/service/a/a/c;->b()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v3}, Lcom/huawei/hwCloudJs/service/a/a/c;->d()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/huawei/hwCloudJs/service/a/c;->a(Ljava/util/List;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/huawei/hwCloudJs/service/a/b;->b:Ljava/util/HashMap;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hwCloudJs/service/a/a/a;

    if-eqz v3, :cond_0

    invoke-static {p2, p3, v3}, Lcom/huawei/hwCloudJs/service/a/c;->a(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwCloudJs/service/a/a/a;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    :goto_0
    return v1
.end method

.method public b(Ljava/lang/String;)Z
    .locals 3

    const-string v0, "AuthManager"

    const-string v1, "JS isUrlWhileList"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "AuthManager"

    const-string v1, "JS isUrlWhileList isEmpty"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/hwCloudJs/service/a/b;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lcom/huawei/hwCloudJs/service/a/b;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    return v2
.end method
