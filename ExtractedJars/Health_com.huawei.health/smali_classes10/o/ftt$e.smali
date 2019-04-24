.class final enum Lo/ftt$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ftt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/ftt$e;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/ftt$e;

.field public static final enum b:Lo/ftt$e;

.field public static final enum c:Lo/ftt$e;

.field public static final enum d:Lo/ftt$e;

.field public static final enum e:Lo/ftt$e;

.field public static final enum f:Lo/ftt$e;

.field public static final enum g:Lo/ftt$e;

.field public static final enum i:Lo/ftt$e;

.field private static final synthetic n:[Lo/ftt$e;


# instance fields
.field private final h:Ljava/lang/String;

.field private final k:Ljava/text/DateFormat;

.field private final l:Z

.field private final o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 67
    new-instance v0, Lo/ftt$e;

    const-string v1, "XEP_0082_DATE_PROFILE"

    const-string v2, "yyyy-MM-dd"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lo/ftt$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/ftt$e;->b:Lo/ftt$e;

    .line 68
    new-instance v0, Lo/ftt$e;

    const-string v1, "XEP_0082_DATETIME_PROFILE"

    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ssZ"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lo/ftt$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/ftt$e;->d:Lo/ftt$e;

    .line 69
    new-instance v0, Lo/ftt$e;

    const-string v1, "XEP_0082_DATETIME_MILLIS_PROFILE"

    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss.SSSZ"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v2}, Lo/ftt$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/ftt$e;->c:Lo/ftt$e;

    .line 70
    new-instance v0, Lo/ftt$e;

    const-string v1, "XEP_0082_TIME_PROFILE"

    const-string v2, "hh:mm:ss"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3, v2}, Lo/ftt$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/ftt$e;->a:Lo/ftt$e;

    .line 71
    new-instance v0, Lo/ftt$e;

    const-string v1, "XEP_0082_TIME_ZONE_PROFILE"

    const-string v2, "hh:mm:ssZ"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v3, v2}, Lo/ftt$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/ftt$e;->e:Lo/ftt$e;

    .line 72
    new-instance v0, Lo/ftt$e;

    const-string v1, "XEP_0082_TIME_MILLIS_PROFILE"

    const-string v2, "hh:mm:ss.SSS"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v3, v2}, Lo/ftt$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/ftt$e;->g:Lo/ftt$e;

    .line 73
    new-instance v0, Lo/ftt$e;

    const-string v1, "XEP_0082_TIME_MILLIS_ZONE_PROFILE"

    const-string v2, "hh:mm:ss.SSSZ"

    const/4 v3, 0x6

    invoke-direct {v0, v1, v3, v2}, Lo/ftt$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/ftt$e;->f:Lo/ftt$e;

    .line 74
    new-instance v0, Lo/ftt$e;

    const-string v1, "XEP_0091_DATETIME"

    const-string v2, "yyyyMMdd\'T\'HH:mm:ss"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v3, v2}, Lo/ftt$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/ftt$e;->i:Lo/ftt$e;

    .line 65
    const/16 v0, 0x8

    new-array v0, v0, [Lo/ftt$e;

    sget-object v1, Lo/ftt$e;->b:Lo/ftt$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/ftt$e;->d:Lo/ftt$e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/ftt$e;->c:Lo/ftt$e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/ftt$e;->a:Lo/ftt$e;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/ftt$e;->e:Lo/ftt$e;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/ftt$e;->g:Lo/ftt$e;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/ftt$e;->f:Lo/ftt$e;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/ftt$e;->i:Lo/ftt$e;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lo/ftt$e;->n:[Lo/ftt$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)V"
        }
    .end annotation

    .line 90
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 91
    iput-object p3, p0, Lo/ftt$e;->h:Ljava/lang/String;

    .line 92
    new-instance v0, Ljava/text/SimpleDateFormat;

    iget-object v1, p0, Lo/ftt$e;->h:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/ftt$e;->k:Ljava/text/DateFormat;

    .line 93
    iget-object v0, p0, Lo/ftt$e;->k:Ljava/text/DateFormat;

    const-string v1, "UTC"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 94
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x5a

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lo/ftt$e;->l:Z

    .line 95
    const-string v0, "SSS"

    invoke-virtual {p3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    iput-boolean v0, p0, Lo/ftt$e;->o:Z

    .line 96
    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/util/Date;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 110
    iget-boolean v0, p0, Lo/ftt$e;->l:Z

    if-eqz v0, :cond_0

    .line 111
    invoke-static {p1}, Lo/ftt;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 113
    :cond_0
    iget-boolean v0, p0, Lo/ftt$e;->o:Z

    if-eqz v0, :cond_1

    .line 114
    invoke-static {p1}, Lo/ftt;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 116
    :cond_1
    iget-object v1, p0, Lo/ftt$e;->k:Ljava/text/DateFormat;

    monitor-enter v1

    .line 117
    :try_start_0
    iget-object v0, p0, Lo/ftt$e;->k:Ljava/text/DateFormat;

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 118
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private b(Ljava/util/Date;)Ljava/lang/String;
    .locals 4

    .line 100
    iget-object v2, p0, Lo/ftt$e;->k:Ljava/text/DateFormat;

    monitor-enter v2

    .line 101
    :try_start_0
    iget-object v0, p0, Lo/ftt$e;->k:Ljava/text/DateFormat;

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 102
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 103
    :goto_0
    iget-boolean v0, p0, Lo/ftt$e;->l:Z

    if-eqz v0, :cond_0

    .line 104
    invoke-static {v1}, Lo/ftt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 106
    :cond_0
    return-object v1
.end method

.method static synthetic d(Lo/ftt$e;Ljava/lang/String;)Ljava/util/Date;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 65
    invoke-direct {p0, p1}, Lo/ftt$e;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lo/ftt$e;Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    .line 65
    invoke-direct {p0, p1}, Lo/ftt$e;->b(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo/ftt$e;
    .locals 1

    .line 65
    const-class v0, Lo/ftt$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/ftt$e;

    return-object v0
.end method

.method public static values()[Lo/ftt$e;
    .locals 1

    .line 65
    sget-object v0, Lo/ftt$e;->n:[Lo/ftt$e;

    invoke-virtual {v0}, [Lo/ftt$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/ftt$e;

    return-object v0
.end method
