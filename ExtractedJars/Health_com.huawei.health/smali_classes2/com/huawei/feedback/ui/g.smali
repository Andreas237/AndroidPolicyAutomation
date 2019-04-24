.class Lcom/huawei/feedback/ui/g;
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
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V
    .locals 0

    .line 415
    iput-object p1, p0, Lcom/huawei/feedback/ui/g;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 428
    iget-object v0, p0, Lcom/huawei/feedback/ui/g;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    const-string v1, "feedback_send_btn"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 429
    iget-object v0, p0, Lcom/huawei/feedback/ui/g;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->d(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 430
    return-void

    .line 432
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/g;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->e(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V

    goto :goto_0

    .line 433
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/g;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    const-string v1, "add_image_btn"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 434
    iget-object v0, p0, Lcom/huawei/feedback/ui/g;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->f(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V

    .line 460
    :cond_2
    :goto_0
    return-void
.end method
