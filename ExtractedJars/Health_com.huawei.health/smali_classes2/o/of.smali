.class public final Lo/of;
.super Lo/os;
.source "SourceFile"


# static fields
.field private static final a:Lo/of;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 28
    new-instance v0, Lo/of;

    invoke-direct {v0}, Lo/of;-><init>()V

    sput-object v0, Lo/of;->a:Lo/of;

    .line 30
    sget-object v0, Lo/of;->a:Lo/of;

    sget-object v1, Lo/of;->e:[Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v1}, Lo/of;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 31
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lo/os;-><init>()V

    .line 34
    return-void
.end method

.method private constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lo/os;-><init>(Ljava/lang/Throwable;)V

    .line 38
    return-void
.end method

.method public static b()Lo/of;
    .locals 1

    .line 41
    sget-boolean v0, Lo/of;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Lo/of;

    invoke-direct {v0}, Lo/of;-><init>()V

    goto :goto_0

    :cond_0
    sget-object v0, Lo/of;->a:Lo/of;

    :goto_0
    return-object v0
.end method

.method public static c(Ljava/lang/Throwable;)Lo/of;
    .locals 1

    .line 45
    sget-boolean v0, Lo/of;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Lo/of;

    invoke-direct {v0, p0}, Lo/of;-><init>(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lo/of;->a:Lo/of;

    :goto_0
    return-object v0
.end method
