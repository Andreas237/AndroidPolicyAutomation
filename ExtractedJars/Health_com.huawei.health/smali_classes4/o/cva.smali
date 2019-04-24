.class public Lo/cva;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)I
    .locals 2

    .line 64
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 67
    :sswitch_0
    const/4 v1, 0x4

    .line 68
    goto :goto_1

    .line 70
    :sswitch_1
    const/4 v1, 0x5

    .line 71
    goto :goto_1

    .line 73
    :sswitch_2
    const/4 v1, 0x2

    .line 74
    goto :goto_1

    .line 76
    :sswitch_3
    const/4 v1, 0x3

    .line 77
    goto :goto_1

    .line 79
    :sswitch_4
    const/16 v1, 0x8

    .line 80
    goto :goto_1

    .line 82
    :sswitch_5
    const/4 v1, 0x7

    .line 83
    goto :goto_1

    .line 85
    :sswitch_6
    const/4 v1, 0x6

    .line 86
    goto :goto_1

    .line 88
    :sswitch_7
    const/16 v1, 0x9

    .line 89
    goto :goto_1

    .line 91
    :goto_0
    const/4 v1, 0x0

    .line 94
    :goto_1
    return v1

    :sswitch_data_0
    .sparse-switch
        0x4e22 -> :sswitch_1
        0x4e23 -> :sswitch_0
        0x4e24 -> :sswitch_2
        0x4e25 -> :sswitch_3
        0x4e27 -> :sswitch_7
        0x55f1 -> :sswitch_6
        0x55f2 -> :sswitch_5
        0x55f3 -> :sswitch_4
    .end sparse-switch
.end method

.method public static b(I)I
    .locals 4

    .line 143
    sparse-switch p0, :sswitch_data_0

    goto/16 :goto_0

    .line 145
    :sswitch_0
    const/16 v0, 0x105

    return v0

    .line 147
    :sswitch_1
    const/16 v0, 0x104

    return v0

    .line 149
    :sswitch_2
    const/16 v0, 0x103

    return v0

    .line 151
    :sswitch_3
    const/16 v0, 0x102

    return v0

    .line 153
    :sswitch_4
    const/16 v0, 0x101

    return v0

    .line 156
    :sswitch_5
    const/16 v0, 0x108

    return v0

    .line 158
    :sswitch_6
    const/16 v0, 0x106

    return v0

    .line 160
    :sswitch_7
    const/16 v0, 0x109

    return v0

    .line 162
    :sswitch_8
    const/16 v0, 0x117

    return v0

    .line 164
    :sswitch_9
    const/16 v0, 0x10a

    return v0

    .line 166
    :sswitch_a
    const/16 v0, 0x118

    return v0

    .line 169
    :goto_0
    const-string v0, "Debug_HiTypeUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLocalTrackSportType do not has this type yet , cloudType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    const/16 v0, 0x101

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x4 -> :sswitch_3
        0x5 -> :sswitch_4
        0x65 -> :sswitch_5
        0x66 -> :sswitch_6
        0x67 -> :sswitch_7
        0x68 -> :sswitch_9
        0x75 -> :sswitch_8
        0x76 -> :sswitch_a
    .end sparse-switch
.end method

.method public static c(I)I
    .locals 4

    .line 111
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 113
    :pswitch_0
    const/4 v0, 0x1

    return v0

    .line 115
    :pswitch_1
    const/4 v0, 0x2

    return v0

    .line 117
    :pswitch_2
    const/4 v0, 0x3

    return v0

    .line 119
    :pswitch_3
    const/4 v0, 0x4

    return v0

    .line 121
    :pswitch_4
    const/4 v0, 0x5

    return v0

    .line 124
    :pswitch_5
    const/16 v0, 0x65

    return v0

    .line 126
    :pswitch_6
    const/16 v0, 0x66

    return v0

    .line 128
    :pswitch_7
    const/16 v0, 0x67

    return v0

    .line 130
    :pswitch_8
    const/16 v0, 0x75

    return v0

    .line 132
    :pswitch_9
    const/16 v0, 0x68

    return v0

    .line 134
    :pswitch_a
    const/16 v0, 0x76

    return v0

    .line 137
    :goto_0
    :pswitch_b
    const-string v0, "Debug_HiTypeUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCloudTrackSportType do not has this type yet , localType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    const/4 v0, 0x5

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_6
        :pswitch_b
        :pswitch_5
        :pswitch_7
        :pswitch_9
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_8
        :pswitch_a
    .end packed-switch
.end method

.method public static d(I)Ljava/lang/String;
    .locals 1

    .line 175
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 177
    :pswitch_0
    const-string v0, "config_data"

    return-object v0

    .line 179
    :pswitch_1
    const-string v0, "sample_point"

    return-object v0

    .line 181
    :pswitch_2
    const-string v0, "sample_point_health"

    return-object v0

    .line 183
    :pswitch_3
    const-string v0, "config_stat_day"

    return-object v0

    .line 185
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static e(I)I
    .locals 2

    .line 25
    const/4 v1, 0x0

    .line 26
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 28
    :pswitch_0
    const/16 v1, 0x4e23

    .line 29
    goto :goto_0

    .line 31
    :pswitch_1
    const/16 v1, 0x4e22

    .line 32
    goto :goto_0

    .line 34
    :pswitch_2
    const/16 v1, 0x4e24

    .line 35
    goto :goto_0

    .line 37
    :pswitch_3
    const/16 v1, 0x4e25

    .line 38
    goto :goto_0

    .line 40
    :pswitch_4
    const/16 v1, 0x4e24

    .line 41
    goto :goto_0

    .line 43
    :pswitch_5
    const/16 v1, 0x55f1

    .line 44
    goto :goto_0

    .line 46
    :pswitch_6
    const/16 v1, 0x55f2

    .line 47
    goto :goto_0

    .line 49
    :pswitch_7
    const/16 v1, 0x55f3

    .line 50
    goto :goto_0

    .line 52
    :pswitch_8
    const/16 v1, 0x4e27

    .line 53
    nop

    .line 55
    .line 59
    :goto_0
    :pswitch_9
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_4
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method public static e(Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Z"
        }
    .end annotation

    .line 98
    const/4 v1, 0x0

    .line 99
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hihealth/HiHealthData;

    .line 100
    invoke-virtual {v3}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v4

    .line 101
    const/16 v0, 0x4e21

    if-lt v4, v0, :cond_0

    const/16 v0, 0x5208

    if-le v4, v0, :cond_1

    :cond_0
    const v0, 0x9c41

    if-le v4, v0, :cond_2

    const v0, 0xa028

    if-ge v4, v0, :cond_2

    .line 103
    :cond_1
    const/4 v1, 0x1

    .line 104
    goto :goto_1

    .line 106
    :cond_2
    goto :goto_0

    .line 107
    :cond_3
    :goto_1
    return v1
.end method
