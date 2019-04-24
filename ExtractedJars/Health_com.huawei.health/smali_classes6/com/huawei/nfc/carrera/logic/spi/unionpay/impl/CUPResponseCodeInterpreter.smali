.class Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPResponseCodeInterpreter;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final CUP_RESULT_CODE_ALLREADY_DELETED:I = 0x3baecc56

.field static final CUP_RESULT_CODE_ALLREADY_DOWNLOADED:I = 0x3baecc50

.field static final CUP_RESULT_CODE_ALLREADY_DOWNLOADED1:I = 0x3bc8bcf0

.field static final CUP_RESULT_CODE_APPLET_INSTALL_FAIL:I = 0x3baecd0e

.field static final CUP_RESULT_CODE_APPLET_UNEXISTS:I = 0x3baecc4b

.field static final CUP_RESULT_CODE_CARD_STATE_ERR:I = 0x3baecc6f

.field static final CUP_RESULT_CODE_CMD_ERR:I = 0x3baecd6f

.field static final CUP_RESULT_CODE_CMD_ERR1:I = 0x3bc890cb

.field static final CUP_RESULT_CODE_PERSONLIZED_ERR:I = 0x3baecc5b

.field static final CUP_RESULT_CODE_PERSONLIZING_DATA_UNEXISTS:I = 0x3baecc5e

.field static final CUP_RESULT_CODE_SUCCESS:I = 0x2710

.field static final CUP_RESULT_CODE_UPTSM_ERR:I = 0x3baecb7e

.field static final CUP_RESULT_TSM_SERVICE_KILLED_EXCEPTION:I = 0x1869f


# direct methods
.method constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method translateReponseCode(ILjava/lang/String;Ljava/lang/String;)I
    .locals 8

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123===translateReponseCode responseCodeStr = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 93
    const/16 v4, -0x63

    .line 95
    rem-int/lit16 v0, p1, 0x2710

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 96
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123===enter isNetworkErr ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 97
    if-eqz v5, :cond_1

    .line 99
    const/4 v4, -0x3

    .line 100
    return v4

    .line 103
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 104
    sparse-switch v6, :sswitch_data_0

    goto/16 :goto_1

    .line 110
    :sswitch_0
    const/4 v4, 0x0

    .line 111
    goto :goto_2

    .line 113
    :sswitch_1
    const/4 v4, -0x4

    .line 114
    goto :goto_2

    .line 119
    :sswitch_2
    const/4 v4, -0x6

    .line 120
    goto :goto_2

    .line 125
    :sswitch_3
    const/4 v4, -0x7

    .line 126
    goto :goto_2

    .line 128
    :goto_1
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 129
    const-string v0, "fail_reason"

    invoke-interface {v7, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    const-string v0, "fail_action"

    invoke-interface {v7, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    const-string v0, "fail_code"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    const-string v0, "not send from ese broadcast"

    const v1, 0x3611a3fb

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v7, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 136
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123===translateReponseCode responseCode123 = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 138
    return v4

    :sswitch_data_0
    .sparse-switch
        0x2710 -> :sswitch_0
        0x1869f -> :sswitch_1
        0x3baecb7e -> :sswitch_3
        0x3baecc4b -> :sswitch_3
        0x3baecc50 -> :sswitch_0
        0x3baecc56 -> :sswitch_0
        0x3baecc5b -> :sswitch_2
        0x3baecc5e -> :sswitch_3
        0x3baecc6f -> :sswitch_3
        0x3baecd0e -> :sswitch_2
        0x3baecd6f -> :sswitch_2
        0x3bc890cb -> :sswitch_2
        0x3bc8bcf0 -> :sswitch_0
    .end sparse-switch
.end method
