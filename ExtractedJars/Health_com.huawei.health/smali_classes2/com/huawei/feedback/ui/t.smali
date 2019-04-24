.class Lcom/huawei/feedback/ui/t;
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

    .line 1873
    iput-object p1, p0, Lcom/huawei/feedback/ui/t;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 1878
    iget-object v0, p0, Lcom/huawei/feedback/ui/t;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->E(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/app/AlertDialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1879
    iget-object v0, p0, Lcom/huawei/feedback/ui/t;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->E(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V

    .line 1882
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/t;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->finish()V

    .line 1884
    return-void
.end method
