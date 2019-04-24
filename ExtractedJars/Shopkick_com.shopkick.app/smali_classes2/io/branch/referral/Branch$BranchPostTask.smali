.class Lio/branch/referral/Branch$BranchPostTask;
.super Lio/branch/referral/BranchAsyncTask;
.source "Branch.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/Branch;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "BranchPostTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/branch/referral/BranchAsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lio/branch/referral/ServerResponse;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/branch/referral/Branch;

.field thisReq_:Lio/branch/referral/ServerRequest;


# direct methods
.method public constructor <init>(Lio/branch/referral/Branch;Lio/branch/referral/ServerRequest;)V
    .locals 0

    .line 2838
    iput-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-direct {p0}, Lio/branch/referral/BranchAsyncTask;-><init>()V

    .line 2839
    iput-object p2, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Void;)Lio/branch/referral/ServerResponse;
    .locals 4

    .line 2852
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-virtual {v1}, Lio/branch/referral/ServerRequest;->getRequestPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Queue_Wait_Time:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-virtual {v1}, Lio/branch/referral/ServerRequest;->getQueueWaitTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lio/branch/referral/Branch;->addExtraInstrumentationData(Ljava/lang/String;Ljava/lang/String;)V

    .line 2853
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-virtual {p1}, Lio/branch/referral/ServerRequest;->doFinalUpdateOnBackgroundThread()V

    .line 2854
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-virtual {p1}, Lio/branch/referral/Branch;->isTrackingDisabled()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-virtual {p1}, Lio/branch/referral/ServerRequest;->prepareExecuteWithoutTracking()Z

    move-result p1

    if-nez p1, :cond_0

    .line 2855
    new-instance p1, Lio/branch/referral/ServerResponse;

    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-virtual {v0}, Lio/branch/referral/ServerRequest;->getRequestPath()Ljava/lang/String;

    move-result-object v0

    const/16 v1, -0x75

    invoke-direct {p1, v0, v1}, Lio/branch/referral/ServerResponse;-><init>(Ljava/lang/String;I)V

    return-object p1

    .line 2857
    :cond_0
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-virtual {p1}, Lio/branch/referral/ServerRequest;->isGetRequest()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2858
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1}, Lio/branch/referral/Branch;->access$1400(Lio/branch/referral/Branch;)Lio/branch/referral/network/BranchRemoteInterface;

    move-result-object p1

    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-virtual {v0}, Lio/branch/referral/ServerRequest;->getRequestUrl()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-virtual {v1}, Lio/branch/referral/ServerRequest;->getGetParams()Lorg/json/JSONObject;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-virtual {v2}, Lio/branch/referral/ServerRequest;->getRequestPath()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v3}, Lio/branch/referral/Branch;->access$100(Lio/branch/referral/Branch;)Lio/branch/referral/PrefHelper;

    move-result-object v3

    invoke-virtual {v3}, Lio/branch/referral/PrefHelper;->getBranchKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v0, v1, v2, v3}, Lio/branch/referral/network/BranchRemoteInterface;->make_restful_get(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lio/branch/referral/ServerResponse;

    move-result-object p1

    return-object p1

    .line 2860
    :cond_1
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1}, Lio/branch/referral/Branch;->access$1400(Lio/branch/referral/Branch;)Lio/branch/referral/network/BranchRemoteInterface;

    move-result-object p1

    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    iget-object v1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v1}, Lio/branch/referral/Branch;->access$1500(Lio/branch/referral/Branch;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/branch/referral/ServerRequest;->getPostWithInstrumentationValues(Ljava/util/concurrent/ConcurrentHashMap;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-virtual {v1}, Lio/branch/referral/ServerRequest;->getRequestUrl()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-virtual {v2}, Lio/branch/referral/ServerRequest;->getRequestPath()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v3}, Lio/branch/referral/Branch;->access$100(Lio/branch/referral/Branch;)Lio/branch/referral/PrefHelper;

    move-result-object v3

    invoke-virtual {v3}, Lio/branch/referral/PrefHelper;->getBranchKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v0, v1, v2, v3}, Lio/branch/referral/network/BranchRemoteInterface;->make_restful_post(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/branch/referral/ServerResponse;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2835
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lio/branch/referral/Branch$BranchPostTask;->doInBackground([Ljava/lang/Void;)Lio/branch/referral/ServerResponse;

    move-result-object p1

    return-object p1
.end method

.method protected onPostExecute(Lio/branch/referral/ServerResponse;)V
    .locals 6

    .line 2866
    invoke-super {p0, p1}, Lio/branch/referral/BranchAsyncTask;->onPostExecute(Ljava/lang/Object;)V

    if-eqz p1, :cond_19

    .line 2869
    :try_start_0
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getStatusCode()I

    move-result v0

    .line 2870
    iget-object v1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lio/branch/referral/Branch;->access$1602(Lio/branch/referral/Branch;Z)Z

    .line 2872
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getStatusCode()I

    move-result v1

    const/16 v3, -0x75

    const/4 v4, 0x0

    if-ne v1, v3, :cond_0

    .line 2873
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-virtual {p1}, Lio/branch/referral/ServerRequest;->reportTrackingDisabledError()V

    .line 2874
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1}, Lio/branch/referral/Branch;->access$200(Lio/branch/referral/Branch;)Lio/branch/referral/ServerRequestQueue;

    move-result-object p1

    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-virtual {p1, v0}, Lio/branch/referral/ServerRequestQueue;->remove(Lio/branch/referral/ServerRequest;)Z

    goto/16 :goto_8

    :cond_0
    const/16 v1, 0xc8

    if-eq v0, v1, :cond_a

    .line 2880
    iget-object v1, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    instance-of v1, v1, Lio/branch/referral/ServerRequestInitSession;

    if-eqz v1, :cond_1

    .line 2881
    iget-object v1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    sget-object v2, Lio/branch/referral/Branch$SESSION_STATE;->UNINITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    invoke-static {v1, v2}, Lio/branch/referral/Branch;->access$802(Lio/branch/referral/Branch;Lio/branch/referral/Branch$SESSION_STATE;)Lio/branch/referral/Branch$SESSION_STATE;

    :cond_1
    const/16 v1, 0x190

    if-eq v0, v1, :cond_8

    const/16 v1, 0x199

    if-ne v0, v1, :cond_2

    goto/16 :goto_3

    .line 2896
    :cond_2
    iget-object v1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v1, v4}, Lio/branch/referral/Branch;->access$1602(Lio/branch/referral/Branch;Z)Z

    .line 2898
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move v2, v4

    .line 2899
    :goto_0
    iget-object v3, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v3}, Lio/branch/referral/Branch;->access$200(Lio/branch/referral/Branch;)Lio/branch/referral/ServerRequestQueue;

    move-result-object v3

    invoke-virtual {v3}, Lio/branch/referral/ServerRequestQueue;->getSize()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 2900
    iget-object v3, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v3}, Lio/branch/referral/Branch;->access$200(Lio/branch/referral/Branch;)Lio/branch/referral/ServerRequestQueue;

    move-result-object v3

    invoke-virtual {v3, v2}, Lio/branch/referral/ServerRequestQueue;->peekAt(I)Lio/branch/referral/ServerRequest;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2903
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/branch/referral/ServerRequest;

    if-eqz v3, :cond_5

    .line 2904
    invoke-virtual {v3}, Lio/branch/referral/ServerRequest;->shouldRetryOnFail()Z

    move-result v5

    if-nez v5, :cond_4

    .line 2905
    :cond_5
    iget-object v5, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v5}, Lio/branch/referral/Branch;->access$200(Lio/branch/referral/Branch;)Lio/branch/referral/ServerRequestQueue;

    move-result-object v5

    invoke-virtual {v5, v3}, Lio/branch/referral/ServerRequestQueue;->remove(Lio/branch/referral/ServerRequest;)Z

    goto :goto_1

    .line 2909
    :cond_6
    iget-object v2, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v2, v4}, Lio/branch/referral/Branch;->access$1802(Lio/branch/referral/Branch;I)I

    .line 2912
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/branch/referral/ServerRequest;

    if-eqz v2, :cond_7

    .line 2914
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getFailReason()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lio/branch/referral/ServerRequest;->handleFailure(ILjava/lang/String;)V

    .line 2916
    invoke-virtual {v2}, Lio/branch/referral/ServerRequest;->shouldRetryOnFail()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 2917
    invoke-virtual {v2}, Lio/branch/referral/ServerRequest;->clearCallbacks()V

    goto :goto_2

    .line 2885
    :cond_8
    :goto_3
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1}, Lio/branch/referral/Branch;->access$200(Lio/branch/referral/Branch;)Lio/branch/referral/ServerRequestQueue;

    move-result-object p1

    iget-object v1, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-virtual {p1, v1}, Lio/branch/referral/ServerRequestQueue;->remove(Lio/branch/referral/ServerRequest;)Z

    .line 2886
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    instance-of p1, p1, Lio/branch/referral/ServerRequestCreateUrl;

    if-eqz p1, :cond_9

    .line 2887
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    check-cast p1, Lio/branch/referral/ServerRequestCreateUrl;

    invoke-virtual {p1}, Lio/branch/referral/ServerRequestCreateUrl;->handleDuplicateURLError()V

    goto/16 :goto_8

    :cond_9
    const-string p1, "BranchSDK"

    const-string v1, "Branch API Error: Conflicting resource error code from API"

    .line 2889
    invoke-static {p1, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2890
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1, v4, v0}, Lio/branch/referral/Branch;->access$1700(Lio/branch/referral/Branch;II)V

    goto/16 :goto_8

    .line 2924
    :cond_a
    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v0, v2}, Lio/branch/referral/Branch;->access$1602(Lio/branch/referral/Branch;Z)Z

    .line 2926
    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    instance-of v0, v0, Lio/branch/referral/ServerRequestCreateUrl;

    if-eqz v0, :cond_b

    .line 2927
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 2928
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v0

    const-string/jumbo v1, "url"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2930
    iget-object v1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v1}, Lio/branch/referral/Branch;->access$1900(Lio/branch/referral/Branch;)Ljava/util/Map;

    move-result-object v1

    iget-object v3, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    check-cast v3, Lio/branch/referral/ServerRequestCreateUrl;

    invoke-virtual {v3}, Lio/branch/referral/ServerRequestCreateUrl;->getLinkPost()Lio/branch/referral/BranchLinkData;

    move-result-object v3

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 2934
    :cond_b
    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    instance-of v0, v0, Lio/branch/referral/ServerRequestLogout;

    if-eqz v0, :cond_c

    .line 2935
    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v0}, Lio/branch/referral/Branch;->access$1900(Lio/branch/referral/Branch;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 2936
    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v0}, Lio/branch/referral/Branch;->access$200(Lio/branch/referral/Branch;)Lio/branch/referral/ServerRequestQueue;

    move-result-object v0

    invoke-virtual {v0}, Lio/branch/referral/ServerRequestQueue;->clear()V

    .line 2938
    :cond_c
    :goto_4
    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v0}, Lio/branch/referral/Branch;->access$200(Lio/branch/referral/Branch;)Lio/branch/referral/ServerRequestQueue;

    move-result-object v0

    invoke-virtual {v0}, Lio/branch/referral/ServerRequestQueue;->dequeue()Lio/branch/referral/ServerRequest;

    .line 2941
    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    instance-of v0, v0, Lio/branch/referral/ServerRequestInitSession;

    if-nez v0, :cond_e

    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    instance-of v0, v0, Lio/branch/referral/ServerRequestIdentifyUserRequest;

    if-eqz v0, :cond_d

    goto :goto_5

    .line 2998
    :cond_d
    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-static {}, Lio/branch/referral/Branch;->access$2100()Lio/branch/referral/Branch;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lio/branch/referral/ServerRequest;->onRequestSucceeded(Lio/branch/referral/ServerResponse;Lio/branch/referral/Branch;)V

    goto/16 :goto_8

    .line 2944
    :cond_e
    :goto_5
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_18

    .line 2947
    iget-object v1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-virtual {v1}, Lio/branch/referral/Branch;->isTrackingDisabled()Z

    move-result v1

    if-nez v1, :cond_11

    .line 2948
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->SessionID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 2949
    iget-object v1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v1}, Lio/branch/referral/Branch;->access$100(Lio/branch/referral/Branch;)Lio/branch/referral/PrefHelper;

    move-result-object v1

    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->SessionID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/branch/referral/PrefHelper;->setSessionID(Ljava/lang/String;)V

    move v1, v2

    goto :goto_6

    :cond_f
    move v1, v4

    .line 2952
    :goto_6
    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->IdentityID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_10

    .line 2953
    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->IdentityID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2954
    iget-object v5, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v5}, Lio/branch/referral/Branch;->access$100(Lio/branch/referral/Branch;)Lio/branch/referral/PrefHelper;

    move-result-object v5

    invoke-virtual {v5}, Lio/branch/referral/PrefHelper;->getIdentityID()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    .line 2956
    iget-object v1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v1}, Lio/branch/referral/Branch;->access$1900(Lio/branch/referral/Branch;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 2957
    iget-object v1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v1}, Lio/branch/referral/Branch;->access$100(Lio/branch/referral/Branch;)Lio/branch/referral/PrefHelper;

    move-result-object v1

    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->IdentityID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/branch/referral/PrefHelper;->setIdentityID(Ljava/lang/String;)V

    move v1, v2

    .line 2961
    :cond_10
    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->DeviceFingerprintID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_12

    .line 2962
    iget-object v1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v1}, Lio/branch/referral/Branch;->access$100(Lio/branch/referral/Branch;)Lio/branch/referral/PrefHelper;

    move-result-object v1

    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->DeviceFingerprintID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/branch/referral/PrefHelper;->setDeviceFingerPrintID(Ljava/lang/String;)V

    move v1, v2

    goto :goto_7

    :cond_11
    move v1, v4

    :cond_12
    :goto_7
    if-eqz v1, :cond_13

    .line 2968
    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {v0}, Lio/branch/referral/Branch;->access$2000(Lio/branch/referral/Branch;)V

    .line 2971
    :cond_13
    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    instance-of v0, v0, Lio/branch/referral/ServerRequestInitSession;

    if-eqz v0, :cond_17

    .line 2972
    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    sget-object v1, Lio/branch/referral/Branch$SESSION_STATE;->INITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    invoke-static {v0, v1}, Lio/branch/referral/Branch;->access$802(Lio/branch/referral/Branch;Lio/branch/referral/Branch$SESSION_STATE;)Lio/branch/referral/Branch$SESSION_STATE;

    .line 2973
    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-static {}, Lio/branch/referral/Branch;->access$2100()Lio/branch/referral/Branch;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lio/branch/referral/ServerRequest;->onRequestSucceeded(Lio/branch/referral/ServerResponse;Lio/branch/referral/Branch;)V

    .line 2974
    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    iget-boolean v0, v0, Lio/branch/referral/Branch;->isInitReportedThroughCallBack:Z

    if-nez v0, :cond_14

    .line 2975
    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    check-cast v0, Lio/branch/referral/ServerRequestInitSession;

    invoke-virtual {v0, p1}, Lio/branch/referral/ServerRequestInitSession;->handleBranchViewIfAvailable(Lio/branch/referral/ServerResponse;)Z

    move-result p1

    if-nez p1, :cond_14

    .line 2976
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1}, Lio/branch/referral/Branch;->access$2200(Lio/branch/referral/Branch;)V

    .line 2980
    :cond_14
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    check-cast p1, Lio/branch/referral/ServerRequestInitSession;

    invoke-virtual {p1}, Lio/branch/referral/ServerRequestInitSession;->hasCallBack()Z

    move-result p1

    if-eqz p1, :cond_15

    .line 2981
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    iput-boolean v2, p1, Lio/branch/referral/Branch;->isInitReportedThroughCallBack:Z

    .line 2984
    :cond_15
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1}, Lio/branch/referral/Branch;->access$2300(Lio/branch/referral/Branch;)Ljava/util/concurrent/CountDownLatch;

    move-result-object p1

    if-eqz p1, :cond_16

    .line 2985
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1}, Lio/branch/referral/Branch;->access$2300(Lio/branch/referral/Branch;)Ljava/util/concurrent/CountDownLatch;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 2988
    :cond_16
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1}, Lio/branch/referral/Branch;->access$2400(Lio/branch/referral/Branch;)Ljava/util/concurrent/CountDownLatch;

    move-result-object p1

    if-eqz p1, :cond_18

    .line 2989
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1}, Lio/branch/referral/Branch;->access$2400(Lio/branch/referral/Branch;)Ljava/util/concurrent/CountDownLatch;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_8

    .line 2993
    :cond_17
    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-static {}, Lio/branch/referral/Branch;->access$2100()Lio/branch/referral/Branch;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lio/branch/referral/ServerRequest;->onRequestSucceeded(Lio/branch/referral/ServerResponse;Lio/branch/referral/Branch;)V

    .line 3002
    :cond_18
    :goto_8
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1, v4}, Lio/branch/referral/Branch;->access$1802(Lio/branch/referral/Branch;I)I

    .line 3003
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1}, Lio/branch/referral/Branch;->access$1600(Lio/branch/referral/Branch;)Z

    move-result p1

    if-eqz p1, :cond_19

    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1}, Lio/branch/referral/Branch;->access$800(Lio/branch/referral/Branch;)Lio/branch/referral/Branch$SESSION_STATE;

    move-result-object p1

    sget-object v0, Lio/branch/referral/Branch$SESSION_STATE;->UNINITIALISED:Lio/branch/referral/Branch$SESSION_STATE;

    if-eq p1, v0, :cond_19

    .line 3004
    iget-object p1, p0, Lio/branch/referral/Branch$BranchPostTask;->this$0:Lio/branch/referral/Branch;

    invoke-static {p1}, Lio/branch/referral/Branch;->access$300(Lio/branch/referral/Branch;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_9

    :catch_0
    move-exception p1

    .line 3007
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :cond_19
    :goto_9
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 2835
    check-cast p1, Lio/branch/referral/ServerResponse;

    invoke-virtual {p0, p1}, Lio/branch/referral/Branch$BranchPostTask;->onPostExecute(Lio/branch/referral/ServerResponse;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 1

    .line 2844
    invoke-super {p0}, Lio/branch/referral/BranchAsyncTask;->onPreExecute()V

    .line 2845
    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-virtual {v0}, Lio/branch/referral/ServerRequest;->onPreExecute()V

    .line 2846
    iget-object v0, p0, Lio/branch/referral/Branch$BranchPostTask;->thisReq_:Lio/branch/referral/ServerRequest;

    invoke-virtual {v0}, Lio/branch/referral/ServerRequest;->doFinalUpdateOnMainThread()V

    return-void
.end method
