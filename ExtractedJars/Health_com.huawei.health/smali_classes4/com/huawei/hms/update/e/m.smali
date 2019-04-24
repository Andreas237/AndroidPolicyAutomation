.class public Lcom/huawei/hms/update/e/m;
.super Lcom/huawei/hms/update/e/b;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Lcom/huawei/hms/update/e/b;-><init>()V

    .line 17
    const-string v0, "hms_update_title"

    invoke-static {v0}, Lcom/huawei/hms/c/h;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/update/e/m;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected a()Landroid/app/AlertDialog;
    .locals 7

    .line 28
    const-string v0, "hms_update_message_new"

    invoke-static {v0}, Lcom/huawei/hms/c/h;->d(Ljava/lang/String;)I

    move-result v4

    .line 29
    const-string v0, "hms_install"

    invoke-static {v0}, Lcom/huawei/hms/c/h;->d(Ljava/lang/String;)I

    move-result v5

    .line 31
    new-instance v6, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/huawei/hms/update/e/m;->f()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hms/update/e/m;->g()I

    move-result v1

    invoke-direct {v6, v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 33
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/m;->f()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/hms/update/e/m;->a:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v4, v1}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 35
    new-instance v0, Lcom/huawei/hms/update/e/n;

    invoke-direct {v0, p0}, Lcom/huawei/hms/update/e/n;-><init>(Lcom/huawei/hms/update/e/m;)V

    invoke-virtual {v6, v5, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 43
    const-string v0, "hms_cancel"

    invoke-static {v0}, Lcom/huawei/hms/c/h;->d(Ljava/lang/String;)I

    move-result v0

    new-instance v1, Lcom/huawei/hms/update/e/o;

    invoke-direct {v1, p0}, Lcom/huawei/hms/update/e/o;-><init>(Lcom/huawei/hms/update/e/m;)V

    invoke-virtual {v6, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 50
    invoke-virtual {v6}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/hms/update/e/m;->a:Ljava/lang/String;

    .line 55
    return-void
.end method
