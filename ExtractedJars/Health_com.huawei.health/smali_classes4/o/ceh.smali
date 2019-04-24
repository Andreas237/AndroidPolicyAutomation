.class public Lo/ceh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cej;
.implements Lo/cel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ceh$c;
    }
.end annotation


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Landroid/util/ArrayMap;

    invoke-direct {v0}, Landroid/util/ArrayMap;-><init>()V

    iput-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    .line 22
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->ag:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->m:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->q:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->s:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->u:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->r:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->t:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->z:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->v:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->x:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->w:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0xb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->y:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->B:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0xd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->j:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->D:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0xf

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->C:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0x10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->A:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0x11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->F:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0x12

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->I:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0x13

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->E:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0x14

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->H:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->G:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0x28

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->J:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0x32

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->M:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0x3c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->L:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0x46

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->K:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0x50

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->N:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0x5a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->R:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lo/ceh$c;->O:Lo/ceh$c;

    invoke-virtual {v2}, Lo/ceh$c;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    return-void
.end method

.method private a(Ljava/lang/Object;)Ljava/util/List;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 261
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/cem;

    if-nez v0, :cond_0

    .line 263
    const-string v0, "Track_EnglishVoiceConstructor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructSportStateVoiceContent parameter is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 265
    sget-object v0, Lo/ceh$c;->ae:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 266
    return-object v4

    .line 269
    :cond_0
    move-object/from16 v4, p1

    check-cast v4, Lo/cem;

    .line 270
    invoke-virtual {v4}, Lo/cem;->h()F

    move-result v5

    .line 271
    invoke-virtual {v4}, Lo/cem;->k()J

    move-result-wide v6

    .line 272
    invoke-virtual {v4}, Lo/cem;->f()I

    move-result v8

    .line 273
    invoke-virtual {v4}, Lo/cem;->i()J

    move-result-wide v9

    .line 275
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 276
    sget-object v0, Lo/ceh$c;->d:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 277
    sget-object v0, Lo/ceh$c;->P:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 280
    float-to-double v0, v5

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v12, v0

    .line 281
    int-to-float v0, v12

    sub-float v0, v5, v0

    float-to-double v13, v0

    .line 284
    new-instance v0, Ljava/math/BigDecimal;

    move-wide v1, v13

    invoke-direct {v0, v1, v2}, Ljava/math/BigDecimal;-><init>(D)V

    move-object v15, v0

    .line 285
    const/4 v0, 0x2

    const/4 v1, 0x4

    invoke-virtual {v15, v0, v1}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v13

    .line 287
    invoke-static {v13, v14}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v16

    .line 288
    move-object/from16 v0, v16

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v17

    .line 289
    const/16 v18, 0x0

    .line 290
    if-ltz v17, :cond_1

    .line 292
    add-int/lit8 v0, v17, 0x1

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v16

    .line 293
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v18

    .line 296
    :cond_1
    if-ltz v17, :cond_2

    if-gtz v18, :cond_4

    .line 298
    :cond_2
    if-nez v12, :cond_3

    .line 299
    sget-object v0, Lo/ceh$c;->ag:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 301
    :cond_3
    move-object/from16 v0, p0

    invoke-direct {v0, v11, v12}, Lo/ceh;->a(Ljava/util/List;I)V

    goto :goto_2

    .line 306
    :cond_4
    const/4 v0, 0x0

    cmpl-float v0, v5, v0

    if-lez v0, :cond_5

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, v5, v0

    if-gez v0, :cond_5

    .line 307
    sget-object v0, Lo/ceh$c;->ag:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 309
    :cond_5
    move-object/from16 v0, p0

    invoke-direct {v0, v11, v12}, Lo/ceh;->a(Ljava/util/List;I)V

    .line 312
    :goto_0
    sget-object v0, Lo/ceh$c;->W:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 315
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_6

    .line 317
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v19

    .line 319
    const/16 v20, 0x0

    :goto_1
    move/from16 v0, v20

    move/from16 v1, v19

    if-ge v0, v1, :cond_6

    .line 321
    move-object/from16 v0, v16

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v11, v0}, Lo/ceh;->b(Ljava/util/List;I)V

    .line 319
    add-int/lit8 v20, v20, 0x1

    goto :goto_1

    .line 328
    :cond_6
    :goto_2
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v5, v0

    if-lez v0, :cond_7

    .line 331
    sget-object v0, Lo/ceh$c;->l:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 333
    :cond_7
    const/4 v0, 0x0

    cmpl-float v0, v5, v0

    if-ltz v0, :cond_8

    .line 336
    sget-object v0, Lo/ceh$c;->h:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 340
    :cond_8
    :goto_3
    sget-object v0, Lo/ceh$c;->Q:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 341
    move-object/from16 v0, p0

    invoke-direct {v0, v11, v6, v7}, Lo/ceh;->e(Ljava/util/List;J)V

    .line 344
    move-object/from16 v0, p0

    invoke-direct {v0, v9, v10, v11}, Lo/ceh;->c(JLjava/util/List;)V

    .line 347
    if-lez v8, :cond_9

    .line 348
    sget-object v0, Lo/ceh$c;->ad:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 349
    move-object/from16 v0, p0

    invoke-direct {v0, v11, v8}, Lo/ceh;->a(Ljava/util/List;I)V

    .line 350
    sget-object v0, Lo/ceh$c;->af:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 354
    :cond_9
    const-string v0, "Track_EnglishVoiceConstructor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    return-object v11
