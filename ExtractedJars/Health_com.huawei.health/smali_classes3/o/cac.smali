.class public Lo/cac;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HS_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 101
    return-object p0
.end method

.method public static varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 18
    invoke-static {p0}, Lo/cac;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 19
    invoke-static {p0, p1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    return-void
.end method

.method public static varargs b(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 36
    invoke-static {p0}, Lo/cac;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 37
    invoke-static {p0, p1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    return-void
.end method

.method public static varargs c(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 23
    invoke-static {p0, p1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    invoke-static {p0}, Lo/cac;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 25
    invoke-static {p0, p1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    return-void
.end method

.method public static varargs d(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 71
    invoke-static {p0}, Lo/cac;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 72
    invoke-static {p0, p1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    return-void
.end method

.method private static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HealthAdapter_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 106
    return-object p0
.end method

.method public static varargs e(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 41
    invoke-static {p0, p1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    invoke-static {p0}, Lo/cac;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 43
    invoke-static {p0, p1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    return-void
.end method

.method public static varargs g(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 90
    invoke-static {p0}, Lo/cac;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 91
    invoke-static {p0, p1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    return-void
.end method

.method public static varargs h(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 94
    invoke-static {p0, p1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    invoke-static {p0}, Lo/cac;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 96
    invoke-static {p0, p1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    return-void
.end method

.method public static varargs k(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 76
    invoke-static {p0, p1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    invoke-static {p0}, Lo/cac;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 78
    invoke-static {p0, p1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    return-void
.end method
