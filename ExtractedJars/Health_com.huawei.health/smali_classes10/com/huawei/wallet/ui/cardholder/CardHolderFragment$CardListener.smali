.class Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnItemClickListener;
.implements Lcom/huawei/wallet/ui/carddisplay/CardLayout$OnDragPosChanageListener;
.implements Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "CardListener"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;


# direct methods
.method private constructor <init>(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)V
    .locals 0

    .line 642
    iput-object p1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$1;)V
    .locals 0

    .line 642
    invoke-direct {p0, p1}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;-><init>(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 0

    .line 690
    return-void
.end method

.method public a(IZ)V
    .locals 0

    .line 715
    return-void
.end method

.method public b(Z)V
    .locals 2

    .line 701
    if-nez p1, :cond_0

    .line 703
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->h(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;->b(Z)V

    .line 705
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->g(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    .line 707
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->h(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/cardholder/ScrollViewTouchListener;->b(Z)V

    .line 708
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->g(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Landroid/view/View;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 710
    :goto_0
    return-void
.end method

.method public c(IZ)V
    .locals 0

    .line 720
    return-void
.end method

.method public c(Landroid/view/View;I)V
    .locals 1

    .line 724
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->a(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 725
    return-void

    .line 727
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0, p1, p2}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->d(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;Landroid/view/View;I)V

    .line 728
    return-void
.end method

.method public d(II)V
    .locals 6

    .line 647
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardHolderFragment CardListener onDragStop= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", newPosition= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 650
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->a(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->g()I

    move-result v3

    .line 651
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardHolderFragment CardListener topCardSize= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", newPosition= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 653
    if-ge p1, v3, :cond_0

    .line 655
    if-ge p2, v3, :cond_1

    .line 656
    const-string v0, "CardHolderFragment CardListener onDragStop do swap top card data"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 658
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->c(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    .line 659
    invoke-static {v1}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->d(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-virtual {v2}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    .line 658
    invoke-interface {v0, p1, p2, v1, v2}, Lcom/huawei/nfc/carrera/logic/NFCOpenApi;->isCanDragStop(IILjava/util/List;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 661
    const-string v0, "CardHolderFragment 123"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 663
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->c(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v1}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->d(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, p1, p2, v1}, Lcom/huawei/nfc/carrera/logic/NFCOpenApi;->onDragStop(IILjava/util/List;)V

    .line 664
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->a(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->d(II)V

    .line 667
    const-string v0, "CardHolderFragment 456"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    goto :goto_0

    .line 671
    :cond_0
    if-lt p2, v3, :cond_1

    .line 673
    sub-int v4, p1, v3

    .line 674
    sub-int v5, p2, v3

    .line 675
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardHolderFragment CardListener onDragStop do swap bottom card data tmpOldPosition= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tmpNewPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 679
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->a(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->d(II)V

    .line 684
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardListener;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->a(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/huawei/wallet/ui/carddisplay/CardHolderDisplayManager;->e(II)V

    .line 685
    return-void
.end method

.method public e(IFZ)V
    .locals 0

    .line 696
    return-void
.end method
