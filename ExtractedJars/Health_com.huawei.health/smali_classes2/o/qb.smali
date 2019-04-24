.class public final Lo/qb;
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
    invoke-virtual {p0, p1}, Lo/qb;->e(Lo/or;)Lo/pf;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/or;)Lo/pf;
    .locals 11

    .line 31
    invoke-static {p1}, Lo/qb;->i(Lo/or;)Ljava/lang/String;

    move-result-object v6

    .line 32
    const-string v0, "smtp:"

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "SMTP:"

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 33
    const/4 v0, 0x0

    return-object v0

    .line 35
    :cond_0
    const/4 v0, 0x5

    invoke-virtual {v6, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    const/16 v0, 0x3a

    invoke-virtual {v7, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v10

    .line 39
    if-ltz v10, :cond_1

    .line 40
    add-int/lit8 v0, v10, 0x1

    invoke-virtual {v7, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    .line 41
    const/4 v0, 0x0

    invoke-virtual {v7, v0, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 42
    const/16 v0, 0x3a

    invoke-virtual {v8, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v10

    .line 43
    if-ltz v10, :cond_1

    .line 44
    add-int/lit8 v0, v10, 0x1

    invoke-virtual {v8, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    .line 45
    const/4 v0, 0x0

    invoke-virtual {v8, v0, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 48
    :cond_1
    new-instance v0, Lo/pf;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v8

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lo/pf;-><init>([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
