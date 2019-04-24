.class public Lcom/huawei/hwid/update/d/g;
.super Lcom/huawei/hwid/update/d/b;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/b;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()Landroid/app/AlertDialog;
    .locals 8

    .line 29
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/g;->f()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "cs_update_message_new"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    .line 30
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/g;->f()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "CS_install"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v6

    .line 32
    new-instance v7, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/g;->f()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/g;->g()I

    move-result v1

    invoke-direct {v7, v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 36
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/g;->f()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/g;->f()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/g;->f()Landroid/app/Activity;

    move-result-object v3

    const-string v4, "cs_update_title"

    invoke-static {v3, v4}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v5, v1}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 38
    new-instance v0, Lcom/huawei/hwid/update/d/g$1;

    invoke-direct {v0, p0}, Lcom/huawei/hwid/update/d/g$1;-><init>(Lcom/huawei/hwid/update/d/g;)V

    invoke-virtual {v7, v6, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 45
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/g;->f()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "cs_cancel"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    new-instance v1, Lcom/huawei/hwid/update/d/g$2;

    invoke-direct {v1, p0}, Lcom/huawei/hwid/update/d/g$2;-><init>(Lcom/huawei/hwid/update/d/g;)V

    invoke-virtual {v7, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 52
    invoke-virtual {v7}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/huawei/hwid/update/d/g;->a:Ljava/lang/String;

    .line 57
    return-void
.end method
