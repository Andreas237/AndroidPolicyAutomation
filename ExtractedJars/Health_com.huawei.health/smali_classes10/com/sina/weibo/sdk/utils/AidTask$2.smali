.class Lcom/sina/weibo/sdk/utils/AidTask$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sina/weibo/sdk/utils/AidTask;->initAidInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sina/weibo/sdk/utils/AidTask;


# direct methods
.method constructor <init>(Lcom/sina/weibo/sdk/utils/AidTask;)V
    .locals 0

    .line 231
    iput-object p1, p0, Lcom/sina/weibo/sdk/utils/AidTask$2;->this$0:Lcom/sina/weibo/sdk/utils/AidTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 234
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$2;->this$0:Lcom/sina/weibo/sdk/utils/AidTask;

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/AidTask;->access$100(Lcom/sina/weibo/sdk/utils/AidTask;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    move-result v0

    if-nez v0, :cond_0

    .line 235
    const-string v0, "AidTask"

    const-string v1, "tryLock : false, return"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    return-void

    .line 238
    :cond_0
    const/4 v3, 0x0

    .line 239
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$2;->this$0:Lcom/sina/weibo/sdk/utils/AidTask;

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/utils/AidTask;->loadAidInfoFromCache()Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    move-result-object v3

    .line 240
    const-string v0, "AidTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "loadAidInfoFromCache"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    if-nez v3, :cond_3

    .line 243
    const/4 v4, 0x1

    .line 245
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 248
    :try_start_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$2;->this$0:Lcom/sina/weibo/sdk/utils/AidTask;

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/utils/AidTask;->loadAidFromNet()Ljava/lang/String;

    move-result-object v5

    .line 249
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_2

    .line 250
    return-void

    .line 252
    :cond_2
    :try_start_1
    invoke-static {v5}, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->parseJson(Ljava/lang/String;)Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    move-result-object v3

    .line 253
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$2;->this$0:Lcom/sina/weibo/sdk/utils/AidTask;

    invoke-static {v0, v5}, Lcom/sina/weibo/sdk/utils/AidTask;->access$200(Lcom/sina/weibo/sdk/utils/AidTask;Ljava/lang/String;)V

    .line 254
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$2;->this$0:Lcom/sina/weibo/sdk/utils/AidTask;

    invoke-static {v0, v3}, Lcom/sina/weibo/sdk/utils/AidTask;->access$302(Lcom/sina/weibo/sdk/utils/AidTask;Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;)Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    .line 255
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$2;->this$0:Lcom/sina/weibo/sdk/utils/AidTask;

    iget-object v1, p0, Lcom/sina/weibo/sdk/utils/AidTask$2;->this$0:Lcom/sina/weibo/sdk/utils/AidTask;

    invoke-static {v1}, Lcom/sina/weibo/sdk/utils/AidTask;->access$300(Lcom/sina/weibo/sdk/utils/AidTask;)Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/AidTask;->access$400(Lcom/sina/weibo/sdk/utils/AidTask;Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 256
    goto :goto_0

    .line 257
    :catch_0
    move-exception v5

    .line 258
    const-string v0, "AidTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AidTaskInit WeiboException Msg : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    const/4 v0, 0x3

    if-lt v4, v0, :cond_1

    .line 261
    :goto_0
    goto :goto_1

    .line 262
    :cond_3
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$2;->this$0:Lcom/sina/weibo/sdk/utils/AidTask;

    invoke-static {v0, v3}, Lcom/sina/weibo/sdk/utils/AidTask;->access$302(Lcom/sina/weibo/sdk/utils/AidTask;Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;)Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    .line 264
    :goto_1
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$2;->this$0:Lcom/sina/weibo/sdk/utils/AidTask;

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/AidTask;->access$100(Lcom/sina/weibo/sdk/utils/AidTask;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 265
    return-void
.end method
