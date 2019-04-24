.class public Lorg/b/a/d/e;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/b/a/d/e$a;,
        Lorg/b/a/d/e$b;
    }
.end annotation


# instance fields
.field private final a:Lorg/b/a/a;

.field private final b:J

.field private final c:Ljava/util/Locale;

.field private final d:I

.field private final e:Lorg/b/a/f;

.field private final f:Ljava/lang/Integer;

.field private g:Lorg/b/a/f;

.field private h:Ljava/lang/Integer;

.field private i:Ljava/lang/Integer;

.field private j:[Lorg/b/a/d/e$a;

.field private k:I

.field private l:Z

.field private m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLorg/b/a/a;Ljava/util/Locale;Ljava/lang/Integer;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p3}, Lorg/b/a/e;->a(Lorg/b/a/a;)Lorg/b/a/a;

    move-result-object p3

    iput-wide p1, p0, Lorg/b/a/d/e;->b:J

    invoke-virtual {p3}, Lorg/b/a/a;->a()Lorg/b/a/f;

    move-result-object p1

    iput-object p1, p0, Lorg/b/a/d/e;->e:Lorg/b/a/f;

    invoke-virtual {p3}, Lorg/b/a/a;->b()Lorg/b/a/a;

    move-result-object p1

    iput-object p1, p0, Lorg/b/a/d/e;->a:Lorg/b/a/a;

    if-nez p4, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p4

    :cond_0
    iput-object p4, p0, Lorg/b/a/d/e;->c:Ljava/util/Locale;

    iput p6, p0, Lorg/b/a/d/e;->d:I

    iput-object p5, p0, Lorg/b/a/d/e;->f:Ljava/lang/Integer;

    iget-object p1, p0, Lorg/b/a/d/e;->e:Lorg/b/a/f;

    iput-object p1, p0, Lorg/b/a/d/e;->g:Lorg/b/a/f;

    iget-object p1, p0, Lorg/b/a/d/e;->f:Ljava/lang/Integer;

    iput-object p1, p0, Lorg/b/a/d/e;->i:Ljava/lang/Integer;

    const/16 p1, 0x8

    new-array p1, p1, [Lorg/b/a/d/e$a;

    iput-object p1, p0, Lorg/b/a/d/e;->j:[Lorg/b/a/d/e$a;

    return-void
.end method

.method static synthetic a(Lorg/b/a/d/e;I)I
    .locals 0

    iput p1, p0, Lorg/b/a/d/e;->k:I

    return p1
.end method

.method static a(Lorg/b/a/g;Lorg/b/a/g;)I
    .locals 1

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lorg/b/a/g;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lorg/b/a/g;->b()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lorg/b/a/g;->compareTo(Ljava/lang/Object;)I

    move-result p0

    neg-int p0, p0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lorg/b/a/g;->b()Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    const/4 p0, -0x1

    return p0

    :cond_5
    :goto_2
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic a(Lorg/b/a/d/e;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    iput-object p1, p0, Lorg/b/a/d/e;->h:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic a(Lorg/b/a/d/e;)Lorg/b/a/f;
    .locals 0

    iget-object p0, p0, Lorg/b/a/d/e;->g:Lorg/b/a/f;

    return-object p0
.end method

.method static synthetic a(Lorg/b/a/d/e;Lorg/b/a/f;)Lorg/b/a/f;
    .locals 0

    iput-object p1, p0, Lorg/b/a/d/e;->g:Lorg/b/a/f;

    return-object p1
.end method

.method private static a([Lorg/b/a/d/e$a;I)V
    .locals 5

    const/4 v0, 0x0

    const/16 v1, 0xa

    if-le p1, v1, :cond_0

    invoke-static {p0, v0, p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;II)V

    return-void

    :cond_0
    :goto_0
    if-ge v0, p1, :cond_2

    move v1, v0

    :goto_1
    if-lez v1, :cond_1

    add-int/lit8 v2, v1, -0x1

    aget-object v3, p0, v2

    aget-object v4, p0, v1

    invoke-virtual {v3, v4}, Lorg/b/a/d/e$a;->a(Lorg/b/a/d/e$a;)I

    move-result v3

    if-lez v3, :cond_1

    aget-object v3, p0, v1

    aget-object v4, p0, v2

    aput-object v4, p0, v1

    aput-object v3, p0, v2

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method static synthetic a(Lorg/b/a/d/e;Z)Z
    .locals 0

    iput-boolean p1, p0, Lorg/b/a/d/e;->l:Z

    return p1
.end method

.method static synthetic a(Lorg/b/a/d/e;[Lorg/b/a/d/e$a;)[Lorg/b/a/d/e$a;
    .locals 0

    iput-object p1, p0, Lorg/b/a/d/e;->j:[Lorg/b/a/d/e$a;

    return-object p1
.end method

.method static synthetic b(Lorg/b/a/d/e;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lorg/b/a/d/e;->h:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic c(Lorg/b/a/d/e;)[Lorg/b/a/d/e$a;
    .locals 0

    iget-object p0, p0, Lorg/b/a/d/e;->j:[Lorg/b/a/d/e$a;

    return-object p0
.end method

.method static synthetic d(Lorg/b/a/d/e;)I
    .locals 0

    iget p0, p0, Lorg/b/a/d/e;->k:I

    return p0
.end method

.method private g()Lorg/b/a/d/e$a;
    .locals 4

    iget-object v0, p0, Lorg/b/a/d/e;->j:[Lorg/b/a/d/e$a;

    iget v1, p0, Lorg/b/a/d/e;->k:I

    array-length v2, v0

    if-eq v1, v2, :cond_0

    iget-boolean v2, p0, Lorg/b/a/d/e;->l:Z

    if-eqz v2, :cond_2

    :cond_0
    array-length v2, v0

    if-ne v1, v2, :cond_1

    mul-int/lit8 v2, v1, 0x2

    goto :goto_0

    :cond_1
    array-length v2, v0

    :goto_0
    new-array v2, v2, [Lorg/b/a/d/e$a;

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, p0, Lorg/b/a/d/e;->j:[Lorg/b/a/d/e$a;

    iput-boolean v3, p0, Lorg/b/a/d/e;->l:Z

    move-object v0, v2

    :cond_2
    const/4 v2, 0x0

    iput-object v2, p0, Lorg/b/a/d/e;->m:Ljava/lang/Object;

    aget-object v2, v0, v1

    if-nez v2, :cond_3

    new-instance v2, Lorg/b/a/d/e$a;

    invoke-direct {v2}, Lorg/b/a/d/e$a;-><init>()V

    aput-object v2, v0, v1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lorg/b/a/d/e;->k:I

    return-object v2
.end method


# virtual methods
.method a(Lorg/b/a/d/k;Ljava/lang/CharSequence;)J
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, p0, p2, v0}, Lorg/b/a/d/k;->parseInto(Lorg/b/a/d/e;Ljava/lang/CharSequence;I)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lt p1, v0, :cond_1

    const/4 p1, 0x1

    invoke-virtual {p0, p1, p2}, Lorg/b/a/d/e;->a(ZLjava/lang/CharSequence;)J

    move-result-wide p1

    return-wide p1

    :cond_0
    not-int p1, p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lorg/b/a/d/i;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(ZLjava/lang/CharSequence;)J
    .locals 7

    iget-object v0, p0, Lorg/b/a/d/e;->j:[Lorg/b/a/d/e$a;

    iget v1, p0, Lorg/b/a/d/e;->k:I

    iget-boolean v2, p0, Lorg/b/a/d/e;->l:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v0, p0, Lorg/b/a/d/e;->j:[Lorg/b/a/d/e$a;

    invoke-virtual {v0}, [Lorg/b/a/d/e$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/b/a/d/e$a;

    iput-object v0, p0, Lorg/b/a/d/e;->j:[Lorg/b/a/d/e$a;

    iput-boolean v3, p0, Lorg/b/a/d/e;->l:Z

    :cond_0
    invoke-static {v0, v1}, Lorg/b/a/d/e;->a([Lorg/b/a/d/e$a;I)V

    if-lez v1, :cond_1

    invoke-static {}, Lorg/b/a/h;->i()Lorg/b/a/h;

    move-result-object v2

    iget-object v4, p0, Lorg/b/a/d/e;->a:Lorg/b/a/a;

    invoke-virtual {v2, v4}, Lorg/b/a/h;->a(Lorg/b/a/a;)Lorg/b/a/g;

    move-result-object v2

    invoke-static {}, Lorg/b/a/h;->f()Lorg/b/a/h;

    move-result-object v4

    iget-object v5, p0, Lorg/b/a/d/e;->a:Lorg/b/a/a;

    invoke-virtual {v4, v5}, Lorg/b/a/h;->a(Lorg/b/a/a;)Lorg/b/a/g;

    move-result-object v4

    aget-object v5, v0, v3

    iget-object v5, v5, Lorg/b/a/d/e$a;->a:Lorg/b/a/c;

    invoke-virtual {v5}, Lorg/b/a/c;->d()Lorg/b/a/g;

    move-result-object v5

    invoke-static {v5, v2}, Lorg/b/a/d/e;->a(Lorg/b/a/g;Lorg/b/a/g;)I

    move-result v2

    if-ltz v2, :cond_1

    invoke-static {v5, v4}, Lorg/b/a/d/e;->a(Lorg/b/a/g;Lorg/b/a/g;)I

    move-result v2

    if-gtz v2, :cond_1

    invoke-static {}, Lorg/b/a/d;->s()Lorg/b/a/d;

    move-result-object v0

    iget v1, p0, Lorg/b/a/d/e;->d:I

    invoke-virtual {p0, v0, v1}, Lorg/b/a/d/e;->a(Lorg/b/a/d;I)V

    invoke-virtual {p0, p1, p2}, Lorg/b/a/d/e;->a(ZLjava/lang/CharSequence;)J

    move-result-wide p1

    return-wide p1

    :cond_1
    iget-wide v4, p0, Lorg/b/a/d/e;->b:J

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    :try_start_0
    aget-object v6, v0, v2

    invoke-virtual {v6, v4, v5, p1}, Lorg/b/a/d/e$a;->a(JZ)J

    move-result-wide v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_2
    if-eqz p1, :cond_5

    const/4 p1, 0x0

    :goto_1
    if-ge p1, v1, :cond_5

    aget-object v2, v0, p1

    add-int/lit8 v6, v1, -0x1

    if-ne p1, v6, :cond_3

    const/4 v6, 0x1

    goto :goto_2

    :cond_3
    const/4 v6, 0x0

    :goto_2
    invoke-virtual {v2, v4, v5, v6}, Lorg/b/a/d/e$a;->a(JZ)J

    move-result-wide v4
    :try_end_0
    .catch Lorg/b/a/i; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :goto_3
    if-eqz p2, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot parse \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x22

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/b/a/i;->a(Ljava/lang/String;)V

    :cond_4
    throw p1

    :cond_5
    iget-object p1, p0, Lorg/b/a/d/e;->h:Ljava/lang/Integer;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lorg/b/a/d/e;->h:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-long p1, p1

    sub-long/2addr v4, p1

    return-wide v4

    :cond_6
    iget-object p1, p0, Lorg/b/a/d/e;->g:Lorg/b/a/f;

    if-eqz p1, :cond_8

    iget-object p1, p0, Lorg/b/a/d/e;->g:Lorg/b/a/f;

    invoke-virtual {p1, v4, v5}, Lorg/b/a/f;->e(J)I

    move-result p1

    int-to-long v0, p1

    sub-long/2addr v4, v0

    iget-object v0, p0, Lorg/b/a/d/e;->g:Lorg/b/a/f;

    invoke-virtual {v0, v4, v5}, Lorg/b/a/f;->b(J)I

    move-result v0

    if-eq p1, v0, :cond_8

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Illegal instant due to time zone offset transition ("

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/b/a/d/e;->g:Lorg/b/a/f;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot parse \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\": "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_7
    new-instance p2, Lorg/b/a/j;

    invoke-direct {p2, p1}, Lorg/b/a/j;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    return-wide v4
.end method

.method public a(ZLjava/lang/String;)J
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/b/a/d/e;->a(ZLjava/lang/CharSequence;)J

    move-result-wide p1

    return-wide p1
.end method

.method public a()Lorg/b/a/a;
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/e;->a:Lorg/b/a/a;

    return-object v0
.end method

.method public a(Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/b/a/d/e;->m:Ljava/lang/Object;

    iput-object p1, p0, Lorg/b/a/d/e;->h:Ljava/lang/Integer;

    return-void
.end method

.method public a(Lorg/b/a/c;I)V
    .locals 1

    invoke-direct {p0}, Lorg/b/a/d/e;->g()Lorg/b/a/d/e$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/d/e$a;->a(Lorg/b/a/c;I)V

    return-void
.end method

.method public a(Lorg/b/a/d;I)V
    .locals 2

    invoke-direct {p0}, Lorg/b/a/d/e;->g()Lorg/b/a/d/e$a;

    move-result-object v0

    iget-object v1, p0, Lorg/b/a/d/e;->a:Lorg/b/a/a;

    invoke-virtual {p1, v1}, Lorg/b/a/d;->a(Lorg/b/a/a;)Lorg/b/a/c;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lorg/b/a/d/e$a;->a(Lorg/b/a/c;I)V

    return-void
.end method

.method public a(Lorg/b/a/d;Ljava/lang/String;Ljava/util/Locale;)V
    .locals 2

    invoke-direct {p0}, Lorg/b/a/d/e;->g()Lorg/b/a/d/e$a;

    move-result-object v0

    iget-object v1, p0, Lorg/b/a/d/e;->a:Lorg/b/a/a;

    invoke-virtual {p1, v1}, Lorg/b/a/d;->a(Lorg/b/a/a;)Lorg/b/a/c;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lorg/b/a/d/e$a;->a(Lorg/b/a/c;Ljava/lang/String;Ljava/util/Locale;)V

    return-void
.end method

.method public a(Lorg/b/a/f;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/b/a/d/e;->m:Ljava/lang/Object;

    iput-object p1, p0, Lorg/b/a/d/e;->g:Lorg/b/a/f;

    return-void
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lorg/b/a/d/e$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lorg/b/a/d/e$b;

    invoke-virtual {v0, p0}, Lorg/b/a/d/e$b;->a(Lorg/b/a/d/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lorg/b/a/d/e;->m:Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b()Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/e;->c:Ljava/util/Locale;

    return-object v0
.end method

.method public c()Lorg/b/a/f;
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/e;->g:Lorg/b/a/f;

    return-object v0
.end method

.method public d()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/e;->h:Ljava/lang/Integer;

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/e;->i:Ljava/lang/Integer;

    return-object v0
.end method

.method public f()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/e;->m:Ljava/lang/Object;

    if-nez v0, :cond_0

    new-instance v0, Lorg/b/a/d/e$b;

    invoke-direct {v0, p0}, Lorg/b/a/d/e$b;-><init>(Lorg/b/a/d/e;)V

    iput-object v0, p0, Lorg/b/a/d/e;->m:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lorg/b/a/d/e;->m:Ljava/lang/Object;

    return-object v0
.end method
