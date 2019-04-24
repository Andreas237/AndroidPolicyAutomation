.class public Lo/dqm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lo/dql;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/multisimservice/model/SimInfo;>;"
        }
    .end annotation
.end field

.field private f:I


# virtual methods
.method public a()I
    .locals 1

    .line 98
    iget v0, p0, Lo/dqm;->f:I

    return v0
.end method

.method public e()Lo/dql;
    .locals 1

    .line 78
    iget-object v0, p0, Lo/dqm;->d:Lo/dql;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 103
    if-ne p0, p1, :cond_0

    .line 104
    const/4 v0, 0x1

    return v0

    .line 106
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 107
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 109
    :cond_2
    move-object v2, p1

    check-cast v2, Lo/dqm;

    .line 110
    iget v0, p0, Lo/dqm;->f:I

    iget v1, v2, Lo/dqm;->f:I

    if-eq v0, v1, :cond_3

    .line 111
    const/4 v0, 0x0

    return v0

    .line 113
    :cond_3
    iget-object v0, p0, Lo/dqm;->d:Lo/dql;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lo/dqm;->d:Lo/dql;

    iget-object v1, v2, Lo/dqm;->d:Lo/dql;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_4
    iget-object v0, v2, Lo/dqm;->d:Lo/dql;

    if-eqz v0, :cond_5

    .line 114
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 116
    :cond_5
    iget-object v0, p0, Lo/dqm;->c:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    iget-object v0, p0, Lo/dqm;->c:Ljava/lang/String;

    iget-object v1, v2, Lo/dqm;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_1

    :cond_6
    iget-object v0, v2, Lo/dqm;->c:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 117
    :goto_1
    const/4 v0, 0x0

    return v0

    .line 119
    :cond_7
    iget-object v0, p0, Lo/dqm;->b:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    iget-object v0, p0, Lo/dqm;->b:Ljava/lang/String;

    iget-object v1, v2, Lo/dqm;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_2

    :cond_8
    iget-object v0, v2, Lo/dqm;->b:Ljava/lang/String;

    if-eqz v0, :cond_9

    .line 120
    :goto_2
    const/4 v0, 0x0

    return v0

    .line 122
    :cond_9
    iget-object v0, p0, Lo/dqm;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    iget-object v0, p0, Lo/dqm;->a:Ljava/lang/String;

    iget-object v1, v2, Lo/dqm;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_3

    :cond_a
    iget-object v0, v2, Lo/dqm;->a:Ljava/lang/String;

    if-eqz v0, :cond_b

    .line 123
    :goto_3
    const/4 v0, 0x0

    return v0

    .line 125
    :cond_b
    iget-object v0, p0, Lo/dqm;->e:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    iget-object v0, p0, Lo/dqm;->e:Ljava/util/List;

    iget-object v1, v2, Lo/dqm;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_4

    :cond_c
    iget-object v0, v2, Lo/dqm;->e:Ljava/util/List;

    if-nez v0, :cond_d

    const/4 v0, 0x1

    goto :goto_4

    :cond_d
    const/4 v0, 0x0

    :goto_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 131
    iget v2, p0, Lo/dqm;->f:I

    .line 132
    iget-object v0, p0, Lo/dqm;->d:Lo/dql;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 133
    mul-int/lit8 v0, v2, 0x1f

    iget-object v1, p0, Lo/dqm;->d:Lo/dql;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 135
    :cond_0
    iget-object v0, p0, Lo/dqm;->c:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 136
    mul-int/lit8 v0, v2, 0x1f

    iget-object v1, p0, Lo/dqm;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 138
    :cond_1
    iget-object v0, p0, Lo/dqm;->b:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 139
    mul-int/lit8 v0, v2, 0x1f

    iget-object v1, p0, Lo/dqm;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 141
    :cond_2
    iget-object v0, p0, Lo/dqm;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 142
    mul-int/lit8 v0, v2, 0x1f

    iget-object v1, p0, Lo/dqm;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 144
    :cond_3
    iget-object v0, p0, Lo/dqm;->e:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 145
    mul-int/lit8 v0, v2, 0x1f

    iget-object v1, p0, Lo/dqm;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int v2, v0, v1

    .line 147
    :cond_4
    return v2
.end method
