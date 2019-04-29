.class public Lcom/yandex/metrica/impl/ob/ia;
.super Lcom/yandex/metrica/impl/ob/hz;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
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


# instance fields
.field private m:Lcom/yandex/metrica/impl/ob/ig;

.field private n:Lcom/yandex/metrica/impl/ob/ig;

.field private o:Lcom/yandex/metrica/impl/ob/ig;

.field private p:Lcom/yandex/metrica/impl/ob/ig;

.field private q:Lcom/yandex/metrica/impl/ob/ig;

.field private r:Lcom/yandex/metrica/impl/ob/ig;

.field private s:Lcom/yandex/metrica/impl/ob/ig;

.field private t:Lcom/yandex/metrica/impl/ob/ig;

.field private u:Lcom/yandex/metrica/impl/ob/ig;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 23
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "UUID"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ia;->c:Lcom/yandex/metrica/impl/ob/ig;

    .line 24
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "DEVICEID"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ia;->d:Lcom/yandex/metrica/impl/ob/ig;

    .line 25
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "DEVICEID_2"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ia;->e:Lcom/yandex/metrica/impl/ob/ig;

    .line 26
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "DEVICEID_3"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ia;->f:Lcom/yandex/metrica/impl/ob/ig;

    .line 27
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "AD_URL_GET"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ia;->g:Lcom/yandex/metrica/impl/ob/ig;

    .line 28
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "AD_URL_REPORT"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ia;->h:Lcom/yandex/metrica/impl/ob/ig;

    .line 29
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "HOST_URL"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ia;->i:Lcom/yandex/metrica/impl/ob/ig;

    .line 30
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "SERVER_TIME_OFFSET"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ia;->j:Lcom/yandex/metrica/impl/ob/ig;

    .line 31
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "STARTUP_REQUEST_TIME"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ia;->k:Lcom/yandex/metrica/impl/ob/ig;

    .line 32
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "CLIDS"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ia;->l:Lcom/yandex/metrica/impl/ob/ig;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 46
    invoke-direct {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/hz;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 48
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object v0, Lcom/yandex/metrica/impl/ob/ia;->c:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ia;->m:Lcom/yandex/metrica/impl/ob/ig;

    .line 49
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object v0, Lcom/yandex/metrica/impl/ob/ia;->d:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ia;->n:Lcom/yandex/metrica/impl/ob/ig;

    .line 50
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object v0, Lcom/yandex/metrica/impl/ob/ia;->e:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ia;->o:Lcom/yandex/metrica/impl/ob/ig;

    .line 51
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object v0, Lcom/yandex/metrica/impl/ob/ia;->f:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ia;->p:Lcom/yandex/metrica/impl/ob/ig;

    .line 52
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object v0, Lcom/yandex/metrica/impl/ob/ia;->g:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ia;->q:Lcom/yandex/metrica/impl/ob/ig;

    .line 53
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object v0, Lcom/yandex/metrica/impl/ob/ia;->h:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ia;->r:Lcom/yandex/metrica/impl/ob/ig;

    .line 54
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object v0, Lcom/yandex/metrica/impl/ob/ia;->i:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    .line 55
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object v0, Lcom/yandex/metrica/impl/ob/ia;->j:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ia;->s:Lcom/yandex/metrica/impl/ob/ig;

    .line 56
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object v0, Lcom/yandex/metrica/impl/ob/ia;->k:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ia;->t:Lcom/yandex/metrica/impl/ob/ig;

    .line 57
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object v0, Lcom/yandex/metrica/impl/ob/ia;->l:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ia;->u:Lcom/yandex/metrica/impl/ob/ig;

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 2

    .line 91
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ia;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ia;->s:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public a()Ljava/lang/String;
    .locals 5

    .line 74
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ia;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ia;->o:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ia;->b:Landroid/content/SharedPreferences;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ia;->n:Lcom/yandex/metrica/impl/ob/ig;

    .line 75
    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 74
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 66
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ia;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ia;->m:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(J)J
    .locals 2

    .line 95
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ia;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ia;->t:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public b()Lcom/yandex/metrica/impl/ob/ia;
    .locals 1

    .line 135
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ia;->h()Lcom/yandex/metrica/impl/ob/hz;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/ia;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ia;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ia;->p:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 79
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ia;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ia;->q:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation

    .line 139
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ia;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 83
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ia;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ia;->r:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 99
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ia;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ia;->u:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected f()Ljava/lang/String;
    .locals 1

    const-string v0, "_startupinfopreferences"

    return-object v0
.end method
