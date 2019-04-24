.class public Lo/fox;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fow;


# instance fields
.field private final a:Ljava/security/Principal;

.field private final b:Ljava/net/InetSocketAddress;


# direct methods
.method public constructor <init>(Ljava/net/InetAddress;I)V
    .locals 2

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    if-nez p1, :cond_0

    .line 57
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "missing peer inet address!"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 59
    :cond_0
    new-instance v0, Ljava/net/InetSocketAddress;

    invoke-direct {v0, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    iput-object v0, p0, Lo/fox;->b:Ljava/net/InetSocketAddress;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fox;->a:Ljava/security/Principal;

    .line 61
    return-void
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;Ljava/security/Principal;)V
    .locals 2

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    if-nez p1, :cond_0

    .line 72
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "missing peer socket address!"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 74
    :cond_0
    iput-object p1, p0, Lo/fox;->b:Ljava/net/InetSocketAddress;

    .line 75
    iput-object p2, p0, Lo/fox;->a:Ljava/security/Principal;

    .line 76
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 80
    const/4 v0, 0x0

    return-object v0
.end method

.method public b()Ljava/security/Principal;
    .locals 1

    .line 95
    iget-object v0, p0, Lo/fox;->a:Ljava/security/Principal;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 90
    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/net/InetSocketAddress;
    .locals 1

    .line 100
    iget-object v0, p0, Lo/fox;->b:Ljava/net/InetSocketAddress;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 114
    if-ne p0, p1, :cond_0

    .line 115
    const/4 v0, 0x1

    return v0

    .line 117
    :cond_0
    if-nez p1, :cond_1

    .line 118
    const/4 v0, 0x0

    return v0

    .line 120
    :cond_1
    instance-of v0, p1, Lo/fox;

    if-nez v0, :cond_2

    .line 121
    const/4 v0, 0x0

    return v0

    .line 123
    :cond_2
    move-object v2, p1

    check-cast v2, Lo/fox;

    .line 124
    iget-object v0, p0, Lo/fox;->b:Ljava/net/InetSocketAddress;

    invoke-virtual {v2}, Lo/fox;->e()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/net/InetSocketAddress;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 125
    const/4 v0, 0x0

    return v0

    .line 127
    :cond_3
    iget-object v0, p0, Lo/fox;->a:Ljava/security/Principal;

    if-eqz v0, :cond_4

    .line 128
    iget-object v0, p0, Lo/fox;->a:Ljava/security/Principal;

    invoke-virtual {v2}, Lo/fox;->b()Ljava/security/Principal;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/security/Principal;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 129
    const/4 v0, 0x0

    return v0

    .line 132
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 105
    iget-object v0, p0, Lo/fox;->b:Ljava/net/InetSocketAddress;

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->hashCode()I

    move-result v1

    .line 106
    iget-object v0, p0, Lo/fox;->a:Ljava/security/Principal;

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lo/fox;->a:Ljava/security/Principal;

    invoke-interface {v0}, Ljava/security/Principal;->hashCode()I

    move-result v1

    .line 109
    :cond_0
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 137
    const-string v0, "IP(%s:%d)"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/fox;->b:Ljava/net/InetSocketAddress;

    invoke-virtual {v2}, Ljava/net/InetSocketAddress;->getHostString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fox;->b:Ljava/net/InetSocketAddress;

    invoke-virtual {v2}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
