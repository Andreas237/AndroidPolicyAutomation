.class public Lcom/huawei/lcagent/client/MetricConstant;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ACTION_POLICY_CONFIGURE_INTENT:Ljava/lang/String; = "com.huawei.lcagent.POLICY_CONFIGURE"

.field public static final ACTION_POLICY_CONF_RESULT_INTENT:Ljava/lang/String; = "com.huawei.lcagent.POLICY_CONF_RESULT"

.field public static final ACTION_RESUME_UPLOAD_INTENT:Ljava/lang/String; = "com.huawei.lcagent.RESUME_UPLOAD"

.field public static final ACTION_SUBMIT_METRIC_INTENT:Ljava/lang/String; = "com.huawei.lcagent.client.ACTION_SUBMIT_METRIC_INTENT"

.field public static final ACTION_UPLOAD_REQUEST_INTENT:Ljava/lang/String; = "com.huawei.lcagent.UPLOAD_REQUEST"

.field public static final ACTION_UPLOAD_RESULT_INTENT:Ljava/lang/String; = "com.huawei.lcagent.UPLOAD_RESULT"

.field public static final APP_METRIC_ID:I = 0x3

.field public static final APP_METRIC_ID_EX:I = 0x67

.field public static final APR_STATISTICS_METRIC_ID:I = 0x9

.field public static final AUDIO_METRIC_ID:I = 0xd

.field public static final AUTO_MODE:I = 0x1

.field public static final AUTO_OFF:I = 0x2

.field public static final AUTO_ON:I = 0x3

.field public static final BATTERY_METRIC_ID:I = 0x8

.field public static final BLUETOOTH_METRIC_ID_EX:I = 0x6b

.field public static final CALL_METRIC_ID:I = 0x7

.field public static final CAMERA_METRIC_ID_EX:I = 0x68

.field public static final COMMUNICATION_METRIC_ID_EX:I = 0x66

.field public static final EX_METRIC_ID_MAX:I = 0x6e

.field public static final EX_METRIC_ID_MIN:I = 0x64

.field public static final GPS_METRIC_ID:I = 0xe

.field public static final GPS_METRIC_ID_EX:I = 0x6c

.field public static final INTERNET_METRIC_ID:I = 0x5

.field public static final JANK_METRIC_ID:I = 0xb

.field public static final LEVEL_A:I = 0x1

.field public static final LEVEL_B:I = 0x10

.field public static final LEVEL_C:I = 0x100

.field public static final LEVEL_D:I = 0x1000

.field public static final LOG_TRACK_METRIC_ID:I = 0xc

.field public static final MANUAL_MODE:I = 0x0

.field public static final MANUAL_OFF:I = 0x0

.field public static final MANUAL_ON:I = 0x1

.field public static final METRIC_ID_MAX:I = 0x100

.field public static final METRIC_ID_MIN:I = 0x0

.field public static final METRIC_ID_TEMPERATURE:I = 0xa

.field public static final OTHER_METRIC_ID_EX:I = 0x64

.field public static final POWER_METRIC_ID_EX:I = 0x69

.field public static final RADIO_METRIC_ID:I = 0x1

.field public static final REBOOT_METRIC_ID:I = 0x2

.field public static final REBOOT_METRIC_ID_EX:I = 0x65

.field public static final SCREEN_METRIC_ID_EX:I = 0x6d

.field public static final SDCARD_METRIC_ID_EX:I = 0x6e

.field public static final SIM_METRIC_ID:I = 0x6

.field public static final SWITCH_OFF:I = 0x0

.field public static final SWITCH_ON:I = 0x1

.field public static final TOUCH_METRIC_ID:I = 0x4

.field public static final WIFI_METRIC_ID:I = 0xf

.field public static final WIFI_METRIC_ID_EX:I = 0x6a


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getStringID(I)Ljava/lang/String;
    .locals 2

    .line 119
    const/4 v1, 0x0

    .line 120
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 122
    :pswitch_0
    const-string v1, "LOG_CHR"

    .line 123
    goto :goto_1

    .line 125
    :pswitch_1
    const-string v1, "GPS_CHR"

    .line 126
    goto :goto_1

    .line 128
    :pswitch_2
    const-string v1, "WIFI_CHR"

    .line 129
    goto :goto_1

    .line 131
    :pswitch_3
    const-string v1, "Reboot"

    .line 132
    goto :goto_1

    .line 134
    :pswitch_4
    const-string v1, "App"

    .line 135
    goto :goto_1

    .line 137
    :pswitch_5
    const-string v1, "Touch"

    .line 138
    goto :goto_1

    .line 140
    :pswitch_6
    const-string v1, "Internet"

    .line 141
    goto :goto_1

    .line 143
    :pswitch_7
    const-string v1, "Sim"

    .line 144
    goto :goto_1

    .line 146
    :pswitch_8
    const-string v1, "Call"

    .line 147
    goto :goto_1

    .line 149
    :pswitch_9
    const-string v1, "Battery"

    .line 150
    goto :goto_1

    .line 152
    :goto_0
    :pswitch_a
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 155
    :goto_1
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static isValidMetricId(I)Z
    .locals 1

    .line 108
    const/16 v0, 0x100

    if-ge p0, v0, :cond_0

    if-gtz p0, :cond_1

    .line 109
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 112
    :cond_1
    const/4 v0, 0x1

    return v0
.end method
