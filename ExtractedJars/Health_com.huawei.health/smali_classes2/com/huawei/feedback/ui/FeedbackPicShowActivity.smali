.class public Lcom/huawei/feedback/ui/FeedbackPicShowActivity;
.super Lcom/huawei/feedback/ui/BaseActivity;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;

.field private c:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Lcom/huawei/feedback/ui/BaseActivity;-><init>()V

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->b:Ljava/lang/String;

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->c:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 38
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->requestWindowFeature(I)Z

    .line 39
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    const/16 v2, 0x400

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 41
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->a(Z)V

    .line 42
    invoke-super {p0, p1}, Lcom/huawei/feedback/ui/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 44
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    .line 45
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/FeedbackApi;->setApplicationcontext(Landroid/content/Context;)V

    .line 47
    :cond_0
    new-instance v3, Landroid/widget/ImageView;

    invoke-direct {v3, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 48
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v4, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 51
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 52
    const-string v0, "feedback_content_description_attached_picture"

    .line 53
    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    .line 52
    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 55
    invoke-virtual {p0, v3}, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->setContentView(Landroid/view/View;)V

    .line 57
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "picture_path"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->b:Ljava/lang/String;

    .line 58
    const-string v0, "window"

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/WindowManager;

    .line 59
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v6

    .line 60
    new-instance v7, Landroid/graphics/Point;

    invoke-direct {v7}, Landroid/graphics/Point;-><init>()V

    .line 61
    invoke-virtual {v6, v7}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 62
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->b:Ljava/lang/String;

    iget v1, v7, Landroid/graphics/Point;->x:I

    iget v2, v7, Landroid/graphics/Point;->y:I

    invoke-static {v0, v1, v2}, Lcom/huawei/phoneserviceuni/common/e/f;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->c:Landroid/graphics/Bitmap;

    .line 63
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->c:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 64
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->finish()V

    .line 67
    return-void

    .line 69
    :goto_0
    new-instance v0, Lcom/huawei/feedback/ui/ae;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/ae;-><init>(Lcom/huawei/feedback/ui/FeedbackPicShowActivity;)V

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    const/4 v0, 0x0

    invoke-virtual {p0, v3, v0}, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->a(Landroid/view/View;Lcom/huawei/feedback/ui/CustomActionBar;)V

    .line 77
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 91
    invoke-super {p0}, Lcom/huawei/feedback/ui/BaseActivity;->onDestroy()V

    .line 93
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->c:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->c:Landroid/graphics/Bitmap;

    .line 98
    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 81
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 82
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;->finish()V

    .line 83
    const/4 v0, 0x1

    return v0

    .line 85
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/feedback/ui/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method protected onPause()V
    .locals 1

    .line 103
    invoke-super {p0}, Lcom/huawei/feedback/ui/BaseActivity;->onPause()V

    .line 104
    const-string v0, "onPause"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->j(Landroid/content/Context;Ljava/lang/String;)V

    .line 105
    const-string v0, "onReport"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->j(Landroid/content/Context;Ljava/lang/String;)V

    .line 106
    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 111
    invoke-super {p0}, Lcom/huawei/feedback/ui/BaseActivity;->onResume()V

    .line 112
    const-string v0, "onResume"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->j(Landroid/content/Context;Ljava/lang/String;)V

    .line 113
    return-void
.end method
