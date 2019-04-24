.class public final enum Lo/fsf;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fsf$1;,
        Lo/fsf$b;,
        Lo/fsf$e;,
        Lo/fsf$a;,
        Lo/fsf$d;,
        Lo/fsf$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fsf;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fsf;

.field public static final enum b:Lo/fsf;

.field public static final enum c:Lo/fsf;

.field public static final enum d:Lo/fsf;

.field public static final enum e:Lo/fsf;

.field private static final i:Lo/fty;

.field private static final synthetic o:[Lo/fsf;


# instance fields
.field private f:Lo/fsf$c;

.field private g:Lo/fsf$d;

.field private h:Lo/fsf$a;

.field private k:I

.field private l:I

.field private n:Lo/fsf$e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 54
    new-instance v0, Lo/fsf;

    const-string v1, "TLS_NULL_WITH_NULL_NULL"

    sget-object v4, Lo/fsf$a;->c:Lo/fsf$a;

    sget-object v5, Lo/fsf$d;->a:Lo/fsf$d;

    sget-object v6, Lo/fsf$c;->e:Lo/fsf$c;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v6}, Lo/fsf;-><init>(Ljava/lang/String;IILo/fsf$a;Lo/fsf$d;Lo/fsf$c;)V

    sput-object v0, Lo/fsf;->b:Lo/fsf;

    .line 55
    new-instance v0, Lo/fsf;

    const-string v1, "TLS_PSK_WITH_AES_128_CBC_SHA256"

    sget-object v4, Lo/fsf$a;->g:Lo/fsf$a;

    sget-object v5, Lo/fsf$d;->d:Lo/fsf$d;

    sget-object v6, Lo/fsf$c;->a:Lo/fsf$c;

    const/4 v2, 0x1

    const/16 v3, 0xae

    invoke-direct/range {v0 .. v6}, Lo/fsf;-><init>(Ljava/lang/String;IILo/fsf$a;Lo/fsf$d;Lo/fsf$c;)V

    sput-object v0, Lo/fsf;->c:Lo/fsf;

    .line 56
    new-instance v0, Lo/fsf;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256"

    sget-object v4, Lo/fsf$a;->f:Lo/fsf$a;

    sget-object v5, Lo/fsf$d;->d:Lo/fsf$d;

    sget-object v6, Lo/fsf$c;->a:Lo/fsf$c;

    const/4 v2, 0x2

    const v3, 0xc023

    invoke-direct/range {v0 .. v6}, Lo/fsf;-><init>(Ljava/lang/String;IILo/fsf$a;Lo/fsf$d;Lo/fsf$c;)V

    sput-object v0, Lo/fsf;->e:Lo/fsf;

    .line 57
    new-instance v0, Lo/fsf;

    const-string v1, "TLS_PSK_WITH_AES_128_CCM_8"

    sget-object v4, Lo/fsf$a;->g:Lo/fsf$a;

    sget-object v5, Lo/fsf$d;->c:Lo/fsf$d;

    sget-object v6, Lo/fsf$c;->e:Lo/fsf$c;

    const/4 v2, 0x3

    const v3, 0xc0a8

    invoke-direct/range {v0 .. v6}, Lo/fsf;-><init>(Ljava/lang/String;IILo/fsf$a;Lo/fsf$d;Lo/fsf$c;)V

    sput-object v0, Lo/fsf;->d:Lo/fsf;

    .line 58
    new-instance v0, Lo/fsf;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8"

    sget-object v4, Lo/fsf$a;->f:Lo/fsf$a;

    sget-object v5, Lo/fsf$d;->c:Lo/fsf$d;

    sget-object v6, Lo/fsf$c;->e:Lo/fsf$c;

    const/4 v2, 0x4

    const v3, 0xc0ae

    invoke-direct/range {v0 .. v6}, Lo/fsf;-><init>(Ljava/lang/String;IILo/fsf$a;Lo/fsf$d;Lo/fsf$c;)V

    sput-object v0, Lo/fsf;->a:Lo/fsf;

    .line 50
    const/4 v0, 0x5

    new-array v0, v0, [Lo/fsf;

    sget-object v1, Lo/fsf;->b:Lo/fsf;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf;->c:Lo/fsf;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf;->e:Lo/fsf;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf;->d:Lo/fsf;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf;->a:Lo/fsf;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lo/fsf;->o:[Lo/fsf;

    .line 66
    const-class v0, Lo/fsf;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fsf;->i:Lo/fty;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILo/fsf$a;Lo/fsf$d;Lo/fsf$c;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/fsf$a;Lo/fsf$d;Lo/fsf$c;)V"
        }
    .end annotation

    .line 84
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    sget-object v7, Lo/fsf$e;->e:Lo/fsf$e;

    invoke-direct/range {v0 .. v7}, Lo/fsf;-><init>(Ljava/lang/String;IILo/fsf$a;Lo/fsf$d;Lo/fsf$c;Lo/fsf$e;)V

    .line 85
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILo/fsf$a;Lo/fsf$d;Lo/fsf$c;Lo/fsf$e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/fsf$a;Lo/fsf$d;Lo/fsf$c;Lo/fsf$e;)V"
        }
    .end annotation

    .line 87
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 88
    iput p3, p0, Lo/fsf;->k:I

    .line 89
    iput-object p4, p0, Lo/fsf;->h:Lo/fsf$a;

    .line 90
    iput-object p5, p0, Lo/fsf;->g:Lo/fsf$d;

    .line 91
    iput-object p6, p0, Lo/fsf;->f:Lo/fsf$c;

    .line 92
    iput-object p7, p0, Lo/fsf;->n:Lo/fsf$e;

    .line 93
    sget-object v0, Lo/fsf$1;->d:[I

    iget-object v1, p0, Lo/fsf;->g:Lo/fsf$d;

    invoke-static {v1}, Lo/fsf$d;->e(Lo/fsf$d;)Lo/fsf$b;

    move-result-object v1

    invoke-virtual {v1}, Lo/fsf$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 95
    :sswitch_0
    invoke-static {p5}, Lo/fsf$d;->b(Lo/fsf$d;)I

    move-result v0

    invoke-virtual {p6}, Lo/fsf$c;->a()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {p5}, Lo/fsf$d;->b(Lo/fsf$d;)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fsf;->l:I

    .line 100
    goto :goto_1

    .line 102
    :sswitch_1
    invoke-static {p5}, Lo/fsf$d;->b(Lo/fsf$d;)I

    move-result v0

    invoke-static {p5}, Lo/fsf$d;->d(Lo/fsf$d;)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lo/fsf;->l:I

    .line 105
    goto :goto_1

    .line 107
    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lo/fsf;->l:I

    .line 109
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public static a([BI)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BI)Ljava/util/List<Lo/fsf;>;"
        }
    .end annotation

    .line 359
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 360
    new-instance v2, Lo/fpq;

    invoke-direct {v2, p0}, Lo/fpq;-><init>([B)V

    .line 362
    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_1

    .line 363
    const/16 v0, 0x10

    invoke-virtual {v2, v0}, Lo/fpq;->c(I)I

    move-result v4

    .line 364
    invoke-static {v4}, Lo/fsf;->c(I)Lo/fsf;

    move-result-object v5

    .line 367
    if-eqz v5, :cond_0

    .line 368
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 362
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 371
    :cond_1
    return-object v1
.end method

.method public static a(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fsf;>;)Z"
        }
    .end annotation

    .line 309
    if-eqz p0, :cond_1

    .line 310
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fsf;

    .line 311
    invoke-virtual {v2}, Lo/fsf;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 312
    const/4 v0, 0x1

    return v0

    .line 314
    :cond_0
    goto :goto_0

    .line 316
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Ljava/util/List;)[B
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fsf;>;)[B"
        }
    .end annotation

    .line 350
    new-instance v2, Lo/fpp;

    invoke-direct {v2}, Lo/fpp;-><init>()V

    .line 351
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fsf;

    .line 352
    invoke-virtual {v4}, Lo/fsf;->e()I

    move-result v0

    const/16 v1, 0x10

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 353
    goto :goto_0

    .line 355
    :cond_0
    invoke-virtual {v2}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method public static c(I)Lo/fsf;
    .locals 7

    .line 270
    invoke-static {}, Lo/fsf;->values()[Lo/fsf;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 271
    iget v0, v6, Lo/fsf;->k:I

    if-ne v0, p0, :cond_0

    .line 272
    return-object v6

    .line 270
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 275
    :cond_1
    sget-object v0, Lo/fsf;->i:Lo/fty;

    invoke-interface {v0}, Lo/fty;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 276
    sget-object v0, Lo/fsf;->i:Lo/fty;

    const-string v1, "Cannot resolve cipher suite code [{}]"

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 280
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static e(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fsf;>;)Z"
        }
    .end annotation

    .line 329
    if-eqz p0, :cond_1

    .line 330
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fsf;

    .line 331
    invoke-virtual {v2}, Lo/fsf;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 332
    const/4 v0, 0x1

    return v0

    .line 334
    :cond_0
    goto :goto_0

    .line 336
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fsf;
    .locals 1

    .line 50
    const-class v0, Lo/fsf;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fsf;

    return-object v0
