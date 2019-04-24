.class public final Lo/fpd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/fpf;

.field private c:Z

.field public final d:[B

.field private e:Lo/fow;


# direct methods
.method private constructor <init>([BLo/fow;Lo/fpf;Z)V
    .locals 2

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    if-nez p1, :cond_0

    .line 86
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Data must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 87
    :cond_0
    if-nez p2, :cond_1

    .line 88
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Peer\'s EndpointContext must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 90
    :cond_1
    iput-object p1, p0, Lo/fpd;->d:[B

    .line 91
    iput-object p2, p0, Lo/fpd;->e:Lo/fow;

    .line 92
    iput-object p3, p0, Lo/fpd;->a:Lo/fpf;

    .line 93
    iput-boolean p4, p0, Lo/fpd;->c:Z

    .line 95
    return-void
.end method

.method public static b([BLo/fow;Lo/fpf;Z)Lo/fpd;
    .locals 1

    .line 144
    new-instance v0, Lo/fpd;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/fpd;-><init>([BLo/fow;Lo/fpf;Z)V

    return-object v0
.end method

.method public static e([BLo/fow;Z)Lo/fpd;
    .locals 2

    .line 112
    new-instance v0, Lo/fpd;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1, p2}, Lo/fpd;-><init>([BLo/fow;Lo/fpf;Z)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 162
    iget-object v0, p0, Lo/fpd;->d:[B

    array-length v0, v0

    return v0
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .line 252
    iget-object v0, p0, Lo/fpd;->a:Lo/fpf;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 253
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 254
    new-instance p1, Ljava/lang/UnknownError;

    invoke-direct {p1}, Ljava/lang/UnknownError;-><init>()V

    .line 256
    :cond_0
    iget-object v0, p0, Lo/fpd;->a:Lo/fpf;

    invoke-interface {v0, p1}, Lo/fpf;->b(Ljava/lang/Throwable;)V

    .line 258
    :cond_1
    return-void
.end method

.method public a(Lo/fow;)V
    .locals 2

    .line 230
    iget-object v0, p0, Lo/fpd;->a:Lo/fpf;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 231
    iget-object v0, p0, Lo/fpd;->a:Lo/fpf;

    invoke-interface {v0, p1}, Lo/fpf;->b(Lo/fow;)V

    .line 233
    :cond_0
    return-void
.end method

.method public b()I
    .locals 1

    .line 180
    iget-object v0, p0, Lo/fpd;->e:Lo/fow;

    invoke-interface {v0}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    return v0
.end method

.method public c()[B
    .locals 2

    .line 153
    iget-object v0, p0, Lo/fpd;->d:[B

    iget-object v1, p0, Lo/fpd;->d:[B

    array-length v1, v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/net/InetAddress;
    .locals 1

    .line 171
    iget-object v0, p0, Lo/fpd;->e:Lo/fow;

    invoke-interface {v0}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/net/InetSocketAddress;
    .locals 1

    .line 198
    iget-object v0, p0, Lo/fpd;->e:Lo/fow;

    invoke-interface {v0}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    return-object v0
.end method

.method public g()V
    .locals 2

    .line 239
    iget-object v0, p0, Lo/fpd;->a:Lo/fpf;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 240
    iget-object v0, p0, Lo/fpd;->a:Lo/fpf;

    invoke-interface {v0}, Lo/fpf;->a()V

    .line 242
    :cond_0
    return-void
.end method

.method public h()Lo/fow;
    .locals 1

    .line 221
    iget-object v0, p0, Lo/fpd;->e:Lo/fow;

    return-object v0
.end method
