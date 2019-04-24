.class Lcom/huawei/feedback/ui/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


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

    .line 532
    iput-object p1, p0, Lcom/huawei/feedback/ui/z;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 537
    iget-object v0, p0, Lcom/huawei/feedback/ui/z;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->g(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/CheckBox;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/z;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->g(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/CheckBox;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 538
    iget-object v0, p0, Lcom/huawei/feedback/ui/z;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->k()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 541
    :goto_1
    if-eqz v3, :cond_2

    .line 542
    iget-object v0, p0, Lcom/huawei/feedback/ui/z;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 543
    iget-object v0, p0, Lcom/huawei/feedback/ui/z;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/16 v2, 0x1002

    invoke-static {v0, v1, v2}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 545
    return-void

    .line 560
    :cond_2
    iget-object v0, p0, Lcom/huawei/feedback/ui/z;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/huawei/feedback/bean/d;->a(Z)V

    .line 561
    return-void
.end method
