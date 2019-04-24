.class Lo/aod$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aod;->d(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;Ljava/io/File;Lo/aog;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aog;

.field final synthetic d:Lo/aod;

.field final synthetic e:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;


# direct methods
.method constructor <init>(Lo/aod;Lo/aog;Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lo/aod$1;->d:Lo/aod;

    iput-object p2, p0, Lo/aod$1;->a:Lo/aog;

    iput-object p3, p0, Lo/aod$1;->e:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 4

    .line 157
    const-string v0, "Group_HttpRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u56fe\u7247\u4e0a\u4f20\u5931\u8d25\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    iget-object v0, p0, Lo/aod$1;->a:Lo/aog;

    invoke-virtual {p2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-interface {v0, v2, v1}, Lo/aog;->d(ILjava/lang/String;)V

    .line 159
    return-void
.end method

.method public onResponse(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 163
    const-string v0, "Group_HttpRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u56fe\u7247\u4e0a\u4f20\u6210\u529f\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v3

    invoke-virtual {v3}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    iget-object v0, p0, Lo/aod$1;->e:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;->getFileTagList()Ljava/util/List;

    move-result-object v4

    .line 165
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 166
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 167
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/ui/group/healthbeans/FileTagListBean;

    .line 168
    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/FileTagListBean;->toJson()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 166
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 170
    :cond_0
    const-string v0, "Group_HttpRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4e0a\u4f20\u6210\u529f\u4e0a\u62a5\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    invoke-static {v5}, Lo/anz;->e(Lorg/json/JSONArray;)V

    .line 172
    iget-object v0, p0, Lo/aod$1;->a:Lo/aog;

    iget-object v1, p0, Lo/aod$1;->e:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;

    invoke-interface {v0, v1}, Lo/aog;->d(Ljava/lang/Object;)V

    .line 173
    return-void
.end method
