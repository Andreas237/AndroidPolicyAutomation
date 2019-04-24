.class public final Lo/fqg;
.super Lo/fpy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fqg$c;
    }
.end annotation


# instance fields
.field private final d:Lo/fqg$c;


# direct methods
.method public constructor <init>(Ljava/net/InetSocketAddress;)V
    .locals 1

    .line 50
    invoke-direct {p0, p1}, Lo/fpy;-><init>(Ljava/net/InetSocketAddress;)V

    .line 51
    sget-object v0, Lo/fqg$c;->c:Lo/fqg$c;

    iput-object v0, p0, Lo/fqg;->d:Lo/fqg$c;

    .line 52
    return-void
.end method

.method public static e([BLjava/net/InetSocketAddress;)Lo/fqm;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 101
    new-instance v2, Lo/fpq;

    invoke-direct {v2, p0}, Lo/fpq;-><init>([B)V

    .line 102
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Lo/fpq;->c(I)I

    move-result v3

    .line 103
    sget-object v0, Lo/fqg$c;->c:Lo/fqg$c;

    invoke-virtual {v0}, Lo/fqg$c;->b()I

    move-result v0

    if-ne v3, v0, :cond_0

    .line 104
    new-instance v0, Lo/fqg;

    invoke-direct {v0, p1}, Lo/fqg;-><init>(Ljava/net/InetSocketAddress;)V

    return-object v0

    .line 106
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown Change Cipher Spec code received: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 107
    new-instance v5, Lo/fqb;

    sget-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v1, Lo/fqb$b;->g:Lo/fqb$b;

    invoke-direct {v5, v0, v1, p1}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    .line 108
    new-instance v0, Lo/fqx;

    invoke-direct {v0, v4, v5}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0
.end method


# virtual methods
.method public a()[B
    .locals 3

    .line 94
    new-instance v2, Lo/fpp;

    invoke-direct {v2}, Lo/fpp;-><init>()V

    .line 95
    iget-object v0, p0, Lo/fqg;->d:Lo/fqg$c;

    invoke-virtual {v0}, Lo/fqg$c;->b()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 97
    invoke-virtual {v2}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method public b()Lo/fqn;
    .locals 1

    .line 78
    sget-object v0, Lo/fqn;->b:Lo/fqn;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 87
    const-string v0, "\tChange Cipher Spec Message\n"

    return-object v0
.end method
