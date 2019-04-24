.class public Lo/fpo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fpo$d;,
        Lo/fpo$e;,
        Lo/fpo$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fpo$e<TV;>;>;"
        }
    .end annotation
.end field

.field private volatile b:J

.field private c:Lo/fpo$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/fpo$d<TK;TV;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<TK;Lo/fpo$d<TK;TV;>;>;"
        }
    .end annotation
.end field

.field private volatile e:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 97
    const/16 v0, 0x10

    const v1, 0x249f0

    const-wide/16 v2, 0x708

    invoke-direct {p0, v0, v1, v2, v3}, Lo/fpo;-><init>(IIJ)V

    .line 98
    return-void
.end method

.method public constructor <init>(IIJ)V
    .locals 2

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/fpo;->a:Ljava/util/List;

    .line 129
    if-le p1, p2, :cond_0

    .line 130
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "initial capacity must be <= max capacity"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 132
    :cond_0
    iput p2, p0, Lo/fpo;->e:I

    .line 133
    iput-wide p3, p0, Lo/fpo;->b:J

    .line 134
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lo/fpo;->d:Ljava/util/Map;

    .line 135
    invoke-direct {p0}, Lo/fpo;->a()V

    .line 137
    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 1

    .line 113
    const/16 v0, 0x10

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-direct {p0, v0, p1, p2, p3}, Lo/fpo;-><init>(IIJ)V

    .line 114
    return-void
.end method

.method private a()V
    .locals 3

    .line 140
    new-instance v0, Lo/fpo$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/fpo$d;-><init>(Lo/fpo$2;)V

    iput-object v0, p0, Lo/fpo;->c:Lo/fpo$d;

    .line 141
    iget-object v0, p0, Lo/fpo;->c:Lo/fpo$d;

    iget-object v1, p0, Lo/fpo;->c:Lo/fpo$d;

    iget-object v2, p0, Lo/fpo;->c:Lo/fpo$d;

    invoke-static {v1, v2}, Lo/fpo$d;->d(Lo/fpo$d;Lo/fpo$d;)Lo/fpo$d;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fpo$d;->b(Lo/fpo$d;Lo/fpo$d;)Lo/fpo$d;

    .line 142
    return-void
.end method

