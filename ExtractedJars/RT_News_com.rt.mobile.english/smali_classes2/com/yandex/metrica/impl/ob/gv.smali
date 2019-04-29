.class public Lcom/yandex/metrica/impl/ob/gv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/bt;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/lh;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final c:Lcom/yandex/metrica/impl/ob/hk;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final d:Lcom/yandex/metrica/impl/ob/gw;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final e:Lcom/yandex/metrica/impl/ob/go;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final f:Lcom/yandex/metrica/impl/ob/lz;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/bt;Lcom/yandex/metrica/impl/ob/lh;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/go;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/bt;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/lh;
        .annotation build Landroid/support/annotation/NonNull;
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

    .line 41
    new-instance v4, Lcom/yandex/metrica/impl/ob/gw;

    invoke-direct {v4, p1}, Lcom/yandex/metrica/impl/ob/gw;-><init>(Landroid/content/Context;)V

    new-instance v5, Lcom/yandex/metrica/impl/ob/lz;

    invoke-direct {v5}, Lcom/yandex/metrica/impl/ob/lz;-><init>()V

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/yandex/metrica/impl/ob/gv;-><init>(Lcom/yandex/metrica/impl/bt;Lcom/yandex/metrica/impl/ob/lh;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/gw;Lcom/yandex/metrica/impl/ob/lz;Lcom/yandex/metrica/impl/ob/go;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/bt;Lcom/yandex/metrica/impl/ob/lh;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/gw;Lcom/yandex/metrica/impl/ob/lz;Lcom/yandex/metrica/impl/ob/go;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/bt;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/lh;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/hk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/gw;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/yandex/metrica/impl/ob/lz;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/yandex/metrica/impl/ob/go;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gv;->a:Lcom/yandex/metrica/impl/bt;

    .line 66
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/gv;->b:Lcom/yandex/metrica/impl/ob/lh;

    .line 67
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/gv;->c:Lcom/yandex/metrica/impl/ob/hk;

    .line 68
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/gv;->d:Lcom/yandex/metrica/impl/ob/gw;

    .line 69
    iput-object p5, p0, Lcom/yandex/metrica/impl/ob/gv;->f:Lcom/yandex/metrica/impl/ob/lz;

    .line 70
    iput-object p6, p0, Lcom/yandex/metrica/impl/ob/gv;->e:Lcom/yandex/metrica/impl/ob/go;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 45
    new-instance v0, Lcom/yandex/metrica/impl/ob/gx;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/gx;-><init>()V

    .line 46
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gv;->f:Lcom/yandex/metrica/impl/ob/lz;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lz;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/gx;->a(J)V

    .line 47
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gv;->a:Lcom/yandex/metrica/impl/bt;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/bt;->a()Lorg/json/JSONArray;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/gx;->a(Lorg/json/JSONArray;)V

    .line 48
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gv;->b:Lcom/yandex/metrica/impl/ob/lh;

    new-instance v2, Lcom/yandex/metrica/impl/ob/gv$1;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/gv$1;-><init>(Lcom/yandex/metrica/impl/ob/gx;)V

    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/lh;->a(Lcom/yandex/metrica/impl/ob/kz;)V

    .line 53
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gv;->d:Lcom/yandex/metrica/impl/ob/gw;

    invoke-virtual {v1, v0}, Lcom/yandex/metrica/impl/ob/gw;->a(Lcom/yandex/metrica/impl/ob/gx;)V

    .line 54
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gv;->c:Lcom/yandex/metrica/impl/ob/hk;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hk;->a()V

    .line 55
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gv;->e:Lcom/yandex/metrica/impl/ob/go;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/go;->a()V

    return-void
.end method
