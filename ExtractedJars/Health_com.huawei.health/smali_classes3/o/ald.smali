.class public Lo/ald;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field private f:I

.field public h:I


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 19
    move-object v0, p0

    const/4 v1, -0x1

    const/4 v2, -0x1

    const/4 v3, -0x1

    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v6, -0x1

    invoke-direct/range {v0 .. v6}, Lo/ald;-><init>(IIIIII)V

    .line 20
    return-void
.end method

.method public constructor <init>(IIIIII)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const v0, 0xf4240

    iput v0, p0, Lo/ald;->f:I

    .line 11
    const/4 v0, -0x1

    iput v0, p0, Lo/ald;->a:I

    .line 12
    const/4 v0, -0x1

    iput v0, p0, Lo/ald;->d:I

    .line 13
    const/4 v0, -0x1

    iput v0, p0, Lo/ald;->b:I

    .line 14
    const/4 v0, -0x1

    iput v0, p0, Lo/ald;->e:I

    .line 15
    const/4 v0, -0x1

    iput v0, p0, Lo/ald;->c:I

    .line 16
    const/4 v0, -0x1

    iput v0, p0, Lo/ald;->h:I

    .line 23
    iput p1, p0, Lo/ald;->a:I

    .line 24
    iput p2, p0, Lo/ald;->h:I

    .line 25
    iput p3, p0, Lo/ald;->d:I

    .line 26
    iput p4, p0, Lo/ald;->b:I

    .line 27
    iput p5, p0, Lo/ald;->e:I

    .line 28
    iput p6, p0, Lo/ald;->c:I

    .line 29
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 45
    const/4 v0, -0x1

    iput v0, p0, Lo/ald;->a:I

    .line 46
    const/4 v0, -0x1

    iput v0, p0, Lo/ald;->h:I

    .line 47
    const/4 v0, -0x1

    iput v0, p0, Lo/ald;->d:I

    .line 48
    const/4 v0, -0x1

    iput v0, p0, Lo/ald;->b:I

    .line 49
    const/4 v0, -0x1

    iput v0, p0, Lo/ald;->e:I

    .line 50
    const/4 v0, -0x1

    iput v0, p0, Lo/ald;->c:I

    .line 51
    return-void
.end method

.method public a(Lo/ald;)V
    .locals 1

    .line 91
    iget v0, p1, Lo/ald;->a:I

    iput v0, p0, Lo/ald;->a:I

    .line 92
    iget v0, p1, Lo/ald;->h:I

    iput v0, p0, Lo/ald;->h:I

    .line 93
    iget v0, p1, Lo/ald;->d:I

    iput v0, p0, Lo/ald;->d:I

    .line 94
    iget v0, p1, Lo/ald;->b:I

    iput v0, p0, Lo/ald;->b:I

    .line 95
    iget v0, p1, Lo/ald;->e:I

    iput v0, p0, Lo/ald;->e:I

    .line 96
    iget v0, p1, Lo/ald;->c:I

    iput v0, p0, Lo/ald;->c:I

    .line 97
    return-void
.end method

.method public c()Landroid/os/Bundle;
    .locals 3

    .line 101
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 102
    const-string v0, "step"

    iget v1, p0, Lo/ald;->a:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 103
    const-string v0, "devicestep"

    iget v1, p0, Lo/ald;->h:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 104
    const-string v0, "distance"

    iget v1, p0, Lo/ald;->b:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 105
    const-string v0, "carior"

    iget v1, p0, Lo/ald;->d:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 106
    const-string v0, "floor"

    iget v1, p0, Lo/ald;->e:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 107
    const-string v0, "target"

    iget v1, p0, Lo/ald;->c:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 108
    const-string v0, "stepTarget"

    iget v1, p0, Lo/ald;->c:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 109
    return-object v2
.end method

