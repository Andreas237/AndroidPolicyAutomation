.class public Lo/frp;
.super Lo/fqi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/frp$5;
    }
.end annotation


# static fields
.field private static final E:Lo/fty;


# instance fields
.field private H:Z

.field private L:Lo/fqp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 50
    const-class v0, Lo/frp;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/frp;->E:Lo/fty;

    return-void
.end method

.method public constructor <init>(Lo/fqr;Lo/frm;Lo/fsb;Lo/fpz;I)V
    .locals 2

    .line 85
    invoke-direct/range {p0 .. p5}, Lo/fqi;-><init>(Lo/fqr;Lo/frm;Lo/fsb;Lo/fpz;I)V

    .line 53
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/frp;->H:Z

    .line 86
    invoke-virtual {p1}, Lo/fqr;->e()Lo/fsa;

    move-result-object v0

    if-nez v0, :cond_0

    .line 87
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Session must contain the ID of the session to resume"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 89
    :cond_0
    invoke-virtual {p0}, Lo/frp;->n()V

    .line 90
    return-void
.end method

.method private a(Lo/fqw;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 211
    iget-object v0, p0, Lo/frp;->L:Lo/fqp;

    if-eqz v0, :cond_0

    .line 214
    return-void

    .line 216
    :cond_0
    new-instance v6, Lo/fqp;

    invoke-virtual {p0}, Lo/frp;->k()Lo/fqr;

    move-result-object v0

    invoke-direct {v6, v0}, Lo/fqp;-><init>(Lo/fqr;)V

    .line 219
    iget-object v0, p0, Lo/frp;->D:Ljava/security/MessageDigest;

    iget-object v1, p0, Lo/frp;->c:Lo/fql;

    invoke-virtual {v1}, Lo/fql;->a()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 220
    iget-object v0, p0, Lo/frp;->D:Ljava/security/MessageDigest;

    iget-object v1, p0, Lo/frp;->b:Lo/frs;

    invoke-virtual {v1}, Lo/frs;->z()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 222
    const/4 v7, 0x0

    .line 226
    :try_start_0
    iget-object v0, p0, Lo/frp;->D:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 234
    goto :goto_0

    .line 227
    :catch_0
    move-exception v8

    .line 228
    new-instance v0, Lo/fqx;

    const-string v1, "Cannot create FINISHED message hash"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->y:Lo/fqb$b;

    invoke-virtual {p1}, Lo/fqw;->e()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 235
    :goto_0
    invoke-virtual {p1}, Lo/fqw;->z()[B

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 239
    iget-object v0, p0, Lo/frp;->D:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    iput-object v0, p0, Lo/frp;->l:[B

    .line 240
    iget-object v0, p0, Lo/frp;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->p()[B

    move-result-object v0

    iget-object v1, p0, Lo/frp;->l:[B

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Lo/fqw;->a([BZ[B)V

    .line 242
    new-instance v8, Lo/fqg;

    invoke-virtual {p1}, Lo/fqw;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-direct {v8, v0}, Lo/fqg;-><init>(Ljava/net/InetSocketAddress;)V

    .line 243
    invoke-virtual {p0, v8}, Lo/frp;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 244
    invoke-virtual {p0}, Lo/frp;->b()V

    .line 246
    invoke-virtual {v7}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    iput-object v0, p0, Lo/frp;->l:[B

    .line 247
    new-instance v9, Lo/fqw;

    iget-object v0, p0, Lo/frp;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->p()[B

    move-result-object v0

    iget-boolean v1, p0, Lo/frp;->r:Z

    iget-object v2, p0, Lo/frp;->l:[B

    invoke-virtual {p1}, Lo/fqw;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-direct {v9, v0, v1, v2, v3}, Lo/fqw;-><init>([BZ[BLjava/net/InetSocketAddress;)V

    .line 248
    invoke-virtual {p0, v9}, Lo/frp;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 249
    sget-object v0, Lo/fra;->o:Lo/fra;

    invoke-virtual {v0}, Lo/fra;->c()I

    move-result v0

    iput v0, p0, Lo/frp;->t:I

    .line 251
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/fqp;->a(Z)V

    .line 254
    iput-object v6, p0, Lo/frp;->L:Lo/fqp;

    .line 255
    iget-object v0, p0, Lo/frp;->y:Lo/frm;

    invoke-interface {v0, v6}, Lo/frm;->d(Lo/fqp;)V

    .line 256
    invoke-virtual {p0}, Lo/frp;->f()V

    .line 257
    return-void
.end method


# virtual methods
.method protected declared-synchronized b(Lo/fqm;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;,
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    monitor-enter p0

    .line 96
    :try_start_0
    iget-boolean v0, p0, Lo/frp;->H:Z

    if-eqz v0, :cond_0

    .line 99
    invoke-super {p0, p1}, Lo/fqi;->b(Lo/fqm;)V

    .line 100
    monitor-exit p0

    return-void

    .line 103
    :cond_0
    iget-object v0, p0, Lo/frp;->L:Lo/fqp;

    if-eqz v0, :cond_1

    .line 106
    sget-object v0, Lo/frp;->E:Lo/fty;

    const-string v1, "Received server\'s [{}] FINISHED message again, retransmitting last flight..."

    invoke-interface {p1}, Lo/fqm;->e()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 109
    iget-object v0, p0, Lo/frp;->L:Lo/fqp;

    invoke-virtual {v0}, Lo/fqp;->a()V

    .line 110
    iget-object v0, p0, Lo/frp;->L:Lo/fqp;

    invoke-virtual {v0}, Lo/fqp;->o()V

    .line 111
    iget-object v0, p0, Lo/frp;->y:Lo/frm;

    iget-object v1, p0, Lo/frp;->L:Lo/fqp;

    invoke-interface {v0, v1}, Lo/frm;->d(Lo/fqp;)V

    .line 112
    monitor-exit p0

    return-void

    .line 117
    :cond_1
    sget-object v0, Lo/frp;->E:Lo/fty;

    invoke-interface {v0}, Lo/fty;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 118
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    const-string v0, "Processing {} message from peer [{}]"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    sget-object v0, Lo/frp;->E:Lo/fty;

    invoke-interface {v0}, Lo/fty;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 121
    const-string v0, ":"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    :cond_2
    sget-object v0, Lo/frp;->E:Lo/fty;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lo/fqm;->b()Lo/fqn;

    move-result-object v2

    invoke-interface {p1}, Lo/fqm;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    :cond_3
    sget-object v0, Lo/frp$5;->a:[I

    invoke-interface {p1}, Lo/fqm;->b()Lo/fqn;

    move-result-object v1

    invoke-virtual {v1}, Lo/fqn;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 129
    :sswitch_0
    iget-object v0, p0, Lo/frp;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->p()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/frp;->d([B)V

    .line 130
    invoke-virtual {p0}, Lo/frp;->d()V

    .line 131
    sget-object v0, Lo/frp;->E:Lo/fty;

    const-string v1, "Processed {} message from peer [{}]"

    invoke-interface {p1}, Lo/fqm;->b()Lo/fqn;

    move-result-object v2

    invoke-interface {p1}, Lo/fqm;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 133
    goto/16 :goto_3

    .line 136
    :sswitch_1
    iget-object v0, p0, Lo/frp;->y:Lo/frm;

    invoke-interface {v0}, Lo/frm;->c()V

    .line 137
    move-object v6, p1

    check-cast v6, Lo/fqy;

    .line 138
    sget-object v0, Lo/frp$5;->d:[I

    invoke-virtual {v6}, Lo/fqy;->c()Lo/fra;

    move-result-object v1

    invoke-virtual {v1}, Lo/fra;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 141
    :pswitch_0
    move-object v0, p1

    check-cast v0, Lo/frc;

    invoke-virtual {p0, v0}, Lo/frp;->b(Lo/frc;)V

    .line 142
    goto/16 :goto_1

    .line 145
    :pswitch_1
    move-object v7, p1

    check-cast v7, Lo/frs;

    .line 146
    iget-object v0, p0, Lo/frp;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->e()Lo/fsa;

    move-result-object v0

    invoke-virtual {v7}, Lo/frs;->h()Lo/fsa;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fsa;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 148
    sget-object v0, Lo/frp;->E:Lo/fty;

    const-string v1, "Server [{}] refuses to resume session [{}], performing full handshake instead..."

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v7}, Lo/frs;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/frp;->w:Lo/fqr;

    invoke-virtual {v3}, Lo/fqr;->e()Lo/fsa;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/frp;->H:Z

    .line 153
    invoke-super {p0, v7}, Lo/fqi;->a(Lo/frs;)V

    goto/16 :goto_1

    .line 154
    :cond_4
    invoke-virtual {v7}, Lo/frs;->m()Lo/fqh;

    move-result-object v0

    iget-object v1, p0, Lo/frp;->w:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->c()Lo/fqh;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fqh;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 155
    new-instance v0, Lo/fqx;

    const-string v1, "Server wants to change compression method in resumed session"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->o:Lo/fqb$b;

    invoke-virtual {v7}, Lo/frs;->e()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 161
    :cond_5
    invoke-virtual {v7}, Lo/frs;->f()Lo/fsf;

    move-result-object v0

    iget-object v1, p0, Lo/frp;->w:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->b()Lo/fsf;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fsf;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 162
    new-instance v0, Lo/fqx;

    const-string v1, "Server wants to change cipher suite in resumed session"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->o:Lo/fqb$b;

    invoke-virtual {v7}, Lo/frs;->e()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 169
    :cond_6
    iput-object v7, p0, Lo/frp;->b:Lo/frs;

    .line 170
    invoke-virtual {v7}, Lo/frs;->k()Lo/fro;

    move-result-object v0

    iput-object v0, p0, Lo/frp;->v:Lo/fro;

    .line 172
    goto :goto_1

    .line 175
    :pswitch_2
    move-object v0, v6

    check-cast v0, Lo/fqw;

    invoke-direct {p0, v0}, Lo/frp;->a(Lo/fqw;)V

    .line 176
    goto :goto_1

    .line 179
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

    .line 184
    :goto_1
    iget-object v0, p0, Lo/frp;->L:Lo/fqp;

    if-nez v0, :cond_7

    .line 187
    invoke-virtual {p0}, Lo/frp;->g()V

    .line 189
    :cond_7
    sget-object v0, Lo/frp;->E:Lo/fty;

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

    .line 191
    goto :goto_3

    .line 194
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

    .line 198
    :goto_3
    monitor-exit p0

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public e()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 261
    invoke-virtual {p0}, Lo/frp;->h()V

    .line 262
    new-instance v0, Lo/fql;

    new-instance v1, Lo/frn;

    invoke-direct {v1}, Lo/frn;-><init>()V

    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    iget-object v3, p0, Lo/frp;->w:Lo/fqr;

    iget-object v4, p0, Lo/frp;->d:Ljava/util/List;

    iget-object v5, p0, Lo/frp;->a:Ljava/util/List;

    invoke-direct/range {v0 .. v5}, Lo/fql;-><init>(Lo/frn;Ljava/security/SecureRandom;Lo/fqr;Ljava/util/List;Ljava/util/List;)V

    move-object v6, v0

    .line 265
    invoke-virtual {v6}, Lo/fql;->f()Lo/fro;

    move-result-object v0

    iput-object v0, p0, Lo/frp;->q:Lo/fro;

    .line 267
    iget-object v0, p0, Lo/frp;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->c()Lo/fqh;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/fql;->b(Lo/fqh;)V

    .line 268
    iget-object v0, p0, Lo/frp;->e:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 269
    new-instance v7, Lo/frh;

    iget-object v0, p0, Lo/frp;->e:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {v7, v0}, Lo/frh;-><init>(I)V

    .line 270
    invoke-virtual {v6, v7}, Lo/fql;->d(Lo/frf;)V

    .line 271
    sget-object v0, Lo/frp;->E:Lo/fty;

    const-string v1, "Indicating max. fragment length [{}] to server [{}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/frp;->e:Ljava/lang/Integer;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0}, Lo/frp;->i()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    :cond_0
    invoke-virtual {v6}, Lo/fql;->c()Lo/fra;

    move-result-object v0

    invoke-virtual {v0}, Lo/fra;->c()I

    move-result v0

    iput v0, p0, Lo/frp;->t:I

    .line 277
    iput-object v6, p0, Lo/frp;->c:Lo/fql;

    .line 279
    new-instance v7, Lo/fqp;

    invoke-virtual {p0}, Lo/frp;->k()Lo/fqr;

    move-result-object v0

    invoke-direct {v7, v0}, Lo/fqp;-><init>(Lo/fqr;)V

    .line 280
    invoke-virtual {p0, v6}, Lo/frp;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 282
    iget-object v0, p0, Lo/frp;->y:Lo/frm;

    invoke-interface {v0, v7}, Lo/frm;->d(Lo/fqp;)V

    .line 283
    return-void
.end method
