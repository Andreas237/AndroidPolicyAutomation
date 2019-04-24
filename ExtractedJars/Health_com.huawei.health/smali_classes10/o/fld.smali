.class public Lo/fld;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Lo/fkz;

.field private e:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/fkz$c;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-direct {p0}, Lo/fld;->a()V

    .line 19
    iget-object v0, p0, Lo/fld;->e:Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 20
    new-instance v0, Lo/fkz;

    invoke-direct {v0, p1}, Lo/fkz;-><init>(Lo/fkz$c;)V

    iput-object v0, p0, Lo/fld;->c:Lo/fkz;

    .line 22
    :cond_0
    return-void
.end method

.method private a()V
    .locals 3

    .line 26
    const-string v0, "o.fkz"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lo/fld;->e:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    goto :goto_0

    .line 27
    :catch_0
    move-exception v2

    .line 28
    const-string v0, "RollbackRuleDetectorProxy"

    const-string v1, "RollbackRuleDetector class not found"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    :goto_0
    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 51
    iget-object v0, p0, Lo/fld;->e:Ljava/lang/Class;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/fld;->c:Lo/fkz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 52
    iget-object v0, p0, Lo/fld;->c:Lo/fkz;

    invoke-virtual {v0}, Lo/fkz;->c()V

    .line 54
    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    .line 33
    iget-object v0, p0, Lo/fld;->e:Ljava/lang/Class;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/fld;->c:Lo/fkz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 34
    iget-object v0, p0, Lo/fld;->c:Lo/fkz;

    invoke-virtual {v0}, Lo/fkz;->d()V

    .line 36
    :cond_0
    return-void
.end method

.method public d(Landroid/view/MotionEvent;)V
    .locals 2

    .line 45
    iget-object v0, p0, Lo/fld;->e:Ljava/lang/Class;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/fld;->c:Lo/fkz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 46
    iget-object v0, p0, Lo/fld;->c:Lo/fkz;

    invoke-virtual {v0, p1}, Lo/fkz;->c(Landroid/view/MotionEvent;)V

    .line 48
    :cond_0
    return-void
.end method

.method public e(Landroid/view/View;)V
    .locals 2

    .line 39
    iget-object v0, p0, Lo/fld;->e:Ljava/lang/Class;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/fld;->c:Lo/fkz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 40
    iget-object v0, p0, Lo/fld;->c:Lo/fkz;

    invoke-virtual {v0, p1}, Lo/fkz;->c(Landroid/view/View;)V

    .line 42
    :cond_0
    return-void
.end method
