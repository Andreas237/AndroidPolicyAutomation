.class public final Lo/frk;
.super Lo/fqk;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/net/InetSocketAddress;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lo/fqk;-><init>(Ljava/net/InetSocketAddress;)V

    .line 32
    return-void
.end method

.method public static b([BLjava/net/InetSocketAddress;)Lo/fqy;
    .locals 1

    .line 44
    new-instance v0, Lo/frk;

    invoke-direct {v0, p1}, Lo/frk;-><init>(Ljava/net/InetSocketAddress;)V

    return-object v0
.end method


# virtual methods
.method public d()I
    .locals 1

    .line 38
    const/4 v0, 0x0

    return v0
.end method

.method public g()[B
    .locals 1

    .line 49
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method
