.class public final Lo/bcg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;

.field private static b:Lo/bcg;


# instance fields
.field private c:Z

.field private d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    const-class v0, Lo/bcg;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bcg;->a:Ljava/lang/String;

    .line 43
    const/4 v0, 0x0

    sput-object v0, Lo/bcg;->b:Lo/bcg;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bcg;->c:Z

    .line 62
    return-void
.end method

.method public static declared-synchronized a()Lo/bcg;
    .locals 3

    const-class v1, Lo/bcg;

    monitor-enter v1

    .line 52
    :try_start_0
    sget-object v0, Lo/bcg;->b:Lo/bcg;

    if-nez v0, :cond_0

    .line 54
    new-instance v0, Lo/bcg;

    invoke-direct {v0}, Lo/bcg;-><init>()V

    sput-object v0, Lo/bcg;->b:Lo/bcg;

    .line 56
    :cond_0
    sget-object v0, Lo/bcg;->b:Lo/bcg;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lo/bcg;->d:Ljava/lang/String;

    .line 142
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 7

    .line 102
    if-nez p1, :cond_0

    .line 104
    sget-object v0, Lo/bcg;->a:Ljava/lang/String;

    const-string v1, "parseWhiteList got urls is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    return-void

    .line 108
    :cond_0
    const-string v0, "|"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 110
    const-string v0, "\\|"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 111
    move-object v3, v2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    .line 113
    const-string v0, "*."

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 115
    sget-object v0, Lo/bcg;->a:Ljava/lang/String;

    const-string v1, "parseWhiteList got error format"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    return-void

    .line 111
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 119
    :cond_2
    goto :goto_1

    .line 122
    :cond_3
    const-string v0, "*."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 124
    sget-object v0, Lo/bcg;->a:Ljava/lang/String;

    const-string v1, "parseWhiteList got error format"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    return-void

    .line 128
    :cond_4
    :goto_1
    const-string v0, "*"

    const-string v1, "/*"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bcg;->d:Ljava/lang/String;

    .line 129
    return-void
.end method
