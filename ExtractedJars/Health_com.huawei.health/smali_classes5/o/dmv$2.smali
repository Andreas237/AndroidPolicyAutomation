.class Lo/dmv$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dmv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dmv;


# direct methods
.method constructor <init>(Lo/dmv;)V
    .locals 0

    .line 207
    iput-object p1, p0, Lo/dmv$2;->a:Lo/dmv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 210
    if-nez p2, :cond_0

    goto/16 :goto_0

    .line 213
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 216
    :try_start_0
    invoke-static {}, Lo/dmv;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lo/dmv$2;->a:Lo/dmv;

    invoke-static {v1}, Lo/dmv;->a(Lo/dmv;)I

    move-result v1

    div-int/lit8 v1, v1, 0x4

    if-lt v0, v1, :cond_1

    .line 217
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mListBack.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/dmv;->d()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 218
    return-void

    .line 221
    :cond_1
    :try_start_1
    new-instance v4, Lorg/json/JSONObject;

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 222
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mCallBack Message is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    iget-object v0, p0, Lo/dmv$2;->a:Lo/dmv;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dmv;->e(Lo/dmv;Z)Z

    .line 225
    invoke-static {}, Lo/dmv;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 226
    iget-object v0, p0, Lo/dmv$2;->a:Lo/dmv;

    invoke-static {v0}, Lo/dmv;->b(Lo/dmv;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 227
    iget-object v0, p0, Lo/dmv$2;->a:Lo/dmv;

    invoke-static {v0}, Lo/dmv;->c(Lo/dmv;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 228
    iget-object v0, p0, Lo/dmv$2;->a:Lo/dmv;

    invoke-static {v0, v4}, Lo/dmv;->c(Lo/dmv;Lorg/json/JSONObject;)V

    .line 229
    iget-object v0, p0, Lo/dmv$2;->a:Lo/dmv;

    invoke-static {v0}, Lo/dmv;->e(Lo/dmv;)V

    .line 231
    iget-object v0, p0, Lo/dmv$2;->a:Lo/dmv;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lo/dmv;->c(Lo/dmv;I)V

    .line 232
    iget-object v0, p0, Lo/dmv$2;->a:Lo/dmv;

    const/4 v1, 0x6

    invoke-static {v0, v1}, Lo/dmv;->e(Lo/dmv;I)V

    .line 233
    iget-object v0, p0, Lo/dmv$2;->a:Lo/dmv;

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lo/dmv;->b(Lo/dmv;I)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 237
    goto :goto_0

    .line 235
    :catch_0
    move-exception v4

    .line 236
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mCallBack "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    :cond_2
    :goto_0
    return-void
.end method
