.class public final Lo/pb;
.super Lo/pw;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lo/pw;-><init>()V

    return-void
.end method

.method private static c(Ljava/lang/String;ILjava/lang/String;Z)[Ljava/lang/String;
    .locals 5

    .line 74
    const/4 v2, 0x0

    .line 75
    const/4 v3, 0x1

    :goto_0
    if-gt v3, p1, :cond_2

    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xd

    invoke-static {v0, p2, v1, p3}, Lo/pb;->a(Ljava/lang/String;Ljava/lang/String;CZ)Ljava/lang/String;

    move-result-object v4

    .line 77
    if-nez v4, :cond_0

    .line 78
    goto :goto_1

    .line 80
    :cond_0
    if-nez v2, :cond_1

    .line 81
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    :cond_1
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 85
    :cond_2
    :goto_1
    if-nez v2, :cond_3

    .line 86
    const/4 v0, 0x0

    return-object v0

    .line 88
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public synthetic b(Lo/or;)Lo/pr;
    .locals 1

    .line 32
    invoke-virtual {p0, p1}, Lo/pb;->c(Lo/or;)Lo/pg;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/or;)Lo/pg;
    .locals 25

    .line 36
    invoke-static/range {p1 .. p1}, Lo/pb;->i(Lo/or;)Ljava/lang/String;

    move-result-object v17

    .line 38
    const-string v0, "MEMORY"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "\r\n"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 39
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 44
    :cond_1
    const-string v0, "NAME1:"

    move-object/from16 v1, v17

    const/16 v2, 0xd

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/pb;->a(Ljava/lang/String;Ljava/lang/String;CZ)Ljava/lang/String;

    move-result-object v18

    .line 45
    const-string v0, "NAME2:"

    move-object/from16 v1, v17

    const/16 v2, 0xd

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/pb;->a(Ljava/lang/String;Ljava/lang/String;CZ)Ljava/lang/String;

    move-result-object v19

    .line 47
    const-string v0, "TEL"

    const/4 v1, 0x3

    move-object/from16 v2, v17

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/pb;->c(Ljava/lang/String;ILjava/lang/String;Z)[Ljava/lang/String;

    move-result-object v20

    .line 48
    const-string v0, "MAIL"

    const/4 v1, 0x3

    move-object/from16 v2, v17

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/pb;->c(Ljava/lang/String;ILjava/lang/String;Z)[Ljava/lang/String;

    move-result-object v21

    .line 49
    const-string v0, "MEMORY:"

    move-object/from16 v1, v17

    const/16 v2, 0xd

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/pb;->a(Ljava/lang/String;Ljava/lang/String;CZ)Ljava/lang/String;

    move-result-object v22

    .line 50
    const-string v0, "ADD:"

    move-object/from16 v1, v17

    const/16 v2, 0xd

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/pb;->a(Ljava/lang/String;Ljava/lang/String;CZ)Ljava/lang/String;

    move-result-object v23

    .line 51
    if-nez v23, :cond_2

    const/16 v24, 0x0

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v24, v0

    const/4 v0, 0x0

    aput-object v23, v24, v0

    .line 52
    :goto_0
    new-instance v0, Lo/pg;

    invoke-static/range {v18 .. v18}, Lo/pb;->b(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    move-object/from16 v3, v19

    move-object/from16 v4, v20

    const/4 v5, 0x0

    move-object/from16 v6, v21

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, v22

    move-object/from16 v10, v24

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v0 .. v16}, Lo/pg;-><init>([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    return-object v0
.end method
