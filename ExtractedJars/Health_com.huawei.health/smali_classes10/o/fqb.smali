.class public final Lo/fqb;
.super Lo/fpy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fqb$b;,
        Lo/fqb$c;
    }
.end annotation


# instance fields
.field private final a:Lo/fqb$c;

.field private final e:Lo/fqb$b;


# direct methods
.method public constructor <init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V
    .locals 0

    .line 63
    invoke-direct {p0, p3}, Lo/fpy;-><init>(Ljava/net/InetSocketAddress;)V

    .line 64
    iput-object p1, p0, Lo/fqb;->a:Lo/fqb$c;

    .line 65
    iput-object p2, p0, Lo/fqb;->e:Lo/fqb$b;

    .line 66
    return-void
.end method

.method public static b([BLjava/net/InetSocketAddress;)Lo/fqb;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 206
    new-instance v5, Lo/fpq;

    invoke-direct {v5, p0}, Lo/fpq;-><init>([B)V

    .line 207
    invoke-virtual {v5}, Lo/fpq;->a()B

    move-result v6

    .line 208
    invoke-virtual {v5}, Lo/fpq;->a()B

    move-result v7

    .line 209
    invoke-static {v6}, Lo/fqb$c;->c(I)Lo/fqb$c;

    move-result-object v8

    .line 210
    invoke-static {v7}, Lo/fqb$b;->d(I)Lo/fqb$b;

    move-result-object v9

    .line 211
    if-nez v8, :cond_0

    .line 212
    new-instance v0, Lo/fqx;

    const-string v1, "Unknown alert level code [%d]"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->r:Lo/fqb$b;

    invoke-direct {v2, v3, v4, p1}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 215
    :cond_0
    if-nez v9, :cond_1

    .line 216
    new-instance v0, Lo/fqx;

    const-string v1, "Unknown alert description code [%d]"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->r:Lo/fqb$b;

    invoke-direct {v2, v3, v4, p1}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 220
    :cond_1
    new-instance v0, Lo/fqb;

    invoke-direct {v0, v8, v9, p1}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    return-object v0
.end method


# virtual methods
.method public a()[B
    .locals 3

    .line 197
    new-instance v2, Lo/fpp;

    invoke-direct {v2}, Lo/fpp;-><init>()V

    .line 199
    iget-object v0, p0, Lo/fqb;->a:Lo/fqb$c;

    invoke-virtual {v0}, Lo/fqb$c;->d()B

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 200
    iget-object v0, p0, Lo/fqb;->e:Lo/fqb$b;

    invoke-virtual {v0}, Lo/fqb$b;->b()B

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 202
    invoke-virtual {v2}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method public b()Lo/fqn;
    .locals 1

    .line 177
    sget-object v0, Lo/fqn;->e:Lo/fqn;

    return-object v0
.end method

.method public c()Lo/fqb$b;
    .locals 1

    .line 229
    iget-object v0, p0, Lo/fqb;->e:Lo/fqb$b;

    return-object v0
.end method

.method public d()Lo/fqb$c;
    .locals 1

    .line 225
    iget-object v0, p0, Lo/fqb;->a:Lo/fqb$c;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 182
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    const-string v0, "\tAlert Protocol"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    const-string v0, "\tLevel: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fqb;->a:Lo/fqb$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    const-string v0, "\tDescription: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fqb;->e:Lo/fqb$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
