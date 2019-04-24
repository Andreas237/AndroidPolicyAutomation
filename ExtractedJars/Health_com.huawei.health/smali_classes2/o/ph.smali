.class public final Lo/ph;
.super Lo/pr;
.source "SourceFile"


# static fields
.field private static final a:[J

.field private static final c:Ljava/util/regex/Pattern;

.field private static final e:Ljava/util/regex/Pattern;


# instance fields
.field private final b:Ljava/lang/String;

.field private final d:Ljava/util/Date;

.field private final f:Z

.field private final g:Ljava/lang/String;

.field private final h:Z

.field private final i:Ljava/lang/String;

.field private final k:Ljava/util/Date;

.field private final l:D

.field private final m:Ljava/lang/String;

.field private final o:D

.field private final p:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    const-string v0, "P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?"

    .line 36
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/ph;->c:Ljava/util/regex/Pattern;

    .line 37
    const/4 v0, 0x5

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    sput-object v0, Lo/ph;->a:[J

    .line 45
    const-string v0, "[0-9]{8}(T[0-9]{6}Z?)?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/ph;->e:Ljava/util/regex/Pattern;

    return-void

    nop

    :array_0
    .array-data 8
        0x240c8400
        0x5265c00
        0x36ee80
        0xea60
        0x3e8
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;DD)V
    .locals 5

    .line 69
    sget-object v0, Lo/ps;->k:Lo/ps;

    invoke-direct {p0, v0}, Lo/pr;-><init>(Lo/ps;)V

    .line 70
    iput-object p1, p0, Lo/ph;->b:Ljava/lang/String;

    .line 73
    :try_start_0
    invoke-static {p2}, Lo/ph;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lo/ph;->d:Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    goto :goto_0

    .line 74
    :catch_0
    move-exception v3

    .line 75
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/text/ParseException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 78
    :goto_0
    if-nez p3, :cond_1

    .line 79
    invoke-static {p4}, Lo/ph;->e(Ljava/lang/CharSequence;)J

    move-result-wide v3

    .line 80
    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    if-gez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/util/Date;

    iget-object v1, p0, Lo/ph;->d:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    add-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    :goto_1
    iput-object v0, p0, Lo/ph;->k:Ljava/util/Date;

    .line 81
    goto :goto_2

    .line 83
    :cond_1
    :try_start_1
    invoke-static {p3}, Lo/ph;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lo/ph;->k:Ljava/util/Date;
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1

    .line 86
    goto :goto_2

    .line 84
    :catch_1
    move-exception v3

    .line 85
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/text/ParseException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 89
    :goto_2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    :goto_3
    iput-boolean v0, p0, Lo/ph;->h:Z

    .line 90
    if-eqz p3, :cond_3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    goto :goto_4

    :cond_3
    const/4 v0, 0x0

    :goto_4
    iput-boolean v0, p0, Lo/ph;->f:Z

    .line 92
    iput-object p5, p0, Lo/ph;->i:Ljava/lang/String;

    .line 93
    iput-object p6, p0, Lo/ph;->g:Ljava/lang/String;

    .line 94
    iput-object p7, p0, Lo/ph;->p:[Ljava/lang/String;

    .line 95
    iput-object p8, p0, Lo/ph;->m:Ljava/lang/String;

    .line 96
    iput-wide p9, p0, Lo/ph;->o:D

    .line 97
    move-wide/from16 v0, p11

    iput-wide v0, p0, Lo/ph;->l:D

    .line 98
    return-void
.end method

.method private static a(ZLjava/util/Date;)Ljava/lang/String;
    .locals 3

    .line 206
    if-nez p1, :cond_0

    .line 207
    const/4 v0, 0x0

    return-object v0

    .line 209
    :cond_0
    if-eqz p0, :cond_1

    .line 210
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/text/DateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object v2

    goto :goto_0

    .line 211
    :cond_1
    const/4 v0, 0x2

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;

    move-result-object v2

    .line 212
    :goto_0
    invoke-virtual {v2, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;)Ljava/util/Date;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 178
    sget-object v0, Lo/ph;->e:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_0

    .line 179
    new-instance v0, Ljava/text/ParseException;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0

    .line 181
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 183
    invoke-static {}, Lo/ph;->c()Ljava/text/DateFormat;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    return-object v0

    .line 187
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_2

    const/16 v0, 0xf

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x5a

    if-ne v0, v1, :cond_2

    .line 188
    invoke-static {}, Lo/ph;->e()Ljava/text/DateFormat;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xf

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    .line 189
    new-instance v4, Ljava/util/GregorianCalendar;

    invoke-direct {v4}, Ljava/util/GregorianCalendar;-><init>()V

    .line 190
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    .line 192
    const/16 v0, 0xf

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v5, v0

    .line 195
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 196
    const/16 v0, 0x10

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v5, v0

    .line 197
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, v5, v6}, Ljava/util/Date;-><init>(J)V

    .line 198
    goto :goto_0

    .line 199
    :cond_2
    invoke-static {}, Lo/ph;->e()Ljava/text/DateFormat;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    .line 201
    :goto_0
    return-object v3
.end method

.method private static c()Ljava/text/DateFormat;
    .locals 3

    .line 234
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v2, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 238
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 239
    return-object v2
.end method

.method private static e(Ljava/lang/CharSequence;)J
    .locals 9

    .line 216
    if-nez p0, :cond_0

    .line 217
    const-wide/16 v0, -0x1

    return-wide v0

    .line 219
    :cond_0
    sget-object v0, Lo/ph;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 220
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_1

    .line 221
    const-wide/16 v0, -0x1

    return-wide v0

    .line 223
    :cond_1
    const-wide/16 v5, 0x0

    .line 224
    const/4 v7, 0x0

    :goto_0
    sget-object v0, Lo/ph;->a:[J

    array-length v0, v0

    if-ge v7, v0, :cond_3

    .line 225
    add-int/lit8 v0, v7, 0x1

    invoke-virtual {v4, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v8

    .line 226
    if-eqz v8, :cond_2

    .line 227
    sget-object v0, Lo/ph;->a:[J

    aget-wide v0, v0, v7

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    int-to-long v2, v2

    mul-long/2addr v0, v2

    add-long/2addr v5, v0

    .line 224
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 230
    :cond_3
    return-wide v5
.end method

.method private static e()Ljava/text/DateFormat;
    .locals 3

    .line 243
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMdd\'T\'HHmmss"

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 3

    .line 159
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v0, 0x64

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 160
    iget-object v0, p0, Lo/ph;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lo/ph;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 161
    iget-boolean v0, p0, Lo/ph;->h:Z

    iget-object v1, p0, Lo/ph;->d:Ljava/util/Date;

    invoke-static {v0, v1}, Lo/ph;->a(ZLjava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lo/ph;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 162
    iget-boolean v0, p0, Lo/ph;->f:Z

    iget-object v1, p0, Lo/ph;->k:Ljava/util/Date;

    invoke-static {v0, v1}, Lo/ph;->a(ZLjava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lo/ph;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 163
    iget-object v0, p0, Lo/ph;->i:Ljava/lang/String;

    invoke-static {v0, v2}, Lo/ph;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 164
    iget-object v0, p0, Lo/ph;->g:Ljava/lang/String;

    invoke-static {v0, v2}, Lo/ph;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 165
    iget-object v0, p0, Lo/ph;->p:[Ljava/lang/String;

    invoke-static {v0, v2}, Lo/ph;->e([Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 166
    iget-object v0, p0, Lo/ph;->m:Ljava/lang/String;

    invoke-static {v0, v2}, Lo/ph;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 167
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
