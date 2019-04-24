.class public Lo/eji;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eji$d;,
        Lo/eji$a;,
        Lo/eji$e;,
        Lo/eji$c;,
        Lo/eji$b;
    }
.end annotation


# static fields
.field static final c:I


# instance fields
.field private a:Lo/eie;

.field private b:Lo/eji$b;

.field private d:Lo/eji$b;

.field private e:Lo/eji$b;

.field private f:Lo/oa;

.field private h:Landroid/content/Context;

.field private i:Lo/eja;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    const/high16 v0, 0x40400000    # 3.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    float-to-int v0, v0

    sput v0, Lo/eji;->c:I

    return-void
.end method

.method public constructor <init>(Lo/eja;Lo/eie;Lo/oa;)V
    .locals 2

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eji;->b:Lo/eji$b;

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eji;->d:Lo/eji$b;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eji;->e:Lo/eji$b;

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eji;->a:Lo/eie;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eji;->i:Lo/eja;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eji;->f:Lo/oa;

    .line 49
    invoke-virtual {p2}, Lo/eie;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/eji;->h:Landroid/content/Context;

    .line 50
    iput-object p1, p0, Lo/eji;->i:Lo/eja;

    .line 51
    iput-object p2, p0, Lo/eji;->a:Lo/eie;

    .line 52
    iput-object p3, p0, Lo/eji;->f:Lo/oa;

    .line 55
    new-instance v0, Lo/eji$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/eji$e;-><init>(Lo/eji;Lo/eji$1;)V

    iput-object v0, p0, Lo/eji;->b:Lo/eji$b;

    .line 56
    new-instance v0, Lo/eji$a;

    invoke-direct {v0, p0}, Lo/eji$a;-><init>(Lo/eji;)V

    iput-object v0, p0, Lo/eji;->d:Lo/eji$b;

    .line 57
    new-instance v0, Lo/eji$d;

    invoke-direct {v0, p0}, Lo/eji$d;-><init>(Lo/eji;)V

    iput-object v0, p0, Lo/eji;->e:Lo/eji$b;

    .line 58
    return-void
.end method

.method static synthetic a(Lo/eji;)Lo/eie;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/eji;->a:Lo/eie;

    return-object v0
.end method

.method static synthetic b(Lo/eji;)Lo/eji$b;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/eji;->e:Lo/eji$b;

    return-object v0
.end method

.method static synthetic c(Lo/eji;)Lo/eji$b;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/eji;->b:Lo/eji$b;

    return-object v0
.end method

.method static synthetic d(Lo/eji;)Landroid/content/Context;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/eji;->h:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lo/eji;)Lo/eji$b;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/eji;->d:Lo/eji$b;

    return-object v0
.end method

.method static synthetic h(Lo/eji;)Lo/oa;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/eji;->f:Lo/oa;

    return-object v0
.end method

.method static synthetic k(Lo/eji;)Lo/eja;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/eji;->i:Lo/eja;

    return-object v0
.end method


# virtual methods
.method public a()Lo/eji$b;
    .locals 1

    .line 61
    iget-object v0, p0, Lo/eji;->b:Lo/eji$b;

    return-object v0
.end method
