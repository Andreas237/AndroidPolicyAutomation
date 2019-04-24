.class public final Lo/qc;
.super Lo/pw;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lo/pw;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/or;)Lo/py;
    .locals 6

    .line 30
    invoke-static {p1}, Lo/qc;->i(Lo/or;)Ljava/lang/String;

    move-result-object v2

    .line 31
    const-string v0, "tel:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "TEL:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 32
    const/4 v0, 0x0

    return-object v0

    .line 35
    :cond_0
    const-string v0, "TEL:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tel:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v2

    .line 37
    :goto_0
    const/16 v0, 0x3f

    const/4 v1, 0x4

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    .line 38
    if-gez v4, :cond_2

    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_2
    const/4 v0, 0x4

    invoke-virtual {v2, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 39
    :goto_1
    new-instance v0, Lo/py;

    const/4 v1, 0x0

    invoke-direct {v0, v5, v3, v1}, Lo/py;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public synthetic b(Lo/or;)Lo/pr;
    .locals 1

    .line 26
    invoke-virtual {p0, p1}, Lo/qc;->a(Lo/or;)Lo/py;

    move-result-object v0

    return-object v0
.end method
