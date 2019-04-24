.class Lcom/huawei/health/MainActivity$17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/MainActivity;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/MainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 723
    iput-object p1, p0, Lcom/huawei/health/MainActivity$17;->d:Lcom/huawei/health/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 726
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 727
    iget-object v0, p0, Lcom/huawei/health/MainActivity$17;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_beta_user_agree"

    .line 728
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 727
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 730
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 731
    const-string v0, "1"

    iget-object v1, p0, Lcom/huawei/health/MainActivity$17;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->d(Lcom/huawei/health/MainActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 732
    new-instance v0, Lo/cbm$d;

    iget-object v1, p0, Lcom/huawei/health/MainActivity$17;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cbm$d;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/health/MainActivity$17;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbm$d;->d(Lo/ale;)Lo/cbm;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbm;->show()V

    goto :goto_0

    .line 734
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity$17;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->a(Lcom/huawei/health/MainActivity;)V

    goto :goto_0

    .line 737
    :cond_1
    const-string v0, "5"

    iget-object v1, p0, Lcom/huawei/health/MainActivity$17;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->c(Lcom/huawei/health/MainActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 738
    iget-object v0, p0, Lcom/huawei/health/MainActivity$17;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0}, Lo/ale;->a()V

    goto :goto_0

    .line 740
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/MainActivity$17;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->a(Lcom/huawei/health/MainActivity;)V

    .line 744
    :goto_0
    return-void
.end method
