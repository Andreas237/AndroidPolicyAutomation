.class public Lorg/b/a/d/a;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lorg/b/a/d/b;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/concurrent/atomic/AtomicReferenceArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceArray<",
            "Lorg/b/a/d/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lorg/b/a/d/a;->a:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    sput-object v0, Lorg/b/a/d/a;->b:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    return-void
.end method

.method private static a(Ljava/lang/String;[I)Ljava/lang/String;
    .locals 13

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    aget v2, p1, v1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x5a

    const/16 v6, 0x41

    if-lt v4, v6, :cond_0

    if-le v4, v5, :cond_1

    :cond_0
    const/16 v7, 0x7a

    const/16 v8, 0x61

    if-lt v4, v8, :cond_2

    if-gt v4, v7, :cond_2

    :cond_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_0
    add-int/lit8 v5, v2, 0x1

    if-ge v5, v3, :cond_8

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ne v6, v4, :cond_8

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v2, v5

    goto :goto_0

    :cond_2
    const/16 v4, 0x27

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v9, 0x0

    :goto_1
    if-ge v2, v3, :cond_8

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-ne v10, v4, :cond_4

    add-int/lit8 v11, v2, 0x1

    if-ge v11, v3, :cond_3

    invoke-virtual {p0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-ne v12, v4, :cond_3

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v2, v11

    goto :goto_2

    :cond_3
    xor-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_4
    if-nez v9, :cond_7

    if-lt v10, v6, :cond_5

    if-le v10, v5, :cond_6

    :cond_5
    if-lt v10, v8, :cond_7

    if-gt v10, v7, :cond_7

    :cond_6
    add-int/lit8 v2, v2, -0x1

    goto :goto_3

    :cond_7
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_8
    :goto_3
    aput v2, p1, v1

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/String;)Lorg/b/a/d/b;
    .locals 0

    invoke-static {p0}, Lorg/b/a/d/a;->c(Ljava/lang/String;)Lorg/b/a/d/b;

    move-result-object p0

    return-object p0
.end method

.method private static a(Lorg/b/a/d/c;Ljava/lang/String;)V
    .locals 11

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x1

    new-array v8, v7, [I

    const/4 v9, 0x0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v6, :cond_e

    aput v0, v8, v9

    invoke-static {p1, v8}, Lorg/b/a/d/a;->a(Ljava/lang/String;[I)Ljava/lang/String;

    move-result-object v0

    aget v10, v8, v9

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x4

    sparse-switch v2, :sswitch_data_0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Illegal pattern component: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :sswitch_0
    if-lt v1, v4, :cond_1

    invoke-virtual {p0}, Lorg/b/a/d/c;->i()Lorg/b/a/d/c;

    goto/16 :goto_3

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/b/a/d/c;->a(Ljava/util/Map;)Lorg/b/a/d/c;

    goto/16 :goto_3

    :sswitch_1
    invoke-virtual {p0, v1}, Lorg/b/a/d/c;->j(I)Lorg/b/a/d/c;

    goto/16 :goto_3

    :sswitch_2
    invoke-virtual {p0, v1}, Lorg/b/a/d/c;->a(I)Lorg/b/a/d/c;

    goto/16 :goto_3

    :sswitch_3
    invoke-virtual {p0, v1}, Lorg/b/a/d/c;->b(I)Lorg/b/a/d/c;

    goto/16 :goto_3

    :sswitch_4
    invoke-virtual {p0, v1}, Lorg/b/a/d/c;->d(I)Lorg/b/a/d/c;

    goto/16 :goto_3

    :sswitch_5
    invoke-virtual {p0, v1}, Lorg/b/a/d/c;->f(I)Lorg/b/a/d/c;

    goto/16 :goto_3

    :sswitch_6
    invoke-virtual {p0, v1}, Lorg/b/a/d/c;->g(I)Lorg/b/a/d/c;

    goto/16 :goto_3

    :sswitch_7
    invoke-virtual {p0, v1}, Lorg/b/a/d/c;->h(I)Lorg/b/a/d/c;

    goto/16 :goto_3

    :sswitch_8
    invoke-virtual {p0}, Lorg/b/a/d/c;->c()Lorg/b/a/d/c;

    goto/16 :goto_3

    :sswitch_9
    if-ne v1, v7, :cond_2

    const/4 v1, 0x0

    const-string v2, "Z"

    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x2

    const/4 v5, 0x2

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lorg/b/a/d/c;->a(Ljava/lang/String;Ljava/lang/String;ZII)Lorg/b/a/d/c;

    goto/16 :goto_3

    :cond_2
    if-ne v1, v3, :cond_3

    const/4 v1, 0x0

    const-string v2, "Z"

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lorg/b/a/d/c;->j()Lorg/b/a/d/c;

    goto/16 :goto_3

    :sswitch_a
    if-ne v1, v3, :cond_6

    add-int/lit8 v0, v10, 0x1

    if-ge v0, v6, :cond_4

    aget v0, v8, v9

    add-int/2addr v0, v7

    aput v0, v8, v9

    invoke-static {p1, v8}, Lorg/b/a/d/a;->a(Ljava/lang/String;[I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/b/a/d/a;->b(Ljava/lang/String;)Z

    move-result v0

    xor-int/2addr v0, v7

    aget v1, v8, v9

    sub-int/2addr v1, v7

    aput v1, v8, v9

    goto :goto_2

    :cond_4
    const/4 v0, 0x1

    :goto_2
    const/16 v1, 0x78

    if-eq v2, v1, :cond_5

    new-instance v1, Lorg/b/a/b;

    invoke-direct {v1}, Lorg/b/a/b;-><init>()V

    invoke-virtual {v1}, Lorg/b/a/b;->c()I

    move-result v1

    add-int/lit8 v1, v1, -0x1e

    invoke-virtual {p0, v1, v0}, Lorg/b/a/d/c;->a(IZ)Lorg/b/a/d/c;

    goto/16 :goto_3

    :cond_5
    new-instance v1, Lorg/b/a/b;

    invoke-direct {v1}, Lorg/b/a/b;-><init>()V

    invoke-virtual {v1}, Lorg/b/a/b;->d()I

    move-result v1

    add-int/lit8 v1, v1, -0x1e

    invoke-virtual {p0, v1, v0}, Lorg/b/a/d/c;->b(IZ)Lorg/b/a/d/c;

    goto/16 :goto_3

    :cond_6
    const/16 v0, 0x9

    add-int/lit8 v3, v10, 0x1

    if-ge v3, v6, :cond_8

    aget v3, v8, v9

    add-int/2addr v3, v7

    aput v3, v8, v9

    invoke-static {p1, v8}, Lorg/b/a/d/a;->a(Ljava/lang/String;[I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/b/a/d/a;->b(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    move v0, v1

    :cond_7
    aget v3, v8, v9

    sub-int/2addr v3, v7

    aput v3, v8, v9

    :cond_8
    const/16 v3, 0x59

    if-eq v2, v3, :cond_9

    packed-switch v2, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    invoke-virtual {p0, v1, v0}, Lorg/b/a/d/c;->e(II)Lorg/b/a/d/c;

    goto :goto_3

    :pswitch_1
    invoke-virtual {p0, v1, v0}, Lorg/b/a/d/c;->d(II)Lorg/b/a/d/c;

    goto :goto_3

    :cond_9
    invoke-virtual {p0, v1, v0}, Lorg/b/a/d/c;->f(II)Lorg/b/a/d/c;

    goto :goto_3

    :sswitch_b
    invoke-virtual {p0, v1, v1}, Lorg/b/a/d/c;->a(II)Lorg/b/a/d/c;

    goto :goto_3

    :sswitch_c
    const/4 v0, 0x3

    if-lt v1, v0, :cond_b

    if-lt v1, v4, :cond_a

    invoke-virtual {p0}, Lorg/b/a/d/c;->f()Lorg/b/a/d/c;

    goto :goto_3

    :cond_a
    invoke-virtual {p0}, Lorg/b/a/d/c;->g()Lorg/b/a/d/c;

    goto :goto_3

    :cond_b
    invoke-virtual {p0, v1}, Lorg/b/a/d/c;->k(I)Lorg/b/a/d/c;

    goto :goto_3

    :sswitch_d
    invoke-virtual {p0, v1}, Lorg/b/a/d/c;->e(I)Lorg/b/a/d/c;

    goto :goto_3

    :sswitch_e
    invoke-virtual {p0, v1}, Lorg/b/a/d/c;->c(I)Lorg/b/a/d/c;

    goto :goto_3

    :sswitch_f
    invoke-virtual {p0}, Lorg/b/a/d/c;->h()Lorg/b/a/d/c;

    goto :goto_3

    :sswitch_10
    if-lt v1, v4, :cond_c

    invoke-virtual {p0}, Lorg/b/a/d/c;->d()Lorg/b/a/d/c;

    goto :goto_3

    :cond_c
    invoke-virtual {p0}, Lorg/b/a/d/c;->e()Lorg/b/a/d/c;

    goto :goto_3

    :sswitch_11
    invoke-virtual {p0, v1}, Lorg/b/a/d/c;->i(I)Lorg/b/a/d/c;

    goto :goto_3

    :sswitch_12
    invoke-virtual {p0, v1, v1}, Lorg/b/a/d/c;->g(II)Lorg/b/a/d/c;

    goto :goto_3

    :sswitch_13
    invoke-virtual {v0, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v1, v7, :cond_d

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p0, v0}, Lorg/b/a/d/c;->a(C)Lorg/b/a/d/c;

    goto :goto_3

    :cond_d
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lorg/b/a/d/c;->a(Ljava/lang/String;)Lorg/b/a/d/c;

    :goto_3
    add-int/lit8 v0, v10, 0x1

    goto/16 :goto_0

    :cond_e
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x27 -> :sswitch_13
        0x43 -> :sswitch_12
        0x44 -> :sswitch_11
        0x45 -> :sswitch_10
        0x47 -> :sswitch_f
        0x48 -> :sswitch_e
        0x4b -> :sswitch_d
        0x4d -> :sswitch_c
        0x53 -> :sswitch_b
        0x59 -> :sswitch_a
        0x5a -> :sswitch_9
        0x61 -> :sswitch_8
        0x64 -> :sswitch_7
        0x65 -> :sswitch_6
        0x68 -> :sswitch_5
        0x6b -> :sswitch_4
        0x6d -> :sswitch_3
        0x73 -> :sswitch_2
        0x77 -> :sswitch_1
        0x78 -> :sswitch_a
        0x79 -> :sswitch_a
        0x7a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x78
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static b(Ljava/lang/String;)Z
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/4 v2, 0x1

    sparse-switch p0, :sswitch_data_0

    return v1

    :sswitch_0
    const/4 p0, 0x2

    if-gt v0, p0, :cond_0

    :sswitch_1
    return v2

    :cond_0
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x43 -> :sswitch_1
        0x44 -> :sswitch_1
        0x46 -> :sswitch_1
        0x48 -> :sswitch_1
        0x4b -> :sswitch_1
        0x4d -> :sswitch_0
        0x53 -> :sswitch_1
        0x57 -> :sswitch_1
        0x59 -> :sswitch_1
        0x63 -> :sswitch_1
        0x64 -> :sswitch_1
        0x65 -> :sswitch_1
        0x68 -> :sswitch_1
        0x6b -> :sswitch_1
        0x6d -> :sswitch_1
        0x73 -> :sswitch_1
        0x77 -> :sswitch_1
        0x78 -> :sswitch_1
        0x79 -> :sswitch_1
    .end sparse-switch
.end method

.method private static c(Ljava/lang/String;)Lorg/b/a/d/b;
    .locals 3

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lorg/b/a/d/a;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/b/a/d/b;

    if-nez v0, :cond_1

    new-instance v0, Lorg/b/a/d/c;

    invoke-direct {v0}, Lorg/b/a/d/c;-><init>()V

    invoke-static {v0, p0}, Lorg/b/a/d/a;->a(Lorg/b/a/d/c;Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/b/a/d/c;->a()Lorg/b/a/d/b;

    move-result-object v0

    sget-object v1, Lorg/b/a/d/a;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v1

    const/16 v2, 0x1f4

    if-ge v1, v2, :cond_1

    sget-object v1, Lorg/b/a/d/a;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/b/a/d/b;

    if-eqz p0, :cond_1

    move-object v0, p0

    :cond_1
    return-object v0

    :cond_2
    :goto_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid pattern specification"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
