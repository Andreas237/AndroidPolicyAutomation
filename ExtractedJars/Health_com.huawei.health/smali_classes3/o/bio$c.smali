.class Lo/bio$c;
.super Landroid/app/ProgressDialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bio;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private d:Z

.field private e:Lo/bir;


# direct methods
.method public constructor <init>(Landroid/content/Context;ZLo/bir;)V
    .locals 0

    .line 81
    invoke-direct {p0, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 82
    iput-boolean p2, p0, Lo/bio$c;->d:Z

    .line 83
    iput-object p3, p0, Lo/bio$c;->e:Lo/bir;

    .line 84
    return-void
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 89
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_2

    .line 91
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 93
    iget-object v0, p0, Lo/bio$c;->e:Lo/bir;

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lo/bio$c;->e:Lo/bir;

    invoke-interface {v0}, Lo/bir;->e()V

    .line 97
    :cond_0
    iget-boolean v0, p0, Lo/bio$c;->d:Z

    if-nez v0, :cond_2

    .line 99
    const/4 v0, 0x1

    return v0

    .line 102
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    .line 104
    const/4 v0, 0x1

    return v0

    .line 107
    :cond_2
    invoke-super {p0, p1}, Landroid/app/ProgressDialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method
