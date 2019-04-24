.class public Lcom/huawei/hwid/update/d/c;
.super Lcom/huawei/hwid/update/d/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/app/AlertDialog;
    .locals 4

    .line 23
    new-instance v3, Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/c;->f()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/c;->g()I

    move-result v1

    invoke-direct {v3, v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;I)V

    .line 25
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/c;->f()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/c;->f()Landroid/app/Activity;

    move-result-object v1

    const-string v2, "cs_checking"

    invoke-static {v1, v2}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 26
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 28
    return-object v3
.end method
