.class public Lcom/yandex/metrica/impl/ob/dn;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/dn$b;,
        Lcom/yandex/metrica/impl/ob/dn$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/ab;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/dn$a;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final c:Lcom/yandex/metrica/impl/ob/dh;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/dh<",
            "Lcom/yandex/metrica/impl/ob/dj;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/yandex/metrica/impl/ob/dh;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/dh<",
            "Lcom/yandex/metrica/impl/ob/dj;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/yandex/metrica/impl/ob/di;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private f:Lcom/yandex/metrica/impl/ob/dn$b;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/dn$a;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/ab;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/dn$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 46
    new-instance v0, Lcom/yandex/metrica/impl/ob/dg;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/dg;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    new-instance v1, Lcom/yandex/metrica/impl/ob/df;

    invoke-direct {v1, p1}, Lcom/yandex/metrica/impl/ob/df;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/yandex/metrica/impl/ob/dn;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/dn$a;Lcom/yandex/metrica/impl/ob/dh;Lcom/yandex/metrica/impl/ob/dh;)V

    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/dn$a;Lcom/yandex/metrica/impl/ob/dh;Lcom/yandex/metrica/impl/ob/dh;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/ab;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/dn$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/dh;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/dh;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/ab;",
            "Lcom/yandex/metrica/impl/ob/dn$a;",
            "Lcom/yandex/metrica/impl/ob/dh<",
            "Lcom/yandex/metrica/impl/ob/dj;",
            ">;",
            "Lcom/yandex/metrica/impl/ob/dh<",
            "Lcom/yandex/metrica/impl/ob/dj;",
            ">;)V"
        }
    .end annotation

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->f:Lcom/yandex/metrica/impl/ob/dn$b;

    .line 56
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dn;->a:Lcom/yandex/metrica/impl/ob/ab;

    .line 57
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/dn;->b:Lcom/yandex/metrica/impl/ob/dn$a;

    .line 59
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/dn;->c:Lcom/yandex/metrica/impl/ob/dh;

    .line 60
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/dn;->d:Lcom/yandex/metrica/impl/ob/dh;

    return-void
.end method

.method private static a(Lcom/yandex/metrica/impl/ob/di;J)Lcom/yandex/metrica/impl/ob/do;
    .locals 3
    .param p0    # Lcom/yandex/metrica/impl/ob/di;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 226
    new-instance v0, Lcom/yandex/metrica/impl/ob/do;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/do;-><init>()V

    .line 227
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/di;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/do;->a(J)Lcom/yandex/metrica/impl/ob/do;

    move-result-object v0

    .line 228
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/di;->f()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/do;->b(J)Lcom/yandex/metrica/impl/ob/do;

    move-result-object v0

    .line 229
    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/di;->c(J)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lcom/yandex/metrica/impl/ob/do;->c(J)Lcom/yandex/metrica/impl/ob/do;

    move-result-object p1

    .line 230
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/di;->a()Lcom/yandex/metrica/impl/ob/dr;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/yandex/metrica/impl/ob/do;->a(Lcom/yandex/metrica/impl/ob/dr;)Lcom/yandex/metrica/impl/ob/do;

    move-result-object p0

    return-object p0
.end method

.method private a(Lcom/yandex/metrica/impl/ob/di;Lcom/yandex/metrica/impl/h;)Z
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/di;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 177
    :cond_0
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/h;->u()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/yandex/metrica/impl/ob/di;->a(J)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    .line 180
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/dn;->b(Lcom/yandex/metrica/impl/ob/di;Lcom/yandex/metrica/impl/h;)V

    return v0
.end method

.method private b(Lcom/yandex/metrica/impl/ob/di;Lcom/yandex/metrica/impl/h;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/di;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 187
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/di;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->b:Lcom/yandex/metrica/impl/ob/dn$a;

    .line 4422
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->f:Lcom/yandex/metrica/impl/q$a;

    invoke-static {p2, v1}, Lcom/yandex/metrica/impl/h;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/q$a;)Lcom/yandex/metrica/impl/h;

    move-result-object p2

    .line 188
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/dn;->a(Lcom/yandex/metrica/impl/ob/di;)Lcom/yandex/metrica/impl/ob/do;

    move-result-object v1

    invoke-interface {v0, p2, v1}, Lcom/yandex/metrica/impl/ob/dn$a;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/do;)V

    const/4 p2, 0x0

    .line 189
    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/di;->a(Z)V

    .line 193
    :cond_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/di;->e()V

    return-void
