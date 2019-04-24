.class public Lcom/google/code/regexp/GroupInfo;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private groupIndex:I

.field private pos:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/code/regexp/GroupInfo;->groupIndex:I

    iput p2, p0, Lcom/google/code/regexp/GroupInfo;->pos:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    instance-of v2, p1, Lcom/google/code/regexp/GroupInfo;

    if-nez v2, :cond_2

    return v1

    :cond_2
    check-cast p1, Lcom/google/code/regexp/GroupInfo;

    iget v2, p0, Lcom/google/code/regexp/GroupInfo;->pos:I

    iget v3, p1, Lcom/google/code/regexp/GroupInfo;->pos:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lcom/google/code/regexp/GroupInfo;->groupIndex:I

    iget p1, p1, Lcom/google/code/regexp/GroupInfo;->groupIndex:I

    if-ne v2, p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public groupIndex()I
    .locals 1

    iget v0, p0, Lcom/google/code/regexp/GroupInfo;->groupIndex:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/google/code/regexp/GroupInfo;->pos:I

    iget v1, p0, Lcom/google/code/regexp/GroupInfo;->groupIndex:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public pos()I
    .locals 1

    iget v0, p0, Lcom/google/code/regexp/GroupInfo;->pos:I

    return v0
.end method
