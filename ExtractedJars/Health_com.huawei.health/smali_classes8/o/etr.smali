.class public Lo/etr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile d:Lo/etr;


# instance fields
.field private a:Landroid/os/Handler;

.field private c:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/etr;->c:Landroid/content/Context;

    .line 34
    invoke-direct {p0}, Lo/etr;->e()V

    .line 35
    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/etr;
    .locals 2

    .line 26
    sget-object v0, Lo/etr;->d:Lo/etr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 27
    new-instance v0, Lo/etr;

    invoke-direct {v0, p0}, Lo/etr;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/etr;->d:Lo/etr;

    .line 29
    :cond_0
    sget-object v0, Lo/etr;->d:Lo/etr;

    return-object v0
.end method

.method static synthetic b(Lo/etr;)Landroid/os/Handler;
    .locals 1

    .line 17
    iget-object v0, p0, Lo/etr;->a:Landroid/os/Handler;

    return-object v0
.end method

.method private e()V
    .locals 3

    .line 38
    iget-object v0, p0, Lo/etr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/etr$3;

    invoke-direct {v1, p0}, Lo/etr$3;-><init>(Lo/etr;)V

    const/16 v2, 0x66

    invoke-virtual {v0, v2, v1}, Lo/clq;->a(ILo/cmg;)V

    .line 57
    return-void
.end method


# virtual methods
.method public c(Landroid/os/Handler;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lo/etr;->a:Landroid/os/Handler;

    .line 61
    return-void
.end method
