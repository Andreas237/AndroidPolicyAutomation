.class public Lcom/yandex/metrica/impl/ob/fh;
.super Lcom/yandex/metrica/impl/ob/fi;
.source "SourceFile"


# static fields
.field private static final a:Lcom/yandex/metrica/impl/ob/ig;

.field private static final b:Lcom/yandex/metrica/impl/ob/ig;

.field private static final c:Lcom/yandex/metrica/impl/ob/ig;

.field private static final d:Lcom/yandex/metrica/impl/ob/ig;

.field private static final e:Lcom/yandex/metrica/impl/ob/ig;

.field private static final f:Lcom/yandex/metrica/impl/ob/ig;

.field private static final g:Lcom/yandex/metrica/impl/ob/ig;

.field private static final h:Lcom/yandex/metrica/impl/ob/ig;

.field private static final i:Lcom/yandex/metrica/impl/ob/ig;

.field private static final j:Lcom/yandex/metrica/impl/ob/ig;

.field private static final k:Lcom/yandex/metrica/impl/ob/ig;

.field private static final l:Lcom/yandex/metrica/impl/ob/ig;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 23
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "COLLECT_INSTALLED_APPS"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fh;->a:Lcom/yandex/metrica/impl/ob/ig;

    .line 24
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "IDENTITY_SEND_TIME"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fh;->b:Lcom/yandex/metrica/impl/ob/ig;

    .line 25
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "PERMISSIONS_CHECK_TIME"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fh;->c:Lcom/yandex/metrica/impl/ob/ig;

    .line 26
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "USER_INFO"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fh;->d:Lcom/yandex/metrica/impl/ob/ig;

    .line 27
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "PROFILE_ID"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fh;->e:Lcom/yandex/metrica/impl/ob/ig;

    .line 29
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "APP_ENVIRONMENT"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fh;->f:Lcom/yandex/metrica/impl/ob/ig;

    .line 30
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "APP_ENVIRONMENT_REVISION"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fh;->g:Lcom/yandex/metrica/impl/ob/ig;

    .line 32
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "LAST_MIGRATION_VERSION"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fh;->h:Lcom/yandex/metrica/impl/ob/ig;

    .line 33
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "LAST_APP_VERSION_WITH_FEATURES"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fh;->i:Lcom/yandex/metrica/impl/ob/ig;

    .line 35
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "APPLICATION_FEATURES"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fh;->j:Lcom/yandex/metrica/impl/ob/ig;

    .line 36
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "CURRENT_SESSION_ID"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fh;->k:Lcom/yandex/metrica/impl/ob/ig;

    .line 37
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "ATTRIBUTION_ID"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fh;->l:Lcom/yandex/metrica/impl/ob/ig;

    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ev;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/fi;-><init>(Lcom/yandex/metrica/impl/ob/ev;)V

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1

    .line 54
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->i:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/fh;->b(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public a(J)J
    .locals 1

    .line 46
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->b:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fh;->b(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public a()Lcom/yandex/metrica/impl/a$a;
    .locals 5

    .line 58
    monitor-enter p0

    .line 59
    :try_start_0
    new-instance v0, Lcom/yandex/metrica/impl/a$a;

    sget-object v1, Lcom/yandex/metrica/impl/ob/fh;->f:Lcom/yandex/metrica/impl/ob/ig;

    .line 60
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "{}"

    invoke-virtual {p0, v1, v2}, Lcom/yandex/metrica/impl/ob/fh;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/yandex/metrica/impl/ob/fh;->g:Lcom/yandex/metrica/impl/ob/ig;

    .line 61
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v2

    const-wide/16 v3, 0x0

    invoke-virtual {p0, v2, v3, v4}, Lcom/yandex/metrica/impl/ob/fh;->b(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lcom/yandex/metrica/impl/a$a;-><init>(Ljava/lang/String;J)V

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 63
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Lcom/yandex/metrica/CounterConfiguration$a;)Lcom/yandex/metrica/impl/ob/fh;
    .locals 3

    .line 96
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->a:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    iget p1, p1, Lcom/yandex/metrica/CounterConfiguration$a;->d:I

    int-to-long v1, p1

    invoke-virtual {p0, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/fh;->a(Ljava/lang/String;J)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fh;

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/a$a;)Lcom/yandex/metrica/impl/ob/fh;
    .locals 3

    .line 80
    monitor-enter p0

    .line 81
    :try_start_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->f:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lcom/yandex/metrica/impl/a$a;->a:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/fh;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fi;

    .line 82
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->g:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p1, Lcom/yandex/metrica/impl/a$a;->b:J

    invoke-virtual {p0, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/fh;->a(Ljava/lang/String;J)Lcom/yandex/metrica/impl/ob/fi;

    .line 83
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fh;
    .locals 2

    .line 120
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "SESSION_"

    invoke-direct {v0, v1, p1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/fh;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fh;

    return-object p1
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 76
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->d:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/fh;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(J)J
    .locals 1

    .line 50
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->c:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fh;->b(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(I)Lcom/yandex/metrica/impl/ob/fh;
    .locals 1

    .line 112
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->i:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/fh;->a(Ljava/lang/String;I)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fh;

    return-object p1
.end method

.method public b(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fh;
    .locals 1

    .line 100
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->d:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/fh;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fh;

    return-object p1
.end method

.method public b()Ljava/lang/String;
    .locals 2

    .line 67
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->j:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/fh;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/yandex/metrica/CounterConfiguration$a;
    .locals 3

    .line 71
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->a:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/yandex/metrica/CounterConfiguration$a;->a:Lcom/yandex/metrica/CounterConfiguration$a;

    iget v1, v1, Lcom/yandex/metrica/CounterConfiguration$a;->d:I

    int-to-long v1, v1

    invoke-virtual {p0, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/fh;->b(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/yandex/metrica/CounterConfiguration$a;->a(I)Lcom/yandex/metrica/CounterConfiguration$a;

    move-result-object v0

    return-object v0
.end method

.method public c(I)Lcom/yandex/metrica/impl/ob/fh;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 138
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->l:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/fh;->a(Ljava/lang/String;I)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fh;

    return-object p1
.end method

.method public c(J)Lcom/yandex/metrica/impl/ob/fh;
    .locals 1

    .line 88
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->b:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fh;->a(Ljava/lang/String;J)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fh;

    return-object p1
.end method

.method public c(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fh;
    .locals 1

    .line 116
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->j:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/fh;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fh;

    return-object p1
.end method

.method public d(I)I
    .locals 1

    .line 142
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->l:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/fh;->b(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public d()J
    .locals 3

    .line 104
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->h:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/fh;->b(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public d(J)Lcom/yandex/metrica/impl/ob/fh;
    .locals 1

    .line 92
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->c:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fh;->a(Ljava/lang/String;J)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fh;

    return-object p1
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 124
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "SESSION_"

    invoke-direct {v0, v1, p1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/fh;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public e(J)Lcom/yandex/metrica/impl/ob/fh;
    .locals 1

    .line 108
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->h:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fh;->a(Ljava/lang/String;J)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fh;

    return-object p1
.end method

.method public e(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fh;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 133
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->e:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/fh;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fh;

    return-object p1
.end method

.method public e()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 129
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->e:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/fh;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f(J)J
    .locals 1

    .line 146
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->k:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fh;->b(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public g(J)Lcom/yandex/metrica/impl/ob/fh;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 151
    sget-object v0, Lcom/yandex/metrica/impl/ob/fh;->k:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fh;->a(Ljava/lang/String;J)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fh;

    return-object p1
.end method
