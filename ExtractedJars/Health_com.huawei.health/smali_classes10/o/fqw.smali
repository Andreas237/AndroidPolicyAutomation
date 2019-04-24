.class public final Lo/fqw;
.super Lo/fqy;
.source "SourceFile"


# static fields
.field private static final c:Lo/fty;


# instance fields
.field private final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 49
    const-class v0, Lo/fqw;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fqw;->c:Lo/fty;

    return-void
.end method

.method private constructor <init>([BLjava/net/InetSocketAddress;)V
    .locals 1

    .line 85
    invoke-direct {p0, p2}, Lo/fqy;-><init>(Ljava/net/InetSocketAddress;)V

    .line 86
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqw;->b:[B

    .line 87
    return-void
.end method

.method public constructor <init>([BZ[BLjava/net/InetSocketAddress;)V
    .locals 1

    .line 73
    invoke-direct {p0, p4}, Lo/fqy;-><init>(Ljava/net/InetSocketAddress;)V

    .line 74
    invoke-direct {p0, p1, p2, p3}, Lo/fqw;->b([BZ[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqw;->b:[B

    .line 75
    return-void
.end method

.method public static a([BLjava/net/InetSocketAddress;)Lo/fqy;
    .locals 3

    .line 161
    new-instance v1, Lo/fpq;

    invoke-direct {v1, p0}, Lo/fpq;-><init>([B)V

    .line 162
    invoke-virtual {v1}, Lo/fpq;->c()[B

    move-result-object v2

    .line 163
    new-instance v0, Lo/fqw;

    invoke-direct {v0, v2, p1}, Lo/fqw;-><init>([BLjava/net/InetSocketAddress;)V

    return-object v0
.end method

.method private b([BZ[B)[B
    .locals 1

    .line 127
    if-eqz p2, :cond_0

    .line 128
    sget-object v0, Lo/fsm$e;->b:Lo/fsm$e;

    invoke-static {p1, v0, p3}, Lo/fsm;->b([BLo/fsm$e;[B)[B

    move-result-object v0

    return-object v0

    .line 130
    :cond_0
    sget-object v0, Lo/fsm$e;->d:Lo/fsm$e;

    invoke-static {p1, v0, p3}, Lo/fsm;->b([BLo/fsm$e;[B)[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a([BZ[B)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 108
    invoke-direct {p0, p1, p2, p3}, Lo/fqw;->b([BZ[B)[B

    move-result-object v3

    .line 110
    iget-object v0, p0, Lo/fqw;->b:[B

    invoke-static {v3, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_1

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Verification of peer\'s ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lo/fqw;->e()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "] FINISHED message failed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 113
    sget-object v0, Lo/fqw;->c:Lo/fty;

    invoke-interface {v0}, Lo/fty;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Expected: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v3}, Lo/fsp;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Received: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fqw;->b:[B

    invoke-static {v1}, Lo/fsp;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    :cond_0
    sget-object v0, Lo/fqw;->c:Lo/fty;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 118
    new-instance v5, Lo/fqb;

    sget-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v1, Lo/fqb$b;->g:Lo/fqb$b;

    invoke-virtual {p0}, Lo/fqw;->e()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-direct {v5, v0, v1, v2}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    .line 119
    new-instance v0, Lo/fqx;

    const-string v1, "Verification of FINISHED message failed"

    invoke-direct {v0, v1, v5}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 121
    :cond_1
    return-void
.end method

.method public c()Lo/fra;
    .locals 1

    .line 136
    sget-object v0, Lo/fra;->o:Lo/fra;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 141
    iget-object v0, p0, Lo/fqw;->b:[B

    array-length v0, v0

    return v0
.end method

.method public g()[B
    .locals 2

    .line 155
    new-instance v1, Lo/fpp;

    invoke-direct {v1}, Lo/fpp;-><init>()V

    .line 156
    iget-object v0, p0, Lo/fqw;->b:[B

    invoke-virtual {v1, v0}, Lo/fpp;->e([B)V

    .line 157
    invoke-virtual {v1}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 146
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-super {p0}, Lo/fqy;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "\t\tVerify Data: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fqw;->b:[B

    invoke-static {v1}, Lo/fsp;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
