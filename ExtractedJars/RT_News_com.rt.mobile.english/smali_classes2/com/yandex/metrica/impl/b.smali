.class public abstract Lcom/yandex/metrica/impl/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/b;


# static fields
.field private static final c:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Lcom/yandex/metrica/impl/ob/nk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Lcom/yandex/metrica/impl/ob/nk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:Lcom/yandex/metrica/impl/ob/nk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final g:Lcom/yandex/metrica/impl/ob/nk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field private static final h:Lcom/yandex/metrica/impl/ob/nk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Lcom/yandex/metrica/profile/UserProfile;",
            ">;"
        }
    .end annotation
.end field

.field private static final i:Lcom/yandex/metrica/impl/ob/nk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Lcom/yandex/metrica/impl/ob/jg$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final j:Lcom/yandex/metrica/impl/ob/nk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Lcom/yandex/metrica/Revenue;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected final a:Lcom/yandex/metrica/impl/bc;

.field protected final b:Lcom/yandex/metrica/impl/bf;

.field private k:Lcom/yandex/metrica/impl/y;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 48
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Integer;

    const/16 v2, 0xe

    .line 49
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/16 v2, 0xf

    .line 50
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 49
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/yandex/metrica/impl/b;->c:Ljava/util/Collection;

    .line 52
    new-instance v0, Lcom/yandex/metrica/impl/ob/ng;

    new-instance v1, Lcom/yandex/metrica/impl/ob/ne;

    const-string v2, "Event name"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/ne;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ng;-><init>(Lcom/yandex/metrica/impl/ob/nk;)V

    sput-object v0, Lcom/yandex/metrica/impl/b;->d:Lcom/yandex/metrica/impl/ob/nk;

    .line 55
    new-instance v0, Lcom/yandex/metrica/impl/ob/ng;

    new-instance v1, Lcom/yandex/metrica/impl/ob/ne;

    const-string v2, "Error message"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/ne;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ng;-><init>(Lcom/yandex/metrica/impl/ob/nk;)V

    sput-object v0, Lcom/yandex/metrica/impl/b;->e:Lcom/yandex/metrica/impl/ob/nk;

    .line 58
    new-instance v0, Lcom/yandex/metrica/impl/ob/ng;

    new-instance v1, Lcom/yandex/metrica/impl/ob/ne;

    const-string v2, "Native crash"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/ne;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ng;-><init>(Lcom/yandex/metrica/impl/ob/nk;)V

    sput-object v0, Lcom/yandex/metrica/impl/b;->f:Lcom/yandex/metrica/impl/ob/nk;

    .line 61
    new-instance v0, Lcom/yandex/metrica/impl/ob/ng;

    new-instance v1, Lcom/yandex/metrica/impl/ob/nf;

    const-string v2, "User Info"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/nf;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ng;-><init>(Lcom/yandex/metrica/impl/ob/nk;)V

    .line 64
    new-instance v0, Lcom/yandex/metrica/impl/ob/ng;

    new-instance v1, Lcom/yandex/metrica/impl/ob/nf;

    const-string v2, "Unhandled exception"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/nf;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ng;-><init>(Lcom/yandex/metrica/impl/ob/nk;)V

    sput-object v0, Lcom/yandex/metrica/impl/b;->g:Lcom/yandex/metrica/impl/ob/nk;

    .line 67
    new-instance v0, Lcom/yandex/metrica/impl/ob/ng;

    new-instance v1, Lcom/yandex/metrica/impl/ob/nf;

    const-string v2, "User profile"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/nf;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ng;-><init>(Lcom/yandex/metrica/impl/ob/nk;)V

    sput-object v0, Lcom/yandex/metrica/impl/b;->h:Lcom/yandex/metrica/impl/ob/nk;

    .line 70
    new-instance v0, Lcom/yandex/metrica/impl/b$1;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/b$1;-><init>()V

    sput-object v0, Lcom/yandex/metrica/impl/b;->i:Lcom/yandex/metrica/impl/ob/nk;

    .line 79
    new-instance v0, Lcom/yandex/metrica/impl/ob/ng;

    new-instance v1, Lcom/yandex/metrica/impl/ob/nf;

    const-string v2, "Revenue"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/nf;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ng;-><init>(Lcom/yandex/metrica/impl/ob/nk;)V

    sput-object v0, Lcom/yandex/metrica/impl/b;->j:Lcom/yandex/metrica/impl/ob/nk;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/bf;Lcom/yandex/metrica/impl/bc;)V
    .locals 4

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 94
    iput-object p2, p0, Lcom/yandex/metrica/impl/b;->b:Lcom/yandex/metrica/impl/bf;

    .line 96
    iput-object p3, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    .line 98
    iget-object p1, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    new-instance p2, Lcom/yandex/metrica/impl/ob/my;

    const-string p3, "Crash Environment"

    .line 1053
    new-instance v0, Lcom/yandex/metrica/impl/ob/mx;

    const/16 v1, 0x1e

    const/16 v2, 0x32

    const/16 v3, 0x64

    invoke-direct {v0, v1, v2, v3, p3}, Lcom/yandex/metrica/impl/ob/mx;-><init>(IIILjava/lang/String;)V

    .line 99
    invoke-direct {p2, v0}, Lcom/yandex/metrica/impl/ob/my;-><init>(Lcom/yandex/metrica/impl/ob/mx;)V

    .line 98
    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/bc;->a(Lcom/yandex/metrica/impl/ob/my;)V

    return-void
