.class public Lo/ou;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:F

.field private final e:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput p1, p0, Lo/ou;->e:F

    .line 34
    iput p2, p0, Lo/ou;->a:F

    .line 35
    return-void
.end method

.method public static a(Lo/ou;Lo/ou;)F
    .locals 4

    .line 123
    iget v0, p0, Lo/ou;->e:F

    iget v1, p0, Lo/ou;->a:F

    iget v2, p1, Lo/ou;->e:F

    iget v3, p1, Lo/ou;->a:F

    invoke-static {v0, v1, v2, v3}, Lo/rb;->e(FFFF)F

    move-result v0

    return v0
.end method

.method private static c(Lo/ou;Lo/ou;Lo/ou;)F
    .locals 5

    .line 132
    iget v3, p1, Lo/ou;->e:F

    .line 133
    iget v4, p1, Lo/ou;->a:F

    .line 134
    iget v0, p2, Lo/ou;->e:F

    sub-float/2addr v0, v3

    iget v1, p0, Lo/ou;->a:F

    sub-float/2addr v1, v4

    mul-float/2addr v0, v1

    iget v1, p2, Lo/ou;->a:F

    sub-float/2addr v1, v4

    iget v2, p0, Lo/ou;->e:F

    sub-float/2addr v2, v3

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    return v0
.end method

.method public static d([Lo/ou;)V
    .locals 9

    .line 79
    const/4 v0, 0x0

    aget-object v0, p0, v0

    const/4 v1, 0x1

    aget-object v1, p0, v1

    invoke-static {v0, v1}, Lo/ou;->a(Lo/ou;Lo/ou;)F

    move-result v2

    .line 80
    const/4 v0, 0x1

    aget-object v0, p0, v0

    const/4 v1, 0x2

    aget-object v1, p0, v1

    invoke-static {v0, v1}, Lo/ou;->a(Lo/ou;Lo/ou;)F

    move-result v3

    .line 81
    const/4 v0, 0x0

    aget-object v0, p0, v0

    const/4 v1, 0x2

    aget-object v1, p0, v1

    invoke-static {v0, v1}, Lo/ou;->a(Lo/ou;Lo/ou;)F

    move-result v4

    .line 87
    cmpl-float v0, v3, v2

    if-ltz v0, :cond_0

    cmpl-float v0, v3, v4

    if-ltz v0, :cond_0

    .line 88
    const/4 v0, 0x0

    aget-object v6, p0, v0

    .line 89
    const/4 v0, 0x1

    aget-object v5, p0, v0

    .line 90
    const/4 v0, 0x2

    aget-object v7, p0, v0

    goto :goto_0

    .line 91
    :cond_0
    cmpl-float v0, v4, v3

    if-ltz v0, :cond_1

    cmpl-float v0, v4, v2

    if-ltz v0, :cond_1

    .line 92
    const/4 v0, 0x1

    aget-object v6, p0, v0

    .line 93
    const/4 v0, 0x0

    aget-object v5, p0, v0

    .line 94
    const/4 v0, 0x2

    aget-object v7, p0, v0

    goto :goto_0

    .line 96
    :cond_1
    const/4 v0, 0x2

    aget-object v6, p0, v0

    .line 97
    const/4 v0, 0x0

    aget-object v5, p0, v0

    .line 98
    const/4 v0, 0x1

    aget-object v7, p0, v0

    .line 105
    :goto_0
    invoke-static {v5, v6, v7}, Lo/ou;->c(Lo/ou;Lo/ou;Lo/ou;)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 106
    move-object v8, v5

    .line 107
    move-object v5, v7

    .line 108
    move-object v7, v8

    .line 111
    :cond_2
    const/4 v0, 0x0

    aput-object v5, p0, v0

    .line 112
    const/4 v0, 0x1

    aput-object v6, p0, v0

    .line 113
    const/4 v0, 0x2

    aput-object v7, p0, v0

    .line 114
    return-void
.end method


# virtual methods
.method public final b()F
    .locals 1

    .line 38
    iget v0, p0, Lo/ou;->e:F

    return v0
.end method

.method public final e()F
    .locals 1

    .line 42
    iget v0, p0, Lo/ou;->a:F

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 47
    instance-of v0, p1, Lo/ou;

    if-eqz v0, :cond_1

    .line 48
    move-object v2, p1

    check-cast v2, Lo/ou;

    .line 49
    iget v0, p0, Lo/ou;->e:F

    iget v1, v2, Lo/ou;->e:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Lo/ou;->a:F

    iget v1, v2, Lo/ou;->a:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 51
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 56
    iget v0, p0, Lo/ou;->e:F

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lo/ou;->a:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 61
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x19

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 62
    const/16 v0, 0x28

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    iget v0, p0, Lo/ou;->e:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 64
    const/16 v0, 0x2c

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    iget v0, p0, Lo/ou;->a:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 66
    const/16 v0, 0x29

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