.end method

.method private a(Ljava/util/List;F)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;F)V"
        }
    .end annotation

    .line 386
    const/high16 v0, 0x45610000    # 3600.0f

    div-float v0, p2, v0

    const/high16 v1, 0x42c80000    # 100.0f

    rem-float/2addr v0, v1

    float-to-int v2, v0

    .line 387
    div-int/lit8 v0, v2, 0x64

    rem-int/lit8 v3, v0, 0xa

    .line 388
    div-int/lit8 v4, v2, 0xa

    .line 389
    rem-int/lit8 v5, v2, 0xa

    .line 391
    if-lez v3, :cond_0

    .line 393
    invoke-direct {p0, p1, v3}, Lo/ceh;->b(Ljava/util/List;I)V

    .line 394
    sget-object v0, Lo/ceh$c;->O:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 397
    :cond_0
    const/4 v0, 0x1

    if-le v4, v0, :cond_1

    .line 399
    mul-int/lit8 v0, v4, 0xa

    invoke-direct {p0, p1, v0}, Lo/ceh;->b(Ljava/util/List;I)V

    goto :goto_0

    .line 401
    :cond_1
    if-lez v4, :cond_2

    .line 403
    mul-int/lit8 v0, v4, 0xa

    add-int/2addr v0, v5

    invoke-direct {p0, p1, v0}, Lo/ceh;->b(Ljava/util/List;I)V

    .line 406
    :cond_2
    :goto_0
    const/4 v0, 0x1

    if-eq v4, v0, :cond_3

    if-lez v5, :cond_3

    .line 408
    invoke-direct {p0, p1, v5}, Lo/ceh;->b(Ljava/util/List;I)V

    .line 411
    :cond_3
    const/4 v0, 0x1

    if-le v2, v0, :cond_4

    .line 413
    sget-object v0, Lo/ceh$c;->V:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 415
    :cond_4
    if-lez v2, :cond_5

    .line 417
    sget-object v0, Lo/ceh$c;->T:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 419
    :cond_5
    :goto_1
    return-void
.end method

