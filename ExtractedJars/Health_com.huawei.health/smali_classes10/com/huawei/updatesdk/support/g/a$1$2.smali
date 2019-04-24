.class Lcom/huawei/updatesdk/support/g/a$1$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/updatesdk/support/g/a$1;->onShow(Landroid/content/DialogInterface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/updatesdk/support/g/a$1;


# direct methods
.method constructor <init>(Lcom/huawei/updatesdk/support/g/a$1;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/support/g/a$1$2;->a:Lcom/huawei/updatesdk/support/g/a$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a$1$2;->a:Lcom/huawei/updatesdk/support/g/a$1;

    iget-object v0, v0, Lcom/huawei/updatesdk/support/g/a$1;->a:Lcom/huawei/updatesdk/support/g/a;

    invoke-static {v0}, Lcom/huawei/updatesdk/support/g/a;->a(Lcom/huawei/updatesdk/support/g/a;)Lcom/huawei/updatesdk/support/g/b;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/support/g/a$1$2;->a:Lcom/huawei/updatesdk/support/g/a$1;

    iget-object v0, v0, Lcom/huawei/updatesdk/support/g/a$1;->a:Lcom/huawei/updatesdk/support/g/a;

    invoke-static {v0}, Lcom/huawei/updatesdk/support/g/a;->a(Lcom/huawei/updatesdk/support/g/a;)Lcom/huawei/updatesdk/support/g/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/updatesdk/support/g/b;->b()V

    :cond_0
    return-void
.end method
