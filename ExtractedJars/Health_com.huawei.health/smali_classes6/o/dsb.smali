.class public Lo/dsb;
.super Lo/dry;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/os/Message;

.field private c:Lo/dsl;

.field private d:Lo/dqz;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const-class v0, Lo/dsb;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dsb;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/dqz;Landroid/os/Message;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Lo/dry;-><init>()V

    .line 41
    new-instance v0, Lo/dsb$2;

    invoke-direct {v0, p0}, Lo/dsb$2;-><init>(Lo/dsb;)V

    iput-object v0, p0, Lo/dsb;->c:Lo/dsl;

    .line 23
    iput-object p1, p0, Lo/dsb;->a:Landroid/content/Context;

    .line 24
    iput-object p3, p0, Lo/dsb;->b:Landroid/os/Message;

    .line 25
    iput-object p2, p0, Lo/dsb;->d:Lo/dqz;

    .line 26
    return-void
.end method

.method static synthetic c(Lo/dsb;)Landroid/content/Context;
    .locals 1

    .line 16
    iget-object v0, p0, Lo/dsb;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lo/dsb;)Landroid/os/Message;
    .locals 1

    .line 16
    iget-object v0, p0, Lo/dsb;->b:Landroid/os/Message;

    return-object v0
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 16
    sget-object v0, Lo/dsb;->e:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method a()V
    .locals 5

    .line 30
    invoke-static {}, Lo/dsg;->b()Lo/dsg;

    move-result-object v2

    .line 31
    iget-object v0, p0, Lo/dsb;->d:Lo/dqz;

    invoke-virtual {p0, v0}, Lo/dsb;->d(Lo/dqz;)Ljava/lang/String;

    move-result-object v3

    .line 32
    iget-object v0, p0, Lo/dsb;->d:Lo/dqz;

    invoke-virtual {v0}, Lo/dqz;->d()Ljava/lang/String;

    move-result-object v4

    .line 33
    iget-object v0, p0, Lo/dsb;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/dsb;->c:Lo/dsl;

    invoke-virtual {v2, v0, v3, v4, v1}, Lo/dsg;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lo/dsl;)V

    .line 34
    return-void
.end method
