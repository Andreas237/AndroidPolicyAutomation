.class public Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;
    }
.end annotation


# instance fields
.field private callbackActivity:Ljava/lang/String;

.field private progressBar:Landroid/view/View;

.field private progressColor:I

.field private progressId:I

.field private rootLayout:Landroid/widget/FrameLayout;

.field private saveFileTask:Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 36
    const/4 v0, -0x1

    iput v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->progressColor:I

    .line 37
    const/4 v0, -0x1

    iput v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->progressId:I

    .line 132
    return-void
.end method

.method static synthetic access$000(Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;I)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->setCallbackActivity(I)V

    return-void
.end method

.method private checkInfo(Lcom/sina/weibo/sdk/api/StoryMessage;)Z
    .locals 1

    .line 101
    invoke-virtual {p1}, Lcom/sina/weibo/sdk/api/StoryMessage;->checkSource()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/sina/weibo/sdk/WbSdk;->supportMultiImage(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    const/4 v0, 0x1

    return v0

    .line 104
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private gotoSave(Lcom/sina/weibo/sdk/api/StoryMessage;)V
    .locals 3

    .line 108
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->saveFileTask:Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;

    if-eqz v0, :cond_0

    .line 109
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->saveFileTask:Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;->cancel(Z)Z

    .line 111
    :cond_0
    new-instance v0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;

    invoke-direct {v0, p0, p0}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;-><init>(Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->saveFileTask:Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;

    .line 112
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->saveFileTask:Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/sina/weibo/sdk/api/StoryMessage;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 113
    return-void
.end method

.method private initView()V
    .locals 5

    .line 72
    :try_start_0
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "progressColor"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->progressColor:I

    .line 73
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "progressId"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->progressId:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    goto :goto_0

    :catch_0
    move-exception v3

    .line 76
    :goto_0
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->rootLayout:Landroid/widget/FrameLayout;

    .line 77
    iget v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->progressId:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 78
    const-string v0, "layout_inflater"

    invoke-virtual {p0, v0}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 80
    :try_start_1
    iget v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->progressId:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->progressBar:Landroid/view/View;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 83
    goto :goto_1

    .line 81
    :catch_1
    move-exception v4

    .line 82
    new-instance v0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;

    invoke-direct {v0, p0}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->progressBar:Landroid/view/View;

    .line 84
    :goto_1
    goto :goto_2

    .line 85
    :cond_0
    new-instance v0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;

    invoke-direct {v0, p0}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->progressBar:Landroid/view/View;

    .line 86
    iget v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->progressColor:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 87
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->progressBar:Landroid/view/View;

    check-cast v0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;

    iget v1, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->progressColor:I

    invoke-virtual {v0, v1}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->setProgressColor(I)V

    .line 91
    :cond_1
    :goto_2
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v3, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 92
    const/16 v0, 0x11

    iput v0, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 93
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->rootLayout:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->progressBar:Landroid/view/View;

    invoke-virtual {v0, v1, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 94
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->rootLayout:Landroid/widget/FrameLayout;

    const/high16 v1, 0x33000000

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    .line 95
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->rootLayout:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->setContentView(Landroid/view/View;)V

    .line 96
    return-void
.end method

.method private setCallbackActivity(I)V
    .locals 3

    .line 212
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->rootLayout:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    .line 213
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->rootLayout:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 216
    :cond_0
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 217
    const-string v0, "_weibo_resp_errcode"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 218
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v2}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->setResult(ILandroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 221
    goto :goto_0

    .line 219
    :catch_0
    move-exception v2

    .line 220
    const-string v0, "weibo sdk"

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    :goto_0
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->finish()V

    .line 223
    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 192
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 193
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 40
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 42
    if-eqz p1, :cond_0

    .line 43
    const-string v0, "startActivity"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->callbackActivity:Ljava/lang/String;

    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "startActivity"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->callbackActivity:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    :goto_0
    goto :goto_1

    :catch_0
    move-exception v2

    .line 49
    :goto_1
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->callbackActivity:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 50
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->finish()V

    .line 51
    return-void

    .line 53
    :cond_1
    const/4 v2, 0x0

    .line 55
    :try_start_1
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "_weibo_message_stroy"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/sina/weibo/sdk/api/StoryMessage;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v2, v0

    .line 56
    goto :goto_2

    :catch_1
    move-exception v3

    .line 57
    :goto_2
    if-nez v2, :cond_2

    .line 58
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->setCallbackActivity(I)V

    .line 59
    return-void

    .line 61
    :cond_2
    invoke-direct {p0, v2}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->checkInfo(Lcom/sina/weibo/sdk/api/StoryMessage;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 62
    invoke-direct {p0}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->initView()V

    .line 63
    invoke-direct {p0, v2}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->gotoSave(Lcom/sina/weibo/sdk/api/StoryMessage;)V

    goto :goto_3

    .line 65
    :cond_3
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->setCallbackActivity(I)V

    .line 66
    return-void

    .line 68
    :goto_3
    return-void
.end method

.method protected onDestroy()V
    .locals 0

    .line 202
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 203
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 4

    .line 117
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 118
    const/4 v2, 0x0

    .line 120
    const-string v0, "backType"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 121
    goto :goto_0

    :catch_0
    move-exception v3

    .line 123
    :goto_0
    if-nez v2, :cond_0

    .line 125
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->setCallbackActivity(I)V

    goto :goto_1

    .line 128
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->setCallbackActivity(I)V

    .line 130
    :goto_1
    return-void
.end method

.method protected onResume()V
    .locals 0

    .line 197
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 198
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 207
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 208
    const-string v0, "startActivity"

    iget-object v1, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->callbackActivity:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    return-void
.end method
