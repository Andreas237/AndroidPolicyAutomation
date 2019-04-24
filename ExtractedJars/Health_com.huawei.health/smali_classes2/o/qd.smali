.class public final Lo/qd;
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
.method public a(Lo/or;)Lo/qf;
    .locals 6

    .line 32
    invoke-static {p1}, Lo/qd;->i(Lo/or;)Ljava/lang/String;

    move-result-object v2

    .line 33
    const-string v0, "urlto:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "URLTO:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 34
    const/4 v0, 0x0

    return-object v0

    .line 36
    :cond_0
    const/16 v0, 0x3a

    const/4 v1, 0x6

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v3

    .line 37
    if-gez v3, :cond_1

    .line 38
    const/4 v0, 0x0

    return-object v0

    .line 40
    :cond_1
    const/4 v0, 0x6

    if-gt v3, v0, :cond_2

    const/4 v4, 0x0

    goto :goto_0

    :cond_2
    const/4 v0, 0x6

    invoke-virtual {v2, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 41
    :goto_0
    add-int/lit8 v0, v3, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    .line 42
    new-instance v0, Lo/qf;

    invoke-direct {v0, v5, v4}, Lo/qf;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public synthetic b(Lo/or;)Lo/pr;
    .locals 1

    .line 28
    invoke-virtual {p0, p1}, Lo/qd;->a(Lo/or;)Lo/qf;

    move-result-object v0

    return-object v0
.end method
