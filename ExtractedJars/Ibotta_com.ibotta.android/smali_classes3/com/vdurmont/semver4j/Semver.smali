.class public Lcom/vdurmont/semver4j/Semver;
.super Ljava/lang/Object;
.source "Semver.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/vdurmont/semver4j/Semver$SemverType;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/vdurmont/semver4j/Semver;",
        ">;"
    }
.end annotation


# instance fields
.field private final build:Ljava/lang/String;

.field private final major:Ljava/lang/Integer;

.field private final minor:Ljava/lang/Integer;

.field private final originalValue:Ljava/lang/String;

.field private final patch:Ljava/lang/Integer;

.field private final suffixTokens:[Ljava/lang/String;

.field private final type:Lcom/vdurmont/semver4j/Semver$SemverType;

.field private final value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/vdurmont/semver4j/Semver$SemverType;)V
    .locals 10

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/vdurmont/semver4j/Semver;->originalValue:Ljava/lang/String;

    .line 25
    iput-object p2, p0, Lcom/vdurmont/semver4j/Semver;->type:Lcom/vdurmont/semver4j/Semver$SemverType;

    .line 26
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 27
    sget-object v0, Lcom/vdurmont/semver4j/Semver$SemverType;->NPM:Lcom/vdurmont/semver4j/Semver$SemverType;

    const/4 v1, 0x1

    if-ne p2, v0, :cond_1

    const-string v0, "v"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "V"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 28
    :cond_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 30
    :cond_1
    iput-object p1, p0, Lcom/vdurmont/semver4j/Semver;->value:Ljava/lang/String;

    .line 33
    invoke-direct {p0, p1}, Lcom/vdurmont/semver4j/Semver;->hasPreRelease(Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    const-string v0, "-"

    .line 34
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 36
    :cond_2
    new-array v0, v1, [Ljava/lang/String;

    aput-object p1, v0, v3

    .line 44
    :goto_0
    :try_start_0
    array-length v4, v0

    const/4 v5, 0x0

    if-ne v4, v1, :cond_5

    .line 46
    aget-object v4, v0, v3

    const-string v6, "+"

    invoke-virtual {v4, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 49
    aget-object v4, v0, v3

    const-string v6, "\\+"

    invoke-virtual {v4, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 50
    aget-object v6, v4, v3

    const-string v7, "\\."

    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 51
    array-length v7, v4

    if-ne v7, v2, :cond_3

    .line 52
    aget-object v4, v4, v1

    goto :goto_1

    :cond_3
    move-object v4, v5

    goto :goto_1

    .line 47
    :cond_4
    new-instance p2, Lcom/vdurmont/semver4j/SemverException;

    const-string v0, "The build cannot be empty."

    invoke-direct {p2, v0}, Lcom/vdurmont/semver4j/SemverException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 55
    :cond_5
    aget-object v4, v0, v3

    const-string v6, "\\."

    invoke-virtual {v4, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_7

    move-object v4, v5

    .line 59
    :goto_1
    :try_start_1
    aget-object v7, v6, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, p0, Lcom/vdurmont/semver4j/Semver;->major:Ljava/lang/Integer;
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_5

    .line 67
    :try_start_2
    aget-object v7, v6, v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    .line 73
    :catch_0
    :try_start_3
    sget-object v7, Lcom/vdurmont/semver4j/Semver$SemverType;->NPM:Lcom/vdurmont/semver4j/Semver$SemverType;

    if-ne p2, v7, :cond_6

    const-string v7, "x"

    aget-object v8, v6, v1

    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_7

    const-string v7, "*"

    aget-object v8, v6, v1

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    goto :goto_2

    .line 74
    :cond_6
    new-instance p2, Lcom/vdurmont/semver4j/SemverException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid version (no minor version): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/vdurmont/semver4j/SemverException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 69
    :catch_1
    sget-object v7, Lcom/vdurmont/semver4j/Semver$SemverType;->STRICT:Lcom/vdurmont/semver4j/Semver$SemverType;
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_8
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_7

    if-eq p2, v7, :cond_d

    :cond_7
    :goto_2
    move-object v7, v5

    .line 78
    :goto_3
    :try_start_4
    aget-object v8, v6, v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5
    :try_end_4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_4

    .line 84
    :catch_2
    :try_start_5
    sget-object v8, Lcom/vdurmont/semver4j/Semver$SemverType;->NPM:Lcom/vdurmont/semver4j/Semver$SemverType;

    if-ne p2, v8, :cond_8

    const-string v8, "x"

    aget-object v9, v6, v2

    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_9

    const-string v8, "*"

    aget-object v6, v6, v2

    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_4

    .line 85
    :cond_8
    new-instance p2, Lcom/vdurmont/semver4j/SemverException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid version (no patch version): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/vdurmont/semver4j/SemverException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 80
    :catch_3
    sget-object v6, Lcom/vdurmont/semver4j/Semver$SemverType;->STRICT:Lcom/vdurmont/semver4j/Semver$SemverType;
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_8
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_7

    if-eq p2, v6, :cond_c

    .line 93
    :cond_9
    :goto_4
    iput-object v7, p0, Lcom/vdurmont/semver4j/Semver;->minor:Ljava/lang/Integer;

    .line 94
    iput-object v5, p0, Lcom/vdurmont/semver4j/Semver;->patch:Ljava/lang/Integer;

    .line 96
    new-array p1, v3, [Ljava/lang/String;

    .line 99
    :try_start_6
    aget-object v5, v0, v1

    const-string v6, "+"

    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_b

    .line 102
    aget-object v5, v0, v1

    const-string v6, "\\+"

    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 103
    array-length v6, v5

    if-ne v6, v2, :cond_a

    .line 104
    aget-object v0, v5, v3

    const-string v2, "\\."

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 105
    aget-object v0, v5, v1

    move-object v4, v0

    goto :goto_5

    .line 107
    :cond_a
    aget-object v0, v0, v1

    const-string v1, "\\."

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    goto :goto_5

    .line 100
    :cond_b
    new-instance v0, Lcom/vdurmont/semver4j/SemverException;

    const-string v1, "The build cannot be empty."

    invoke-direct {v0, v1}, Lcom/vdurmont/semver4j/SemverException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_4

    .line 111
    :catch_4
    :goto_5
    iput-object p1, p0, Lcom/vdurmont/semver4j/Semver;->suffixTokens:[Ljava/lang/String;

    .line 113
    iput-object v4, p0, Lcom/vdurmont/semver4j/Semver;->build:Ljava/lang/String;

    .line 115
    invoke-direct {p0, p2}, Lcom/vdurmont/semver4j/Semver;->validate(Lcom/vdurmont/semver4j/Semver$SemverType;)V

    return-void

    .line 81
    :cond_c
    :try_start_7
    new-instance p2, Lcom/vdurmont/semver4j/SemverException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid version (no patch version): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/vdurmont/semver4j/SemverException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 70
    :cond_d
    new-instance p2, Lcom/vdurmont/semver4j/SemverException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid version (no minor version): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/vdurmont/semver4j/SemverException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 63
    :catch_5
    new-instance p2, Lcom/vdurmont/semver4j/SemverException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid version (no major version): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/vdurmont/semver4j/SemverException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 61
    :catch_6
    new-instance p2, Lcom/vdurmont/semver4j/SemverException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid version (no major version): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/vdurmont/semver4j/SemverException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_8
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_7

    .line 91
    :catch_7
    new-instance p2, Lcom/vdurmont/semver4j/SemverException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The version is invalid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/vdurmont/semver4j/SemverException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 89
    :catch_8
    new-instance p2, Lcom/vdurmont/semver4j/SemverException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The version is invalid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/vdurmont/semver4j/SemverException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private hasPreRelease(Ljava/lang/String;)Z
    .locals 3

    .line 129
    iget-object p1, p0, Lcom/vdurmont/semver4j/Semver;->value:Ljava/lang/String;

    const-string v0, "+"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    .line 130
    iget-object v0, p0, Lcom/vdurmont/semver4j/Semver;->value:Ljava/lang/String;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    if-eq p1, v2, :cond_1

    if-ge v0, p1, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method private validate(Lcom/vdurmont/semver4j/Semver$SemverType;)V
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/vdurmont/semver4j/Semver;->minor:Ljava/lang/Integer;

    if-nez v0, :cond_1

    sget-object v0, Lcom/vdurmont/semver4j/Semver$SemverType;->STRICT:Lcom/vdurmont/semver4j/Semver$SemverType;

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 120
    :cond_0
    new-instance p1, Lcom/vdurmont/semver4j/SemverException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid version (no minor version): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/vdurmont/semver4j/Semver;->value:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/vdurmont/semver4j/SemverException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 122
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/vdurmont/semver4j/Semver;->patch:Ljava/lang/Integer;

    if-nez v0, :cond_3

    sget-object v0, Lcom/vdurmont/semver4j/Semver$SemverType;->STRICT:Lcom/vdurmont/semver4j/Semver$SemverType;

    if-eq p1, v0, :cond_2

    goto :goto_1

    .line 123
    :cond_2
    new-instance p1, Lcom/vdurmont/semver4j/SemverException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid version (no patch version): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/vdurmont/semver4j/Semver;->value:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/vdurmont/semver4j/SemverException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public compareTo(Lcom/vdurmont/semver4j/Semver;)I
    .locals 1

    .line 493
    invoke-virtual {p0, p1}, Lcom/vdurmont/semver4j/Semver;->isGreaterThan(Lcom/vdurmont/semver4j/Semver;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 494
    :cond_0
    invoke-virtual {p0, p1}, Lcom/vdurmont/semver4j/Semver;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 9
    check-cast p1, Lcom/vdurmont/semver4j/Semver;

    invoke-virtual {p0, p1}, Lcom/vdurmont/semver4j/Semver;->compareTo(Lcom/vdurmont/semver4j/Semver;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 482
    :cond_0
    instance-of v0, p1, Lcom/vdurmont/semver4j/Semver;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 483
    :cond_1
    check-cast p1, Lcom/vdurmont/semver4j/Semver;

    .line 484
    iget-object v0, p0, Lcom/vdurmont/semver4j/Semver;->value:Ljava/lang/String;

    iget-object p1, p1, Lcom/vdurmont/semver4j/Semver;->value:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getMajor()Ljava/lang/Integer;
    .locals 1

    .line 527
    iget-object v0, p0, Lcom/vdurmont/semver4j/Semver;->major:Ljava/lang/Integer;

    return-object v0
.end method

.method public getMinor()Ljava/lang/Integer;
    .locals 1

    .line 537
    iget-object v0, p0, Lcom/vdurmont/semver4j/Semver;->minor:Ljava/lang/Integer;

    return-object v0
.end method

.method public getPatch()Ljava/lang/Integer;
    .locals 1

    .line 547
    iget-object v0, p0, Lcom/vdurmont/semver4j/Semver;->patch:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSuffixTokens()[Ljava/lang/String;
    .locals 1

    .line 557
    iget-object v0, p0, Lcom/vdurmont/semver4j/Semver;->suffixTokens:[Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 517
    iget-object v0, p0, Lcom/vdurmont/semver4j/Semver;->value:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 489
    iget-object v0, p0, Lcom/vdurmont/semver4j/Semver;->value:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public isGreaterThan(Lcom/vdurmont/semver4j/Semver;)Z
    .locals 6

    .line 197
    invoke-virtual {p0}, Lcom/vdurmont/semver4j/Semver;->getMajor()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lcom/vdurmont/semver4j/Semver;->getMajor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-le v0, v1, :cond_0

    return v2

    .line 198
    :cond_0
    invoke-virtual {p0}, Lcom/vdurmont/semver4j/Semver;->getMajor()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lcom/vdurmont/semver4j/Semver;->getMajor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v3, 0x0

    if-ge v0, v1, :cond_1

    return v3

    .line 200
    :cond_1
    invoke-virtual {p1}, Lcom/vdurmont/semver4j/Semver;->getMinor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/vdurmont/semver4j/Semver;->getMinor()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 201
    :goto_0
    invoke-virtual {p0}, Lcom/vdurmont/semver4j/Semver;->getMinor()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lcom/vdurmont/semver4j/Semver;->getMinor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-le v1, v0, :cond_3

    return v2

    .line 202
    :cond_3
    invoke-virtual {p0}, Lcom/vdurmont/semver4j/Semver;->getMinor()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/vdurmont/semver4j/Semver;->getMinor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v1, v0, :cond_4

    return v3

    .line 204
    :cond_4
    invoke-virtual {p1}, Lcom/vdurmont/semver4j/Semver;->getPatch()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/vdurmont/semver4j/Semver;->getPatch()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    .line 205
    :goto_1
    invoke-virtual {p0}, Lcom/vdurmont/semver4j/Semver;->getPatch()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lcom/vdurmont/semver4j/Semver;->getPatch()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-le v1, v0, :cond_6

    return v2

    .line 206
    :cond_6
    invoke-virtual {p0}, Lcom/vdurmont/semver4j/Semver;->getPatch()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lcom/vdurmont/semver4j/Semver;->getPatch()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v1, v0, :cond_7

    return v3

    .line 209
    :cond_7
    invoke-virtual {p0}, Lcom/vdurmont/semver4j/Semver;->getSuffixTokens()[Ljava/lang/String;

    move-result-object v0

    .line 210
    invoke-virtual {p1}, Lcom/vdurmont/semver4j/Semver;->getSuffixTokens()[Ljava/lang/String;

    move-result-object p1

    .line 213
    array-length v1, v0

    if-nez v1, :cond_8

    array-length v1, p1

    if-lez v1, :cond_8

    return v2

    .line 214
    :cond_8
    array-length v1, p1

    if-nez v1, :cond_9

    array-length v1, v0

    if-lez v1, :cond_9

    return v3

    :cond_9
    const/4 v1, 0x0

    .line 218
    :goto_2
    array-length v4, v0

    if-ge v1, v4, :cond_c

    array-length v4, p1

    if-ge v1, v4, :cond_c

    .line 222
    :try_start_0
    aget-object v4, v0, v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 223
    aget-object v5, p1, v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    sub-int/2addr v4, v5

    goto :goto_3

    .line 227
    :catch_0
    aget-object v4, v0, v1

    aget-object v5, p1, v1

    invoke-virtual {v4, v5}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v4

    :goto_3
    if-gez v4, :cond_a

    return v3

    :cond_a
    if-lez v4, :cond_b

    return v2

    :cond_b
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 235
    :cond_c
    array-length v0, v0

    array-length p1, p1

    if-le v0, p1, :cond_d

    goto :goto_4

    :cond_d
    const/4 v2, 0x0

    :goto_4
    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 499
    invoke-virtual {p0}, Lcom/vdurmont/semver4j/Semver;->getValue()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
