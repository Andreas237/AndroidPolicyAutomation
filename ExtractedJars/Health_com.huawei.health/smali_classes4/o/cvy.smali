.class public Lo/cvy;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/util/ArrayList;)Landroid/os/Bundle;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/cvv;>;)Landroid/os/Bundle;"
        }
    .end annotation

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->size()I

    move-result v9

    .line 30
    const/4 v10, 0x0

    .line 31
    const/4 v11, 0x0

    .line 32
    const/4 v12, 0x0

    .line 33
    const/4 v13, 0x0

    .line 35
    const/4 v14, 0x0

    :goto_0
    if-ge v14, v9, :cond_0

    .line 37
    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cvv;

    invoke-virtual {v0}, Lo/cvv;->f()I

    move-result v0

    add-int/2addr v6, v0

    .line 38
    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cvv;

    invoke-virtual {v0}, Lo/cvv;->k()I

    move-result v0

    add-int/2addr v7, v0

    .line 39
    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cvv;

    invoke-virtual {v0}, Lo/cvv;->i()I

    move-result v0

    add-int/2addr v8, v0

    .line 41
    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cvv;

    invoke-virtual {v0}, Lo/cvv;->f()I

    move-result v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cvv;

    invoke-virtual {v1}, Lo/cvv;->k()I

    move-result v1

    add-int/2addr v0, v1

    .line 42
    move-object/from16 v1, p0

    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cvv;

    invoke-virtual {v1}, Lo/cvv;->i()I

    move-result v1

    add-int v15, v0, v1

    .line 44
    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cvv;

    invoke-virtual {v0}, Lo/cvv;->e()I

    move-result v0

    mul-int/2addr v0, v15

    add-int/2addr v10, v0

    .line 45
    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cvv;

    invoke-virtual {v0}, Lo/cvv;->c()I

    move-result v0

    mul-int/2addr v0, v15

    add-int/2addr v11, v0

    .line 46
    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cvv;

    invoke-virtual {v0}, Lo/cvv;->d()I

    move-result v0

    mul-int/2addr v0, v15

    add-int/2addr v12, v0

    .line 47
    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cvv;

    invoke-virtual {v0}, Lo/cvv;->a()I

    move-result v0

    mul-int/2addr v0, v15

    add-int/2addr v13, v0

    .line 35
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_0

    .line 50
    :cond_0
    add-int v0, v6, v7

    add-int/2addr v0, v8

    int-to-float v14, v0

    .line 51
    const/4 v0, 0x0

    cmpl-float v0, v14, v0

    if-lez v0, :cond_1

    .line 52
    int-to-float v0, v10

    div-float/2addr v0, v14

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 53
    int-to-float v0, v11

    div-float/2addr v0, v14

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 54
    int-to-float v0, v12

    div-float/2addr v0, v14

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 55
    int-to-float v0, v13

    div-float/2addr v0, v14

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v5

    .line 60
    :cond_1
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 61
    const-string v0, "avgGroundContactTime"

    invoke-virtual {v9, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 62
    const-string v0, "avgGroundImpactAcceleration"

    invoke-virtual {v9, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 63
    const-string v0, "avgSwingAngle"

    invoke-virtual {v9, v0, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 64
    const-string v0, "avgEversionExcursion"

    invoke-virtual {v9, v0, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 65
    const-string v0, "foreFootStrikePatternPercentage"

    invoke-virtual {v9, v0, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 66
    const-string v0, "wholeFootStrikePatternPercentage"

    invoke-virtual {v9, v0, v7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 67
    const-string v0, "hindFootStrikePatternPercentage"

    invoke-virtual {v9, v0, v8}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 69
    return-object v9
.end method
