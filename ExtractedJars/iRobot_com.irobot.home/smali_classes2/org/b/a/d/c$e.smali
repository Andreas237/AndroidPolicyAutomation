.class Lorg/b/a/d/c$e;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/b/a/d/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/b/a/d/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private final a:[Lorg/b/a/d/k;

.field private final b:I


# direct methods
.method constructor <init>([Lorg/b/a/d/k;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/b/a/d/c$e;->a:[Lorg/b/a/d/k;

    array-length v0, p1

    const/4 v1, 0x0

    :cond_0
    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    aget-object v2, p1, v0

    if-eqz v2, :cond_0

    invoke-interface {v2}, Lorg/b/a/d/k;->estimateParsedLength()I

    move-result v2

    if-le v2, v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_1
    iput v1, p0, Lorg/b/a/d/c$e;->b:I

    return-void
.end method


# virtual methods
.method public estimateParsedLength()I
    .locals 1

    iget v0, p0, Lorg/b/a/d/c$e;->b:I

    return v0
.end method

.method public parseInto(Lorg/b/a/d/e;Ljava/lang/CharSequence;I)I
    .locals 9

    iget-object v0, p0, Lorg/b/a/d/c$e;->a:[Lorg/b/a/d/k;

    array-length v1, v0

    invoke-virtual {p1}, Lorg/b/a/d/e;->f()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, p3

    move v7, v5

    move-object v6, v4

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_6

    aget-object v8, v0, v4

    if-nez v8, :cond_1

    if-gt v5, p3, :cond_0

    return p3

    :cond_0
    const/4 v3, 0x1

    goto :goto_2

    :cond_1
    invoke-interface {v8, p1, p2, p3}, Lorg/b/a/d/k;->parseInto(Lorg/b/a/d/e;Ljava/lang/CharSequence;I)I

    move-result v8

    if-lt v8, p3, :cond_4

    if-le v8, v5, :cond_5

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v8, v5, :cond_3

    add-int/lit8 v5, v4, 0x1

    if-ge v5, v1, :cond_3

    aget-object v5, v0, v5

    if-nez v5, :cond_2

    return v8

    :cond_2
    invoke-virtual {p1}, Lorg/b/a/d/e;->f()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    move v5, v8

    goto :goto_1

    :cond_3
    return v8

    :cond_4
    if-gez v8, :cond_5

    not-int v8, v8

    if-le v8, v7, :cond_5

    move v7, v8

    :cond_5
    :goto_1
    invoke-virtual {p1, v2}, Lorg/b/a/d/e;->a(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_6
    :goto_2
    if-gt v5, p3, :cond_8

    if-ne v5, p3, :cond_7

    if-eqz v3, :cond_7

    goto :goto_3

    :cond_7
    not-int p1, v7

    return p1

    :cond_8
    :goto_3
    if-eqz v6, :cond_9

    invoke-virtual {p1, v6}, Lorg/b/a/d/e;->a(Ljava/lang/Object;)Z

    :cond_9
    return v5
.end method
