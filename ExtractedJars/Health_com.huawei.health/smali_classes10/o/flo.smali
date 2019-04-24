.class public Lo/flo;
.super Lo/flq;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lo/flj$e;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lo/flq;-><init>(Lo/flj$e;)V

    .line 40
    return-void
.end method

.method public static b(Lo/flq;)Lo/flo;
    .locals 2

    .line 83
    new-instance v1, Lo/flo;

    sget-object v0, Lo/flj$e;->d:Lo/flj$e;

    invoke-direct {v1, v0}, Lo/flo;-><init>(Lo/flj$e;)V

    .line 84
    invoke-virtual {p0}, Lo/flq;->r()Lo/fow;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/flo;->d(Lo/fow;)Lo/flq;

    .line 85
    invoke-virtual {p0}, Lo/flq;->a()I

    move-result v0

    invoke-virtual {v1, v0}, Lo/flo;->d(I)Lo/flq;

    .line 86
    return-object v1
.end method

.method public static d(Lo/flq;)Lo/flo;
    .locals 2

    .line 96
    new-instance v1, Lo/flo;

    sget-object v0, Lo/flj$e;->b:Lo/flj$e;

    invoke-direct {v1, v0}, Lo/flo;-><init>(Lo/flj$e;)V

    .line 97
    invoke-virtual {p0}, Lo/flq;->r()Lo/fow;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/flo;->d(Lo/fow;)Lo/flq;

    .line 98
    invoke-virtual {p0}, Lo/flq;->a()I

    move-result v0

    invoke-virtual {v1, v0}, Lo/flo;->d(I)Lo/flq;

    .line 99
    return-object v1
.end method


# virtual methods
.method public e()I
    .locals 1

    .line 73
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 47
    const-string v4, ""

    .line 49
    invoke-virtual {p0}, Lo/flo;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo/flo;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->S()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Lo/flo;->g()I

    move-result v0

    if-lez v0, :cond_5

    .line 50
    :cond_0
    invoke-virtual {p0}, Lo/flo;->n()Ljava/lang/String;

    move-result-object v5

    .line 51
    if-nez v5, :cond_1

    .line 52
    const-string v5, "no payload"

    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    .line 55
    const-string v0, "\n"

    invoke-virtual {v5, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 56
    const-string v0, "\n"

    invoke-virtual {v5, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 58
    :cond_2
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x18

    if-le v0, v1, :cond_3

    .line 59
    const/4 v0, 0x0

    const/16 v1, 0x14

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 61
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 62
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v6, 0x2

    if-eq v0, v1, :cond_4

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " bytes"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 66
    :cond_4
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " NON-EMPTY: Token="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/flo;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/flo;->f()Lo/flr;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 68
    :cond_5
    const-string v0, "%s        MID=%5d%s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lo/flo;->b()Lo/flj$e;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/flo;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
