.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$61;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;I)V
    .locals 0

    .line 5890
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$61;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iput p2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$61;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 5893
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showGPSSettingDialog():\u70b9\u51fb\u8bbe\u7f6e\u6309\u94ae"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5894
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 5895
    const-string v0, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 5897
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$61;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$61;->d:I

    invoke-virtual {v0, v4, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5908
    goto :goto_0

    .line 5898
    :catch_0
    move-exception v5

    .line 5902
    const-string v0, "android.settings.SETTINGS"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 5904
    :try_start_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$61;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$61;->d:I

    invoke-virtual {v0, v4, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 5907
    goto :goto_0

    .line 5905
    :catch_1
    move-exception v6

    .line 5906
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startActivity exception"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5909
    :goto_0
    return-void
.end method
