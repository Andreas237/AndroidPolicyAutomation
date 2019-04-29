.class Lcom/yandex/metrica/impl/ob/hk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private b:Lcom/yandex/metrica/impl/ob/ks;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private c:Lcom/yandex/metrica/impl/ob/gs;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private d:Lcom/yandex/metrica/impl/ap;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private e:Lcom/yandex/metrica/impl/ob/ex;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private f:Lcom/yandex/metrica/impl/ob/ew;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private g:Lcom/yandex/metrica/impl/ob/ma;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private h:Lcom/yandex/metrica/impl/ob/hf;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ap;Lcom/yandex/metrica/impl/ob/ex;Lcom/yandex/metrica/impl/ob/ew;Lcom/yandex/metrica/impl/ob/ma;Lcom/yandex/metrica/impl/ob/hf;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/yandex/metrica/impl/ob/ex;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/yandex/metrica/impl/ob/ew;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/yandex/metrica/impl/ob/ma;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Lcom/yandex/metrica/impl/ob/hf;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 159
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/hk;->a:Landroid/content/Context;

    .line 160
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/hk;->c:Lcom/yandex/metrica/impl/ob/gs;

    .line 161
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/hk;->b:Lcom/yandex/metrica/impl/ob/ks;

    .line 162
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/hk;->d:Lcom/yandex/metrica/impl/ap;

    .line 163
    iput-object p5, p0, Lcom/yandex/metrica/impl/ob/hk;->e:Lcom/yandex/metrica/impl/ob/ex;

    .line 164
    iput-object p6, p0, Lcom/yandex/metrica/impl/ob/hk;->f:Lcom/yandex/metrica/impl/ob/ew;

    .line 165
    iput-object p7, p0, Lcom/yandex/metrica/impl/ob/hk;->g:Lcom/yandex/metrica/impl/ob/ma;

    .line 166
    iput-object p8, p0, Lcom/yandex/metrica/impl/ob/hk;->h:Lcom/yandex/metrica/impl/ob/hf;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ob/ex;Lcom/yandex/metrica/impl/ob/ew;)V
    .locals 9
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/ex;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/yandex/metrica/impl/ob/ew;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 48
    new-instance v4, Lcom/yandex/metrica/impl/ap;

    invoke-direct {v4}, Lcom/yandex/metrica/impl/ap;-><init>()V

    new-instance v7, Lcom/yandex/metrica/impl/ob/lz;

    invoke-direct {v7}, Lcom/yandex/metrica/impl/ob/lz;-><init>()V

    new-instance v8, Lcom/yandex/metrica/impl/ob/hf;

    invoke-direct {v8}, Lcom/yandex/metrica/impl/ob/hf;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v8}, Lcom/yandex/metrica/impl/ob/hk;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ap;Lcom/yandex/metrica/impl/ob/ex;Lcom/yandex/metrica/impl/ob/ew;Lcom/yandex/metrica/impl/ob/ma;Lcom/yandex/metrica/impl/ob/hf;)V

    return-void
.end method

.method private a(Lcom/yandex/metrica/impl/ob/eo;)Z
    .locals 11

    .line 101
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hk;->c:Lcom/yandex/metrica/impl/ob/gs;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    .line 2120
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hk;->c:Lcom/yandex/metrica/impl/ob/gs;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hk;->c:Lcom/yandex/metrica/impl/ob/gs;

    iget v0, v0, Lcom/yandex/metrica/impl/ob/gs;->e:I

    int-to-long v3, v0

    .line 2125
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/eo;->a()J

    move-result-wide v5

    cmp-long v0, v5, v3

    if-ltz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-nez v0, :cond_4

    .line 2129
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hk;->c:Lcom/yandex/metrica/impl/ob/gs;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hk;->c:Lcom/yandex/metrica/impl/ob/gs;

    iget-wide v3, v0, Lcom/yandex/metrica/impl/ob/gs;->g:J

    .line 2134
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hk;->g:Lcom/yandex/metrica/impl/ob/ma;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/ma;->a()J

    move-result-wide v5

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/eo;->b()J

    move-result-wide v7

    sub-long v9, v5, v7

    cmp-long p1, v9, v3

    if-lez p1, :cond_2

    move p1, v2

    goto :goto_2

    :cond_2
    move p1, v1

    :goto_2
    if-eqz p1, :cond_3

    move p1, v2

    goto :goto_3

    :cond_3
    move p1, v1

    :goto_3
    if-eqz p1, :cond_5

    :cond_4
    return v2

    :cond_5
    return v1
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 1090
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hk;->e:Lcom/yandex/metrica/impl/ob/ex;

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ob/hk;->a(Lcom/yandex/metrica/impl/ob/eo;)Z

    move-result v0

    .line 1091
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hk;->f:Lcom/yandex/metrica/impl/ob/ew;

    invoke-direct {p0, v1}, Lcom/yandex/metrica/impl/ob/hk;->a(Lcom/yandex/metrica/impl/ob/eo;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v3

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    if-eqz v0, :cond_5

    .line 2060
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hk;->c:Lcom/yandex/metrica/impl/ob/gs;

    if-eqz v0, :cond_5

    .line 2061
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hk;->h:Lcom/yandex/metrica/impl/ob/hf;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hk;->a:Landroid/content/Context;

    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/hk;->b:Lcom/yandex/metrica/impl/ob/ks;

    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/hk;->c:Lcom/yandex/metrica/impl/ob/gs;

    .line 2062
    invoke-virtual {v0, v1, v4, v5}, Lcom/yandex/metrica/impl/ob/hf;->a(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;)Lcom/yandex/metrica/impl/ob/hb;

    move-result-object v0

    .line 2063
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hb;->b()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 2066
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hb;->d()Lcom/yandex/metrica/impl/ob/ho;

    move-result-object v4

    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/ho;->b()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 2070
    :goto_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v4

    if-nez v4, :cond_3

    if-eqz v1, :cond_3

    .line 2075
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hk;->d:Lcom/yandex/metrica/impl/ap;

    invoke-virtual {v1, v0}, Lcom/yandex/metrica/impl/ap;->a(Lcom/yandex/metrica/impl/an;)V

    .line 2076
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hb;->c()Z

    move-result v1

    if-nez v1, :cond_2

    .line 2077
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hb;->u()Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    move v1, v3

    goto :goto_2

    :cond_3
    return-void

    .line 2084
    :cond_4
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hb;->E()V

    :cond_5
    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 140
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/hk;->b:Lcom/yandex/metrica/impl/ob/ks;

    .line 141
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/hk;->c:Lcom/yandex/metrica/impl/ob/gs;

    return-void
.end method
