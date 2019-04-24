.class Lcom/huawei/ui/homehealth/HomeFragment$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/HomeFragment;->c(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic e:Lcom/huawei/ui/homehealth/HomeFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment;I)V
    .locals 0

    .line 1474
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$10;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    iput p2, p0, Lcom/huawei/ui/homehealth/HomeFragment$10;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 1477
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showGPSSettingDialog():\u70b9\u51fb\u8bbe\u7f6e\u6309\u94ae"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1478
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1479
    const-string v0, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1481
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$10;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    iget v1, p0, Lcom/huawei/ui/homehealth/HomeFragment$10;->a:I

    invoke-virtual {v0, v4, v1}, Lcom/huawei/ui/homehealth/HomeFragment;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1492
    goto :goto_0

    .line 1482
    :catch_0
    move-exception v5

    .line 1486
    const-string v0, "android.settings.SETTINGS"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1488
    :try_start_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$10;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    iget v1, p0, Lcom/huawei/ui/homehealth/HomeFragment$10;->a:I

    invoke-virtual {v0, v4, v1}, Lcom/huawei/ui/homehealth/HomeFragment;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 1491
    goto :goto_0

    .line 1489
    :catch_1
    move-exception v6

    .line 1490
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startActivity exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1493
    :goto_0
    return-void
.end method
