.class public final Lo/qk;
.super Lo/pw;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Lo/pw;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic b(Lo/or;)Lo/pr;
    .locals 1

    .line 31
    invoke-virtual {p0, p1}, Lo/qk;->d(Lo/or;)Lo/qi;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/or;)Lo/qi;
    .locals 8

    .line 35
    invoke-static {p1}, Lo/qk;->i(Lo/or;)Ljava/lang/String;

    move-result-object v3

    .line 36
    const-string v0, "WIFI:"

    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 37
    const/4 v0, 0x0

    return-object v0

    .line 39
    :cond_0
    const-string v0, "S:"

    const/16 v1, 0x3b

    const/4 v2, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/qk;->a(Ljava/lang/String;Ljava/lang/String;CZ)Ljava/lang/String;

    move-result-object v4

    .line 40
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 41
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 43
    :cond_2
    const-string v0, "P:"

    const/16 v1, 0x3b

    const/4 v2, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/qk;->a(Ljava/lang/String;Ljava/lang/String;CZ)Ljava/lang/String;

    move-result-object v5

    .line 44
    const-string v0, "T:"

    const/16 v1, 0x3b

    const/4 v2, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/qk;->a(Ljava/lang/String;Ljava/lang/String;CZ)Ljava/lang/String;

    move-result-object v6

    .line 45
    if-nez v6, :cond_3

    .line 46
    const-string v6, "nopass"

    .line 48
    :cond_3
    const-string v0, "H:"

    const/16 v1, 0x3b

    const/4 v2, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/qk;->a(Ljava/lang/String;Ljava/lang/String;CZ)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v7

    .line 49
    new-instance v0, Lo/qi;

    invoke-direct {v0, v6, v4, v5, v7}, Lo/qi;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method
