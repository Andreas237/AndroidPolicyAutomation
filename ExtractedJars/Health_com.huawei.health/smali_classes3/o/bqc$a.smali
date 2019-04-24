.class public final Lo/bqc$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bqc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bqc$c;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 344
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bqc$a;-><init>(Ljava/lang/String;)V

    .line 345
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 348
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 339
    const-string v0, "multipart/mixed"

    iput-object v0, p0, Lo/bqc$a;->a:Ljava/lang/String;

    .line 340
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bqc$a;->d:Ljava/util/List;

    .line 349
    iput-object p1, p0, Lo/bqc$a;->e:Ljava/lang/String;

    .line 350
    return-void
.end method


# virtual methods
.method public d(Ljava/lang/String;)Lo/bqc$a;
    .locals 0

    .line 358
    iput-object p1, p0, Lo/bqc$a;->a:Ljava/lang/String;

    .line 359
    return-object p0
.end method

.method public e(Ljava/util/Map;)Lo/bqc$a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lo/bqc$a;"
        }
    .end annotation

    .line 383
    if-eqz p1, :cond_0

    .line 385
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    .line 387
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lo/bqc$c;->a(Ljava/lang/String;Ljava/lang/String;)Lo/bqc$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bqc$a;->e(Lo/bqc$c;)Lo/bqc$a;

    .line 388
    goto :goto_0

    .line 391
    :cond_0
    return-object p0
.end method

.method public e(Lo/bqc$c;)Lo/bqc$a;
    .locals 2

    .line 415
    if-nez p1, :cond_0

    .line 417
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "part == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 419
    :cond_0
    iget-object v0, p0, Lo/bqc$a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 420
    return-object p0
.end method

.method public e()Lo/bqc;
    .locals 4

    .line 428
    iget-object v0, p0, Lo/bqc$a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 430
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Multipart body must have at least one part."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 432
    :cond_0
    new-instance v0, Lo/bqc;

    iget-object v1, p0, Lo/bqc$a;->e:Ljava/lang/String;

    iget-object v2, p0, Lo/bqc$a;->a:Ljava/lang/String;

    iget-object v3, p0, Lo/bqc$a;->d:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3}, Lo/bqc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method
