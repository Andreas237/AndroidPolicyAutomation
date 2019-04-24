.class abstract Lcom/huawei/hms/update/e/p$a;
.super Lcom/huawei/hms/update/e/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/update/e/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Lcom/huawei/hms/update/e/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hms/update/e/q;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lcom/huawei/hms/update/e/p$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/app/AlertDialog;
    .locals 3

    .line 63
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/huawei/hms/update/e/p$a;->f()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hms/update/e/p$a;->g()I

    move-result v1

    invoke-direct {v2, v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 65
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/p$a;->h()I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 67
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/p$a;->i()I

    move-result v0

    new-instance v1, Lcom/huawei/hms/update/e/r;

    invoke-direct {v1, p0}, Lcom/huawei/hms/update/e/r;-><init>(Lcom/huawei/hms/update/e/p$a;)V

    invoke-virtual {v2, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 74
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method

.method protected abstract h()I
.end method

.method protected i()I
    .locals 1

    .line 80
    const-string v0, "hms_confirm"

    invoke-static {v0}, Lcom/huawei/hms/c/h;->d(Ljava/lang/String;)I

    move-result v0

    return v0
.end method
