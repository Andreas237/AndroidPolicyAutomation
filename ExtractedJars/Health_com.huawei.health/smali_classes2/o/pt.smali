.class public final Lo/pt;
.super Lo/pw;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Lo/pw;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic b(Lo/or;)Lo/pr;
    .locals 1

    .line 28
    invoke-virtual {p0, p1}, Lo/pt;->e(Lo/or;)Lo/px;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/or;)Lo/px;
    .locals 5

    .line 33
    invoke-virtual {p1}, Lo/or;->d()Lo/od;

    move-result-object v2

    .line 34
    sget-object v0, Lo/od;->m:Lo/od;

    if-eq v2, v0, :cond_0

    sget-object v0, Lo/od;->q:Lo/od;

    if-eq v2, v0, :cond_0

    sget-object v0, Lo/od;->g:Lo/od;

    if-eq v2, v0, :cond_0

    sget-object v0, Lo/od;->k:Lo/od;

    if-eq v2, v0, :cond_0

    .line 36
    const/4 v0, 0x0

    return-object v0

    .line 38
    :cond_0
    invoke-static {p1}, Lo/pt;->i(Lo/or;)Ljava/lang/String;

    move-result-object v3

    .line 39
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v3, v0}, Lo/pt;->d(Ljava/lang/CharSequence;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 40
    const/4 v0, 0x0

    return-object v0

    .line 46
    :cond_1
    sget-object v0, Lo/od;->q:Lo/od;

    if-ne v2, v0, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    .line 47
    invoke-static {v3}, Lo/sk;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 49
    :cond_2
    move-object v4, v3

    .line 52
    :goto_0
    new-instance v0, Lo/px;

    invoke-direct {v0, v3, v4}, Lo/px;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
