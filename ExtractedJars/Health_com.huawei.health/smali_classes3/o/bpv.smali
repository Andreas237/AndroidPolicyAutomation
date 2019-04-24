.class public final Lo/bpv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bpv$d;
    }
.end annotation


# instance fields
.field private final b:[Ljava/lang/String;


# direct methods
.method private constructor <init>(Lo/bpv$d;)V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-static {p1}, Lo/bpv$d;->b(Lo/bpv$d;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Lo/bpv$d;->b(Lo/bpv$d;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lo/bpv;->b:[Ljava/lang/String;

    .line 23
    return-void
.end method

.method synthetic constructor <init>(Lo/bpv$d;Lo/bpv$3;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lo/bpv;-><init>(Lo/bpv$d;)V

    return-void
.end method

.method private constructor <init>([Ljava/lang/String;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lo/bpv;->b:[Ljava/lang/String;

    .line 28
    return-void
.end method

.method public static varargs a([Ljava/lang/String;)Lo/bpv;
    .locals 6

    .line 74
    if-eqz p0, :cond_0

    array-length v0, p0

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    .line 76
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Expected alternating header"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 79
    :cond_1
    invoke-virtual {p0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object p0, v0

    check-cast p0, [Ljava/lang/String;

    .line 80
    const/4 v3, 0x0

    :goto_0
    array-length v0, p0

    if-ge v3, v0, :cond_3

    .line 82
    aget-object v0, p0, v3

    if-nez v0, :cond_2

    .line 84
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Headers cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 86
    :cond_2
    aget-object v0, p0, v3

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    aput-object v0, p0, v3

    .line 80
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 89
    :cond_3
    const/4 v3, 0x0

    :goto_1
    array-length v0, p0

    if-ge v3, v0, :cond_6

    .line 91
    add-int/lit8 v0, v3, 0x1

    aget-object v4, p0, v0

    .line 92
    aget-object v5, p0, v3

    .line 93
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    .line 95
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 89
    :cond_5
    add-int/lit8 v3, v3, 0x2

    goto :goto_1

    .line 99
    :cond_6
    new-instance v0, Lo/bpv;

    invoke-direct {v0, p0}, Lo/bpv;-><init>([Ljava/lang/String;)V

    return-object v0
.end method

.method private static b([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 139
    array-length v0, p0

    add-int/lit8 v2, v0, -0x2

    :goto_0
    if-ltz v2, :cond_1

    .line 141
    aget-object v0, p0, v2

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    add-int/lit8 v0, v2, 0x1

    aget-object v0, p0, v0

    return-object v0

    .line 139
    :cond_0
    add-int/lit8 v2, v2, -0x2

    goto :goto_0

    .line 146
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 2

    .line 43
    iget-object v0, p0, Lo/bpv;->b:[Ljava/lang/String;

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/bpv;->b:[Ljava/lang/String;

    invoke-static {v0, p1}, Lo/bpv;->b([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(I)Ljava/lang/String;
    .locals 2

    .line 51
    iget-object v0, p0, Lo/bpv;->b:[Ljava/lang/String;

    mul-int/lit8 v1, p1, 0x2

    aget-object v0, v0, v1

    return-object v0
.end method

.method public d()Lo/bpv$d;
    .locals 3

    .line 64
    new-instance v2, Lo/bpv$d;

    invoke-direct {v2}, Lo/bpv$d;-><init>()V

    .line 65
    invoke-static {v2}, Lo/bpv$d;->b(Lo/bpv$d;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lo/bpv;->b:[Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 66
    return-object v2
.end method

.method public e(I)Ljava/lang/String;
    .locals 3

    .line 59
    iget-object v0, p0, Lo/bpv;->b:[Ljava/lang/String;

    mul-int/lit8 v1, p1, 0x2

    add-int/lit8 v1, v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 128
    invoke-virtual {p0}, Lo/bpv;->a()I

    move-result v2

    .line 129
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    .line 132
    invoke-virtual {p0, v4}, Lo/bpv;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v4}, Lo/bpv;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 134
    :cond_0
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
