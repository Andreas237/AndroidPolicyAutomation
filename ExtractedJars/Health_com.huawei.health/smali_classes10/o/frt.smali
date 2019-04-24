.class public Lo/frt;
.super Lo/frq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/frt$3;
    }
.end annotation


# static fields
.field private static final a:Lo/fty;


# instance fields
.field private k:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 50
    const-class v0, Lo/frt;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/frt;->a:Lo/fty;

    return-void
.end method

.method public constructor <init>(ILo/fqr;Lo/frm;Lo/fsb;Lo/fpz;I)V
    .locals 0

    .line 61
    invoke-direct/range {p0 .. p6}, Lo/frq;-><init>(ILo/fqr;Lo/frm;Lo/fsb;Lo/fpz;I)V

    .line 62
    return-void
.end method

.method private d(Lo/fql;)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 132
    invoke-virtual {p0}, Lo/frt;->h()V

    .line 133
    invoke-virtual {p1}, Lo/fql;->m()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lo/frt;->w:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->b()Lo/fsf;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 134
    new-instance v0, Lo/fqx;

    const-string v1, "Client wants to change cipher suite in resumed session"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->o:Lo/fqb$b;

    invoke-virtual {p1}, Lo/fql;->e()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 140
    :cond_0
    invoke-virtual {p1}, Lo/fql;->n()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lo/frt;->w:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->c()Lo/fqh;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 141
    new-instance v0, Lo/fqx;

    const-string v1, "Client wants to change compression method in resumed session"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->o:Lo/fqb$b;

    invoke-virtual {p1}, Lo/fql;->e()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 148
    :cond_1
    new-instance v8, Lo/fqp;

    invoke-virtual {p0}, Lo/frt;->k()Lo/fqr;

    move-result-object v0

    invoke-direct {v8, v0}, Lo/fqp;-><init>(Lo/fqr;)V

    .line 149
    iget-object v0, p0, Lo/frt;->D:Ljava/security/MessageDigest;

    invoke-virtual {p1}, Lo/fql;->z()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 151
    invoke-virtual {p1}, Lo/fql;->f()Lo/fro;

    move-result-object v0

    iput-object v0, p0, Lo/frt;->q:Lo/fro;

    .line 152
    new-instance v0, Lo/fro;

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    invoke-direct {v0, v1}, Lo/fro;-><init>(Ljava/security/SecureRandom;)V

    iput-object v0, p0, Lo/frt;->v:Lo/fro;

    .line 154
    new-instance v0, Lo/frs;

    invoke-virtual {p1}, Lo/fql;->i()Lo/frn;

    move-result-object v1

    iget-object v2, p0, Lo/frt;->v:Lo/fro;

    iget-object v3, p0, Lo/frt;->w:Lo/fqr;

    invoke-virtual {v3}, Lo/fqr;->e()Lo/fsa;

    move-result-object v3

    iget-object v4, p0, Lo/frt;->w:Lo/fqr;

    invoke-virtual {v4}, Lo/fqr;->b()Lo/fsf;

    move-result-object v4

    iget-object v5, p0, Lo/frt;->w:Lo/fqr;

    invoke-virtual {v5}, Lo/fqr;->c()Lo/fqh;

    move-result-object v5

    invoke-virtual {p1}, Lo/fql;->e()Ljava/net/InetSocketAddress;

    move-result-object v7

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v7}, Lo/frs;-><init>(Lo/frn;Lo/fro;Lo/fsa;Lo/fsf;Lo/fqh;Lo/frb;Ljava/net/InetSocketAddress;)V

    move-object v9, v0

    .line 156
    invoke-virtual {p0, v9}, Lo/frt;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 157
    iget-object v0, p0, Lo/frt;->D:Ljava/security/MessageDigest;

    invoke-virtual {v9}, Lo/frs;->a()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 159
    iget-object v0, p0, Lo/frt;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->p()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/frt;->d([B)V

    .line 161
    new-instance v10, Lo/fqg;

    invoke-virtual {p1}, Lo/fql;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-direct {v10, v0}, Lo/fqg;-><init>(Ljava/net/InetSocketAddress;)V

    .line 162
    invoke-virtual {p0, v10}, Lo/frt;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 163
    invoke-virtual {p0}, Lo/frt;->b()V

    .line 165
    const/4 v11, 0x0

    .line 167
    :try_start_0
    iget-object v0, p0, Lo/frt;->D:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    goto :goto_0

    .line 168
    :catch_0
    move-exception v12

    .line 169
    new-instance v0, Lo/fqx;

    const-string v1, "Cannot create FINISHED message hash"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->y:Lo/fqb$b;

    invoke-virtual {p1}, Lo/fql;->e()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 177
    :goto_0
    iget-object v0, p0, Lo/frt;->D:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    iput-object v0, p0, Lo/frt;->k:[B

    .line 178
    new-instance v12, Lo/fqw;

    iget-object v0, p0, Lo/frt;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->p()[B

    move-result-object v0

    iget-object v1, p0, Lo/frt;->k:[B

    invoke-virtual {p1}, Lo/fql;->e()Ljava/net/InetSocketAddress;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v12, v0, v3, v1, v2}, Lo/fqw;-><init>([BZ[BLjava/net/InetSocketAddress;)V

    .line 179
    invoke-virtual {p0, v12}, Lo/frt;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 181
    invoke-virtual {v12}, Lo/fqw;->a()[B

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 182
    invoke-virtual {v11}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    iput-object v0, p0, Lo/frt;->k:[B

    .line 184
    iget-object v0, p0, Lo/frt;->y:Lo/frm;

    invoke-interface {v0, v8}, Lo/frm;->d(Lo/fqp;)V

    .line 186
    return-void
.end method

.method private d(Lo/fqw;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 198
    iget-object v0, p0, Lo/frt;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->p()[B

    move-result-object v0

    iget-object v1, p0, Lo/frt;->k:[B

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2, v1}, Lo/fqw;->a([BZ[B)V

    .line 199
    invoke-virtual {p0}, Lo/frt;->f()V

    .line 200
    invoke-virtual {p0}, Lo/frt;->l()V

    .line 201
    return-void
.end method


# virtual methods
.method protected declared-synchronized b(Lo/fqm;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;,
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    monitor-enter p0

    .line 71
    :try_start_0
    sget-object v0, Lo/frt;->a:Lo/fty;

    invoke-interface {v0}, Lo/fty;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    const-string v0, "Processing {} message from peer [{}]"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    sget-object v0, Lo/frt;->a:Lo/fty;

    invoke-interface {v0}, Lo/fty;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    const-string v0, ":"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    :cond_0
    sget-object v0, Lo/frt;->a:Lo/fty;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lo/fqm;->b()Lo/fqn;

    move-result-object v2

    invoke-interface {p1}, Lo/fqm;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    :cond_1
    sget-object v0, Lo/frt$3;->e:[I

    invoke-interface {p1}, Lo/fqm;->b()Lo/fqn;

    move-result-object v1

    invoke-virtual {v1}, Lo/fqn;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 82
    :pswitch_0
    goto/16 :goto_3

    .line 85
    :pswitch_1
    invoke-virtual {p0}, Lo/frt;->d()V

    .line 86
    sget-object v0, Lo/frt;->a:Lo/fty;

    const-string v1, "Processed {} message from peer [{}]"

    invoke-interface {p1}, Lo/fqm;->b()Lo/fqn;

    move-result-object v2

    invoke-interface {p1}, Lo/fqm;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    goto/16 :goto_3

    .line 91
    :pswitch_2
    iget-object v0, p0, Lo/frt;->y:Lo/frm;

    invoke-interface {v0}, Lo/frm;->c()V

    .line 92
    move-object v6, p1

    check-cast v6, Lo/fqy;

    .line 93
    sget-object v0, Lo/frt$3;->a:[I

    invoke-virtual {v6}, Lo/fqy;->c()Lo/fra;

    move-result-object v1

    invoke-virtual {v1}, Lo/fra;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 95
    :sswitch_0
    move-object v0, v6

    check-cast v0, Lo/fql;

    invoke-direct {p0, v0}, Lo/frt;->d(Lo/fql;)V

    .line 96
    invoke-virtual {p0}, Lo/frt;->n()V

    .line 97
    goto :goto_1

    .line 100
    :sswitch_1
    move-object v0, v6

    check-cast v0, Lo/fqw;

    invoke-direct {p0, v0}, Lo/frt;->d(Lo/fqw;)V

    .line 101
    goto :goto_1

    .line 104
    :goto_0
    new-instance v0, Lo/fqx;

    const-string v1, "Received unexpected handshake message [%s] from peer %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Lo/fqy;->c()Lo/fra;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v6}, Lo/fqy;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->a:Lo/fqb$b;

    invoke-virtual {v6}, Lo/fqy;->e()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 109
    :goto_1
    invoke-virtual {p0}, Lo/frt;->g()V

    .line 110
    sget-object v0, Lo/frt;->a:Lo/fty;

    const-string v1, "Processed {} message with sequence no [{}] from peer [{}]"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Lo/fqy;->c()Lo/fra;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v6}, Lo/fqy;->s()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v6}, Lo/fqy;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    goto :goto_3

    .line 115
    :goto_2
    new-instance v0, Lo/fqx;

    const-string v1, "Received unexpected message [%s] from peer %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1}, Lo/fqm;->b()Lo/fqn;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {p1}, Lo/fqm;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->g:Lo/fqb$b;

    invoke-interface {p1}, Lo/fqm;->e()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    :goto_3
    monitor-exit p0

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