.end method

.method public static values()[Lo/fsf;
    .locals 1

    .line 50
    sget-object v0, Lo/fsf;->o:[Lo/fsf;

    invoke-virtual {v0}, [Lo/fsf;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fsf;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 161
    sget-object v0, Lo/fsf$a;->d:Lo/fsf$a;

    iget-object v1, p0, Lo/fsf;->h:Lo/fsf$a;

    invoke-virtual {v0, v1}, Lo/fsf$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lo/fsf$a;->g:Lo/fsf$a;

    iget-object v1, p0, Lo/fsf;->h:Lo/fsf$a;

    invoke-virtual {v0, v1}, Lo/fsf$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lo/fsf$a;->c:Lo/fsf$a;

    iget-object v1, p0, Lo/fsf;->h:Lo/fsf$a;

    invoke-virtual {v0, v1}, Lo/fsf$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()I
    .locals 1

    .line 114
    iget v0, p0, Lo/fsf;->l:I

    return v0
.end method

.method public c()Lo/fsf$a;
    .locals 1

    .line 151
    iget-object v0, p0, Lo/fsf;->h:Lo/fsf$a;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 129
    iget-object v0, p0, Lo/fsf;->g:Lo/fsf$d;

    invoke-static {v0}, Lo/fsf$d;->a(Lo/fsf$d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()I
    .locals 1

    .line 141
    iget v0, p0, Lo/fsf;->k:I

    return v0
.end method

.method public f()I
    .locals 1

    .line 218
    iget-object v0, p0, Lo/fsf;->g:Lo/fsf$d;

    invoke-static {v0}, Lo/fsf$d;->b(Lo/fsf$d;)I

    move-result v0

    return v0
.end method

.method public g()Z
    .locals 2

    .line 172
    sget-object v0, Lo/fsf$a;->f:Lo/fsf$a;

    iget-object v1, p0, Lo/fsf;->h:Lo/fsf$a;

    invoke-virtual {v0, v1}, Lo/fsf$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public h()I
    .locals 1

    .line 190
    iget-object v0, p0, Lo/fsf;->f:Lo/fsf$c;

    invoke-virtual {v0}, Lo/fsf$c;->d()I

    move-result v0

    return v0
.end method

.method public i()I
    .locals 1

    .line 181
    iget-object v0, p0, Lo/fsf;->f:Lo/fsf$c;

    invoke-virtual {v0}, Lo/fsf$c;->a()I

    move-result v0

    return v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 205
    iget-object v0, p0, Lo/fsf;->f:Lo/fsf$c;

    invoke-virtual {v0}, Lo/fsf$c;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public l()I
    .locals 1

    .line 230
    iget-object v0, p0, Lo/fsf;->g:Lo/fsf$d;

    invoke-static {v0}, Lo/fsf$d;->c(Lo/fsf$d;)I

    move-result v0

    return v0
.end method

.method public m()Lo/fsf$b;
    .locals 1

    .line 249
    iget-object v0, p0, Lo/fsf;->g:Lo/fsf$d;

    invoke-static {v0}, Lo/fsf$d;->e(Lo/fsf$d;)Lo/fsf$b;

    move-result-object v0

    return-object v0
.end method

.method public o()I
    .locals 1

    .line 258
    iget-object v0, p0, Lo/fsf;->g:Lo/fsf$d;

    invoke-static {v0}, Lo/fsf$d;->k(Lo/fsf$d;)I

    move-result v0

    return v0
.end method
