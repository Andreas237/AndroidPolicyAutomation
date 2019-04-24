.class public Lcom/newrelic/agent/android/harvest/HarvestConfiguration;
.super Ljava/lang/Object;
.source "HarvestConfiguration.java"


# static fields
.field private static final DEFAULT_ACCOUNT_ID:Ljava/lang/String; = ""

.field private static final DEFAULT_ACTIVITY_TRACE_LENGTH:I = 0xfffe

.field private static final DEFAULT_ACTIVITY_TRACE_MAX_REPORT_ATTEMPTS:I = 0x1

.field private static final DEFAULT_ACTIVITY_TRACE_MIN_UTILIZATION:F = 0.3f

.field private static final DEFAULT_APP_ID:Ljava/lang/String; = ""

.field private static final DEFAULT_ERROR_LIMIT:I = 0x32

.field private static final DEFAULT_MAX_TRANSACTION_AGE:I = 0x258

.field private static final DEFAULT_MAX_TRANSACTION_COUNT:I = 0x3e8

.field private static final DEFAULT_PRIORITY_ENCODING_KEY:Ljava/lang/String; = "d67afc830dab717fd163bfcb0b8b88423e9a1a3b"

.field private static final DEFAULT_REPORT_PERIOD:I = 0x3c

.field private static final DEFAULT_RESPONSE_BODY_LIMIT:I = 0x800

.field private static final DEFAULT_STACK_TRACE_LIMIT:I = 0x64

.field private static defaultHarvestConfiguration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;


# instance fields
.field private account_id:Ljava/lang/String;

.field private activity_trace_max_report_attempts:I

.field private activity_trace_max_size:I

.field private activity_trace_min_utilization:D

.field private application_id:Ljava/lang/String;

.field private at_capture:Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;

.field private collect_network_errors:Z

.field private cross_process_id:Ljava/lang/String;

.field private data_report_period:I

