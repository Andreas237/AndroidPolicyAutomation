.class public final Lo/fry;
.super Lo/frf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fry$1;
    }
.end annotation


# instance fields
.field private b:Lo/fsr;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 42
    sget-object v0, Lo/frf$b;->e:Lo/frf$b;

    invoke-direct {p0, v0}, Lo/frf;-><init>(Lo/frf$b;)V

    .line 43
    return-void
.end method

.method private constructor <init>(Lo/fsr;)V
    .locals 2

    .line 55
    invoke-direct {p0}, Lo/fry;-><init>()V

    .line 56
    if-nez p1, :cond_0

    .line 57
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "server names must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 59
    :cond_0
    iput-object p1, p0, Lo/fry;->b:Lo/fsr;

    .line 60
    return-void
.end method

.method private static a(Lo/fpq;Ljava/net/InetSocketAddress;)Lo/fry;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 143
    invoke-static {}, Lo/fsr;->a()Lo/fsr;

    move-result-object v5

    .line 144
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lo/fpq;->c(I)I

    move-result v6

    .line 145
    :goto_0
    if-lez v6, :cond_1

    .line 146
    invoke-virtual {p0}, Lo/fpq;->d()I

    move-result v0

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    .line 147
    invoke-virtual {p0}, Lo/fpq;->a()B

    move-result v0

    invoke-static {v0}, Lo/fst$d;->b(B)Lo/fst$d;

    move-result-object v7

    .line 148
    sget-object v0, Lo/fry$1;->d:[I

    invoke-virtual {v7}, Lo/fst$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 150
    :sswitch_0
    invoke-static {p0, p1}, Lo/fry;->d(Lo/fpq;Ljava/net/InetSocketAddress;)[B

    move-result-object v8

    .line 151
    invoke-static {v7, v8}, Lo/fst;->a(Lo/fst$d;[B)Lo/fst;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/fsr;->c(Lo/fst;)Lo/fsr;

    .line 152
    array-length v0, v8

    add-int/lit8 v0, v0, 0x3

    sub-int/2addr v6, v0

    .line 153
    goto :goto_2

    .line 155
    :goto_1
    new-instance v0, Lo/fqx;

    const-string v1, "Server Name Indication extension contains unknown name_type"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->o:Lo/fqb$b;

    invoke-direct {v2, v3, v4, p1}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 159
    :goto_2
    goto :goto_0

    .line 160
    :cond_0
    invoke-static {p1}, Lo/fry;->d(Ljava/net/InetSocketAddress;)Lo/fqx;

    move-result-object v0

    throw v0

    .line 163
    :cond_1
    new-instance v0, Lo/fry;

    invoke-direct {v0, v5}, Lo/fry;-><init>(Lo/fsr;)V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public static c()Lo/fry;
    .locals 1

    .line 71
    new-instance v0, Lo/fry;

    invoke-direct {v0}, Lo/fry;-><init>()V

    return-object v0
.end method

.method public static c([BLjava/net/InetSocketAddress;)Lo/fry;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 130
    if-eqz p0, :cond_0

    array-length v0, p0

    if-nez v0, :cond_1

    .line 132
    :cond_0
    invoke-static {}, Lo/fry;->c()Lo/fry;

    move-result-object v0

    return-object v0

    .line 134
    :cond_1
    new-instance v1, Lo/fpq;

    invoke-direct {v1, p0}, Lo/fpq;-><init>([B)V

    .line 135
    invoke-static {v1, p1}, Lo/fry;->a(Lo/fpq;Ljava/net/InetSocketAddress;)Lo/fry;

    move-result-object v0

    return-object v0
.end method

.method private static d(Ljava/net/InetSocketAddress;)Lo/fqx;
    .locals 5

    .line 179
    new-instance v0, Lo/fqx;

    const-string v1, "malformed Server Name Indication extension"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->r:Lo/fqb$b;

    invoke-direct {v2, v3, v4, p0}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    return-object v0
.end method

.method public static d(Lo/fsr;)Lo/fry;
    .locals 1

    .line 101
    new-instance v0, Lo/fry;

    invoke-direct {v0, p0}, Lo/fry;-><init>(Lo/fsr;)V

    return-object v0
.end method

.method private static d(Lo/fpq;Ljava/net/InetSocketAddress;)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 168
    invoke-virtual {p0}, Lo/fpq;->d()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 169
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lo/fpq;->c(I)I

    move-result v2

    .line 170
    invoke-virtual {p0, v2}, Lo/fpq;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    invoke-virtual {p0, v2}, Lo/fpq;->d(I)[B

    move-result-object v0

    return-object v0

    .line 174
    :cond_0
    invoke-static {p1}, Lo/fry;->d(Ljava/net/InetSocketAddress;)Lo/fqx;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public a()Lo/fsr;
    .locals 1

    .line 190
    iget-object v0, p0, Lo/fry;->b:Lo/fsr;

    return-object v0
.end method

.method public b()I
    .locals 2

    .line 195
    const/4 v1, 0x2

    .line 196
    add-int/lit8 v1, v1, 0x2

    .line 197
    iget-object v0, p0, Lo/fry;->b:Lo/fsr;

    if-eqz v0, :cond_0

    .line 198
    add-int/lit8 v1, v1, 0x2

    .line 199
    iget-object v0, p0, Lo/fry;->b:Lo/fsr;

    invoke-virtual {v0}, Lo/fsr;->d()I

    move-result v0

    add-int/lit8 v1, v0, 0x6

    .line 201
    :cond_0
    return v1
.end method

.method protected e(Lo/fpp;)V
    .locals 4

    .line 107
    iget-object v0, p0, Lo/fry;->b:Lo/fsr;

    if-nez v0, :cond_0

    .line 108
    const/4 v0, 0x0

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    goto :goto_1

    .line 110
    :cond_0
    iget-object v0, p0, Lo/fry;->b:Lo/fsr;

    invoke-virtual {v0}, Lo/fsr;->d()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 111
    iget-object v0, p0, Lo/fry;->b:Lo/fsr;

    invoke-virtual {v0}, Lo/fsr;->d()I

    move-result v0

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 113
    iget-object v0, p0, Lo/fry;->b:Lo/fsr;

    invoke-virtual {v0}, Lo/fsr;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fst;

    .line 114
    invoke-virtual {v3}, Lo/fst;->a()Lo/fst$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/fst$d;->a()B

    move-result v0

    invoke-virtual {p1, v0}, Lo/fpp;->b(B)V

    .line 115
    invoke-virtual {v3}, Lo/fst;->b()[B

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 116
    invoke-virtual {v3}, Lo/fst;->b()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/fpp;->e([B)V

    .line 117
    goto :goto_0

    .line 119
    :cond_1
    :goto_1
    return-void
.end method
