.class Lcom/huawei/feedback/ui/i;
.super Landroid/os/Handler;
.source "SourceFile"


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

    .line 1108
    iput-object p1, p0, Lcom/huawei/feedback/ui/i;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 1111
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1113
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/i;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->d(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/i;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->h(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1114
    iget-object v0, p0, Lcom/huawei/feedback/ui/i;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->a(Lcom/huawei/feedback/ui/FeedbackDetailActivity;Z)V

    .line 1116
    iget-object v0, p0, Lcom/huawei/feedback/ui/i;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->d(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    .line 1117
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 1118
    iget-object v0, p0, Lcom/huawei/feedback/ui/i;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->d(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 1119
    nop

    .line 1123
    .line 1139
    :cond_0
    :goto_0
    :sswitch_1
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1140
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6d -> :sswitch_1
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
