.class final Lcom/google/c/b/ac;
.super Lcom/google/c/b/n;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/c/b/ac$b;,
        Lcom/google/c/b/ac$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/c/b/n<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field private final transient b:[Ljava/util/Map$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private final transient c:[Lcom/google/c/b/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/google/c/b/o<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private final transient d:I


# direct methods
.method private constructor <init>([Ljava/util/Map$Entry;[Lcom/google/c/b/o;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;[",
            "Lcom/google/c/b/o<",
            "TK;TV;>;I)V"
        }
    .end annotation

    .line 91
    invoke-direct {p0}, Lcom/google/c/b/n;-><init>()V

    .line 92
    iput-object p1, p0, Lcom/google/c/b/ac;->b:[Ljava/util/Map$Entry;

    .line 93
    iput-object p2, p0, Lcom/google/c/b/ac;->c:[Lcom/google/c/b/o;

    .line 94
    iput p3, p0, Lcom/google/c/b/ac;->d:I

    return-void
.end method

.method static a(I[Ljava/util/Map$Entry;)Lcom/google/c/b/ac;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(I[",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;)",
            "Lcom/google/c/b/ac<",
            "TK;TV;>;"
        }
    .end annotation

    .line 57
    array-length v0, p1

    invoke-static {p0, v0}, Lcom/google/c/a/h;->b(II)I

    .line 59
    array-length v0, p1

    if-ne p0, v0, :cond_0

    move-object v0, p1

    goto :goto_0

    .line 62
    :cond_0
    invoke-static {p0}, Lcom/google/c/b/o;->a(I)[Lcom/google/c/b/o;

    move-result-object v0

    :goto_0
    const-wide v1, 0x3ff3333333333333L    # 1.2

    .line 64
    invoke-static {p0, v1, v2}, Lcom/google/c/b/h;->a(ID)I

    move-result v1

    .line 65
    invoke-static {v1}, Lcom/google/c/b/o;->a(I)[Lcom/google/c/b/o;

    move-result-object v2

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    if-ge v5, p0, :cond_4

    .line 68
    aget-object v6, p1, v5

    .line 69
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    .line 70
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    .line 71
    invoke-static {v7, v8}, Lcom/google/c/b/e;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v9

    invoke-static {v9}, Lcom/google/c/b/h;->a(I)I

    move-result v9

    and-int/2addr v9, v1

    .line 73
    aget-object v10, v2, v9

    if-nez v10, :cond_3

    .line 77
    instance-of v11, v6, Lcom/google/c/b/o;

    if-eqz v11, :cond_1

    move-object v11, v6

    check-cast v11, Lcom/google/c/b/o;

    .line 78
    invoke-virtual {v11}, Lcom/google/c/b/o;->c()Z

    move-result v11

    if-eqz v11, :cond_1

    const/4 v11, 0x1

    goto :goto_2

    :cond_1
    const/4 v11, 0x0

    :goto_2
    if-eqz v11, :cond_2

    .line 80
    check-cast v6, Lcom/google/c/b/o;

    goto :goto_3

    :cond_2
    new-instance v6, Lcom/google/c/b/o;

    invoke-direct {v6, v7, v8}, Lcom/google/c/b/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    .line 82
    :cond_3
    new-instance v6, Lcom/google/c/b/o$a;

    invoke-direct {v6, v7, v8, v10}, Lcom/google/c/b/o$a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/c/b/o;)V

    .line 84
    :goto_3
    aput-object v6, v2, v9

    .line 85
    aput-object v6, v0, v5

    .line 86
    invoke-static {v7, v6, v10}, Lcom/google/c/b/ac;->a(Ljava/lang/Object;Ljava/util/Map$Entry;Lcom/google/c/b/o;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 88
    :cond_4
    new-instance p0, Lcom/google/c/b/ac;

    invoke-direct {p0, v0, v2, v1}, Lcom/google/c/b/ac;-><init>([Ljava/util/Map$Entry;[Lcom/google/c/b/o;I)V

    return-object p0
.end method

.method static a(Ljava/lang/Object;[Lcom/google/c/b/o;I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "[",
            "Lcom/google/c/b/o<",
            "*TV;>;I)TV;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 121
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Lcom/google/c/b/h;->a(I)I

    move-result v1

    and-int/2addr p2, v1

    .line 122
    aget-object p1, p1, p2

    :goto_0
    if-eqz p1, :cond_2

    .line 125
    invoke-virtual {p1}, Lcom/google/c/b/o;->getKey()Ljava/lang/Object;

    move-result-object p2

    .line 133
    invoke-virtual {p0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 134
    invoke-virtual {p1}, Lcom/google/c/b/o;->getValue()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 124
    :cond_1
    invoke-virtual {p1}, Lcom/google/c/b/o;->a()Lcom/google/c/b/o;

    move-result-object p1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method static a(Ljava/lang/Object;Ljava/util/Map$Entry;Lcom/google/c/b/o;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/Map$Entry<",
            "**>;",
            "Lcom/google/c/b/o<",
            "**>;)V"
        }
    .end annotation

    :goto_0
    if-eqz p2, :cond_0

    .line 100
    invoke-virtual {p2}, Lcom/google/c/b/o;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "key"

    invoke-static {v0, v1, p1, p2}, Lcom/google/c/b/ac;->a(ZLjava/lang/String;Ljava/util/Map$Entry;Ljava/util/Map$Entry;)V

    .line 99
    invoke-virtual {p2}, Lcom/google/c/b/o;->a()Lcom/google/c/b/o;

    move-result-object p2

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/google/c/b/ac;)[Ljava/util/Map$Entry;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/google/c/b/ac;->b:[Ljava/util/Map$Entry;

    return-object p0
.end method


# virtual methods
.method g()Lcom/google/c/b/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/s<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 152
    new-instance v0, Lcom/google/c/b/p$a;

    iget-object v1, p0, Lcom/google/c/b/ac;->b:[Ljava/util/Map$Entry;

    invoke-direct {v0, p0, v1}, Lcom/google/c/b/p$a;-><init>(Lcom/google/c/b/n;[Ljava/util/Map$Entry;)V

    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .line 113
    iget-object v0, p0, Lcom/google/c/b/ac;->c:[Lcom/google/c/b/o;

    iget v1, p0, Lcom/google/c/b/ac;->d:I

    invoke-static {p1, v0, v1}, Lcom/google/c/b/ac;->a(Ljava/lang/Object;[Lcom/google/c/b/o;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method i()Lcom/google/c/b/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/s<",
            "TK;>;"
        }
    .end annotation

    .line 157
    new-instance v0, Lcom/google/c/b/ac$a;

    invoke-direct {v0, p0}, Lcom/google/c/b/ac$a;-><init>(Lcom/google/c/b/ac;)V

    return-object v0
.end method

.method k()Lcom/google/c/b/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/k<",
            "TV;>;"
        }
    .end annotation

    .line 212
    new-instance v0, Lcom/google/c/b/ac$b;

    invoke-direct {v0, p0}, Lcom/google/c/b/ac$b;-><init>(Lcom/google/c/b/ac;)V

    return-object v0
.end method

.method l()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public size()I
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/google/c/b/ac;->b:[Ljava/util/Map$Entry;

    array-length v0, v0

    return v0
.end method
