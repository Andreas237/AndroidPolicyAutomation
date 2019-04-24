.class Lcom/huawei/feedback/ui/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


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

    .line 1823
    iput-object p1, p0, Lcom/huawei/feedback/ui/s;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 1826
    iget-object v0, p0, Lcom/huawei/feedback/ui/s;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    new-instance v1, Landroid/app/ProgressDialog;

    iget-object v2, p0, Lcom/huawei/feedback/ui/s;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Landroid/app/ProgressDialog;)Landroid/app/ProgressDialog;

    .line 1827
    iget-object v0, p0, Lcom/huawei/feedback/ui/s;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->C(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/s;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 1828
    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/ui/s;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v2

    const-string v3, "feedback_waiting"

    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 1829
    iget-object v0, p0, Lcom/huawei/feedback/ui/s;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->C(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 1830
    iget-object v0, p0, Lcom/huawei/feedback/ui/s;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->C(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 1831
    iget-object v0, p0, Lcom/huawei/feedback/ui/s;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    iget-object v2, p0, Lcom/huawei/feedback/ui/s;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    iget-object v3, p0, Lcom/huawei/feedback/ui/s;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v3}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Lcom/huawei/feedback/ui/FeedbackEditActivity$i;)Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    .line 1832
    iget-object v0, p0, Lcom/huawei/feedback/ui/s;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->D(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->start()V

    .line 1834
    iget-object v0, p0, Lcom/huawei/feedback/ui/s;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->B(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V

    .line 1835
    return-void
.end method
