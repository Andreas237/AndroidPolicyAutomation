.class public final Lo/qg;
.super Lo/pw;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lo/pw;-><init>()V

    return-void
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 113
    if-eqz p0, :cond_1

    const-string v0, "mailto:"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "MAILTO:"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 114
    :cond_0
    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 116
    :cond_1
    return-object p0
.end method

.method private static d(Ljava/lang/CharSequence;Ljava/lang/String;Z)[Ljava/lang/String;
    .locals 6

    .line 100
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lo/qh;->c(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v2

    .line 101
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 102
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 104
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    .line 105
    new-array v4, v3, [Ljava/lang/String;

    .line 106
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_2

    .line 107
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v4, v5

    .line 106
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 109
    :cond_2
    return-object v4
.end method

.method private static e(Ljava/lang/CharSequence;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    .line 95
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lo/qh;->b(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v1

    .line 96
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_0
    return-object v0
.end method


# virtual methods
.method public synthetic b(Lo/or;)Lo/pr;
    .locals 1

    .line 29
    invoke-virtual {p0, p1}, Lo/qg;->d(Lo/or;)Lo/ph;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/or;)Lo/ph;
    .locals 30

    .line 33
    invoke-static/range {p1 .. p1}, Lo/qg;->i(Lo/or;)Ljava/lang/String;

    move-result-object v13

    .line 34
    const-string v0, "BEGIN:VEVENT"

    invoke-virtual {v13, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v14

    .line 35
    if-gez v14, :cond_0

    .line 36
    const/4 v0, 0x0

    return-object v0

    .line 39
    :cond_0
    const-string v0, "SUMMARY"

    const/4 v1, 0x1

    invoke-static {v0, v13, v1}, Lo/qg;->e(Ljava/lang/CharSequence;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v15

    .line 40
    const-string v0, "DTSTART"

    const/4 v1, 0x1

    invoke-static {v0, v13, v1}, Lo/qg;->e(Ljava/lang/CharSequence;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v16

    .line 41
    if-nez v16, :cond_1

    .line 42
    const/4 v0, 0x0

    return-object v0

    .line 44
    :cond_1
    const-string v0, "DTEND"

    const/4 v1, 0x1

    invoke-static {v0, v13, v1}, Lo/qg;->e(Ljava/lang/CharSequence;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v17

    .line 45
    const-string v0, "DURATION"

    const/4 v1, 0x1

    invoke-static {v0, v13, v1}, Lo/qg;->e(Ljava/lang/CharSequence;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v18

    .line 46
    const-string v0, "LOCATION"

    const/4 v1, 0x1

    invoke-static {v0, v13, v1}, Lo/qg;->e(Ljava/lang/CharSequence;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v19

    .line 47
    const-string v0, "ORGANIZER"

    const/4 v1, 0x1

    invoke-static {v0, v13, v1}, Lo/qg;->e(Ljava/lang/CharSequence;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/qg;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 49
    const-string v0, "ATTENDEE"

    const/4 v1, 0x1

    invoke-static {v0, v13, v1}, Lo/qg;->d(Ljava/lang/CharSequence;Ljava/lang/String;Z)[Ljava/lang/String;

    move-result-object v21

    .line 50
    if-eqz v21, :cond_2

    .line 51
    const/16 v22, 0x0

    :goto_0
    move-object/from16 v0, v21

    array-length v0, v0

    move/from16 v1, v22

    if-ge v1, v0, :cond_2

    .line 52
    aget-object v0, v21, v22

    invoke-static {v0}, Lo/qg;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v21, v22

    .line 51
    add-int/lit8 v22, v22, 0x1

    goto :goto_0

    .line 55
    :cond_2
    const-string v0, "DESCRIPTION"

    const/4 v1, 0x1

    invoke-static {v0, v13, v1}, Lo/qg;->e(Ljava/lang/CharSequence;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v22

    .line 57
    const-string v0, "GEO"

    const/4 v1, 0x1

    invoke-static {v0, v13, v1}, Lo/qg;->e(Ljava/lang/CharSequence;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v23

    .line 60
    if-nez v23, :cond_3

    .line 61
    const-wide/high16 v24, 0x7ff8000000000000L    # Double.NaN

    .line 62
    const-wide/high16 v26, 0x7ff8000000000000L    # Double.NaN

    goto :goto_1

    .line 64
    :cond_3
    move-object/from16 v0, v23

    const/16 v1, 0x3b

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v28

    .line 65
    if-gez v28, :cond_4

    .line 66
    const/4 v0, 0x0

    return-object v0

    .line 69
    :cond_4
    move-object/from16 v0, v23

    const/4 v1, 0x0

    move/from16 v2, v28

    :try_start_0
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v24

    .line 70
    add-int/lit8 v0, v28, 0x1

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v26

    .line 73
    goto :goto_1

    .line 71
    :catch_0
    move-exception v29

    .line 72
    const/4 v0, 0x0

    return-object v0

    .line 77
    :goto_1
    :try_start_1
    new-instance v0, Lo/ph;

    move-object v1, v15

    move-object/from16 v2, v16

    move-object/from16 v3, v17

    move-object/from16 v4, v18

    move-object/from16 v5, v19

    move-object/from16 v6, v20

    move-object/from16 v7, v21

    move-object/from16 v8, v22

    move-wide/from16 v9, v24

    move-wide/from16 v11, v26

    invoke-direct/range {v0 .. v12}, Lo/ph;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;DD)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    .line 87
    :catch_1
    move-exception v28

    .line 88
    const/4 v0, 0x0

    return-object v0
.end method
