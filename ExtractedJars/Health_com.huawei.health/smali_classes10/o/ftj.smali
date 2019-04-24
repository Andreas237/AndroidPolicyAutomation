.class public Lo/ftj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lo/ftz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/ftz<Ljava/lang/String;Lo/fte;>;"
        }
    .end annotation
.end field

.field private static final b:Lo/ftz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/ftz<Ljava/lang/String;Lo/fth;>;"
        }
    .end annotation
.end field

.field private static final c:Lo/ftz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/ftz<Ljava/lang/String;Lo/ftb;>;"
        }
    .end annotation
.end field

.field private static final d:Lo/ftz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/ftz<Ljava/lang/String;Lo/ftg;>;"
        }
    .end annotation
.end field

.field private static final e:Lo/ftz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/ftz<Ljava/lang/String;Lo/fti;>;"
        }
    .end annotation
.end field

.field private static final g:Lo/ftz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/ftz<Ljava/lang/String;Lo/ftc;>;"
        }
    .end annotation
.end field

.field private static final i:Lo/ftz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/ftz<Ljava/lang/String;Lo/fsz;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 57
    new-instance v0, Lo/fub;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Lo/fub;-><init>(I)V

    sput-object v0, Lo/ftj;->a:Lo/ftz;

    .line 58
    new-instance v0, Lo/fub;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Lo/fub;-><init>(I)V

    sput-object v0, Lo/ftj;->c:Lo/ftz;

    .line 59
    new-instance v0, Lo/fub;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Lo/fub;-><init>(I)V

    sput-object v0, Lo/ftj;->d:Lo/ftz;

    .line 60
    new-instance v0, Lo/fub;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Lo/fub;-><init>(I)V

    sput-object v0, Lo/ftj;->b:Lo/ftz;

    .line 61
    new-instance v0, Lo/fub;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Lo/fub;-><init>(I)V

    sput-object v0, Lo/ftj;->e:Lo/ftz;

    .line 62
    new-instance v0, Lo/fub;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Lo/fub;-><init>(I)V

    sput-object v0, Lo/ftj;->i:Lo/ftz;

    .line 63
    new-instance v0, Lo/fub;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Lo/fub;-><init>(I)V

    sput-object v0, Lo/ftj;->g:Lo/ftz;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lo/fti;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 451
    sget-object v0, Lo/ftj;->e:Lo/ftz;

    invoke-interface {v0, p0}, Lo/ftz;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/fti;

    .line 452
    if-eqz v1, :cond_0

    .line 453
    return-object v1

    .line 456
    :cond_0
    invoke-static {p0}, Lo/fua;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 457
    invoke-static {p0}, Lo/fua;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 458
    invoke-static {p0}, Lo/fua;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 460
    :try_start_0
    invoke-static {v2, v3, v4}, Lo/ftj;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/fti;
    :try_end_0
    .catch Lo/ftx; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 463
    goto :goto_0

    .line 461
    :catch_0
    move-exception v5

    .line 462
    new-instance v0, Lo/ftx;

    invoke-direct {v0, p0, v5}, Lo/ftx;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    .line 464
    :goto_0
    sget-object v0, Lo/ftj;->e:Lo/ftz;

    invoke-interface {v0, p0, v1}, Lo/ftz;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    return-object v1
.end method

.method public static b(Ljava/lang/String;)Lo/fte;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 136
    invoke-static {p0}, Lo/fua;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 137
    invoke-static {p0}, Lo/fua;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 138
    invoke-static {p0}, Lo/fua;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 140
    :try_start_0
    invoke-static {v1, v2, v3}, Lo/ftj;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/fte;
    :try_end_0
    .catch Lo/ftx; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 141
    :catch_0
    move-exception v4

    .line 142
    new-instance v0, Lo/ftx;

    invoke-direct {v0, p0, v4}, Lo/ftx;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/fti;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 520
    :try_start_0
    new-instance v3, Lo/ftq;

    invoke-direct {v3, p0, p1, p2}, Lo/ftq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lo/ftx; {:try_start_0 .. :try_end_0} :catch_0

    .line 523
    goto :goto_0

    .line 521
    :catch_0
    move-exception v4

    .line 522
    new-instance v0, Lo/ftx;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x40

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x2f

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v4}, Lo/ftx;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    .line 524
    :goto_0
    return-object v3
.end method

.method public static c(Ljava/lang/String;)Lo/fsz;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 594
    sget-object v0, Lo/ftj;->i:Lo/ftz;

    invoke-interface {v0, p0}, Lo/ftz;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/fsz;

    .line 595
    if-eqz v1, :cond_0

    .line 596
    return-object v1

    .line 599
    :cond_0
    invoke-static {p0}, Lo/fua;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 601
    :try_start_0
    new-instance v1, Lo/ftm;

    invoke-direct {v1, v2}, Lo/ftm;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lo/ftx; {:try_start_0 .. :try_end_0} :catch_0

    .line 604
    goto :goto_0

    .line 602
    :catch_0
    move-exception v3

    .line 603
    new-instance v0, Lo/ftx;

    invoke-direct {v0, p0, v3}, Lo/ftx;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    .line 605
    :goto_0
    sget-object v0, Lo/ftj;->i:Lo/ftz;

    invoke-interface {v0, p0, v1}, Lo/ftz;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 606
    return-object v1
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/fte;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 95
    invoke-static {p0, p1, p2}, Lo/fua;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 96
    sget-object v0, Lo/ftj;->a:Lo/ftz;

    invoke-interface {v0, v2}, Lo/ftz;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fte;

    .line 97
    if-eqz v3, :cond_0

    .line 98
    return-object v3

    .line 100
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 101
    new-instance v3, Lo/ftq;

    invoke-direct {v3, p0, p1, p2}, Lo/ftq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 102
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    .line 103
    new-instance v3, Lo/ftl;

    invoke-direct {v3, p0, p1}, Lo/ftl;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 104
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_3

    .line 105
    new-instance v3, Lo/ftm;

    invoke-direct {v3, p1}, Lo/ftm;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 106
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    .line 107
    new-instance v3, Lo/ftk;

    invoke-direct {v3, p1, p2}, Lo/ftk;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 109
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Not a valid combination of localpart, domainpart and resource"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 111
    :goto_0
    sget-object v0, Lo/ftj;->a:Lo/ftz;

    invoke-interface {v0, v2, v3}, Lo/ftz;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    return-object v3
.end method

.method public static d(Ljava/lang/String;)Lo/fth;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 356
    sget-object v0, Lo/ftj;->b:Lo/ftz;

    invoke-interface {v0, p0}, Lo/ftz;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/fth;

    .line 357
    if-eqz v1, :cond_0

    .line 358
    return-object v1

    .line 361
    :cond_0
    invoke-static {p0}, Lo/fua;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 362
    invoke-static {p0}, Lo/fua;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 364
    :try_start_0
    new-instance v1, Lo/ftl;

    invoke-direct {v1, v2, v3}, Lo/ftl;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lo/ftx; {:try_start_0 .. :try_end_0} :catch_0

    .line 367
    goto :goto_0

    .line 365
    :catch_0
    move-exception v4

    .line 366
    new-instance v0, Lo/ftx;

    invoke-direct {v0, p0, v4}, Lo/ftx;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    .line 368
    :goto_0
    sget-object v0, Lo/ftj;->b:Lo/ftz;

    invoke-interface {v0, p0, v1}, Lo/ftz;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    return-object v1
.end method
