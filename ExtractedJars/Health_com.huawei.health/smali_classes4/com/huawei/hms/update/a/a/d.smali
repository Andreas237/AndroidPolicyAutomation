.class public final Lcom/huawei/hms/update/a/a/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(I)Ljava/lang/String;
    .locals 2

    .line 78
    sparse-switch p0, :sswitch_data_0

    goto/16 :goto_0

    .line 82
    :sswitch_0
    const-string v0, "CHECK_OK"

    return-object v0

    .line 84
    :sswitch_1
    const-string v0, "CHECK_FAILURE"

    return-object v0

    .line 86
    :sswitch_2
    const-string v0, "CHECK_NO_UPDATE"

    return-object v0

    .line 88
    :sswitch_3
    const-string v0, "CHECK_NO_SUPPORTED"

    return-object v0

    .line 92
    :sswitch_4
    const-string v0, "DOWNLOAD_SUCCESS"

    return-object v0

    .line 94
    :sswitch_5
    const-string v0, "DOWNLOADING"

    return-object v0

    .line 96
    :sswitch_6
    const-string v0, "DOWNLOAD_CANCELED"

    return-object v0

    .line 98
    :sswitch_7
    const-string v0, "DOWNLOAD_FAILURE"

    return-object v0

    .line 100
    :sswitch_8
    const-string v0, "DOWNLOAD_NO_SPACE"

    return-object v0

    .line 102
    :sswitch_9
    const-string v0, "DOWNLOAD_NO_STORAGE"

    return-object v0

    .line 104
    :sswitch_a
    const-string v0, "DOWNLOAD_HASH_ERROR"

    return-object v0

    .line 107
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UNKNOWN - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x3e8 -> :sswitch_0
        0x4b1 -> :sswitch_1
        0x4b2 -> :sswitch_2
        0x4b3 -> :sswitch_3
        0x7d0 -> :sswitch_4
        0x834 -> :sswitch_5
        0x835 -> :sswitch_6
        0x899 -> :sswitch_7
        0x89a -> :sswitch_a
        0x89b -> :sswitch_8
        0x89c -> :sswitch_9
    .end sparse-switch
.end method
