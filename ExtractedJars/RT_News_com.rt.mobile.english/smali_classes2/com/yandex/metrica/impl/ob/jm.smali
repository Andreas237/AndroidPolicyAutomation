.class public Lcom/yandex/metrica/impl/ob/jm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/jm$b;,
        Lcom/yandex/metrica/impl/ob/jm$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/yandex/metrica/impl/ob/jm$b;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/yandex/metrica/impl/ob/jm$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/yandex/metrica/impl/ob/jm$a;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/yandex/metrica/impl/ob/jn;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private e:Lcom/yandex/metrica/impl/ob/jn;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private f:Z

.field private final g:Lcom/yandex/metrica/impl/ob/fj;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private h:Lcom/yandex/metrica/impl/ob/jm$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 45
    sget-object v0, Lcom/yandex/metrica/impl/ob/jm$b;->d:Lcom/yandex/metrica/impl/ob/jm$b;

    sget-object v1, Lcom/yandex/metrica/impl/ob/jm$b;->e:Lcom/yandex/metrica/impl/ob/jm$b;

    sget-object v2, Lcom/yandex/metrica/impl/ob/jm$b;->b:Lcom/yandex/metrica/impl/ob/jm$b;

    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/ob/jm;->a:Ljava/util/EnumSet;

    .line 49
    sget-object v0, Lcom/yandex/metrica/impl/ob/jm$b;->d:Lcom/yandex/metrica/impl/ob/jm$b;

    sget-object v1, Lcom/yandex/metrica/impl/ob/jm$b;->e:Lcom/yandex/metrica/impl/ob/jm$b;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/ob/jm;->b:Ljava/util/EnumSet;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 70
    new-instance v0, Lcom/yandex/metrica/impl/ob/fj;

    .line 72
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/eu;->c()Lcom/yandex/metrica/impl/ob/ev;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/fj;-><init>(Lcom/yandex/metrica/impl/ob/ev;)V

    .line 70
    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ob/jm;-><init>(Lcom/yandex/metrica/impl/ob/fj;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/fj;)V
    .locals 6
    .param p1    # Lcom/yandex/metrica/impl/ob/fj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jm;->c:Ljava/util/Set;

    .line 66
    sget-object v0, Lcom/yandex/metrica/impl/ob/jm$b;->a:Lcom/yandex/metrica/impl/ob/jm$b;

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jm;->h:Lcom/yandex/metrica/impl/ob/jm$b;

    .line 79
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jm;->g:Lcom/yandex/metrica/impl/ob/fj;

    .line 81
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/jm;->g:Lcom/yandex/metrica/impl/ob/fj;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fj;->d()Z

    move-result p1

    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/jm;->f:Z

    .line 82
    iget-boolean p1, p0, Lcom/yandex/metrica/impl/ob/jm;->f:Z

    if-nez p1, :cond_1

    .line 83
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/jm;->g:Lcom/yandex/metrica/impl/ob/fj;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fj;->b()Ljava/lang/String;

    move-result-object v1

    .line 84
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 85
    new-instance p1, Lcom/yandex/metrica/impl/ob/jn;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/yandex/metrica/impl/ob/jn;-><init>(Ljava/lang/String;JJ)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jm;->d:Lcom/yandex/metrica/impl/ob/jn;

    .line 87
    :cond_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/jm;->g:Lcom/yandex/metrica/impl/ob/fj;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fj;->c()Lcom/yandex/metrica/impl/ob/jn;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jm;->e:Lcom/yandex/metrica/impl/ob/jn;

    .line 88
    invoke-static {}, Lcom/yandex/metrica/impl/ob/jm$b;->values()[Lcom/yandex/metrica/impl/ob/jm$b;

    move-result-object p1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jm;->g:Lcom/yandex/metrica/impl/ob/fj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fj;->d(I)I

    move-result v0

    aget-object p1, p1, v0

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jm;->h:Lcom/yandex/metrica/impl/ob/jm$b;

    :cond_1
    return-void
.end method

.method private a()V
    .locals 2

    .line 156
    sget-object v0, Lcom/yandex/metrica/impl/ob/jm$1;->a:[I

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jm;->h:Lcom/yandex/metrica/impl/ob/jm$b;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jm$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 161
    :pswitch_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jm;->d:Lcom/yandex/metrica/impl/ob/jn;

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ob/jm;->b(Lcom/yandex/metrica/impl/ob/jn;)V

    goto :goto_0

    .line 158
    :pswitch_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jm;->e:Lcom/yandex/metrica/impl/ob/jn;

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ob/jm;->b(Lcom/yandex/metrica/impl/ob/jn;)V

    return-void

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a(Lcom/yandex/metrica/impl/ob/jm$b;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/jm$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 147
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jm;->h:Lcom/yandex/metrica/impl/ob/jm$b;

    if-eq p1, v0, :cond_0

    .line 148
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jm;->h:Lcom/yandex/metrica/impl/ob/jm$b;

    .line 149
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/jm;->g:Lcom/yandex/metrica/impl/ob/fj;

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jm;->h:Lcom/yandex/metrica/impl/ob/jm$b;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/jm$b;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/fj;->e(I)Lcom/yandex/metrica/impl/ob/fj;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fj;->i()V

    .line 150
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/jm;->a()V

    :cond_0
    return-void
.end method

.method private declared-synchronized b(Lcom/yandex/metrica/impl/ob/jn;)V
    .locals 4
    .param p1    # Lcom/yandex/metrica/impl/ob/jn;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    monitor-enter p0

    if-eqz p1, :cond_2

    .line 171
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jm;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 173
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jm;->f:Z

    if-nez v0, :cond_2

    const/4 v0, 0x0

    .line 176
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jm;->c:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/yandex/metrica/impl/ob/jm$a;

    .line 177
    invoke-interface {v2, p1}, Lcom/yandex/metrica/impl/ob/jm$a;->a(Lcom/yandex/metrica/impl/ob/jn;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v3

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 1192
    iput-boolean v3, p0, Lcom/yandex/metrica/impl/ob/jm;->f:Z

    .line 1193
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/jm;->g:Lcom/yandex/metrica/impl/ob/fj;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fj;->e()Lcom/yandex/metrica/impl/ob/fj;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fj;->f()Lcom/yandex/metrica/impl/ob/fj;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fj;->i()V

    .line 183
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/jm;->c:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 168
    monitor-exit p0

    throw p1

    .line 188
    :cond_2
    :goto_1
    monitor-exit p0

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Lcom/yandex/metrica/impl/ob/jm$a;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/jm$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    .line 114
    :try_start_0
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jm;->f:Z

    if-nez v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jm;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 116
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/jm;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 113
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Lcom/yandex/metrica/impl/ob/jn;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/jn;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    monitor-enter p0

    .line 94
    :try_start_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/jm;->b:Ljava/util/EnumSet;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jm;->h:Lcom/yandex/metrica/impl/ob/jm$b;

    invoke-virtual {v0, v1}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 95
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jm;->e:Lcom/yandex/metrica/impl/ob/jn;

    .line 96
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jm;->g:Lcom/yandex/metrica/impl/ob/fj;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/fj;->a(Lcom/yandex/metrica/impl/ob/jn;)Lcom/yandex/metrica/impl/ob/fj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/fj;->i()V

    .line 1125
    sget-object v0, Lcom/yandex/metrica/impl/ob/jm$1;->a:[I

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jm;->h:Lcom/yandex/metrica/impl/ob/jm$b;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jm$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 1130
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/jm;->h:Lcom/yandex/metrica/impl/ob/jm$b;

    goto :goto_0

    :pswitch_0
    if-nez p1, :cond_0

    .line 1129
    sget-object p1, Lcom/yandex/metrica/impl/ob/jm$b;->e:Lcom/yandex/metrica/impl/ob/jm$b;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/yandex/metrica/impl/ob/jm$b;->d:Lcom/yandex/metrica/impl/ob/jm$b;

    goto :goto_0

    :pswitch_1
    if-nez p1, :cond_1

    .line 1127
    sget-object p1, Lcom/yandex/metrica/impl/ob/jm$b;->c:Lcom/yandex/metrica/impl/ob/jm$b;

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/yandex/metrica/impl/ob/jm$b;->d:Lcom/yandex/metrica/impl/ob/jm$b;

    .line 97
    :goto_0
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/jm;->a(Lcom/yandex/metrica/impl/ob/jm$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 93
    monitor-exit p0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public declared-synchronized a(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    monitor-enter p0

    .line 103
    :try_start_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/jm;->a:Ljava/util/EnumSet;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jm;->h:Lcom/yandex/metrica/impl/ob/jm$b;

    invoke-virtual {v0, v1}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 105
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 106
    new-instance v0, Lcom/yandex/metrica/impl/ob/jn;

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/yandex/metrica/impl/ob/jn;-><init>(Ljava/lang/String;JJ)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jm;->d:Lcom/yandex/metrica/impl/ob/jn;

    .line 107
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jm;->g:Lcom/yandex/metrica/impl/ob/fj;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/fj;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fj;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fj;->i()V

    .line 1135
    sget-object p1, Lcom/yandex/metrica/impl/ob/jm$1;->a:[I

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jm;->h:Lcom/yandex/metrica/impl/ob/jm$b;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/jm$b;->ordinal()I

    move-result v0

    aget p1, p1, v0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    .line 1141
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/jm;->h:Lcom/yandex/metrica/impl/ob/jm$b;

    goto :goto_0

    .line 1139
    :cond_0
    sget-object p1, Lcom/yandex/metrica/impl/ob/jm$b;->e:Lcom/yandex/metrica/impl/ob/jm$b;

    goto :goto_0

    .line 1137
    :cond_1
    sget-object p1, Lcom/yandex/metrica/impl/ob/jm$b;->b:Lcom/yandex/metrica/impl/ob/jm$b;

    .line 108
    :goto_0
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/jm;->a(Lcom/yandex/metrica/impl/ob/jm$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 102
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(Lcom/yandex/metrica/impl/ob/jm$a;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/jm$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    .line 121
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jm;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 120
    monitor-exit p0

    throw p1
.end method
