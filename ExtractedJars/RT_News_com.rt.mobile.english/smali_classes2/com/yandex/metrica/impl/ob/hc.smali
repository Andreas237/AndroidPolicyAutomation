.class public Lcom/yandex/metrica/impl/ob/hc;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/hc$a;
    }
.end annotation


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/hd;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private b:Lcom/yandex/metrica/impl/ob/hh;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private c:Lcom/yandex/metrica/impl/ob/gu;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private d:Landroid/location/LocationListener;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/os/Looper;Landroid/location/LocationManager;Lcom/yandex/metrica/impl/ob/hc$a;Lcom/yandex/metrica/impl/ob/hh;Lcom/yandex/metrica/impl/ob/gu;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Looper;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/location/LocationManager;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/hc$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/yandex/metrica/impl/ob/hh;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/yandex/metrica/impl/ob/gu;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    new-instance v0, Lcom/yandex/metrica/impl/ob/hc$1;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/ob/hc$1;-><init>(Lcom/yandex/metrica/impl/ob/hc;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/hc;->d:Landroid/location/LocationListener;

    .line 114
    iput-object p6, p0, Lcom/yandex/metrica/impl/ob/hc;->c:Lcom/yandex/metrica/impl/ob/gu;

    .line 115
    iget-object p6, p0, Lcom/yandex/metrica/impl/ob/hc;->d:Landroid/location/LocationListener;

    invoke-virtual {p4, p1, p2, p3, p6}, Lcom/yandex/metrica/impl/ob/hc$a;->a(Landroid/content/Context;Landroid/os/Looper;Landroid/location/LocationManager;Landroid/location/LocationListener;)Lcom/yandex/metrica/impl/ob/hd;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/hc;->a:Lcom/yandex/metrica/impl/ob/hd;

    .line 117
    iput-object p5, p0, Lcom/yandex/metrica/impl/ob/hc;->b:Lcom/yandex/metrica/impl/ob/hh;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/yandex/metrica/impl/ob/ks;Landroid/location/LocationManager;Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/go;)V
    .locals 12
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
    .param p5    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Lcom/yandex/metrica/impl/ob/hk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/yandex/metrica/impl/ob/go;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 52
    new-instance v4, Lcom/yandex/metrica/impl/ob/hc$a;

    invoke-direct {v4}, Lcom/yandex/metrica/impl/ob/hc$a;-><init>()V

    new-instance v11, Lcom/yandex/metrica/impl/ob/hh;

    move-object v5, v11

    move-object v6, p1

    move-object v7, p3

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    invoke-direct/range {v5 .. v10}, Lcom/yandex/metrica/impl/ob/hh;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/go;)V

    new-instance v6, Lcom/yandex/metrica/impl/ob/gu;

    move-object v1, p1

    move-object/from16 v3, p4

    invoke-direct {v6, v1, v3}, Lcom/yandex/metrica/impl/ob/gu;-><init>(Landroid/content/Context;Landroid/location/LocationManager;)V

    move-object v0, p0

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lcom/yandex/metrica/impl/ob/hc;-><init>(Landroid/content/Context;Landroid/os/Looper;Landroid/location/LocationManager;Lcom/yandex/metrica/impl/ob/hc$a;Lcom/yandex/metrica/impl/ob/hh;Lcom/yandex/metrica/impl/ob/gu;)V

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/hc;)Lcom/yandex/metrica/impl/ob/hh;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/hc;->b:Lcom/yandex/metrica/impl/ob/hh;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 58
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hc;->c:Lcom/yandex/metrica/impl/ob/gu;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/gu;->a()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hc;->b:Lcom/yandex/metrica/impl/ob/hh;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hc;->c:Lcom/yandex/metrica/impl/ob/gu;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/gu;->a()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/hh;->a(Landroid/location/Location;)V

    :cond_0
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

    .line 84
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hc;->b:Lcom/yandex/metrica/impl/ob/hh;

    invoke-virtual {v0, p1, p2}, Lcom/yandex/metrica/impl/ob/hh;->a(Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;)V

    return-void
.end method

.method public b()Landroid/location/Location;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 67
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hc;->b:Lcom/yandex/metrica/impl/ob/hh;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hh;->a()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroid/location/Location;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 72
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hc;->c:Lcom/yandex/metrica/impl/ob/gu;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/gu;->a()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public d()V
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hc;->a:Lcom/yandex/metrica/impl/ob/hd;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hd;->a()V

    return-void
.end method

.method public e()V
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hc;->a:Lcom/yandex/metrica/impl/ob/hd;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hd;->b()V

    return-void
.end method
