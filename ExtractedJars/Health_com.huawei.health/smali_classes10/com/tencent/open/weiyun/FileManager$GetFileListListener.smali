.class Lcom/tencent/open/weiyun/FileManager$GetFileListListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/tauth/IUiListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/weiyun/FileManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "GetFileListListener"
.end annotation


# instance fields
.field private mListener:Lcom/tencent/open/weiyun/IGetFileListListener;

.field final synthetic this$0:Lcom/tencent/open/weiyun/FileManager;


# direct methods
.method public constructor <init>(Lcom/tencent/open/weiyun/FileManager;Lcom/tencent/open/weiyun/IGetFileListListener;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/tencent/open/weiyun/FileManager$GetFileListListener;->this$0:Lcom/tencent/open/weiyun/FileManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    iput-object p2, p0, Lcom/tencent/open/weiyun/FileManager$GetFileListListener;->mListener:Lcom/tencent/open/weiyun/IGetFileListListener;

    .line 96
    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 0

    .line 127
    return-void
.end method

.method public onComplete(Ljava/lang/Object;)V
    .locals 13

    .line 100
    move-object v6, p1

    check-cast v6, Lorg/json/JSONObject;

    .line 103
    :try_start_0
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 104
    const-string v0, "data"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    .line 105
    const-string v0, "content"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 106
    const-string v0, "content"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    .line 107
    const/4 v10, 0x0

    :goto_0
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v10, v0, :cond_0

    .line 108
    invoke-virtual {v9, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    .line 109
    new-instance v0, Lcom/tencent/open/weiyun/WeiyunFile;

    const-string v1, "file_id"

    invoke-virtual {v11, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "file_name"

    invoke-virtual {v11, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "file_ctime"

    invoke-virtual {v11, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "file_size"

    invoke-virtual {v11, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    int-to-long v4, v4

    invoke-direct/range {v0 .. v5}, Lcom/tencent/open/weiyun/WeiyunFile;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    move-object v12, v0

    .line 110
    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$GetFileListListener;->mListener:Lcom/tencent/open/weiyun/IGetFileListListener;

    invoke-interface {v0, v7}, Lcom/tencent/open/weiyun/IGetFileListListener;->onComplete(Ljava/util/List;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    goto :goto_1

    .line 114
    :catch_0
    move-exception v7

    .line 115
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$GetFileListListener;->mListener:Lcom/tencent/open/weiyun/IGetFileListListener;

    new-instance v1, Lcom/tencent/tauth/UiError;

    const-string v2, "\u670d\u52a1\u5668\u8fd4\u56de\u6570\u636e\u683c\u5f0f\u6709\u8bef!"

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, -0x4

    invoke-direct {v1, v4, v2, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/open/weiyun/IGetFileListListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 118
    :goto_1
    return-void
.end method

.method public onError(Lcom/tencent/tauth/UiError;)V
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$GetFileListListener;->mListener:Lcom/tencent/open/weiyun/IGetFileListListener;

    invoke-interface {v0, p1}, Lcom/tencent/open/weiyun/IGetFileListListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 123
    return-void
.end method
