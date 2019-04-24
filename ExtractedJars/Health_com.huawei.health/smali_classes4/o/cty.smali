.class public Lo/cty;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Double;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/cty;->a:Ljava/util/Map;

    .line 19
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const-class v0, Ljava/util/Map;

    invoke-static {p1, v0}, Lo/cnj;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lo/cty;->a:Ljava/util/Map;

    .line 34
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .line 27
    iget-object v0, p0, Lo/cty;->a:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 28
    :cond_0
    iget-object v0, p0, Lo/cty;->a:Ljava/util/Map;

    const-class v1, Ljava/util/Map;

    invoke-static {v0, v1}, Lo/cnj;->d(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)D
    .locals 3

    .line 37
    iget-object v0, p0, Lo/cty;->a:Ljava/util/Map;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 38
    :cond_0
    iget-object v0, p0, Lo/cty;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Double;

    .line 39
    if-nez v2, :cond_1

    .line 40
    const-wide/16 v0, 0x0

    return-wide v0

    .line 42
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Double;>;"
        }
    .end annotation

    .line 46
    iget-object v0, p0, Lo/cty;->a:Ljava/util/Map;

    return-object v0
.end method

.method public b(Ljava/lang/String;D)V
    .locals 2

    .line 22
    iget-object v0, p0, Lo/cty;->a:Ljava/util/Map;

    if-nez v0, :cond_0

    return-void

    .line 23
    :cond_0
    iget-object v0, p0, Lo/cty;->a:Ljava/util/Map;

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    return-void
.end method
