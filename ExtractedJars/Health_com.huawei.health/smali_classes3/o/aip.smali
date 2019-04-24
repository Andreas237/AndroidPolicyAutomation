.class public Lo/aip;
.super Lo/ail;
.source "SourceFile"


# instance fields
.field private a:Lo/aiw;


# direct methods
.method public constructor <init>(Lo/aiw;)V
    .locals 2

    .line 33
    invoke-direct {p0}, Lo/ail;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aip;->a:Lo/aiw;

    .line 29
    const-string v0, "/.sys/sessMngr"

    iput-object v0, p0, Lo/ail;->d:Ljava/lang/String;

    .line 30
    const-wide/16 v0, 0x7530

    iput-wide v0, p0, Lo/ail;->c:J

    .line 34
    iput-object p1, p0, Lo/aip;->a:Lo/aiw;

    .line 35
    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 97
    const-string v1, ""

    .line 98
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 99
    const-string v0, "\\s*|\t|\r|\n"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    .line 100
    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 101
    const-string v0, ""

    invoke-virtual {v3, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 103
    :cond_0
    return-object v1
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 7

    .line 39
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 40
    iget-object v0, p0, Lo/aip;->a:Lo/aiw;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 41
    const-string v0, ""

    return-object v0

    .line 43
    :cond_0
    const-string v0, "type"

    iget-object v1, p0, Lo/aip;->a:Lo/aiw;

    invoke-virtual {v1}, Lo/aiw;->e()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    const-string v0, "modeSupport"

    iget-object v1, p0, Lo/aip;->a:Lo/aiw;

    invoke-virtual {v1}, Lo/aiw;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    const-string v0, "sn1"

    iget-object v1, p0, Lo/aip;->a:Lo/aiw;

    invoke-virtual {v1}, Lo/aiw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    const-string v0, "seq"

    iget-object v1, p0, Lo/aip;->a:Lo/aiw;

    invoke-virtual {v1}, Lo/aiw;->d()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    invoke-static {v4}, Lo/aiz;->b(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v5

    .line 48
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    .line 49
    const-string v0, "CoapSessionInterfaceBuilder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "makeRequestStream: result is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 50
    return-object v6
.end method

.method public e(Ljava/lang/String;)Lo/air;
    .locals 9

    .line 55
    invoke-static {p1}, Lo/aip;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 56
    const-string v0, "CoapSessionInterfaceBuilder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "makeResponseEntity: stream 1 is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 57
    new-instance v5, Lo/aiu;

    invoke-direct {v5}, Lo/aiu;-><init>()V

    .line 58
    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_7

    .line 59
    invoke-static {p1}, Lo/aiz;->c(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    .line 60
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    .line 62
    const-string v0, "errcode"

    :try_start_0
    invoke-interface {v6, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    const-string v0, "errcode"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    .line 64
    invoke-virtual {v5, v7}, Lo/aiu;->e(Ljava/lang/Integer;)V

    .line 66
    :cond_0
    const-string v0, "sessId"

    invoke-interface {v6, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 67
    const-string v0, "sessId"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 68
    invoke-virtual {v5, v7}, Lo/aiu;->b(Ljava/lang/String;)V

    .line 70
    :cond_1
    const-string v0, "modeResp"

    invoke-interface {v6, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 71
    const-string v0, "modeResp"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    .line 72
    invoke-virtual {v5, v7}, Lo/aiu;->d(Ljava/lang/Integer;)V

    .line 74
    :cond_2
    const-string v0, "sn2"

    invoke-interface {v6, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 75
    const-string v0, "sn2"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 76
    invoke-virtual {v5, v7}, Lo/aiu;->e(Ljava/lang/String;)V

    .line 78
    :cond_3
    const-string v0, "seq"

    invoke-interface {v6, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 79
    const-string v0, "seq"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    .line 80
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    .line 81
    invoke-virtual {v5, v8}, Lo/aiu;->c(Ljava/lang/Long;)V

    .line 83
    :cond_4
    const-string v0, "dtlsPort"

    invoke-interface {v6, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 84
    const-string v0, "dtlsPort"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    .line 85
    invoke-virtual {v5, v7}, Lo/aiu;->c(Ljava/lang/Integer;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    :cond_5
    goto :goto_0

    .line 87
    :catch_0
    move-exception v7

    .line 88
    const-string v0, "CoapSessionInterfaceBuilder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 91
    :cond_6
    :goto_0
    goto :goto_1

    .line 92
    :cond_7
    const-string v0, "CoapSessionInterfaceBuilder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeResponseEntity stream is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 94
    :goto_1
    return-object v5
.end method
