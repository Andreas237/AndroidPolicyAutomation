.class public final Lo/fqz;
.super Lo/fqy;
.source "SourceFile"


# instance fields
.field private c:Lo/fra;

.field private d:[B

.field private e:I


# direct methods
.method public constructor <init>(Lo/fra;III[BLjava/net/InetSocketAddress;)V
    .locals 6

    .line 65
    move-object v0, p0

    move-object v1, p5

    move-object v2, p1

    move v3, p4

    move v4, p2

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lo/fqz;-><init>([BLo/fra;IILjava/net/InetSocketAddress;)V

    .line 66
    invoke-virtual {p0, p3}, Lo/fqz;->a(I)V

    .line 67
    return-void
.end method

.method public constructor <init>([BLo/fra;IILjava/net/InetSocketAddress;)V
    .locals 1

    .line 85
    invoke-direct {p0, p5}, Lo/fqy;-><init>(Ljava/net/InetSocketAddress;)V

    .line 86
    iput-object p2, p0, Lo/fqz;->c:Lo/fra;

    .line 87
    iput p4, p0, Lo/fqz;->e:I

    .line 88
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqz;->d:[B

    .line 89
    invoke-virtual {p0, p3}, Lo/fqz;->c(I)V

    .line 90
    array-length v0, p1

    invoke-virtual {p0, v0}, Lo/fqz;->e(I)V

    .line 91
    return-void
.end method


# virtual methods
.method public c()Lo/fra;
    .locals 1

    .line 97
    iget-object v0, p0, Lo/fqz;->c:Lo/fra;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 102
    iget v0, p0, Lo/fqz;->e:I

    return v0
.end method

.method public g()[B
    .locals 1

    .line 119
    iget-object v0, p0, Lo/fqz;->d:[B

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 107
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    invoke-super {p0}, Lo/fqy;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    const-string v0, "\t\t\tFragmented Handshake Message: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fqz;->d:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " bytes"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    const-string v0, "\t\t\t\t"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fqz;->d:[B

    invoke-static {v1}, Lo/fsp;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
