.class public Lo/bpf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/regex/Pattern;

.field private static b:Ljava/lang/String;

.field private static d:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 25
    const-string v0, ""

    sput-object v0, Lo/bpf;->b:Ljava/lang/String;

    .line 30
    const-wide/16 v0, 0x0

    sput-wide v0, Lo/bpf;->d:J

    .line 44
    const-string v0, "[0-9]*[a-z|A-Z]*[\u4e00-\u9fa5]*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/bpf;->a:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 376
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 368
    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 7

    .line 50
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 51
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 52
    const-string v0, "\\."

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 53
    array-length v0, v4

    if-lez v0, :cond_0

    .line 55
    const-class v5, Lo/bpf;

    monitor-enter v5

    .line 56
    :try_start_0
    array-length v0, v4

    add-int/lit8 v0, v0, -0x1

    aget-object v0, v4, v0

    sput-object v0, Lo/bpf;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 61
    :cond_0
    :goto_0
    const-string v0, "LogX"

    const-string v1, "SNS startup, the version is: "

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 63
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 400
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .line 92
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p0, v0}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    return-void
.end method

.method public static c()Z
    .locals 1

    .line 460
    const/4 v0, 0x1

    return v0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 384
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 392
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 454
    return-void
.end method
