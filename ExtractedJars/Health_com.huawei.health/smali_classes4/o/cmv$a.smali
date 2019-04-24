.class abstract Lo/cmv$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmv$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cmv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;Lo/cmv$c<TT;>;"
    }
.end annotation


# static fields
.field private static final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Class;Ljava/lang/Object;>;"
        }
    .end annotation
.end field


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/cmv$a;->e:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmv$a;->a:Ljava/lang/String;

    .line 48
    iput-object p1, p0, Lo/cmv$a;->a:Ljava/lang/String;

    .line 49
    return-void
.end method

.method static synthetic a(Lo/cmv$a;ILjava/lang/Object;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2}, Lo/cmv$a;->e(ILjava/lang/Object;)V

    return-void
.end method

.method private e(ILjava/lang/Object;)V
    .locals 5

    .line 106
    invoke-static {}, Lo/cmv;->c()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lo/cmv$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/HashSet;

    .line 107
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 108
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 109
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 110
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cmj;

    .line 111
    const/4 v0, 0x2

    if-ne v0, p1, :cond_0

    .line 112
    invoke-virtual {v4, p2}, Lo/cmj;->a(Ljava/lang/Object;)V

    goto :goto_1

    .line 114
    :cond_0
    const/4 v0, 0x1

    if-ne v0, p1, :cond_1

    .line 115
    invoke-virtual {v4, p2}, Lo/cmj;->e(Ljava/lang/Object;)V

    .line 117
    :cond_1
    :goto_1
    goto :goto_0

    .line 119
    :cond_2
    return-void
.end method


# virtual methods
.method public final c(Landroid/content/Context;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)TT;"
        }
    .end annotation

    .line 53
    sget-object v3, Lo/cmv$a;->e:Ljava/util/Map;

    monitor-enter v3

    .line 55
    :try_start_0
    sget-object v0, Lo/cmv$a;->e:Ljava/util/Map;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 56
    const-string v0, "HealthOpenSDK_OSSR"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getService service = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    if-nez v4, :cond_1

    .line 58
    if-nez p1, :cond_0

    .line 60
    monitor-exit v3

    const/4 v0, 0x0

    return-object v0

    .line 62
    :cond_0
    :try_start_1
    new-instance v0, Lo/cmv$a$2;

    invoke-direct {v0, p0}, Lo/cmv$a$2;-><init>(Lo/cmv$a;)V

    invoke-virtual {p0, p1, v0}, Lo/cmv$a;->e(Landroid/content/Context;Lo/cmo;)Ljava/lang/Object;

    move-result-object v4

    .line 80
    sget-object v0, Lo/cmv$a;->e:Ljava/util/Map;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    :cond_1
    monitor-exit v3

    return-object v4

    .line 83
    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5
.end method

.method public c()V
    .locals 6

    .line 88
    sget-object v3, Lo/cmv$a;->e:Ljava/util/Map;

    monitor-enter v3

    .line 90
    :try_start_0
    sget-object v0, Lo/cmv$a;->e:Ljava/util/Map;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 91
    if-nez v4, :cond_0

    .line 92
    const-string v0, "HealthOpenSDK_OSSR"

    const-string v1, "no need to release"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    monitor-exit v3

    return-void

    .line 95
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lo/cmv$a;->d()V

    .line 96
    sget-object v0, Lo/cmv$a;->e:Ljava/util/Map;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    monitor-exit v3

    return-void

    .line 98
    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5
.end method

.method protected abstract d()V
.end method

.method protected abstract e(Landroid/content/Context;Lo/cmo;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lo/cmo;)TT;"
        }
    .end annotation
.end method
