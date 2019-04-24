.class public final Lcom/squareup/haha/perflib/Field;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mName:Ljava/lang/String;

.field private final mType:Lcom/squareup/haha/perflib/Type;


# direct methods
.method public constructor <init>(Lcom/squareup/haha/perflib/Type;Ljava/lang/String;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/squareup/haha/perflib/Field;->mType:Lcom/squareup/haha/perflib/Type;

    .line 35
    iput-object p2, p0, Lcom/squareup/haha/perflib/Field;->mName:Ljava/lang/String;

    .line 36
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 50
    if-ne p0, p1, :cond_0

    .line 51
    const/4 v0, 0x1

    return v0

    .line 54
    :cond_0
    instance-of v0, p1, Lcom/squareup/haha/perflib/Field;

    if-nez v0, :cond_1

    .line 55
    const/4 v0, 0x0

    return v0

    .line 58
    :cond_1
    move-object v2, p1

    check-cast v2, Lcom/squareup/haha/perflib/Field;

    .line 60
    iget-object v0, p0, Lcom/squareup/haha/perflib/Field;->mType:Lcom/squareup/haha/perflib/Type;

    iget-object v1, v2, Lcom/squareup/haha/perflib/Field;->mType:Lcom/squareup/haha/perflib/Type;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/squareup/haha/perflib/Field;->mName:Ljava/lang/String;

    iget-object v1, v2, Lcom/squareup/haha/perflib/Field;->mName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/squareup/haha/perflib/Field;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lcom/squareup/haha/perflib/Type;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/squareup/haha/perflib/Field;->mType:Lcom/squareup/haha/perflib/Type;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .line 65
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/Object;

    iget-object v0, p0, Lcom/squareup/haha/perflib/Field;->mType:Lcom/squareup/haha/perflib/Type;

    const/4 v1, 0x0

    aput-object v0, v2, v1

    iget-object v0, p0, Lcom/squareup/haha/perflib/Field;->mName:Ljava/lang/String;

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 1078
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    .line 65
    return v0
.end method