.method public e()Z
    .locals 4

    .line 54
    iget v0, p0, Lo/ald;->a:I

    if-ltz v0, :cond_0

    iget v0, p0, Lo/ald;->d:I

    if-ltz v0, :cond_0

    iget v0, p0, Lo/ald;->b:I

    if-ltz v0, :cond_0

    iget v0, p0, Lo/ald;->e:I

    if-ltz v0, :cond_0

    iget v0, p0, Lo/ald;->c:I

    if-gez v0, :cond_1

    .line 55
    :cond_0
    const-string v0, "Step_Report"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "error data: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/ald;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    const/4 v0, 0x0

    return v0

    .line 58
    :cond_1
    iget v0, p0, Lo/ald;->a:I

    iget v1, p0, Lo/ald;->f:I

    if-le v0, v1, :cond_2

    .line 59
    const-string v0, "Step_Report"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " the day step is to large,the step :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ald;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const/4 v0, 0x0

    return v0

    .line 62
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public e(Lo/ald;)Z
    .locals 2

    .line 32
    if-nez p1, :cond_0

    .line 33
    const/4 v0, 0x0

    return v0

    .line 35
    :cond_0
    iget v0, p0, Lo/ald;->a:I

    iget v1, p1, Lo/ald;->a:I

    if-ne v0, v1, :cond_1

    iget v0, p0, Lo/ald;->d:I

    iget v1, p1, Lo/ald;->d:I

    if-ne v0, v1, :cond_1

    iget v0, p0, Lo/ald;->b:I

    iget v1, p1, Lo/ald;->b:I

    if-ne v0, v1, :cond_1

    iget v0, p0, Lo/ald;->e:I

    iget v1, p1, Lo/ald;->e:I

    if-ne v0, v1, :cond_1

    .line 39
    const/4 v0, 0x1

    return v0

    .line 41
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 67
    if-ne p0, p1, :cond_0

    const/4 v0, 0x1

    return v0

    .line 68
    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    :cond_1
    const/4 v0, 0x0

    return v0

    .line 70
    :cond_2
    move-object v2, p1

    check-cast v2, Lo/ald;

    .line 72
    iget v0, p0, Lo/ald;->a:I

    iget v1, v2, Lo/ald;->a:I

    if-eq v0, v1, :cond_3

    const/4 v0, 0x0

    return v0

    .line 73
    :cond_3
    iget v0, p0, Lo/ald;->d:I

    iget v1, v2, Lo/ald;->d:I

    if-eq v0, v1, :cond_4

    const/4 v0, 0x0

    return v0

    .line 74
    :cond_4
    iget v0, p0, Lo/ald;->b:I

    iget v1, v2, Lo/ald;->b:I

    if-eq v0, v1, :cond_5

    const/4 v0, 0x0

    return v0

    .line 75
    :cond_5
    iget v0, p0, Lo/ald;->e:I

    iget v1, v2, Lo/ald;->e:I

    if-eq v0, v1, :cond_6

    const/4 v0, 0x0

    return v0

    .line 76
    :cond_6
    iget v0, p0, Lo/ald;->c:I

    iget v1, v2, Lo/ald;->c:I

    if-ne v0, v1, :cond_7

    const/4 v0, 0x1

    goto :goto_0

    :cond_7
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 82
    iget v2, p0, Lo/ald;->a:I

    .line 83
    mul-int/lit8 v0, v2, 0x1f

    iget v1, p0, Lo/ald;->d:I

    add-int v2, v0, v1

    .line 84
    mul-int/lit8 v0, v2, 0x1f

    iget v1, p0, Lo/ald;->b:I

    add-int v2, v0, v1

    .line 85
    mul-int/lit8 v0, v2, 0x1f

    iget v1, p0, Lo/ald;->e:I

    add-int v2, v0, v1

    .line 86
    mul-int/lit8 v0, v2, 0x1f

    iget v1, p0, Lo/ald;->c:I

    add-int v2, v0, v1

    .line 87
    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    const-string v0, "step"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    iget v0, p0, Lo/ald;->a:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 117
    const-string v0, "devicestep"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    iget v0, p0, Lo/ald;->h:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    const-string v0, "calorie"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    iget v0, p0, Lo/ald;->d:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 121
    const-string v0, "floor"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    iget v0, p0, Lo/ald;->e:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    const-string v0, "distance"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    iget v0, p0, Lo/ald;->b:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    const-string v0, "target"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    iget v0, p0, Lo/ald;->c:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
