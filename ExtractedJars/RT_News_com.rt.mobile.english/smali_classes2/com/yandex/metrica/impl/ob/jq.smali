.class public Lcom/yandex/metrica/impl/ob/jq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/jq$b;,
        Lcom/yandex/metrica/impl/ob/jq$a;,
        Lcom/yandex/metrica/impl/ob/jq$c;,
        Lcom/yandex/metrica/impl/ob/jq$d;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Lcom/yandex/metrica/impl/g;

.field private final d:Ljava/lang/String;

.field private e:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Lcom/yandex/metrica/impl/ob/ks;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 61
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "public"

    goto :goto_0

    :cond_0
    const-string v0, "public_"

    :goto_0
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->d:Ljava/lang/String;

    .line 66
    invoke-static {}, Lcom/yandex/metrica/impl/bj;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->e:Ljava/lang/String;

    .line 78
    sget-object v0, Lcom/yandex/metrica/a;->a:Lcom/yandex/metrica/a;

    invoke-virtual {v0}, Lcom/yandex/metrica/a;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 231
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->k:Ljava/lang/String;

    sget-object v1, Lcom/yandex/metrica/a;->a:Lcom/yandex/metrica/a;

    invoke-virtual {v1}, Lcom/yandex/metrica/a;->name()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public B()Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;
    .locals 1

    .line 239
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->j:Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;

    return-object v0
.end method

.method protected a(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 85
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jq;->a:Landroid/content/Context;

    return-void
.end method

.method protected a(Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;)V
    .locals 0

    .line 243
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jq;->j:Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;

    return-void
.end method

.method protected a(Lcom/yandex/metrica/impl/g;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jq;->c:Lcom/yandex/metrica/impl/g;

    return-void
.end method

.method protected a(Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jq;->m:Lcom/yandex/metrica/impl/ob/ks;

    return-void
.end method

.method protected a(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jq;->b:Ljava/lang/String;

    return-void
.end method

.method protected b(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 144
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 145
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jq;->g:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->b:Ljava/lang/String;

    return-object v0
.end method

.method protected c(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 162
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jq;->f:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method protected d()Lcom/yandex/metrica/impl/ob/ks;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->m:Lcom/yandex/metrica/impl/ob/ks;

    return-object v0
.end method

.method protected declared-synchronized d(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    monitor-enter p0

    .line 178
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 179
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jq;->h:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 177
    monitor-exit p0

    throw p1
.end method

.method protected declared-synchronized e(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    monitor-enter p0

    .line 184
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 185
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jq;->i:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 183
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized e()Z
    .locals 4

    monitor-enter p0

    const/4 v0, 0x2

    .line 93
    :try_start_0
    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jq;->r()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jq;->q()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    invoke-static {v0}, Lcom/yandex/metrica/impl/bp;->a([Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return v3

    :cond_0
    monitor-exit p0

    return v2

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public f()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 106
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->c:Lcom/yandex/metrica/impl/g;

    iget-object v0, v0, Lcom/yandex/metrica/impl/g;->b:Ljava/lang/String;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final f(Ljava/lang/String;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jq;->l:Ljava/lang/String;

    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 1

    const-string v0, "2"

    return-object v0
.end method

.method g(Ljava/lang/String;)V
    .locals 0

    .line 235
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jq;->k:Ljava/lang/String;

    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "3.1.0"

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    const-string v0, "10422"

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->d:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    const-string v0, "android"

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 131
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->c:Lcom/yandex/metrica/impl/g;

    iget-object v0, v0, Lcom/yandex/metrica/impl/g;->c:Ljava/lang/String;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 136
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->c:Lcom/yandex/metrica/impl/g;

    iget-object v0, v0, Lcom/yandex/metrica/impl/g;->d:Ljava/lang/String;

    return-object v0
.end method

.method public n()I
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->c:Lcom/yandex/metrica/impl/g;

    iget v0, v0, Lcom/yandex/metrica/impl/g;->e:I

    return v0
.end method

.method public o()Ljava/lang/String;
    .locals 2

    .line 150
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->g:Ljava/lang/String;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public p()Ljava/lang/String;
    .locals 2

    .line 158
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->f:Ljava/lang/String;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized q()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    monitor-enter p0

    .line 169
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->i:Ljava/lang/String;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized r()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    monitor-enter p0

    .line 174
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->h:Ljava/lang/String;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public s()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 191
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->c:Lcom/yandex/metrica/impl/g;

    iget-object v0, v0, Lcom/yandex/metrica/impl/g;->h:Ljava/lang/String;

    return-object v0
.end method

.method public t()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 196
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->e:Ljava/lang/String;

    return-object v0
.end method

.method public u()I
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->c:Lcom/yandex/metrica/impl/g;

    iget-object v0, v0, Lcom/yandex/metrica/impl/g;->f:Lcom/yandex/metrica/impl/g$a;

    iget v0, v0, Lcom/yandex/metrica/impl/g$a;->a:I

    return v0
.end method

.method public v()I
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->c:Lcom/yandex/metrica/impl/g;

    iget-object v0, v0, Lcom/yandex/metrica/impl/g;->f:Lcom/yandex/metrica/impl/g$a;

    iget v0, v0, Lcom/yandex/metrica/impl/g$a;->b:I

    return v0
.end method

.method public w()I
    .locals 1

    .line 208
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->c:Lcom/yandex/metrica/impl/g;

    iget-object v0, v0, Lcom/yandex/metrica/impl/g;->f:Lcom/yandex/metrica/impl/g$a;

    iget v0, v0, Lcom/yandex/metrica/impl/g$a;->c:I

    return v0
.end method

.method public x()F
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->c:Lcom/yandex/metrica/impl/g;

    iget-object v0, v0, Lcom/yandex/metrica/impl/g;->f:Lcom/yandex/metrica/impl/g$a;

    iget v0, v0, Lcom/yandex/metrica/impl/g$a;->d:F

    return v0
.end method

.method public y()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 217
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->l:Ljava/lang/String;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public z()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 226
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq;->c:Lcom/yandex/metrica/impl/g;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jq;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/g;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