.field private data_token:[I

.field private error_limit:I

.field private priority_encoding_key:Ljava/lang/String;

.field private report_max_transaction_age:I

.field private report_max_transaction_count:I

.field private response_body_limit:I

.field private server_timestamp:J

.field private stack_trace_limit:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setDefaultValues()V

    return-void
.end method

.method public static getDefaultHarvestConfiguration()Lcom/newrelic/agent/android/harvest/HarvestConfiguration;
    .locals 1

    .line 68
    sget-object v0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->defaultHarvestConfiguration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    if-eqz v0, :cond_0

    return-object v0

    .line 70
    :cond_0
    new-instance v0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->defaultHarvestConfiguration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    .line 71
    sget-object v0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->defaultHarvestConfiguration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_16

    .line 256
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto/16 :goto_0

    .line 258
    :cond_1
    check-cast p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    .line 260
    iget-boolean v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->collect_network_errors:Z

    iget-boolean v2, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->collect_network_errors:Z

    if-eq v1, v2, :cond_2

    return v0

    .line 261
    :cond_2
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->data_report_period:I

    iget v2, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->data_report_period:I

    if-eq v1, v2, :cond_3

    return v0

    .line 262
    :cond_3
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->error_limit:I

    iget v2, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->error_limit:I

    if-eq v1, v2, :cond_4

    return v0

    .line 263
    :cond_4
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->report_max_transaction_age:I

    iget v2, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->report_max_transaction_age:I

    if-eq v1, v2, :cond_5

    return v0

    .line 264
    :cond_5
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->report_max_transaction_count:I

    iget v2, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->report_max_transaction_count:I

    if-eq v1, v2, :cond_6

    return v0

    .line 265
    :cond_6
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->response_body_limit:I

    iget v2, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->response_body_limit:I

    if-eq v1, v2, :cond_7

    return v0

    .line 266
    :cond_7
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->stack_trace_limit:I

    iget v2, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->stack_trace_limit:I

    if-eq v1, v2, :cond_8

    return v0

    .line 267
    :cond_8
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_max_size:I

    iget v2, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_max_size:I

    if-eq v1, v2, :cond_9

    return v0

    .line 268
    :cond_9
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_max_report_attempts:I

    iget v2, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_max_report_attempts:I

    if-eq v1, v2, :cond_a

    return v0

    .line 269
    :cond_a
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->cross_process_id:Ljava/lang/String;

    if-nez v1, :cond_b

    iget-object v1, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->cross_process_id:Ljava/lang/String;

    if-eqz v1, :cond_b

    return v0

    .line 270
    :cond_b
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->cross_process_id:Ljava/lang/String;

    if-eqz v1, :cond_c

    iget-object v1, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->cross_process_id:Ljava/lang/String;

    if-nez v1, :cond_c

    return v0

    .line 271
    :cond_c
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->cross_process_id:Ljava/lang/String;

    if-eqz v1, :cond_d

    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->cross_process_id:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v0

    .line 272
    :cond_d
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->priority_encoding_key:Ljava/lang/String;

    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->priority_encoding_key:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v0

    .line 273
    :cond_e
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->account_id:Ljava/lang/String;

    if-nez v1, :cond_f

    iget-object v1, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->account_id:Ljava/lang/String;

    if-eqz v1, :cond_f

    return v0

    .line 274
    :cond_f
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->account_id:Ljava/lang/String;

    if-eqz v1, :cond_10

    iget-object v1, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->account_id:Ljava/lang/String;

    if-nez v1, :cond_10

    return v0

    .line 275
    :cond_10
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->account_id:Ljava/lang/String;

    if-eqz v1, :cond_11

    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->account_id:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v0

    .line 276
    :cond_11
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->application_id:Ljava/lang/String;

    if-nez v1, :cond_12

    iget-object v1, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->application_id:Ljava/lang/String;

    if-eqz v1, :cond_12

    return v0

    .line 277
    :cond_12
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->application_id:Ljava/lang/String;

    if-eqz v1, :cond_13

    iget-object v1, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->application_id:Ljava/lang/String;

    if-nez v1, :cond_13

    return v0

    .line 278
    :cond_13
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->application_id:Ljava/lang/String;

    if-eqz v1, :cond_14

    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->application_id:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v0

    .line 281
    :cond_14
    iget-wide v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_min_utilization:D

    double-to-int v1, v1

    mul-int/lit8 v1, v1, 0x64

    .line 282
    iget-wide v2, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_min_utilization:D

    double-to-int v2, v2

    mul-int/lit8 v2, v2, 0x64

    if-eq v1, v2, :cond_15

    return v0

    .line 286
    :cond_15
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->data_token:[I

    iget-object p1, p1, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->data_token:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    return p1

    :cond_16
    :goto_0
    return v0
.end method

.method public getAccount_id()Ljava/lang/String;
    .locals 1

    .line 243
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->account_id:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    return-object v0
.end method

.method public getActivity_trace_max_report_attempts()I
    .locals 1

    .line 204
    iget v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_max_report_attempts:I

    return v0
.end method

.method public getActivity_trace_max_size()I
    .locals 1

    .line 200
    iget v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_max_size:I

    return v0
.end method

.method public getActivity_trace_min_utilization()D
    .locals 2

    .line 216
    iget-wide v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_min_utilization:D

    return-wide v0
.end method

.method public getApplication_id()Ljava/lang/String;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->application_id:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    return-object v0
.end method

.method public getAt_capture()Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;
    .locals 1

    .line 208
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->at_capture:Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;

    return-object v0
.end method

.method public getCross_process_id()Ljava/lang/String;
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->cross_process_id:Ljava/lang/String;

    return-object v0
.end method

.method public getDataToken()Lcom/newrelic/agent/android/harvest/DataToken;
    .locals 4

    .line 118
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->data_token:[I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 120
    :cond_0
    new-instance v1, Lcom/newrelic/agent/android/harvest/DataToken;

    const/4 v2, 0x0

    aget v2, v0, v2

    const/4 v3, 0x1

    aget v0, v0, v3

    invoke-direct {v1, v2, v0}, Lcom/newrelic/agent/android/harvest/DataToken;-><init>(II)V

    return-object v1
.end method

.method public getData_report_period()I
    .locals 1

    .line 164
    iget v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->data_report_period:I

    return v0
.end method

.method public getData_token()[I
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->data_token:[I

    return-object v0
.end method

.method public getError_limit()I
    .locals 1

    .line 172
    iget v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->error_limit:I

    return v0
.end method

.method public getPriority_encoding_key()Ljava/lang/String;
    .locals 1

    .line 224
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->priority_encoding_key:Ljava/lang/String;

    return-object v0
.end method

.method public getReportMaxTransactionAgeMilliseconds()J
    .locals 4

    .line 180
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->report_max_transaction_age:I

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public getReport_max_transaction_age()I
    .locals 1

    .line 176
    iget v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->report_max_transaction_age:I

    return v0
.end method

.method public getReport_max_transaction_count()I
    .locals 1

    .line 184
    iget v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->report_max_transaction_count:I

    return v0
.end method

.method public getResponse_body_limit()I
    .locals 1

    .line 188
    iget v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->response_body_limit:I

    return v0
.end method

.method public getServer_timestamp()J
    .locals 2

    .line 192
    iget-wide v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->server_timestamp:J

    return-wide v0
.end method

.method public getStack_trace_limit()I
    .locals 1

    .line 196
    iget v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->stack_trace_limit:I

    return v0
.end method

.method public hashCode()I
    .locals 7

    .line 295
    iget-boolean v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->collect_network_errors:Z

    mul-int/lit8 v0, v0, 0x1f

    .line 296
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->cross_process_id:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 297
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->data_report_period:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 298
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->data_token:[I

    if-eqz v1, :cond_1

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 299
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->error_limit:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 300
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->report_max_transaction_age:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 301
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->report_max_transaction_count:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 302
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->response_body_limit:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 303
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->stack_trace_limit:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 304
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_max_size:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 305
    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_max_report_attempts:I

    add-int/2addr v0, v1

    .line 306
    iget-wide v3, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_min_utilization:D

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    mul-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x20

    ushr-long v5, v3, v1

    xor-long/2addr v3, v5

    long-to-int v1, v3

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 308
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->at_capture:Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 309
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->account_id:Ljava/lang/String;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 310
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->application_id:Ljava/lang/String;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 311
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->priority_encoding_key:Ljava/lang/String;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :cond_5
    add-int/2addr v0, v2

    return v0
.end method

.method public isCollect_network_errors()Z
    .locals 1

    .line 156
    iget-boolean v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->collect_network_errors:Z

    return v0
.end method

.method public reconfigure(Lcom/newrelic/agent/android/harvest/HarvestConfiguration;)V
    .locals 2

    .line 75
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->isCollect_network_errors()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setCollect_network_errors(Z)V

    .line 77
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getCross_process_id()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getCross_process_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setCross_process_id(Ljava/lang/String;)V

    .line 80
    :cond_0
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getData_report_period()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setData_report_period(I)V

    .line 82
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getDataToken()Lcom/newrelic/agent/android/harvest/DataToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DataToken;->isValid()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 83
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getData_token()[I

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setData_token([I)V

    .line 85
    :cond_1
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getError_limit()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setError_limit(I)V

    .line 86
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getReport_max_transaction_age()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setReport_max_transaction_age(I)V

    .line 87
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getReport_max_transaction_count()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setReport_max_transaction_count(I)V

    .line 88
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getResponse_body_limit()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setResponse_body_limit(I)V

    .line 89
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getServer_timestamp()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setServer_timestamp(J)V

    .line 90
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getStack_trace_limit()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setStack_trace_limit(I)V

    .line 91
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getActivity_trace_min_utilization()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setActivity_trace_min_utilization(D)V

    .line 93
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getActivity_trace_max_report_attempts()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setActivity_trace_max_report_attempts(I)V

    .line 94
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getAt_capture()Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 95
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getAt_capture()Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setAt_capture(Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;)V

    .line 96
    :cond_2
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getPriority_encoding_key()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setPriority_encoding_key(Ljava/lang/String;)V

    .line 97
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getAccount_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setAccount_id(Ljava/lang/String;)V

    .line 98
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getApplication_id()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setApplication_id(Ljava/lang/String;)V

    return-void
.end method

.method public setAccount_id(Ljava/lang/String;)V
    .locals 0

    .line 250
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->account_id:Ljava/lang/String;

    return-void
.end method

.method public setActivity_trace_max_report_attempts(I)V
    .locals 0

    .line 152
    iput p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_max_report_attempts:I

    return-void
.end method

.method public setActivity_trace_max_size(I)V
    .locals 0

    .line 148
    iput p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_max_size:I

    return-void
.end method

.method public setActivity_trace_min_utilization(D)V
    .locals 0

    .line 220
    iput-wide p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_min_utilization:D

    return-void
.end method

.method public setApplication_id(Ljava/lang/String;)V
    .locals 0

    .line 239
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->application_id:Ljava/lang/String;

    return-void
.end method

.method public setAt_capture(Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;)V
    .locals 0

    .line 212
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->at_capture:Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;

    return-void
.end method

.method public setCollect_network_errors(Z)V
    .locals 0

    .line 102
    iput-boolean p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->collect_network_errors:Z

    return-void
.end method

.method public setCross_process_id(Ljava/lang/String;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->cross_process_id:Ljava/lang/String;

    return-void
.end method

.method public setData_report_period(I)V
    .locals 0

    .line 110
    iput p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->data_report_period:I

    return-void
.end method

.method public setData_token([I)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->data_token:[I

    return-void
.end method

.method public setDefaultValues()V
    .locals 2

    const/4 v0, 0x2

    .line 50
    new-array v0, v0, [I

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setData_token([I)V

    const/4 v0, 0x1

    .line 51
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setCollect_network_errors(Z)V

    const/16 v1, 0x3c

    .line 52
    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setData_report_period(I)V

    const/16 v1, 0x32

    .line 53
    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setError_limit(I)V

    const/16 v1, 0x800

    .line 54
    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setResponse_body_limit(I)V

    const/16 v1, 0x64

    .line 55
    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setStack_trace_limit(I)V

    const/16 v1, 0x258

    .line 56
    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setReport_max_transaction_age(I)V

    const/16 v1, 0x3e8

    .line 57
    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setReport_max_transaction_count(I)V

    const v1, 0xfffe

    .line 58
    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setActivity_trace_max_size(I)V

    .line 59
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setActivity_trace_max_report_attempts(I)V

    const-wide v0, 0x3fd3333340000000L    # 0.30000001192092896

    .line 60
    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setActivity_trace_min_utilization(D)V

    .line 61
    invoke-static {}, Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;->defaultActivityTraceConfiguration()Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setAt_capture(Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;)V

    const-string v0, "d67afc830dab717fd163bfcb0b8b88423e9a1a3b"

    .line 62
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setPriority_encoding_key(Ljava/lang/String;)V

    const-string v0, ""

    .line 63
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setAccount_id(Ljava/lang/String;)V

    const-string v0, ""

    .line 64
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setApplication_id(Ljava/lang/String;)V

    return-void
.end method

.method public setError_limit(I)V
    .locals 0

    .line 124
    iput p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->error_limit:I

    return-void
.end method

.method public setPriority_encoding_key(Ljava/lang/String;)V
    .locals 0

    .line 228
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->priority_encoding_key:Ljava/lang/String;

    return-void
.end method

.method public setReport_max_transaction_age(I)V
    .locals 0

    .line 128
    iput p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->report_max_transaction_age:I

    return-void
.end method

.method public setReport_max_transaction_count(I)V
    .locals 0

    .line 132
    iput p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->report_max_transaction_count:I

    return-void
.end method

.method public setResponse_body_limit(I)V
    .locals 0

    .line 136
    iput p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->response_body_limit:I

    return-void
.end method

.method public setServer_timestamp(J)V
    .locals 0

    .line 140
    iput-wide p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->server_timestamp:J

    return-void
.end method

.method public setStack_trace_limit(I)V
    .locals 0

    .line 144
    iput p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->stack_trace_limit:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 317
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HarvestConfiguration{collect_network_errors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->collect_network_errors:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cross_process_id=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->cross_process_id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", data_report_period="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->data_report_period:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", data_token="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->data_token:[I

    .line 321
    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", error_limit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->error_limit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", report_max_transaction_age="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->report_max_transaction_age:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", report_max_transaction_count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->report_max_transaction_count:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", response_body_limit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->response_body_limit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", server_timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->server_timestamp:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", stack_trace_limit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->stack_trace_limit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", activity_trace_max_size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_max_size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", activity_trace_max_report_attempts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_max_report_attempts:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", activity_trace_min_utilization="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->activity_trace_min_utilization:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", at_capture="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->at_capture:Lcom/newrelic/agent/android/activity/config/ActivityTraceConfiguration;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", priority_encoding_key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->priority_encoding_key:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", account_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->account_id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", application_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->application_id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
