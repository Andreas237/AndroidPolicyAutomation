.class Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->e(Landroid/view/View;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

.field final synthetic c:I

.field final synthetic d:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;Landroid/view/View;I)V
    .locals 0

    .line 752
    iput-object p1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$2;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    iput-object p2, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$2;->d:Landroid/view/View;

    iput p3, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$2;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 755
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$2;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->i(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/carddisplay/HwScrollView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$2;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v1}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->f(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->scrollTo(II)V

    .line 756
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$2;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$2;->d:Landroid/view/View;

    iget v2, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$2;->c:I

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->c(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;Landroid/view/View;I)V

    .line 757
    return-void
.end method
