.class public Lo/we;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:J

.field private static e:Lo/we;


# instance fields
.field private a:Landroid/widget/Toast;

.field b:Lcom/google/gson/Gson;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iput-object v0, p0, Lo/we;->b:Lcom/google/gson/Gson;

    .line 84
    return-void
.end method

.method private a(Lo/wb;Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/wb;Landroid/content/Context;)Ljava/util/ArrayList<Lo/xf;>;"
        }
    .end annotation

    .line 897
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 898
    invoke-virtual/range {p1 .. p1}, Lo/wb;->e()Ljava/util/ArrayList;

    move-result-object v5

    .line 899
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    .line 901
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_5

    .line 902
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/wc;

    .line 903
    new-instance v8, Lo/xf;

    invoke-direct {v8}, Lo/xf;-><init>()V

    .line 904
    invoke-virtual {v6}, Lo/wc;->c()J

    move-result-wide v9

    .line 905
    invoke-virtual {v6}, Lo/wc;->c()J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/xf;->c(J)V

    .line 907
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/wr;->h(Ljava/lang/String;)Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;

    move-result-object v11

    .line 910
    const-string v14, ""

    .line 911
    const/4 v0, 0x0

    if-eq v0, v11, :cond_3

    .line 912
    invoke-virtual {v6}, Lo/wc;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 913
    invoke-virtual {v11}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireRelationShipStatus()I

    move-result v12

    .line 914
    invoke-virtual {v11}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->acquireNote()Ljava/lang/String;

    move-result-object v14

    .line 915
    sget-object v0, Lo/xx$e;->c:Lo/xx$e;

    invoke-virtual {v0}, Lo/xx$e;->ordinal()I

    move-result v0

    if-eq v0, v12, :cond_0

    sget-object v0, Lo/xx$e;->a:Lo/xx$e;

    .line 916
    invoke-virtual {v0}, Lo/xx$e;->ordinal()I

    move-result v0

    if-eq v0, v12, :cond_0

    .line 917
    sget-object v0, Lo/xx$e;->c:Lo/xx$e;

    invoke-virtual {v0}, Lo/xx$e;->ordinal()I

    move-result v12

    .line 920
    :cond_0
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "relationshipStatus "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 921
    const-string v0, ""

    invoke-virtual {v11}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 922
    invoke-virtual {v11}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->getName()Ljava/lang/String;

    move-result-object v13

    .line 923
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "socialUserFrdDetails "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 926
    :cond_1
    const-string v13, ""

    goto :goto_1

    .line 929
    :cond_2
    sget-object v0, Lo/xx$e;->i:Lo/xx$e;

    invoke-virtual {v0}, Lo/xx$e;->ordinal()I

    move-result v12

    .line 930
    const-string v13, ""

    goto :goto_1

    .line 933
    :cond_3
    invoke-virtual {v6}, Lo/wc;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 934
    sget-object v0, Lo/xx$e;->c:Lo/xx$e;

    invoke-virtual {v0}, Lo/xx$e;->ordinal()I

    move-result v12

    .line 939
    const-string v13, ""

    .line 941
    :goto_1
    int-to-short v0, v12

    invoke-virtual {v8, v0}, Lo/xf;->e(S)V

    .line 942
    invoke-virtual {v8, v13}, Lo/xf;->e(Ljava/lang/String;)V

    .line 943
    invoke-virtual {v8, v14}, Lo/xf;->h(Ljava/lang/String;)V

    .line 944
    sget-object v0, Lo/xx$b;->e:Lo/xx$b;

    invoke-virtual {v0}, Lo/xx$b;->ordinal()I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {v8, v0}, Lo/xf;->d(S)V

    .line 945
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Relationship"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 946
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "note"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 948
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 901
    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 952
    :cond_5
    return-object v4
.end method

