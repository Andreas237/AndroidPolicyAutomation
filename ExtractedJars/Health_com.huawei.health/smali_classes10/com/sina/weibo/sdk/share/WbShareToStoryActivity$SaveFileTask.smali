.class Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SaveFileTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Lcom/sina/weibo/sdk/api/StoryMessage;Ljava/lang/Object;Lcom/sina/weibo/sdk/api/StoryObject;>;"
    }
.end annotation


# instance fields
.field protected mReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/content/Context;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;


# direct methods
.method public constructor <init>(Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;Landroid/content/Context;)V
    .locals 1

    .line 135
    iput-object p1, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;->this$0:Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 136
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;->mReference:Ljava/lang/ref/WeakReference;

    .line 137
    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Lcom/sina/weibo/sdk/api/StoryMessage;)Lcom/sina/weibo/sdk/api/StoryObject;
    .locals 9

    .line 141
    const/4 v0, 0x0

    aget-object v2, p1, v0

    .line 142
    invoke-virtual {v2}, Lcom/sina/weibo/sdk/api/StoryMessage;->getImageUri()Landroid/net/Uri;

    move-result-object v3

    .line 143
    invoke-virtual {v2}, Lcom/sina/weibo/sdk/api/StoryMessage;->getVideoUri()Landroid/net/Uri;

    move-result-object v4

    .line 144
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;->mReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/content/Context;

    .line 145
    if-nez v5, :cond_0

    .line 146
    const/4 v0, 0x0

    return-object v0

    .line 148
    :cond_0
    if-eqz v3, :cond_1

    invoke-static {v5, v3}, Lcom/sina/weibo/sdk/utils/FileUtils;->isImageFile(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    if-eqz v4, :cond_6

    .line 149
    invoke-static {v5, v4}, Lcom/sina/weibo/sdk/utils/FileUtils;->isVideoFile(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 151
    :cond_2
    const/4 v6, 0x1

    .line 152
    if-eqz v4, :cond_3

    .line 153
    const/4 v6, 0x0

    .line 155
    :cond_3
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;->this$0:Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;

    const/4 v1, 0x1

    if-ne v6, v1, :cond_4

    move-object v1, v3

    goto :goto_0

    :cond_4
    move-object v1, v4

    :goto_0
    invoke-static {v0, v1, v6}, Lcom/sina/weibo/sdk/utils/ImageUtils;->copyFileToWeiboTem(Landroid/content/Context;Landroid/net/Uri;I)Ljava/lang/String;

    move-result-object v7

    .line 156
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 157
    const/4 v0, 0x0

    return-object v0

    .line 159
    :cond_5
    new-instance v8, Lcom/sina/weibo/sdk/api/StoryObject;

    invoke-direct {v8}, Lcom/sina/weibo/sdk/api/StoryObject;-><init>()V

    .line 160
    iput-object v7, v8, Lcom/sina/weibo/sdk/api/StoryObject;->sourcePath:Ljava/lang/String;

    .line 161
    iput v6, v8, Lcom/sina/weibo/sdk/api/StoryObject;->sourceType:I

    .line 162
    invoke-static {}, Lcom/sina/weibo/sdk/WbSdk;->getAuthInfo()Lcom/sina/weibo/sdk/auth/AuthInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAppKey()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v8, Lcom/sina/weibo/sdk/api/StoryObject;->appId:Ljava/lang/String;

    .line 163
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;->this$0:Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v8, Lcom/sina/weibo/sdk/api/StoryObject;->appPackage:Ljava/lang/String;

    .line 164
    return-object v8

    .line 166
    :cond_6
    const/4 v0, 0x0

    return-object v0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 132
    move-object v0, p1

    check-cast v0, [Lcom/sina/weibo/sdk/api/StoryMessage;

    invoke-virtual {p0, v0}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;->doInBackground([Lcom/sina/weibo/sdk/api/StoryMessage;)Lcom/sina/weibo/sdk/api/StoryObject;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Lcom/sina/weibo/sdk/api/StoryObject;)V
    .locals 3

    .line 172
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 173
    if-eqz p1, :cond_0

    .line 175
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    const-string v1, "sinaweibo://story/publish?forceedit=1&finish=true"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 176
    const-string v0, "startPackage"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 177
    const-string v0, "storyData"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 178
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;->this$0:Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;

    invoke-virtual {v0, v2}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 181
    goto :goto_0

    .line 179
    :catch_0
    move-exception v2

    .line 180
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;->this$0:Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->access$000(Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;I)V

    .line 181
    goto :goto_0

    .line 183
    :cond_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;->this$0:Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;->access$000(Lcom/sina/weibo/sdk/share/WbShareToStoryActivity;I)V

    .line 185
    :goto_0
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 132
    move-object v0, p1

    check-cast v0, Lcom/sina/weibo/sdk/api/StoryObject;

    invoke-virtual {p0, v0}, Lcom/sina/weibo/sdk/share/WbShareToStoryActivity$SaveFileTask;->onPostExecute(Lcom/sina/weibo/sdk/api/StoryObject;)V

    return-void
.end method
