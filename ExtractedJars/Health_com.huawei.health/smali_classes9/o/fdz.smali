.class public Lo/fdz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Z

.field private c:Ljava/util/Timer;

.field private e:Landroid/widget/SeekBar;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fdz;->b:Z

    .line 25
    return-void
.end method

.method static synthetic a(Lo/fdz;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lo/fdz;->d()V

    return-void
.end method

.method private b()V
    .locals 6

    .line 40
    invoke-direct {p0}, Lo/fdz;->c()V

    .line 41
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lo/fdz;->c:Ljava/util/Timer;

    .line 42
    iget-object v0, p0, Lo/fdz;->c:Ljava/util/Timer;

    new-instance v1, Lo/fdz$4;

    invoke-direct {v1, p0}, Lo/fdz$4;-><init>(Lo/fdz;)V

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0xf

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 48
    return-void
.end method

.method private c()V
    .locals 1

    .line 70
    iget-object v0, p0, Lo/fdz;->c:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p0, Lo/fdz;->c:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fdz;->c:Ljava/util/Timer;

    .line 74
    :cond_0
    return-void
.end method

.method private d()V
    .locals 3

    .line 53
    iget-object v0, p0, Lo/fdz;->e:Landroid/widget/SeekBar;

    invoke-virtual {v0}, Landroid/widget/SeekBar;->getProgress()I

    move-result v2

    .line 54
    iget-boolean v0, p0, Lo/fdz;->b:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lo/fdz;->a:I

    if-le v0, v2, :cond_1

    .line 57
    iget v0, p0, Lo/fdz;->a:I

    if-eq v2, v0, :cond_0

    .line 58
    iget-object v0, p0, Lo/fdz;->e:Landroid/widget/SeekBar;

    add-int/lit8 v1, v2, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    goto :goto_0

    .line 60
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fdz;->b:Z

    .line 61
    invoke-direct {p0}, Lo/fdz;->c()V

    goto :goto_0

    .line 64
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fdz;->b:Z

    .line 65
    invoke-direct {p0}, Lo/fdz;->c()V

    .line 67
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 35
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fdz;->b:Z

    .line 36
    invoke-direct {p0}, Lo/fdz;->c()V

    .line 37
    return-void
.end method

.method public c(ILandroid/widget/SeekBar;)V
    .locals 1

    .line 28
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fdz;->b:Z

    .line 29
    iput p1, p0, Lo/fdz;->a:I

    .line 30
    iput-object p2, p0, Lo/fdz;->e:Landroid/widget/SeekBar;

    .line 31
    invoke-direct {p0}, Lo/fdz;->b()V

    .line 32
    return-void
.end method