.end method

.method private f(Lcom/yandex/metrica/impl/h;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 155
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->f:Lcom/yandex/metrica/impl/ob/dn$b;

    if-nez v0, :cond_2

    .line 156
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->c:Lcom/yandex/metrica/impl/ob/dh;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/dh;->a()Lcom/yandex/metrica/impl/ob/di;

    move-result-object v0

    .line 157
    invoke-direct {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/dn;->a(Lcom/yandex/metrica/impl/ob/di;Lcom/yandex/metrica/impl/h;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 158
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    .line 159
    sget-object p1, Lcom/yandex/metrica/impl/ob/dn$b;->c:Lcom/yandex/metrica/impl/ob/dn$b;

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dn;->f:Lcom/yandex/metrica/impl/ob/dn$b;

    return-void

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->d:Lcom/yandex/metrica/impl/ob/dh;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/dh;->a()Lcom/yandex/metrica/impl/ob/di;

    move-result-object v0

    .line 162
    invoke-direct {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/dn;->a(Lcom/yandex/metrica/impl/ob/di;Lcom/yandex/metrica/impl/h;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 163
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    .line 164
    sget-object p1, Lcom/yandex/metrica/impl/ob/dn$b;->b:Lcom/yandex/metrica/impl/ob/dn$b;

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dn;->f:Lcom/yandex/metrica/impl/ob/dn$b;

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 166
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    .line 167
    sget-object p1, Lcom/yandex/metrica/impl/ob/dn$b;->a:Lcom/yandex/metrica/impl/ob/dn$b;

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dn;->f:Lcom/yandex/metrica/impl/ob/dn$b;

    :cond_2
    return-void
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/ob/di;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 119
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    return-object v0
.end method

.method a(Lcom/yandex/metrica/impl/ob/di;)Lcom/yandex/metrica/impl/ob/do;
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/di;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 218
    new-instance v0, Lcom/yandex/metrica/impl/ob/do;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/do;-><init>()V

    .line 219
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/di;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/do;->a(J)Lcom/yandex/metrica/impl/ob/do;

    move-result-object v0

    .line 220
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/di;->a()Lcom/yandex/metrica/impl/ob/dr;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/do;->a(Lcom/yandex/metrica/impl/ob/dr;)Lcom/yandex/metrica/impl/ob/do;

    move-result-object v0

    .line 221
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/di;->f()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/do;->b(J)Lcom/yandex/metrica/impl/ob/do;

    move-result-object v0

    .line 222
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/di;->d()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/do;->c(J)Lcom/yandex/metrica/impl/ob/do;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/h;)V
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 65
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/dn;->f(Lcom/yandex/metrica/impl/h;)V

    .line 66
    sget-object v0, Lcom/yandex/metrica/impl/ob/dn$1;->a:[I

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/dn;->f:Lcom/yandex/metrica/impl/ob/dn$b;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/dn$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 79
    :pswitch_0
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/dn;->e(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/ob/di;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    goto :goto_0

    .line 75
    :pswitch_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    invoke-direct {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/dn;->b(Lcom/yandex/metrica/impl/ob/di;Lcom/yandex/metrica/impl/h;)V

    .line 76
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/dn;->e(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/ob/di;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    return-void

    .line 68
    :pswitch_2
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    invoke-direct {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/dn;->a(Lcom/yandex/metrica/impl/ob/di;Lcom/yandex/metrica/impl/h;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->u()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/di;->b(J)V

    return-void

    .line 71
    :cond_0
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/dn;->e(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/ob/di;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    return-void

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a(Lcom/yandex/metrica/impl/h;Z)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 123
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/dn;->c(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/ob/di;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/di;->a(Z)V

    return-void
.end method

.method public b()Lcom/yandex/metrica/impl/ob/do;
    .locals 10
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 3028
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    .line 129
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/dn;->a:Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ab;->m()Lcom/yandex/metrica/impl/ob/es;

    move-result-object v4

    sget-object v7, Lcom/yandex/metrica/impl/ob/dr;->b:Lcom/yandex/metrica/impl/ob/dr;

    move-wide v5, v0

    move-wide v8, v0

    invoke-virtual/range {v4 .. v9}, Lcom/yandex/metrica/impl/ob/es;->a(JLcom/yandex/metrica/impl/ob/dr;J)V

    .line 130
    new-instance v2, Lcom/yandex/metrica/impl/ob/do;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/do;-><init>()V

    .line 131
    invoke-virtual {v2, v0, v1}, Lcom/yandex/metrica/impl/ob/do;->a(J)Lcom/yandex/metrica/impl/ob/do;

    move-result-object v0

    sget-object v1, Lcom/yandex/metrica/impl/ob/dr;->b:Lcom/yandex/metrica/impl/ob/dr;

    .line 132
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/do;->a(Lcom/yandex/metrica/impl/ob/dr;)Lcom/yandex/metrica/impl/ob/do;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 133
    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/do;->b(J)Lcom/yandex/metrica/impl/ob/do;

    move-result-object v0

    .line 134
    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/do;->c(J)Lcom/yandex/metrica/impl/ob/do;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/yandex/metrica/impl/h;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 85
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/dn;->f(Lcom/yandex/metrica/impl/h;)V

    .line 86
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->f:Lcom/yandex/metrica/impl/ob/dn$b;

    sget-object v1, Lcom/yandex/metrica/impl/ob/dn$b;->a:Lcom/yandex/metrica/impl/ob/dn$b;

    if-eq v0, v1, :cond_0

    .line 87
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    invoke-direct {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/dn;->b(Lcom/yandex/metrica/impl/ob/di;Lcom/yandex/metrica/impl/h;)V

    .line 89
    :cond_0
    sget-object p1, Lcom/yandex/metrica/impl/ob/dn$b;->a:Lcom/yandex/metrica/impl/ob/dn$b;

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dn;->f:Lcom/yandex/metrica/impl/ob/dn$b;

    return-void
.end method

.method public c(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/ob/di;
    .locals 6
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 93
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/dn;->f(Lcom/yandex/metrica/impl/h;)V

    .line 94
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->f:Lcom/yandex/metrica/impl/ob/dn$b;

    sget-object v1, Lcom/yandex/metrica/impl/ob/dn$b;->a:Lcom/yandex/metrica/impl/ob/dn$b;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    invoke-direct {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/dn;->a(Lcom/yandex/metrica/impl/ob/di;Lcom/yandex/metrica/impl/h;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 96
    sget-object v0, Lcom/yandex/metrica/impl/ob/dn$b;->a:Lcom/yandex/metrica/impl/ob/dn$b;

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->f:Lcom/yandex/metrica/impl/ob/dn$b;

    const/4 v0, 0x0

    .line 97
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    .line 100
    :cond_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/dn$1;->a:[I

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/dn;->f:Lcom/yandex/metrica/impl/ob/dn$b;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/dn$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 1198
    sget-object v0, Lcom/yandex/metrica/impl/ob/dn$b;->b:Lcom/yandex/metrica/impl/ob/dn$b;

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->f:Lcom/yandex/metrica/impl/ob/dn$b;

    .line 1199
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->u()J

    move-result-wide v0

    .line 1200
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/dn;->d:Lcom/yandex/metrica/impl/ob/dh;

    new-instance v3, Lcom/yandex/metrica/impl/ob/dj;

    .line 1202
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->v()J

    move-result-wide v4

    invoke-direct {v3, v0, v1, v4, v5}, Lcom/yandex/metrica/impl/ob/dj;-><init>(JJ)V

    .line 1200
    invoke-interface {v2, v3}, Lcom/yandex/metrica/impl/ob/dh;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/di;

    move-result-object v2

    .line 1205
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/dn;->a:Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/ab;->B()Lcom/yandex/metrica/impl/ob/ff;

    move-result-object v3

    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/ff;->d()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1206
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->b:Lcom/yandex/metrica/impl/ob/dn$a;

    .line 1426
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->z:Lcom/yandex/metrica/impl/q$a;

    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/h;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/q$a;)Lcom/yandex/metrica/impl/h;

    move-result-object v1

    .line 1207
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->u()J

    move-result-wide v3

    .line 1206
    invoke-static {v2, v3, v4}, Lcom/yandex/metrica/impl/ob/dn;->a(Lcom/yandex/metrica/impl/ob/di;J)Lcom/yandex/metrica/impl/ob/do;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/yandex/metrica/impl/ob/dn$a;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/do;)V

    goto :goto_0

    .line 104
    :pswitch_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->u()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/di;->b(J)V

    .line 105
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    return-object p1

    .line 102
    :pswitch_1
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    return-object p1

    .line 1208
    :cond_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->d()I

    move-result v3

    sget-object v4, Lcom/yandex/metrica/impl/q$a;->y:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {v4}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v4

    if-ne v3, v4, :cond_2

    .line 1209
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/dn;->b:Lcom/yandex/metrica/impl/ob/dn$a;

    invoke-static {v2, v0, v1}, Lcom/yandex/metrica/impl/ob/dn;->a(Lcom/yandex/metrica/impl/ob/di;J)Lcom/yandex/metrica/impl/ob/do;

    move-result-object v4

    invoke-interface {v3, p1, v4}, Lcom/yandex/metrica/impl/ob/dn$a;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/do;)V

    .line 1210
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/dn;->b:Lcom/yandex/metrica/impl/ob/dn$a;

    .line 2426
    sget-object v4, Lcom/yandex/metrica/impl/q$a;->z:Lcom/yandex/metrica/impl/q$a;

    invoke-static {p1, v4}, Lcom/yandex/metrica/impl/h;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/q$a;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    .line 1210
    invoke-static {v2, v0, v1}, Lcom/yandex/metrica/impl/ob/dn;->a(Lcom/yandex/metrica/impl/ob/di;J)Lcom/yandex/metrica/impl/ob/do;

    move-result-object v0

    invoke-interface {v3, p1, v0}, Lcom/yandex/metrica/impl/ob/dn$a;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/do;)V

    .line 108
    :cond_2
    :goto_0
    iput-object v2, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    .line 109
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/dn;->e:Lcom/yandex/metrica/impl/ob/di;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/ob/do;
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 114
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/dn;->c(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/ob/di;

    move-result-object v0

    .line 115
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->u()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/dn;->a(Lcom/yandex/metrica/impl/ob/di;J)Lcom/yandex/metrica/impl/ob/do;

    move-result-object p1

    return-object p1
.end method

.method e(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/ob/di;
    .locals 6
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 141
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->u()J

    move-result-wide v0

    .line 142
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/dn;->c:Lcom/yandex/metrica/impl/ob/dh;

    new-instance v3, Lcom/yandex/metrica/impl/ob/dj;

    .line 144
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->v()J

    move-result-wide v4

    invoke-direct {v3, v0, v1, v4, v5}, Lcom/yandex/metrica/impl/ob/dj;-><init>(JJ)V

    .line 142
    invoke-interface {v2, v3}, Lcom/yandex/metrica/impl/ob/dh;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/di;

    move-result-object v2

    .line 146
    sget-object v3, Lcom/yandex/metrica/impl/ob/dn$b;->c:Lcom/yandex/metrica/impl/ob/dn$b;

    iput-object v3, p0, Lcom/yandex/metrica/impl/ob/dn;->f:Lcom/yandex/metrica/impl/ob/dn$b;

    .line 148
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/dn;->a:Lcom/yandex/metrica/impl/ob/ab;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lcom/yandex/metrica/impl/ob/ab;->a(Z)V

    .line 149
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/dn;->b:Lcom/yandex/metrica/impl/ob/dn$a;

    .line 3426
    sget-object v4, Lcom/yandex/metrica/impl/q$a;->z:Lcom/yandex/metrica/impl/q$a;

    invoke-static {p1, v4}, Lcom/yandex/metrica/impl/h;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/q$a;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    .line 150
    invoke-static {v2, v0, v1}, Lcom/yandex/metrica/impl/ob/dn;->a(Lcom/yandex/metrica/impl/ob/di;J)Lcom/yandex/metrica/impl/ob/do;

    move-result-object v0

    .line 149
    invoke-interface {v3, p1, v0}, Lcom/yandex/metrica/impl/ob/dn$a;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/do;)V

    return-object v2
.end method
