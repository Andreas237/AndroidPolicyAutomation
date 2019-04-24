.class Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4;->requestWearTask(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4;

.field final synthetic val$map:Ljava/util/Map;

.field final synthetic val$parameters:Ljava/lang/String;

.field final synthetic val$parser:Lcom/huawei/hwservicesmgr/remote/parser/IParser;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4;Ljava/lang/String;Lcom/huawei/hwservicesmgr/remote/parser/IParser;Ljava/util/Map;)V
    .locals 0

    .line 260
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4$1;->this$1:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4;

    iput-object p2, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4$1;->val$parameters:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4$1;->val$parser:Lcom/huawei/hwservicesmgr/remote/parser/IParser;

    iput-object p4, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4$1;->val$map:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 264
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4$1;->val$parameters:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4$1;->val$parameters:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 265
    new-instance v5, Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4$1;->val$parameters:Ljava/lang/String;

    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 266
    const/4 v0, 0x2

    new-array v6, v0, [Ljava/lang/Class;

    .line 267
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 268
    const-class v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x1

    aput-object v0, v6, v1

    .line 269
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4$1;->val$parser:Lcom/huawei/hwservicesmgr/remote/parser/IParser;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4$1;->val$map:Ljava/util/Map;

    const-string v2, "funcName"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 270
    const/4 v0, 0x2

    new-array v8, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object v5, v8, v0

    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1300()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 271
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4$1;->val$parser:Lcom/huawei/hwservicesmgr/remote/parser/IParser;

    invoke-virtual {v7, v0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    goto/16 :goto_0

    .line 273
    :cond_0
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the parser is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4$1;->val$parser:Lcom/huawei/hwservicesmgr/remote/parser/IParser;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4$1;->val$parser:Lcom/huawei/hwservicesmgr/remote/parser/IParser;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4$1;->val$map:Ljava/util/Map;

    const-string v2, "funcName"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 275
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the method is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4$1;->val$parser:Lcom/huawei/hwservicesmgr/remote/parser/IParser;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1300()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    .line 282
    :goto_0
    goto :goto_1

    .line 278
    :catch_0
    move-exception v5

    .line 279
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    goto :goto_1

    .line 280
    :catch_1
    move-exception v5

    .line 281
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Parameter ERROR! "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    :goto_1
    return-void
.end method
