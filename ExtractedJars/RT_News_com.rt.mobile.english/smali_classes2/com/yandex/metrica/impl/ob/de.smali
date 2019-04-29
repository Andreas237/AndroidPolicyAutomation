.class public abstract Lcom/yandex/metrica/impl/ob/de;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/dh;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/dh<",
        "Lcom/yandex/metrica/impl/ob/dj;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/ab;

.field private final b:Lcom/yandex/metrica/impl/ob/fh;

.field private final c:Lcom/yandex/metrica/impl/ob/dq;

.field private final d:Lcom/yandex/metrica/impl/ob/dm;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/fh;Lcom/yandex/metrica/impl/ob/dq;Lcom/yandex/metrica/impl/ob/dm;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/ab;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/fh;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/dq;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/dm;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/de;->a:Lcom/yandex/metrica/impl/ob/ab;

    .line 38
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/de;->b:Lcom/yandex/metrica/impl/ob/fh;

    .line 39
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/de;->c:Lcom/yandex/metrica/impl/ob/dq;

    .line 40
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/de;->d:Lcom/yandex/metrica/impl/ob/dm;

    return-void
.end method


# virtual methods
.method public final a()Lcom/yandex/metrica/impl/ob/di;
    .locals 4
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/de;->c:Lcom/yandex/metrica/impl/ob/dq;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/dq;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 46
    new-instance v0, Lcom/yandex/metrica/impl/ob/di;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/de;->a:Lcom/yandex/metrica/impl/ob/ab;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/de;->c:Lcom/yandex/metrica/impl/ob/dq;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/de;->b()Lcom/yandex/metrica/impl/ob/dk;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/yandex/metrica/impl/ob/di;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/dp;Lcom/yandex/metrica/impl/ob/dk;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public synthetic a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/di;
    .locals 17
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    move-object/from16 v0, p0

    .line 23
    move-object/from16 v1, p1

    check-cast v1, Lcom/yandex/metrica/impl/ob/dj;

    .line 1054
    iget-object v2, v0, Lcom/yandex/metrica/impl/ob/de;->c:Lcom/yandex/metrica/impl/ob/dq;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/dq;->i()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1058
    iget-object v2, v0, Lcom/yandex/metrica/impl/ob/de;->a:Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ab;->c()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object v2

    const-string v3, "create session with non-empty storage"

    .line 1059
    invoke-interface {v2, v3}, Lcom/yandex/metrica/b;->reportEvent(Ljava/lang/String;)V

    .line 1061
    :cond_0
    new-instance v2, Lcom/yandex/metrica/impl/ob/di;

    iget-object v3, v0, Lcom/yandex/metrica/impl/ob/de;->a:Lcom/yandex/metrica/impl/ob/ab;

    iget-object v4, v0, Lcom/yandex/metrica/impl/ob/de;->c:Lcom/yandex/metrica/impl/ob/dq;

    .line 1086
    iget-object v5, v0, Lcom/yandex/metrica/impl/ob/de;->b:Lcom/yandex/metrica/impl/ob/fh;

    const-wide/16 v6, -0x1

    invoke-virtual {v5, v6, v7}, Lcom/yandex/metrica/impl/ob/fh;->f(J)J

    move-result-wide v5

    const-wide v7, 0x2540be400L

    cmp-long v9, v5, v7

    if-gez v9, :cond_1

    move-wide v12, v7

    goto :goto_0

    :cond_1
    const-wide/16 v7, 0x1

    add-long v9, v5, v7

    move-wide v12, v9

    .line 1088
    :goto_0
    iget-object v5, v0, Lcom/yandex/metrica/impl/ob/de;->b:Lcom/yandex/metrica/impl/ob/fh;

    invoke-virtual {v5, v12, v13}, Lcom/yandex/metrica/impl/ob/fh;->g(J)Lcom/yandex/metrica/impl/ob/fh;

    move-result-object v5

    invoke-virtual {v5}, Lcom/yandex/metrica/impl/ob/fh;->i()V

    .line 1068
    iget-object v5, v0, Lcom/yandex/metrica/impl/ob/de;->c:Lcom/yandex/metrica/impl/ob/dq;

    invoke-virtual {v5, v12, v13}, Lcom/yandex/metrica/impl/ob/dq;->d(J)Lcom/yandex/metrica/impl/ob/dq;

    move-result-object v5

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v7, v1, Lcom/yandex/metrica/impl/ob/dj;->a:J

    .line 1069
    invoke-virtual {v6, v7, v8}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/yandex/metrica/impl/ob/dq;->b(J)Lcom/yandex/metrica/impl/ob/dq;

    move-result-object v5

    iget-wide v6, v1, Lcom/yandex/metrica/impl/ob/dj;->a:J

    .line 1070
    invoke-virtual {v5, v6, v7}, Lcom/yandex/metrica/impl/ob/dq;->e(J)Lcom/yandex/metrica/impl/ob/dq;

    move-result-object v5

    const-wide/16 v6, 0x0

    .line 1071
    invoke-virtual {v5, v6, v7}, Lcom/yandex/metrica/impl/ob/dq;->a(J)Lcom/yandex/metrica/impl/ob/dq;

    move-result-object v5

    const/4 v6, 0x1

    .line 1072
    invoke-virtual {v5, v6}, Lcom/yandex/metrica/impl/ob/dq;->a(Z)Lcom/yandex/metrica/impl/ob/dq;

    move-result-object v5

    .line 1073
    invoke-virtual {v5}, Lcom/yandex/metrica/impl/ob/dq;->h()V

    .line 1075
    iget-object v5, v0, Lcom/yandex/metrica/impl/ob/de;->a:Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v5}, Lcom/yandex/metrica/impl/ob/ab;->m()Lcom/yandex/metrica/impl/ob/es;

    move-result-object v11

    iget-object v5, v0, Lcom/yandex/metrica/impl/ob/de;->d:Lcom/yandex/metrica/impl/ob/dm;

    .line 1077
    invoke-virtual {v5}, Lcom/yandex/metrica/impl/ob/dm;->a()Lcom/yandex/metrica/impl/ob/dr;

    move-result-object v14

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v6, v1, Lcom/yandex/metrica/impl/ob/dj;->b:J

    .line 1078
    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v15

    .line 1075
    invoke-virtual/range {v11 .. v16}, Lcom/yandex/metrica/impl/ob/es;->a(JLcom/yandex/metrica/impl/ob/dr;J)V

    .line 1082
    invoke-virtual/range {p0 .. p0}, Lcom/yandex/metrica/impl/ob/de;->b()Lcom/yandex/metrica/impl/ob/dk;

    move-result-object v1

    .line 1061
    invoke-direct {v2, v3, v4, v1}, Lcom/yandex/metrica/impl/ob/di;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/dp;Lcom/yandex/metrica/impl/ob/dk;)V

    return-object v2
