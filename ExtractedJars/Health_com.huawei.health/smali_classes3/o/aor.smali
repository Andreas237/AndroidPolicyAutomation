.class public final Lo/aor;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lo/aor;


# instance fields
.field private a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private c:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/Integer;Landroid/content/Intent;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/aoo;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 65
    new-instance v0, Lo/aor;

    invoke-direct {v0}, Lo/aor;-><init>()V

    sput-object v0, Lo/aor;->e:Lo/aor;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lo/aor;->a:Ljava/util/Set;

    .line 70
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lo/aor;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/aor;->d:Ljava/util/ArrayList;

    .line 89
    return-void
.end method

.method private static c(Landroid/content/Context;)Ljava/lang/Runnable;
    .locals 1

    .line 334
    new-instance v0, Lo/aor$3;

    invoke-direct {v0, p0}, Lo/aor$3;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static c()V
    .locals 1

    .line 192
    invoke-static {}, Lo/azc;->c()Lo/azc;

    move-result-object v0

    invoke-virtual {v0}, Lo/azc;->g()V

    .line 193
    invoke-static {}, Lo/ayv;->c()Lo/ayv;

    move-result-object v0

    invoke-virtual {v0}, Lo/ayv;->g()V

    .line 194
    invoke-static {}, Lo/ayu;->e()Lo/ayu;

    move-result-object v0

    invoke-virtual {v0}, Lo/ayu;->g()V

    .line 195
    return-void
.end method

.method public static d()Lo/aor;
    .locals 1

    .line 84
    sget-object v0, Lo/aor;->e:Lo/aor;

    return-object v0
.end method

.method private d(Landroid/app/Activity;Z)V
    .locals 0

    .line 257
    return-void
.end method


# virtual methods
.method public b(Landroid/content/Context;)V
    .locals 2

    .line 329
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1}, Lo/aor;->c(Landroid/content/Context;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->d(Ljava/lang/Runnable;)V

    .line 330
    return-void
.end method

.method public c(Landroid/app/Activity;Lo/aoo;ZZ)V
    .locals 4

    .line 218
    iget-object v2, p0, Lo/aor;->d:Ljava/util/ArrayList;

    monitor-enter v2

    .line 220
    :try_start_0
    iget-object v0, p0, Lo/aor;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 223
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    .line 225
    if-eqz p4, :cond_0

    .line 228
    invoke-direct {p0, p1, p3}, Lo/aor;->d(Landroid/app/Activity;Z)V

    goto :goto_1

    .line 230
    :cond_0
    iget-object v0, p0, Lo/aor;->a:Ljava/util/Set;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 232
    iget-object v0, p0, Lo/aor;->a:Ljava/util/Set;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 233
    invoke-direct {p0, p1, p3}, Lo/aor;->d(Landroid/app/Activity;Z)V

    goto :goto_1

    .line 237
    :cond_1
    const-string v0, "AccountLoginManager"

    const-string v1, "st error. hasCalledHwAccountLogin=true"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    :goto_1
    return-void
.end method

.method public d(Landroid/app/Activity;Lo/aoo;Z)V
    .locals 1

    .line 206
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lo/aor;->c(Landroid/app/Activity;Lo/aoo;ZZ)V

    .line 207
    return-void
.end method

.method public e(Landroid/content/Context;)V
    .locals 4

    .line 99
    const-string v0, "AccountLoginManager"

    const-string v1, "Enter: logoutOperation"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    invoke-static {}, Lo/asj;->a()Lo/asj;

    move-result-object v0

    invoke-virtual {v0}, Lo/asj;->e()V

    .line 104
    invoke-static {}, Lo/bpz;->b()V

    .line 106
    invoke-static {}, Lo/brf;->c()Lo/brf;

    move-result-object v0

    invoke-virtual {v0}, Lo/brf;->a()V

    .line 108
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->d()Lo/axr;

    move-result-object v2

    .line 109
    if-eqz v2, :cond_0

    .line 111
    const-string v0, "AccountLoginManager"

    const-string v1, "Clear report IM/SNS Server PushToken"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/ave;->b(Ljava/lang/String;)V

    .line 113
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/ave;->c(Ljava/lang/String;)V

    .line 114
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/ave;->d(Ljava/lang/String;)V

    .line 115
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->c()V

    .line 118
    :cond_0
    invoke-static {}, Lo/aor;->c()V

    .line 121
    invoke-static {}, Lo/awn;->e()Lo/awn;

    move-result-object v0

    invoke-virtual {v0}, Lo/awn;->c()V

    .line 124
    invoke-static {p1}, Lo/bbv;->c(Landroid/content/Context;)Lo/bbv;

    move-result-object v3

    .line 125
    if-eqz v3, :cond_1

    .line 127
    invoke-virtual {v3}, Lo/bbv;->c()V

    .line 130
    :cond_1
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    invoke-virtual {v0}, Lo/auu;->e()V

    .line 133
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bca;->c(Z)V

    .line 136
    invoke-static {}, Lo/aow;->e()Lo/aow;

    move-result-object v0

    invoke-virtual {v0}, Lo/aow;->c()V

    .line 139
    invoke-static {}, Lo/bch;->a()Lo/bch;

    move-result-object v0

    invoke-virtual {v0}, Lo/bch;->b()V

    .line 141
    const-string v0, "AccountLoginManager"

    const-string v1, "Leave: logoutOperation"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    return-void
.end method
