.class public Lo/aio;
.super Lo/ail;
.source "SourceFile"


# static fields
.field private static b:Ljava/lang/String;


# instance fields
.field private transient a:Lo/ain;

.field private e:Lo/aiy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const-string v0, "CoapIdentifyAdvancedCodeBuilder"

    sput-object v0, Lo/aio;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lo/aiy;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 30
    invoke-direct {p0}, Lo/ail;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aio;->e:Lo/aiy;

    .line 26
    const-string v0, "/cloudSetup"

    iput-object v0, p0, Lo/ail;->d:Ljava/lang/String;

    .line 27
    const-wide/16 v0, 0x1388

    iput-wide v0, p0, Lo/ail;->c:J

    .line 31
    iput-object p1, p0, Lo/aio;->e:Lo/aiy;

    .line 32
    new-instance v0, Lo/ain;

    invoke-direct {v0}, Lo/ain;-><init>()V

    iput-object v0, p0, Lo/aio;->a:Lo/ain;

    .line 33
    iget-object v0, p0, Lo/aio;->a:Lo/ain;

    invoke-virtual {v0, p2, p3}, Lo/ain;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    return-void
.end method


# virtual methods
.method public c()Lo/ain;
    .locals 1

    .line 82
    iget-object v0, p0, Lo/aio;->a:Lo/ain;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 8

    .line 38
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 39
    iget-object v0, p0, Lo/aio;->e:Lo/aiy;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 40
    const-string v0, ""

    return-object v0

    .line 42
    :cond_0
    iget-object v0, p0, Lo/aio;->e:Lo/aiy;

    iget-object v0, v0, Lo/aiy;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 43
    const-string v0, "code"

    iget-object v1, p0, Lo/aio;->e:Lo/aiy;

    iget-object v1, v1, Lo/aiy;->b:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    :cond_1
    iget-object v0, p0, Lo/aio;->e:Lo/aiy;

    iget-object v0, v0, Lo/aiy;->e:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 46
    const-string v0, "devId"

    iget-object v1, p0, Lo/aio;->e:Lo/aiy;

    iget-object v1, v1, Lo/aiy;->e:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    :cond_2
    iget-object v0, p0, Lo/aio;->e:Lo/aiy;

    iget-object v0, v0, Lo/aiy;->c:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 49
    const-string v0, "psk"

    iget-object v1, p0, Lo/aio;->e:Lo/aiy;

    iget-object v1, v1, Lo/aiy;->c:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    :cond_3
    iget-object v0, p0, Lo/aio;->e:Lo/aiy;

    iget-object v0, v0, Lo/aiy;->a:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 53
    const-string v0, "cloudUrl"

    iget-object v1, p0, Lo/aio;->e:Lo/aiy;

    iget-object v1, v1, Lo/aiy;->a:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    :cond_4
    invoke-static {v4}, Lo/aiz;->b(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v5

    .line 56
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    .line 57
    sget-object v0, Lo/aio;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u52a0\u5bc6String: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 58
    const-string v7, ""

    .line 59
    sget-object v0, Lo/aio;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeRequestStream: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 60
    return-object v6
.end method

.method public e(Ljava/lang/String;)Lo/air;
    .locals 7

    .line 65
    new-instance v4, Lo/aiy;

    invoke-direct {v4}, Lo/aiy;-><init>()V

    .line 66
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 67
    invoke-static {p1}, Lo/aiz;->c(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    .line 68
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 69
    const-string v0, "errcode"

    invoke-interface {v5, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    const-string v0, "errcode"

    :try_start_0
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v4, Lo/aiy;->d:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    goto :goto_0

    .line 72
    :catch_0
    move-exception v6

    .line 73
    sget-object v0, Lo/aio;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 78
    :cond_0
    :goto_0
    return-object v4
.end method
