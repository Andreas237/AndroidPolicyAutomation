.class public final Lo/azi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/azg;


# instance fields
.field private a:Lo/azo;

.field private b:Lo/azb;

.field private c:Lorg/jivesoftware/smack/StanzaListener;

.field private d:Lo/azp;

.field private e:Lo/azf;

.field private f:Lo/azq;

.field private final i:Lo/azt;


# direct methods
.method public constructor <init>(Lo/azf;)V
    .locals 3

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/azi;->b:Lo/azb;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/azi;->d:Lo/azp;

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lo/azi;->a:Lo/azo;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lo/azi;->e:Lo/azf;

    .line 59
    new-instance v0, Lo/azi$3;

    invoke-direct {v0, p0}, Lo/azi$3;-><init>(Lo/azi;)V

    iput-object v0, p0, Lo/azi;->c:Lorg/jivesoftware/smack/StanzaListener;

    .line 82
    new-instance v0, Lo/azi$2;

    invoke-direct {v0, p0}, Lo/azi$2;-><init>(Lo/azi;)V

    iput-object v0, p0, Lo/azi;->f:Lo/azq;

    .line 119
    new-instance v0, Lo/azi$5;

    invoke-direct {v0, p0}, Lo/azi$5;-><init>(Lo/azi;)V

    iput-object v0, p0, Lo/azi;->i:Lo/azt;

    .line 209
    iput-object p1, p0, Lo/azi;->e:Lo/azf;

    .line 210
    new-instance v0, Lo/azp;

    iget-object v1, p0, Lo/azi;->c:Lorg/jivesoftware/smack/StanzaListener;

    iget-object v2, p0, Lo/azi;->f:Lo/azq;

    invoke-direct {v0, v1, v2}, Lo/azp;-><init>(Lorg/jivesoftware/smack/StanzaListener;Lo/azq;)V

    iput-object v0, p0, Lo/azi;->d:Lo/azp;

    .line 211
    new-instance v0, Lo/azb;

    invoke-direct {v0, p0}, Lo/azb;-><init>(Lo/azg;)V

    iput-object v0, p0, Lo/azi;->b:Lo/azb;

    .line 212
    new-instance v0, Lo/azo;

    iget-object v1, p0, Lo/azi;->i:Lo/azt;

    invoke-direct {v0, v1}, Lo/azo;-><init>(Lo/azt;)V

    iput-object v0, p0, Lo/azi;->a:Lo/azo;

    .line 213
    invoke-static {}, Lo/azz;->e()Lo/azz;

    move-result-object v0

    iget-object v1, p0, Lo/azi;->i:Lo/azt;

    invoke-virtual {v0, v1}, Lo/azz;->e(Lo/azt;)V

    .line 215
    return-void
.end method

.method static synthetic a(Lo/azi;)Lo/azb;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/azi;->b:Lo/azb;

    return-object v0
.end method

.method static synthetic b(Lo/azi;)Lo/azf;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/azi;->e:Lo/azf;

    return-object v0
.end method

