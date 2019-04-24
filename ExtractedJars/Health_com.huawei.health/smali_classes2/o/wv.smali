.class public Lo/wv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/wv$c;
    }
.end annotation


# static fields
.field private static a:Lo/wv$c;

.field private static b:Lo/wv;

.field private static e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/ws;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    return-void
.end method

.method public static a(Lo/wv$c;)V
    .locals 0

    .line 22
    sput-object p0, Lo/wv;->a:Lo/wv$c;

    .line 23
    return-void
.end method

.method public static b()Lo/wv;
    .locals 4

    .line 40
    const-class v2, Lo/wv;

    monitor-enter v2

    .line 41
    :try_start_0
    sget-object v0, Lo/wv;->b:Lo/wv;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 42
    new-instance v0, Lo/wv;

    invoke-direct {v0}, Lo/wv;-><init>()V

    sput-object v0, Lo/wv;->b:Lo/wv;

    .line 43
    sget-object v0, Lo/wv$c;->b:Lo/wv$c;

    sput-object v0, Lo/wv;->a:Lo/wv$c;

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/wv;->e:Ljava/util/ArrayList;

    .line 46
    :cond_0
    sget-object v0, Lo/wv;->b:Lo/wv;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 47
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public c(Lo/ws;)V
    .locals 3

    .line 56
    const-class v1, Lo/wv;

    monitor-enter v1

    .line 57
    :try_start_0
    sget-object v0, Lo/wv;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 58
    sget-object v0, Lo/wv;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 61
    :goto_0
    return-void
.end method

.method public d(I)V
    .locals 6

    .line 70
    const-class v2, Lo/wv;

    monitor-enter v2

    .line 71
    sparse-switch p1, :sswitch_data_0

    goto :goto_1

    .line 73
    :sswitch_0
    :try_start_0
    sget-object v0, Lo/wv;->a:Lo/wv$c;

    sget-object v1, Lo/wv$c;->b:Lo/wv$c;

    if-ne v0, v1, :cond_0

    .line 74
    sget-object v0, Lo/wv$c;->c:Lo/wv$c;

    invoke-static {v0}, Lo/wv;->a(Lo/wv$c;)V

    goto :goto_0

    .line 76
    :cond_0
    sget-object v0, Lo/wv;->a:Lo/wv$c;

    sget-object v1, Lo/wv$c;->d:Lo/wv$c;

    if-ne v0, v1, :cond_1

    .line 78
    goto :goto_1

    .line 81
    :cond_1
    :goto_0
    :sswitch_1
    sget-object v0, Lo/wv$c;->f:Lo/wv$c;

    invoke-static {v0}, Lo/wv;->a(Lo/wv$c;)V

    .line 82
    .line 86
    :goto_1
    sget-object v0, Lo/wv;->a:Lo/wv$c;

    sget-object v1, Lo/wv$c;->f:Lo/wv$c;

    if-ne v0, v1, :cond_2

    .line 87
    sget-object v0, Lo/wv;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ws;

    .line 88
    sget-object v0, Lo/wv;->a:Lo/wv$c;

    invoke-interface {v4, v0}, Lo/ws;->c(Lo/wv$c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    goto :goto_2

    .line 92
    :cond_2
    monitor-exit v2

    goto :goto_3

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 94
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method public e(Lo/ws;)V
    .locals 3

    .line 64
    const-class v1, Lo/wv;

    monitor-enter v1

    .line 65
    :try_start_0
    sget-object v0, Lo/wv;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 67
    :goto_0
    return-void
.end method
