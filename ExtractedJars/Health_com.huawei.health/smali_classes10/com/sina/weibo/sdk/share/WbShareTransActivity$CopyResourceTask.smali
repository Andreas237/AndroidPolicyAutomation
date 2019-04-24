.class Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sina/weibo/sdk/share/WbShareTransActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "CopyResourceTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Lcom/sina/weibo/sdk/api/WeiboMultiMessage;Ljava/lang/Object;Lcom/sina/weibo/sdk/share/WbShareTransActivity$TransResourceResult;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sina/weibo/sdk/share/WbShareTransActivity;


# direct methods
.method private constructor <init>(Lcom/sina/weibo/sdk/share/WbShareTransActivity;)V
    .locals 0

    .line 194
    iput-object p1, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;->this$0:Lcom/sina/weibo/sdk/share/WbShareTransActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/sina/weibo/sdk/share/WbShareTransActivity;Lcom/sina/weibo/sdk/share/WbShareTransActivity$1;)V
    .locals 0

    .line 194
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;-><init>(Lcom/sina/weibo/sdk/share/WbShareTransActivity;)V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Lcom/sina/weibo/sdk/api/WeiboMultiMessage;)Lcom/sina/weibo/sdk/share/WbShareTransActivity$TransResourceResult;
    .locals 10

    .line 203
    const/4 v0, 0x0

    aget-object v3, p1, v0

    .line 204
    new-instance v4, Lcom/sina/weibo/sdk/share/WbShareTransActivity$TransResourceResult;

    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;->this$0:Lcom/sina/weibo/sdk/share/WbShareTransActivity;

    const/4 v1, 0x0

    invoke-direct {v4, v0, v1}, Lcom/sina/weibo/sdk/share/WbShareTransActivity$TransResourceResult;-><init>(Lcom/sina/weibo/sdk/share/WbShareTransActivity;Lcom/sina/weibo/sdk/share/WbShareTransActivity$1;)V

    .line 207
    :try_start_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;->this$0:Lcom/sina/weibo/sdk/share/WbShareTransActivity;

    invoke-static {v0}, Lcom/sina/weibo/sdk/WbSdk;->isWbInstall(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 208
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;->this$0:Lcom/sina/weibo/sdk/share/WbShareTransActivity;

    invoke-static {v0}, Lcom/sina/weibo/sdk/WeiboAppManager;->queryWbInfoInternal(Landroid/content/Context;)Lcom/sina/weibo/sdk/auth/WbAppInfo;

    move-result-object v5

    .line 209
    invoke-virtual {v5}, Lcom/sina/weibo/sdk/auth/WbAppInfo;->getSupportVersion()I

    move-result v0

    const/16 v1, 0x2a14

    if-lt v0, v1, :cond_2

    .line 211
    iget-object v0, v3, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->imageObject:Lcom/sina/weibo/sdk/api/ImageObject;

    if-eqz v0, :cond_0

    iget-object v0, v3, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->multiImageObject:Lcom/sina/weibo/sdk/api/MultiImageObject;

    if-eqz v0, :cond_0

    .line 212
    const/4 v0, 0x0

    iput-object v0, v3, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->imageObject:Lcom/sina/weibo/sdk/api/ImageObject;

    .line 214
    :cond_0
    iget-object v0, v3, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->videoSourceObject:Lcom/sina/weibo/sdk/api/VideoSourceObject;

    if-eqz v0, :cond_3

    iget-object v0, v3, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->multiImageObject:Lcom/sina/weibo/sdk/api/MultiImageObject;

    if-nez v0, :cond_1

    iget-object v0, v3, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->imageObject:Lcom/sina/weibo/sdk/api/ImageObject;

    if-eqz v0, :cond_3

    .line 215
    :cond_1
    const/4 v0, 0x0

    iput-object v0, v3, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->multiImageObject:Lcom/sina/weibo/sdk/api/MultiImageObject;

    .line 216
    const/4 v0, 0x0

    iput-object v0, v3, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->imageObject:Lcom/sina/weibo/sdk/api/ImageObject;

    goto :goto_0

    .line 219
    :cond_2
    const/4 v0, 0x0

    iput-object v0, v3, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->multiImageObject:Lcom/sina/weibo/sdk/api/MultiImageObject;

    .line 220
    const/4 v0, 0x0

    iput-object v0, v3, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->videoSourceObject:Lcom/sina/weibo/sdk/api/VideoSourceObject;

    .line 223
    :cond_3
    :goto_0
    iget-object v0, v3, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->multiImageObject:Lcom/sina/weibo/sdk/api/MultiImageObject;

    if-eqz v0, :cond_6

    .line 224
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 225
    iget-object v0, v3, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->multiImageObject:Lcom/sina/weibo/sdk/api/MultiImageObject;

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/api/MultiImageObject;->getImageList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/net/Uri;

    .line 226
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;->this$0:Lcom/sina/weibo/sdk/share/WbShareTransActivity;

    const/4 v1, 0x1

    invoke-static {v0, v8, v1}, Lcom/sina/weibo/sdk/utils/ImageUtils;->copyFileToWeiboTem(Landroid/content/Context;Landroid/net/Uri;I)Ljava/lang/String;

    move-result-object v9

    .line 227
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 228
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    :cond_4
    goto :goto_1

    .line 231
    :cond_5
    iget-object v0, v3, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->multiImageObject:Lcom/sina/weibo/sdk/api/MultiImageObject;

    invoke-virtual {v0, v6}, Lcom/sina/weibo/sdk/api/MultiImageObject;->setImageList(Ljava/util/ArrayList;)V

    .line 233
    :cond_6
    iget-object v0, v3, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->videoSourceObject:Lcom/sina/weibo/sdk/api/VideoSourceObject;

    if-eqz v0, :cond_7

    .line 234
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;->this$0:Lcom/sina/weibo/sdk/share/WbShareTransActivity;

    iget-object v1, v3, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->videoSourceObject:Lcom/sina/weibo/sdk/api/VideoSourceObject;

    iget-object v1, v1, Lcom/sina/weibo/sdk/api/VideoSourceObject;->videoPath:Landroid/net/Uri;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/sina/weibo/sdk/utils/ImageUtils;->copyFileToWeiboTem(Landroid/content/Context;Landroid/net/Uri;I)Ljava/lang/String;

    move-result-object v6

    .line 235
    iget-object v0, v3, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->videoSourceObject:Lcom/sina/weibo/sdk/api/VideoSourceObject;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    iput-object v1, v0, Lcom/sina/weibo/sdk/api/VideoSourceObject;->videoPath:Landroid/net/Uri;

    .line 236
    iget-object v0, v3, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->videoSourceObject:Lcom/sina/weibo/sdk/api/VideoSourceObject;

    invoke-static {v6}, Lcom/sina/weibo/sdk/utils/ImageUtils;->getVideoDuring(Ljava/lang/String;)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/sina/weibo/sdk/api/VideoSourceObject;->during:J

    .line 240
    :cond_7
    iput-object v3, v4, Lcom/sina/weibo/sdk/share/WbShareTransActivity$TransResourceResult;->message:Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    .line 241
    const/4 v0, 0x1

    iput-boolean v0, v4, Lcom/sina/weibo/sdk/share/WbShareTransActivity$TransResourceResult;->transDone:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 244
    goto :goto_2

    .line 242
    :catch_0
    move-exception v5

    .line 243
    const/4 v0, 0x0

    iput-boolean v0, v4, Lcom/sina/weibo/sdk/share/WbShareTransActivity$TransResourceResult;->transDone:Z

    .line 246
    :goto_2
    return-object v4
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 194
    move-object v0, p1

    check-cast v0, [Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    invoke-virtual {p0, v0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;->doInBackground([Lcom/sina/weibo/sdk/api/WeiboMultiMessage;)Lcom/sina/weibo/sdk/share/WbShareTransActivity$TransResourceResult;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Lcom/sina/weibo/sdk/share/WbShareTransActivity$TransResourceResult;)V
    .locals 2

    .line 251
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 253
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;->this$0:Lcom/sina/weibo/sdk/share/WbShareTransActivity;

    invoke-static {v0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->access$300(Lcom/sina/weibo/sdk/share/WbShareTransActivity;)Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 254
    iget-boolean v0, p1, Lcom/sina/weibo/sdk/share/WbShareTransActivity$TransResourceResult;->transDone:Z

    if-nez v0, :cond_0

    .line 255
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;->this$0:Lcom/sina/weibo/sdk/share/WbShareTransActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->access$000(Lcom/sina/weibo/sdk/share/WbShareTransActivity;I)V

    goto :goto_0

    .line 257
    :cond_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;->this$0:Lcom/sina/weibo/sdk/share/WbShareTransActivity;

    iget-object v1, p1, Lcom/sina/weibo/sdk/share/WbShareTransActivity$TransResourceResult;->message:Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/share/WbShareTransActivity;->access$400(Lcom/sina/weibo/sdk/share/WbShareTransActivity;Lcom/sina/weibo/sdk/api/WeiboMultiMessage;)V

    .line 261
    :goto_0
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 194
    move-object v0, p1

    check-cast v0, Lcom/sina/weibo/sdk/share/WbShareTransActivity$TransResourceResult;

    invoke-virtual {p0, v0}, Lcom/sina/weibo/sdk/share/WbShareTransActivity$CopyResourceTask;->onPostExecute(Lcom/sina/weibo/sdk/share/WbShareTransActivity$TransResourceResult;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 0

    .line 197
    invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V

    .line 199
    return-void
.end method
