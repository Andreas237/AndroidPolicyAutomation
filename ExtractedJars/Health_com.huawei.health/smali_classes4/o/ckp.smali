.class public Lo/ckp;
.super Ljava/lang/Object;

# interfaces
.implements Lo/ckx;


# instance fields
.field private a:Lo/ckr;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Lo/ckh;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/ckh;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ckp;->b:Landroid/content/Context;

    iput-object p2, p0, Lo/ckp;->d:Lo/ckh;

    iput-object p3, p0, Lo/ckp;->c:Ljava/lang/String;

    invoke-static {}, Lo/ckz;->a()Lo/ckr;

    move-result-object v0

    iput-object v0, p0, Lo/ckp;->a:Lo/ckr;

    return-void
.end method

.method private b(Lo/ckh;)Z
    .locals 5

    invoke-virtual {p1}, Lo/ckh;->c()Lorg/json/JSONObject;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {v3, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lo/cka;->e([B)[B

    move-result-object v4

    iget-object v0, p0, Lo/ckp;->a:Lo/ckr;

    iget-object v1, p0, Lo/ckp;->c:Ljava/lang/String;

    invoke-interface {v0, v4, v1}, Lo/ckr;->c([BLjava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v4

    const-string v0, "DataSendTask"

    const-string v1, "sendData(): UnsupportedEncodingException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public run()V
    .locals 7

    const-string v0, "HiAnalytics"

    const-string v1, " begin to send event data"

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lo/ckp;->d:Lo/ckh;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lo/ckp;->d:Lo/ckh;

    invoke-direct {p0, v0}, Lo/ckp;->b(Lo/ckh;)Z

    move-result v5

    const-string v0, "HiAnalytics"

    const-string v1, "data send result: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v6, Lo/cks;

    iget-object v0, p0, Lo/ckp;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/ckp;->d:Lo/ckh;

    invoke-direct {v6, v0, v5, v1}, Lo/cks;-><init>(Landroid/content/Context;ZLo/ckh;)V

    invoke-static {v6}, Lo/cku;->d(Lo/ckx;)V

    return-void
.end method
