.class Lcom/yandex/metrica/impl/ob/ha;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private b:Lcom/yandex/metrica/impl/ob/gs;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private c:Lcom/yandex/metrica/impl/ob/gp;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private d:Landroid/location/Location;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private e:J

.field private f:Lcom/yandex/metrica/impl/ob/ma;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private g:Lcom/yandex/metrica/impl/ob/hk;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private h:Lcom/yandex/metrica/impl/ob/go;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ob/gp;Landroid/location/Location;JLcom/yandex/metrica/impl/ob/ma;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/go;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/gp;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Lcom/yandex/metrica/impl/ob/ma;
        .annotation build Landroid/support/annotation/NonNull;
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

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ha;->a:Ljava/lang/String;

    .line 60
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/ha;->b:Lcom/yandex/metrica/impl/ob/gs;

    .line 61
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/ha;->c:Lcom/yandex/metrica/impl/ob/gp;

    .line 62
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/ha;->d:Landroid/location/Location;

    .line 63
    iput-wide p5, p0, Lcom/yandex/metrica/impl/ob/ha;->e:J

    .line 64
    iput-object p7, p0, Lcom/yandex/metrica/impl/ob/ha;->f:Lcom/yandex/metrica/impl/ob/ma;

    .line 65
    iput-object p8, p0, Lcom/yandex/metrica/impl/ob/ha;->g:Lcom/yandex/metrica/impl/ob/hk;

    .line 66
    iput-object p9, p0, Lcom/yandex/metrica/impl/ob/ha;->h:Lcom/yandex/metrica/impl/ob/go;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ob/gp;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/go;)V
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/gp;
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

    .line 43
    new-instance v7, Lcom/yandex/metrica/impl/ob/lz;

    invoke-direct {v7}, Lcom/yandex/metrica/impl/ob/lz;-><init>()V

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v8, p4

    move-object v9, p5

    invoke-direct/range {v0 .. v9}, Lcom/yandex/metrica/impl/ob/ha;-><init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ob/gp;Landroid/location/Location;JLcom/yandex/metrica/impl/ob/ma;Lcom/yandex/metrica/impl/ob/hk;Lcom/yandex/metrica/impl/ob/go;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/location/Location;)V
    .locals 10
    .param p1    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_5

    .line 1100
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ha;->b:Lcom/yandex/metrica/impl/ob/gs;

    if-eqz v2, :cond_5

    .line 1104
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ha;->d:Landroid/location/Location;

    if-eqz v2, :cond_6

    .line 1126
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ha;->f:Lcom/yandex/metrica/impl/ob/ma;

    invoke-interface {v2}, Lcom/yandex/metrica/impl/ob/ma;->a()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/yandex/metrica/impl/ob/ha;->e:J

    sub-long v6, v2, v4

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ha;->b:Lcom/yandex/metrica/impl/ob/gs;

    iget-wide v2, v2, Lcom/yandex/metrica/impl/ob/gs;->c:J

    cmp-long v4, v6, v2

    if-lez v4, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    .line 1173
    :goto_0
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ha;->d:Landroid/location/Location;

    invoke-virtual {p1, v3}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v3

    .line 1142
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/ha;->b:Lcom/yandex/metrica/impl/ob/gs;

    iget v4, v4, Lcom/yandex/metrica/impl/ob/gs;->d:F

    cmpl-float v3, v3, v4

    if-lez v3, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    move v3, v1

    .line 2154
    :goto_1
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/ha;->d:Landroid/location/Location;

    if-eqz v4, :cond_3

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v4

    iget-object v6, p0, Lcom/yandex/metrica/impl/ob/ha;->d:Landroid/location/Location;

    invoke-virtual {v6}, Landroid/location/Location;->getTime()J

    move-result-wide v6

    sub-long v8, v4, v6

    const-wide/16 v4, 0x0

    cmp-long v6, v8, v4

    if-ltz v6, :cond_2

    goto :goto_2

    :cond_2
    move v4, v1

    goto :goto_3

    :cond_3
    :goto_2
    move v4, v0

    :goto_3
    if-nez v2, :cond_4

    if-eqz v3, :cond_5

    :cond_4
    if-eqz v4, :cond_5

    goto :goto_4

    :cond_5
    move v0, v1

    :cond_6
    :goto_4
    if-eqz v0, :cond_7

    .line 3090
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ha;->d:Landroid/location/Location;

    .line 3091
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/ha;->e:J

    .line 3095
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ha;->c:Lcom/yandex/metrica/impl/ob/gp;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ha;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ha;->b:Lcom/yandex/metrica/impl/ob/gs;

    invoke-interface {v0, v1, p1, v2}, Lcom/yandex/metrica/impl/ob/gp;->a(Ljava/lang/String;Landroid/location/Location;Lcom/yandex/metrica/impl/ob/gs;)V

    .line 4086
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ha;->g:Lcom/yandex/metrica/impl/ob/hk;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/hk;->a()V

    .line 5082
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ha;->h:Lcom/yandex/metrica/impl/ob/go;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/go;->a()V

    :cond_7
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

    .line 183
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/ha;->b:Lcom/yandex/metrica/impl/ob/gs;

    .line 184
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ha;->g:Lcom/yandex/metrica/impl/ob/hk;

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ha;->b:Lcom/yandex/metrica/impl/ob/gs;

    invoke-virtual {p2, p1, v0}, Lcom/yandex/metrica/impl/ob/hk;->a(Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;)V

    .line 185
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ha;->h:Lcom/yandex/metrica/impl/ob/go;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ha;->b:Lcom/yandex/metrica/impl/ob/gs;

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/go;->a(Lcom/yandex/metrica/impl/ob/gs;)V

    return-void
.end method