.method private a(Ljava/util/List;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;I)V"
        }
    .end annotation

    .line 493
    move v2, p2

    .line 495
    const/4 v0, 0x3

    new-array v3, v0, [I

    .line 496
    const/4 v4, 0x0

    .line 499
    :goto_0
    const/16 v0, 0xa

    if-lt v2, v0, :cond_0

    .line 501
    rem-int/lit8 v0, v2, 0xa

    aput v0, v3, v4

    .line 502
    div-int/lit8 v2, v2, 0xa

    .line 503
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 507
    :cond_0
    aput v2, v3, v4

    .line 509
    :goto_1
    if-ltz v4, :cond_6

    .line 511
    const/4 v0, 0x2

    if-ne v4, v0, :cond_2

    aget v0, v3, v4

    if-lez v0, :cond_2

    .line 514
    aget v0, v3, v4

    invoke-direct {p0, p1, v0}, Lo/ceh;->b(Ljava/util/List;I)V

    .line 515
    const/16 v0, 0x64

    invoke-direct {p0, p1, v0}, Lo/ceh;->b(Ljava/util/List;I)V

    .line 517
    const/4 v0, 0x1

    aget v0, v3, v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    aget v0, v3, v0

    if-nez v0, :cond_1

    .line 518
    goto :goto_3

    .line 520
    :cond_1
    sget-object v0, Lo/ceh$c;->ah:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 523
    :cond_2
    const/4 v0, 0x1

    if-ne v4, v0, :cond_3

    const/4 v0, 0x1

    aget v0, v3, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 526
    const/4 v0, 0x1

    aget v0, v3, v0

    mul-int/lit8 v0, v0, 0xa

    const/4 v1, 0x0

    aget v1, v3, v1

    add-int/2addr v0, v1

    invoke-direct {p0, p1, v0}, Lo/ceh;->b(Ljava/util/List;I)V

    goto :goto_2

    .line 528
    :cond_3
    const/4 v0, 0x1

    if-ne v4, v0, :cond_4

    aget v0, v3, v4

    const/4 v1, 0x1

    if-le v0, v1, :cond_4

    .line 531
    aget v0, v3, v4

    mul-int/lit8 v0, v0, 0xa

    invoke-direct {p0, p1, v0}, Lo/ceh;->b(Ljava/util/List;I)V

    goto :goto_2

    .line 533
    :cond_4
    const/4 v0, 0x1

    aget v0, v3, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    aget v0, v3, v4

    if-lez v0, :cond_5

    .line 536
    aget v0, v3, v4

    invoke-direct {p0, p1, v0}, Lo/ceh;->b(Ljava/util/List;I)V

    .line 539
    :cond_5
    :goto_2
    add-int/lit8 v4, v4, -0x1

    goto/16 :goto_1

    .line 541
    :cond_6
    :goto_3
    return-void
.end method

.method private b(Ljava/util/List;F)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;F)V"
        }
    .end annotation

    .line 455
    const/high16 v0, 0x42700000    # 60.0f

    rem-float v0, p2, v0

    float-to-int v4, v0

    .line 456
    div-int/lit8 v5, v4, 0xa

    .line 457
    rem-int/lit8 v6, v4, 0xa

    .line 459
    const-string v0, "Track_EnglishVoiceConstructor"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "convertTimeToSpeakListEng "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " secDecadeValue:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 460
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " secUnitValue:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 459
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    const/4 v0, 0x1

    if-le v5, v0, :cond_0

    .line 464
    mul-int/lit8 v0, v5, 0xa

    invoke-direct {p0, p1, v0}, Lo/ceh;->b(Ljava/util/List;I)V

    goto :goto_0

    .line 466
    :cond_0
    if-lez v5, :cond_1

    .line 468
    mul-int/lit8 v0, v5, 0xa

    add-int/2addr v0, v6

    invoke-direct {p0, p1, v0}, Lo/ceh;->b(Ljava/util/List;I)V

    .line 471
    :cond_1
    :goto_0
    const/4 v0, 0x1

    if-eq v5, v0, :cond_2

    if-lez v6, :cond_2

    .line 473
    invoke-direct {p0, p1, v6}, Lo/ceh;->b(Ljava/util/List;I)V

    .line 476
    :cond_2
    const/4 v0, 0x1

    if-le v4, v0, :cond_3

    .line 478
    sget-object v0, Lo/ceh$c;->i:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 480
    :cond_3
    if-lez v4, :cond_4

    .line 482
    sget-object v0, Lo/ceh$c;->f:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 484
    :cond_4
    :goto_1
    return-void
.end method

.method private b(Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;I)V"
        }
    .end annotation

    .line 571
    iget-object v0, p0, Lo/ceh;->a:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 573
    return-void
.end method

