.class public Lcom/huawei/openalliance/ad/annotations/a/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/annotations/a/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/huawei/openalliance/ad/annotations/a/b<Lcom/huawei/openalliance/ad/annotations/f;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/Object;Ljava/lang/reflect/Field;Lcom/huawei/openalliance/ad/annotations/f;Ljava/lang/Class;)V
    .locals 12

    invoke-static/range {p4 .. p4}, Lcom/huawei/openalliance/ad/utils/x;->a(Ljava/lang/Class;)[Ljava/lang/reflect/Field;

    move-result-object v5

    invoke-virtual {p2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x0

    array-length v8, v5

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_3

    aget-object v10, v5, v9

    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_1

    if-eq v11, v6, :cond_0

    invoke-virtual {v11, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v7, 0x1

    goto :goto_1

    :cond_1
    if-nez v11, :cond_2

    if-nez v6, :cond_2

    const/4 v7, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    if-nez v7, :cond_6

    const-string v0, "ValueConstraintProcessor"

    const-string v1, "%s - field %s not in constraint values, set default value"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v9

    const-class v0, Ljava/lang/String;

    if-ne v0, v9, :cond_4

    invoke-interface {p3}, Lcom/huawei/openalliance/ad/annotations/f;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-eq v0, v9, :cond_5

    const-class v0, Ljava/lang/Integer;

    if-ne v0, v9, :cond_6

    :cond_5
    invoke-interface {p3}, Lcom/huawei/openalliance/ad/annotations/f;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_6
    :goto_2
    return-void
.end method

.method private b(Ljava/lang/Object;Ljava/lang/reflect/Field;Lcom/huawei/openalliance/ad/annotations/f;)V
    .locals 11

    invoke-interface {p3}, Lcom/huawei/openalliance/ad/annotations/f;->e()[I

    move-result-object v5

    array-length v0, v5

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    const/4 v0, 0x0

    aget v6, v5, v0

    const/4 v0, 0x1

    aget v7, v5, v0

    if-ge v7, v6, :cond_0

    move v8, v6

    move v6, v7

    move v7, v8

    :cond_0
    invoke-virtual {p2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    instance-of v0, v8, Ljava/lang/Number;

    if-eqz v0, :cond_2

    move-object v9, v8

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v10

    if-lt v10, v6, :cond_1

    if-le v10, v7, :cond_2

    :cond_1
    const-string v0, "ValueConstraintProcessor"

    const-string v1, "%s - field %s not in constraint range, set default value"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {p3}, Lcom/huawei/openalliance/ad/annotations/f;->f()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    goto :goto_0

    :cond_3
    const-string v0, "ValueConstraintProcessor"

    const-string v1, "%s - field %s the length of range constraint must be 2"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/reflect/Field;Lcom/huawei/openalliance/ad/annotations/f;)V
    .locals 2

    invoke-interface {p3}, Lcom/huawei/openalliance/ad/annotations/f;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Lcom/huawei/openalliance/ad/annotations/f;->b()Ljava/lang/Class;

    move-result-object v1

    const-class v0, Ljava/lang/Void;

    if-eq v1, v0, :cond_0

    invoke-direct {p0, p1, p2, p3, v1}, Lcom/huawei/openalliance/ad/annotations/a/c;->a(Ljava/lang/Object;Ljava/lang/reflect/Field;Lcom/huawei/openalliance/ad/annotations/f;Ljava/lang/Class;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/annotations/a/c;->b(Ljava/lang/Object;Ljava/lang/reflect/Field;Lcom/huawei/openalliance/ad/annotations/f;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/reflect/Field;Ljava/lang/annotation/Annotation;)V
    .locals 1

    move-object v0, p3

    check-cast v0, Lcom/huawei/openalliance/ad/annotations/f;

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/openalliance/ad/annotations/a/c;->a(Ljava/lang/Object;Ljava/lang/reflect/Field;Lcom/huawei/openalliance/ad/annotations/f;)V

    return-void
.end method
