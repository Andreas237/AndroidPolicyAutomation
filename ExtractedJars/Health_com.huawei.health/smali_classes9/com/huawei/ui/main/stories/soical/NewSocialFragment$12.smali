.class Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/operation/https/HttpResCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:J

.field final synthetic d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;J)V
    .locals 0

    .line 998
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iput-wide p2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFinished(ILjava/lang/String;)V
    .locals 17

    .line 1001
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getActivities resCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1002
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3001

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1003
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 1004
    move/from16 v0, p1

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_9

    .line 1007
    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    move-object/from16 v0, p2

    invoke-direct {v8, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1008
    const-string v0, "resultCode"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1009
    if-eqz v9, :cond_8

    .line 1010
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HttpPost result:resultCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1012
    const-string v0, "0"

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1014
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    const-string v1, "currentTime"

    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 1015
    new-instance v10, Lo/dcy;

    invoke-direct {v10}, Lo/dcy;-><init>()V

    .line 1016
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->k(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OPERATION_ACTIVITY_CURRENT_TIME"

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->v(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v10}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1019
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    const-string v1, "activities"

    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b:Lorg/json/JSONArray;

    .line 1020
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b:Lorg/json/JSONArray;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v1, v0, :cond_1

    .line 1021
    :cond_0
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1022
    return-void

    .line 1026
    :cond_1
    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->w(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1028
    new-instance v11, Lorg/json/JSONArray;

    invoke-direct {v11}, Lorg/json/JSONArray;-><init>()V

    .line 1029
    const/4 v12, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v12, v0, :cond_4

    .line 1030
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b:Lorg/json/JSONArray;

    invoke-virtual {v0, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v13

    .line 1031
    invoke-static {v13}, Lo/fic;->c(Lorg/json/JSONObject;)Lo/fil;

    move-result-object v14

    .line 1033
    if-eqz v14, :cond_3

    invoke-virtual {v14}, Lo/fil;->l()I

    move-result v0

    if-lez v0, :cond_3

    .line 1035
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->x(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Lo/fic;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->v(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14}, Lo/fil;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14}, Lo/fil;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/fic;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_2

    .line 1036
    goto :goto_1

    .line 1038
    :cond_2
    invoke-virtual {v11, v13}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1039
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->w(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1029
    :cond_3
    :goto_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 1043
    :cond_4
    if-eqz v11, :cond_5

    .line 1044
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveOperationActivitys = + \n"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1045
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->k(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OPERATION_SOCIAL_ACTIVITY_SAVE"

    invoke-virtual {v11}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v10}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1049
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x18

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1051
    const/4 v12, 0x1

    .line 1053
    const/4 v13, 0x0

    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v13, v0, :cond_7

    .line 1054
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b:Lorg/json/JSONArray;

    invoke-virtual {v0, v13}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v14

    .line 1055
    const/4 v15, 0x0

    .line 1057
    const-string v0, "activityPosition"

    :try_start_2
    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    move-result v15

    .line 1060
    goto :goto_3

    .line 1058
    :catch_0
    move-exception v16

    .line 1059
    goto :goto_4

    .line 1061
    :goto_3
    const/4 v0, 0x2

    if-ne v15, v0, :cond_6

    .line 1062
    move-object/from16 v0, p0

    :try_start_3
    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->k(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OPERATION_ACTIVITY_STEP"

    invoke-virtual {v14}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v10}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1063
    const/4 v12, 0x0

    .line 1064
    goto :goto_5

    .line 1053
    :cond_6
    :goto_4
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    .line 1067
    :cond_7
    :goto_5
    if-eqz v12, :cond_8

    .line 1068
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->k(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OPERATION_ACTIVITY_STEP"

    const-string v3, ""

    invoke-static {v0, v1, v2, v3, v10}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 1074
    :cond_8
    goto :goto_6

    .line 1072
    :catch_1
    move-exception v8

    .line 1073
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Json data error! JSONException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1074
    goto :goto_6

    .line 1076
    :cond_9
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resCode Error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1078
    :goto_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    move/from16 v1, p1

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;->b:J

    move-wide v4, v6

    invoke-static/range {v0 .. v5}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;IJJ)V

    .line 1079
    return-void
.end method
