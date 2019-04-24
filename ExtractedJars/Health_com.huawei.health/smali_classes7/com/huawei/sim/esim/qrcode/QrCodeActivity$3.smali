.class Lcom/huawei/sim/esim/qrcode/QrCodeActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$3;->b:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 136
    invoke-static {}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click btnAlbum"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 141
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$3;->b:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->d(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 142
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_2

    .line 143
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$3;->b:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->d(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$3;->b:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    .line 144
    invoke-static {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->d(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    .line 145
    :goto_0
    if-nez v5, :cond_2

    .line 146
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$3;->b:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->d(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$3;->b:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-static {v1}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->d(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$string;->IDS_hw_feedback_permission_guide_torage:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ene;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 147
    return-void

    .line 152
    :cond_2
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$3;->b:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->d(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_3

    .line 154
    invoke-static {}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have not permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$3;->b:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->d(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$3;->b:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$3;->b:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    .line 158
    invoke-static {v2}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->e(Lcom/huawei/sim/esim/qrcode/QrCodeActivity;)I

    move-result v2

    .line 157
    invoke-static {v0, v1, v2}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_1

    .line 160
    :cond_3
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.intent.action.PICK"

    const/4 v1, 0x0

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 162
    sget-object v0, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v1, "image/*"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 163
    iget-object v0, p0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity$3;->b:Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    const/16 v1, 0xa

    invoke-virtual {v0, v5, v1}, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 165
    :goto_1
    return-void
.end method
