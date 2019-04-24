.class public Lo/ami;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:I

.field private e:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Lo/amd;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lo/ami;->b:I

    .line 20
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lo/ami;->e:Landroid/util/SparseArray;

    .line 26
    return-void
.end method

.method private b(Lo/amd;)V
    .locals 1

    .line 157
    invoke-virtual {p1}, Lo/amd;->d()Z

    .line 158
    return-void
.end method

.method private e(III)V
    .locals 4

    .line 81
    if-ge p2, p3, :cond_0

    .line 82
    const-string v0, "Step_DataCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mcache insert step<oldStep"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    :cond_0
    iget v0, p0, Lo/ami;->b:I

    sub-int v1, p2, p3

    add-int/2addr v0, v1

    iput v0, p0, Lo/ami;->b:I

    .line 85
    invoke-virtual {p0, p1}, Lo/ami;->a(I)V

    .line 86
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 121
    const-string v0, "Step_DataCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clear()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    iget-object v0, p0, Lo/ami;->e:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ami;->e:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 123
    iget-object v0, p0, Lo/ami;->e:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 125
    :cond_0
    return-void
.end method

.method protected a(I)V
    .locals 0

    .line 96
    return-void
.end method

.method public b()I
    .locals 3

    .line 132
    const/4 v1, 0x0

    .line 133
    iget-object v0, p0, Lo/ami;->e:Landroid/util/SparseArray;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/ami;->e:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 134
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/ami;->e:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 135
    iget-object v0, p0, Lo/ami;->e:Landroid/util/SparseArray;

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    invoke-virtual {v0}, Lo/amd;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    iget-object v0, p0, Lo/ami;->e:Landroid/util/SparseArray;

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    invoke-virtual {v0}, Lo/amd;->a()I

    move-result v0

    add-int/2addr v1, v0

    .line 134
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 141
    :cond_1
    return v1
.end method

.method public b(J)Lo/amd;
    .locals 3

    .line 76
    invoke-static {p1, p2}, Lo/amz;->b(J)J

    move-result-wide v0

    long-to-int v2, v0

    .line 77
    iget-object v0, p0, Lo/ami;->e:Landroid/util/SparseArray;

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    return-object v0
.end method

.method public d(IJIII)V
    .locals 10

    .line 39
    const-string v0, "Step_DataCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setSteps()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    invoke-static {p2, p3}, Lo/amz;->b(J)J

    move-result-wide v0

    long-to-int v7, v0

    .line 44
    const/4 v8, 0x0

    .line 46
    iget-object v0, p0, Lo/ami;->e:Landroid/util/SparseArray;

    invoke-virtual {v0, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/amd;

    .line 48
    const-string v0, "Step_DataCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " size "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ami;->e:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    if-eqz v9, :cond_0

    .line 51
    invoke-virtual {v9}, Lo/amd;->a()I

    move-result v8

    .line 52
    move-object v0, v9

    invoke-virtual {v9}, Lo/amd;->c()I

    move-result v1

    int-to-long v2, v7

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/amd;->e(IJIII)V

    goto :goto_0

    .line 54
    :cond_0
    new-instance v0, Lo/amd;

    move v1, p1

    int-to-long v2, v7

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lo/amd;-><init>(IJIII)V

    move-object v9, v0

    .line 56
    :goto_0
    invoke-direct {p0, v9}, Lo/ami;->b(Lo/amd;)V

    .line 57
    iget-object v0, p0, Lo/ami;->e:Landroid/util/SparseArray;

    invoke-virtual {v0, v7, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 59
    invoke-direct {p0, v7, p4, v8}, Lo/ami;->e(III)V

    .line 60
    return-void
.end method

.method public d(Lo/amd;)V
    .locals 5

    .line 145
    const/4 v3, 0x0

    .line 146
    iget-object v0, p0, Lo/ami;->e:Landroid/util/SparseArray;

    invoke-virtual {p1}, Lo/amd;->b()J

    move-result-wide v1

    long-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/amd;

    .line 147
    if-eqz v4, :cond_0

    .line 148
    invoke-virtual {v4}, Lo/amd;->a()I

    move-result v3

    .line 150
    :cond_0
    invoke-direct {p0, p1}, Lo/ami;->b(Lo/amd;)V

    .line 151
    iget-object v0, p0, Lo/ami;->e:Landroid/util/SparseArray;

    invoke-virtual {p1}, Lo/amd;->b()J

    move-result-wide v1

    long-to-int v1, v1

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 152
    invoke-virtual {p1}, Lo/amd;->b()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {p1}, Lo/amd;->a()I

    move-result v1

    invoke-direct {p0, v0, v1, v3}, Lo/ami;->e(III)V

    .line 153
    return-void
.end method

.method public e()Landroid/util/SparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Landroid/util/SparseArray<Lo/amd;>;"
        }
    .end annotation

    .line 104
    iget-object v0, p0, Lo/ami;->e:Landroid/util/SparseArray;

    return-object v0
.end method

.method public e(I)Lo/amd;
    .locals 1

    .line 161
    invoke-virtual {p0}, Lo/ami;->e()Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    return-object v0
.end method
