.class Lio/branch/indexing/ContentDiscoverer$1;
.super Ljava/lang/Object;
.source "ContentDiscoverer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/indexing/ContentDiscoverer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/branch/indexing/ContentDiscoverer;


# direct methods
.method constructor <init>(Lio/branch/indexing/ContentDiscoverer;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 145
    :try_start_0
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v0}, Lio/branch/indexing/ContentDiscoverer;->access$008(Lio/branch/indexing/ContentDiscoverer;)I

    .line 146
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v0}, Lio/branch/indexing/ContentDiscoverer;->access$100(Lio/branch/indexing/ContentDiscoverer;)Lio/branch/indexing/ContentDiscoveryManifest;

    move-result-object v0

    invoke-virtual {v0}, Lio/branch/indexing/ContentDiscoveryManifest;->isCDEnabled()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v0}, Lio/branch/indexing/ContentDiscoverer;->access$200(Lio/branch/indexing/ContentDiscoverer;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v0}, Lio/branch/indexing/ContentDiscoverer;->access$200(Lio/branch/indexing/ContentDiscoverer;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 147
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v0}, Lio/branch/indexing/ContentDiscoverer;->access$200(Lio/branch/indexing/ContentDiscoverer;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 148
    iget-object v1, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v1, v2}, Lio/branch/indexing/ContentDiscoverer;->access$302(Lio/branch/indexing/ContentDiscoverer;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 149
    iget-object v1, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v1}, Lio/branch/indexing/ContentDiscoverer;->access$300(Lio/branch/indexing/ContentDiscoverer;)Lorg/json/JSONObject;

    move-result-object v1

    const-string/jumbo v2, "ts"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 150
    iget-object v1, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v1}, Lio/branch/indexing/ContentDiscoverer;->access$400(Lio/branch/indexing/ContentDiscoverer;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 151
    iget-object v1, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v1}, Lio/branch/indexing/ContentDiscoverer;->access$300(Lio/branch/indexing/ContentDiscoverer;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "rl"

    iget-object v3, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v3}, Lio/branch/indexing/ContentDiscoverer;->access$400(Lio/branch/indexing/ContentDiscoverer;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 153
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 154
    iget-object v1, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v1}, Lio/branch/indexing/ContentDiscoverer;->access$300(Lio/branch/indexing/ContentDiscoverer;)Lorg/json/JSONObject;

    move-result-object v1

    const-string/jumbo v2, "v"

    invoke-virtual {v1, v2, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const v1, 0x1020002

    .line 156
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_6

    .line 159
    iget-object v2, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v2}, Lio/branch/indexing/ContentDiscoverer;->access$100(Lio/branch/indexing/ContentDiscoverer;)Lio/branch/indexing/ContentDiscoveryManifest;

    move-result-object v2

    invoke-virtual {v2, v0}, Lio/branch/indexing/ContentDiscoveryManifest;->getCDPathProperties(Landroid/app/Activity;)Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    .line 160
    invoke-virtual {v2}, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->isClearTextRequested()Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v3

    goto :goto_0

    :cond_1
    move v5, v4

    :goto_0
    const/4 v6, 0x0

    if-eqz v2, :cond_3

    .line 163
    invoke-virtual {v2}, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->isClearTextRequested()Z

    move-result v5

    .line 164
    iget-object v6, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v6}, Lio/branch/indexing/ContentDiscoverer;->access$300(Lio/branch/indexing/ContentDiscoverer;)Lorg/json/JSONObject;

    move-result-object v6

    const-string v8, "h"

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    invoke-virtual {v6, v8, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 165
    invoke-virtual {v2}, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->getFilteredElements()Lorg/json/JSONArray;

    move-result-object v2

    move-object v8, v2

    move v6, v5

    goto :goto_2

    :cond_3
    move-object v8, v6

    move v6, v5

    :goto_2
    if-eqz v8, :cond_4

    .line 167
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-lez v2, :cond_4

    .line 168
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 169
    iget-object v1, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v1}, Lio/branch/indexing/ContentDiscoverer;->access$300(Lio/branch/indexing/ContentDiscoverer;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "ck"

    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 170
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 171
    iget-object v1, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v1}, Lio/branch/indexing/ContentDiscoverer;->access$300(Lio/branch/indexing/ContentDiscoverer;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "cd"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 172
    iget-object v1, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    move-object v2, v8

    move-object v5, v0

    invoke-static/range {v1 .. v6}, Lio/branch/indexing/ContentDiscoverer;->access$500(Lio/branch/indexing/ContentDiscoverer;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Landroid/app/Activity;Z)V

    goto :goto_3

    .line 174
    :cond_4
    iget-object v2, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v2}, Lio/branch/indexing/ContentDiscoverer;->access$600(Lio/branch/indexing/ContentDiscoverer;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 175
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 176
    iget-object v3, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v3}, Lio/branch/indexing/ContentDiscoverer;->access$300(Lio/branch/indexing/ContentDiscoverer;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "ck"

    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 177
    iget-object v3, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-static {v3, v1, v2, v4}, Lio/branch/indexing/ContentDiscoverer;->access$700(Lio/branch/indexing/ContentDiscoverer;Landroid/view/ViewGroup;Lorg/json/JSONArray;Landroid/content/res/Resources;)V

    .line 180
    :cond_5
    :goto_3
    iget-object v1, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v1}, Lio/branch/indexing/ContentDiscoverer;->access$600(Lio/branch/indexing/ContentDiscoverer;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    invoke-static {v0}, Lio/branch/referral/PrefHelper;->getInstance(Landroid/content/Context;)Lio/branch/referral/PrefHelper;

    move-result-object v1

    iget-object v2, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v2}, Lio/branch/indexing/ContentDiscoverer;->access$300(Lio/branch/indexing/ContentDiscoverer;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/branch/referral/PrefHelper;->saveBranchAnalyticsData(Lorg/json/JSONObject;)V

    .line 184
    iget-object v1, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v1}, Lio/branch/indexing/ContentDiscoverer;->access$100(Lio/branch/indexing/ContentDiscoverer;)Lio/branch/indexing/ContentDiscoveryManifest;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/branch/indexing/ContentDiscoveryManifest;->getCDPathProperties(Landroid/app/Activity;)Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;

    move-result-object v1

    invoke-virtual {v1}, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->getDiscoveryRepeatInterval()I

    move-result v1

    .line 185
    iget-object v2, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    iget-object v3, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v3}, Lio/branch/indexing/ContentDiscoverer;->access$100(Lio/branch/indexing/ContentDiscoverer;)Lio/branch/indexing/ContentDiscoveryManifest;

    move-result-object v3

    invoke-virtual {v3, v0}, Lio/branch/indexing/ContentDiscoveryManifest;->getCDPathProperties(Landroid/app/Activity;)Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;

    move-result-object v0

    invoke-virtual {v0}, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->getMaxDiscoveryRepeatNumber()I

    move-result v0

    invoke-static {v2, v0}, Lio/branch/indexing/ContentDiscoverer;->access$802(Lio/branch/indexing/ContentDiscoverer;I)I

    .line 186
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v0}, Lio/branch/indexing/ContentDiscoverer;->access$000(Lio/branch/indexing/ContentDiscoverer;)I

    move-result v0

    iget-object v2, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v2}, Lio/branch/indexing/ContentDiscoverer;->access$800(Lio/branch/indexing/ContentDiscoverer;)I

    move-result v2

    if-ge v0, v2, :cond_6

    const/16 v0, 0x1f4

    if-lt v1, v0, :cond_6

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_6

    .line 187
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v0}, Lio/branch/indexing/ContentDiscoverer;->access$1000(Lio/branch/indexing/ContentDiscoverer;)Landroid/os/Handler;

    move-result-object v0

    iget-object v2, p0, Lio/branch/indexing/ContentDiscoverer$1;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v2}, Lio/branch/indexing/ContentDiscoverer;->access$900(Lio/branch/indexing/ContentDiscoverer;)Ljava/lang/Runnable;

    move-result-object v2

    int-to-long v3, v1

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_6
    return-void
.end method
