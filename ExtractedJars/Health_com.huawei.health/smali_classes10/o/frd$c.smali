.class Lo/frd$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/frd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic b:Lo/frd;

.field private c:Ljava/util/SortedSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/SortedSet<Lo/frl;>;"
        }
    .end annotation
.end field

.field private e:Lo/fqg;


# direct methods
.method constructor <init>(Lo/frd;)V
    .locals 2

    .line 249
    iput-object p1, p0, Lo/frd$c;->b:Lo/frd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 251
    const/4 v0, 0x0

    iput-object v0, p0, Lo/frd$c;->e:Lo/fqg;

    .line 253
    new-instance v0, Ljava/util/TreeSet;

    new-instance v1, Lo/frd$c$1;

    invoke-direct {v1, p0}, Lo/frd$c$1;-><init>(Lo/frd$c;)V

    invoke-direct {v0, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    iput-object v0, p0, Lo/frd$c;->c:Ljava/util/SortedSet;

    return-void
.end method


# virtual methods
.method b(Lo/frl;)Lo/fqm;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Lo/fqx;
        }
    .end annotation

    .line 330
    invoke-virtual {p1}, Lo/frl;->b()I

    move-result v5

    .line 331
    iget-object v0, p0, Lo/frd$c;->b:Lo/frd;

    iget-object v0, v0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->h()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 333
    invoke-static {}, Lo/frd;->o()Lo/fty;

    move-result-object v0

    const-string v1, "Discarding message from peer [{}] from past epoch [{}] < current epoch [{}]"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/frd$c;->b:Lo/frd;

    invoke-virtual {v3}, Lo/frd;->i()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/frd$c;->b:Lo/frd;

    iget-object v3, v3, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v3}, Lo/fqr;->h()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 336
    const/4 v0, 0x0

    return-object v0

    .line 337
    :cond_0
    iget-object v0, p0, Lo/frd$c;->b:Lo/frd;

    iget-object v0, v0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->h()I

    move-result v0

    if-ne v5, v0, :cond_4

    .line 338
    invoke-virtual {p1}, Lo/frl;->h()Lo/fqm;

    move-result-object v6

    .line 339
    sget-object v0, Lo/frd$1;->e:[I

    invoke-interface {v6}, Lo/fqm;->b()Lo/fqn;

    move-result-object v1

    invoke-virtual {v1}, Lo/fqn;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 341
    :pswitch_0
    return-object v6

    .line 354
    :pswitch_1
    iget-object v0, p0, Lo/frd$c;->b:Lo/frd;

    invoke-virtual {v0}, Lo/frd;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 355
    return-object v6

    .line 358
    :cond_1
    invoke-static {}, Lo/frd;->o()Lo/fty;

    move-result-object v0

    const-string v1, "Change Cipher Spec is not expected and therefore kept for later processing!"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 359
    move-object v0, v6

    check-cast v0, Lo/fqg;

    iput-object v0, p0, Lo/frd$c;->e:Lo/fqg;

    .line 360
    const/4 v0, 0x0

    return-object v0

    .line 363
    :pswitch_2
    move-object v7, v6

    check-cast v7, Lo/fqy;

    .line 364
    invoke-virtual {v7}, Lo/fqy;->s()I

    move-result v8

    .line 365
    iget-object v0, p0, Lo/frd$c;->b:Lo/frd;

    invoke-static {v0}, Lo/frd;->b(Lo/frd;)I

    move-result v0

    if-ne v8, v0, :cond_2

    .line 366
    return-object v7

    .line 367
    :cond_2
    iget-object v0, p0, Lo/frd$c;->b:Lo/frd;

    invoke-static {v0}, Lo/frd;->b(Lo/frd;)I

    move-result v0

    if-le v8, v0, :cond_3

    .line 368
    invoke-static {}, Lo/frd;->o()Lo/fty;

    move-result-object v0

    const-string v1, "Queued newer message from current epoch, message_seq [{}] > next_receive_seq [{}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/frd$c;->b:Lo/frd;

    invoke-static {v3}, Lo/frd;->b(Lo/frd;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    iget-object v0, p0, Lo/frd$c;->c:Ljava/util/SortedSet;

    invoke-interface {v0, p1}, Ljava/util/SortedSet;->add(Ljava/lang/Object;)Z

    .line 372
    const/4 v0, 0x0

    return-object v0

    .line 374
    :cond_3
    invoke-static {}, Lo/frd;->o()Lo/fty;

    move-result-object v0

    const-string v1, "Discarding old message, message_seq [{}] < next_receive_seq [{}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/frd$c;->b:Lo/frd;

    invoke-static {v3}, Lo/frd;->b(Lo/frd;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    const/4 v0, 0x0

    return-object v0

    .line 380
    :goto_0
    invoke-static {}, Lo/frd;->o()Lo/fty;

    move-result-object v0

    const-string v1, "Cannot process message of type [{}], discarding..."

    invoke-interface {v6}, Lo/fqm;->b()Lo/fqn;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 382
    const/4 v0, 0x0

    return-object v0

    .line 386
    :cond_4
    iget-object v0, p0, Lo/frd$c;->c:Ljava/util/SortedSet;

    invoke-interface {v0, p1}, Ljava/util/SortedSet;->add(Ljava/lang/Object;)Z

    .line 387
    invoke-static {}, Lo/frd;->o()Lo/fty;

    move-result-object v0

    const-string v1, "Queueing HANDSHAKE message from future epoch [{}] > current epoch [{}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/frd$c;->b:Lo/frd;

    invoke-virtual {v3}, Lo/frd;->k()Lo/fqr;

    move-result-object v3

    invoke-virtual {v3}, Lo/fqr;->h()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method c()Lo/fqm;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Lo/fqx;
        }
    .end annotation

    .line 288
    const/4 v2, 0x0

    .line 290
    iget-object v0, p0, Lo/frd$c;->b:Lo/frd;

    invoke-virtual {v0}, Lo/frd;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/frd$c;->e:Lo/fqg;

    if-eqz v0, :cond_0

    .line 291
    iget-object v2, p0, Lo/frd$c;->e:Lo/fqg;

    .line 292
    const/4 v0, 0x0

    iput-object v0, p0, Lo/frd$c;->e:Lo/fqg;

    goto :goto_1

    .line 295
    :cond_0
    iget-object v0, p0, Lo/frd$c;->c:Ljava/util/SortedSet;

    invoke-interface {v0}, Ljava/util/SortedSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/frl;

    .line 296
    invoke-virtual {v4}, Lo/frl;->b()I

    move-result v0

    iget-object v1, p0, Lo/frd$c;->b:Lo/frd;

    iget-object v1, v1, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->h()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 297
    iget-object v0, p0, Lo/frd$c;->b:Lo/frd;

    iget-object v0, v0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->f()Lo/fqo;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/frl;->b(Lo/fqo;)Lo/fqm;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fqy;

    .line 298
    invoke-virtual {v5}, Lo/fqy;->s()I

    move-result v0

    iget-object v1, p0, Lo/frd$c;->b:Lo/frd;

    invoke-static {v1}, Lo/frd;->b(Lo/frd;)I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 299
    move-object v2, v5

    .line 300
    iget-object v0, p0, Lo/frd$c;->c:Ljava/util/SortedSet;

    invoke-interface {v0, v4}, Ljava/util/SortedSet;->remove(Ljava/lang/Object;)Z

    .line 301
    goto :goto_1

    .line 304
    :cond_1
    goto :goto_0

    .line 307
    :cond_2
    :goto_1
    return-object v2
.end method
