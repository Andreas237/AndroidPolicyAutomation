.class public Lcom/huawei/hwid/api/common/c;
.super Landroid/app/AlertDialog$Builder;
.source "SourceFile"


# instance fields
.field private a:Landroid/app/AlertDialog;

.field private b:Landroid/app/Activity;

.field private c:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/net/Uri;)V
    .locals 5

    .line 32
    invoke-static {p1}, Lcom/huawei/hwid/core/d/l;->a(Landroid/content/Context;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 33
    iput-object p1, p0, Lcom/huawei/hwid/api/common/c;->b:Landroid/app/Activity;

    .line 34
    iput-object p2, p0, Lcom/huawei/hwid/api/common/c;->c:Landroid/net/Uri;

    .line 35
    const/4 v0, 0x3

    new-array v3, v0, [Ljava/lang/CharSequence;

    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/c;->b:Landroid/app/Activity;

    const-string v2, "CloudSetting_take_picture"

    invoke-static {v1, v2}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 36
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/c;->b:Landroid/app/Activity;

    const-string v2, "hwid_string_choose_from_gallery"

    invoke-static {v1, v2}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 37
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x1040000

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v3, v1

    .line 38
    new-instance v4, Landroid/widget/ArrayAdapter;

    iget-object v0, p0, Lcom/huawei/hwid/api/common/c;->b:Landroid/app/Activity;

    const v1, 0x1090003

    const v2, 0x1020014

    invoke-direct {v4, v0, v1, v2, v3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 40
    new-instance v0, Lcom/huawei/hwid/api/common/c$1;

    invoke-direct {v0, p0}, Lcom/huawei/hwid/api/common/c$1;-><init>(Lcom/huawei/hwid/api/common/c;)V

    invoke-virtual {p0, v4, v0}, Lcom/huawei/hwid/api/common/c;->setAdapter(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 57
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/c;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/c;->b()V

    return-void
.end method

.method private b()V
    .locals 5

    .line 68
    const/4 v2, 0x0

    .line 69
    iget-object v0, p0, Lcom/huawei/hwid/api/common/c;->c:Landroid/net/Uri;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/api/common/c;->b:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/c;->c:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwid/d/e;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    if-nez v2, :cond_1

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/c;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V

    .line 71
    return-void

    .line 74
    :cond_1
    const-string v0, "AddPicDialog"

    const-string v1, "start Camare"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 76
    const-string v0, "output"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 78
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/c;->b:Landroid/app/Activity;

    const/16 v1, 0x3eb

    invoke-virtual {v0, v3, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    goto :goto_0

    .line 79
    :catch_0
    move-exception v4

    .line 80
    iget-object v0, p0, Lcom/huawei/hwid/api/common/c;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V

    .line 81
    const-string v0, "AddPicDialog"

    const-string v1, "start Camare :"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/hwid/api/common/c;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/c;->c()V

    return-void
.end method

.method private c()V
    .locals 4

    .line 89
    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.intent.action.PICK"

    const/4 v1, 0x0

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 90
    sget-object v0, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v1, "image/*"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 92
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/c;->b:Landroid/app/Activity;

    const/16 v1, 0x3ec

    invoke-virtual {v0, v2, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    goto :goto_0

    .line 93
    :catch_0
    move-exception v3

    .line 94
    iget-object v0, p0, Lcom/huawei/hwid/api/common/c;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V

    .line 95
    const-string v0, "AddPicDialog"

    const-string v1, "start Gallery :"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/hwid/api/common/c;->a:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/api/common/c;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/huawei/hwid/api/common/c;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V

    .line 106
    :cond_0
    return-void
.end method

.method public show()Landroid/app/AlertDialog;
    .locals 1

    .line 60
    invoke-super {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/c;->a:Landroid/app/AlertDialog;

    .line 61
    iget-object v0, p0, Lcom/huawei/hwid/api/common/c;->a:Landroid/app/AlertDialog;

    return-object v0
.end method