.end method

.method private a(Lcom/yandex/metrica/impl/h;)V
    .locals 2

    .line 308
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->b:Lcom/yandex/metrica/impl/bf;

    iget-object v1, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0, p1, v1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 2

    .line 104
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->b:Lcom/yandex/metrica/impl/bf;

    iget-object v1, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/bc;)V

    return-void
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1235
    sget-object v0, Lcom/yandex/metrica/impl/b;->c:Ljava/util/Collection;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    if-lez p1, :cond_0

    const/16 v0, 0x63

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    if-nez p4, :cond_1

    const/4 p4, 0x0

    goto :goto_1

    .line 229
    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p4}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    move-object p4, v0

    :goto_1
    invoke-static {p1, p2, p3, p4}, Lcom/yandex/metrica/impl/q;->a(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/b;->a(Lcom/yandex/metrica/impl/h;)V

    :cond_2
    return-void
.end method

.method a(Lcom/yandex/metrica/impl/j;)V
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bc;->a(Lcom/yandex/metrica/impl/j;)V

    return-void
.end method

.method a(Lcom/yandex/metrica/impl/ob/ko;)V
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bc;->b(Lcom/yandex/metrica/impl/ob/ko;)V

    return-void
.end method

.method a(Lcom/yandex/metrica/impl/y;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/yandex/metrica/impl/b;->k:Lcom/yandex/metrica/impl/y;

    return-void
.end method

.method a(Ljava/lang/String;)V
    .locals 2

    .line 160
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->b:Lcom/yandex/metrica/impl/bf;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/bf;->d()V

    .line 164
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->k:Lcom/yandex/metrica/impl/y;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/y;->b()V

    .line 166
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->b:Lcom/yandex/metrica/impl/bf;

    invoke-static {p1}, Lcom/yandex/metrica/impl/q;->b(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    iget-object v1, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0, p1, v1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    .line 168
    iget-object p1, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bc;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1178
    iget-object p1, p0, Lcom/yandex/metrica/impl/b;->b:Lcom/yandex/metrica/impl/bf;

    sget-object v0, Lcom/yandex/metrica/impl/q$a;->m:Lcom/yandex/metrica/impl/q$a;

    invoke-static {v0}, Lcom/yandex/metrica/impl/q;->c(Lcom/yandex/metrica/impl/q$a;)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 289
    invoke-static {p1, p2}, Lcom/yandex/metrica/impl/q;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/b;->a(Lcom/yandex/metrica/impl/h;)V

    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 126
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 127
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 128
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v1, v0}, Lcom/yandex/metrica/impl/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 150
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->b:Lcom/yandex/metrica/impl/bf;

    iget-object v1, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/bf;->b(Lcom/yandex/metrica/impl/bc;)V

    return-void
.end method

.method b(Ljava/lang/String;)V
    .locals 2

    .line 188
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/bc;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 189
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->b:Lcom/yandex/metrica/impl/bf;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/bf;->e()V

    .line 192
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->k:Lcom/yandex/metrica/impl/y;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/y;->a()V

    .line 194
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->b:Lcom/yandex/metrica/impl/bf;

    invoke-static {p1}, Lcom/yandex/metrica/impl/q;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    iget-object v1, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0, p1, v1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    .line 196
    iget-object p1, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bc;->d()V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 120
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0, p1, p2}, Lcom/yandex/metrica/impl/bc;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public b(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 134
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 135
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 136
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v1, v0}, Lcom/yandex/metrica/impl/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .line 255
    sget-object v0, Lcom/yandex/metrica/impl/b;->f:Lcom/yandex/metrica/impl/ob/nk;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nk;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;

    .line 1316
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->b:Lcom/yandex/metrica/impl/bf;

    .line 1317
    invoke-static {p1}, Lcom/yandex/metrica/impl/u;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    .line 1316
    invoke-virtual {v0, p1, v1}, Lcom/yandex/metrica/impl/bf;->a(Ljava/lang/String;Lcom/yandex/metrica/impl/bc;)V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 143
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 144
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->b:Lcom/yandex/metrica/impl/bf;

    iget-object v1, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0, p1, p2, v1}, Lcom/yandex/metrica/impl/bf;->a(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/metrica/impl/bc;)V

    :cond_0
    return-void
