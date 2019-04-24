.class Lcom/huawei/feedback/ui/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/p;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/p;)V
    .locals 0

    .line 1342
    iput-object p1, p0, Lcom/huawei/feedback/ui/q;->a:Lcom/huawei/feedback/ui/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1346
    iget-object v0, p0, Lcom/huawei/feedback/ui/q;->a:Lcom/huawei/feedback/ui/p;

    iget-object v0, v0, Lcom/huawei/feedback/ui/p;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->t(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/ScrollView;

    move-result-object v0

    const/16 v1, 0x82

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->fullScroll(I)Z

    .line 1347
    iget-object v0, p0, Lcom/huawei/feedback/ui/q;->a:Lcom/huawei/feedback/ui/p;

    iget-object v0, v0, Lcom/huawei/feedback/ui/p;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1348
    iget-object v0, p0, Lcom/huawei/feedback/ui/q;->a:Lcom/huawei/feedback/ui/p;

    iget-object v0, v0, Lcom/huawei/feedback/ui/p;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 1351
    :cond_0
    return-void
.end method
