.class public Lcom/yandex/metrica/impl/ob/ec;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private b:Lcom/yandex/metrica/impl/ob/dy;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private c:Lcom/yandex/metrica/impl/ob/dz;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private d:Lcom/yandex/metrica/impl/ob/eb;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private e:Lcom/yandex/metrica/impl/ob/ek;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private f:Lcom/yandex/metrica/impl/ob/el;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/dy;Lcom/yandex/metrica/impl/ob/dz;Lcom/yandex/metrica/impl/ob/eb;Lcom/yandex/metrica/impl/ob/ek;Lcom/yandex/metrica/impl/ob/el;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/dy;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/dz;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/eb;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/yandex/metrica/impl/ob/ek;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/yandex/metrica/impl/ob/el;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 158
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ec;->a:Landroid/content/Context;

    .line 159
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/ec;->b:Lcom/yandex/metrica/impl/ob/dy;

    .line 160
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/ec;->c:Lcom/yandex/metrica/impl/ob/dz;

    .line 161
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/ec;->d:Lcom/yandex/metrica/impl/ob/eb;

    .line 162
    iput-object p5, p0, Lcom/yandex/metrica/impl/ob/ec;->e:Lcom/yandex/metrica/impl/ob/ek;

    .line 163
    iput-object p6, p0, Lcom/yandex/metrica/impl/ob/ec;->f:Lcom/yandex/metrica/impl/ob/el;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/yandex/metrica/impl/ob/ed;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ed;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 45
    new-instance v0, Lcom/yandex/metrica/impl/ob/eb;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/eb;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/yandex/metrica/impl/ob/ec;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/yandex/metrica/impl/ob/ed;Lcom/yandex/metrica/impl/ob/eb;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/yandex/metrica/impl/ob/ed;Lcom/yandex/metrica/impl/ob/eb;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ed;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/eb;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 140
    new-instance v2, Lcom/yandex/metrica/impl/ob/dy;

    invoke-direct {v2, p1, p4}, Lcom/yandex/metrica/impl/ob/dy;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/eb;)V

    new-instance v3, Lcom/yandex/metrica/impl/ob/dz;

    invoke-direct {v3, p1, p2, p3}, Lcom/yandex/metrica/impl/ob/dz;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/yandex/metrica/impl/ob/ed;)V

    .line 145
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/ek;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/ek;

    move-result-object v5

    new-instance v6, Lcom/yandex/metrica/impl/ob/el;

    invoke-direct {v6, p1}, Lcom/yandex/metrica/impl/ob/el;-><init>(Landroid/content/Context;)V

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    .line 140
    invoke-direct/range {v0 .. v6}, Lcom/yandex/metrica/impl/ob/ec;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/dy;Lcom/yandex/metrica/impl/ob/dz;Lcom/yandex/metrica/impl/ob/eb;Lcom/yandex/metrica/impl/ob/ek;Lcom/yandex/metrica/impl/ob/el;)V

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/ec;)Lcom/yandex/metrica/impl/ob/eb;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/ec;->d:Lcom/yandex/metrica/impl/ob/eb;

    return-object p0
.end method

.method private a(J)V
    .locals 2

    .line 95
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ec;->c:Lcom/yandex/metrica/impl/ob/dz;

    invoke-virtual {v0, p1, p2}, Lcom/yandex/metrica/impl/ob/dz;->a(J)V

    .line 96
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ec;->f:Lcom/yandex/metrica/impl/ob/el;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/el;->a(Z)Lcom/yandex/metrica/impl/ob/el;

    .line 97
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ec;->f:Lcom/yandex/metrica/impl/ob/el;

    invoke-virtual {v0, p1, p2}, Lcom/yandex/metrica/impl/ob/el;->c(J)Lcom/yandex/metrica/impl/ob/el;

    return-void
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/ob/ee;)V
    .locals 0

    .line 24
    invoke-static {p0}, Lcom/yandex/metrica/impl/ob/ec;->c(Lcom/yandex/metrica/impl/ob/ee;)V

    return-void
.end method

