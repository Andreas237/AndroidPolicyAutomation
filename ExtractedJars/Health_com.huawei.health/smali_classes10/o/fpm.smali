.class public Lo/fpm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/foz;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    return-void
.end method

.method private final a(Lo/fow;Lo/fow;)Z
    .locals 1

    .line 52
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Lo/fow;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public c(Lo/fow;Lo/fow;)Z
    .locals 1

    .line 43
    invoke-direct {p0, p1, p2}, Lo/fpm;->a(Lo/fow;Lo/fow;)Z

    move-result v0

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 38
    const-string v0, "udp plain"

    return-object v0
.end method

.method public d(Lo/fow;Lo/fow;)Z
    .locals 1

    .line 48
    invoke-direct {p0, p1, p2}, Lo/fpm;->a(Lo/fow;Lo/fow;)Z

    move-result v0

    return v0
.end method
