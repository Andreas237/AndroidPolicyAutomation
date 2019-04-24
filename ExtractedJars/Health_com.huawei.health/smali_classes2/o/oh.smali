.class public final Lo/oh;
.super Lo/os;
.source "SourceFile"


# static fields
.field private static final d:Lo/oh;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 27
    new-instance v0, Lo/oh;

    invoke-direct {v0}, Lo/oh;-><init>()V

    sput-object v0, Lo/oh;->d:Lo/oh;

    .line 29
    sget-object v0, Lo/oh;->d:Lo/oh;

    sget-object v1, Lo/oh;->e:[Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v1}, Lo/oh;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 30
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lo/os;-><init>()V

    .line 34
    return-void
.end method

.method public static d()Lo/oh;
    .locals 1

    .line 41
    sget-boolean v0, Lo/oh;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Lo/oh;

    invoke-direct {v0}, Lo/oh;-><init>()V

    goto :goto_0

    :cond_0
    sget-object v0, Lo/oh;->d:Lo/oh;

    :goto_0
    return-object v0
.end method
