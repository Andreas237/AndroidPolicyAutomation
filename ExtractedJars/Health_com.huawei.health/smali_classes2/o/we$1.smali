.class Lo/we$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/volley/Response$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/we;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/util/Map;Lo/wo;Landroid/os/Bundle;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/android/volley/Response$Listener<Lorg/json/JSONObject;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Landroid/os/Bundle;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Lo/wo;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lo/we;

.field final synthetic h:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lo/we;Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Lo/wo;Landroid/os/Bundle;Lorg/json/JSONObject;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lo/we$1;->f:Lo/we;

    iput-object p2, p0, Lo/we$1;->c:Landroid/content/Context;

    iput-object p3, p0, Lo/we$1;->e:Ljava/lang/String;

    iput-object p4, p0, Lo/we$1;->a:Ljava/util/Map;

    iput-object p5, p0, Lo/we$1;->d:Lo/wo;

    iput-object p6, p0, Lo/we$1;->b:Landroid/os/Bundle;

    iput-object p7, p0, Lo/we$1;->h:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lorg/json/JSONObject;)V
    .locals 5

    .line 150
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    const-string v0, "resultCode"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 151
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    const-string v0, "resultCode"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 153
    const/16 v0, 0x3f8

    if-ne v0, v4, :cond_1

    .line 154
    iget-object v0, p0, Lo/we$1;->c:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 155
    iget-object v0, p0, Lo/we$1;->f:Lo/we;

    iget-object v1, p0, Lo/we$1;->c:Landroid/content/Context;

    iget-object v2, p0, Lo/we$1;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_sns_version_low:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/we;->c(Lo/we;Landroid/content/Context;Ljava/lang/String;I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    :cond_0
    return-void

    .line 163
    :cond_1
    goto :goto_0

    .line 160
    :catch_0
    move-exception v4

    .line 161
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    :goto_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 166
    new-instance v0, Lo/we$1$2;

    invoke-direct {v0, p0, p1}, Lo/we$1$2;-><init>(Lo/we$1;Lorg/json/JSONObject;)V

    .line 171
    invoke-virtual {v0}, Lo/we$1$2;->start()V

    goto :goto_1

    .line 173
    :cond_2
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Jsonresponse is null ! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    :goto_1
    return-void
.end method

.method public synthetic onResponse(Ljava/lang/Object;)V
    .locals 1

    .line 143
    move-object v0, p1

    check-cast v0, Lorg/json/JSONObject;

    invoke-virtual {p0, v0}, Lo/we$1;->e(Lorg/json/JSONObject;)V

    return-void
.end method
