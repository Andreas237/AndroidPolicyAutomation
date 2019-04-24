.class public Lo/fpe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/foz;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    return-void
.end method

.method private final a(Lo/fow;Lo/fow;)Z
    .locals 3

    .line 49
    invoke-interface {p1}, Lo/fow;->b()Ljava/security/Principal;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 50
    invoke-interface {p2}, Lo/fow;->b()Ljava/security/Principal;

    move-result-object v0

    if-nez v0, :cond_0

    .line 51
    const/4 v0, 0x0

    return v0

    .line 53
    :cond_0
    invoke-interface {p1}, Lo/fow;->b()Ljava/security/Principal;

    move-result-object v0

    invoke-interface {p2}, Lo/fow;->b()Ljava/security/Principal;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/fpe;->e(Ljava/security/Principal;Ljava/security/Principal;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 54
    const/4 v0, 0x0

    return v0

    .line 57
    :cond_1
    const-string v0, "DTLS_CIPHER"

    invoke-interface {p1, v0}, Lo/fow;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 58
    if-eqz v2, :cond_2

    .line 59
    const-string v0, "DTLS_CIPHER"

    invoke-interface {p2, v0}, Lo/fow;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 60
    const/4 v0, 0x0

    return v0

    .line 63
    :cond_2
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public c(Lo/fow;Lo/fow;)Z
    .locals 1

    .line 37
    invoke-direct {p0, p1, p2}, Lo/fpe;->a(Lo/fow;Lo/fow;)Z

    move-result v0

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 32
    const-string v0, "principal correlation"

    return-object v0
.end method

.method public d(Lo/fow;Lo/fow;)Z
    .locals 1

    .line 42
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 43
    const/4 v0, 0x1

    return v0

    .line 45
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/fpe;->a(Lo/fow;Lo/fow;)Z

    move-result v0

    return v0
.end method

.method protected e(Ljava/security/Principal;Ljava/security/Principal;)Z
    .locals 1

    .line 80
    invoke-interface {p1, p2}, Ljava/security/Principal;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
