.class public final Lo/qa;
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
.method public a(Lo/or;)Lo/pv;
    .locals 7

    .line 35
    invoke-static {p1}, Lo/qa;->i(Lo/or;)Ljava/lang/String;

    move-result-object v3

    .line 36
    const-string v0, "smsto:"

    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "SMSTO:"

    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "mmsto:"

    .line 37
    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "MMSTO:"

    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 38
    const/4 v0, 0x0

    return-object v0

    .line 42
    :cond_0
    const/4 v0, 0x6

    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 43
    const/4 v5, 0x0

    .line 44
    const/16 v0, 0x3a

    invoke-virtual {v4, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    .line 45
    if-ltz v6, :cond_1

    .line 46
    add-int/lit8 v0, v6, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    .line 47
    const/4 v0, 0x0

    invoke-virtual {v4, v0, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 49
    :cond_1
    new-instance v0, Lo/pv;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v4, v1, v2, v5}, Lo/pv;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public synthetic b(Lo/or;)Lo/pr;
    .locals 1

    .line 31
    invoke-virtual {p0, p1}, Lo/qa;->a(Lo/or;)Lo/pv;

    move-result-object v0

    return-object v0
.end method
