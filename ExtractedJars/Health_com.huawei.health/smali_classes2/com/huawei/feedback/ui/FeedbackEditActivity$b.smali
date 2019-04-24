.class Lcom/huawei/feedback/ui/FeedbackEditActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/ui/FeedbackEditActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackEditActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 1505
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;Lcom/huawei/feedback/ui/n;)V
    .locals 0

    .line 1505
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/FeedbackEditActivity$b;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 1526
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1521
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    .line 1508
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1510
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;Z)V

    .line 1511
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->w(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 1513
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->w(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1514
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->v(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    .line 1516
    :goto_0
    return-void
.end method
