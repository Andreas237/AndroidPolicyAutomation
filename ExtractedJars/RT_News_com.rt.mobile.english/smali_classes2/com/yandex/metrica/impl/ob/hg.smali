.class Lcom/yandex/metrica/impl/ob/hg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/hc;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/gv;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final c:Lcom/yandex/metrica/impl/ob/hk;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final d:Lcom/yandex/metrica/impl/ob/go;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/yandex/metrica/impl/ob/ks;Landroid/location/LocationManager;Lcom/yandex/metrica/impl/bt;Lcom/yandex/metrica/impl/ob/lh;Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/go;)V
    .locals 9
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Looper;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/location/LocationManager;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/yandex/metrica/impl/bt;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/yandex/metrica/impl/ob/lh;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Lcom/yandex/metrica/impl/ob/hk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Lcom/yandex/metrica/impl/ob/go;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 64
    new-instance v8, Lcom/yandex/metrica/impl/ob/hc;

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    invoke-direct/range {v0 .. v7}, Lcom/yandex/metrica/impl/ob/hc;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/yandex/metrica/impl/ob/ks;Landroid/location/LocationManager;Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/go;)V

    new-instance v6, Lcom/yandex/metrica/impl/ob/gv;

    move-object v0, v6

    move-object v2, p5

    move-object v3, p6

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    invoke-direct/range {v0 .. v5}, Lcom/yandex/metrica/impl/ob/gv;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/bt;Lcom/yandex/metrica/impl/ob/lh;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/go;)V

    move-object v0, p0

    move-object/from16 v1, p8

    move-object/from16 v2, p9

    invoke-direct {v0, v8, v6, v1, v2}, Lcom/yandex/metrica/impl/ob/hg;-><init>(Lcom/yandex/metrica/impl/ob/hc;Lcom/yandex/metrica/impl/ob/gv;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/go;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ks;Landroid/os/Looper;Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ob/ex;Lcom/yandex/metrica/impl/ob/ew;)V
    .locals 13
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/os/Looper;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/Nullable;
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

    const-string v0, "location"

    move-object v7, p1

    .line 46
    invoke-virtual {v7, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    .line 47
    invoke-static {v7}, Lcom/yandex/metrica/impl/bt;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/bt;

    move-result-object v8

    .line 48
    invoke-static {v7}, Lcom/yandex/metrica/impl/ob/lh;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/lh;

    move-result-object v9

    new-instance v10, Lcom/yandex/metrica/impl/ob/hk;

    move-object v1, v10

    move-object v2, v7

    move-object v3, p2

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v6}, Lcom/yandex/metrica/impl/ob/hk;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ob/ex;Lcom/yandex/metrica/impl/ob/ew;)V

    new-instance v11, Lcom/yandex/metrica/impl/ob/go;

    move-object/from16 v12, p4

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    invoke-direct {v11, v12, v1, v2}, Lcom/yandex/metrica/impl/ob/go;-><init>(Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ob/ex;Lcom/yandex/metrica/impl/ob/ew;)V

    move-object v1, p0

    move-object v2, v7

    move-object/from16 v3, p3

    move-object v4, p2

    move-object v5, v0

    move-object v6, v8

    move-object v7, v9

    move-object v8, v12

    move-object v9, v10

    move-object v10, v11

    .line 42
    invoke-direct/range {v1 .. v10}, Lcom/yandex/metrica/impl/ob/hg;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/yandex/metrica/impl/ob/ks;Landroid/location/LocationManager;Lcom/yandex/metrica/impl/bt;Lcom/yandex/metrica/impl/ob/lh;Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/go;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/hc;Lcom/yandex/metrica/impl/ob/gv;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/go;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/hc;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/gv;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/hk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/go;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/hg;->a:Lcom/yandex/metrica/impl/ob/hc;

    .line 120
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/hg;->b:Lcom/yandex/metrica/impl/ob/gv;

    .line 121
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/hg;->c:Lcom/yandex/metrica/impl/ob/hk;

    .line 122
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/hg;->d:Lcom/yandex/metrica/impl/ob/go;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hg;->a:Lcom/yandex/metrica/impl/ob/hc;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hc;->a()V

    .line 88
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hg;->b:Lcom/yandex/metrica/impl/ob/gv;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/gv;->a()V

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 144
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hg;->a:Lcom/yandex/metrica/impl/ob/hc;

    invoke-virtual {v0, p1, p2}, Lcom/yandex/metrica/impl/ob/hc;->a(Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;)V

    .line 145
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hg;->c:Lcom/yandex/metrica/impl/ob/hk;

    invoke-virtual {v0, p1, p2}, Lcom/yandex/metrica/impl/ob/hk;->a(Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;)V

    .line 146
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/hg;->d:Lcom/yandex/metrica/impl/ob/go;

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/go;->a(Lcom/yandex/metrica/impl/ob/gs;)V

    return-void
.end method

.method public b()Landroid/location/Location;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 93
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hg;->a:Lcom/yandex/metrica/impl/ob/hc;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hc;->b()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroid/location/Location;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 98
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hg;->a:Lcom/yandex/metrica/impl/ob/hc;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hc;->c()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public d()V
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hg;->c:Lcom/yandex/metrica/impl/ob/hk;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hk;->a()V

    return-void
.end method

.method public e()V
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hg;->a:Lcom/yandex/metrica/impl/ob/hc;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hc;->d()V

    return-void
.end method

.method public f()V
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hg;->a:Lcom/yandex/metrica/impl/ob/hc;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hc;->e()V

    return-void
.end method
