.class public final Lo/oo;
.super Lo/os;
.source "SourceFile"


# static fields
.field private static final b:Lo/oo;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 27
    new-instance v0, Lo/oo;

    invoke-direct {v0}, Lo/oo;-><init>()V

    sput-object v0, Lo/oo;->b:Lo/oo;

    .line 29
    sget-object v0, Lo/oo;->b:Lo/oo;

    sget-object v1, Lo/oo;->e:[Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v1}, Lo/oo;->setStackTrace([Ljava/lang/StackTraceElement;)V

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

.method public static a()Lo/oo;
    .locals 1

    .line 37
    sget-object v0, Lo/oo;->b:Lo/oo;

    return-object v0
.end method