.method private c(JLjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 360
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 362
    sget-object v0, Lo/ceh$c;->p:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 363
    invoke-direct {p0, p3, p1, p2}, Lo/ceh;->e(Ljava/util/List;J)V

    .line 365
    :cond_0
    return-void
.end method

.method private e(Ljava/lang/Object;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 209
    instance-of v0, p1, Lo/cem;

    if-nez v0, :cond_0

    .line 211
    const-string v0, "Track_EnglishVoiceConstructor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructDistanceTimeContent parameter is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 213
    sget-object v0, Lo/ceh$c;->ae:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    return-object v4

    .line 217
    :cond_0
    move-object v4, p1

    check-cast v4, Lo/cem;

    .line 219
    invoke-virtual {v4}, Lo/cem;->h()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v5

    .line 220
    invoke-virtual {v4}, Lo/cem;->i()J

    move-result-wide v6

    .line 221
    invoke-virtual {v4}, Lo/cem;->k()J

    move-result-wide v8

    .line 224
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 225
    sget-object v0, Lo/ceh$c;->d:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 226
    sget-object v0, Lo/ceh$c;->P:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    if-lez v5, :cond_1

    .line 230
    const-string v0, "Track_EnglishVoiceConstructor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructDistanceTimeContent total distance:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    invoke-direct {p0, v10, v5}, Lo/ceh;->a(Ljava/util/List;I)V

    .line 234
    :cond_1
    const/4 v0, 0x1

    if-le v5, v0, :cond_2

    .line 237
    sget-object v0, Lo/ceh$c;->l:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 239
    :cond_2
    if-lez v5, :cond_3

    .line 242
    sget-object v0, Lo/ceh$c;->h:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    :cond_3
    :goto_0
    sget-object v0, Lo/ceh$c;->Q:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 246
    const-string v0, "Track_EnglishVoiceConstructor"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructDistanceTimeContent total time:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", count kilo:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    invoke-direct {p0, v10, v8, v9}, Lo/ceh;->e(Ljava/util/List;J)V

    .line 249
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-lez v0, :cond_4

    .line 251
    sget-object v0, Lo/ceh$c;->p:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 252
    const-string v0, "Track_EnglishVoiceConstructor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructDistanceTimeContent last kilo time:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    invoke-direct {p0, v10, v6, v7}, Lo/ceh;->e(Ljava/util/List;J)V

    .line 256
    :cond_4
    return-object v10
.end method

.method private e(Ljava/util/List;F)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;F)V"
        }
    .end annotation

    .line 423
    const/high16 v0, 0x42700000    # 60.0f

    div-float v0, p2, v0

    const/high16 v1, 0x42700000    # 60.0f

    rem-float/2addr v0, v1

    float-to-int v4, v0

    .line 424
    div-int/lit8 v5, v4, 0xa

    .line 425
    rem-int/lit8 v6, v4, 0xa

    .line 426
    const-string v0, "Track_EnglishVoiceConstructor"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "convertTimeToSpeakListEng "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " minDecadeValue:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 427
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " minUnitValue:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 426
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    const/4 v0, 0x1

    if-le v5, v0, :cond_0

    .line 431
    mul-int/lit8 v0, v5, 0xa

    invoke-direct {p0, p1, v0}, Lo/ceh;->b(Ljava/util/List;I)V

    goto :goto_0

    .line 433
    :cond_0
    if-lez v5, :cond_1

    .line 435
    mul-int/lit8 v0, v5, 0xa

    add-int/2addr v0, v6

    invoke-direct {p0, p1, v0}, Lo/ceh;->b(Ljava/util/List;I)V

    .line 438
    :cond_1
    :goto_0
    const/4 v0, 0x1

    if-eq v5, v0, :cond_2

    if-lez v6, :cond_2

    .line 440
    invoke-direct {p0, p1, v6}, Lo/ceh;->b(Ljava/util/List;I)V

    .line 443
    :cond_2
    const/4 v0, 0x1

    if-le v4, v0, :cond_3

    .line 445
    sget-object v0, Lo/ceh$c;->k:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 447
    :cond_3
    if-lez v4, :cond_4

    .line 449
    sget-object v0, Lo/ceh$c;->g:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 451
    :cond_4
    :goto_1
    return-void
.end method

.method private e(Ljava/util/List;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;J)V"
        }
    .end annotation

    .line 375
    const-wide/16 v0, 0x3e8

    div-long/2addr p2, v0

    .line 376
    const-string v0, "Track_EnglishVoiceConstructor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addTimeResource time:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    long-to-float v0, p2

    invoke-direct {p0, p1, v0}, Lo/ceh;->a(Ljava/util/List;F)V

    .line 378
    long-to-float v0, p2

    invoke-direct {p0, p1, v0}, Lo/ceh;->e(Ljava/util/List;F)V

    .line 379
    long-to-float v0, p2

    invoke-direct {p0, p1, v0}, Lo/ceh;->b(Ljava/util/List;F)V

    .line 380
    return-void
.end method


# virtual methods
.method public b()Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 192
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 193
    invoke-static {}, Lo/ceh$c;->values()[Lo/ceh$c;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_0

    aget-object v8, v5, v7

    .line 195
    invoke-virtual {v8}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8}, Lo/ceh$c;->e()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 197
    :cond_0
    const-string v0, "Track_EnglishVoiceConstructor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSoundResource() map size"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    return-object v4
.end method

.method public e(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 143
    const-string v0, "Track_EnglishVoiceConstructor"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructContent() type : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "   parameter : "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    const/4 v4, 0x0

    .line 145
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 150
    :pswitch_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 151
    sget-object v0, Lo/ceh$c;->e:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 152
    goto/16 :goto_1

    .line 154
    :pswitch_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 155
    sget-object v0, Lo/ceh$c;->ac:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    goto/16 :goto_1

    .line 158
    :pswitch_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 159
    sget-object v0, Lo/ceh$c;->Y:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    goto :goto_1

    .line 162
    :pswitch_3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 163
    sget-object v0, Lo/ceh$c;->c:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 164
    goto :goto_1

    .line 166
    :pswitch_4
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 167
    sget-object v0, Lo/ceh$c;->aa:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    sget-object v0, Lo/ceh$c;->ab:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    goto :goto_1

    .line 171
    :pswitch_5
    invoke-direct {p0, p2}, Lo/ceh;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 172
    goto :goto_1

    .line 176
    :pswitch_6
    invoke-direct {p0, p2}, Lo/ceh;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 177
    goto :goto_1

    .line 180
    :goto_0
    :pswitch_7
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 181
    sget-object v0, Lo/ceh$c;->ae:Lo/ceh$c;

    invoke-virtual {v0}, Lo/ceh$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 185
    :goto_1
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_7
        :pswitch_7
        :pswitch_5
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method
