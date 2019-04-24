.class Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity$2;->b:Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 11

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity$2;->b:Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->e(Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity$2;->b:Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->a(Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity$2;->b:Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->b(Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 49
    :try_start_0
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 50
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 51
    invoke-static {v5}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v8

    .line 53
    new-instance v10, Landroid/content/Intent;

    invoke-direct {v10}, Landroid/content/Intent;-><init>()V

    .line 54
    const-string v0, "sportLevel"

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    new-instance v2, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    invoke-direct {v2, v6, v7, v8, v9}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    invoke-virtual {v1, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 55
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity$2;->b:Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1, v10}, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->setResult(ILandroid/content/Intent;)V

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity$2;->b:Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->finish()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    goto :goto_0

    .line 57
    :catch_0
    move-exception v6

    .line 58
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity$2;->b:Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Input error\uff0cplease check!!!\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 62
    :goto_0
    return-void
.end method
