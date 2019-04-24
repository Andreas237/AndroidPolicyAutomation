.class public Lo/fhw;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Landroid/content/Context;)V
    .locals 5

    .line 25
    const-string v0, "UIDV_DefaultAiRule"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDefaultAiRule"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 27
    const/16 v0, 0x7530

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-walk-001"

    const-string v2, "{\"airule\":\"ai-walk-001\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"16000\",\"params\":{\"recommended_time\":[{\"start_time\":\"0000\",\"end_time\":\"2400\"}]}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 29
    const/16 v0, 0x7530

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-walk-002"

    const-string v2, "{\"airule\":\"ai-walk-002\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"17000\",\"params\":{\"recommended_time\":[{\"start_time\":\"1800\",\"end_time\":\"2300\"}]}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 31
    const/16 v0, 0x7530

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-walk-003"

    const-string v2, "{\"airule\":\"ai-walk-003\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"3000\",\"params\":{\"recommended_time\":[{\"start_time\":\"1100\",\"end_time\":\"1400\"},{\"start_time\":\"1700\",\"end_time\":\"2000\"}]}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 34
    const/16 v0, 0x7531

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-weight-001"

    const-string v2, "{\"airule\":\"ai-weight-001\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"1000\",\"params\":{\"recently_num_days_have_data\":\"90\"}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 36
    const/16 v0, 0x7531

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-weight-002"

    const-string v2, "{\"airule\":\"ai-weight-002\",\"enable\":true,\"type\":\"listener\",\"params\":{\"suggest_to_set_rational_weight_goal_gap\":\"5\"}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 38
    const/16 v0, 0x7531

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-weight-003"

    const-string v2, "{\"airule\":\"ai-weight-003\",\"enable\":true,\"type\":\"listener\",\"params\":{}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 40
    const/16 v0, 0x7531

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-weight-004"

    const-string v2, "{\"airule\":\"ai-weight-004\",\"enable\":false,\"type\":\"listener\",\"params\":{\"recommend_weight_scale_top_num\":\"3\",\"recently_num_days_have_data\":\"90\"}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 42
    const/16 v0, 0x7531

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-weight-005"

    const-string v2, "{\"airule\":\"ai-weight-005\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"5000\",\"params\":{\"recently_num_days_no_data\":\"5\",\"recommended_time\":[{\"start_time\":\"0600\",\"end_time\":\"1000\"},{\"start_time\":\"1900\",\"end_time\":\"2300\"}]}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 44
    const/16 v0, 0x7531

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-weight-006"

    const-string v2, "{\"airule\":\"ai-weight-006\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"4000\",\"params\":{\"recently_num_days_have_data\":\"90\"}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 46
    const/16 v0, 0x7531

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-weight-007"

    const-string v2, "{\"airule\":\"ai-weight-007\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"15000\",\"params\":{\"recently_num_days_have_data\":\"90\"}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 48
    const/16 v0, 0x7531

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-weight-008"

    const-string v2, "{\"airule\":\"ai-weight-008\",\"enable\":false,\"type\":\"listener\",\"params\":{\"recommend_weight_service_top_num\": \"3\",\"recently_num_days_have_data\":\"90\",\"recently_num_days_change\":\"30\"}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 51
    const/16 v0, 0x7532

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-bloodp-001"

    const-string v2, "{\"airule\":\"ai-bloodp-001\",\"enable\":false,\"type\":\"action\",\"params\":{\"recommend_bloodp_scale_top_num\": \"3\",\"recently_num_days_have_data\":\"90\"}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 53
    const/16 v0, 0x7532

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-bloodp-002"

    const-string v2, "{\"airule\":\"ai-bloodp-002\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"6000\",\"params\":{\"recommended_time\":[{\"start_time\":\"0600\",\"end_time\":\"1000\"},{\"start_time\":\"2000\",\"end_time\":\"2300\"}],\"recently_num_days_no_data\":\"3\"}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 55
    const/16 v0, 0x7532

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-bloodp-003"

    const-string v2, "{\"airule\":\"ai-bloodp-003\",\"enable\":false,\"type\":\"listener\",\"params\":{\"recommend_bloodp_service_top_num\": \"3\",\"recently_num_days_have_data\":\"90\",\"suggest_bloodp_professional_service_average_data\":[{\"month_average_high_bloodp_exceed\":\"140\",\"min_age\":\"40\",\"max_age\":\"50\"},{\"month_average_high_bloodp_exceed\":\"150\",\"min_age\":\"50\",\"max_age\":\"60\"},{\"month_average_high_bloodp_exceed\":\"140\",\"min_age\":\"60\"}]}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 58
    const/16 v0, 0x7533

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-info-001"

    const-string v2, "{\"airule\":\"ai-info-001\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"11000\",\"params\":{\"recently_num_days_have_data\":\"90\",\"recommended_time\":[{\"start_time\":\"0000\",\"end_time\":\"2400\"}]}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 60
    const/16 v0, 0x7533

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-info-002"

    const-string v2, "{\"airule\":\"ai-info-002\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"7000\",\"params\":{\"recommended_time\":[{\"start_time\":\"0000\",\"end_time\":\"2400\"}]}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 62
    const/16 v0, 0x7533

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-info-003"

    const-string v2, "{\"airule\":\"ai-info-003\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"12000\",\"params\":{\"recently_num_days_have_data\":\"90\",\"recommended_time\":[{\"start_time\":\"0000\",\"end_time\":\"2400\"}]}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 64
    const/16 v0, 0x7533

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-info-004"

    const-string v2, "{\"airule\":\"ai-info-004\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"8000\",\"params\":{\"recommended_time\":[{\"start_time\":\"0000\",\"end_time\":\"2400\"}]}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 66
    const/16 v0, 0x7533

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-info-005"

    const-string v2, "{\"airule\":\"ai-info-005\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"9000\",\"params\":{\"recommended_time\":[{\"start_time\":\"0000\",\"end_time\":\"2400\"}]}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 68
    const/16 v0, 0x7533

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-info-006"

    const-string v2, "{\"airule\":\"ai-info-006\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"10000\",\"params\":{\"recommended_time\":[{\"start_time\":\"0000\",\"end_time\":\"2400\"}]}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 70
    const/16 v0, 0x7533

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-info-007"

    const-string v2, "{\"airule\":\"ai-info-007\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"13000\",\"params\":{\"recently_num_days_have_data\":\"90\",\"recommended_time\":[{\"start_time\":\"0000\",\"end_time\":\"2400\"}]}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 72
    const/16 v0, 0x7533

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-info-008"

    const-string v2, "{\"airule\":\"ai-info-008\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"14000\",\"params\":{\"recently_num_days_have_data\":\"90\",\"recommended_time\":[{\"start_time\":\"0000\",\"end_time\":\"2400\"}]}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 74
    const/16 v0, 0x7533

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-info-009"

    const-string v2, "{\"airule\":\"ai-info-009\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"15000\",\"params\":{\"recommended_time\":[{\"start_time\":\"0000\",\"end_time\":\"2400\"}]}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 77
    const/16 v0, 0x7534

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-exception-001"

    const-string v2, "{\"airule\":\"ai-exception-001\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"2000\",\"params\":{\"after_num_date_generate_exception_prompt\":\"7\"}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 79
    const/16 v0, 0x7534

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-exception-002"

    const-string v2, "{\"airule\":\"ai-exception-002\",\"enable\":true,\"params\":{\"after_num_minute_generate_onboarding_prompt\":\"10080\"}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 81
    const/16 v0, 0x7534

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-negativeone-001"

    const-string v2, "{\"airule\":\"ai-negativeone-001\",\"enable\":true,\"params\":{\"message_push_to_negativeone_time\":\"3\"}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 83
    const/16 v0, 0x7534

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-partiactivity-001"

    const-string v2, "{\"airule\":\"ai-partiactivity-001\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"15000\",\"params\":{\"regenerate_time_interval\":\"24\",\"recommended_time\":[{\"start_time\":\"0000\",\"end_time\":\"2400\"}]}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 86
    const/16 v0, 0x7535

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-common-001"

    const-string v2, "{\"airule\":\"ai-common-001\",\"enable\":true,\"params\":{\"message_show_to_smartcard_time\":\"3\"}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 88
    const/16 v0, 0x7535

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-common-002"

    const-string v2, "{\"airule\":\"ai-common-002\",\"enable\":true,\"params\":{\"click_info_time_on_smartcard_oneday\":\"1\"}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 91
    const/16 v0, 0x7536

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-bloodsg-001"

    const-string v2, "{\"airule\":\"ai-bloodsg-001\",\"enable\":false,\"type\":\"action\",\"params\":{\"recommend_bloodsg_scale_top_num\": \"3\",\"recently_num_days_have_data\":\"90\"}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 93
    const/16 v0, 0x7536

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-bloodsg-002"

    const-string v2, "{\"airule\":\"ai-bloodsg-002\",\"enable\":true,\"type\":\"cycle\",\"priority\":\"6000\",\"params\":{\"recommended_time\":[{\"start_time\":\"0000\",\"end_time\":\"2400\"}],\"recently_num_days_no_data\":\"3\"}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 95
    const/16 v0, 0x7536

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ai-bloodsg-003"

    const-string v2, "{\"airule\":\"ai-bloodsg-003\",\"enable\":false,\"type\":\"listener\",\"params\":{\"recommend_bloodsg_service_top_num\": \"3\",\"recently_num_days_have_data\":\"90\"}}"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 99
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "airule_ver"

    const-string v2, "1497511191287"

    invoke-static {p0, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 100
    return-void
.end method
