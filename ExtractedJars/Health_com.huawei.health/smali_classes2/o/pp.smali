.class public final Lo/pp;
.super Lo/pw;
.source "SourceFile"


# static fields
.field private static final c:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 34
    const-string v0, "geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?"

    .line 35
    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/pp;->c:Ljava/util/regex/Pattern;

    .line 34
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lo/pw;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/or;)Lo/pm;
    .locals 18

    .line 39
    invoke-static/range {p1 .. p1}, Lo/pp;->i(Lo/or;)Ljava/lang/String;

    move-result-object v8

    .line 40
    sget-object v0, Lo/pp;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v9

    .line 41
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_0

    .line 42
    const/4 v0, 0x0

    return-object v0

    .line 45
    :cond_0
    const/4 v0, 0x4

    invoke-virtual {v9, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    .line 51
    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {v9, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v11

    .line 52
    const-wide v0, 0x4056800000000000L    # 90.0

    cmpl-double v0, v11, v0

    if-gtz v0, :cond_1

    const-wide v0, -0x3fa9800000000000L    # -90.0

    cmpg-double v0, v11, v0

    if-gez v0, :cond_2

    .line 53
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 55
    :cond_2
    const/4 v0, 0x2

    :try_start_1
    invoke-virtual {v9, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-wide v13

    .line 56
    const-wide v0, 0x4066800000000000L    # 180.0

    cmpl-double v0, v13, v0

    if-gtz v0, :cond_3

    const-wide v0, -0x3f99800000000000L    # -180.0

    cmpg-double v0, v13, v0

    if-gez v0, :cond_4

    .line 57
    :cond_3
    const/4 v0, 0x0

    return-object v0

    .line 59
    :cond_4
    const/4 v0, 0x3

    :try_start_2
    invoke-virtual {v9, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    .line 60
    const-wide/16 v15, 0x0

    goto :goto_0

    .line 62
    :cond_5
    const/4 v0, 0x3

    invoke-virtual {v9, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    move-result-wide v15

    .line 63
    const-wide/16 v0, 0x0

    cmpg-double v0, v15, v0

    if-gez v0, :cond_6

    .line 64
    const/4 v0, 0x0

    return-object v0

    .line 69
    :cond_6
    :goto_0
    goto :goto_1

    .line 67
    :catch_0
    move-exception v17

    .line 68
    const/4 v0, 0x0

    return-object v0

    .line 70
    :goto_1
    new-instance v0, Lo/pm;

    move-wide v1, v11

    move-wide v3, v13

    move-wide v5, v15

    move-object v7, v10

    invoke-direct/range {v0 .. v7}, Lo/pm;-><init>(DDDLjava/lang/String;)V

    return-object v0
.end method

.method public synthetic b(Lo/or;)Lo/pr;
    .locals 1

    .line 32
    invoke-virtual {p0, p1}, Lo/pp;->a(Lo/or;)Lo/pm;

    move-result-object v0

    return-object v0
.end method
