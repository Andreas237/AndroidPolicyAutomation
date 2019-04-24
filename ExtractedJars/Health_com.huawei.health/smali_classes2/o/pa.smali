.class public final Lo/pa;
.super Lo/pc;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Lo/pc;-><init>()V

    return-void
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 84
    const/16 v0, 0x2c

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 85
    if-ltz v2, :cond_0

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v1, v2, 0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 89
    :cond_0
    return-object p0
.end method


# virtual methods
.method public a(Lo/or;)Lo/pg;
    .locals 28

    .line 40
    invoke-static/range {p1 .. p1}, Lo/pa;->i(Lo/or;)Ljava/lang/String;

    move-result-object v17

    .line 41
    const-string v0, "MECARD:"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 42
    const/4 v0, 0x0

    return-object v0

    .line 44
    :cond_0
    const-string v0, "N:"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/pa;->b(Ljava/lang/String;Ljava/lang/String;Z)[Ljava/lang/String;

    move-result-object v18

    .line 45
    if-nez v18, :cond_1

    .line 46
    const/4 v0, 0x0

    return-object v0

    .line 48
    :cond_1
    const/4 v0, 0x0

    aget-object v0, v18, v0

    invoke-static {v0}, Lo/pa;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    .line 49
    const-string v0, "SOUND:"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/pa;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v20

    .line 50
    const-string v0, "TEL:"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/pa;->b(Ljava/lang/String;Ljava/lang/String;Z)[Ljava/lang/String;

    move-result-object v21

    .line 51
    const-string v0, "EMAIL:"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/pa;->b(Ljava/lang/String;Ljava/lang/String;Z)[Ljava/lang/String;

    move-result-object v22

    .line 52
    const-string v0, "NOTE:"

    move-object/from16 v1, v17

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/pa;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v23

    .line 53
    const-string v0, "ADR:"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/pa;->b(Ljava/lang/String;Ljava/lang/String;Z)[Ljava/lang/String;

    move-result-object v24

    .line 54
    const-string v0, "BDAY:"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/pa;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v25

    .line 55
    move-object/from16 v0, v25

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lo/pa;->d(Ljava/lang/CharSequence;I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 57
    const/16 v25, 0x0

    .line 59
    :cond_2
    const-string v0, "URL:"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/pa;->b(Ljava/lang/String;Ljava/lang/String;Z)[Ljava/lang/String;

    move-result-object v26

    .line 63
    const-string v0, "ORG:"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/pa;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v27

    .line 65
    new-instance v0, Lo/pg;

    invoke-static/range {v19 .. v19}, Lo/pa;->b(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    const/4 v5, 0x0

    move-object/from16 v6, v22

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, v23

    move-object/from16 v10, v24

    const/4 v11, 0x0

    move-object/from16 v12, v27

    move-object/from16 v13, v25

    const/4 v14, 0x0

    move-object/from16 v15, v26

    const/16 v16, 0x0

    invoke-direct/range {v0 .. v16}, Lo/pg;-><init>([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    return-object v0
.end method

.method public synthetic b(Lo/or;)Lo/pr;
    .locals 1

    .line 36
    invoke-virtual {p0, p1}, Lo/pa;->a(Lo/or;)Lo/pg;

    move-result-object v0

    return-object v0
.end method