.end method

.method c()Z
    .locals 4

    .line 293
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/b;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    const-string v1, ""

    .line 296
    invoke-static {v1}, Lcom/yandex/metrica/impl/q;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object v1

    .line 297
    iget-object v2, p0, Lcom/yandex/metrica/impl/b;->b:Lcom/yandex/metrica/impl/bf;

    iget-object v3, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v2, v1, v3}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    :cond_0
    return v0
.end method

.method d()Lcom/yandex/metrica/impl/bc;
    .locals 1

    .line 304
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 351
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/bc;->a()Z

    move-result v0

    return v0
.end method

.method public pauseSession()V
    .locals 1

    const/4 v0, 0x0

    .line 184
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/b;->b(Ljava/lang/String;)V

    return-void
.end method

.method public reportError(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 241
    sget-object v0, Lcom/yandex/metrica/impl/b;->e:Lcom/yandex/metrica/impl/ob/nk;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nk;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;

    const/4 v0, 0x0

    .line 243
    invoke-static {v0, p2}, Lcom/yandex/metrica/impl/br;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    .line 244
    invoke-static {p1, p2}, Lcom/yandex/metrica/impl/q;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/b;->a(Lcom/yandex/metrica/impl/h;)V

    return-void
.end method

.method public reportEvent(Ljava/lang/String;)V
    .locals 1

    .line 202
    sget-object v0, Lcom/yandex/metrica/impl/b;->d:Lcom/yandex/metrica/impl/ob/nk;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nk;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;

    const/4 v0, 0x0

    .line 203
    invoke-virtual {p0, p1, v0}, Lcom/yandex/metrica/impl/b;->reportEvent(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public reportEvent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 208
    sget-object v0, Lcom/yandex/metrica/impl/b;->d:Lcom/yandex/metrica/impl/ob/nk;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nk;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;

    .line 209
    invoke-static {p1, p2}, Lcom/yandex/metrica/impl/q;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/b;->a(Lcom/yandex/metrica/impl/h;)V

    return-void
.end method

.method public reportEvent(Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 214
    sget-object v0, Lcom/yandex/metrica/impl/b;->d:Lcom/yandex/metrica/impl/ob/nk;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nk;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;

    .line 216
    invoke-static {p2}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    move-object p2, v0

    .line 219
    :goto_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->b:Lcom/yandex/metrica/impl/bf;

    invoke-static {p1}, Lcom/yandex/metrica/impl/q;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/b;->d()Lcom/yandex/metrica/impl/bc;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p2}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;Ljava/util/Map;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public reportRevenue(Lcom/yandex/metrica/Revenue;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/Revenue;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 346
    sget-object v0, Lcom/yandex/metrica/impl/b;->j:Lcom/yandex/metrica/impl/ob/nk;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nk;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;

    .line 347
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->b:Lcom/yandex/metrica/impl/bf;

    new-instance v1, Lcom/yandex/metrica/impl/bh;

    invoke-direct {v1, p1}, Lcom/yandex/metrica/impl/bh;-><init>(Lcom/yandex/metrica/Revenue;)V

    iget-object p1, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0, v1, p1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/bh;Lcom/yandex/metrica/impl/bc;)V

    return-void
.end method

.method public reportUnhandledException(Ljava/lang/Throwable;)V
    .locals 2

    .line 249
    sget-object v0, Lcom/yandex/metrica/impl/b;->g:Lcom/yandex/metrica/impl/ob/nk;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nk;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;

    .line 1312
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->b:Lcom/yandex/metrica/impl/bf;

    iget-object v1, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0, p1, v1}, Lcom/yandex/metrica/impl/bf;->a(Ljava/lang/Throwable;Lcom/yandex/metrica/impl/bc;)V

    return-void
.end method

.method public reportUserProfile(Lcom/yandex/metrica/profile/UserProfile;)V
    .locals 3
    .param p1    # Lcom/yandex/metrica/profile/UserProfile;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 325
    sget-object v0, Lcom/yandex/metrica/impl/b;->h:Lcom/yandex/metrica/impl/ob/nk;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nk;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;

    .line 326
    new-instance v0, Lcom/yandex/metrica/impl/ob/ja;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/ja;-><init>()V

    .line 327
    invoke-virtual {p1}, Lcom/yandex/metrica/profile/UserProfile;->getUserProfileUpdates()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/profile/UserProfileUpdate;

    .line 328
    invoke-virtual {v1}, Lcom/yandex/metrica/profile/UserProfileUpdate;->getUserProfileUpdatePatcher()Lcom/yandex/metrica/impl/ob/jb;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/yandex/metrica/impl/ob/jb;->a(Lcom/yandex/metrica/impl/ob/ja;)V

    goto :goto_0

    .line 330
    :cond_0
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ja;->c()Lcom/yandex/metrica/impl/ob/jg$a;

    move-result-object p1

    .line 331
    sget-object v0, Lcom/yandex/metrica/impl/b;->i:Lcom/yandex/metrica/impl/ob/nk;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nk;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;

    move-result-object v0

    .line 332
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ni;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 333
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->b:Lcom/yandex/metrica/impl/bf;

    iget-object v1, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0, p1, v1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/ob/jg$a;Lcom/yandex/metrica/impl/bc;)V

    return-void

    .line 335
    :cond_1
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "UserInfo wasn\'t sent because "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ni;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lv;->b(Ljava/lang/String;)V

    return-void
.end method

.method public resumeSession()V
    .locals 1

    const/4 v0, 0x0

    .line 155
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public setUserProfileID(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 341
    iget-object v0, p0, Lcom/yandex/metrica/impl/b;->b:Lcom/yandex/metrica/impl/bf;

    iget-object v1, p0, Lcom/yandex/metrica/impl/b;->a:Lcom/yandex/metrica/impl/bc;

    invoke-virtual {v0, p1, v1}, Lcom/yandex/metrica/impl/bf;->b(Ljava/lang/String;Lcom/yandex/metrica/impl/bc;)V

    return-void
.end method
