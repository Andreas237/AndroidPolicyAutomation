.class public Lo/frn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/lang/Comparable<Lo/frn;>;"
    }
.end annotation


# instance fields
.field private c:I

.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    const/16 v0, 0xfe

    iput v0, p0, Lo/frn;->c:I

    .line 46
    const/16 v0, 0xfd

    iput v0, p0, Lo/frn;->d:I

    .line 47
    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput p2, p0, Lo/frn;->d:I

    .line 57
    iput p1, p0, Lo/frn;->c:I

    .line 58
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 65
    iget v0, p0, Lo/frn;->c:I

    return v0
.end method

.method public b()I
    .locals 1

    .line 61
    iget v0, p0, Lo/frn;->d:I

    return v0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 31
    move-object v0, p1

    check-cast v0, Lo/frn;

    invoke-virtual {p0, v0}, Lo/frn;->e(Lo/frn;)I

    move-result v0

    return v0
.end method

.method public e(Lo/frn;)I
    .locals 2

    .line 87
    iget v0, p0, Lo/frn;->c:I

    invoke-virtual {p1}, Lo/frn;->a()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 88
    iget v0, p0, Lo/frn;->d:I

    invoke-virtual {p1}, Lo/frn;->b()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 89
    const/4 v0, 0x1

    return v0

    .line 90
    :cond_0
    iget v0, p0, Lo/frn;->d:I

    invoke-virtual {p1}, Lo/frn;->b()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 91
    const/4 v0, -0x1

    return v0

    .line 93
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 95
    :cond_2
    iget v0, p0, Lo/frn;->c:I

    invoke-virtual {p1}, Lo/frn;->a()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 96
    const/4 v0, 0x1

    return v0

    .line 98
    :cond_3
    const/4 v0, -0x1

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 113
    if-ne p0, p1, :cond_0

    .line 114
    const/4 v0, 0x1

    return v0

    .line 115
    :cond_0
    if-nez p1, :cond_1

    .line 116
    const/4 v0, 0x0

    return v0

    .line 117
    :cond_1
    instance-of v0, p1, Lo/frn;

    if-nez v0, :cond_2

    .line 118
    const/4 v0, 0x0

    return v0

    .line 120
    :cond_2
    move-object v2, p1

    check-cast v2, Lo/frn;

    .line 121
    iget v0, p0, Lo/frn;->c:I

    iget v1, v2, Lo/frn;->c:I

    if-ne v0, v1, :cond_3

    iget v0, p0, Lo/frn;->d:I

    iget v1, v2, Lo/frn;->d:I

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 104
    const/16 v2, 0x1f

    .line 105
    const/4 v3, 0x1

    .line 106
    iget v0, p0, Lo/frn;->c:I

    add-int/lit8 v3, v0, 0x1f

    .line 107
    mul-int/lit8 v0, v3, 0x1f

    iget v1, p0, Lo/frn;->d:I

    add-int v3, v0, v1

    .line 108
    return v3
.end method
