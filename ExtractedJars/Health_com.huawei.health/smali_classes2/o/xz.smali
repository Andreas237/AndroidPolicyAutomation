.class public Lo/xz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/app/ProgressDialog;

.field private d:Landroid/content/Context;

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/xz;->e:Z

    .line 38
    iput-object p1, p0, Lo/xz;->d:Landroid/content/Context;

    .line 40
    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    .line 153
    iget-object v0, p0, Lo/xz;->a:Landroid/app/ProgressDialog;

    if-nez v0, :cond_0

    .line 154
    const/4 v0, 0x0

    return v0

    .line 156
    :cond_0
    iget-object v0, p0, Lo/xz;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    .line 49
    iget-object v0, p0, Lo/xz;->a:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Lo/xz;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lo/xz;->a:Landroid/app/ProgressDialog;

    .line 55
    :cond_0
    iget-object v0, p0, Lo/xz;->d:Landroid/content/Context;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/xz;->d:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 56
    return-void

    .line 58
    :cond_1
    new-instance v0, Landroid/app/ProgressDialog;

    iget-object v1, p0, Lo/xz;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/xz;->a:Landroid/app/ProgressDialog;

    .line 59
    iget-object v0, p0, Lo/xz;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 60
    iget-object v0, p0, Lo/xz;->a:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 61
    iget-object v0, p0, Lo/xz;->a:Landroid/app/ProgressDialog;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 62
    iget-object v0, p0, Lo/xz;->a:Landroid/app/ProgressDialog;

    iget-boolean v1, p0, Lo/xz;->e:Z

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 63
    iget-object v0, p0, Lo/xz;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 65
    return-void
.end method

.method public e()V
    .locals 1

    .line 140
    iget-object v0, p0, Lo/xz;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/xz;->d:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    return-void

    .line 144
    :cond_0
    iget-object v0, p0, Lo/xz;->a:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_2

    .line 145
    iget-object v0, p0, Lo/xz;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 146
    iget-object v0, p0, Lo/xz;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 148
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lo/xz;->a:Landroid/app/ProgressDialog;

    .line 150
    :cond_2
    return-void
.end method
