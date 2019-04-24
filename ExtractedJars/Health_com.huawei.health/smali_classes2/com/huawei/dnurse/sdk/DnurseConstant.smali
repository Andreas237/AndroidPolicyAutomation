.class public Lcom/huawei/dnurse/sdk/DnurseConstant;
.super Ljava/lang/Object;


# static fields
.field public static final COMMUNICATING:I = 0x1

.field public static final DATA_DATETIME:I = 0x2

.field public static final DATA_VALUE:I = 0x1

.field public static final DEVICE_RECOGNIZED:I = 0x3

.field public static final DEVICE_RECOGNIZING:I = 0x2

.field public static final DEVICE_SLEEP:I = 0x9

.field public static final DEVICE_SN:I = 0x3

.field public static final ERR_NON_CALIBRATE:I = 0xb

.field public static final ERR_PLAY_AUDIO:I = 0xe

.field public static final ERR_RECOGNIZE:I = 0x10

.field public static final ERR_RECORD_AUDIO:I = 0xf

.field public static final ERR_TEMPERATURE_HIGH:I = 0xd

.field public static final ERR_TEMPERATURE_LOW:I = 0xc

.field public static final ERR_TIME_OUT:I = 0x11

.field public static final ERR_VOLTAGE_LOW:I = 0xa

.field public static final MAX_VALUE:F = 33.3f

.field public static final MIN_VALUE:F = 1.1f

.field public static final NOT_INSERTED:I = 0x0

.field public static final OLD_TEST_PAPER_INSERTED:I = 0x5

.field public static final START_TEST:I = 0x7

.field public static final TEST_FINISH:I = 0x8

.field public static final TEST_PAPER_INSERTED:I = 0x4

.field public static final TEST_PAPER_REMOVED:I = 0x6


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static formatValue(F)Ljava/lang/String;
    .locals 6

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-nez v0, :cond_0

    const-string v5, ""

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/huawei/dnurse/sdk/DnurseConstant;->isLowValue(F)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v5, "LOW"

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lcom/huawei/dnurse/sdk/DnurseConstant;->isHighValue(F)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v5, "HIGH"

    goto :goto_0

    :cond_2
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%.1f"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    :goto_0
    return-object v5
.end method

.method public static isHighValue(F)Z
    .locals 1

    const v0, 0x42053333    # 33.3f

    invoke-static {p0, v0}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isLowValue(F)Z
    .locals 1

    const v0, 0x3f8ccccd    # 1.1f

    invoke-static {p0, v0}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isWorking(I)Z
    .locals 1

    packed-switch p0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
