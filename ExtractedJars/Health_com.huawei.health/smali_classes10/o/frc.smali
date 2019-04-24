.class public final Lo/frc;
.super Lo/fqy;
.source "SourceFile"


# instance fields
.field private final c:[B

.field private final e:Lo/frn;


# direct methods
.method public constructor <init>(Lo/frn;[BLjava/net/InetSocketAddress;)V
    .locals 1

    .line 55
    invoke-direct {p0, p3}, Lo/fqy;-><init>(Ljava/net/InetSocketAddress;)V

    .line 56
    iput-object p1, p0, Lo/frc;->e:Lo/frn;

    .line 57
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/frc;->c:[B

    .line 58
    return-void
.end method

.method public static e([BLjava/net/InetSocketAddress;)Lo/fqy;
    .locals 7

    .line 76
    new-instance v1, Lo/fpq;

    invoke-direct {v1, p0}, Lo/fpq;-><init>([B)V

    .line 78
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Lo/fpq;->c(I)I

    move-result v2

    .line 79
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Lo/fpq;->c(I)I

    move-result v3

    .line 80
    new-instance v4, Lo/frn;

    invoke-direct {v4, v2, v3}, Lo/frn;-><init>(II)V

    .line 82
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Lo/fpq;->c(I)I

    move-result v5

    .line 83
    invoke-virtual {v1, v5}, Lo/fpq;->d(I)[B

    move-result-object v6

    .line 85
    new-instance v0, Lo/frc;

    invoke-direct {v0, v4, v6, p1}, Lo/frc;-><init>(Lo/frn;[BLjava/net/InetSocketAddress;)V

    return-object v0
.end method


# virtual methods
.method public c()Lo/fra;
    .locals 1

    .line 92
    sget-object v0, Lo/fra;->a:Lo/fra;

    return-object v0
.end method

.method public d()I
    .locals 2

    .line 98
    iget-object v0, p0, Lo/frc;->c:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x3

    return v0
.end method

.method public f()[B
    .locals 1

    .line 106
    iget-object v0, p0, Lo/frc;->c:[B

    return-object v0
.end method

.method public g()[B
    .locals 3

    .line 64
    new-instance v2, Lo/fpp;

    invoke-direct {v2}, Lo/fpp;-><init>()V

    .line 66
    iget-object v0, p0, Lo/frc;->e:Lo/frn;

    invoke-virtual {v0}, Lo/frn;->a()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 67
    iget-object v0, p0, Lo/frc;->e:Lo/frn;

    invoke-virtual {v0}, Lo/frn;->b()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 69
    iget-object v0, p0, Lo/frc;->c:[B

    array-length v0, v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 70
    iget-object v0, p0, Lo/frc;->c:[B

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 72
    invoke-virtual {v2}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 111
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    invoke-super {p0}, Lo/fqy;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    const-string v0, "\t\tServer Version: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frc;->e:Lo/frn;

    invoke-virtual {v1}, Lo/frn;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frc;->e:Lo/frn;

    invoke-virtual {v1}, Lo/frn;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    const-string v0, "\t\tCookie Length: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frc;->c:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    const-string v0, "\t\tCookie: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frc;->c:[B

    invoke-static {v1}, Lo/fsp;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
