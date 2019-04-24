.class public Lcom/sina/weibo/sdk/share/WbShareTransActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sina/weibo/sdk/share/WbShareTransActivity$TransResourceResult;,
        Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;
    }
.end annotation


# instance fields
.field private copyResourceTask:Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;

.field flag:Z

.field private handler:Landroid/os/Handler;

.field private progressBar:Landroid/view/View;

.field private progressColor:I

.field private progressId:I

.field private rootLayout:Landroid/widget/FrameLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->flag:Z

    .line 41
    const/4 v0, -0x1

    iput v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->progressColor:I

    .line 42
    const/4 v0, -0x1

    iput v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->progressId:I

    .line 43
    new-instance v0, Lcom/sina/weibo/sdk/share/WbShareTransActivity$1;

    invoke-direct {v0, p0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity$1;-><init>(Lcom/sina/weibo/sdk/share/WbShareTransActivity;)V

    iput-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->handler:Landroid/os/Handler;

    .line 264
    return-void
.end method

.method static synthetic access$000(Lcom/sina/weibo/sdk/share/WbShareTransActivity;I)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->sendCallback(I)V

    return-void
.end method

.method static synthetic access$300(Lcom/sina/weibo/sdk/share/WbShareTransActivity;)Landroid/widget/FrameLayout;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->rootLayout:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method static synthetic access$400(Lcom/sina/weibo/sdk/share/WbShareTransActivity;Lcom/sina/weibo/sdk/api/WeiboMultiMessage;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->gotoWeiboComposer(Lcom/sina/weibo/sdk/api/WeiboMultiMessage;)V

    return-void
.end method

.method private checkSource()V
    .locals 3

    .line 60
    :try_start_0
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 61
    if-nez v1, :cond_0

    .line 62
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->finish()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    return-void

    .line 65
    :cond_0
    :try_start_1
    new-instance v2, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    invoke-direct {v2}, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;-><init>()V

    .line 66
    invoke-virtual {v2, v1}, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->toObject(Landroid/os/Bundle;)Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    .line 67
    invoke-direct {p0, v2}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->transPicAndVideoResource(Lcom/sina/weibo/sdk/api/WeiboMultiMessage;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 70
    goto :goto_0

    .line 68
    :catch_0
    move-exception v1

    .line 69
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->finish()V

    .line 72
    :goto_0
    return-void
.end method

.method private gotoWeiboComposer(Lcom/sina/weibo/sdk/api/WeiboMultiMessage;)V
    .locals 7

    .line 105
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 106
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->flag:Z

    .line 108
    const-string v0, "startFlag"

    const/4 v1, -0x1

    :try_start_0
    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 109
    new-instance v3, Landroid/content/Intent;

    const-string v0, "com.sina.weibo.sdk.action.ACTION_WEIBO_ACTIVITY"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 110
    const-string v0, "startPackage"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 111
    const-string v0, "startAction"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 112
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    .line 113
    invoke-virtual {p1, v4}, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->toBundle(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 114
    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 115
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->getPackageName()Ljava/lang/String;

    move-result-object v5

    .line 116
    const-string v0, "_weibo_sdkVersion"

    const-string v1, "0041005000"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 117
    const-string v0, "_weibo_appPackage"

    invoke-virtual {v3, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 118
    const-string v0, "_weibo_appKey"

    invoke-static {}, Lcom/sina/weibo/sdk/WbSdk;->getAuthInfo()Lcom/sina/weibo/sdk/auth/AuthInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAppKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 119
    const-string v0, "_weibo_flag"

    const v1, 0x20130329

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 120
    const-string v0, "_weibo_sign"

    invoke-static {p0, v5}, Lcom/sina/weibo/sdk/utils/Utility;->getSign(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/sina/weibo/sdk/utils/MD5;->hexdigest(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 121
    const-string v0, "gotoActivity"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 122
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "com.sina.weibo.sdk.web.WeiboSdkWebActivity"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    const-string v0, "com.sina.weibo.sdk.web.WeiboSdkWebActivity"

    invoke-virtual {v3, p0, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 124
    invoke-virtual {p0, v3}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 127
    :cond_0
    invoke-static {p0}, Lcom/sina/weibo/sdk/WbSdk;->isWbInstall(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 128
    const/16 v0, 0x2fd

    invoke-virtual {p0, v3, v0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 130
    :cond_1
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->sendCallback(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    :goto_0
    goto :goto_1

    .line 133
    :catch_0
    move-exception v3

    .line 134
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->sendCallback(I)V

    .line 136
    :goto_1
    return-void
.end method

.method private initView()V
    .locals 5

    .line 76
    :try_start_0
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "progressColor"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->progressColor:I

    .line 77
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "progressId"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->progressId:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    goto :goto_0

    :catch_0
    move-exception v3

    .line 80
    :goto_0
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->rootLayout:Landroid/widget/FrameLayout;

    .line 81
    iget v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->progressId:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 82
    const-string v0, "layout_inflater"

    invoke-virtual {p0, v0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 84
    :try_start_1
    iget v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->progressId:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->progressBar:Landroid/view/View;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 87
    goto :goto_1

    .line 85
    :catch_1
    move-exception v4

    .line 86
    new-instance v0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;

    invoke-direct {v0, p0}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->progressBar:Landroid/view/View;

    .line 88
    :goto_1
    goto :goto_2

    .line 89
    :cond_0
    new-instance v0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;

    invoke-direct {v0, p0}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->progressBar:Landroid/view/View;

    .line 90
    iget v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->progressColor:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 91
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->progressBar:Landroid/view/View;

    check-cast v0, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;

    iget v1, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->progressColor:I

    invoke-virtual {v0, v1}, Lcom/sina/weibo/sdk/web/view/WbSdkProgressBar;->setProgressColor(I)V

    .line 95
    :cond_1
    :goto_2
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v3, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 96
    const/16 v0, 0x11

    iput v0, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 97
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->rootLayout:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->progressBar:Landroid/view/View;

    invoke-virtual {v0, v1, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->rootLayout:Landroid/widget/FrameLayout;

    const/high16 v1, 0x33000000

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    .line 99
    return-void
.end method

.method private sendCallback(I)V
    .locals 4

    .line 270
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->rootLayout:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    .line 271
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->rootLayout:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 274
    :cond_0
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 275
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 276
    const-string v0, "_weibo_resp_errcode"

    invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 277
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v2}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->setResult(ILandroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 278
    goto :goto_0

    :catch_0
    move-exception v2

    .line 279
    :goto_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->handler:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 280
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 281
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->handler:Landroid/os/Handler;

    .line 283
    :cond_1
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->finish()V

    .line 284
    return-void
.end method

.method private transPicAndVideoResource(Lcom/sina/weibo/sdk/api/WeiboMultiMessage;)V
    .locals 3

    .line 142
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->rootLayout:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->setContentView(Landroid/view/View;)V

    .line 144
    iget-object v0, p1, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->multiImageObject:Lcom/sina/weibo/sdk/api/MultiImageObject;

    if-nez v0, :cond_0

    iget-object v0, p1, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->videoSourceObject:Lcom/sina/weibo/sdk/api/VideoSourceObject;

    if-eqz v0, :cond_2

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->rootLayout:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->setContentView(Landroid/view/View;)V

    .line 146
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->copyResourceTask:Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;

    if-eqz v0, :cond_1

    .line 147
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->copyResourceTask:Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;->cancel(Z)Z

    .line 149
    :cond_1
    new-instance v0, Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;-><init>(Lcom/sina/weibo/sdk/share/WbShareTransActivity;Lcom/sina/weibo/sdk/share/WbShareTransActivity$1;)V

    iput-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->copyResourceTask:Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;

    .line 150
    const/4 v0, 0x1

    new-array v2, v0, [Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    .line 151
    const/4 v0, 0x0

    aput-object p1, v2, v0

    .line 152
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->copyResourceTask:Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;

    invoke-virtual {v0, v2}, Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 153
    goto :goto_0

    .line 154
    :cond_2
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->gotoWeiboComposer(Lcom/sina/weibo/sdk/api/WeiboMultiMessage;)V

    .line 156
    :goto_0
    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 161
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 162
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->handler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 163
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 165
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 53
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 54
    invoke-direct {p0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->initView()V

    .line 55
    invoke-direct {p0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->checkSource()V

    .line 56
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 169
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 170
    const/4 v0, 0x1

    return v0

    .line 172
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .line 177
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 178
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->handler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 179
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 180
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->handler:Landroid/os/Handler;

    .line 183
    :cond_0
    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->setResult(ILandroid/content/Intent;)V

    .line 185
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->finish()V

    .line 186
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 190
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 191
    const-string v0, "startFlag"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 192
    return-void
.end method