.method private static c(Lcom/yandex/metrica/impl/ob/ee;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 133
    invoke-interface {p0}, Lcom/yandex/metrica/impl/ob/ee;->a()V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 50
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ec;->e:Lcom/yandex/metrica/impl/ob/ek;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ec;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ek;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ej;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 51
    iget-object v2, v0, Lcom/yandex/metrica/impl/ob/ej;->b:Lcom/yandex/metrica/impl/ob/ei;

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/yandex/metrica/impl/ob/ej;->b:Lcom/yandex/metrica/impl/ob/ei;

    iget-object v2, v2, Lcom/yandex/metrica/impl/ob/ei;->b:Ljava/lang/Long;

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/yandex/metrica/impl/ob/ej;->b:Lcom/yandex/metrica/impl/ob/ei;

    iget-object v2, v2, Lcom/yandex/metrica/impl/ob/ei;->a:Ljava/lang/Long;

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz v2, :cond_4

    .line 56
    iget-object v2, v0, Lcom/yandex/metrica/impl/ob/ej;->b:Lcom/yandex/metrica/impl/ob/ei;

    iget-boolean v2, v2, Lcom/yandex/metrica/impl/ob/ei;->i:Z

    .line 57
    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/ej;->b:Lcom/yandex/metrica/impl/ob/ei;

    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/ei;->b:Ljava/lang/Long;

    .line 58
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ec;->f:Lcom/yandex/metrica/impl/ob/el;

    const-wide/16 v4, 0x0

    invoke-virtual {v3, v4, v5}, Lcom/yandex/metrica/impl/ob/el;->d(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 59
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/ec;->f:Lcom/yandex/metrica/impl/ob/el;

    invoke-virtual {v4, v1}, Lcom/yandex/metrica/impl/ob/el;->b(Z)Z

    move-result v4

    .line 60
    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/ec;->c:Lcom/yandex/metrica/impl/ob/dz;

    invoke-virtual {v5}, Lcom/yandex/metrica/impl/ob/dz;->b()Z

    move-result v5

    if-eqz v5, :cond_1

    if-eqz v2, :cond_4

    .line 63
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/ec;->a(J)V

    return-void

    :cond_1
    if-eq v2, v4, :cond_3

    if-eqz v2, :cond_2

    .line 72
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/ec;->a(J)V

    return-void

    .line 1101
    :cond_2
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ec;->c:Lcom/yandex/metrica/impl/ob/dz;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/dz;->a()V

    .line 1102
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ec;->f:Lcom/yandex/metrica/impl/ob/el;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/el;->a(Z)Lcom/yandex/metrica/impl/ob/el;

    return-void

    :cond_3
    if-eqz v2, :cond_4

    .line 82
    invoke-virtual {v0, v3}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result v1

    if-eqz v1, :cond_4

    .line 84
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/ec;->a(J)V

    :cond_4
    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/ee;)V
    .locals 6
    .param p1    # Lcom/yandex/metrica/impl/ob/ee;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 106
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ec;->e:Lcom/yandex/metrica/impl/ob/ek;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ec;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ek;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ej;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 109
    iget-object v1, v0, Lcom/yandex/metrica/impl/ob/ej;->b:Lcom/yandex/metrica/impl/ob/ei;

    if-eqz v1, :cond_1

    .line 110
    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/ej;->b:Lcom/yandex/metrica/impl/ob/ei;

    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/ei;->a:Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 111
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    .line 113
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ec;->d:Lcom/yandex/metrica/impl/ob/eb;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ec;->b:Lcom/yandex/metrica/impl/ob/dy;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/dy;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/eb;->a(Ljava/lang/String;)V

    .line 114
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ec;->c:Lcom/yandex/metrica/impl/ob/dz;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    new-instance v0, Lcom/yandex/metrica/impl/ob/ec$1;

    invoke-direct {v0, p0, p1}, Lcom/yandex/metrica/impl/ob/ec$1;-><init>(Lcom/yandex/metrica/impl/ob/ec;Lcom/yandex/metrica/impl/ob/ee;)V

    invoke-virtual {v1, v2, v3, v0}, Lcom/yandex/metrica/impl/ob/dz;->a(JLcom/yandex/metrica/impl/ob/dz$a;)V

    return-void

    .line 123
    :cond_0
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/ec;->c(Lcom/yandex/metrica/impl/ob/ee;)V

    return-void

    .line 127
    :cond_1
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/ec;->c(Lcom/yandex/metrica/impl/ob/ee;)V

    return-void
.end method
