.class public Lo/ejd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ejd$b;,
        Lo/ejd$a;,
        Lo/ejd$d;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ejb;>;"
        }
    .end annotation
.end field

.field private b:Lo/ejb;

.field private d:Z

.field private e:Lo/eie;


# direct methods
.method public constructor <init>(Lo/eie;)V
    .locals 3

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ejd;->a:Ljava/util/List;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ejd;->b:Lo/ejb;

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ejd;->e:Lo/eie;

    .line 35
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ejd;->d:Z

    .line 38
    iput-object p1, p0, Lo/ejd;->e:Lo/eie;

    .line 39
    iget-object v0, p0, Lo/ejd;->a:Ljava/util/List;

    new-instance v1, Lo/ejd$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/ejd$a;-><init>(Lo/ejd;Lo/ejd$4;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    iget-object v0, p0, Lo/ejd;->a:Ljava/util/List;

    new-instance v1, Lo/ejd$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/ejd$b;-><init>(Lo/ejd;Lo/ejd$4;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    return-void
.end method

.method static synthetic a(Lo/ejd;)Lo/eie;
    .locals 1

    .line 20
    iget-object v0, p0, Lo/ejd;->e:Lo/eie;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 83
    iget-boolean v0, p0, Lo/ejd;->d:Z

    if-eqz v0, :cond_0

    .line 84
    const/4 v0, 0x0

    return v0

    .line 87
    :cond_0
    iget-object v0, p0, Lo/ejd;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ejb;

    .line 88
    invoke-interface {v2, p1}, Lo/ejb;->d(Landroid/view/MotionEvent;)Z

    .line 89
    invoke-interface {v2}, Lo/ejb;->b()V

    .line 90
    goto :goto_0

    .line 91
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ejd;->b:Lo/ejb;

    .line 92
    const/4 v0, 0x0

    return v0
.end method

.method public d()V
    .locals 1

    .line 96
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ejd;->d:Z

    .line 97
    return-void
.end method

.method public d(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 55
    iget-boolean v0, p0, Lo/ejd;->d:Z

    if-eqz v0, :cond_0

    .line 56
    const/4 v0, 0x0

    return v0

    .line 59
    :cond_0
    iget-object v0, p0, Lo/ejd;->b:Lo/ejb;

    if-eqz v0, :cond_2

    .line 60
    iget-object v0, p0, Lo/ejd;->b:Lo/ejb;

    invoke-interface {v0, p1}, Lo/ejb;->e(Landroid/view/MotionEvent;)Z

    .line 61
    iget-object v0, p0, Lo/ejd;->b:Lo/ejb;

    invoke-interface {v0}, Lo/ejb;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/ejd;->b:Lo/ejb;

    invoke-interface {v0, p1}, Lo/ejb;->c(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 62
    const/4 v0, 0x1

    return v0

    .line 64
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 67
    :cond_2
    iget-object v0, p0, Lo/ejd;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ejb;

    .line 68
    invoke-interface {v2, p1}, Lo/ejb;->e(Landroid/view/MotionEvent;)Z

    .line 69
    invoke-interface {v2}, Lo/ejb;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 70
    iput-object v2, p0, Lo/ejd;->b:Lo/ejb;

    .line 71
    goto :goto_1

    .line 73
    :cond_3
    goto :goto_0

    .line 75
    :cond_4
    :goto_1
    iget-object v0, p0, Lo/ejd;->b:Lo/ejb;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lo/ejd;->b:Lo/ejb;

    invoke-interface {v0}, Lo/ejb;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lo/ejd;->b:Lo/ejb;

    invoke-interface {v0, p1}, Lo/ejb;->c(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 76
    const/4 v0, 0x1

    return v0

    .line 78
    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public e(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 44
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ejd;->d:Z

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ejd;->b:Lo/ejb;

    .line 46
    iget-object v0, p0, Lo/ejd;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ejb;

    .line 47
    invoke-interface {v2}, Lo/ejb;->b()V

    .line 48
    invoke-interface {v2, p1}, Lo/ejb;->a(Landroid/view/MotionEvent;)Z

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
