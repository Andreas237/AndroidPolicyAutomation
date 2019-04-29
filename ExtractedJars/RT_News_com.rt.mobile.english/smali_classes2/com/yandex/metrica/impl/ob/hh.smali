.class Lcom/yandex/metrica/impl/ob/hh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/hh$a;,
        Lcom/yandex/metrica/impl/ob/hh$c;,
        Lcom/yandex/metrica/impl/ob/hh$b;
    }
.end annotation


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/hh$c;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private b:Lcom/yandex/metrica/impl/ob/hh$a;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private c:Lcom/yandex/metrica/impl/ob/hh$b;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private d:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private e:Lcom/yandex/metrica/impl/ob/gs;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private f:Lcom/yandex/metrica/impl/ob/ks;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private g:Lcom/yandex/metrica/impl/ob/hj;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private h:Lcom/yandex/metrica/impl/ob/hk;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private i:Lcom/yandex/metrica/impl/ob/go;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private j:Lcom/yandex/metrica/impl/ob/gt;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private k:Ljava/util/Map;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/impl/ob/ha;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ob/hh$c;Lcom/yandex/metrica/impl/ob/hh$a;Lcom/yandex/metrica/impl/ob/hh$b;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/go;)V
    .locals 1
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
    .param p4    # Lcom/yandex/metrica/impl/ob/hh$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/yandex/metrica/impl/ob/hh$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/yandex/metrica/impl/ob/hh$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/yandex/metrica/impl/ob/hk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p8    # Lcom/yandex/metrica/impl/ob/go;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/hh;->k:Ljava/util/Map;

    .line 146
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/hh;->d:Landroid/content/Context;

    .line 147
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/hh;->f:Lcom/yandex/metrica/impl/ob/ks;

    .line 148
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/hh;->e:Lcom/yandex/metrica/impl/ob/gs;

    .line 149
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/hh;->a:Lcom/yandex/metrica/impl/ob/hh$c;

    .line 150
    iput-object p5, p0, Lcom/yandex/metrica/impl/ob/hh;->b:Lcom/yandex/metrica/impl/ob/hh$a;

    .line 151
    iput-object p6, p0, Lcom/yandex/metrica/impl/ob/hh;->c:Lcom/yandex/metrica/impl/ob/hh$b;

    .line 152
    iput-object p7, p0, Lcom/yandex/metrica/impl/ob/hh;->h:Lcom/yandex/metrica/impl/ob/hk;

    .line 153
    iput-object p8, p0, Lcom/yandex/metrica/impl/ob/hh;->i:Lcom/yandex/metrica/impl/ob/go;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/go;)V
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
    .param p4    # Lcom/yandex/metrica/impl/ob/hk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/yandex/metrica/impl/ob/go;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 84
    new-instance v4, Lcom/yandex/metrica/impl/ob/hh$c;

    invoke-direct {v4}, Lcom/yandex/metrica/impl/ob/hh$c;-><init>()V

    new-instance v5, Lcom/yandex/metrica/impl/ob/hh$a;

    invoke-direct {v5}, Lcom/yandex/metrica/impl/ob/hh$a;-><init>()V

    new-instance v6, Lcom/yandex/metrica/impl/ob/hh$b;

    invoke-direct {v6}, Lcom/yandex/metrica/impl/ob/hh$b;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v7, p4

    move-object v8, p5

    invoke-direct/range {v0 .. v8}, Lcom/yandex/metrica/impl/ob/hh;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ob/hh$c;Lcom/yandex/metrica/impl/ob/hh$a;Lcom/yandex/metrica/impl/ob/hh$b;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/go;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/location/Location;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 104
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hh;->j:Lcom/yandex/metrica/impl/ob/gt;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hh;->j:Lcom/yandex/metrica/impl/ob/gt;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/gt;->a()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/location/Location;)V
    .locals 7
    .param p1    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 89
    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v6

    .line 90
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hh;->k:Ljava/util/Map;

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/ha;

    if-nez v0, :cond_2

    .line 1113
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hh;->g:Lcom/yandex/metrica/impl/ob/hj;

    if-nez v0, :cond_0

    .line 1114
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hh;->a:Lcom/yandex/metrica/impl/ob/hh$c;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hh;->d:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/hh$c;->a(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/gp;)Lcom/yandex/metrica/impl/ob/hj;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/hh;->g:Lcom/yandex/metrica/impl/ob/hj;

    .line 1116
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hh;->j:Lcom/yandex/metrica/impl/ob/gt;

    if-nez v0, :cond_1

    .line 1117
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hh;->b:Lcom/yandex/metrica/impl/ob/hh$a;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hh;->g:Lcom/yandex/metrica/impl/ob/hj;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/hh$a;->a(Lcom/yandex/metrica/impl/ob/gp;)Lcom/yandex/metrica/impl/ob/gt;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/hh;->j:Lcom/yandex/metrica/impl/ob/gt;

    .line 1119
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hh;->c:Lcom/yandex/metrica/impl/ob/hh$b;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/hh;->e:Lcom/yandex/metrica/impl/ob/gs;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/hh;->g:Lcom/yandex/metrica/impl/ob/hj;

    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/hh;->h:Lcom/yandex/metrica/impl/ob/hk;

    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/hh;->i:Lcom/yandex/metrica/impl/ob/go;

    move-object v1, v6

    invoke-virtual/range {v0 .. v5}, Lcom/yandex/metrica/impl/ob/hh$b;->a(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ob/hj;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/go;)Lcom/yandex/metrica/impl/ob/ha;

    move-result-object v0

    .line 93
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hh;->k:Ljava/util/Map;

    invoke-interface {v1, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 97
    :cond_2
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hh;->f:Lcom/yandex/metrica/impl/ob/ks;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/hh;->e:Lcom/yandex/metrica/impl/ob/gs;

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/ha;->a(Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;)V

    .line 99
    :goto_0
    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ha;->a(Landroid/location/Location;)V

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

    .line 126
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/hh;->f:Lcom/yandex/metrica/impl/ob/ks;

    .line 127
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/hh;->e:Lcom/yandex/metrica/impl/ob/gs;

    return-void
.end method
