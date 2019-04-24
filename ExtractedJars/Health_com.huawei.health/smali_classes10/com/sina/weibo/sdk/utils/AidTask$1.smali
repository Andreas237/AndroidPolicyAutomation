.class Lcom/sina/weibo/sdk/utils/AidTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sina/weibo/sdk/utils/AidTask;-><init>(Landroid/content/Context;)V
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

    .line 181
    iput-object p1, p0, Lcom/sina/weibo/sdk/utils/AidTask$1;->this$0:Lcom/sina/weibo/sdk/utils/AidTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 184
    const/4 v1, 0x0

    :goto_0
    const/4 v0, 0x1

    if-ge v1, v0, :cond_0

    .line 185
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask$1;->this$0:Lcom/sina/weibo/sdk/utils/AidTask;

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/AidTask;->access$000(Lcom/sina/weibo/sdk/utils/AidTask;I)Ljava/io/File;

    move-result-object v2

    .line 187
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 189
    goto :goto_1

    .line 188
    :catch_0
    move-exception v3

    .line 184
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 191
    :cond_0
    return-void
.end method
