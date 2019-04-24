.class public abstract Lo/fnh;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lo/fpq;IILo/flq;)I
    .locals 1

    .line 187
    invoke-static {p0, p2, p3}, Lo/fnh;->b(Lo/fpq;ILo/flq;)I

    move-result v0

    add-int/2addr v0, p1

    return v0
.end method

.method private static b(Lo/fpq;ILo/flq;)I
    .locals 5

    .line 191
    const/16 v0, 0xc

    if-gt p1, v0, :cond_0

    .line 192
    return p1

    .line 193
    :cond_0
    const/16 v0, 0xd

    if-ne p1, v0, :cond_1

    .line 194
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/fpq;->c(I)I

    move-result v0

    add-int/lit8 v0, v0, 0xd

    return v0

    .line 195
    :cond_1
    const/16 v0, 0xe

    if-ne p1, v0, :cond_2

    .line 196
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lo/fpq;->c(I)I

    move-result v0

    add-int/lit16 v0, v0, 0x10d

    return v0

    .line 198
    :cond_2
    new-instance v0, Lo/fln;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Message contains illegal option delta/length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/flq;->a()I

    move-result v2

    invoke-virtual {p2}, Lo/flq;->e()I

    move-result v3

    invoke-virtual {p2}, Lo/flq;->c()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/fln;-><init>(Ljava/lang/String;IIZ)V

    throw v0
.end method

