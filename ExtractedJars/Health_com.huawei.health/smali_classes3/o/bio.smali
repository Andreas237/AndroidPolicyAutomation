.class public Lo/bio;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bio$c;
    }
.end annotation


# instance fields
.field private b:Landroid/app/ProgressDialog;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lo/bir;)V
    .locals 6

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lo/bio;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLo/bir;)V

    .line 47
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/bio;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLo/bir;)V

    .line 34
    return-void
.end method

.method private e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLo/bir;)V
    .locals 1

    .line 61
    new-instance v0, Lo/bio$c;

    invoke-direct {v0, p1, p4, p5}, Lo/bio$c;-><init>(Landroid/content/Context;ZLo/bir;)V

    iput-object v0, p0, Lo/bio;->b:Landroid/app/ProgressDialog;

    .line 62
    if-eqz p2, :cond_0

    .line 64
    iget-object v0, p0, Lo/bio;->b:Landroid/app/ProgressDialog;

    invoke-virtual {v0, p2}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 66
    :cond_0
    iget-object v0, p0, Lo/bio;->b:Landroid/app/ProgressDialog;

    invoke-virtual {v0, p3}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 67
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 143
    iget-object v0, p0, Lo/bio;->b:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bio;->b:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 145
    iget-object v0, p0, Lo/bio;->b:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 146
    iget-object v0, p0, Lo/bio;->b:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 148
    :cond_0
    return-void
.end method

.method public c()V
    .locals 1

    .line 170
    iget-object v0, p0, Lo/bio;->b:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bio;->b:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Lo/bio;->b:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 174
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 119
    iget-object v0, p0, Lo/bio;->b:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    .line 121
    iget-object v0, p0, Lo/bio;->b:Landroid/app/ProgressDialog;

    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 123
    :cond_0
    return-void
.end method

.method public d()Z
    .locals 2

    .line 157
    const/4 v1, 0x0

    .line 158
    iget-object v0, p0, Lo/bio;->b:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bio;->b:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    const/4 v1, 0x1

    .line 162
    :cond_0
    return v1
.end method
