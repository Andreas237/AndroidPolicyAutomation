.class public final Lo/pq;
.super Lo/pw;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lo/pw;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic b(Lo/or;)Lo/pr;
    .locals 1

    .line 27
    invoke-virtual {p0, p1}, Lo/pq;->d(Lo/or;)Lo/po;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/or;)Lo/po;
    .locals 4

    .line 34
    invoke-virtual {p1}, Lo/or;->d()Lo/od;

    move-result-object v1

    .line 35
    sget-object v0, Lo/od;->k:Lo/od;

    if-eq v1, v0, :cond_0

    .line 36
    const/4 v0, 0x0

    return-object v0

    .line 38
    :cond_0
    invoke-static {p1}, Lo/pq;->i(Lo/or;)Ljava/lang/String;

    move-result-object v2

    .line 39
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    .line 40
    const/16 v0, 0xd

    if-eq v3, v0, :cond_1

    .line 41
    const/4 v0, 0x0

    return-object v0

    .line 43
    :cond_1
    const-string v0, "978"

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "979"

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 44
    const/4 v0, 0x0

    return-object v0

    .line 47
    :cond_2
    new-instance v0, Lo/po;

    invoke-direct {v0, v2}, Lo/po;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