.method private static b(Lo/fpq;Lo/flq;)V
    .locals 11

    .line 127
    const/4 v5, 0x0

    .line 128
    const/4 v6, 0x0

    .line 130
    :goto_0
    invoke-virtual {p0}, Lo/fpq;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 131
    invoke-virtual {p0}, Lo/fpq;->a()B

    move-result v6

    .line 132
    const/4 v0, -0x1

    if-eq v6, v0, :cond_1

    .line 134
    and-int/lit16 v0, v6, 0xf0

    shr-int/lit8 v7, v0, 0x4

    .line 135
    invoke-static {p0, v5, v7, p1}, Lo/fnh;->a(Lo/fpq;IILo/flq;)I

    move-result v5

    .line 138
    and-int/lit8 v8, v6, 0xf

    .line 139
    invoke-static {p0, v8, p1}, Lo/fnh;->b(Lo/fpq;ILo/flq;)I

    move-result v9

    .line 142
    invoke-virtual {p0, v9}, Lo/fpq;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    new-instance v10, Lo/flt;

    invoke-direct {v10, v5}, Lo/flt;-><init>(I)V

    .line 144
    invoke-virtual {p0, v9}, Lo/fpq;->d(I)[B

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/flt;->d([B)V

    .line 147
    invoke-virtual {p1}, Lo/flq;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/flr;->e(Lo/flt;)Lo/flr;

    .line 148
    goto :goto_1

    .line 149
    :cond_0
    const-string v0, "Message contains option of length %d with only fewer bytes left in the message"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 152
    new-instance v0, Lo/fln;

    invoke-virtual {p1}, Lo/flq;->a()I

    move-result v1

    invoke-virtual {p1}, Lo/flq;->e()I

    move-result v2

    invoke-virtual {p1}, Lo/flq;->c()Z

    move-result v3

    invoke-direct {v0, v10, v1, v2, v3}, Lo/fln;-><init>(Ljava/lang/String;IIZ)V

    throw v0

    .line 154
    :goto_1
    goto/16 :goto_0

    .line 158
    :cond_1
    const/4 v0, -0x1

    if-ne v6, v0, :cond_3

    .line 160
    invoke-virtual {p0}, Lo/fpq;->b()Z

    move-result v0

    if-nez v0, :cond_2

    .line 161
    new-instance v0, Lo/fln;

    const-string v1, "Found payload marker (0xFF) but message contains no payload"

    invoke-virtual {p1}, Lo/flq;->a()I

    move-result v2

    invoke-virtual {p1}, Lo/flq;->e()I

    move-result v3

    invoke-virtual {p1}, Lo/flq;->c()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/fln;-><init>(Ljava/lang/String;IIZ)V

    throw v0

    .line 166
    :cond_2
    invoke-virtual {p0}, Lo/fpq;->c()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/flq;->e([B)Lo/flq;

    goto :goto_2

    .line 169
    :cond_3
    const/4 v0, 0x0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/flq;->e(Ljava/lang/String;)Lo/flq;

    .line 171
    :goto_2
    return-void
.end method

.method private static c(Lo/fpq;Lo/fnf;Lo/flq;)Lo/flq;
    .locals 1

    .line 80
    invoke-virtual {p1}, Lo/fnf;->a()I

    move-result v0

    invoke-virtual {p2, v0}, Lo/flq;->d(I)Lo/flq;

    .line 81
    invoke-virtual {p1}, Lo/fnf;->e()Lo/flj$e;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/flq;->d(Lo/flj$e;)Lo/flq;

    .line 82
    invoke-virtual {p1}, Lo/fnf;->b()Lo/flz;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/flq;->e(Lo/flz;)Lo/flq;

    .line 84
    invoke-static {p0, p2}, Lo/fnh;->b(Lo/fpq;Lo/flq;)V

    .line 85
    return-object p2
.end method

.method protected static final c(I)V
    .locals 3

    .line 119
    const/16 v0, 0x8

    if-le p0, v0, :cond_0

    .line 122
    new-instance v0, Lo/flm;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Message has invalid token length (> 8)"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/flm;-><init>(Ljava/lang/String;)V

    throw v0

    .line 124
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lo/fpd;)Lo/flq;
    .locals 2

    .line 47
    invoke-virtual {p1}, Lo/fpd;->c()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/fnh;->b([B)Lo/flq;

    move-result-object v1

    .line 48
    invoke-virtual {p1}, Lo/fpd;->h()Lo/fow;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/flq;->c(Lo/fow;)Lo/flq;

    .line 49
    return-object v1
.end method

.method public final b([B)Lo/flq;
    .locals 9

    .line 61
    const-string v5, "illegal message code"

    .line 62
    new-instance v6, Lo/fpq;

    invoke-direct {v6, p1}, Lo/fpq;-><init>([B)V

    .line 63
    invoke-virtual {p0, v6}, Lo/fnh;->d(Lo/fpq;)Lo/fnf;

    move-result-object v7

    .line 65
    :try_start_0
    invoke-virtual {v7}, Lo/fnf;->d()I

    move-result v0

    invoke-static {v0}, Lo/flj;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    new-instance v0, Lo/fma;

    invoke-virtual {v7}, Lo/fnf;->d()I

    move-result v1

    invoke-static {v1}, Lo/flj$d;->c(I)Lo/flj$d;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fma;-><init>(Lo/flj$d;)V

    invoke-static {v6, v7, v0}, Lo/fnh;->c(Lo/fpq;Lo/fnf;Lo/flq;)Lo/flq;
    :try_end_0
    .catch Lo/flm; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 67
    :cond_0
    :try_start_1
    invoke-virtual {v7}, Lo/fnf;->d()I

    move-result v0

    invoke-static {v0}, Lo/flj;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 68
    new-instance v0, Lo/fly;

    invoke-virtual {v7}, Lo/fnf;->d()I

    move-result v1

    invoke-static {v1}, Lo/flj$b;->d(I)Lo/flj$b;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fly;-><init>(Lo/flj$b;)V

    invoke-static {v6, v7, v0}, Lo/fnh;->c(Lo/fpq;Lo/fnf;Lo/flq;)Lo/flq;
    :try_end_1
    .catch Lo/flm; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    return-object v0

    .line 69
    :cond_1
    :try_start_2
    invoke-virtual {v7}, Lo/fnf;->d()I

    move-result v0

    invoke-static {v0}, Lo/flj;->c(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 70
    new-instance v0, Lo/flo;

    invoke-virtual {v7}, Lo/fnf;->e()Lo/flj$e;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/flo;-><init>(Lo/flj$e;)V

    invoke-static {v6, v7, v0}, Lo/fnh;->c(Lo/fpq;Lo/fnf;Lo/flq;)Lo/flq;
    :try_end_2
    .catch Lo/flm; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v0

    return-object v0

    .line 75
    :cond_2
    goto :goto_0

    .line 72
    :catch_0
    move-exception v8

    .line 74
    invoke-virtual {v8}, Lo/flm;->getMessage()Ljava/lang/String;

    move-result-object v5

    .line 76
    :goto_0
    new-instance v0, Lo/fln;

    invoke-virtual {v7}, Lo/fnf;->a()I

    move-result v1

    invoke-virtual {v7}, Lo/fnf;->d()I

    move-result v2

    sget-object v3, Lo/flj$e;->c:Lo/flj$e;

    invoke-virtual {v7}, Lo/fnf;->e()Lo/flj$e;

    move-result-object v4

    if-ne v3, v4, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    invoke-direct {v0, v5, v1, v2, v3}, Lo/fln;-><init>(Ljava/lang/String;IIZ)V

    throw v0
.end method

.method protected abstract d(Lo/fpq;)Lo/fnf;
.end method