.method private a(Landroid/content/Context;)V
    .locals 0

    .line 873
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 2

    .line 881
    iget-object v0, p0, Lo/we;->a:Landroid/widget/Toast;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/we;->a:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-nez v0, :cond_2

    .line 883
    :cond_0
    const/16 v0, -0x3e9

    if-ne p3, v0, :cond_1

    .line 884
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_request_session_timeout_text:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Lo/we;->a:Landroid/widget/Toast;

    goto :goto_0

    .line 886
    :cond_1
    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Lo/we;->a:Landroid/widget/Toast;

    .line 888
    :goto_0
    iget-object v0, p0, Lo/we;->a:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 891
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Toast Message :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Response code :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 892
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lo/wo;Landroid/os/Bundle;Lorg/json/JSONObject;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Lo/wo;Landroid/os/Bundle;Lorg/json/JSONObject;)V"
        }
    .end annotation

    .line 253
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    const/4 v6, 0x0

    .line 255
    move-object/from16 v7, p2

    const/4 v8, -0x1

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "reset_user_update_count"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v8, 0x0

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "update_user_status"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v8, 0x1

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "update_user_hobbies"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v8, 0x2

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "update_user_settings"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v8, 0x3

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "sns_update_user_info"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v8, 0x4

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "modify_rank_switch"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v8, 0x5

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "get_rank_switch"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v8, 0x6

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "update_social_user_settings"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v8, 0x7

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "tag_json_get_ranking_list"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0x8

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "get_user_update_count"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0x9

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "fetch_friend_like_details"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0xa

    goto/16 :goto_0

    :sswitch_b
    const-string v0, "get_pending_friend_req_details"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0xb

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "get_user_profile"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0xc

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "profile_wall_images"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0xd

    goto/16 :goto_0

    :sswitch_e
    const-string v0, "sns_login"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0xe

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "sns_match_contacts"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0xf

    goto/16 :goto_0

    :sswitch_10
    const-string v0, "sns_user_friend_list"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0x10

    goto/16 :goto_0

    :sswitch_11
    const-string v0, "sns_find_friend"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0x11

    goto :goto_0

    :sswitch_12
    const-string v0, "fetch_detail_event_list"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0x12

    goto :goto_0

    :sswitch_13
    const-string v0, "update_user_sns_info"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0x13

    goto :goto_0

    :sswitch_14
    const-string v0, "get_user_sns_info"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0x14

    goto :goto_0

    :sswitch_15
    const-string v0, "del_friend_notify_list"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0x15

    goto :goto_0

    :sswitch_16
    const-string v0, "get_other_info"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0x16

    goto :goto_0

    :sswitch_17
    const-string v0, "get_assistent_profile"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0x17

    goto :goto_0

    :sswitch_18
    const-string v0, "update_like_details"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0x18

    :cond_0
    :goto_0
    packed-switch v8, :pswitch_data_0

    goto/16 :goto_1e

    .line 259
    :pswitch_0
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_RESET_USER_UPDATE_COUNT response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    goto/16 :goto_1e

    .line 263
    :pswitch_1
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_UPDATE_USER_STATUS response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_0
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x5208

    if-ne v0, v1, :cond_1

    .line 266
    const-string v0, "status"

    move-object/from16 v1, p7

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 267
    invoke-static {}, Lo/xg;->d()Lo/xi;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v0, v1, v9}, Lo/xi;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 268
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_1

    .line 269
    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V

    .line 270
    invoke-interface/range {p5 .. p5}, Lo/wo;->b()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 275
    :cond_1
    goto :goto_1

    .line 273
    :catch_0
    move-exception v9

    .line 274
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    :goto_1
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_4e

    .line 277
    invoke-interface/range {p5 .. p5}, Lo/wo;->b()V

    goto/16 :goto_1e

    .line 281
    :pswitch_2
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_UPDATE_USER_HOBBIES response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_1
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x5208

    if-ne v0, v1, :cond_2

    .line 284
    const-string v0, "hobbies"

    move-object/from16 v1, p7

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 285
    invoke-static {}, Lo/xg;->d()Lo/xi;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v0, v1, v9}, Lo/xi;->a(Landroid/content/Context;I)V

    .line 287
    :cond_2
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_3

    .line 288
    invoke-interface/range {p5 .. p5}, Lo/wo;->b()V

    .line 289
    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 297
    :cond_3
    goto/16 :goto_1e

    .line 292
    :catch_1
    move-exception v9

    .line 293
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_4

    .line 295
    invoke-interface/range {p5 .. p5}, Lo/wo;->b()V

    .line 298
    :cond_4
    goto/16 :goto_1e

    .line 301
    :pswitch_3
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_UPDATE_USER_SETTINGS response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    const-string v0, "resCode"

    move-object/from16 v1, p3

    :try_start_2
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x5208

    if-ne v0, v1, :cond_5

    .line 304
    const-string v0, "settings"

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    .line 305
    invoke-static {}, Lo/xg;->d()Lo/xi;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v0, v1, v9}, Lo/xi;->b(Landroid/content/Context;I)V

    .line 306
    goto :goto_2

    .line 307
    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_update_server_error:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "resCode"

    move-object/from16 v2, p3

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    invoke-direct {v2, v3, v0, v1}, Lo/we;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 308
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/we;->a(Landroid/content/Context;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 312
    :goto_2
    goto/16 :goto_1e

    .line 310
    :catch_2
    move-exception v9

    .line 311
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    goto/16 :goto_1e

    .line 318
    :pswitch_4
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_3
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 319
    if-nez v9, :cond_7

    .line 320
    const-string v0, "userID"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v10

    .line 321
    const-string v0, "privacySetFlags"

    const-string v1, ""

    move-object/from16 v2, p1

    invoke-static {v2, v0, v1}, Lo/xt;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 322
    const-string v0, "11111"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 323
    const-string v0, "privacySetFlags"

    const-string v1, "01111"

    move-object/from16 v2, p1

    invoke-static {v2, v0, v1}, Lo/xt;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 325
    :cond_6
    const-string v0, "privacySetFlags"

    const-string v1, "11111"

    move-object/from16 v2, p1

    invoke-static {v2, v0, v1}, Lo/xt;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    :goto_3
    goto :goto_4

    .line 328
    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_update_server_error:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "resCode"

    move-object/from16 v2, p3

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    invoke-direct {v2, v3, v0, v1}, Lo/we;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 329
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/we;->c(Landroid/content/Context;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3

    .line 334
    :goto_4
    goto/16 :goto_1e

    .line 331
    :catch_3
    move-exception v9

    .line 332
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_8

    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V

    .line 333
    :cond_8
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    goto/16 :goto_1e

    .line 338
    :pswitch_5
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_4
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 339
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "modify rankSwitch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    if-nez v9, :cond_9

    .line 341
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_a

    .line 342
    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V

    goto :goto_5

    .line 345
    :cond_9
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_update_server_error:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "resCode"

    move-object/from16 v2, p3

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    invoke-direct {v2, v3, v0, v1}, Lo/we;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 346
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_a

    .line 347
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "modify rankSwitch failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_4

    .line 356
    :cond_a
    :goto_5
    goto/16 :goto_1e

    .line 351
    :catch_4
    move-exception v9

    .line 352
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_b

    .line 353
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V

    .line 355
    :cond_b
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    goto/16 :goto_1e

    .line 360
    :pswitch_6
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_5
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 361
    if-nez v9, :cond_d

    .line 362
    const-string v0, "rankSwitch"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 363
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "rankSwitch:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    const-string v0, "socialRankSwitch"

    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-static {v2, v0, v1}, Lo/xt;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_c

    .line 366
    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V

    .line 368
    :cond_c
    goto :goto_6

    .line 369
    :cond_d
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_e

    .line 370
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_5

    .line 378
    :cond_e
    :goto_6
    goto/16 :goto_1e

    .line 373
    :catch_5
    move-exception v9

    .line 374
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_f

    .line 375
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V

    .line 377
    :cond_f
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    goto/16 :goto_1e

    .line 381
    :pswitch_7
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_UPDATE_SOCIAL_USER_SETTINGS response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_6
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x5208

    if-ne v0, v1, :cond_10

    .line 384
    const-string v0, "settings"

    move-object/from16 v1, p7

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 385
    const-string v0, "toHuid"

    move-object/from16 v1, p7

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v10

    .line 386
    invoke-static {}, Lo/xg;->d()Lo/xi;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v0, v1, v10, v11, v9}, Lo/xi;->d(Landroid/content/Context;JI)V

    .line 387
    goto :goto_7

    .line 388
    :cond_10
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_update_server_error:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "resCode"

    move-object/from16 v2, p3

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    invoke-direct {v2, v3, v0, v1}, Lo/we;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 389
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/we;->a(Landroid/content/Context;)V
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_6

    .line 393
    :goto_7
    goto/16 :goto_1e

    .line 391
    :catch_6
    move-exception v9

    .line 392
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    goto/16 :goto_1e

    .line 397
    :pswitch_8
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_GET_RANKING_LIST response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_7
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 401
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 402
    const/16 v0, 0x5208

    if-eq v9, v0, :cond_11

    const/16 v0, 0x521c

    if-ne v9, v0, :cond_14

    .line 403
    :cond_11
    new-instance v10, Lo/wu;

    invoke-direct {v10}, Lo/wu;-><init>()V

    .line 408
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0}, Lo/vu;->c()Ljava/lang/String;

    move-result-object v11

    .line 409
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_12

    .line 410
    invoke-static {v11}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    sput-wide v0, Lo/we;->d:J

    goto :goto_8

    .line 412
    :cond_12
    const-wide/16 v0, -0x1

    sput-wide v0, Lo/we;->d:J

    .line 414
    :goto_8
    move-object/from16 v0, p1

    move-object/from16 v1, p3

    invoke-static {v0, v1}, Lo/wl;->b(Landroid/content/Context;Lorg/json/JSONObject;)Ljava/util/ArrayList;

    move-result-object v12

    .line 416
    sget-wide v0, Lo/we;->d:J

    move-object/from16 v2, p1

    invoke-virtual {v10, v12, v2, v0, v1}, Lo/wu;->e(Ljava/util/ArrayList;Landroid/content/Context;J)V

    .line 419
    invoke-static {}, Lo/xp;->e()J

    move-result-wide v13

    .line 420
    const-string v0, "timestamp"

    const-wide/16 v1, 0x64

    sub-long v1, v13, v1

    move-object/from16 v3, p1

    invoke-static {v3, v0, v1, v2}, Lo/xt;->e(Landroid/content/Context;Ljava/lang/String;J)V

    .line 422
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_13

    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V

    .line 423
    :cond_13
    goto :goto_9

    :cond_14
    const/16 v0, 0x5282

    if-eq v9, v0, :cond_15

    const/16 v0, 0x5283

    if-ne v9, v0, :cond_16

    .line 424
    :cond_15
    invoke-static/range {p1 .. p1}, Lo/xy;->b(Landroid/content/Context;)V

    .line 425
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_17

    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V

    goto :goto_9

    .line 430
    :cond_16
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_17

    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_7

    .line 442
    :cond_17
    :goto_9
    goto/16 :goto_1e

    .line 436
    :catch_7
    move-exception v9

    .line 437
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_18

    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V

    .line 438
    :cond_18
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    goto/16 :goto_1e

    .line 445
    :pswitch_9
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_GET_USER_UPDATE_COUNT response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 446
    invoke-static/range {p3 .. p3}, Lo/wl;->a(Lorg/json/JSONObject;)Lo/wg;

    move-result-object v9

    .line 447
    const/4 v0, 0x0

    if-eq v0, v9, :cond_4e

    .line 448
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_GET_USER_UPDATE_COUNT count = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lo/wg;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    const-string v0, "pending_moment_count"

    invoke-virtual {v9}, Lo/wg;->b()I

    move-result v1

    move-object/from16 v2, p1

    invoke-static {v2, v0, v1}, Lo/xt;->b(Landroid/content/Context;Ljava/lang/String;I)V

    .line 450
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_19

    .line 451
    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V

    .line 452
    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 453
    const-string v0, "pending_moment_count"

    invoke-virtual {v9}, Lo/wg;->b()I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 454
    const-string v0, ""

    move-object/from16 v1, p5

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0, v10}, Lo/wo;->d(ILjava/lang/String;Landroid/os/Bundle;)V

    .line 455
    goto/16 :goto_1e

    .line 456
    :cond_19
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_JSON_GET_USER_UPDATE_COUNT listener is null = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1e

    .line 464
    :pswitch_a
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_FETCH_FRIEND_LIKE_DETAILS response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_8
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 469
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x5208

    if-ne v0, v1, :cond_1b

    .line 470
    .line 471
    invoke-static/range {p3 .. p3}, Lo/wl;->e(Lorg/json/JSONObject;)Ljava/util/ArrayList;

    move-result-object v10

    .line 474
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/wr;->a(Ljava/util/ArrayList;)J

    .line 475
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_1a

    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V

    .line 477
    :cond_1a
    goto :goto_a

    :cond_1b
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x5230

    if-ne v0, v1, :cond_1c

    .line 481
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0}, Lo/wr;->p()I

    .line 482
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_1f

    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V

    goto :goto_a

    .line 486
    :cond_1c
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x5282

    if-eq v0, v1, :cond_1d

    const-string v0, "resultCode"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x5283

    if-ne v0, v1, :cond_1e

    .line 487
    :cond_1d
    invoke-static/range {p1 .. p1}, Lo/xy;->b(Landroid/content/Context;)V

    .line 491
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_1f

    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V

    goto :goto_a

    .line 496
    :cond_1e
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_1f

    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_8

    .line 505
    :cond_1f
    :goto_a
    goto/16 :goto_1e

    .line 499
    :catch_8
    move-exception v10

    .line 500
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_20

    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V

    .line 501
    :cond_20
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 506
    goto/16 :goto_1e

    .line 509
    :pswitch_b
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_GET_PENDING_FRIEND_REQ_DETAILS response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 511
    const-string v0, "resCode"

    move-object/from16 v1, p3

    :try_start_9
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 512
    const-string v0, "resCode"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 514
    :cond_21
    const/16 v0, 0x5208

    if-eq v6, v0, :cond_22

    const/16 v0, 0x526c

    if-ne v6, v0, :cond_24

    .line 516
    .line 517
    :cond_22
    move-object/from16 v0, p1

    move-object/from16 v1, p3

    invoke-static {v0, v1}, Lo/wl;->d(Landroid/content/Context;Lorg/json/JSONObject;)Ljava/util/ArrayList;

    move-result-object v10

    .line 520
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    const-wide/16 v1, -0x1

    invoke-virtual {v0, v10, v1, v2}, Lo/wr;->c(Ljava/util/ArrayList;J)J

    .line 521
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_23

    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V

    .line 522
    :cond_23
    goto :goto_b

    .line 523
    :cond_24
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_25

    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_9

    .line 528
    :cond_25
    :goto_b
    goto/16 :goto_1e

    .line 525
    :catch_9
    move-exception v10

    .line 526
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_26

    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V

    .line 527
    :cond_26
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    goto/16 :goto_1e

    .line 533
    :pswitch_c
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_GET_USER_PROFILE response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 535
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/we;->e(Landroid/content/Context;Lorg/json/JSONObject;Lo/wo;Landroid/os/Bundle;)V

    .line 536
    goto/16 :goto_1e

    .line 540
    :pswitch_d
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_WALL_IMAGES response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 542
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_a
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_28

    const-string v0, "resultDesc"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_28

    .line 544
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 545
    const-string v0, "resultDesc"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 546
    const/16 v0, 0x5208

    if-ne v10, v0, :cond_27

    const-string v0, "Success"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_27

    .line 547
    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V

    goto :goto_c

    .line 550
    :cond_27
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V

    .line 553
    :goto_c
    goto :goto_d

    .line 554
    :cond_28
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_a

    .line 558
    :goto_d
    goto/16 :goto_1e

    .line 556
    :catch_a
    move-exception v10

    .line 557
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    goto/16 :goto_1e

    .line 562
    :pswitch_e
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_SNS_LOGIN Login response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 564
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_b
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_29

    .line 565
    move-object/from16 v0, p3

    move-object/from16 v1, p1

    invoke-static {v0, v1}, Lo/wl;->a(Lorg/json/JSONObject;Landroid/content/Context;)V

    .line 566
    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V

    goto :goto_e

    .line 568
    :cond_29
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_b

    .line 572
    :goto_e
    goto/16 :goto_1e

    .line 570
    :catch_b
    move-exception v10

    .line 571
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    goto/16 :goto_1e

    .line 575
    :pswitch_f
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_SNS_MATCH_CONTACTS response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_c
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 578
    if-nez v10, :cond_2b

    .line 579
    new-instance v11, Lo/wq;

    move-object/from16 v0, p1

    invoke-direct {v11, v0}, Lo/wq;-><init>(Landroid/content/Context;)V

    .line 580
    move-object/from16 v0, p3

    move-object/from16 v1, p1

    invoke-static {v0, v1}, Lo/wl;->b(Lorg/json/JSONObject;Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v12

    .line 582
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 583
    new-instance v14, Landroid/os/Bundle;

    invoke-direct {v14}, Landroid/os/Bundle;-><init>()V

    .line 584
    const/4 v0, 0x0

    if-eq v0, v12, :cond_2a

    .line 586
    new-instance v15, Lcom/google/gson/Gson;

    invoke-direct {v15}, Lcom/google/gson/Gson;-><init>()V

    .line 587
    const-string v0, "contact_string_key"

    invoke-virtual {v15, v12}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 588
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_f
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2a

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lo/wa;

    .line 589
    invoke-virtual/range {v17 .. v17}, Lo/wa;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 590
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_SNS_MATCH_CONTACTS String.valueOf(arr.getUserID()): = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v17 .. v17}, Lo/wa;->e()J

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

    .line 591
    goto :goto_f

    .line 595
    :cond_2a
    move-object/from16 v0, p5

    invoke-virtual {v11, v13, v0, v14}, Lo/wq;->c(Ljava/util/ArrayList;Lo/wo;Landroid/os/Bundle;)V

    .line 597
    goto :goto_10

    :cond_2b
    const/16 v0, 0x3ea

    if-ne v10, v0, :cond_2c

    .line 598
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V
    :try_end_c
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_c

    .line 602
    :cond_2c
    :goto_10
    goto/16 :goto_1e

    .line 600
    :catch_c
    move-exception v10

    .line 601
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JSONException error = "

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

    .line 603
    goto/16 :goto_1e

    .line 605
    :pswitch_10
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_SNS_USER_FRIEND_LIST response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 608
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_d
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 609
    if-nez v10, :cond_30

    .line 610
    move-object/from16 v0, p3

    move-object/from16 v1, p1

    invoke-static {v0, v1}, Lo/wl;->c(Lorg/json/JSONObject;Landroid/content/Context;)Ljava/util/ArrayList;

    .line 612
    invoke-static/range {p3 .. p3}, Lo/wl;->c(Lorg/json/JSONObject;)Lo/wb;

    move-result-object v11

    .line 613
    new-instance v12, Lo/wu;

    invoke-direct {v12}, Lo/wu;-><init>()V

    .line 617
    invoke-static/range {p1 .. p1}, Lo/xy;->d(Landroid/content/Context;)Lo/xv;

    move-result-object v13

    .line 619
    invoke-virtual {v13}, Lo/xv;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2d

    .line 620
    invoke-virtual {v13}, Lo/xv;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    sput-wide v0, Lo/we;->d:J

    goto :goto_11

    .line 622
    :cond_2d
    const-wide/16 v0, -0x1

    sput-wide v0, Lo/we;->d:J

    .line 624
    :goto_11
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v11, v1}, Lo/we;->a(Lo/wb;Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v14

    .line 626
    const/4 v15, 0x0

    :goto_12
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v15, v0, :cond_2e

    .line 627
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/xf;

    invoke-virtual {v2}, Lo/xf;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 626
    add-int/lit8 v15, v15, 0x1

    goto :goto_12

    .line 629
    :cond_2e
    sget-wide v0, Lo/we;->d:J

    move-object/from16 v2, p1

    invoke-virtual {v12, v14, v2, v0, v1}, Lo/wu;->e(Ljava/util/ArrayList;Landroid/content/Context;J)V

    .line 631
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_2f

    .line 632
    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V

    .line 633
    new-instance v15, Lcom/google/gson/Gson;

    invoke-direct {v15}, Lcom/google/gson/Gson;-><init>()V

    .line 634
    invoke-virtual {v15, v11}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p5

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v1, v2, v0, v3}, Lo/wo;->d(ILjava/lang/String;Landroid/os/Bundle;)V

    .line 636
    :cond_2f
    goto :goto_13

    :cond_30
    const/16 v0, 0x3ea

    if-ne v10, v0, :cond_31

    .line 637
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V

    goto :goto_13

    .line 639
    :cond_31
    const/16 v0, 0x3eb

    if-ne v10, v0, :cond_32

    .line 644
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_d

    .line 651
    :cond_32
    :goto_13
    goto/16 :goto_1e

    .line 646
    :catch_d
    move-exception v10

    .line 647
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_33

    .line 648
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V

    .line 650
    :cond_33
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 652
    goto/16 :goto_1e

    .line 656
    :pswitch_11
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_SNS_FIND_FRIEND response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 658
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_e
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 659
    if-nez v10, :cond_36

    .line 660
    invoke-static/range {p3 .. p3}, Lo/wl;->b(Lorg/json/JSONObject;)Lo/vz;

    move-result-object v11

    .line 661
    const/4 v0, 0x0

    if-ne v0, v11, :cond_34

    .line 662
    invoke-interface/range {p5 .. p5}, Lo/wo;->b()V
    :try_end_e
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_e

    .line 663
    goto/16 :goto_1e

    .line 665
    :cond_34
    :try_start_f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mFindUserInfo: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v11}, Lo/vz;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 666
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0}, Lo/vu;->c()Ljava/lang/String;

    move-result-object v12

    .line 667
    invoke-virtual {v11}, Lo/vz;->a()J

    move-result-wide v0

    invoke-static {v12}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_35

    .line 668
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {p3 .. p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 669
    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V

    .line 670
    new-instance v13, Landroid/os/Bundle;

    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 671
    new-instance v14, Lcom/google/gson/Gson;

    invoke-direct {v14}, Lcom/google/gson/Gson;-><init>()V

    .line 672
    const-string v0, "result"

    invoke-virtual {v14, v11}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 674
    goto :goto_14

    .line 675
    :cond_35
    invoke-interface/range {p5 .. p5}, Lo/wo;->b()V

    .line 676
    :goto_14
    goto :goto_15

    :cond_36
    const/16 v0, 0x3ea

    if-ne v10, v0, :cond_37

    .line 677
    const-string v0, "TESTING"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Response: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 678
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V
    :try_end_f
    .catch Lorg/json/JSONException; {:try_start_f .. :try_end_f} :catch_e

    nop

    .line 680
    .line 689
    :cond_37
    :goto_15
    goto/16 :goto_1e

    .line 687
    :catch_e
    move-exception v10

    .line 688
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JSONException : "

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

    .line 690
    goto/16 :goto_1e

    .line 693
    :pswitch_12
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_FETCH_DETAIL_EVENT_LIST response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 696
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    :try_start_10
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switch case TAG_JSON_FETCH_DETAIL_EVENT_LIST 0 !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 697
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 699
    const/16 v0, 0x5208

    if-eq v10, v0, :cond_38

    const/16 v0, 0x5282

    if-ne v10, v0, :cond_3c

    .line 702
    :cond_38
    const/4 v11, 0x0

    .line 704
    const-string v0, "key_bundle_moment_ids"

    move-object/from16 v1, p6

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_39

    const-string v0, "key_bundle_moment_ids"

    .line 705
    move-object/from16 v1, p6

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_39

    .line 706
    const-string v0, "key_bundle_moment_ids"

    move-object/from16 v1, p6

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/util/ArrayList;

    .line 707
    const/4 v0, 0x0

    if-eq v0, v12, :cond_39

    .line 708
    move-object/from16 v0, p1

    move-object/from16 v1, p3

    invoke-static {v12, v0, v1}, Lo/wl;->a(Ljava/util/ArrayList;Landroid/content/Context;Lorg/json/JSONObject;)[Landroid/content/ContentValues;

    move-result-object v11

    .line 712
    :cond_39
    const/4 v0, 0x0

    if-eq v0, v11, :cond_3a

    array-length v0, v11

    if-lez v0, :cond_3a

    .line 713
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/wk;->l:Landroid/net/Uri;

    invoke-virtual {v0, v1, v11}, Landroid/content/ContentResolver;->bulkInsert(Landroid/net/Uri;[Landroid/content/ContentValues;)I

    .line 714
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/wk;->a:Landroid/net/Uri;

    invoke-virtual {v0, v1, v11}, Landroid/content/ContentResolver;->bulkInsert(Landroid/net/Uri;[Landroid/content/ContentValues;)I

    .line 715
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_3b

    .line 716
    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V

    goto :goto_16

    .line 719
    :cond_3a
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switch case TAG_JSON_FETCH_DETAIL_EVENT_LIST 2 activities.length 0 listener.onFailure()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 720
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_3b

    .line 721
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V

    .line 724
    :cond_3b
    :goto_16
    goto :goto_17

    .line 725
    :cond_3c
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switch case TAG_JSON_FETCH_DETAIL_EVENT_LIST 3 response fail listener.onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 726
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_3d

    .line 727
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V
    :try_end_10
    .catch Lorg/json/JSONException; {:try_start_10 .. :try_end_10} :catch_f

    .line 735
    :cond_3d
    :goto_17
    goto/16 :goto_1e

    .line 730
    :catch_f
    move-exception v10

    .line 731
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_JSON_FETCH_DETAIL_EVENT_LIST Exception e !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 732
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_3e

    .line 733
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V

    .line 736
    :cond_3e
    goto/16 :goto_1e

    .line 739
    :pswitch_13
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_UPDATE_USER_SNS_FLAGS response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 741
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_11
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 742
    if-nez v10, :cond_40

    .line 743
    const-string v0, "UpdateUserSNSInfoRsp"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    .line 744
    const-string v0, "userID"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v12

    .line 745
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleResponse:TAG_JSON_UPDATE_USER_SNS_FLAGS "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 746
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_3f

    .line 747
    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V

    .line 749
    :cond_3f
    goto :goto_18

    .line 750
    :cond_40
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_41

    .line 751
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V
    :try_end_11
    .catch Lorg/json/JSONException; {:try_start_11 .. :try_end_11} :catch_10

    .line 756
    :cond_41
    :goto_18
    goto/16 :goto_1e

    .line 754
    :catch_10
    move-exception v10

    .line 755
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error:"

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

    .line 757
    goto/16 :goto_1e

    .line 759
    :pswitch_14
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_GET_USER_SNS_FLAGS response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 761
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_12
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 762
    if-nez v10, :cond_43

    .line 763
    invoke-static/range {p3 .. p3}, Lo/wl;->d(Lorg/json/JSONObject;)Lo/vy;

    move-result-object v11

    .line 765
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_42

    .line 766
    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V

    .line 767
    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 769
    const-string v0, "request_result"

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/we;->b:Lcom/google/gson/Gson;

    invoke-virtual {v1, v11}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 770
    const-string v0, ""

    move-object/from16 v1, p5

    invoke-interface {v1, v10, v0, v12}, Lo/wo;->d(ILjava/lang/String;Landroid/os/Bundle;)V

    .line 772
    :cond_42
    goto :goto_19

    .line 773
    :cond_43
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_44

    .line 774
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V
    :try_end_12
    .catch Lorg/json/JSONException; {:try_start_12 .. :try_end_12} :catch_11

    .line 781
    :cond_44
    :goto_19
    goto/16 :goto_1e

    .line 777
    :catch_11
    move-exception v10

    .line 778
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_45

    .line 779
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V

    .line 782
    :cond_45
    goto/16 :goto_1e

    .line 785
    :pswitch_15
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_DELETE_FRIEND_NOTLIFY_LIST response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 788
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_13
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 789
    if-nez v10, :cond_46

    .line 790
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_47

    .line 791
    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V

    goto :goto_1a

    .line 794
    :cond_46
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_47

    .line 795
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V
    :try_end_13
    .catch Lorg/json/JSONException; {:try_start_13 .. :try_end_13} :catch_12

    .line 800
    :cond_47
    :goto_1a
    goto/16 :goto_1e

    .line 798
    :catch_12
    move-exception v10

    .line 799
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 801
    goto/16 :goto_1e

    .line 803
    :pswitch_16
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_GET_OTHER_INFO response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 805
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_14
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 806
    if-nez v10, :cond_49

    .line 807
    invoke-static/range {p3 .. p3}, Lo/wl;->g(Lorg/json/JSONObject;)Lo/vx;

    move-result-object v11

    .line 808
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_GET_OTHER_INFO response2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lo/vx;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 809
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_48

    .line 810
    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 811
    const-string v0, "request_result"

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/we;->b:Lcom/google/gson/Gson;

    invoke-virtual {v1, v11}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 812
    const-string v0, ""

    move-object/from16 v1, p5

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0, v12}, Lo/wo;->d(ILjava/lang/String;Landroid/os/Bundle;)V

    .line 814
    :cond_48
    goto :goto_1b

    .line 815
    :cond_49
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_4a

    .line 816
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V

    .line 817
    const-string v0, ""

    move-object/from16 v1, p5

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-interface {v1, v2, v0, v3}, Lo/wo;->d(ILjava/lang/String;Landroid/os/Bundle;)V
    :try_end_14
    .catch Lorg/json/JSONException; {:try_start_14 .. :try_end_14} :catch_13

    .line 823
    :cond_4a
    :goto_1b
    goto/16 :goto_1e

    .line 820
    :catch_13
    move-exception v10

    .line 821
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_QR_CODE response JSONException:= "

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

    .line 822
    const-string v0, ""

    move-object/from16 v1, p5

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-interface {v1, v2, v0, v3}, Lo/wo;->d(ILjava/lang/String;Landroid/os/Bundle;)V

    .line 824
    goto/16 :goto_1e

    .line 826
    :pswitch_17
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG_JSON_GET_ASSISTENT_PROFILE response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 827
    move-object/from16 v0, p1

    move-object/from16 v1, p3

    invoke-static {v0, v1}, Lo/wl;->a(Landroid/content/Context;Lorg/json/JSONObject;)Ljava/util/ArrayList;

    move-result-object v10

    .line 828
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_4e

    .line 829
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 830
    const-string v0, "assistent"

    invoke-virtual {v11, v0, v10}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 831
    const-string v0, ""

    move-object/from16 v1, p5

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0, v11}, Lo/wo;->d(ILjava/lang/String;Landroid/os/Bundle;)V

    .line 832
    goto/16 :goto_1e

    .line 837
    :pswitch_18
    const-string v0, "resultCode"

    move-object/from16 v1, p3

    :try_start_15
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v11

    .line 838
    const/16 v0, 0x5208

    if-ne v11, v0, :cond_4c

    .line 839
    const/4 v0, 0x0

    move-object/from16 v1, p6

    if-eq v0, v1, :cond_4b

    .line 840
    const-string v0, "huId"

    move-object/from16 v1, p6

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v12

    .line 841
    const-string v0, "like"

    move-object/from16 v1, p6

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v14

    .line 842
    const-string v0, "likeCount"

    move-object/from16 v1, p6

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v15

    .line 843
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "extras toHuId"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "liked "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "likecount"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 844
    move-object/from16 v0, p0

    move-wide v1, v12

    move v3, v14

    move v4, v15

    move-object/from16 v5, p1

    invoke-direct/range {v0 .. v5}, Lo/we;->c(JIILandroid/content/Context;)V

    .line 845
    goto :goto_1c

    .line 846
    :cond_4b
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "extras ==  null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 848
    :goto_1c
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_4d

    .line 849
    invoke-interface/range {p5 .. p5}, Lo/wo;->a()V

    goto :goto_1d

    .line 852
    :cond_4c
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_4d

    .line 853
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V
    :try_end_15
    .catch Lorg/json/JSONException; {:try_start_15 .. :try_end_15} :catch_14

    .line 860
    :cond_4d
    :goto_1d
    goto :goto_1e

    .line 856
    :catch_14
    move-exception v11

    .line 857
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_4e

    .line 858
    invoke-interface/range {p5 .. p5}, Lo/wo;->e()V

    .line 861
    .line 867
    :cond_4e
    :goto_1e
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x744b3b6a -> :sswitch_a
        -0x71c03790 -> :sswitch_1
        -0x70c87863 -> :sswitch_11
        -0x634fc4c2 -> :sswitch_6
        -0x611c6e4f -> :sswitch_b
        -0x60c878ee -> :sswitch_10
        -0x5e61576d -> :sswitch_4
        -0x5c6cd15e -> :sswitch_5
        -0x56d1ea1e -> :sswitch_e
        -0x539682fa -> :sswitch_16
        -0x39a77274 -> :sswitch_12
        -0x226c23ed -> :sswitch_13
        -0x1c89671e -> :sswitch_8
        -0x1ba45ce3 -> :sswitch_0
        -0x14adc6ce -> :sswitch_2
        -0x8c01709 -> :sswitch_d
        0x4588d21 -> :sswitch_3
        0x23b74150 -> :sswitch_18
        0x2d6037e0 -> :sswitch_14
        0x30574164 -> :sswitch_9
        0x58de177e -> :sswitch_c
        0x5de9667b -> :sswitch_7
        0x60e5f734 -> :sswitch_f
        0x70c5dc67 -> :sswitch_15
        0x7e6c3fa3 -> :sswitch_17
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_18
    .end packed-switch
.end method

.method public static b()J
    .locals 2

    .line 72
    sget-wide v0, Lo/we;->d:J

    return-wide v0
.end method

.method static synthetic b(Lo/we;Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lo/wo;Landroid/os/Bundle;Lorg/json/JSONObject;)V
    .locals 0

    .line 64
    invoke-direct/range {p0 .. p7}, Lo/we;->a(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lo/wo;Landroid/os/Bundle;Lorg/json/JSONObject;)V

    return-void
.end method

.method public static c()Lo/we;
    .locals 1

    .line 87
    sget-object v0, Lo/we;->e:Lo/we;

    if-nez v0, :cond_0

    .line 88
    new-instance v0, Lo/we;

    invoke-direct {v0}, Lo/we;-><init>()V

    sput-object v0, Lo/we;->e:Lo/we;

    .line 90
    :cond_0
    sget-object v0, Lo/we;->e:Lo/we;

    return-object v0
.end method

.method private c(JIILandroid/content/Context;)V
    .locals 7

    .line 1041
    const/4 v0, 0x0

    if-ne v0, p5, :cond_0

    .line 1042
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "PSocial_GetCloudData"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "saveLikeDateToDB context == null"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1043
    return-void

    .line 1045
    :cond_0
    new-instance v6, Ljava/lang/Thread;

    new-instance v0, Lo/we$4;

    move-object v1, p0

    move-wide v2, p1

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lo/we$4;-><init>(Lo/we;JII)V

    invoke-direct {v6, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 1055
    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    .line 1056
    return-void
.end method

.method private c(Landroid/content/Context;)V
    .locals 0

    .line 878
    return-void
.end method

.method private c(Landroid/content/Context;Ljava/lang/String;JI)V
    .locals 5

    .line 1029
    const-string v0, "add_moment"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1030
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 1031
    const-string v0, "dirty"

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1033
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "actId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1034
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/wk;->a:Landroid/net/Uri;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v3, v4, v2}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 1036
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/we;Landroid/content/Context;Ljava/lang/String;I)V
    .locals 0

    .line 64
    invoke-direct {p0, p1, p2, p3}, Lo/we;->a(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method public static d(J)V
    .locals 0

    .line 76
    sput-wide p0, Lo/we;->d:J

    .line 77
    return-void
.end method

.method static synthetic e(Lo/we;Landroid/content/Context;Ljava/lang/String;JI)V
    .locals 0

    .line 64
    invoke-direct/range {p0 .. p5}, Lo/we;->c(Landroid/content/Context;Ljava/lang/String;JI)V

    return-void
.end method


# virtual methods
.method public e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/util/Map;Lo/wo;Landroid/os/Bundle;Z)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Lo/wo;Landroid/os/Bundle;Z)V"
        }
    .end annotation

    .line 133
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getJsonResponse request Url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    const/4 v0, 0x0

    move-object/from16 v1, p5

    if-eq v0, v1, :cond_0

    .line 135
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  getJsonResponse object = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p5 .. p5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    :cond_0
    const/4 v0, 0x0

    move-object/from16 v1, p6

    if-eq v0, v1, :cond_1

    .line 138
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TAG:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  getJsonResponse params = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    :cond_1
    new-instance v0, Lo/we$5;

    move-object v1, p0

    move/from16 v2, p4

    move-object/from16 v3, p2

    move-object/from16 v4, p5

    new-instance v5, Lo/we$1;

    move-object v6, p0

    move-object v7, p1

    move-object/from16 v8, p3

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p5

    invoke-direct/range {v5 .. v12}, Lo/we$1;-><init>(Lo/we;Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Lo/wo;Landroid/os/Bundle;Lorg/json/JSONObject;)V

    new-instance v6, Lo/we$3;

    move-object v7, p0

    move-object/from16 v8, p3

    move-object/from16 v9, p8

    move-object v10, p1

    move-object/from16 v11, p7

    invoke-direct/range {v6 .. v11}, Lo/we$3;-><init>(Lo/we;Ljava/lang/String;Landroid/os/Bundle;Landroid/content/Context;Lo/wo;)V

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lo/we$5;-><init>(Lo/we;ILjava/lang/String;Lorg/json/JSONObject;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;Landroid/content/Context;)V

    move-object v13, v0

    .line 228
    new-instance v0, Lcom/android/volley/DefaultRetryPolicy;

    const v1, 0x927c

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3}, Lcom/android/volley/DefaultRetryPolicy;-><init>(IIF)V

    invoke-virtual {v13, v0}, Lcom/android/volley/toolbox/JsonObjectRequest;->setRetryPolicy(Lcom/android/volley/RetryPolicy;)Lcom/android/volley/Request;

    .line 230
    invoke-static {p1}, Lo/wi;->e(Landroid/content/Context;)Lo/wi;

    move-result-object v0

    move-object/from16 v1, p3

    invoke-virtual {v0, v13, v1}, Lo/wi;->d(Lcom/android/volley/Request;Ljava/lang/String;)V

    .line 231
    return-void
