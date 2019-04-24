.class abstract Lo/ejd$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejb;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ejd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "d"
.end annotation


# instance fields
.field protected a:J

.field protected b:Lo/nz;

.field final synthetic c:Lo/ejd;

.field private d:Z


# direct methods
.method private constructor <init>(Lo/ejd;)V
    .locals 2

    .line 100
    iput-object p1, p0, Lo/ejd$d;->c:Lo/ejd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/nz;->d(FF)Lo/nz;

    move-result-object v0

    iput-object v0, p0, Lo/ejd$d;->b:Lo/nz;

    .line 105
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ejd$d;->d:Z

    return-void
.end method

.method synthetic constructor <init>(Lo/ejd;Lo/ejd$4;)V
    .locals 0

    .line 100
    invoke-direct {p0, p1}, Lo/ejd$d;-><init>(Lo/ejd;)V

    return-void
.end method

.method private b(Landroid/view/MotionEvent;)V
    .locals 2

    .line 142
    iget-object v0, p0, Lo/ejd$d;->b:Lo/nz;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, Lo/nz;->e:F

    .line 143
    iget-object v0, p0, Lo/ejd$d;->b:Lo/nz;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iput v1, v0, Lo/nz;->c:F

    .line 144
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lo/ejd$d;->a:J

    .line 145
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 109
    iget-boolean v0, p0, Lo/ejd$d;->d:Z

    return v0
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 118
    invoke-direct {p0, p1}, Lo/ejd$d;->b(Landroid/view/MotionEvent;)V

    .line 119
    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 1

    .line 134
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ejd$d;->d:Z

    .line 135
    return-void
.end method

.method protected c()V
    .locals 1

    .line 113
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ejd$d;->d:Z

    .line 114
    return-void
.end method

.method public d(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 129
    const/4 v0, 0x0

    return v0
.end method

.method public e(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 124
    const/4 v0, 0x0

    return v0
.end method
