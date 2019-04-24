.class Lcom/huawei/health/SelectCountryListActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/SelectCountryListActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/SelectCountryListActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/SelectCountryListActivity;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/health/SelectCountryListActivity$2;->b:Lcom/huawei/health/SelectCountryListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 49
    const-string v0, "SelectCountryListActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setOnItemClickListener: strCountry="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/SelectCountryListActivity$2;->b:Lcom/huawei/health/SelectCountryListActivity;

    invoke-static {v3}, Lcom/huawei/health/SelectCountryListActivity;->e(Lcom/huawei/health/SelectCountryListActivity;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 51
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 52
    const-string v0, "service_area_country"

    iget-object v1, p0, Lcom/huawei/health/SelectCountryListActivity$2;->b:Lcom/huawei/health/SelectCountryListActivity;

    invoke-static {v1}, Lcom/huawei/health/SelectCountryListActivity;->e(Lcom/huawei/health/SelectCountryListActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 54
    iget-object v0, p0, Lcom/huawei/health/SelectCountryListActivity$2;->b:Lcom/huawei/health/SelectCountryListActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v4}, Lcom/huawei/health/SelectCountryListActivity;->setResult(ILandroid/content/Intent;)V

    .line 55
    iget-object v0, p0, Lcom/huawei/health/SelectCountryListActivity$2;->b:Lcom/huawei/health/SelectCountryListActivity;

    invoke-virtual {v0}, Lcom/huawei/health/SelectCountryListActivity;->finish()V

    .line 56
    return-void
.end method
