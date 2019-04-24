.class public Lo/aty;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Lo/aud;)V
    .locals 4

    .line 24
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    const-string v0, "RequestUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OverSea cant not connect,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    return-void

    .line 28
    :cond_0
    const/16 v0, 0x65

    invoke-static {v0, p1, p0}, Lo/aul;->d(ILo/aud;Ljava/lang/String;)V

    .line 29
    return-void
.end method

.method public static a(Lo/aud;)V
    .locals 4

    .line 39
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    const-string v0, "RequestUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OverSea cant not connect,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    return-void

    .line 43
    :cond_0
    const/16 v0, 0x65

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lo/aul;->d(ILo/aud;Ljava/lang/String;)V

    .line 44
    return-void
.end method

.method public static b(Lo/aud;)V
    .locals 2

    .line 73
    const/16 v0, 0x68

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lo/aul;->d(ILo/aud;Ljava/lang/String;)V

    .line 74
    return-void
.end method

.method public static c(Lo/aud;)V
    .locals 4

    .line 84
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    const-string v0, "RequestUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OverSea cant not connect,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    return-void

    .line 88
    :cond_0
    const/16 v0, 0x65

    invoke-static {v0, p0}, Lo/aul;->a(ILo/aud;)V

    .line 89
    return-void
.end method

.method public static d(Lo/aud;)V
    .locals 2

    .line 63
    const/16 v0, 0x67

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lo/aul;->d(ILo/aud;Ljava/lang/String;)V

    .line 64
    return-void
.end method

.method public static e(Lo/aud;)V
    .locals 2

    .line 53
    const/16 v0, 0x66

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lo/aul;->d(ILo/aud;Ljava/lang/String;)V

    .line 54
    return-void
.end method