.end method

.method b()Lcom/yandex/metrica/impl/ob/dk;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/de;->d:Lcom/yandex/metrica/impl/ob/dm;

    .line 1046
    new-instance v1, Lcom/yandex/metrica/impl/ob/dk$a;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/yandex/metrica/impl/ob/dk$a;-><init>(Lcom/yandex/metrica/impl/ob/dm;B)V

    .line 95
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/de;->c:Lcom/yandex/metrica/impl/ob/dq;

    .line 96
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/dq;->g()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/yandex/metrica/impl/ob/dk$a;->a(Ljava/lang/Boolean;)Lcom/yandex/metrica/impl/ob/dk$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/de;->c:Lcom/yandex/metrica/impl/ob/dq;

    .line 97
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/dq;->d()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/dk$a;->c(Ljava/lang/Long;)Lcom/yandex/metrica/impl/ob/dk$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/de;->c:Lcom/yandex/metrica/impl/ob/dq;

    .line 98
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/dq;->c()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/dk$a;->b(Ljava/lang/Long;)Lcom/yandex/metrica/impl/ob/dk$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/de;->c:Lcom/yandex/metrica/impl/ob/dq;

    .line 99
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/dq;->b()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/dk$a;->a(Ljava/lang/Long;)Lcom/yandex/metrica/impl/ob/dk$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/de;->c:Lcom/yandex/metrica/impl/ob/dq;

    .line 100
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/dq;->e()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/dk$a;->d(Ljava/lang/Long;)Lcom/yandex/metrica/impl/ob/dk$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/de;->c:Lcom/yandex/metrica/impl/ob/dq;

    .line 101
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/dq;->f()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/dk$a;->e(Ljava/lang/Long;)Lcom/yandex/metrica/impl/ob/dk$a;

    move-result-object v0

    .line 102
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/dk$a;->a()Lcom/yandex/metrica/impl/ob/dk;

    move-result-object v0

    return-object v0
.end method
