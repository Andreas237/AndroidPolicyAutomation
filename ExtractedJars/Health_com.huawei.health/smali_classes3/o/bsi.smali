.class public Lo/bsi;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .line 287
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 289
    :sswitch_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_http_server_internal_error:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 290
    goto/16 :goto_1

    .line 296
    :sswitch_1
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_audio_list_is_null:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 297
    goto/16 :goto_1

    .line 302
    :sswitch_2
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_action_list_is_null:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 303
    goto :goto_1

    .line 308
    :sswitch_3
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_action_is_not_exist:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 309
    goto :goto_1

    .line 314
    :sswitch_4
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_video_list_is_null:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 315
    goto :goto_1

    .line 320
    :sswitch_5
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_create_plan_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 321
    goto :goto_1

    .line 326
    :sswitch_6
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_create_plan_not_exist:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 327
    goto :goto_1

    .line 332
    :sswitch_7
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_no_cloud:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 333
    goto :goto_1

    .line 338
    :sswitch_8
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_parament_invalid:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 339
    goto :goto_1

    .line 344
    :sswitch_9
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_module_init_unfinished:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 345
    goto :goto_1

    .line 350
    :sswitch_a
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_unavail_storage_space:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 351
    goto :goto_1

    .line 353
    :goto_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_error_unknow:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 356
    :goto_1
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7 -> :sswitch_a
        -0x6 -> :sswitch_9
        -0x4 -> :sswitch_7
        0x1f4 -> :sswitch_0
        0x1f7 -> :sswitch_1
        0x30d4c -> :sswitch_1
        0x30d4d -> :sswitch_2
        0x30d4e -> :sswitch_3
        0x30d4f -> :sswitch_4
        0x30d50 -> :sswitch_6
        0x30d51 -> :sswitch_5
        0x30d58 -> :sswitch_8
    .end sparse-switch
.end method

.method public static c(I)Ljava/lang/String;
    .locals 1

    .line 367
    const-string v0, ""

    invoke-static {v0, p0}, Lo/bsi;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 368
    const-string v0, ""

    invoke-static {v0, p0}, Lo/bsi;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 369
    :cond_0
    const-string v0, ""

    invoke-static {v0, p0}, Lo/bsi;->d(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 370
    const-string v0, ""

    invoke-static {v0, p0}, Lo/bsi;->d(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 371
    :cond_1
    const-string v0, ""

    invoke-static {v0, p0}, Lo/bsi;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 372
    const-string v0, ""

    invoke-static {v0, p0}, Lo/bsi;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 373
    :cond_2
    const-string v0, ""

    invoke-static {v0, p0}, Lo/bsi;->b(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 374
    const-string v0, ""

    invoke-static {v0, p0}, Lo/bsi;->b(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 376
    :cond_3
    const-string v0, ""

    return-object v0
.end method

.method public static c(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .line 223
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 229
    :sswitch_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_update_planname_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 230
    goto :goto_0

    .line 235
    :sswitch_1
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_server_disconnect:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 236
    goto :goto_0

    .line 241
    :sswitch_2
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_time_invalid:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 242
    goto :goto_0

    .line 247
    :sswitch_3
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_workout_not_exsit:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 248
    goto :goto_0

    .line 253
    :sswitch_4
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_update_plan_remindtime_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 254
    goto :goto_0

    .line 259
    :sswitch_5
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_update_plan_achievement_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 260
    goto :goto_0

    .line 265
    :sswitch_6
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_plan_is_not_exist:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 266
    goto :goto_0

    .line 271
    :sswitch_7
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_plan_is_exist:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 272
    goto :goto_0

    .line 277
    :sswitch_8
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_an_audio_file_not_exist:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 278
    .line 282
    :goto_0
    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x8 -> :sswitch_1
        0x4e25 -> :sswitch_0
        0x4e26 -> :sswitch_2
        0x4e27 -> :sswitch_3
        0x4e28 -> :sswitch_4
        0x4e29 -> :sswitch_5
        0x30d4a -> :sswitch_7
        0x30d4b -> :sswitch_8
        0x30d53 -> :sswitch_6
    .end sparse-switch
.end method

.method public static d(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .line 175
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 177
    :sswitch_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_token_overdue:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 178
    goto :goto_0

    .line 180
    :sswitch_1
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_authentication_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 181
    goto :goto_0

    .line 183
    :sswitch_2
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_system_error:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 184
    goto :goto_0

    .line 186
    :sswitch_3
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_suggestion_have_no_network:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 187
    goto :goto_0

    .line 189
    :sswitch_4
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_cancal:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 190
    goto :goto_0

    .line 192
    :sswitch_5
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_create_path_fail:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 193
    goto :goto_0

    .line 195
    :sswitch_6
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->local_args_fail:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 196
    goto :goto_0

    .line 201
    :sswitch_7
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_user_no_login:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 202
    goto :goto_0

    .line 207
    :sswitch_8
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_posrunplan_invalid_weekinfo:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 208
    goto :goto_0

    .line 213
    :sswitch_9
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_no_plan_doing:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 214
    .line 218
    :goto_0
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x194 -> :sswitch_3
        -0x5 -> :sswitch_6
        -0x3 -> :sswitch_5
        -0x2 -> :sswitch_4
        0x3ec -> :sswitch_0
        0x3ed -> :sswitch_1
        0x270f -> :sswitch_2
        0x4e21 -> :sswitch_7
        0x4e23 -> :sswitch_8
        0x4e24 -> :sswitch_9
    .end sparse-switch
.end method

.method public static e(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .line 133
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 135
    :sswitch_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_http_server_internal_error:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 136
    goto/16 :goto_0

    .line 138
    :sswitch_1
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_server_is_temporarily_inaccessible:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 139
    goto :goto_0

    .line 141
    :sswitch_2
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_sucess:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 142
    goto :goto_0

    .line 144
    :sswitch_3
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_part_success:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 145
    goto :goto_0

    .line 147
    :sswitch_4
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_temp_not_provide:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 148
    goto :goto_0

    .line 150
    :sswitch_5
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_beyond_traffic:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 151
    goto :goto_0

    .line 153
    :sswitch_6
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_server_busy:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 154
    goto :goto_0

    .line 156
    :sswitch_7
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_forced_upgrade:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 157
    goto :goto_0

    .line 159
    :sswitch_8
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_args_valid:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 160
    goto :goto_0

    .line 162
    :sswitch_9
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_args_veri_error:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 163
    goto :goto_0

    .line 165
    :sswitch_a
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_time_out:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 166
    .line 170
    :goto_0
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x1 -> :sswitch_3
        0x2 -> :sswitch_9
        0x63 -> :sswitch_4
        0x64 -> :sswitch_5
        0x65 -> :sswitch_6
        0x1f4 -> :sswitch_0
        0x1f7 -> :sswitch_1
        0x3e7 -> :sswitch_7
        0x3e9 -> :sswitch_8
        0x3eb -> :sswitch_a
    .end sparse-switch
.end method