.method private b(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 2

    .line 232
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 234
    :cond_0
    const-string v0, "MessageTrace"

    const-string v1, "Invalid Packet."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    return-void

    .line 237
    :cond_1
    iget-object v0, p0, Lo/azi;->a:Lo/azo;

    invoke-virtual {v0, p1}, Lo/azo;->e(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 238
    return-void
.end method

.method static synthetic c(Lo/azi;)Lo/azp;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/azi;->d:Lo/azp;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 1

    .line 198
    iget-object v0, p0, Lo/azi;->e:Lo/azf;

    if-eqz v0, :cond_0

    .line 200
    iget-object v0, p0, Lo/azi;->e:Lo/azf;

    invoke-interface {v0, p1}, Lo/azf;->a(Ljava/lang/String;)V

    .line 202
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/azi;Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lo/azi;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lo/azi;Lorg/jivesoftware/smack/packet/Stanza;)Z
    .locals 1

    .line 29
    invoke-direct {p0, p1}, Lo/azi;->c(Lorg/jivesoftware/smack/packet/Stanza;)Z

    move-result v0

    return v0
.end method

.method private c(Lorg/jivesoftware/smack/packet/Stanza;)Z
    .locals 6

    .line 173
    instance-of v0, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/MCode;

    if-eqz v0, :cond_0

    .line 175
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/server/im/login/impl/packet/MCode;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/login/impl/packet/MCode;->getMcode()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/azi;->c(Ljava/lang/String;)V

    .line 176
    const/4 v0, 0x1

    return v0

    .line 178
    :cond_0
    instance-of v0, p1, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;

    if-eqz v0, :cond_1

    .line 180
    move-object v5, p1

    check-cast v5, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;

    .line 182
    invoke-static {}, Lo/ayy;->d()Lo/ayy;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->getHeartBeatInterval()I

    move-result v1

    .line 183
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->getHearBeatFailedTry()I

    move-result v2

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->getOfflineTime()I

    move-result v3

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->getMessageLength()I

    move-result v4

    .line 182
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ayy;->c(IIII)V

    .line 185
    new-instance v0, Lo/bba;

    invoke-direct {v0}, Lo/bba;-><init>()V

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->getLoginInterval()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bba;->a(I)V

    .line 186
    const/4 v0, 0x1

    return v0

    .line 188
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic e(Lo/azi;)Lo/azo;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/azi;->a:Lo/azo;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 222
    iget-object v0, p0, Lo/azi;->d:Lo/azp;

    invoke-virtual {v0}, Lo/azp;->c()V

    .line 223
    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 262
    iget-object v0, p0, Lo/azi;->d:Lo/azp;

    invoke-virtual {v0, p1}, Lo/azp;->c(Z)V

    .line 263
    iget-object v0, p0, Lo/azi;->a:Lo/azo;

    invoke-virtual {v0, p1}, Lo/azo;->d(Z)V

    .line 264
    iget-object v0, p0, Lo/azi;->b:Lo/azb;

    invoke-virtual {v0, p1}, Lo/azb;->b(Z)V

    .line 265
    return-void
.end method

.method public b(Lo/azm;)V
    .locals 1

    .line 284
    iget-object v0, p0, Lo/azi;->d:Lo/azp;

    invoke-virtual {v0, p1}, Lo/azp;->d(Lo/azm;)V

    .line 285
    return-void
.end method

.method public b(Lorg/jivesoftware/smack/packet/Stanza;J)V
    .locals 1

    .line 320
    iget-object v0, p0, Lo/azi;->b:Lo/azb;

    invoke-virtual {v0, p2, p3}, Lo/azb;->c(J)V

    .line 322
    invoke-virtual {p0, p1}, Lo/azi;->e(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 323
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 304
    iget-object v0, p0, Lo/azi;->e:Lo/azf;

    if-eqz v0, :cond_0

    .line 306
    iget-object v0, p0, Lo/azi;->e:Lo/azf;

    invoke-interface {v0}, Lo/azf;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 308
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public c(Lo/bab;)V
    .locals 1

    .line 274
    iget-object v0, p0, Lo/azi;->b:Lo/azb;

    invoke-virtual {v0, p1}, Lo/azb;->b(Lo/bab;)V

    .line 275
    return-void
.end method

.method public e(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 2

    .line 247
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 249
    :cond_0
    const-string v0, "MessageTrace"

    const-string v1, "Invalid Packet."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    return-void

    .line 252
    :cond_1
    iget-object v0, p0, Lo/azi;->a:Lo/azo;

    invoke-virtual {v0, p1}, Lo/azo;->b(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 253
    return-void
.end method

.method public e(Lorg/jivesoftware/smack/packet/Stanza;Z)V
    .locals 0

    .line 291
    if-eqz p2, :cond_0

    .line 293
    invoke-virtual {p0, p1}, Lo/azi;->e(Lorg/jivesoftware/smack/packet/Stanza;)V

    goto :goto_0

    .line 297
    :cond_0
    invoke-direct {p0, p1}, Lo/azi;->b(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 299
    :goto_0
    return-void
.end method
