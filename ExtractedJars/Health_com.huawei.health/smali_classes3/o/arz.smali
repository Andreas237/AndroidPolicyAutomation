.class public Lo/arz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/bqu;

.field private c:Lo/ars;

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/bqu;Lo/ars;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lo/arz;->d:Landroid/content/Context;

    .line 51
    iput-object p2, p0, Lo/arz;->a:Lo/bqu;

    .line 52
    iput-object p3, p0, Lo/arz;->c:Lo/ars;

    .line 53
    return-void
.end method

.method private a()I
    .locals 3

    .line 216
    new-instance v1, Lo/arr;

    iget-object v0, p0, Lo/arz;->a:Lo/bqu;

    invoke-direct {v1, v0}, Lo/arr;-><init>(Lo/bqu;)V

    .line 218
    invoke-virtual {v1}, Lo/arr;->e()I

    move-result v2

    .line 220
    return v2
.end method

.method static synthetic a(Lo/arz;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/arz;->d()V

    return-void
.end method

.method static synthetic a(Lo/arz;I)Z
    .locals 1

    .line 24
    invoke-direct {p0, p1}, Lo/arz;->d(I)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lo/arz;)I
    .locals 1

    .line 24
    invoke-direct {p0}, Lo/arz;->a()I

    move-result v0

    return v0
.end method

.method private b(I)Z
    .locals 1

    .line 180
    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 183
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 185
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lo/arz;I)Z
    .locals 1

    .line 24
    invoke-direct {p0, p1}, Lo/arz;->b(I)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lo/arz;)Lo/bqu;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/arz;->a:Lo/bqu;

    return-object v0
.end method

.method private c(II)V
    .locals 4

    .line 196
    const-string v0, "ComplainUpload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "complain upload failed. login error, rc="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", rtc="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    move v3, p1

    .line 199
    if-nez v3, :cond_0

    .line 201
    move v3, p2

    .line 203
    :cond_0
    iget-object v0, p0, Lo/arz;->a:Lo/bqu;

    if-eqz v0, :cond_1

    .line 205
    iget-object v0, p0, Lo/arz;->a:Lo/bqu;

    invoke-interface {v0, v3}, Lo/bqu;->c(I)V

    .line 207
    :cond_1
    return-void
.end method

.method static synthetic d(Lo/arz;)Lo/ars;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/arz;->c:Lo/ars;

    return-object v0
.end method

.method private d()V
    .locals 3

    .line 90
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/arz$4;

    invoke-direct {v1, p0}, Lo/arz$4;-><init>(Lo/arz;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    move-result-object v2

    .line 151
    iget-object v0, p0, Lo/arz;->a:Lo/bqu;

    if-eqz v0, :cond_0

    .line 153
    iget-object v0, p0, Lo/arz;->a:Lo/bqu;

    invoke-interface {v0, v2}, Lo/bqu;->b(Lo/bqy;)V

    .line 155
    :cond_0
    return-void
.end method

.method private d(I)Z
    .locals 1

    .line 165
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 167
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 169
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic e(Lo/arz;)Landroid/content/Context;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/arz;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lo/arz;II)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2}, Lo/arz;->c(II)V

    return-void
.end method

.method static synthetic e(Lo/arz;Lo/bra;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lo/arz;->e(Lo/bra;)V

    return-void
.end method

.method private e(Lo/bra;)V
    .locals 4

    .line 228
    new-instance v1, Lo/bqt;

    invoke-direct {v1}, Lo/bqt;-><init>()V

    .line 229
    invoke-virtual {v1, p1}, Lo/bqt;->a(Lo/bra;)V

    .line 230
    const/16 v0, 0xa

    invoke-virtual {v1, v0}, Lo/bqt;->c(I)V

    .line 232
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->g()Ljava/lang/String;

    move-result-object v2

    .line 233
    iget-object v0, p0, Lo/arz;->c:Lo/ars;

    invoke-virtual {v0}, Lo/ars;->b()Lcom/huawei/health/sns/logic/complain/ComplainRequest;

    move-result-object v3

    .line 234
    invoke-virtual {v3, v2}, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->setFilePath(Ljava/lang/String;)V

    .line 235
    sget-object v0, Lo/ayw;->e:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->setUrl(Ljava/lang/String;)V

    .line 236
    invoke-virtual {v1, v3}, Lo/bqt;->c(Lo/bqb;)V

    .line 238
    iget-object v0, p0, Lo/arz;->a:Lo/bqu;

    invoke-virtual {v1, v0}, Lo/bqt;->b(Lo/bqu;)V

    .line 239
    invoke-virtual {v1}, Lo/bqt;->c()V

    .line 240
    return-void
.end method


# virtual methods
.method public e()V
    .locals 1

    .line 64
    iget-object v0, p0, Lo/arz;->a:Lo/bqu;

    if-eqz v0, :cond_0

    .line 66
    iget-object v0, p0, Lo/arz;->a:Lo/bqu;

    invoke-interface {v0}, Lo/bqu;->d()V

    .line 69
    :cond_0
    new-instance v0, Lo/arz$1;

    invoke-direct {v0, p0}, Lo/arz$1;-><init>(Lo/arz;)V

    invoke-static {v0}, Lo/aty;->e(Lo/aud;)V

    .line 83
    return-void
.end method
