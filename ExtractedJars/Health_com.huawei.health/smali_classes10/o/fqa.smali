.class public final Lo/fqa;
.super Lo/fpy;
.source "SourceFile"


# instance fields
.field private final e:[B


# direct methods
.method public constructor <init>([BLjava/net/InetSocketAddress;)V
    .locals 1

    .line 51
    invoke-direct {p0, p2}, Lo/fpy;-><init>(Ljava/net/InetSocketAddress;)V

    .line 52
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqa;->e:[B

    .line 53
    return-void
.end method

.method public static d([BLjava/net/InetSocketAddress;)Lo/fqm;
    .locals 1

    .line 77
    new-instance v0, Lo/fqa;

    invoke-direct {v0, p0, p1}, Lo/fqa;-><init>([BLjava/net/InetSocketAddress;)V

    return-object v0
.end method


# virtual methods
.method public a()[B
    .locals 1

    .line 73
    iget-object v0, p0, Lo/fqa;->e:[B

    return-object v0
.end method

.method public b()Lo/fqn;
    .locals 1

    .line 59
    sget-object v0, Lo/fqn;->c:Lo/fqn;

    return-object v0
.end method

.method public d()[B
    .locals 1

    .line 83
    iget-object v0, p0, Lo/fqa;->e:[B

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 64
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    const-string v0, "\tApplication Data: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fqa;->e:[B

    invoke-static {v1}, Lo/fsp;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
