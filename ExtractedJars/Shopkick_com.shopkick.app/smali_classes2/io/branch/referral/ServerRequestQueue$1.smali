.class Lio/branch/referral/ServerRequestQueue$1;
.super Ljava/lang/Object;
.source "ServerRequestQueue.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/branch/referral/ServerRequestQueue;->persist()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/branch/referral/ServerRequestQueue;


# direct methods
.method constructor <init>(Lio/branch/referral/ServerRequestQueue;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lio/branch/referral/ServerRequestQueue$1;->this$0:Lio/branch/referral/ServerRequestQueue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 70
    invoke-static {}, Lio/branch/referral/ServerRequestQueue;->access$000()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 71
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 72
    iget-object v2, p0, Lio/branch/referral/ServerRequestQueue$1;->this$0:Lio/branch/referral/ServerRequestQueue;

    invoke-static {v2}, Lio/branch/referral/ServerRequestQueue;->access$100(Lio/branch/referral/ServerRequestQueue;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/branch/referral/ServerRequest;

    .line 73
    invoke-virtual {v3}, Lio/branch/referral/ServerRequest;->isPersistable()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 74
    invoke-virtual {v3}, Lio/branch/referral/ServerRequest;->toJSON()Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 76
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_0

    .line 82
    :cond_1
    :try_start_1
    iget-object v2, p0, Lio/branch/referral/ServerRequestQueue$1;->this$0:Lio/branch/referral/ServerRequestQueue;

    invoke-static {v2}, Lio/branch/referral/ServerRequestQueue;->access$200(Lio/branch/referral/ServerRequestQueue;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "BNCServerRequestQueue"

    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    goto :goto_2

    :catch_0
    move-exception v2

    :try_start_2
    const-string v3, "Persisting Queue: "

    .line 85
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed to persit queue "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 89
    :try_start_3
    iget-object v2, p0, Lio/branch/referral/ServerRequestQueue$1;->this$0:Lio/branch/referral/ServerRequestQueue;

    invoke-static {v2}, Lio/branch/referral/ServerRequestQueue;->access$200(Lio/branch/referral/ServerRequestQueue;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "BNCServerRequestQueue"

    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 94
    :catch_1
    :goto_1
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    return-void

    .line 89
    :goto_2
    :try_start_5
    iget-object v3, p0, Lio/branch/referral/ServerRequestQueue$1;->this$0:Lio/branch/referral/ServerRequestQueue;

    invoke-static {v3}, Lio/branch/referral/ServerRequestQueue;->access$200(Lio/branch/referral/ServerRequestQueue;)Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    const-string v4, "BNCServerRequestQueue"

    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v4, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 91
    :catch_2
    :try_start_6
    throw v2

    :catchall_1
    move-exception v1

    .line 94
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw v1
.end method
