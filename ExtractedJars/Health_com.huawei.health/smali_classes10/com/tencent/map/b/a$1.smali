.class Lcom/tencent/map/b/a$1;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/map/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/map/b/a;


# direct methods
.method private constructor <init>(Lcom/tencent/map/b/a;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/map/b/a$1;->a:Lcom/tencent/map/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tencent/map/b/a;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tencent/map/b/a$1;-><init>(Lcom/tencent/map/b/a;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    iget-object v0, p0, Lcom/tencent/map/b/a$1;->a:Lcom/tencent/map/b/a;

    invoke-static {v0, p1}, Lcom/tencent/map/b/a;->a(Lcom/tencent/map/b/a;Ljava/lang/String;)I

    move-result v4

    mul-int/lit8 v0, v4, 0x9

    add-int/lit8 v0, v0, 0xa

    div-int/lit8 v0, v0, 0x3

    add-int/lit8 v0, v0, 0x24

    and-int/lit8 v5, v0, 0x1f

    const/4 v0, 0x4

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    sget-object v1, Lcom/tencent/map/b/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    mul-int/lit8 v0, v4, 0x5

    add-int/lit8 v0, v0, 0xb

    div-int/lit8 v0, v0, 0x5

    and-int/lit8 v5, v0, 0x1f

    const/4 v0, 0x7

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    sget-object v1, Lcom/tencent/map/b/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-eq v0, v1, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    add-int/lit8 v0, v4, 0xa

    div-int/lit8 v0, v0, 0x3

    shl-int/lit8 v0, v0, 0x3

    and-int/lit8 v5, v0, 0x1f

    const/16 v0, 0xc

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    sget-object v1, Lcom/tencent/map/b/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-eq v0, v1, :cond_2

    const/4 v0, 0x0

    return v0

    :cond_2
    mul-int/lit8 v0, v4, 0x3

    add-int/lit8 v0, v0, 0x13

    div-int/lit8 v0, v0, 0x9

    and-int/lit8 v5, v0, 0x1f

    const/16 v0, 0xe

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    sget-object v1, Lcom/tencent/map/b/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-eq v0, v1, :cond_3

    const/4 v0, 0x0

    return v0

    :cond_3
    mul-int/lit8 v0, v4, 0x3

    add-int/lit8 v0, v0, 0x27

    div-int/lit8 v0, v0, 0x8

    and-int/lit8 v5, v0, 0x1f

    const/16 v0, 0x13

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    sget-object v1, Lcom/tencent/map/b/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-eq v0, v1, :cond_4

    const/4 v0, 0x0

    return v0

    :cond_4
    div-int/lit8 v0, v4, 0x17

    add-int/lit8 v0, v0, 0x43

    div-int/lit8 v0, v0, 0x7

    and-int/lit8 v5, v0, 0x1f

    const/16 v0, 0x15

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    sget-object v1, Lcom/tencent/map/b/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-eq v0, v1, :cond_5

    const/4 v0, 0x0

    return v0

    :cond_5
    add-int/lit8 v0, v4, 0x17

    div-int/lit8 v0, v0, 0x6

    add-int/lit8 v0, v0, 0x3

    mul-int/lit8 v0, v0, 0x7

    and-int/lit8 v5, v0, 0x1f

    const/16 v0, 0x1a

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    sget-object v1, Lcom/tencent/map/b/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-eq v0, v1, :cond_6

    const/4 v0, 0x0

    return v0

    :cond_6
    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v5, v0, :cond_7

    shr-int/lit8 v0, v4, 0x8

    and-int/lit16 v0, v0, 0xff

    sget-object v1, Lcom/tencent/map/b/i;->b:[I

    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Lcom/tencent/map/b/i;->a(C)I

    move-result v2

    xor-int/2addr v2, v4

    and-int/lit16 v2, v2, 0xff

    aget v1, v1, v2

    xor-int v4, v0, v1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_7
    and-int/lit8 v5, v4, 0x1f

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    sget-object v1, Lcom/tencent/map/b/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-eq v0, v1, :cond_8

    const/4 v0, 0x0

    return v0

    :cond_8
    shr-int/lit8 v0, v4, 0x5

    and-int/lit8 v5, v0, 0x1f

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    sget-object v1, Lcom/tencent/map/b/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-eq v0, v1, :cond_9

    const/4 v0, 0x0

    return v0

    :cond_9
    const/4 v0, 0x1

    return v0
.end method
