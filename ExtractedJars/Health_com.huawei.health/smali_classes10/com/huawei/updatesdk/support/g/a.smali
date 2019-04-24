.class public Lcom/huawei/updatesdk/support/g/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/updatesdk/support/g/a$a;
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/updatesdk/support/g/b;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/CharSequence;

.field private e:Landroid/app/AlertDialog;

.field private f:Landroid/app/AlertDialog$Builder;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/CharSequence;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/updatesdk/support/g/a;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/updatesdk/support/g/a;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/updatesdk/support/g/a;->d:Ljava/lang/CharSequence;

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->f:Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->f:Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/huawei/updatesdk/support/g/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->f:Landroid/app/AlertDialog$Builder;

    const-string v1, "third_app_dl_sure_cancel_download"

    invoke-static {p1, v1}, Lcom/huawei/updatesdk/support/f/d;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->f:Landroid/app/AlertDialog$Builder;

    const-string v1, "upsdk_cancel"

    invoke-static {p1, v1}, Lcom/huawei/updatesdk/support/f/d;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->f:Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/huawei/updatesdk/support/g/a;->d:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/CharSequence;)Lcom/huawei/updatesdk/support/g/a;
    .locals 2

    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/huawei/updatesdk/support/g/c;

    invoke-direct {v0, p0, p1, p2}, Lcom/huawei/updatesdk/support/g/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-object v0

    :cond_0
    new-instance v1, Lcom/huawei/updatesdk/support/g/a;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/updatesdk/support/g/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-object v1
.end method

.method static synthetic a(Lcom/huawei/updatesdk/support/g/a;)Lcom/huawei/updatesdk/support/g/b;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->a:Lcom/huawei/updatesdk/support/g/b;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->f:Landroid/app/AlertDialog$Builder;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->f:Landroid/app/AlertDialog$Builder;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    return-void
.end method

.method public a(II)V
    .locals 3

    invoke-static {}, Lcom/huawei/updatesdk/support/f/c;->a()Lcom/huawei/updatesdk/support/f/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/support/f/c;->b()I

    move-result v0

    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v2

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2, p1}, Landroid/widget/Button;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/Button;->setTextColor(I)V

    :cond_1
    return-void
.end method

.method public a(Landroid/content/DialogInterface$OnKeyListener;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    :cond_0
    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->f:Landroid/app/AlertDialog$Builder;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "divider"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/support/f/d;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    if-eqz v2, :cond_0

    invoke-static {}, Lcom/huawei/updatesdk/support/f/c;->a()Lcom/huawei/updatesdk/support/f/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/support/f/c;->b()I

    move-result v0

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->f:Landroid/app/AlertDialog$Builder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->f:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    :cond_1
    return-void
.end method

.method public a(Lcom/huawei/updatesdk/support/g/a$a;Ljava/lang/String;)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/huawei/updatesdk/support/g/a$a;->a:Lcom/huawei/updatesdk/support/g/a$a;

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v2

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/huawei/updatesdk/support/g/a$a;->b:Lcom/huawei/updatesdk/support/g/a$a;

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v2

    :cond_2
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v2, :cond_3

    return-void

    :cond_3
    invoke-virtual {v2, p2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/widget/Button;->setAllCaps(Z)V

    return-void
.end method

.method public a(Lcom/huawei/updatesdk/support/g/b;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/support/g/a;->a:Lcom/huawei/updatesdk/support/g/b;

    return-void
.end method

.method public a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog;->setCancelable(Z)V

    :cond_0
    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/support/g/a;->b()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->f:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    new-instance v1, Lcom/huawei/updatesdk/support/g/a$1;

    invoke-direct {v1, p0}, Lcom/huawei/updatesdk/support/g/a$1;-><init>(Lcom/huawei/updatesdk/support/g/a;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v0, "BaseAlertDialog"

    const-string v1, "show dlg error, e: "

    invoke-static {v0, v1, v3}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    const-string v0, "BaseAlertDialog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "show dlg error, mContext = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/support/g/a;->b:Landroid/content/Context;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", isShowing() = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    invoke-virtual {v2}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", mContext.isFinishing is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/support/g/a;->b:Landroid/content/Context;

    if-nez v2, :cond_1

    const-string v2, "mContext == null"

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/huawei/updatesdk/support/g/a;->b:Landroid/content/Context;

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public d()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/updatesdk/support/g/a;->e:Landroid/app/AlertDialog;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "BaseAlertDialog"

    const-string v1, "dialog dismiss IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
