.class public final Lo/pl;
.super Lo/pw;
.source "SourceFile"


# static fields
.field private static final c:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const-string v0, ","

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/pl;->c:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/pw;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic b(Lo/or;)Lo/pr;
    .locals 1

    .line 30
    invoke-virtual {p0, p1}, Lo/pl;->d(Lo/or;)Lo/pf;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/or;)Lo/pf;
    .locals 17

    .line 36
    invoke-static/range {p1 .. p1}, Lo/pl;->i(Lo/or;)Ljava/lang/String;

    move-result-object v6

    .line 37
    const-string v0, "mailto:"

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "MAILTO:"

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 39
    :cond_0
    const/4 v0, 0x7

    invoke-virtual {v6, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 40
    const/16 v0, 0x3f

    invoke-virtual {v7, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    .line 41
    if-ltz v8, :cond_1

    .line 42
    const/4 v0, 0x0

    invoke-virtual {v7, v0, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 44
    :cond_1
    invoke-static {v7}, Lo/pl;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 45
    const/4 v9, 0x0

    .line 46
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 47
    sget-object v0, Lo/pl;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v7}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v9

    .line 49
    :cond_2
    invoke-static {v6}, Lo/pl;->e(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v10

    .line 50
    const/4 v11, 0x0

    .line 51
    const/4 v12, 0x0

    .line 52
    const/4 v13, 0x0

    .line 53
    const/4 v14, 0x0

    .line 54
    if-eqz v10, :cond_6

    .line 55
    if-nez v9, :cond_3

    .line 56
    const-string v0, "to"

    invoke-interface {v10, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ljava/lang/String;

    .line 57
    if-eqz v15, :cond_3

    .line 58
    sget-object v0, Lo/pl;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v15}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v9

    .line 61
    :cond_3
    const-string v0, "cc"

    invoke-interface {v10, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ljava/lang/String;

    .line 62
    if-eqz v15, :cond_4

    .line 63
    sget-object v0, Lo/pl;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v15}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v11

    .line 65
    :cond_4
    const-string v0, "bcc"

    invoke-interface {v10, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Ljava/lang/String;

    .line 66
    if-eqz v16, :cond_5

    .line 67
    sget-object v0, Lo/pl;->c:Ljava/util/regex/Pattern;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v12

    .line 69
    :cond_5
    const-string v0, "subject"

    invoke-interface {v10, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/String;

    .line 70
    const-string v0, "body"

    invoke-interface {v10, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/lang/String;

    .line 72
    :cond_6
    new-instance v0, Lo/pf;

    move-object v1, v9

    move-object v2, v11

    move-object v3, v12

    move-object v4, v13

    move-object v5, v14

    invoke-direct/range {v0 .. v5}, Lo/pf;-><init>([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 74
    :cond_7
    invoke-static {v6}, Lo/pk;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 75
    const/4 v0, 0x0

    return-object v0

    .line 77
    :cond_8
    new-instance v0, Lo/pf;

    invoke-direct {v0, v6}, Lo/pf;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
