.class public Lorg/apache/commons/a/b/a/a;
.super Lorg/apache/commons/a/b/a/b;


# instance fields
.field private final a:[Lorg/apache/commons/a/b/a/b;


# direct methods
.method public varargs constructor <init>([Lorg/apache/commons/a/b/a/b;)V
    .locals 0

    invoke-direct {p0}, Lorg/apache/commons/a/b/a/b;-><init>()V

    invoke-static {p1}, Lorg/apache/commons/a/a;->a([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lorg/apache/commons/a/b/a/b;

    iput-object p1, p0, Lorg/apache/commons/a/b/a/a;->a:[Lorg/apache/commons/a/b/a/b;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;ILjava/io/Writer;)I
    .locals 5

    iget-object v0, p0, Lorg/apache/commons/a/b/a/a;->a:[Lorg/apache/commons/a/b/a/b;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    invoke-virtual {v4, p1, p2, p3}, Lorg/apache/commons/a/b/a/b;->a(Ljava/lang/CharSequence;ILjava/io/Writer;)I

    move-result v4

    if-eqz v4, :cond_0

    return v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method
