.class public Lo/agq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;S)Ljava/lang/String;
    .locals 2

    .line 287
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_result_normal:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 288
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 292
    :sswitch_0
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_result_low:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 293
    goto :goto_0

    .line 297
    :sswitch_1
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_result_normal:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 298
    goto :goto_0

    .line 302
    :sswitch_2
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_result_high:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 303
    goto :goto_0

    .line 307
    :sswitch_3
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_error_result_error:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 308
    .line 316
    :goto_0
    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x8000 -> :sswitch_3
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
    .end sparse-switch
.end method
