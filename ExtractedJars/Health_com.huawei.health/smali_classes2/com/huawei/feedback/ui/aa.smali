.class Lcom/huawei/feedback/ui/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackEditActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 564
    iput-object p1, p0, Lcom/huawei/feedback/ui/aa;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 568
    iget-object v0, p0, Lcom/huawei/feedback/ui/aa;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->i(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 571
    iget-object v0, p0, Lcom/huawei/feedback/ui/aa;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 572
    invoke-static {v0}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 573
    iget-object v0, p0, Lcom/huawei/feedback/ui/aa;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/16 v2, 0x1000

    invoke-static {v0, v1, v2}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 577
    return-void

    .line 581
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/aa;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->j(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v3, v0, -0x1

    .line 583
    if-ne p3, v3, :cond_1

    const/4 v0, 0x6

    if-ge v3, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/aa;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->j(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 584
    iget-object v0, p0, Lcom/huawei/feedback/ui/aa;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Z)Z

    .line 585
    iget-object v0, p0, Lcom/huawei/feedback/ui/aa;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/16 v1, 0xbcd

    invoke-static {v0, v1}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;I)V

    .line 590
    :cond_1
    return-void
.end method
