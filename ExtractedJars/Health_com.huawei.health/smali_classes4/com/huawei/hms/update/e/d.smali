.class public Lcom/huawei/hms/update/e/d;
.super Lcom/huawei/hms/update/e/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/huawei/hms/update/e/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/app/AlertDialog;
    .locals 3

    .line 22
    new-instance v2, Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Lcom/huawei/hms/update/e/d;->f()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hms/update/e/d;->g()I

    move-result v1

    invoke-direct {v2, v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;I)V

    .line 24
    const-string v0, "hms_checking"

    invoke-static {v0}, Lcom/huawei/hms/c/h;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 25
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 27
    return-object v2
.end method
