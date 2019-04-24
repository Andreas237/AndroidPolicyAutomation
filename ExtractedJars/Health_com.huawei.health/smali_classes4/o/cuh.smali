.class public Lo/cuh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:D

.field private static b:Z

.field private static c:Z

.field private static d:D

.field private static e:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 38
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sput-wide v0, Lo/cuh;->d:D

    .line 39
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sput-wide v0, Lo/cuh;->e:D

    .line 40
    const/4 v0, 0x0

    sput-boolean v0, Lo/cuh;->b:Z

    .line 41
    const/4 v0, 0x0

    sput-boolean v0, Lo/cuh;->c:Z

    .line 43
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sput-wide v0, Lo/cuh;->a:D

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(D)V
    .locals 4

    .line 63
    const-wide/16 v0, 0x0

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_0

    return-void

    .line 64
    :cond_0
    sget-wide v0, Lo/cuh;->d:D

    add-double v2, v0, p0

    .line 65
    sget-wide v0, Lo/cuh;->e:D

    cmpl-double v0, v2, v0

    if-ltz v0, :cond_1

    sget-wide v0, Lo/cuh;->e:D

    goto :goto_0

    :cond_1
    move-wide v0, v2

    :goto_0
    sput-wide v0, Lo/cuh;->d:D

    .line 66
    return-void
.end method

.method public static a(DLjava/lang/String;)V
    .locals 6

    .line 70
    const-wide/16 v0, 0x0

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_0

    return-void

    .line 71
    :cond_0
    const-string v0, "Debug_HiSyncProcess"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setCurrentMaxProcess tag is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    sget-wide v0, Lo/cuh;->e:D

    add-double v4, v0, p0

    .line 73
    const-wide v0, 0x4058c00000000000L    # 99.0

    cmpl-double v0, v4, v0

    if-ltz v0, :cond_1

    const-wide v0, 0x4058c00000000000L    # 99.0

    goto :goto_0

    :cond_1
    move-wide v0, v4

    :goto_0
    sput-wide v0, Lo/cuh;->e:D

    .line 74
    const-string v0, "Debug_HiSyncProcess"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setCurrentMaxProcess currentMaxProcess is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-wide v2, Lo/cuh;->e:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .line 108
    invoke-static {p0}, Lo/cuh;->f(Landroid/content/Context;)V

    .line 109
    const/4 v0, 0x0

    invoke-static {v0}, Lo/csk;->c(Z)V

    .line 110
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cuh;->e(ZZ)V

    .line 111
    return-void
.end method

.method private static a(Landroid/content/Context;D)V
    .locals 1

    .line 122
    sget-boolean v0, Lo/cuh;->b:Z

    if-nez v0, :cond_0

    .line 123
    return-void

    .line 125
    :cond_0
    invoke-static {p0, p1, p2}, Lo/cnt;->c(Landroid/content/Context;D)V

    .line 126
    return-void
.end method

.method public static a(Landroid/content/Context;DDD)V
    .locals 6

    .line 52
    sget-boolean v0, Lo/cuh;->c:Z

    if-nez v0, :cond_0

    return-void

    .line 53
    :cond_0
    mul-double v0, p1, p3

    mul-double v4, v0, p5

    .line 54
    invoke-static {v4, v5}, Lo/cuh;->a(D)V

    .line 55
    sget-wide v0, Lo/cuh;->d:D

    sget-wide v2, Lo/cuh;->a:D

    sub-double/2addr v0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 56
    return-void

    .line 58
    :cond_1
    sget-wide v0, Lo/cuh;->d:D

    sput-wide v0, Lo/cuh;->a:D

    .line 59
    sget-wide v0, Lo/cuh;->d:D

    invoke-static {p0, v0, v1}, Lo/cuh;->a(Landroid/content/Context;D)V

    .line 60
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    .line 79
    sget-boolean v0, Lo/cuh;->c:Z

    if-nez v0, :cond_0

    .line 80
    return-void

    .line 82
    :cond_0
    sget-wide v0, Lo/cuh;->e:D

    invoke-static {p0, v0, v1}, Lo/cuh;->a(Landroid/content/Context;D)V

    .line 83
    sget-wide v0, Lo/cuh;->e:D

    sput-wide v0, Lo/cuh;->d:D

    .line 84
    return-void
.end method

.method public static b(Landroid/content/Context;I)V
    .locals 2

    .line 95
    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cuh;->e(ZZ)V

    .line 96
    invoke-static {p0}, Lo/cuh;->d(Landroid/content/Context;)V

    .line 97
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {p0, v0, v1}, Lo/cuh;->a(Landroid/content/Context;D)V

    .line 98
    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 2

    .line 87
    sget-boolean v0, Lo/cuh;->c:Z

    if-nez v0, :cond_0

    .line 88
    return-void

    .line 90
    :cond_0
    sget-wide v0, Lo/cuh;->d:D

    invoke-static {p0, v0, v1}, Lo/cuh;->a(Landroid/content/Context;D)V

    .line 91
    return-void
.end method

.method public static d(I)V
    .locals 1

    .line 150
    if-nez p0, :cond_0

    .line 151
    const/4 v0, 0x1

    sput-boolean v0, Lo/cuh;->b:Z

    .line 153
    :cond_0
    return-void
.end method

.method private static d(Landroid/content/Context;)V
    .locals 1

    .line 129
    sget-boolean v0, Lo/cuh;->b:Z

    if-nez v0, :cond_0

    .line 130
    return-void

    .line 132
    :cond_0
    invoke-static {p0}, Lo/cnt;->b(Landroid/content/Context;)V

    .line 133
    return-void
.end method

.method public static e(Landroid/content/Context;)V
    .locals 2

    .line 101
    const-wide v0, 0x4058c00000000000L    # 99.0

    invoke-static {p0, v0, v1}, Lo/cuh;->a(Landroid/content/Context;D)V

    .line 102
    invoke-static {p0}, Lo/cuh;->g(Landroid/content/Context;)V

    .line 103
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cuh;->e(ZZ)V

    .line 104
    const/4 v0, 0x0

    invoke-static {v0}, Lo/csk;->c(Z)V

    .line 105
    return-void
.end method

.method private static e(ZZ)V
    .locals 2

    .line 114
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sput-wide v0, Lo/cuh;->d:D

    .line 115
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sput-wide v0, Lo/cuh;->e:D

    .line 116
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sput-wide v0, Lo/cuh;->a:D

    .line 117
    sput-boolean p0, Lo/cuh;->b:Z

    .line 118
    sput-boolean p1, Lo/cuh;->c:Z

    .line 119
    return-void
.end method

.method private static f(Landroid/content/Context;)V
    .locals 1

    .line 143
    sget-boolean v0, Lo/cuh;->b:Z

    if-nez v0, :cond_0

    .line 144
    return-void

    .line 146
    :cond_0
    invoke-static {p0}, Lo/cnt;->i(Landroid/content/Context;)V

    .line 147
    return-void
.end method

.method private static g(Landroid/content/Context;)V
    .locals 1

    .line 136
    sget-boolean v0, Lo/cuh;->b:Z

    if-nez v0, :cond_0

    .line 137
    return-void

    .line 139
    :cond_0
    invoke-static {p0}, Lo/cnt;->g(Landroid/content/Context;)V

    .line 140
    return-void
.end method
