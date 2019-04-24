.class public Lo/cks;
.super Ljava/lang/Object;

# interfaces
.implements Lo/ckx;


# instance fields
.field private c:Z

.field private d:Lo/ckh;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;ZLo/ckh;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/cks;->e:Landroid/content/Context;

    iput-boolean p2, p0, Lo/cks;->c:Z

    iput-object p3, p0, Lo/cks;->d:Lo/ckh;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    iget-boolean v0, p0, Lo/cks;->c:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lo/cks;->d:Lo/ckh;

    if-eqz v0, :cond_3

    const-string v0, "HiAnalytics"

    const-string v1, "data send failed, write to cache file..."

    invoke-static {v0, v1}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lo/cks;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cjn;->d(Landroid/content/Context;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lo/cke;->c(Lorg/json/JSONObject;)[Lo/cke;

    move-result-object v5

    iget-object v0, p0, Lo/cks;->d:Lo/ckh;

    invoke-virtual {v0}, Lo/ckh;->a()[Lo/cke;

    move-result-object v6

    array-length v0, v5

    array-length v1, v6

    add-int/2addr v0, v1

    new-array v7, v0, [Lo/cke;

    array-length v0, v5

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v5, v1, v7, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v6

    array-length v1, v5

    add-int/2addr v0, v1

    const/16 v1, 0xbb8

    if-le v0, v1, :cond_0

    array-length v0, v5

    rsub-int v8, v0, 0xbb8

    goto :goto_0

    :cond_0
    array-length v8, v6

    :goto_0
    array-length v0, v5

    const/4 v1, 0x0

    invoke-static {v6, v1, v7, v0, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v7

    if-lez v0, :cond_3

    array-length v0, v7

    const/16 v1, 0xbb8

    if-gt v0, v1, :cond_1

    const/4 v9, 0x0

    goto :goto_1

    :cond_1
    array-length v0, v7

    add-int/lit16 v9, v0, -0xbb8

    :goto_1
    const-string v0, "EventSendResultHandleTask"

    const-string v1, "total size: %d event size to save: %d, start index: %d"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    array-length v3, v7

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    array-length v3, v7

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/ciy;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v10, Lorg/json/JSONArray;

    invoke-direct {v10}, Lorg/json/JSONArray;-><init>()V

    move v11, v9

    :goto_2
    array-length v0, v7

    if-ge v11, v0, :cond_2

    new-instance v12, Lo/cke;

    invoke-direct {v12}, Lo/cke;-><init>()V

    aget-object v0, v7, v11

    invoke-virtual {v0, v12}, Lo/cke;->b(Lo/ckc;)V

    invoke-virtual {v12}, Lo/cke;->d()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v10, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_2
    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "events"

    :try_start_0
    invoke-virtual {v11, v0, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lo/cks;->e:Landroid/content/Context;

    const-string v1, "cached_v2"

    invoke-static {v0, v11, v1}, Lo/cjv;->a(Landroid/content/Context;Lorg/json/JSONObject;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v12

    const-string v0, "EventSendResultHandleTask"

    const-string v1, "run(): JSONException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_3
    return-void
.end method
