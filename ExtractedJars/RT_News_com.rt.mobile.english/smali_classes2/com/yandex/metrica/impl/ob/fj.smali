.class public Lcom/yandex/metrica/impl/ob/fj;
.super Lcom/yandex/metrica/impl/ob/fi;
.source "SourceFile"


# static fields
.field static final a:Lcom/yandex/metrica/impl/ob/ig;

.field static final b:Lcom/yandex/metrica/impl/ob/ig;

.field static final c:Lcom/yandex/metrica/impl/ob/ig;

.field static final d:Lcom/yandex/metrica/impl/ob/ig;

.field static final e:Lcom/yandex/metrica/impl/ob/ig;

.field static final f:Lcom/yandex/metrica/impl/ob/ig;

.field static final g:Lcom/yandex/metrica/impl/ob/ig;

.field static final h:Lcom/yandex/metrica/impl/ob/ig;

.field static final i:Lcom/yandex/metrica/impl/ob/ig;

.field static final j:Lcom/yandex/metrica/impl/ob/ig;

.field static final k:Lcom/yandex/metrica/impl/ob/ig;

.field private static final l:Lcom/yandex/metrica/impl/ob/ig;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 23
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "LOCATION_TRACKING_ENABLED"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fj;->a:Lcom/yandex/metrica/impl/ob/ig;

    .line 24
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "COLLECT_INSTALLED_APPS"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fj;->b:Lcom/yandex/metrica/impl/ob/ig;

    .line 25
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "REFERRER"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fj;->c:Lcom/yandex/metrica/impl/ob/ig;

    .line 26
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "REFERRER_FROM_PLAY_SERVICES"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fj;->d:Lcom/yandex/metrica/impl/ob/ig;

    .line 27
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "REFERRER_HANDLED"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fj;->e:Lcom/yandex/metrica/impl/ob/ig;

    .line 28
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "REFERRER_HOLDER_STATE"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fj;->f:Lcom/yandex/metrica/impl/ob/ig;

    .line 29
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "PREF_KEY_OFFSET"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fj;->g:Lcom/yandex/metrica/impl/ob/ig;

    .line 30
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "UNCHECKED_TIME"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fj;->h:Lcom/yandex/metrica/impl/ob/ig;

    .line 31
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "L_REQ_NUM"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fj;->i:Lcom/yandex/metrica/impl/ob/ig;

    .line 32
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "L_ID"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fj;->j:Lcom/yandex/metrica/impl/ob/ig;

    .line 33
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "LBS_ID"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fj;->k:Lcom/yandex/metrica/impl/ob/ig;

    .line 35
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "LAST_MIGRATION_VERSION"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/fj;->l:Lcom/yandex/metrica/impl/ob/ig;

    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ev;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/fi;-><init>(Lcom/yandex/metrica/impl/ob/ev;)V

    return-void
.end method

