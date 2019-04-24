.class public Lo/ezk;
.super Lo/ezj;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ezk$c;,
        Lo/ezk$b;
    }
.end annotation


# instance fields
.field private a:Lo/ekh;

.field private b:Lo/eyv;

.field private c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private d:Lo/eih$e;

.field private e:Lo/ezk$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;Lo/eih$e;)V
    .locals 2

    .line 49
    invoke-direct {p0, p1, p2, p3, p4}, Lo/ezj;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/ezk;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezk;->a:Lo/ekh;

    .line 50
    iput-object p5, p0, Lo/ezk;->d:Lo/eih$e;

    .line 51
    return-void
.end method

.method static synthetic b(Lo/ezk;)Lo/eih$e;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/ezk;->d:Lo/eih$e;

    return-object v0
.end method

.method static synthetic c(Lo/ezk;)Lo/ezk$b;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/ezk;->e:Lo/ezk$b;

    return-object v0
.end method

.method static synthetic d(Lo/ezk;)Lo/ekh;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/ezk;->a:Lo/ekh;

    return-object v0
.end method

.method static synthetic e(Lo/ezk;)Lo/eyv;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/ezk;->b:Lo/eyv;

    return-object v0
.end method


# virtual methods
.method public a(Lo/eih;II)V
    .locals 1

    .line 65
    iget-object v0, p0, Lo/ezk;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 66
    invoke-virtual {p0, p1, p2, p3}, Lo/ezk;->e(Lo/eih;II)V

    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lo/ezk;->d(Lo/eih;II)V

    .line 70
    :goto_0
    return-void
.end method

.method protected b(F)V
    .locals 1

    .line 157
    iget-object v0, p0, Lo/ezk;->f:Lo/ezh;

    invoke-virtual {v0, p1}, Lo/ezh;->d(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/ezk;->setContentText(Ljava/lang/String;)V

    .line 158
    return-void
.end method

.method public b(Lo/ezk$b;)V
    .locals 2

    .line 162
    iget-object v0, p0, Lo/ezk;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 163
    iput-object p1, p0, Lo/ezk;->e:Lo/ezk$b;

    .line 164
    return-void
.end method

.method public d(Lo/eih;II)V
    .locals 3

    .line 79
    new-instance v2, Lo/ezk$5;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v2, p0, v0}, Lo/ezk$5;-><init>(Lo/ezk;Landroid/os/Handler;)V

    .line 89
    iput-object v2, p0, Lo/ezk;->a:Lo/ekh;

    .line 91
    new-instance v0, Lo/ezk$2;

    invoke-direct {v0, p0, p1, v2}, Lo/ezk$2;-><init>(Lo/ezk;Lo/eih;Lo/ekh;)V

    invoke-virtual {v2, v0}, Lo/ekh;->b(Lo/ekh$e;)V

    .line 121
    new-instance v0, Lo/ezk$4;

    invoke-direct {v0, p0, v2}, Lo/ezk$4;-><init>(Lo/ezk;Lo/ekh;)V

    invoke-virtual {v2, v0}, Lo/ekh;->b(Lo/ekh$e;)V

    .line 141
    invoke-virtual {v2}, Lo/ekh;->d()V

    .line 143
    return-void
.end method

.method public e(Lo/eih;II)V
    .locals 3

    .line 147
    iget-object v0, p0, Lo/ezk;->d:Lo/eih$e;

    invoke-virtual {p1, v0}, Lo/eih;->a(Lo/eih$e;)F

    move-result v2

    .line 148
    iget-object v0, p0, Lo/ezk;->b:Lo/eyv;

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lo/ezk;->b:Lo/eyv;

    iget-object v1, p0, Lo/ezk;->f:Lo/ezh;

    invoke-virtual {v1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/eyv;->a(Lo/eih;Lo/eic;)F

    move-result v2

    .line 150
    invoke-virtual {p0, v2}, Lo/ezk;->b(F)V

    .line 151
    return-void

    .line 153
    :cond_0
    invoke-virtual {p0, v2}, Lo/ezk;->b(F)V

    .line 154
    return-void
.end method

.method public setCustomCalculator(Lo/eyv;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lo/ezk;->b:Lo/eyv;

    .line 61
    return-void
.end method
