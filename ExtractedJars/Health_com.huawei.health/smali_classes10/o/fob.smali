.class public final Lo/fob;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[B

.field private final b:I

.field private final c:[B

.field private final d:Ljava/lang/String;

.field private final e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lo/flr;[BI)V
    .locals 3

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    if-nez p1, :cond_0

    .line 52
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "URI must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 53
    :cond_0
    if-nez p2, :cond_1

    .line 54
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "OptionSet must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 55
    :cond_1
    if-nez p3, :cond_2

    .line 56
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "address must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 57
    :cond_2
    if-ltz p4, :cond_3

    const v0, 0xffff

    if-le p4, v0, :cond_4

    .line 58
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "port must be an unsigned 16 bit int"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 60
    :cond_4
    iput-object p1, p0, Lo/fob;->d:Ljava/lang/String;

    .line 61
    iput-object p3, p0, Lo/fob;->c:[B

    .line 62
    iput p4, p0, Lo/fob;->e:I

    .line 63
    mul-int/lit8 v0, p4, 0x1f

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-static {p3}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int v2, v0, v1

    .line 64
    invoke-virtual {p2}, Lo/flr;->e()I

    move-result v0

    if-lez v0, :cond_5

    .line 65
    invoke-virtual {p2}, Lo/flr;->c()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iput-object v0, p0, Lo/fob;->a:[B

    .line 66
    mul-int/lit8 v0, v2, 0x1f

    iget-object v1, p0, Lo/fob;->a:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int v2, v0, v1

    .line 68
    :cond_5
    iput v2, p0, Lo/fob;->b:I

    .line 70
    return-void
.end method

.method public static b(Ljava/lang/String;Lo/fly;)Lo/fob;
    .locals 5

    .line 128
    if-nez p1, :cond_0

    .line 129
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "response must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 130
    :cond_0
    if-nez p0, :cond_1

    .line 131
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "URI must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 133
    :cond_1
    invoke-virtual {p1}, Lo/fly;->r()Lo/fow;

    move-result-object v0

    invoke-interface {v0}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v4

    .line 134
    new-instance v0, Lo/fob;

    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v1

    invoke-virtual {v4}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v2

    invoke-virtual {v4}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v3

    invoke-direct {v0, p0, v1, v2, v3}, Lo/fob;-><init>(Ljava/lang/String;Lo/flr;[BI)V

    return-object v0
.end method

.method public static b(Lo/fma;)Lo/fob;
    .locals 6

    .line 165
    if-nez p0, :cond_0

    .line 166
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "request must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 168
    :cond_0
    invoke-virtual {p0}, Lo/fma;->r()Lo/fow;

    move-result-object v0

    invoke-interface {v0}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v5

    .line 169
    new-instance v0, Lo/fob;

    invoke-virtual {p0}, Lo/fma;->H()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lo/fma;->f()Lo/flr;

    move-result-object v2

    invoke-virtual {v5}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v3

    invoke-virtual {v5}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/fob;-><init>(Ljava/lang/String;Lo/flr;[BI)V

    return-object v0
.end method

.method public static c(Lo/fma;)Lo/fob;
    .locals 6

    .line 181
    if-nez p0, :cond_0

    .line 182
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "request must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 184
    :cond_0
    invoke-virtual {p0}, Lo/fma;->u()Lo/fow;

    move-result-object v0

    invoke-interface {v0}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v5

    .line 185
    new-instance v0, Lo/fob;

    invoke-virtual {p0}, Lo/fma;->H()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lo/fma;->f()Lo/flr;

    move-result-object v2

    invoke-virtual {v5}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v3

    invoke-virtual {v5}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/fob;-><init>(Ljava/lang/String;Lo/flr;[BI)V

    return-object v0
.end method

.method public static d(Ljava/lang/String;Lo/fly;)Lo/fob;
    .locals 5

    .line 147
    if-nez p1, :cond_0

    .line 148
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "response must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 149
    :cond_0
    if-nez p0, :cond_1

    .line 150
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "URI must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 152
    :cond_1
    invoke-virtual {p1}, Lo/fly;->u()Lo/fow;

    move-result-object v0

    invoke-interface {v0}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v4

    .line 153
    new-instance v0, Lo/fob;

    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v1

    invoke-virtual {v4}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v2

    invoke-virtual {v4}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v3

    invoke-direct {v0, p0, v1, v2, v3}, Lo/fob;-><init>(Ljava/lang/String;Lo/flr;[BI)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 74
    if-ne p0, p1, :cond_0

    .line 75
    const/4 v0, 0x1

    return v0

    .line 77
    :cond_0
    if-nez p1, :cond_1

    .line 78
    const/4 v0, 0x0

    return v0

    .line 80
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 81
    const/4 v0, 0x0

    return v0

    .line 83
    :cond_2
    move-object v2, p1

    check-cast v2, Lo/fob;

    .line 84
    iget-object v0, p0, Lo/fob;->c:[B

    iget-object v1, v2, Lo/fob;->c:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_3

    .line 85
    const/4 v0, 0x0

    return v0

    .line 87
    :cond_3
    iget-object v0, p0, Lo/fob;->a:[B

    iget-object v1, v2, Lo/fob;->a:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_4

    .line 88
    const/4 v0, 0x0

    return v0

    .line 90
    :cond_4
    iget v0, p0, Lo/fob;->e:I

    iget v1, v2, Lo/fob;->e:I

    if-eq v0, v1, :cond_5

    .line 91
    const/4 v0, 0x0

    return v0

    .line 93
    :cond_5
    iget-object v0, p0, Lo/fob;->d:Ljava/lang/String;

    if-nez v0, :cond_6

    .line 94
    iget-object v0, v2, Lo/fob;->d:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 95
    const/4 v0, 0x0

    return v0

    .line 97
    :cond_6
    iget-object v0, p0, Lo/fob;->d:Ljava/lang/String;

    iget-object v1, v2, Lo/fob;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 98
    const/4 v0, 0x0

    return v0

    .line 100
    :cond_7
    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 105
    iget v0, p0, Lo/fob;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 110
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v0, "KeyUri["

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    iget-object v0, p0, Lo/fob;->d:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    iget-object v0, p0, Lo/fob;->a:[B

    if-eqz v0, :cond_0

    .line 113
    const-string v0, "["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fob;->a:[B

    invoke-static {v1}, Lo/fli;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    :cond_0
    const-string v0, ", "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fob;->c:[B

    invoke-static {v1}, Lo/fli;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fob;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
