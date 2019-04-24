.class public final Lo/bci;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Lo/bci;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    new-instance v0, Lo/bci;

    invoke-direct {v0}, Lo/bci;-><init>()V

    sput-object v0, Lo/bci;->e:Lo/bci;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method

.method public static d()Lo/bci;
    .locals 1

    .line 36
    sget-object v0, Lo/bci;->e:Lo/bci;

    return-object v0
.end method


# virtual methods
.method public b()Landroid/content/Context;
    .locals 3

    .line 47
    invoke-static {}, Lo/aoa;->e()Landroid/content/Context;

    move-result-object v2

    .line 48
    if-nez v2, :cond_0

    .line 50
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Call init first."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 53
    :cond_0
    return-object v2
.end method
