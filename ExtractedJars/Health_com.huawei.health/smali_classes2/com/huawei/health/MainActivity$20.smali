.class Lcom/huawei/health/MainActivity$20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/MainActivity;->an()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/egy;

.field final synthetic c:Lcom/huawei/health/MainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity;Lo/egy;)V
    .locals 0

    .line 3615
    iput-object p1, p0, Lcom/huawei/health/MainActivity$20;->c:Lcom/huawei/health/MainActivity;

    iput-object p2, p0, Lcom/huawei/health/MainActivity$20;->a:Lo/egy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 3618
    iget-object v0, p0, Lcom/huawei/health/MainActivity$20;->c:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ena;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3619
    iget-object v0, p0, Lcom/huawei/health/MainActivity$20;->c:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/ena;->c(Landroid/content/Context;I)V

    .line 3620
    iget-object v0, p0, Lcom/huawei/health/MainActivity$20;->c:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->M(Lcom/huawei/health/MainActivity;)V

    .line 3621
    iget-object v0, p0, Lcom/huawei/health/MainActivity$20;->c:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->N(Lcom/huawei/health/MainActivity;)Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3622
    iget-object v0, p0, Lcom/huawei/health/MainActivity$20;->c:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->N(Lcom/huawei/health/MainActivity;)Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c()V

    goto :goto_0

    .line 3625
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity$20;->a:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 3627
    :cond_1
    :goto_0
    return-void
.end method