.end method

.method public e(Landroid/content/Context;Lorg/json/JSONObject;Lo/wo;Landroid/os/Bundle;)V
    .locals 8

    .line 957
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleGetUserProfile begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 958
    const-string v0, "resultCode"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x5208

    if-eq v0, v1, :cond_0

    const-string v0, "resultCode"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x5258

    if-ne v0, v1, :cond_2

    .line 959
    :cond_0
    new-instance v4, Lo/wu;

    invoke-direct {v4}, Lo/wu;-><init>()V

    .line 963
    invoke-static {p1}, Lo/xy;->d(Landroid/content/Context;)Lo/xv;

    move-result-object v5

    .line 964
    invoke-virtual {v5}, Lo/xv;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 965
    invoke-virtual {v5}, Lo/xv;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/we;->d(J)V

    goto :goto_0

    .line 967
    :cond_1
    const-wide/16 v0, -0x1

    invoke-static {v0, v1}, Lo/we;->d(J)V

    .line 969
    :goto_0
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleGetUserProfile "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 970
    invoke-static {p1, p2}, Lo/wl;->c(Landroid/content/Context;Lorg/json/JSONObject;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {}, Lo/we;->b()J

    move-result-wide v1

    invoke-virtual {v4, v0, p1, v1, v2}, Lo/wu;->e(Ljava/util/ArrayList;Landroid/content/Context;J)V

    .line 972
    invoke-static {}, Lo/xp;->e()J

    move-result-wide v6

    .line 973
    const-string v0, "timestamp"

    const-wide/16 v1, 0x64

    sub-long v1, v6, v1

    invoke-static {p1, v0, v1, v2}, Lo/xt;->e(Landroid/content/Context;Ljava/lang/String;J)V

    .line 974
    const-string v0, "PSocial_GetCloudData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleGetUserProfile "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 976
    goto :goto_1

    :cond_2
    const-string v0, "resultCode"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x5282

    if-eq v0, v1, :cond_3

    const-string v0, "resultCode"

    .line 977
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x5283

    if-ne v0, v1, :cond_4

    .line 978
    :cond_3
    invoke-static {p1}, Lo/xy;->b(Landroid/content/Context;)V

    goto :goto_1

    .line 980
    :cond_4
    const/4 v0, 0x0

    if-eq v0, p3, :cond_5

    invoke-interface {p3}, Lo/wo;->e()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 991
    :cond_5
    :goto_1
    goto :goto_2

    .line 985
    :catch_0
    move-exception v4

    .line 986
    const/4 v0, 0x0

    if-eq v0, p3, :cond_6

    invoke-interface {p3}, Lo/wo;->e()V

    .line 987
    :cond_6
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

    .line 992
    :goto_2
    return-void
.end method
