.class public Lcom/tencent/stat/a/c;
.super Ljava/lang/Object;


# instance fields
.field a:Ljava/lang/String;

.field b:[Ljava/lang/String;

.field c:Ljava/util/Properties;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/a/c;->c:Ljava/util/Properties;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;Ljava/util/Properties;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/a/c;->c:Ljava/util/Properties;

    iput-object p1, p0, Lcom/tencent/stat/a/c;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/tencent/stat/a/c;->b:[Ljava/lang/String;

    iput-object p3, p0, Lcom/tencent/stat/a/c;->c:Ljava/util/Properties;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    instance-of v0, p1, Lcom/tencent/stat/a/c;

    if-eqz v0, :cond_5

    move-object v2, p1

    check-cast v2, Lcom/tencent/stat/a/c;

    iget-object v0, p0, Lcom/tencent/stat/a/c;->a:Ljava/lang/String;

    iget-object v1, v2, Lcom/tencent/stat/a/c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/stat/a/c;->b:[Ljava/lang/String;

    iget-object v1, v2, Lcom/tencent/stat/a/c;->b:[Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/tencent/stat/a/c;->c:Ljava/util/Properties;

    if-eqz v0, :cond_3

    if-eqz v3, :cond_2

    iget-object v0, p0, Lcom/tencent/stat/a/c;->c:Ljava/util/Properties;

    iget-object v1, v2, Lcom/tencent/stat/a/c;->c:Ljava/util/Properties;

    invoke-virtual {v0, v1}, Ljava/util/Properties;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_3
    if-eqz v3, :cond_4

    iget-object v0, v2, Lcom/tencent/stat/a/c;->c:Ljava/util/Properties;

    if-nez v0, :cond_4

    const/4 v0, 0x1

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    return v0

    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/tencent/stat/a/c;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/tencent/stat/a/c;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    :cond_0
    iget-object v0, p0, Lcom/tencent/stat/a/c;->b:[Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/tencent/stat/a/c;->b:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v2, v0

    :cond_1
    iget-object v0, p0, Lcom/tencent/stat/a/c;->c:Ljava/util/Properties;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/tencent/stat/a/c;->c:Ljava/util/Properties;

    invoke-virtual {v0}, Ljava/util/Properties;->hashCode()I

    move-result v0

    xor-int/2addr v2, v0

    :cond_2
    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v2, p0, Lcom/tencent/stat/a/c;->a:Ljava/lang/String;

    const-string v3, ""

    iget-object v0, p0, Lcom/tencent/stat/a/c;->b:[Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/stat/a/c;->b:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v3, v0, v1

    const/4 v4, 0x1

    :goto_0
    iget-object v0, p0, Lcom/tencent/stat/a/c;->b:[Ljava/lang/String;

    array-length v0, v0

    if-ge v4, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/stat/a/c;->b:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_1
    iget-object v0, p0, Lcom/tencent/stat/a/c;->c:Ljava/util/Properties;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/stat/a/c;->c:Ljava/util/Properties;

    invoke-virtual {v1}, Ljava/util/Properties;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
