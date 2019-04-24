.class Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$2;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->initWebViewClient()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;)V
    .locals 0

    .line 443
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3

    .line 456
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->access$000(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 458
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->access$200(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;)Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->setVisibility(I)V

    .line 459
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->access$500(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;II)V

    .line 461
    :cond_0
    const-string v0, "BankDetailFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onPageFinished.  mErrorCode : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;

    invoke-static {v2}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->access$000(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 462
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 463
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 3

    .line 447
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->access$002(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;I)I

    .line 448
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;

    const/4 v1, 0x0

    const/16 v2, 0x8

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->access$500(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;II)V

    .line 449
    const-string v0, "BankDetailFragment"

    const-string v1, "onPageStarted."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 451
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 468
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 469
    const-string v0, "BankDetailFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onReceivedError.errorCode=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  description=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  failingUrl=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "networkFailLayout"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;

    .line 470
    invoke-static {v2}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->access$300(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 469
    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 472
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;

    invoke-static {v0, p2}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->access$002(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;I)I

    .line 473
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;

    const/16 v1, 0x8

    const/16 v2, 0x8

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->access$500(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;II)V

    .line 474
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->access$200(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;)Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailViewPager;->setVisibility(I)V

    .line 475
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;

    invoke-static {v0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 477
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->access$400(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 481
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;->access$300(Lcom/huawei/nfc/carrera/ui/carddetail/CardDetailActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 483
    :goto_0
    return-void
.end method