.method private e(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    .line 281
    iget-object v0, p0, Lo/fpo;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fpo$e;

    .line 282
    invoke-interface {v2, p1}, Lo/fpo$e;->c(Ljava/lang/Object;)V

    .line 283
    goto :goto_0

    .line 284
    :cond_0
    return-void
.end method

.method private e(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    .line 299
    new-instance v1, Lo/fpo$d;

    const/4 v0, 0x0

    invoke-direct {v1, p1, p2, v0}, Lo/fpo$d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lo/fpo$2;)V

    .line 300
    iget-object v0, p0, Lo/fpo;->d:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    iget-object v0, p0, Lo/fpo;->c:Lo/fpo$d;

    invoke-static {v1, v0}, Lo/fpo$d;->e(Lo/fpo$d;Lo/fpo$d;)V

    .line 302
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    .line 315
    if-nez p1, :cond_0

    .line 316
    const/4 v0, 0x0

    return-object v0

    .line 318
    :cond_0
    iget-object v0, p0, Lo/fpo;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fpo$d;

    .line 319
    if-nez v4, :cond_1

    .line 320
    const/4 v0, 0x0

    return-object v0

    .line 321
    :cond_1
    iget-wide v0, p0, Lo/fpo;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    iget-wide v0, p0, Lo/fpo;->b:J

    invoke-static {v4, v0, v1}, Lo/fpo$d;->b(Lo/fpo$d;J)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 322
    iget-object v0, p0, Lo/fpo;->d:Ljava/util/Map;

    invoke-static {v4}, Lo/fpo$d;->c(Lo/fpo$d;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    invoke-static {v4}, Lo/fpo$d;->a(Lo/fpo$d;)V

    .line 324
    const/4 v0, 0x0

    return-object v0

    .line 326
    :cond_2
    iget-object v0, p0, Lo/fpo;->c:Lo/fpo$d;

    invoke-static {v4, v0}, Lo/fpo$d;->c(Lo/fpo$d;Lo/fpo$d;)V

    .line 327
    invoke-static {v4}, Lo/fpo$d;->e(Lo/fpo$d;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lo/fpo$c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fpo$c<TV;>;)TV;"
        }
    .end annotation

    .line 359
    if-eqz p1, :cond_1

    .line 360
    iget-object v0, p0, Lo/fpo;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fpo$d;

    .line 361
    invoke-static {v2}, Lo/fpo$d;->e(Lo/fpo$d;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lo/fpo$c;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 362
    invoke-static {v2}, Lo/fpo$d;->e(Lo/fpo$d;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 364
    :cond_0
    goto :goto_0

    .line 366
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    .line 339
    if-nez p1, :cond_0

    .line 340
    const/4 v0, 0x0

    return-object v0

    .line 342
    :cond_0
    iget-object v0, p0, Lo/fpo;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/fpo$d;

    .line 343
    if-eqz v1, :cond_1

    .line 344
    invoke-static {v1}, Lo/fpo$d;->a(Lo/fpo$d;)V

    .line 345
    invoke-static {v1}, Lo/fpo$d;->e(Lo/fpo$d;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 347
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Lo/fpo$e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fpo$e<TV;>;)V"
        }
    .end annotation

    .line 150
    if-eqz p1, :cond_0

    .line 151
    iget-object v0, p0, Lo/fpo;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    :cond_0
    return-void
.end method

.method public final c()I
    .locals 1

    .line 210
    iget-object v0, p0, Lo/fpo;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public final d()V
    .locals 1

    .line 227
    iget-object v0, p0, Lo/fpo;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 228
    invoke-direct {p0}, Lo/fpo;->a()V

    .line 229
    return-void
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)Z"
        }
    .end annotation

    .line 257
    if-eqz p2, :cond_2

    .line 258
    iget-object v0, p0, Lo/fpo;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fpo$d;

    .line 259
    if-eqz v2, :cond_0

    .line 260
    invoke-static {v2}, Lo/fpo$d;->a(Lo/fpo$d;)V

    .line 261
    invoke-direct {p0, p1, p2}, Lo/fpo;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 262
    const/4 v0, 0x1

    return v0

    .line 263
    :cond_0
    iget-object v0, p0, Lo/fpo;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    iget v1, p0, Lo/fpo;->e:I

    if-ge v0, v1, :cond_1

    .line 264
    invoke-direct {p0, p1, p2}, Lo/fpo;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 265
    const/4 v0, 0x1

    return v0

    .line 267
    :cond_1
    iget-object v0, p0, Lo/fpo;->c:Lo/fpo$d;

    invoke-static {v0}, Lo/fpo$d;->d(Lo/fpo$d;)Lo/fpo$d;

    move-result-object v3

    .line 268
    iget-wide v0, p0, Lo/fpo;->b:J

    invoke-static {v3, v0, v1}, Lo/fpo$d;->b(Lo/fpo$d;J)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 269
    invoke-static {v3}, Lo/fpo$d;->a(Lo/fpo$d;)V

    .line 270
    iget-object v0, p0, Lo/fpo;->d:Ljava/util/Map;

    invoke-static {v3}, Lo/fpo$d;->c(Lo/fpo$d;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    invoke-direct {p0, p1, p2}, Lo/fpo;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 272
    invoke-static {v3}, Lo/fpo$d;->e(Lo/fpo$d;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fpo;->e(Ljava/lang/Object;)V

    .line 273
    const/4 v0, 0x1

    return v0

    .line 277
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final e()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<TV;>;"
        }
    .end annotation

    .line 415
    iget-object v0, p0, Lo/fpo;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 417
    new-instance v0, Lo/fpo$2;

    invoke-direct {v0, p0, v1}, Lo/fpo$2;-><init>(Lo/fpo;Ljava/util/Iterator;)V

    return-object v0
.end method
