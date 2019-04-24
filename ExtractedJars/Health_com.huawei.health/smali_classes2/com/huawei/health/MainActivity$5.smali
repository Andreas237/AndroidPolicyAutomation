.class Lcom/huawei/health/MainActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/MainActivity;->H()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/MainActivity;

.field final synthetic d:Lo/dnm;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity;Lo/dnm;)V
    .locals 0

    .line 1661
    iput-object p1, p0, Lcom/huawei/health/MainActivity$5;->a:Lcom/huawei/health/MainActivity;

    iput-object p2, p0, Lcom/huawei/health/MainActivity$5;->d:Lo/dnm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1664
    iget-object v0, p0, Lcom/huawei/health/MainActivity$5;->a:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_product_recommend"

    const-string v3, "1"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1666
    iget-object v0, p0, Lcom/huawei/health/MainActivity$5;->d:Lo/dnm;

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xa

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Lo/dnm;->e(IZLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1667
    return-void
.end method
