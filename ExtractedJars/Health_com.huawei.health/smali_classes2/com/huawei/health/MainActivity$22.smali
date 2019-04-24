.class Lcom/huawei/health/MainActivity$22;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhuawei/widget/HwBottomNavigationView$BottomNavListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/MainActivity;->E()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/MainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 1429
    iput-object p1, p0, Lcom/huawei/health/MainActivity$22;->e:Lcom/huawei/health/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBottomNavItemReselected(Landroid/view/MenuItem;I)V
    .locals 0

    .line 1433
    return-void
.end method

.method public onBottomNavItemSelected(Landroid/view/MenuItem;I)V
    .locals 2

    .line 1437
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 1440
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1442
    iget-object v0, p0, Lcom/huawei/health/MainActivity$22;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/ena;->c(Landroid/content/Context;I)V

    .line 1443
    iget-object v0, p0, Lcom/huawei/health/MainActivity$22;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->p(Lcom/huawei/health/MainActivity;)V

    goto :goto_0

    .line 1445
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity$22;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->u(Lcom/huawei/health/MainActivity;)V

    goto :goto_0

    .line 1448
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/MainActivity$22;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->s(Lcom/huawei/health/MainActivity;)Lo/abc;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1}, Lo/abc;->setCurrentItem(IZ)V

    .line 1450
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity$22;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0, p2}, Lcom/huawei/health/MainActivity;->c(Lcom/huawei/health/MainActivity;I)V

    .line 1451
    return-void
.end method

.method public onBottomNavItemUnselected(Landroid/view/MenuItem;I)V
    .locals 0

    .line 1456
    return-void
.end method
