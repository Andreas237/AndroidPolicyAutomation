.class final Lo/sn;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lo/sg;

.field private final c:Lo/sh;

.field private final d:Lo/sh;

.field private final e:Z


# direct methods
.method constructor <init>(Lo/sh;Lo/sh;Lo/sg;Z)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lo/sn;->c:Lo/sh;

    .line 47
    iput-object p2, p0, Lo/sn;->d:Lo/sh;

    .line 48
    iput-object p3, p0, Lo/sn;->a:Lo/sg;

    .line 49
    iput-boolean p4, p0, Lo/sn;->e:Z

    .line 50
    return-void
.end method

.method private static d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 92
    if-nez p0, :cond_1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0
.end method

.method private static e(Ljava/lang/Object;)I
    .locals 1

    .line 101
    if-nez p0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method


# virtual methods
.method b()Lo/sg;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/sn;->a:Lo/sg;

    return-object v0
.end method

.method c()Lo/sh;
    .locals 1

    .line 57
    iget-object v0, p0, Lo/sn;->c:Lo/sh;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 69
    iget-object v0, p0, Lo/sn;->d:Lo/sh;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method e()Lo/sh;
    .locals 1

    .line 61
    iget-object v0, p0, Lo/sn;->d:Lo/sh;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 81
    instance-of v0, p1, Lo/sn;

    if-nez v0, :cond_0

    .line 82
    const/4 v0, 0x0

    return v0

    .line 84
    :cond_0
    move-object v2, p1

    check-cast v2, Lo/sn;

    .line 85
    iget-object v0, p0, Lo/sn;->c:Lo/sh;

    iget-object v1, v2, Lo/sn;->c:Lo/sh;

    .line 86
    invoke-static {v0, v1}, Lo/sn;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/sn;->d:Lo/sh;

    iget-object v1, v2, Lo/sn;->d:Lo/sh;

    .line 87
    invoke-static {v0, v1}, Lo/sn;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/sn;->a:Lo/sg;

    iget-object v1, v2, Lo/sn;->a:Lo/sg;

    .line 88
    invoke-static {v0, v1}, Lo/sn;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 97
    iget-object v0, p0, Lo/sn;->c:Lo/sh;

    invoke-static {v0}, Lo/sn;->e(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lo/sn;->d:Lo/sh;

    invoke-static {v1}, Lo/sn;->e(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Lo/sn;->a:Lo/sg;

    invoke-static {v1}, Lo/sn;->e(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[ "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/sn;->c:Lo/sh;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " , "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/sn;->d:Lo/sh;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/sn;->a:Lo/sg;

    if-nez v1, :cond_0

    const-string v1, "null"

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lo/sn;->a:Lo/sg;

    .line 76
    invoke-virtual {v1}, Lo/sg;->e()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
