.class public final Lo/pe;
.super Lo/pc;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Lo/pc;-><init>()V

    return-void
.end method

.method private static d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 93
    if-nez p0, :cond_0

    .line 94
    return-object p1

    .line 96
    :cond_0
    if-nez p1, :cond_1

    move-object v0, p0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    .locals 3

    .line 75
    new-instance v1, Ljava/util/ArrayList;

    const/4 v0, 0x3

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 76
    if-eqz p0, :cond_0

    .line 77
    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    :cond_0
    if-eqz p1, :cond_1

    .line 80
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    :cond_1
    if-eqz p2, :cond_2

    .line 83
    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    .line 86
    if-nez v2, :cond_3

    .line 87
    const/4 v0, 0x0

    return-object v0

    .line 89
    :cond_3
    new-array v0, v2, [Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(Lo/or;)Lo/pg;
    .locals 28

    .line 39
    invoke-static/range {p1 .. p1}, Lo/pe;->i(Lo/or;)Ljava/lang/String;

    move-result-object v17

    .line 40
    const-string v0, "BIZCARD:"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 41
    const/4 v0, 0x0

    return-object v0

    .line 43
    :cond_0
    const-string v0, "N:"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/pe;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v18

    .line 44
    const-string v0, "X:"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/pe;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v19

    .line 45
    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-static {v0, v1}, Lo/pe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 46
    const-string v0, "T:"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/pe;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v21

    .line 47
    const-string v0, "C:"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/pe;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v22

    .line 48
    const-string v0, "A:"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/pe;->b(Ljava/lang/String;Ljava/lang/String;Z)[Ljava/lang/String;

    move-result-object v23

    .line 49
    const-string v0, "B:"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/pe;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v24

    .line 50
    const-string v0, "M:"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/pe;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v25

    .line 51
    const-string v0, "F:"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/pe;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v26

    .line 52
    const-string v0, "E:"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/pe;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v27

    .line 54
    new-instance v0, Lo/pg;

    invoke-static/range {v20 .. v20}, Lo/pe;->b(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 57
    move-object/from16 v2, v24

    move-object/from16 v3, v25

    move-object/from16 v4, v26

    invoke-static {v2, v3, v4}, Lo/pe;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 59
    invoke-static/range {v27 .. v27}, Lo/pe;->b(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v10, v23

    const/4 v11, 0x0

    move-object/from16 v12, v22

    const/4 v13, 0x0

    move-object/from16 v14, v21

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v0 .. v16}, Lo/pg;-><init>([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    return-object v0
.end method

.method public synthetic b(Lo/or;)Lo/pr;
    .locals 1

    .line 31
    invoke-virtual {p0, p1}, Lo/pe;->a(Lo/or;)Lo/pg;

    move-result-object v0

    return-object v0
.end method
