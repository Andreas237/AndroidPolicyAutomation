.class Lo/eji$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eji$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eji;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic b:Lo/eji;


# direct methods
.method private constructor <init>(Lo/eji;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lo/eji$e;->b:Lo/eji;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/eji;Lo/eji$1;)V
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Lo/eji$e;-><init>(Lo/eji;)V

    return-void
.end method

.method private a(Landroid/view/MotionEvent;)Lo/eji$c;
    .locals 4

    .line 101
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 102
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 105
    iget-object v0, p0, Lo/eji$e;->b:Lo/eji;

    invoke-static {v0}, Lo/eji;->a(Lo/eji;)Lo/eie;

    move-result-object v0

    invoke-virtual {v0}, Lo/eie;->getLeft()I

    move-result v0

    int-to-float v0, v0

    cmpl-float v0, v2, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lo/eji$e;->b:Lo/eji;

    .line 106
    invoke-static {v0}, Lo/eji;->a(Lo/eji;)Lo/eie;

    move-result-object v0

    invoke-virtual {v0}, Lo/eie;->getRight()I

    move-result v0

    int-to-float v0, v0

    cmpg-float v0, v2, v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lo/eji$e;->b:Lo/eji;

    .line 107
    invoke-static {v0}, Lo/eji;->a(Lo/eji;)Lo/eie;

    move-result-object v0

    invoke-virtual {v0}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v0

    invoke-virtual {v0}, Lo/oa;->i()F

    move-result v0

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    sub-float/2addr v0, v1

    cmpl-float v0, v3, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lo/eji$e;->b:Lo/eji;

    .line 108
    invoke-static {v0}, Lo/eji;->a(Lo/eji;)Lo/eie;

    move-result-object v0

    invoke-virtual {v0}, Lo/eie;->getBottom()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x42340000    # 45.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    add-float/2addr v0, v1

    cmpg-float v0, v3, v0

    if-gtz v0, :cond_0

    .line 109
    sget-object v0, Lo/eji$c;->d:Lo/eji$c;

    return-object v0

    .line 112
    :cond_0
    iget-object v0, p0, Lo/eji$e;->b:Lo/eji;

    invoke-static {v0}, Lo/eji;->a(Lo/eji;)Lo/eie;

    move-result-object v0

    invoke-virtual {v0}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Lo/oa;->d(FF)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 113
    sget-object v0, Lo/eji$c;->b:Lo/eji$c;

    return-object v0

    .line 116
    :cond_1
    sget-object v0, Lo/eji$c;->e:Lo/eji$c;

    return-object v0
.end method

.method private d(Landroid/view/MotionEvent;)Lo/eji$b;
    .locals 2

    .line 89
    invoke-direct {p0, p1}, Lo/eji$e;->a(Landroid/view/MotionEvent;)Lo/eji$c;

    move-result-object v1

    .line 91
    sget-object v0, Lo/eji$c;->b:Lo/eji$c;

    if-ne v1, v0, :cond_0

    .line 92
    iget-object v0, p0, Lo/eji$e;->b:Lo/eji;

    invoke-static {v0}, Lo/eji;->e(Lo/eji;)Lo/eji$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/eji$b;->c(Landroid/view/MotionEvent;)Lo/eji$b;

    move-result-object v0

    return-object v0

    .line 93
    :cond_0
    sget-object v0, Lo/eji$c;->d:Lo/eji$c;

    if-ne v1, v0, :cond_1

    .line 94
    iget-object v0, p0, Lo/eji$e;->b:Lo/eji;

    invoke-static {v0}, Lo/eji;->b(Lo/eji;)Lo/eji$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/eji$b;->c(Landroid/view/MotionEvent;)Lo/eji$b;

    move-result-object v0

    return-object v0

    .line 97
    :cond_1
    iget-object v0, p0, Lo/eji$e;->b:Lo/eji;

    invoke-static {v0}, Lo/eji;->c(Lo/eji;)Lo/eji$b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public c(Landroid/view/MotionEvent;)Lo/eji$b;
    .locals 3

    .line 75
    const/4 v2, 0x0

    .line 76
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 78
    :sswitch_0
    invoke-direct {p0, p1}, Lo/eji$e;->d(Landroid/view/MotionEvent;)Lo/eji$b;

    move-result-object v2

    .line 79
    goto :goto_1

    .line 82
    :goto_0
    move-object v2, p0

    .line 85
    :goto_1
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
    .end sparse-switch
.end method
