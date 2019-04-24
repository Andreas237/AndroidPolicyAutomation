.class final Lo/so;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static b(Ljava/util/List;)Lo/qm;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/sn;>;)Lo/qm;"
        }
    .end annotation

    .line 43
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v2, v0, -0x1

    .line 44
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/sn;

    invoke-virtual {v0}, Lo/sn;->e()Lo/sh;

    move-result-object v0

    if-nez v0, :cond_0

    .line 45
    add-int/lit8 v2, v2, -0x1

    .line 48
    :cond_0
    mul-int/lit8 v3, v2, 0xc

    .line 50
    new-instance v4, Lo/qm;

    invoke-direct {v4, v3}, Lo/qm;-><init>(I)V

    .line 51
    const/4 v5, 0x0

    .line 53
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/sn;

    .line 54
    invoke-virtual {v6}, Lo/sn;->e()Lo/sh;

    move-result-object v0

    invoke-virtual {v0}, Lo/sh;->b()I

    move-result v7

    .line 55
    const/16 v8, 0xb

    :goto_0
    if-ltz v8, :cond_2

    .line 56
    const/4 v0, 0x1

    shl-int/2addr v0, v8

    and-int/2addr v0, v7

    if-eqz v0, :cond_1

    .line 57
    invoke-virtual {v4, v5}, Lo/qm;->c(I)V

    .line 59
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 55
    add-int/lit8 v8, v8, -0x1

    goto :goto_0

    .line 62
    :cond_2
    const/4 v8, 0x1

    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_7

    .line 63
    invoke-interface {p0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/sn;

    .line 65
    invoke-virtual {v9}, Lo/sn;->c()Lo/sh;

    move-result-object v0

    invoke-virtual {v0}, Lo/sh;->b()I

    move-result v10

    .line 66
    const/16 v11, 0xb

    :goto_2
    if-ltz v11, :cond_4

    .line 67
    const/4 v0, 0x1

    shl-int/2addr v0, v11

    and-int/2addr v0, v10

    if-eqz v0, :cond_3

    .line 68
    invoke-virtual {v4, v5}, Lo/qm;->c(I)V

    .line 70
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 66
    add-int/lit8 v11, v11, -0x1

    goto :goto_2

    .line 73
    :cond_4
    invoke-virtual {v9}, Lo/sn;->e()Lo/sh;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 74
    invoke-virtual {v9}, Lo/sn;->e()Lo/sh;

    move-result-object v0

    invoke-virtual {v0}, Lo/sh;->b()I

    move-result v11

    .line 75
    const/16 v12, 0xb

    :goto_3
    if-ltz v12, :cond_6

    .line 76
    const/4 v0, 0x1

    shl-int/2addr v0, v12

    and-int/2addr v0, v11

    if-eqz v0, :cond_5

    .line 77
    invoke-virtual {v4, v5}, Lo/qm;->c(I)V

    .line 79
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 75
    add-int/lit8 v12, v12, -0x1

    goto :goto_3

    .line 62
    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 83
    :cond_7
    return-object v4
.end method
