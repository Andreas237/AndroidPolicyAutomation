.class public final Lcom/scandit/parser/Parser;
.super Lcom/scandit/recognition/NativeHandle;
.source "Parser.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# direct methods
.method public constructor <init>(Lcom/scandit/recognition/RecognitionContext;I)V
    .locals 0

    .line 22
    invoke-static {p1, p2}, Lcom/scandit/parser/Parser;->initContext(Lcom/scandit/recognition/RecognitionContext;I)J

    move-result-wide p1

    invoke-direct {p0, p1, p2}, Lcom/scandit/recognition/NativeHandle;-><init>(J)V

    return-void
.end method

.method private static initContext(Lcom/scandit/recognition/RecognitionContext;I)J
    .locals 6

    const/4 v0, 0x1

    .line 26
    new-array v0, v0, [J

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    aput-wide v1, v0, v3

    .line 29
    invoke-virtual {p0}, Lcom/scandit/recognition/RecognitionContext;->getHandle()J

    move-result-wide v4

    invoke-static {v4, v5, p1, v0}, Lcom/scandit/recognition/Native;->sp_parser_new_with_context(JI[J)J

    move-result-wide p0

    .line 30
    aget-wide v3, v0, v3

    cmp-long v0, p0, v1

    if-eqz v0, :cond_0

    .line 31
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_RECOGNITION_CONTEXT_STATUS_SUCCESS_get()I

    move-result v0

    int-to-long v0, v0

    cmp-long v2, v3, v0

    if-nez v2, :cond_0

    return-wide p0

    .line 32
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    long-to-int p1, v3

    invoke-static {p1}, Lcom/scandit/recognition/Native;->sc_context_status_flag_get_message(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public parseRawData([B)Lcom/scandit/parser/ParserResult;
    .locals 18

    const/4 v0, 0x1

    .line 42
    new-array v0, v0, [J

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    aput-wide v1, v0, v3

    move-object/from16 v4, p0

    .line 44
    iget-wide v5, v4, Lcom/scandit/parser/Parser;->mNative:J

    move-object/from16 v7, p1

    invoke-static {v5, v6, v7, v0}, Lcom/scandit/recognition/Native;->sp_parser_parse_string(J[B[J)I

    .line 45
    aget-wide v5, v0, v3

    cmp-long v0, v5, v1

    if-eqz v0, :cond_2

    .line 51
    :try_start_0
    invoke-static {v5, v6}, Lcom/scandit/recognition/Native;->sp_parser_result_is_ok(J)I

    move-result v0

    if-eqz v0, :cond_1

    .line 59
    invoke-static {v5, v6}, Lcom/scandit/recognition/Native;->sp_parser_result_get_fields_count(J)J

    move-result-wide v0

    long-to-int v2, v0

    .line 60
    new-array v2, v2, [Lcom/scandit/parser/Field;

    .line 61
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const/4 v8, 0x0

    :goto_0
    int-to-long v9, v8

    cmp-long v11, v9, v0

    if-gez v11, :cond_0

    .line 64
    invoke-static {v5, v6, v9, v10}, Lcom/scandit/recognition/Native;->sp_parser_result_get_field_by_index(JJ)J

    move-result-wide v9

    .line 66
    invoke-static {v9, v10}, Lcom/scandit/recognition/Native;->sp_field_get_name(J)J

    move-result-wide v11

    .line 67
    invoke-static {v9, v10}, Lcom/scandit/recognition/Native;->sp_field_get_string_value(J)J

    move-result-wide v13

    .line 68
    invoke-static {v9, v10}, Lcom/scandit/recognition/Native;->sp_field_get_json_values(J)J

    move-result-wide v9

    .line 70
    invoke-static {v11, v12}, Lcom/scandit/recognition/Native;->SpData_c_str_get(J)Ljava/lang/String;

    move-result-object v15

    .line 71
    invoke-static {v13, v14}, Lcom/scandit/recognition/Native;->SpData_c_str_get(J)Ljava/lang/String;

    move-result-object v3

    move-wide/from16 v16, v0

    .line 72
    invoke-static {v9, v10}, Lcom/scandit/recognition/Native;->SpData_c_str_get(J)Ljava/lang/String;

    move-result-object v0

    .line 74
    invoke-static {v11, v12}, Lcom/scandit/recognition/Native;->sp_data_free(J)V

    .line 75
    invoke-static {v13, v14}, Lcom/scandit/recognition/Native;->sp_data_free(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 80
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "["

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 81
    new-instance v1, Lorg/json/JSONArray;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/JSONArrayInstrumentation;->init(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    const/4 v1, 0x0

    .line 82
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/scandit/parser/ParserTools;->translateJSONToObject(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    :try_start_2
    invoke-static {v9, v10}, Lcom/scandit/recognition/Native;->sp_data_free(J)V

    .line 90
    new-instance v9, Lcom/scandit/parser/Field;

    invoke-direct {v9, v15, v3, v0}, Lcom/scandit/parser/Field;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 91
    aput-object v9, v2, v8

    .line 92
    invoke-interface {v7, v15, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    add-int/lit8 v8, v8, 0x1

    move-wide/from16 v0, v16

    const/4 v3, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 85
    :catch_0
    :try_start_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "JSON Parsing failed due to unknown reason"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 87
    :goto_1
    :try_start_4
    invoke-static {v9, v10}, Lcom/scandit/recognition/Native;->sp_data_free(J)V

    throw v0

    .line 95
    :cond_0
    invoke-static {v5, v6}, Lcom/scandit/recognition/Native;->sp_parser_result_get_json_values(J)J

    move-result-wide v0

    .line 96
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->SpData_c_str_get(J)Ljava/lang/String;

    move-result-object v3

    .line 97
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sp_data_free(J)V

    .line 99
    new-instance v0, Lcom/scandit/parser/ParserResult;

    invoke-direct {v0, v2, v7, v3}, Lcom/scandit/parser/ParserResult;-><init>([Lcom/scandit/parser/Field;Ljava/util/Map;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 101
    invoke-static {v5, v6}, Lcom/scandit/recognition/Native;->sp_parser_result_free(J)V

    return-object v0

    .line 52
    :cond_1
    :try_start_5
    invoke-static {v5, v6}, Lcom/scandit/recognition/Native;->sp_parser_result_get_error_message(J)J

    move-result-wide v0

    .line 53
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->SpData_c_str_get(J)Ljava/lang/String;

    move-result-object v2

    .line 54
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sp_data_free(J)V

    .line 55
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_2

    .line 49
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Parsing failed due to unknown reason"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 101
    :goto_2
    invoke-static {v5, v6}, Lcom/scandit/recognition/Native;->sp_parser_result_free(J)V

    throw v0
.end method

.method public parseString(Ljava/lang/String;)Lcom/scandit/parser/ParserResult;
    .locals 1

    .line 38
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/scandit/parser/Parser;->parseRawData([B)Lcom/scandit/parser/ParserResult;

    move-result-object p1

    return-object p1
.end method

.method protected release(J)V
    .locals 0

    .line 107
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->sp_parser_free(J)V

    return-void
.end method
