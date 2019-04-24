.class public final Lo/rd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/qz;>;"
        }
    .end annotation
.end field

.field private final b:Lo/qx;


# direct methods
.method public constructor <init>(Lo/qx;)V
    .locals 3

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lo/rd;->b:Lo/qx;

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/rd;->a:Ljava/util/List;

    .line 36
    iget-object v0, p0, Lo/rd;->a:Ljava/util/List;

    new-instance v1, Lo/qz;

    const/4 v2, 0x1

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    invoke-direct {v1, p1, v2}, Lo/qz;-><init>(Lo/qx;[I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    return-void

    nop

    :array_0
    .array-data 4
        0x1
    .end array-data
.end method

.method private a(I)Lo/qz;
    .locals 9

    .line 40
    iget-object v0, p0, Lo/rd;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    .line 41
    iget-object v0, p0, Lo/rd;->a:Ljava/util/List;

    iget-object v1, p0, Lo/rd;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/qz;

    .line 42
    iget-object v0, p0, Lo/rd;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v7

    :goto_0
    if-gt v7, p1, :cond_0

    .line 43
    new-instance v0, Lo/qz;

    iget-object v1, p0, Lo/rd;->b:Lo/qx;

    const/4 v2, 0x2

    new-array v2, v2, [I

    const/4 v3, 0x1

    const/4 v4, 0x0

    aput v3, v2, v4

    iget-object v3, p0, Lo/rd;->b:Lo/qx;

    add-int/lit8 v4, v7, -0x1

    iget-object v5, p0, Lo/rd;->b:Lo/qx;

    .line 44
    invoke-virtual {v5}, Lo/qx;->c()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v3, v4}, Lo/qx;->a(I)I

    move-result v3

    const/4 v4, 0x1

    aput v3, v2, v4

    invoke-direct {v0, v1, v2}, Lo/qz;-><init>(Lo/qx;[I)V

    .line 43
    invoke-virtual {v6, v0}, Lo/qz;->c(Lo/qz;)Lo/qz;

    move-result-object v8

    .line 45
    iget-object v0, p0, Lo/rd;->a:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    move-object v6, v8

    .line 42
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 49
    :cond_0
    iget-object v0, p0, Lo/rd;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/qz;

    return-object v0
.end method


# virtual methods
.method public e([II)V
    .locals 11

    .line 53
    if-nez p2, :cond_0

    .line 54
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No error correction bytes"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 56
    :cond_0
    array-length v0, p1

    sub-int v3, v0, p2

    .line 57
    if-gtz v3, :cond_1

    .line 58
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No data bytes provided"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 60
    :cond_1
    invoke-direct {p0, p2}, Lo/rd;->a(I)Lo/qz;

    move-result-object v4

    .line 61
    new-array v5, v3, [I

    .line 62
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v5, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 63
    new-instance v6, Lo/qz;

    iget-object v0, p0, Lo/rd;->b:Lo/qx;

    invoke-direct {v6, v0, v5}, Lo/qz;-><init>(Lo/qx;[I)V

    .line 64
    const/4 v0, 0x1

    invoke-virtual {v6, p2, v0}, Lo/qz;->d(II)Lo/qz;

    move-result-object v6

    .line 65
    invoke-virtual {v6, v4}, Lo/qz;->e(Lo/qz;)[Lo/qz;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v7, v0, v1

    .line 66
    invoke-virtual {v7}, Lo/qz;->b()[I

    move-result-object v8

    .line 67
    array-length v0, v8

    sub-int v9, p2, v0

    .line 68
    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_2

    .line 69
    add-int v0, v3, v10

    const/4 v1, 0x0

    aput v1, p1, v0

    .line 68
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 71
    :cond_2
    add-int v0, v3, v9

    array-length v1, v8

    const/4 v2, 0x0

    invoke-static {v8, v2, p1, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 72
    return-void
.end method
