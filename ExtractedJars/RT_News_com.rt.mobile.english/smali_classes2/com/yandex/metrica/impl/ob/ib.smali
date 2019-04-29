.class public Lcom/yandex/metrica/impl/ob/ib;
.super Lcom/yandex/metrica/impl/ob/hz;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final c:Lcom/yandex/metrica/impl/ob/ig;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Lcom/yandex/metrica/impl/ob/ig;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final e:Lcom/yandex/metrica/impl/ob/ig;

.field private static final f:Lcom/yandex/metrica/impl/ob/ig;

.field private static final g:Lcom/yandex/metrica/impl/ob/ig;

.field private static final h:Lcom/yandex/metrica/impl/ob/ig;

.field private static final i:Lcom/yandex/metrica/impl/ob/ig;

.field private static final j:Lcom/yandex/metrica/impl/ob/ig;

.field private static final k:Lcom/yandex/metrica/impl/ob/ig;

.field private static final l:Lcom/yandex/metrica/impl/ob/ig;

.field private static final m:Lcom/yandex/metrica/impl/ob/ig;

.field private static final n:Lcom/yandex/metrica/impl/ob/ig;

.field private static final o:Lcom/yandex/metrica/impl/ob/ig;

.field private static final p:Lcom/yandex/metrica/impl/ob/ig;

.field private static final q:Lcom/yandex/metrica/impl/ob/ig;

.field private static final r:Lcom/yandex/metrica/impl/ob/ig;

.field private static final s:Lcom/yandex/metrica/impl/ob/ig;

.field private static final t:Lcom/yandex/metrica/impl/ob/ig;


# instance fields
.field private A:Lcom/yandex/metrica/impl/ob/ig;

.field private B:Lcom/yandex/metrica/impl/ob/ig;

.field private C:Lcom/yandex/metrica/impl/ob/ig;

.field private D:Lcom/yandex/metrica/impl/ob/ig;

.field private E:Lcom/yandex/metrica/impl/ob/ig;

.field private F:Lcom/yandex/metrica/impl/ob/ig;

.field private G:Lcom/yandex/metrica/impl/ob/ig;

.field private H:Lcom/yandex/metrica/impl/ob/ig;

.field private I:Lcom/yandex/metrica/impl/ob/ig;

.field private J:Lcom/yandex/metrica/impl/ob/ig;

.field private u:Lcom/yandex/metrica/impl/ob/ig;

.field private v:Lcom/yandex/metrica/impl/ob/ig;

.field private w:Lcom/yandex/metrica/impl/ob/ig;

.field private x:Lcom/yandex/metrica/impl/ob/ig;

.field private y:Lcom/yandex/metrica/impl/ob/ig;