.method private static b(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/jn;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 59
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    const/4 v1, 0x0

    invoke-static {p0, v1}, Landroid/util/Base64;->encode([BI)[B

    move-result-object p0

    invoke-static {p0}, Lcom/yandex/metrica/impl/ob/jn;->a([B)Lcom/yandex/metrica/impl/ob/jn;

    move-result-object p0
    :try_end_0
    .catch Lcom/yandex/metrica/impl/ob/d; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method


# virtual methods
.method public a(I)I
    .locals 1

    .line 95
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->l:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/fj;->b(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public a()Lcom/yandex/metrica/CounterConfiguration$a;
    .locals 3

    .line 42
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->b:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/yandex/metrica/CounterConfiguration$a;->a:Lcom/yandex/metrica/CounterConfiguration$a;

    iget v1, v1, Lcom/yandex/metrica/CounterConfiguration$a;->d:I

    int-to-long v1, v1

    invoke-virtual {p0, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/fj;->b(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/yandex/metrica/CounterConfiguration$a;->a(I)Lcom/yandex/metrica/CounterConfiguration$a;

    move-result-object v0

    return-object v0
.end method

.method public a(J)Lcom/yandex/metrica/impl/ob/fj;
    .locals 1

    .line 115
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->g:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fj;->a(Ljava/lang/String;J)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fj;

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/CounterConfiguration$a;)Lcom/yandex/metrica/impl/ob/fj;
    .locals 3

    .line 71
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->b:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    iget p1, p1, Lcom/yandex/metrica/CounterConfiguration$a;->d:I

    int-to-long v1, p1

    invoke-virtual {p0, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/fj;->a(Ljava/lang/String;J)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fj;

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/jn;)Lcom/yandex/metrica/impl/ob/fj;
    .locals 3

    .line 79
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->d:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1083
    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/jn;->a()[B

    move-result-object p1

    const/4 v2, 0x0

    invoke-static {p1, v2}, Landroid/util/Base64;->decode([BI)[B

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/String;-><init>([B)V

    move-object p1, v1

    .line 79
    :goto_0
    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/fj;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fj;

    return-object p1
.end method

.method public a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fj;
    .locals 1

    .line 75
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->c:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/fj;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fj;

    return-object p1
.end method

.method public a(Z)V
    .locals 1

    .line 103
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->a:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/fj;->a(Ljava/lang/String;Z)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fi;->i()V

    return-void
.end method

.method public b(J)J
    .locals 1

    .line 119
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->i:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fj;->b(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(I)Lcom/yandex/metrica/impl/ob/fj;
    .locals 1

    .line 99
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->l:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/fj;->a(Ljava/lang/String;I)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fj;

    return-object p1
.end method

.method public b()Ljava/lang/String;
    .locals 2

    .line 47
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->c:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/fj;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Z)Z
    .locals 1

    .line 143
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->h:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/fj;->b(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public c(I)J
    .locals 3

    .line 111
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->g:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {p0, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/fj;->b(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public c(J)Lcom/yandex/metrica/impl/ob/fj;
    .locals 1

    .line 123
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->i:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fj;->a(Ljava/lang/String;J)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fj;

    return-object p1
.end method

.method public c(Z)Lcom/yandex/metrica/impl/ob/fj;
    .locals 1

    .line 147
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->h:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/fj;->a(Ljava/lang/String;Z)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fj;

    return-object p1
.end method

.method public c()Lcom/yandex/metrica/impl/ob/jn;
    .locals 2

    .line 51
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->d:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/fj;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/fj;->b(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/jn;

    move-result-object v0

    return-object v0
.end method

.method public d(I)I
    .locals 1

    .line 151
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->f:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/fj;->b(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public d(J)J
    .locals 1

    .line 127
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->j:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fj;->b(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public d()Z
    .locals 2

    .line 67
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->e:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/fj;->b(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public e()Lcom/yandex/metrica/impl/ob/fj;
    .locals 2

    .line 87
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->e:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/fj;->a(Ljava/lang/String;Z)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/fj;

    return-object v0
.end method

.method public e(I)Lcom/yandex/metrica/impl/ob/fj;
    .locals 1

    .line 155
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->f:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/fj;->a(Ljava/lang/String;I)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fj;

    return-object p1
.end method

.method public e(J)Lcom/yandex/metrica/impl/ob/fj;
    .locals 1

    .line 131
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->j:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fj;->a(Ljava/lang/String;J)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fj;

    return-object p1
.end method

.method public f(J)J
    .locals 1

    .line 135
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->k:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fj;->b(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public f()Lcom/yandex/metrica/impl/ob/fj;
    .locals 2

    .line 91
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->c:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/fj;->n(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object v0

    sget-object v1, Lcom/yandex/metrica/impl/ob/fj;->d:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fi;->n(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/fj;

    return-object v0
.end method

.method public g(J)Lcom/yandex/metrica/impl/ob/fj;
    .locals 1

    .line 139
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->k:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fj;->a(Ljava/lang/String;J)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/fj;

    return-object p1
.end method

.method public g()Z
    .locals 2

    .line 107
    sget-object v0, Lcom/yandex/metrica/impl/ob/fj;->a:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/fj;->b(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method
