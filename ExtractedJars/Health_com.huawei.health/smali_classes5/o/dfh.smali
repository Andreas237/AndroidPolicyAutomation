.class public Lo/dfh;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/dba;)Lo/dfs;
    .locals 9

    .line 51
    new-instance v2, Lo/dfs;

    invoke-direct {v2}, Lo/dfs;-><init>()V

    .line 52
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 53
    iget-object v4, p0, Lo/dba;->b:Ljava/util/List;

    .line 54
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 55
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v6, v0, Lo/dba;->e:Ljava/util/List;

    .line 56
    const/4 v7, 0x0

    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_0

    .line 57
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v8

    .line 58
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_2

    .line 60
    :sswitch_0
    const/16 v0, 0x10

    invoke-static {v8, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/dfs;->c(I)V

    .line 61
    goto :goto_2

    .line 63
    :sswitch_1
    const/16 v0, 0x10

    invoke-static {v8, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    .line 64
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 54
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 70
    :cond_1
    invoke-virtual {v2, v3}, Lo/dfs;->d(Ljava/util/List;)V

    .line 72
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x5 -> :sswitch_1
    .end sparse-switch
.end method

.method public static e(Lo/dba;)Lo/dfm;
    .locals 1

    .line 81
    invoke-static {p0}, Lo/dfn;->b(Lo/dba;)Lo/dfm;

    move-result-object v0

    return-object v0
.end method
