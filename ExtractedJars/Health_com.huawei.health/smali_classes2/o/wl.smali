.class public Lo/wl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 48
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/wl;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Lorg/json/JSONObject;)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lorg/json/JSONObject;)Ljava/util/ArrayList<Lcom/huawei/bone/social/manager/db/AssistentTable;>;"
        }
    .end annotation

    .line 314
    sget-object v4, Lo/wl;->e:Ljava/lang/Object;

    monitor-enter v4

    .line 315
    :try_start_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 317
    const/4 v0, 0x0

    if-eq v0, p1, :cond_5

    .line 318
    const-string v0, "resultCode"

    :try_start_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x5208

    if-ne v0, v1, :cond_5

    .line 319
    const/4 v6, 0x0

    .line 320
    const-string v0, "nonFriendsResponseList"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 321
    const-string v0, "nonFriendsResponseList"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 324
    :cond_0
    const/4 v8, 0x0

    .line 325
    const/4 v0, 0x0

    if-eq v0, v6, :cond_5

    .line 326
    const/4 v9, 0x0

    :goto_0
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_5

    .line 327
    new-instance v7, Lcom/huawei/bone/social/manager/db/AssistentTable;

    invoke-direct {v7}, Lcom/huawei/bone/social/manager/db/AssistentTable;-><init>()V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 329
    :try_start_2
    invoke-virtual {v6, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    .line 330
    const-string v0, "huid"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 331
    const-string v0, "huid"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/bone/social/manager/db/AssistentTable;->saveHuId(J)V

    .line 333
    :cond_1
    const-string v0, "portraitUrl"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 334
    const-string v0, "portraitUrl"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/bone/social/manager/db/AssistentTable;->saveImgUrl(Ljava/lang/String;)V

    .line 337
    :cond_2
    const-string v0, "momentBgUrl"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 338
    const-string v0, "momentBgUrl"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/bone/social/manager/db/AssistentTable;->saveBgImgUrl(Ljava/lang/String;)V

    .line 341
    :cond_3
    const-string v0, "name"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 342
    const-string v0, "name"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/bone/social/manager/db/AssistentTable;->saveName(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 349
    :cond_4
    goto :goto_1

    .line 345
    :catch_0
    move-exception v10

    .line 346
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ERROR getAssisentInfo "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    goto :goto_1

    .line 347
    :catch_1
    move-exception v10

    .line 348
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ERROR getAssisentInfo "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    :goto_1
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 326
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 357
    :cond_5
    goto :goto_2

    .line 355
    :catch_2
    move-exception v6

    .line 356
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 358
    :goto_2
    monitor-exit v4

    return-object v5

    .line 359
    :catchall_0
    move-exception v11

    monitor-exit v4

    throw v11
.end method

.method public static a(Lorg/json/JSONObject;)Lo/wg;
    .locals 7

    .line 561
    new-instance v4, Lo/wg;

    invoke-direct {v4}, Lo/wg;-><init>()V

    .line 562
    if-eqz p0, :cond_2

    .line 564
    const-string v0, "resultCode"

    :try_start_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "resultCode"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x5208

    if-ne v0, v1, :cond_1

    .line 565
    const-string v0, "userUpdateCount"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 566
    const-string v0, "momentCount"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 567
    const-string v0, "momentCount"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 568
    invoke-virtual {v4, v6}, Lo/wg;->e(I)V

    .line 570
    :cond_0
    const-string v0, "pendingCount"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 571
    const-string v0, "pendingCount"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 572
    invoke-virtual {v4, v6}, Lo/wg;->b(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 577
    :cond_1
    goto :goto_0

    .line 575
    :catch_0
    move-exception v5

    .line 576
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 579
    :cond_2
    :goto_0
    return-object v4
.end method

.method public static a(Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 6

    .line 52
    const-string v0, "LoginSNSRsp"

    :try_start_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 53
    const-string v0, "digestKey"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 55
    const-string v0, "digestKey"

    invoke-static {p1, v0, v5}, Lo/xt;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    goto :goto_0

    .line 56
    :catch_0
    move-exception v4

    .line 57
    const-string v0, "ERROR:"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    :goto_0
    return-void
.end method

.method public static a(Ljava/util/ArrayList;Landroid/content/Context;Lorg/json/JSONObject;)[Landroid/content/ContentValues;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/wp;>;Landroid/content/Context;Lorg/json/JSONObject;)[Landroid/content/ContentValues;"
        }
    .end annotation

    .line 812
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 815
    :try_start_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 817
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    .line 818
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/wp;

    .line 819
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    .line 821
    const-string v0, "actId"

    invoke-virtual {v6}, Lo/wp;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 822
    const-string v0, "type"

    sget-object v1, Lo/xx$c;->d:Lo/xx$c;

    invoke-virtual {v1}, Lo/xx$c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 824
    const-string v0, "value"

    .line 825
    invoke-virtual {v6}, Lo/wp;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/xp;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 824
    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 827
    invoke-virtual {v6}, Lo/wp;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    .line 829
    const-string v0, "postedon"

    invoke-virtual {v7, v0, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 830
    const-string v0, "postedby"

    invoke-virtual {v6}, Lo/wp;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 831
    const-string v0, "location"

    invoke-virtual {v6}, Lo/wp;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 833
    invoke-virtual {v6}, Lo/wp;->a()Ljava/util/HashMap;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v6}, Lo/wp;->a()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 834
    invoke-virtual {v6}, Lo/wp;->a()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/Map$Entry;

    .line 836
    new-instance v11, Landroid/content/ContentValues;

    invoke-direct {v11}, Landroid/content/ContentValues;-><init>()V

    .line 837
    const-string v0, "actId"

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 838
    const-string v0, "actParentId"

    invoke-virtual {v6}, Lo/wp;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 839
    const-string v0, "type"

    sget-object v1, Lo/xx$c;->e:Lo/xx$c;

    invoke-virtual {v1}, Lo/xx$c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 840
    const-string v0, "value"

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 841
    const-string v0, "location"

    invoke-virtual {v6}, Lo/wp;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 842
    const-string v0, "postedon"

    invoke-virtual {v11, v0, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 843
    const-string v0, "postedby"

    invoke-virtual {v6}, Lo/wp;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 846
    const-string v0, "dirty"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 848
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 849
    goto/16 :goto_1

    .line 852
    :cond_0
    const-string v0, "dirty"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 854
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 817
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 858
    :cond_1
    const/4 v5, 0x0

    .line 859
    const/4 v6, 0x0

    .line 862
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 864
    const-string v0, "eventsList"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 865
    const-string v0, "eventsList"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    .line 866
    const/4 v9, 0x0

    :goto_2
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_11

    .line 867
    invoke-virtual {v7, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    .line 868
    new-instance v11, Landroid/content/ContentValues;

    invoke-direct {v11}, Landroid/content/ContentValues;-><init>()V

    .line 869
    const-string v0, "eventId"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 870
    const-string v0, "actId"

    const-string v1, "eventId"

    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 872
    :cond_2
    const-string v0, "momentId"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 873
    const-string v0, "actParentId"

    const-string v1, "momentId"

    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 875
    :cond_3
    const-string v0, "type"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 876
    const-string v0, "type"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/xx$c;->c:Lo/xx$c;

    invoke-virtual {v1}, Lo/xx$c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 877
    const/4 v5, 0x1

    goto :goto_3

    .line 878
    :cond_4
    const-string v0, "type"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/xx$c;->a:Lo/xx$c;

    invoke-virtual {v1}, Lo/xx$c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "type"

    .line 879
    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/xx$c;->k:Lo/xx$c;

    invoke-virtual {v1}, Lo/xx$c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 880
    :cond_5
    const/4 v6, 0x1

    .line 882
    :cond_6
    :goto_3
    const-string v0, "type"

    const-string v1, "type"

    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 884
    :cond_7
    const-string v0, "value"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 885
    if-eqz v5, :cond_8

    .line 886
    const-string v0, "value"

    const-string v1, "value"

    .line 887
    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/xp;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 886
    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 889
    :cond_8
    const-string v0, "value"

    const-string v1, "value"

    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 894
    :cond_9
    :goto_4
    const/4 v5, 0x0

    .line 896
    const-string v0, "location"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 897
    const-string v0, "location"

    const-string v1, "location"

    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 899
    :cond_a
    const-string v0, "postedOn"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 900
    const-string v0, "postedOn"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 902
    const-string v0, "postedon"

    invoke-virtual {v11, v0, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 904
    :cond_b
    const-string v0, "postedBy"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 905
    const-string v0, "postedby"

    const-string v1, "postedBy"

    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 909
    :cond_c
    const-string v0, "dirty"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 911
    if-eqz v6, :cond_10

    .line 913
    const/4 v6, 0x0

    .line 915
    const-string v0, "momentId"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/util/Set;

    .line 916
    const/4 v0, 0x0

    if-ne v0, v12, :cond_e

    .line 917
    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12}, Ljava/util/HashSet;-><init>()V

    .line 918
    const-string v0, "postedBy"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 919
    const-string v0, "momentId"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v8, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 922
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "actParentId=? AND postedby=?  AND (type=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/xx$c;->a:Lo/xx$c;

    .line 924
    invoke-virtual {v1}, Lo/xx$c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' OR "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/xx$c;->k:Lo/xx$c;

    .line 925
    invoke-virtual {v1}, Lo/xx$c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 927
    const/4 v0, 0x2

    new-array v14, v0, [Ljava/lang/String;

    const-string v0, "momentId"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v14, v1

    const-string v0, "postedBy"

    .line 928
    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v14, v1

    .line 929
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/wk;->i:Landroid/net/Uri;

    .line 930
    invoke-virtual {v0, v1, v13, v14}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 931
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/wk;->p:Landroid/net/Uri;

    .line 932
    invoke-virtual {v0, v1, v13, v14}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 934
    sget-object v0, Lo/xx$c;->a:Lo/xx$c;

    invoke-virtual {v0}, Lo/xx$c;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 935
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 940
    :cond_d
    goto/16 :goto_5

    :cond_e
    const-string v0, "postedBy"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    .line 942
    const-string v0, "postedBy"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 945
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "actParentId=? AND postedby=?  AND (type=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/xx$c;->a:Lo/xx$c;

    .line 947
    invoke-virtual {v1}, Lo/xx$c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' OR "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/xx$c;->k:Lo/xx$c;

    .line 948
    invoke-virtual {v1}, Lo/xx$c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 950
    const/4 v0, 0x2

    new-array v14, v0, [Ljava/lang/String;

    const-string v0, "momentId"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v14, v1

    const-string v0, "postedBy"

    .line 951
    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v14, v1

    .line 952
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/wk;->i:Landroid/net/Uri;

    .line 953
    invoke-virtual {v0, v1, v13, v14}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 954
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/wk;->p:Landroid/net/Uri;

    .line 955
    invoke-virtual {v0, v1, v13, v14}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 957
    sget-object v0, Lo/xx$c;->a:Lo/xx$c;

    invoke-virtual {v0}, Lo/xx$c;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 958
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 967
    :cond_f
    :goto_5
    goto :goto_6

    .line 968
    :cond_10
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 866
    :goto_6
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_2

    .line 974
    :cond_11
    goto :goto_7

    .line 972
    :catch_0
    move-exception v4

    .line 973
    const/4 v0, 0x0

    return-object v0

    .line 975
    :goto_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v4, v0, [Landroid/content/ContentValues;

    .line 976
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/content/ContentValues;

    return-object v0
.end method

.method public static b(Landroid/content/Context;Lorg/json/JSONObject;)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lorg/json/JSONObject;)Ljava/util/ArrayList<Lo/xf;>;"
        }
    .end annotation

    .line 365
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 367
    const/4 v0, 0x0

    if-eq v0, p1, :cond_25

    .line 368
    const-string v0, "resultCode"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_25

    .line 369
    const-string v0, "resultCode"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 370
    const/16 v0, 0x5208

    if-eq v5, v0, :cond_0

    const/16 v0, 0x521c

    if-ne v5, v0, :cond_25

    .line 372
    :cond_0
    const/4 v6, 0x0

    .line 373
    const/4 v7, 0x0

    .line 374
    const-string v0, "user"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 375
    const-string v0, "user"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 377
    :cond_1
    const-string v0, "userFriend"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 378
    const-string v0, "userFriend"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    .line 382
    :cond_2
    new-instance v8, Lo/xf;

    invoke-direct {v8}, Lo/xf;-><init>()V

    .line 383
    const/4 v0, 0x0

    if-eq v0, v6, :cond_12

    .line 384
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "========== null != myProfileObject"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 385
    const-string v0, "huid"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 386
    const-string v0, "huid"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/xf;->b(J)V

    .line 389
    :cond_3
    const-string v0, "likeCount"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 390
    const-string v0, "likeCount"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->f(I)V

    .line 393
    :cond_4
    const-string v0, "portraitUrl"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 394
    const-string v0, "portraitUrl"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->b(Ljava/lang/String;)V

    .line 397
    :cond_5
    const-string v0, "momentBgUrl"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 398
    const-string v0, "momentBgUrl"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->a(Ljava/lang/String;)V

    .line 401
    :cond_6
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/wr;->h(Ljava/lang/String;)Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;

    move-result-object v9

    .line 403
    const/4 v0, 0x0

    if-ne v0, v9, :cond_7

    .line 404
    new-instance v9, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;

    invoke-direct {v9}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;-><init>()V

    .line 410
    :cond_7
    invoke-virtual {v9}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireRelationShipStatus()I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {v8, v0}, Lo/xf;->e(S)V

    .line 411
    invoke-virtual {v9}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireNotifiedSide()I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->a(I)V

    .line 412
    invoke-virtual {v9}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireNote()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->h(Ljava/lang/String;)V

    .line 413
    const-string v0, "status"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 414
    const-string v0, "status"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xp;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 416
    :cond_8
    const-string v0, ""

    invoke-virtual {v8, v0}, Lo/xf;->d(Ljava/lang/String;)V

    .line 420
    :goto_0
    const-string v0, "hobbies"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 421
    const-string v0, "hobbies"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/xf;->e(J)V

    .line 423
    :cond_9
    const-string v0, "steps"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 424
    const-string v0, "steps"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->d(I)V

    .line 426
    :cond_a
    sget-object v0, Lo/xx$b;->b:Lo/xx$b;

    invoke-virtual {v0}, Lo/xx$b;->ordinal()I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {v8, v0}, Lo/xf;->d(S)V

    .line 427
    const-string v0, "isLiked"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 428
    const-string v0, "isLiked"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->k(I)V

    .line 430
    :cond_b
    const-string v0, "settings"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 431
    const-string v0, "settings"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-short v0, v0

    int-to-long v0, v0

    invoke-virtual {v8, v0, v1}, Lo/xf;->d(J)V

    .line 434
    :cond_c
    const-string v0, "height"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 435
    const-string v0, "height"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->e(I)V

    .line 437
    :cond_d
    const-string v0, "weight"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 438
    const-string v0, "weight"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->c(I)V

    .line 440
    :cond_e
    const-string v0, "mobile"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 441
    const-string v0, "mobile"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->k(Ljava/lang/String;)V

    .line 443
    :cond_f
    const-string v0, "email"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 444
    const-string v0, "email"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->g(Ljava/lang/String;)V

    .line 446
    :cond_10
    const-string v0, "birthday"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 447
    const-string v0, "birthday"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/wl;->e(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->b(I)V

    .line 450
    :cond_11
    goto :goto_1

    .line 451
    :cond_12
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "========== null == myProfileObject"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    :goto_1
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 457
    const/4 v0, 0x0

    if-eq v0, v7, :cond_24

    .line 458
    const-string v0, "========== null != friendsProfileArray"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    const/4 v9, 0x0

    :goto_2
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_23

    .line 460
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "========== null != friendsProfileArray i:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    new-instance v8, Lo/xf;

    invoke-direct {v8}, Lo/xf;-><init>()V

    .line 462
    invoke-virtual {v7, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    .line 464
    const-string v0, "huid"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 465
    const-string v0, "huid"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/xf;->b(J)V

    .line 466
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "========== null != friendsProfileArray huid:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    :cond_13
    const-string v0, "likeCount"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 469
    const-string v0, "likeCount"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->f(I)V

    .line 472
    :cond_14
    const-string v0, "portraitUrl"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 473
    const-string v0, "portraitUrl"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->b(Ljava/lang/String;)V

    .line 476
    :cond_15
    const-string v0, "momentBgUrl"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 477
    const-string v0, "momentBgUrl"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->a(Ljava/lang/String;)V

    .line 484
    :cond_16
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v10, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/wr;->h(Ljava/lang/String;)Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;

    move-result-object v11

    .line 486
    const/4 v0, 0x0

    if-ne v0, v11, :cond_17

    .line 487
    new-instance v11, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;

    invoke-direct {v11}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;-><init>()V

    .line 494
    :cond_17
    invoke-virtual {v11}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireRelationShipStatus()I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {v8, v0}, Lo/xf;->e(S)V

    .line 495
    invoke-virtual {v11}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireNotifiedSide()I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->a(I)V

    .line 496
    invoke-virtual {v11}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireNote()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->h(Ljava/lang/String;)V

    .line 497
    const-string v0, "status"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 498
    const-string v0, "status"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xp;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->d(Ljava/lang/String;)V

    .line 506
    :cond_18
    const-string v0, "hobbies"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 507
    const-string v0, "hobbies"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/xf;->e(J)V

    .line 509
    :cond_19
    const-string v0, "steps"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 510
    const-string v0, "steps"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->d(I)V

    .line 512
    :cond_1a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8}, Lo/xf;->f()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lo/wf;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 513
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserType:0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    sget-object v0, Lo/xx$b;->b:Lo/xx$b;

    invoke-virtual {v0}, Lo/xx$b;->ordinal()I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {v8, v0}, Lo/xf;->d(S)V

    goto :goto_3

    .line 516
    :cond_1b
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserType:1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 517
    sget-object v0, Lo/xx$b;->e:Lo/xx$b;

    invoke-virtual {v0}, Lo/xx$b;->ordinal()I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {v8, v0}, Lo/xf;->d(S)V

    .line 519
    :goto_3
    const-string v0, "isLiked"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 520
    const-string v0, "isLiked"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->k(I)V

    .line 522
    :cond_1c
    const-string v0, "settings"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 523
    const-string v0, "settings"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-short v0, v0

    int-to-long v0, v0

    invoke-virtual {v8, v0, v1}, Lo/xf;->d(J)V

    .line 525
    :cond_1d
    const-string v0, "weight"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 526
    const-string v0, "weight"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->c(I)V

    .line 528
    :cond_1e
    const-string v0, "mobile"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 529
    const-string v0, "mobile"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->k(Ljava/lang/String;)V

    .line 531
    :cond_1f
    const-string v0, "height"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 532
    const-string v0, "height"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->e(I)V

    .line 534
    :cond_20
    const-string v0, "email"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 535
    const-string v0, "email"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->g(Ljava/lang/String;)V

    .line 537
    :cond_21
    const-string v0, "birthday"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_22

    .line 538
    const-string v0, "birthday"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/wl;->e(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->b(I)V

    .line 541
    :cond_22
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 459
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_2

    :cond_23
    goto :goto_4

    .line 544
    :cond_24
    const-string v0, "========== null == myProfileObject"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 554
    :cond_25
    :goto_4
    goto :goto_5

    .line 550
    :catch_0
    move-exception v5

    .line 551
    const-string v0, "========== socialUserDetails JSONException ERROR:"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 553
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 555
    :goto_5
    return-object v4
.end method

.method public static b(Lorg/json/JSONObject;Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONObject;Landroid/content/Context;)Ljava/util/ArrayList<Lo/wa;>;"
        }
    .end annotation

    .line 91
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 94
    const-string v0, "MatchContactsRsp"

    :try_start_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 95
    const-string v0, "contactInfoList"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 96
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v7, v0, :cond_6

    .line 97
    new-instance v8, Lo/wa;

    invoke-direct {v8}, Lo/wa;-><init>()V

    .line 98
    invoke-virtual {v6, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    .line 99
    const-string v0, "userID"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    const-string v0, "userID"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/wa;->a(J)V

    .line 102
    :cond_0
    const-string v0, "phoneDigest"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 103
    const-string v0, "phoneDigest"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/wa;->b(Ljava/lang/String;)V

    .line 105
    :cond_1
    const-string v0, "needVerify"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 106
    const-string v0, "needVerify"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/wa;->a(I)V

    .line 108
    :cond_2
    const-string v0, "imageURLDownload"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 109
    const-string v0, "imageURLDownload"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/wa;->c(Ljava/lang/String;)V

    .line 111
    :cond_3
    const-string v0, "imageUrl"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 112
    const-string v0, "imageUrl"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/wa;->d(Ljava/lang/String;)V

    .line 114
    :cond_4
    const-string v0, "nickName"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 115
    const-string v0, "nickName"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/wa;->a(Ljava/lang/String;)V

    .line 117
    :cond_5
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 122
    :cond_6
    goto :goto_1

    .line 119
    :catch_0
    move-exception v5

    .line 120
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    :goto_1
    return-object v4
.end method

.method public static b(Lorg/json/JSONObject;)Lo/vz;
    .locals 5

    .line 129
    const-string v0, "FindUserRsp"

    :try_start_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 131
    const-string v0, "findUserInfo"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 132
    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 133
    const-class v0, Lo/vz;

    invoke-virtual {v4, v3, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/vz;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    goto :goto_0

    .line 134
    :catch_0
    move-exception v2

    .line 135
    new-instance v1, Lo/vz;

    invoke-direct {v1}, Lo/vz;-><init>()V

    .line 137
    :goto_0
    return-object v1
.end method

.method public static c(Landroid/content/Context;Lorg/json/JSONObject;)Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lorg/json/JSONObject;)Ljava/util/ArrayList<Lo/xf;>;"
        }
    .end annotation

    .line 143
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 145
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1c

    .line 146
    const-string v0, "resultCode"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x5208

    if-ne v0, v1, :cond_1c

    .line 147
    const/4 v6, 0x0

    .line 148
    const/4 v7, 0x0

    .line 149
    const-string v0, "friendsResponseList"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    const-string v0, "friendsResponseList"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    .line 153
    :cond_0
    const-string v0, "nonFriendsResponseList"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 154
    const-string v0, "nonFriendsResponseList"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 157
    :cond_1
    const/4 v8, 0x0

    .line 158
    const/4 v9, 0x0

    .line 160
    const/4 v0, 0x0

    if-eq v0, v7, :cond_c

    .line 161
    const/4 v10, 0x0

    :goto_0
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v10, v0, :cond_c

    .line 162
    new-instance v8, Lo/xf;

    invoke-direct {v8}, Lo/xf;-><init>()V

    .line 164
    invoke-virtual {v7, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    .line 166
    const-string v0, "huid"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 167
    const-string v0, "huid"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 168
    const-string v0, "huid"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/xf;->b(J)V

    .line 170
    :cond_2
    const-string v0, "likeCount"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 171
    const-string v0, "likeCount"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->f(I)V

    .line 174
    :cond_3
    const-string v0, "momentBgUrl"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 175
    const-string v0, "momentBgUrl"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->a(Ljava/lang/String;)V

    .line 178
    :cond_4
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/wr;->h(Ljava/lang/String;)Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;

    move-result-object v12

    .line 179
    const/4 v0, 0x0

    if-ne v0, v12, :cond_5

    .line 180
    new-instance v12, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;

    invoke-direct {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;-><init>()V

    goto :goto_1

    .line 182
    :cond_5
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "socialUserDetailsByHuid  Huid "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->getHuId()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "relationship "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireRelationShipStatus()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    :goto_1
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "socialUserDetailsByHuid Huid2 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->getHuId()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "relationship "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireRelationShipStatus()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    invoke-virtual {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireRelationShipStatus()I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {v8, v0}, Lo/xf;->e(S)V

    .line 186
    invoke-virtual {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireNotifiedSide()I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->a(I)V

    .line 187
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "socialUserDetailsByHuid note "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireNote()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    invoke-virtual {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireNote()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->h(Ljava/lang/String;)V

    .line 189
    const-string v0, "status"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 190
    const-string v0, "status"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xp;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->d(Ljava/lang/String;)V

    .line 191
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "have status "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "status"

    invoke-virtual {v11, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/xp;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 193
    :cond_6
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no status "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    const-string v0, ""

    invoke-static {v0}, Lo/xp;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->d(Ljava/lang/String;)V

    .line 197
    :goto_2
    const-string v0, "hobbies"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 198
    const-string v0, "hobbies"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/xf;->e(J)V

    .line 200
    :cond_7
    const-string v0, "steps"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 201
    const-string v0, "steps"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->d(I)V

    .line 204
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8}, Lo/xf;->f()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lo/wf;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 205
    sget-object v0, Lo/xx$b;->b:Lo/xx$b;

    invoke-virtual {v0}, Lo/xx$b;->ordinal()I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {v8, v0}, Lo/xf;->d(S)V

    .line 206
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserType:0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 208
    :cond_9
    sget-object v0, Lo/xx$b;->e:Lo/xx$b;

    invoke-virtual {v0}, Lo/xx$b;->ordinal()I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {v8, v0}, Lo/xf;->d(S)V

    .line 209
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserType:1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    :goto_3
    const-string v0, "isLiked"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 212
    const-string v0, "isLiked"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->k(I)V

    .line 214
    :cond_a
    const-string v0, "settings"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 215
    const-string v0, "settings"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-short v0, v0

    int-to-long v0, v0

    invoke-virtual {v8, v0, v1}, Lo/xf;->d(J)V

    .line 217
    :cond_b
    const/4 v0, -0x1

    invoke-virtual {v8, v0}, Lo/xf;->b(S)V

    .line 218
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 221
    :cond_c
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1c

    .line 222
    const/4 v10, 0x0

    :goto_4
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v10, v0, :cond_1c

    .line 223
    new-instance v8, Lo/xf;

    invoke-direct {v8}, Lo/xf;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2

    .line 226
    :try_start_1
    invoke-virtual {v6, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    .line 228
    const-string v0, "huid"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 229
    const-string v0, "huid"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v9, v0

    .line 230
    const-string v0, "huid"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/xf;->b(J)V

    .line 232
    :cond_d
    const-string v0, "likeCount"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 233
    const-string v0, "likeCount"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->f(I)V

    .line 236
    :cond_e
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/wr;->h(Ljava/lang/String;)Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;

    move-result-object v12

    .line 237
    const/4 v0, 0x0

    if-ne v0, v12, :cond_f

    .line 238
    new-instance v12, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;

    invoke-direct {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;-><init>()V

    goto :goto_5

    .line 240
    :cond_f
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "socialUserDetailsByHuid Huid "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->getHuId()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "relationship "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireRelationShipStatus()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    :goto_5
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "socialUserDetailsByHuid Huid2 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->getHuId()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "relationship "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireRelationShipStatus()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    invoke-virtual {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireRelationShipStatus()I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {v8, v0}, Lo/xf;->e(S)V

    .line 244
    invoke-virtual {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireNotifiedSide()I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->a(I)V

    .line 245
    invoke-virtual {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireNote()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->h(Ljava/lang/String;)V

    .line 248
    const-string v0, "momentBgUrl"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 249
    const-string v0, "momentBgUrl"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->a(Ljava/lang/String;)V

    .line 253
    :cond_10
    const-string v0, "status"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 254
    const-string v0, "status"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xp;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->d(Ljava/lang/String;)V

    goto :goto_6

    .line 256
    :cond_11
    const-string v0, ""

    invoke-static {v0}, Lo/xp;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->d(Ljava/lang/String;)V

    .line 259
    :goto_6
    const-string v0, "name"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 260
    const-string v0, "name"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->e(Ljava/lang/String;)V

    goto :goto_7

    .line 262
    :cond_12
    invoke-virtual {v12}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->e(Ljava/lang/String;)V

    .line 264
    :goto_7
    const-string v0, "hobbies"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 265
    const-string v0, "hobbies"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/xf;->e(J)V

    .line 267
    :cond_13
    const-string v0, "steps"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 268
    const-string v0, "steps"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->d(I)V

    .line 270
    :cond_14
    const/4 v0, -0x1

    invoke-virtual {v8, v0}, Lo/xf;->d(S)V

    .line 271
    const-string v0, "isLiked"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 272
    const-string v0, "isLiked"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->k(I)V

    .line 274
    :cond_15
    const-string v0, "settings"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 275
    const-string v0, "settings"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-short v0, v0

    int-to-long v0, v0

    invoke-virtual {v8, v0, v1}, Lo/xf;->d(J)V

    .line 278
    :cond_16
    const-string v0, "height"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 279
    const-string v0, "height"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->e(I)V

    .line 281
    :cond_17
    const-string v0, "weight"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 282
    const-string v0, "weight"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->c(I)V

    .line 284
    :cond_18
    const-string v0, "mobile"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 285
    const-string v0, "mobile"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->k(Ljava/lang/String;)V

    .line 287
    :cond_19
    const-string v0, "email"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 288
    const-string v0, "email"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/xf;->g(Ljava/lang/String;)V

    .line 290
    :cond_1a
    const-string v0, "birthday"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 291
    const-string v0, "birthday"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/wl;->e(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Lo/xf;->b(I)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 297
    :cond_1b
    goto :goto_8

    .line 293
    :catch_0
    move-exception v11

    .line 294
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    goto :goto_8

    .line 295
    :catch_1
    move-exception v11

    .line 296
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    :goto_8
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 222
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_4

    .line 308
    :cond_1c
    goto :goto_9

    .line 306
    :catch_2
    move-exception v6

    .line 307
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    :goto_9
    return-object v5
.end method

.method public static c(Lorg/json/JSONObject;Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONObject;Landroid/content/Context;)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 64
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 66
    const-string v0, "GetUserFrdInfoListRsp"

    :try_start_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 67
    const-string v0, "userFrdInfoList"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    .line 69
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 70
    invoke-virtual {v7, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    .line 71
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseUserFriendList "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "frdUID"

    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    const-string v0, "state"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    const-string v0, "state"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 74
    const/4 v0, 0x0

    if-eq v0, v10, :cond_0

    .line 75
    goto :goto_1

    .line 78
    :cond_0
    const-string v0, "frdUID"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 83
    :cond_1
    goto :goto_2

    .line 81
    :catch_0
    move-exception v6

    .line 82
    const-string v0, "FriendList"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    :goto_2
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseUserFriendList"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    return-object v5
.end method

.method public static c(Lorg/json/JSONObject;)Lo/wb;
    .locals 16

    .line 710
    new-instance v4, Lo/wb;

    invoke-direct {v4}, Lo/wb;-><init>()V

    .line 712
    const-string v0, "GetUserFrdInfoListRsp"

    move-object/from16 v1, p0

    :try_start_0
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 713
    const-string v0, "newVersion"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 714
    invoke-virtual {v4, v6}, Lo/wb;->a(Ljava/lang/String;)V

    .line 715
    const-string v0, "totalNum"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 716
    invoke-virtual {v4, v7}, Lo/wb;->d(I)V

    .line 717
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 718
    const-string v0, "userFrdInfoList"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    .line 719
    const/4 v10, 0x0

    :goto_0
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v10, v0, :cond_7

    .line 720
    invoke-virtual {v9, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    .line 721
    new-instance v12, Lo/wc;

    invoke-direct {v12}, Lo/wc;-><init>()V

    .line 722
    const-string v0, "frdUID"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v13

    .line 723
    invoke-virtual {v12, v13, v14}, Lo/wc;->a(J)V

    .line 724
    const-string v0, "imageURLDownload"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 725
    const-string v0, "imageURLDownload"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 726
    invoke-virtual {v12, v15}, Lo/wc;->a(Ljava/lang/String;)V

    .line 732
    :cond_0
    const-string v0, ""

    invoke-virtual {v12, v0}, Lo/wc;->c(Ljava/lang/String;)V

    .line 734
    const-string v0, "state"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 735
    const-string v0, "state"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v15

    .line 736
    invoke-virtual {v12, v15}, Lo/wc;->e(I)V

    .line 737
    goto :goto_1

    .line 738
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lo/wc;->e(I)V

    .line 741
    :goto_1
    const-string v0, "relation"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 742
    const-string v0, "relation"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v15

    .line 743
    invoke-virtual {v12, v15}, Lo/wc;->d(I)V

    .line 746
    :cond_2
    const-string v0, "siteID"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 747
    const-string v0, "siteID"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v15

    .line 748
    invoke-virtual {v12, v15}, Lo/wc;->a(I)V

    .line 751
    :cond_3
    const-string v0, "setFlags"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 752
    const-string v0, "setFlags"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 753
    invoke-virtual {v12, v15}, Lo/wc;->e(Ljava/lang/String;)V

    .line 756
    :cond_4
    const-string v0, "stickTime"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 757
    const-string v0, "stickTime"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 758
    invoke-virtual {v12, v15}, Lo/wc;->b(Ljava/lang/String;)V

    .line 761
    :cond_5
    const-string v0, "userType"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 762
    const-string v0, "userType"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v15

    .line 763
    invoke-virtual {v12, v15}, Lo/wc;->b(I)V

    .line 766
    :cond_6
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 719
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 768
    :cond_7
    invoke-virtual {v4, v8}, Lo/wb;->a(Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 771
    goto :goto_2

    .line 769
    :catch_0
    move-exception v5

    .line 770
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 772
    :goto_2
    return-object v4
.end method

.method public static d(Landroid/content/Context;Lorg/json/JSONObject;)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lorg/json/JSONObject;)Ljava/util/ArrayList<Lo/xf;>;"
        }
    .end annotation

    .line 620
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 622
    if-eqz p1, :cond_10

    .line 624
    const/4 v5, 0x0

    .line 625
    const-string v0, "frndReqProfilesDetailsList"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 626
    const-string v0, "frndReqProfilesDetailsList"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 629
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_f

    .line 630
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_f

    .line 631
    new-instance v7, Lo/xf;

    invoke-direct {v7}, Lo/xf;-><init>()V

    .line 632
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 634
    const-string v0, "hobbies"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 635
    const-string v0, "hobbies"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/xf;->e(J)V

    .line 637
    :cond_1
    const-string v0, "huid"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 638
    const-string v0, "huid"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/xf;->b(J)V

    .line 640
    :cond_2
    const-string v0, "settings"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 641
    const-string v0, "settings"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/xf;->d(J)V

    .line 643
    :cond_3
    const-string v0, "gender"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 644
    const-string v0, "gender"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {v7, v0}, Lo/xf;->b(S)V

    .line 646
    :cond_4
    const-string v0, "email"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 647
    const-string v0, "email"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/xf;->g(Ljava/lang/String;)V

    .line 649
    :cond_5
    const-string v0, "relationshipStatus"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 650
    const-string v0, "relationshipStatus"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {v7, v0}, Lo/xf;->e(S)V

    .line 652
    :cond_6
    const-string v0, "mobile"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 653
    const-string v0, "mobile"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/xf;->k(Ljava/lang/String;)V

    .line 655
    :cond_7
    const-string v0, "userType"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 656
    const-string v0, "userType"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {v7, v0}, Lo/xf;->d(S)V

    .line 658
    :cond_8
    const-string v0, "portraitUrl"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 659
    const-string v0, "portraitUrl"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/xf;->b(Ljava/lang/String;)V

    .line 661
    :cond_9
    const-string v0, "birthday"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 662
    const-string v0, "birthday"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/wl;->e(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lo/xf;->b(I)V

    .line 664
    :cond_a
    const-string v0, "name"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 665
    const-string v0, "name"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/xf;->e(Ljava/lang/String;)V

    .line 667
    :cond_b
    const-string v0, "message"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 668
    const-string v0, "message"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xp;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/xf;->c(Ljava/lang/String;)V

    .line 670
    :cond_c
    const-string v0, "height"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 671
    const-string v0, "height"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lo/xf;->e(I)V

    .line 674
    :cond_d
    const-string v0, "status"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 675
    const-string v0, "status"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xp;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/xf;->d(Ljava/lang/String;)V

    .line 677
    :cond_e
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 630
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 682
    :cond_f
    goto :goto_1

    .line 680
    :catch_0
    move-exception v5

    .line 681
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 684
    :cond_10
    :goto_1
    return-object v4
.end method

.method public static d(Lorg/json/JSONObject;)Lo/vy;
    .locals 9

    .line 777
    new-instance v4, Lo/vy;

    invoke-direct {v4}, Lo/vy;-><init>()V

    .line 779
    const/4 v5, 0x0

    .line 780
    const-string v0, "GetUserSNSInfoRsp"

    :try_start_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 781
    const-string v0, "GetUserSNSInfoRsp"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 783
    :cond_0
    const/4 v6, 0x0

    .line 784
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    const-string v0, "userSNSInfo"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 785
    const-string v0, "userSNSInfo"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 787
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    const-string v0, "userID"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 788
    const-string v0, "userID"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v7

    .line 789
    invoke-virtual {v4, v7, v8}, Lo/vy;->d(J)V

    .line 791
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    const-string v0, "userAccount"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 792
    const-string v0, "userAccount"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 793
    invoke-virtual {v4, v7}, Lo/vy;->c(Ljava/lang/String;)V

    .line 796
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    const-string v0, "privacySetFlags"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 797
    const-string v0, "privacySetFlags"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 798
    invoke-virtual {v4, v7}, Lo/vy;->b(Ljava/lang/String;)V

    .line 800
    :cond_4
    const/4 v0, 0x0

    if-eq v0, v6, :cond_5

    const-string v0, "qrCode"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 801
    const-string v0, "qrCode"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 802
    invoke-virtual {v4, v7}, Lo/vy;->e(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 806
    :cond_5
    goto :goto_0

    .line 804
    :catch_0
    move-exception v5

    .line 805
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 807
    :goto_0
    return-object v4
.end method

.method public static e(Ljava/lang/String;)I
    .locals 6

    .line 690
    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    .line 692
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 693
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v5

    .line 694
    sub-int v0, v5, v4

    return v0

    .line 704
    :cond_0
    goto :goto_0

    .line 696
    :catch_0
    move-exception v4

    .line 698
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 699
    const/4 v0, 0x0

    return v0

    .line 700
    :catch_1
    move-exception v4

    .line 702
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 703
    const/4 v0, 0x0

    return v0

    .line 705
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Lorg/json/JSONObject;)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONObject;)Ljava/util/ArrayList<Lo/xa;>;"
        }
    .end annotation

    .line 584
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 586
    const/4 v0, 0x0

    if-eq v0, p0, :cond_3

    .line 587
    const/4 v5, 0x0

    .line 588
    const-string v0, "friendsLikedetailsList"

    :try_start_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 589
    const-string v0, "friendsLikedetailsList"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 593
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 595
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v8, v0, :cond_3

    .line 596
    new-instance v6, Lo/xa;

    invoke-direct {v6}, Lo/xa;-><init>()V

    .line 597
    invoke-virtual {v5, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 598
    const-string v0, "huid"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 599
    const-string v0, "huid"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/xa;->e(J)V

    .line 601
    :cond_1
    const-string v0, "time"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 602
    const-string v0, "time"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/xa;->b(Ljava/lang/String;)V

    .line 604
    :cond_2
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 595
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 612
    :cond_3
    goto :goto_1

    .line 610
    :catch_0
    move-exception v5

    .line 611
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 614
    :goto_1
    return-object v4
.end method

.method public static g(Lorg/json/JSONObject;)Lo/vx;
    .locals 8

    .line 980
    new-instance v4, Lo/vx;

    invoke-direct {v4}, Lo/vx;-><init>()V

    .line 982
    const-string v0, "GetOtherUserInfoRsp"

    :try_start_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 983
    const-string v0, "otherUserInfo"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 984
    new-instance v7, Lcom/google/gson/Gson;

    invoke-direct {v7}, Lcom/google/gson/Gson;-><init>()V

    .line 985
    const-class v0, Lo/vx;

    invoke-virtual {v7, v6, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/vx;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 988
    goto :goto_0

    .line 986
    :catch_0
    move-exception v5

    .line 987
    const-string v0, "PSocial_JsonResponseParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseGetOtherInfoRsp ERROR:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 989
    :goto_0
    return-object v4
.end method
