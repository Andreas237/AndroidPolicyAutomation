.class public Lo/eko;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lo/ejp;)F
    .locals 3

    .line 59
    invoke-static {p0}, Lo/ejx;->e(Lo/ejp;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    const/4 v0, 0x0

    return v0

    .line 64
    :cond_0
    instance-of v0, p0, Lo/eis;

    if-eqz v0, :cond_1

    .line 65
    move-object v0, p0

    check-cast v0, Lo/eis;

    invoke-virtual {v0}, Lo/eis;->b()F

    move-result v0

    return v0

    .line 66
    :cond_1
    instance-of v0, p0, Lo/eju;

    if-eqz v0, :cond_3

    .line 67
    move-object v0, p0

    check-cast v0, Lo/eju;

    invoke-virtual {v0}, Lo/eju;->a()Lo/eju$c;

    move-result-object v2

    .line 68
    instance-of v0, v2, Lo/eju$a;

    if-nez v0, :cond_2

    .line 69
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "parseLineValue IStorageModel found presentStyle not bar"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 71
    :cond_2
    move-object v0, v2

    check-cast v0, Lo/eju$a;

    invoke-virtual {v0}, Lo/eju$a;->b()F

    move-result v0

    return v0

    .line 74
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "parseLineValue failed"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c(Lo/ejp;)F
    .locals 3

    .line 39
    invoke-static {p0}, Lo/ejx;->e(Lo/ejp;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    const/4 v0, 0x0

    return v0

    .line 44
    :cond_0
    instance-of v0, p0, Lo/ehz;

    if-eqz v0, :cond_1

    .line 45
    move-object v0, p0

    check-cast v0, Lo/ehz;

    invoke-virtual {v0}, Lo/ehz;->d()F

    move-result v0

    return v0

    .line 46
    :cond_1
    instance-of v0, p0, Lo/eju;

    if-eqz v0, :cond_3

    .line 47
    move-object v0, p0

    check-cast v0, Lo/eju;

    invoke-virtual {v0}, Lo/eju;->a()Lo/eju$c;

    move-result-object v2

    .line 48
    instance-of v0, v2, Lo/eju$b;

    if-nez v0, :cond_2

    .line 49
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "parseBarFloor IStorageModel found presentStyle not bar"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 51
    :cond_2
    move-object v0, v2

    check-cast v0, Lo/eju$b;

    invoke-virtual {v0}, Lo/eju$b;->b()F

    move-result v0

    return v0

    .line 54
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "parseBarFloor failed"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d(Lo/ejp;)F
    .locals 3

    .line 19
    invoke-static {p0}, Lo/ejx;->e(Lo/ejp;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 21
    const/4 v0, 0x0

    return v0

    .line 24
    :cond_0
    instance-of v0, p0, Lo/ehz;

    if-eqz v0, :cond_1

    .line 25
    move-object v0, p0

    check-cast v0, Lo/ehz;

    invoke-virtual {v0}, Lo/ehz;->c()F

    move-result v0

    return v0

    .line 26
    :cond_1
    instance-of v0, p0, Lo/eju;

    if-eqz v0, :cond_3

    .line 27
    move-object v0, p0

    check-cast v0, Lo/eju;

    invoke-virtual {v0}, Lo/eju;->a()Lo/eju$c;

    move-result-object v2

    .line 28
    instance-of v0, v2, Lo/eju$b;

    if-nez v0, :cond_2

    .line 29
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "parseBarCeil IStorageModel found presentStyle not bar"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 31
    :cond_2
    move-object v0, v2

    check-cast v0, Lo/eju$b;

    invoke-virtual {v0}, Lo/eju$b;->d()F

    move-result v0

    return v0

    .line 34
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "parseBarCeil failed"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