.field private z:Lcom/yandex/metrica/impl/ob/ig;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 26
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "SESSION_SLEEP_START_"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->e:Lcom/yandex/metrica/impl/ob/ig;

    .line 27
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "SESSION_ID_"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->f:Lcom/yandex/metrica/impl/ob/ig;

    .line 28
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "SESSION_COUNTER_ID_"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->g:Lcom/yandex/metrica/impl/ob/ig;

    .line 29
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "SESSION_INIT_TIME_"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->h:Lcom/yandex/metrica/impl/ob/ig;

    .line 30
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "SESSION_ALIVE_TIME_"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->i:Lcom/yandex/metrica/impl/ob/ig;

    .line 31
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "SESSION_IS_ALIVE_REPORT_NEEDED_"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->j:Lcom/yandex/metrica/impl/ob/ig;

    .line 36
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "BG_SESSION_ID_"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->k:Lcom/yandex/metrica/impl/ob/ig;

    .line 37
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "BG_SESSION_SLEEP_START_"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->l:Lcom/yandex/metrica/impl/ob/ig;

    .line 38
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "BG_SESSION_COUNTER_ID_"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->m:Lcom/yandex/metrica/impl/ob/ig;

    .line 39
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "BG_SESSION_INIT_TIME_"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->n:Lcom/yandex/metrica/impl/ob/ig;

    .line 42
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "COLLECT_INSTALLED_APPS_"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->o:Lcom/yandex/metrica/impl/ob/ig;

    .line 43
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "IDENTITY_SEND_TIME_"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->p:Lcom/yandex/metrica/impl/ob/ig;

    .line 44
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "USER_INFO_"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->q:Lcom/yandex/metrica/impl/ob/ig;

    .line 45
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "REFERRER_"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->r:Lcom/yandex/metrica/impl/ob/ig;

    .line 48
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "APP_ENVIRONMENT"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->c:Lcom/yandex/metrica/impl/ob/ig;

    .line 50
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "APP_ENVIRONMENT_REVISION"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->d:Lcom/yandex/metrica/impl/ob/ig;

    .line 52
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "APP_ENVIRONMENT_"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->s:Lcom/yandex/metrica/impl/ob/ig;

    .line 53
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "APP_ENVIRONMENT_REVISION_"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ib;->t:Lcom/yandex/metrica/impl/ob/ig;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 79
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/hz;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 82
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/ib;->e:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ib;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->u:Lcom/yandex/metrica/impl/ob/ig;

    .line 83
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/ib;->f:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ib;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->v:Lcom/yandex/metrica/impl/ob/ig;

    .line 84
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/ib;->g:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ib;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->w:Lcom/yandex/metrica/impl/ob/ig;

    .line 85
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/ib;->h:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ib;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->x:Lcom/yandex/metrica/impl/ob/ig;

    .line 86
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/ib;->i:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ib;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->y:Lcom/yandex/metrica/impl/ob/ig;

    .line 87
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/ib;->j:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ib;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->z:Lcom/yandex/metrica/impl/ob/ig;

    .line 91
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/ib;->k:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ib;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->A:Lcom/yandex/metrica/impl/ob/ig;

    .line 92
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/ib;->l:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ib;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->B:Lcom/yandex/metrica/impl/ob/ig;

    .line 93
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/ib;->m:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ib;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->C:Lcom/yandex/metrica/impl/ob/ig;

    .line 94
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/ib;->n:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ib;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->D:Lcom/yandex/metrica/impl/ob/ig;

    .line 97
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/ib;->p:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ib;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->E:Lcom/yandex/metrica/impl/ob/ig;

    .line 98
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/ib;->o:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ib;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->F:Lcom/yandex/metrica/impl/ob/ig;

    .line 99
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/ib;->q:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ib;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->G:Lcom/yandex/metrica/impl/ob/ig;

    .line 100
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/ib;->r:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ib;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->H:Lcom/yandex/metrica/impl/ob/ig;

    .line 102
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/ib;->s:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ib;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->I:Lcom/yandex/metrica/impl/ob/ig;

    .line 103
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/ib;->t:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ib;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->J:Lcom/yandex/metrica/impl/ob/ig;

    .line 1275
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ib;->F:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2071
    invoke-interface {p1, p2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2074
    :try_start_0
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 2075
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, p2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    sget-object v1, Lcom/yandex/metrica/CounterConfiguration$a;->a:Lcom/yandex/metrica/CounterConfiguration$a;

    iget v1, v1, Lcom/yandex/metrica/CounterConfiguration$a;->d:I

    invoke-interface {p1, p2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2263
    :catch_0
    :cond_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ib;->y:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object p2

    const/4 v1, -0x1

    invoke-static {p1, p2, v1}, Lcom/yandex/metrica/impl/ob/ih;->a(Landroid/content/SharedPreferences;Ljava/lang/String;I)V

    .line 2267
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ib;->u:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ih;->a(Landroid/content/SharedPreferences;Ljava/lang/String;I)V

    .line 2271
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ib;->w:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ih;->a(Landroid/content/SharedPreferences;Ljava/lang/String;I)V

    return-void
.end method

.method private a(Ljava/lang/String;J)J
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method


# virtual methods
.method public a(J)J
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->x:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/ib;->a(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public a()Lcom/yandex/metrica/impl/a$a;
    .locals 6
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 154
    monitor-enter p0

    .line 155
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->I:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->J:Lcom/yandex/metrica/impl/ob/ig;

    .line 156
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 157
    new-instance v0, Lcom/yandex/metrica/impl/a$a;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ib;->I:Lcom/yandex/metrica/impl/ob/ig;

    .line 158
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "{}"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ib;->J:Lcom/yandex/metrica/impl/ob/ig;

    .line 160
    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v3

    const-wide/16 v4, 0x0

    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lcom/yandex/metrica/impl/a$a;-><init>(Ljava/lang/String;J)V

    monitor-exit p0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 164
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 165
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Lcom/yandex/metrica/impl/a$a;)Lcom/yandex/metrica/impl/ob/ib;
    .locals 3

    .line 203
    monitor-enter p0

    .line 204
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->I:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lcom/yandex/metrica/impl/a$a;->a:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/ib;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/hz;

    .line 205
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->J:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p1, Lcom/yandex/metrica/impl/a$a;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/ib;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/hz;

    .line 206
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Z)Ljava/lang/Boolean;
    .locals 2

    .line 177
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->z:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 187
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->G:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(J)J
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->D:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/ib;->a(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public b()Lcom/yandex/metrica/CounterConfiguration$a;
    .locals 3

    .line 181
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->F:Lcom/yandex/metrica/impl/ob/ig;

    .line 182
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/yandex/metrica/CounterConfiguration$a;->a:Lcom/yandex/metrica/CounterConfiguration$a;

    iget v2, v2, Lcom/yandex/metrica/CounterConfiguration$a;->d:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 181
    invoke-static {v0}, Lcom/yandex/metrica/CounterConfiguration$a;->a(I)Lcom/yandex/metrica/CounterConfiguration$a;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 191
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->H:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c(J)J
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->E:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/ib;->a(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public c()Lcom/yandex/metrica/impl/ob/ib;
    .locals 1

    .line 255
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->H:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/ib;->h(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/hz;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/ib;

    return-object v0
.end method

.method public d(J)J
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->v:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/ib;->a(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public d()Lcom/yandex/metrica/impl/ob/ib;
    .locals 1

    .line 279
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->F:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/ib;->h(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/hz;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/ib;

    return-object v0
.end method

.method public e(J)J
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->A:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/ib;->a(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public e()Z
    .locals 2

    .line 287
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->x:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->y:Lcom/yandex/metrica/impl/ob/ig;

    .line 288
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->z:Lcom/yandex/metrica/impl/ob/ig;

    .line 289
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->u:Lcom/yandex/metrica/impl/ob/ig;

    .line 290
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->v:Lcom/yandex/metrica/impl/ob/ig;

    .line 291
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->w:Lcom/yandex/metrica/impl/ob/ig;

    .line 292
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->D:Lcom/yandex/metrica/impl/ob/ig;

    .line 293
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->B:Lcom/yandex/metrica/impl/ob/ig;

    .line 294
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->A:Lcom/yandex/metrica/impl/ob/ig;

    .line 295
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->C:Lcom/yandex/metrica/impl/ob/ig;

    .line 296
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->I:Lcom/yandex/metrica/impl/ob/ig;

    .line 297
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->F:Lcom/yandex/metrica/impl/ob/ig;

    .line 298
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->G:Lcom/yandex/metrica/impl/ob/ig;

    .line 299
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->H:Lcom/yandex/metrica/impl/ob/ig;

    .line 300
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->E:Lcom/yandex/metrica/impl/ob/ig;

    .line 301
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public f(J)J
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->w:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/ib;->a(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method protected f()Ljava/lang/String;
    .locals 1

    const-string v0, "_boundentrypreferences"

    return-object v0
.end method

.method public g(J)J
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->C:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/ib;->a(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public g()V
    .locals 2

    .line 305
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->D:Lcom/yandex/metrica/impl/ob/ig;

    .line 306
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->C:Lcom/yandex/metrica/impl/ob/ig;

    .line 307
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->A:Lcom/yandex/metrica/impl/ob/ig;

    .line 308
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->B:Lcom/yandex/metrica/impl/ob/ig;

    .line 309
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->x:Lcom/yandex/metrica/impl/ob/ig;

    .line 310
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->w:Lcom/yandex/metrica/impl/ob/ig;

    .line 311
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->v:Lcom/yandex/metrica/impl/ob/ig;

    .line 312
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->u:Lcom/yandex/metrica/impl/ob/ig;

    .line 313
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->z:Lcom/yandex/metrica/impl/ob/ig;

    .line 314
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->y:Lcom/yandex/metrica/impl/ob/ig;

    .line 315
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->G:Lcom/yandex/metrica/impl/ob/ig;

    .line 316
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->F:Lcom/yandex/metrica/impl/ob/ig;

    .line 317
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->I:Lcom/yandex/metrica/impl/ob/ig;

    .line 318
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->J:Lcom/yandex/metrica/impl/ob/ig;

    .line 319
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->H:Lcom/yandex/metrica/impl/ob/ig;

    .line 320
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ib;->E:Lcom/yandex/metrica/impl/ob/ig;

    .line 321
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public h(J)J
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->u:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/ib;->a(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public i(J)J
    .locals 1

    .line 173
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ib;->B:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/ib;->a(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method
