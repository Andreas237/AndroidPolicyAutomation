.class public Lo/ftt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ftt$b;,
        Lo/ftt$e;
    }
.end annotation


# static fields
.field private static final a:Lo/ftt$e;

.field private static final b:Lo/ftt$e;

.field private static final c:Lo/ftt$e;

.field private static final d:Ljava/util/regex/Pattern;

.field private static final e:Ljava/util/regex/Pattern;

.field private static final f:Lo/ftt$e;

.field private static final g:Ljava/util/regex/Pattern;

.field private static final h:Ljava/util/regex/Pattern;

.field private static final i:Ljava/util/regex/Pattern;

.field private static final k:Lo/ftt$e;

.field private static final l:Ljava/util/regex/Pattern;

.field private static final m:Ljava/util/regex/Pattern;

.field private static final n:Ljava/text/DateFormat;

.field private static final o:Lo/ftt$e;

.field private static final p:Lo/ftt$e;

.field private static final q:Ljava/text/DateFormat;

.field private static final r:Ljava/text/DateFormat;

.field private static final s:Ljava/util/regex/Pattern;

.field private static final t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ftt$b;>;"
        }
    .end annotation
.end field

.field private static final u:Ljava/text/DateFormat;

.field private static final y:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 39
    sget-object v0, Lo/ftt$e;->b:Lo/ftt$e;

    sput-object v0, Lo/ftt;->b:Lo/ftt$e;

    .line 40
    const-string v0, "^\\d+-\\d+-\\d+$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/ftt;->d:Ljava/util/regex/Pattern;

    .line 42
    sget-object v0, Lo/ftt$e;->f:Lo/ftt$e;

    sput-object v0, Lo/ftt;->c:Lo/ftt$e;

    .line 43
    const-string v0, "^(\\d+:){2}\\d+.\\d+(Z|([+-](\\d+:\\d+)))$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/ftt;->e:Ljava/util/regex/Pattern;

    .line 44
    sget-object v0, Lo/ftt$e;->g:Lo/ftt$e;

    sput-object v0, Lo/ftt;->a:Lo/ftt$e;

    .line 45
    const-string v0, "^(\\d+:){2}\\d+.\\d+$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/ftt;->i:Ljava/util/regex/Pattern;

    .line 47
    sget-object v0, Lo/ftt$e;->e:Lo/ftt$e;

    sput-object v0, Lo/ftt;->f:Lo/ftt$e;

    .line 48
    const-string v0, "^(\\d+:){2}\\d+(Z|([+-](\\d+:\\d+)))$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/ftt;->h:Ljava/util/regex/Pattern;

    .line 49
    sget-object v0, Lo/ftt$e;->a:Lo/ftt$e;

    sput-object v0, Lo/ftt;->k:Lo/ftt$e;

    .line 50
    const-string v0, "^(\\d+:){2}\\d+$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/ftt;->g:Ljava/util/regex/Pattern;

    .line 52
    sget-object v0, Lo/ftt$e;->c:Lo/ftt$e;

    sput-object v0, Lo/ftt;->o:Lo/ftt$e;

    .line 53
    const-string v0, "^\\d+(-\\d+){2}+T(\\d+:){2}\\d+.\\d+(Z|([+-](\\d+:\\d+)))?$"

    .line 54
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/ftt;->m:Ljava/util/regex/Pattern;

    .line 55
    sget-object v0, Lo/ftt$e;->d:Lo/ftt$e;

    sput-object v0, Lo/ftt;->p:Lo/ftt$e;

    .line 56
    const-string v0, "^\\d+(-\\d+){2}+T(\\d+:){2}\\d+(Z|([+-](\\d+:\\d+)))?$"

    .line 57
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/ftt;->l:Ljava/util/regex/Pattern;

    .line 59
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMdd\'T\'HH:mm:ss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo/ftt;->n:Ljava/text/DateFormat;

    .line 60
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMd\'T\'HH:mm:ss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo/ftt;->q:Ljava/text/DateFormat;

    .line 61
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMdd\'T\'HH:mm:ss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo/ftt;->u:Ljava/text/DateFormat;

    .line 62
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMd\'T\'HH:mm:ss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo/ftt;->r:Ljava/text/DateFormat;

    .line 63
    const-string v0, "^\\d+T\\d+:\\d+:\\d+$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/ftt;->s:Ljava/util/regex/Pattern;

    .line 122
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/ftt;->t:Ljava/util/List;

    .line 125
    const-string v0, "UTC"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v4

    .line 127
    sget-object v0, Lo/ftt;->n:Ljava/text/DateFormat;

    invoke-virtual {v0, v4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 128
    sget-object v0, Lo/ftt;->q:Ljava/text/DateFormat;

    invoke-virtual {v0, v4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 129
    sget-object v0, Lo/ftt;->u:Ljava/text/DateFormat;

    invoke-virtual {v0, v4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 130
    sget-object v0, Lo/ftt;->u:Ljava/text/DateFormat;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 131
    sget-object v0, Lo/ftt;->r:Ljava/text/DateFormat;

    invoke-virtual {v0, v4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 132
    sget-object v0, Lo/ftt;->r:Ljava/text/DateFormat;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 134
    sget-object v0, Lo/ftt;->t:Ljava/util/List;

    new-instance v1, Lo/ftt$b;

    sget-object v2, Lo/ftt;->d:Ljava/util/regex/Pattern;

    sget-object v3, Lo/ftt;->b:Lo/ftt$e;

    invoke-direct {v1, v2, v3}, Lo/ftt$b;-><init>(Ljava/util/regex/Pattern;Lo/ftt$e;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 135
    sget-object v0, Lo/ftt;->t:Ljava/util/List;

    new-instance v1, Lo/ftt$b;

    sget-object v2, Lo/ftt;->m:Ljava/util/regex/Pattern;

    sget-object v3, Lo/ftt;->o:Lo/ftt$e;

    invoke-direct {v1, v2, v3}, Lo/ftt$b;-><init>(Ljava/util/regex/Pattern;Lo/ftt$e;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 136
    sget-object v0, Lo/ftt;->t:Ljava/util/List;

    new-instance v1, Lo/ftt$b;

    sget-object v2, Lo/ftt;->l:Ljava/util/regex/Pattern;

    sget-object v3, Lo/ftt;->p:Lo/ftt$e;

    invoke-direct {v1, v2, v3}, Lo/ftt$b;-><init>(Ljava/util/regex/Pattern;Lo/ftt$e;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 137
    sget-object v0, Lo/ftt;->t:Ljava/util/List;

    new-instance v1, Lo/ftt$b;

    sget-object v2, Lo/ftt;->e:Ljava/util/regex/Pattern;

    sget-object v3, Lo/ftt;->c:Lo/ftt$e;

    invoke-direct {v1, v2, v3}, Lo/ftt$b;-><init>(Ljava/util/regex/Pattern;Lo/ftt$e;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 138
    sget-object v0, Lo/ftt;->t:Ljava/util/List;

    new-instance v1, Lo/ftt$b;

    sget-object v2, Lo/ftt;->i:Ljava/util/regex/Pattern;

    sget-object v3, Lo/ftt;->a:Lo/ftt$e;

    invoke-direct {v1, v2, v3}, Lo/ftt$b;-><init>(Ljava/util/regex/Pattern;Lo/ftt$e;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    sget-object v0, Lo/ftt;->t:Ljava/util/List;

    new-instance v1, Lo/ftt$b;

    sget-object v2, Lo/ftt;->h:Ljava/util/regex/Pattern;

    sget-object v3, Lo/ftt;->f:Lo/ftt$e;

    invoke-direct {v1, v2, v3}, Lo/ftt$b;-><init>(Ljava/util/regex/Pattern;Lo/ftt$e;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    sget-object v0, Lo/ftt;->t:Ljava/util/List;

    new-instance v1, Lo/ftt$b;

    sget-object v2, Lo/ftt;->g:Ljava/util/regex/Pattern;

    sget-object v3, Lo/ftt;->k:Lo/ftt$e;

    invoke-direct {v1, v2, v3}, Lo/ftt$b;-><init>(Ljava/util/regex/Pattern;Lo/ftt$e;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 332
    const-string v0, ".*\\.(\\d{1,})(Z|((\\+|-)\\d{4}))"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/ftt;->y:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 252
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 253
    add-int/lit8 v0, v2, -0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 254
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 255
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    add-int/lit8 v1, v2, -0x2

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 256
    return-object v3
.end method

.method private static a(Ljava/lang/String;I)Ljava/util/Date;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 285
    const/4 v0, 0x6

    if-ne p1, v0, :cond_0

    .line 286
    sget-object v2, Lo/ftt;->q:Ljava/text/DateFormat;

    monitor-enter v2

    .line 287
    :try_start_0
    sget-object v0, Lo/ftt;->q:Ljava/text/DateFormat;

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v2

    return-object v0

    .line 288
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 290
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 292
    sget-object v0, Lo/ftt;->u:Ljava/text/DateFormat;

    invoke-static {p0, v0}, Lo/ftt;->b(Ljava/lang/String;Ljava/text/DateFormat;)Ljava/util/Calendar;

    move-result-object v3

    .line 293
    sget-object v0, Lo/ftt;->r:Ljava/text/DateFormat;

    invoke-static {p0, v0}, Lo/ftt;->b(Ljava/lang/String;Ljava/text/DateFormat;)Ljava/util/Calendar;

    move-result-object v4

    .line 295
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/util/Calendar;

    const/4 v1, 0x0

    aput-object v3, v0, v1

    const/4 v1, 0x1

    aput-object v4, v0, v1

    invoke-static {v2, v0}, Lo/ftt;->c(Ljava/util/Calendar;[Ljava/util/Calendar;)Ljava/util/List;

    move-result-object v5

    .line 297
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 298
    invoke-static {v2, v5}, Lo/ftt;->e(Ljava/util/Calendar;Ljava/util/List;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0

    .line 300
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static b(Ljava/util/Date;)Ljava/lang/String;
    .locals 3

    .line 220
    sget-object v1, Lo/ftt;->o:Lo/ftt$e;

    monitor-enter v1

    .line 221
    :try_start_0
    sget-object v0, Lo/ftt;->o:Lo/ftt$e;

    invoke-static {v0, p0}, Lo/ftt$e;->e(Lo/ftt$e;Ljava/util/Date;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 222
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static b(Ljava/lang/String;Ljava/text/DateFormat;)Ljava/util/Calendar;
    .locals 3

    .line 305
    move-object v1, p1

    :try_start_0
    monitor-enter v1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 306
    :try_start_1
    invoke-virtual {p1, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 307
    invoke-virtual {p1}, Ljava/text/DateFormat;->getCalendar()Ljava/util/Calendar;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 308
    :catchall_0
    move-exception v2

    monitor-exit v1

    :try_start_2
    throw v2
    :try_end_2
    .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_0

    .line 309
    :catch_0
    move-exception v1

    .line 310
    const/4 v0, 0x0

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/util/Date;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 155
    sget-object v0, Lo/ftt;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ftt$b;

    .line 156
    iget-object v0, v2, Lo/ftt$b;->e:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 158
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 159
    iget-object v0, v2, Lo/ftt$b;->d:Lo/ftt$e;

    invoke-static {v0, p0}, Lo/ftt$e;->d(Lo/ftt$e;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    return-object v0

    .line 161
    :cond_0
    goto :goto_0

    .line 167
    :cond_1
    sget-object v1, Lo/ftt;->p:Lo/ftt$e;

    monitor-enter v1

    .line 168
    :try_start_0
    sget-object v0, Lo/ftt;->p:Lo/ftt$e;

    invoke-static {v0, p0}, Lo/ftt$e;->d(Lo/ftt$e;Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 169
    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4
.end method

.method public static c(Ljava/lang/String;)Ljava/util/Date;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 188
    sget-object v0, Lo/ftt;->s:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 194
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 195
    const-string v0, "T"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    .line 197
    const/16 v0, 0x8

    if-ge v3, v0, :cond_1

    .line 198
    invoke-static {p0, v3}, Lo/ftt;->a(Ljava/lang/String;I)Ljava/util/Date;

    move-result-object v4

    .line 200
    if-eqz v4, :cond_0

    .line 201
    return-object v4

    .line 202
    :cond_0
    goto :goto_0

    .line 203
    :cond_1
    sget-object v4, Lo/ftt;->n:Ljava/text/DateFormat;

    monitor-enter v4

    .line 204
    :try_start_0
    sget-object v0, Lo/ftt;->n:Ljava/text/DateFormat;

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v4

    return-object v0

    .line 205
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 209
    :cond_2
    :goto_0
    invoke-static {p0}, Lo/ftt;->b(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method private static varargs c(Ljava/util/Calendar;[Ljava/util/Calendar;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Calendar;[Ljava/util/Calendar;)Ljava/util/List<Ljava/util/Calendar;>;"
        }
    .end annotation

    .line 315
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 317
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 318
    if-eqz v5, :cond_0

    invoke-virtual {v5, p0}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 319
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 317
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 323
    :cond_1
    return-object v1
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 234
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x5a

    if-ne v0, v1, :cond_0

    .line 235
    const-string v0, "Z"

    const-string v1, "+0000"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 241
    :cond_0
    const-string v0, "([\\+\\-]\\d\\d):(\\d\\d)"

    const-string v1, "$1$2"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 37
    invoke-static {p0}, Lo/ftt;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static e(Ljava/util/Calendar;Ljava/util/List;)Ljava/util/Calendar;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Calendar;Ljava/util/List<Ljava/util/Calendar;>;)Ljava/util/Calendar;"
        }
    .end annotation

    .line 378
    new-instance v0, Lo/ftt$1;

    invoke-direct {v0, p0}, Lo/ftt$1;-><init>(Ljava/util/Calendar;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 390
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Calendar;

    return-object v0
.end method

.method private static i(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 345
    sget-object v0, Lo/ftt;->y:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 346
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_0

    .line 348
    return-object p0

    .line 351
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    .line 352
    const/4 v0, 0x3

    if-ne v3, v0, :cond_1

    .line 354
    return-object p0

    .line 358
    :cond_1
    const-string v0, "."

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    .line 359
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v3

    add-int/lit8 v0, v0, 0x3

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 360
    const/4 v0, 0x3

    if-le v3, v0, :cond_2

    .line 362
    add-int/lit8 v0, v4, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 365
    :cond_2
    add-int v0, v4, v3

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    move v6, v3

    :goto_0
    const/4 v0, 0x3

    if-ge v6, v0, :cond_3

    .line 368
    const/16 v0, 0x30

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 367
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 372
    :cond_3
    :goto_1
    add-int v0, v4, v3

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
