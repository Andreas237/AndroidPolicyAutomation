.class public Lo/cno;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)Z
    .locals 1

    .line 165
    if-lez p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static a(ID)Z
    .locals 1

    .line 118
    packed-switch p0, :pswitch_data_0

    goto :goto_3

    .line 123
    :pswitch_0
    double-to-int v0, p1

    invoke-static {v0}, Lo/cno;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Lo/cno;->e(D)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 125
    :pswitch_1
    double-to-int v0, p1

    invoke-static {v0}, Lo/cno;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Lo/cno;->e(D)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0

    .line 127
    :pswitch_2
    invoke-static {p1, p2}, Lo/cno;->c(D)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1, p2}, Lo/cno;->e(D)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    return v0

    .line 129
    :goto_3
    :pswitch_3
    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x9c42
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static b(D)Z
    .locals 4

    .line 186
    const-wide v0, 0x4097700000000000L    # 1500.0

    sub-double v0, p0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static b(F)Z
    .locals 1

    .line 172
    const/4 v0, 0x0

    cmpl-float v0, p0, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static b(I)Z
    .locals 1

    .line 151
    const v0, 0xafc80

    if-ge p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static c(D)Z
    .locals 4

    .line 193
    const-wide v0, 0x41407ac000000000L    # 2160000.0

    sub-double v0, p0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static c(I)Z
    .locals 1

    .line 144
    const/high16 v0, 0x10000

    if-ge p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static d(I)Z
    .locals 1

    .line 158
    const/high16 v0, 0x5a00000

    if-ge p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static d(ILcom/huawei/hihealth/HiHealthData;)Z
    .locals 3

    .line 89
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v1

    .line 90
    sparse-switch p0, :sswitch_data_0

    goto/16 :goto_5

    .line 92
    :sswitch_0
    double-to-int v0, v1

    invoke-static {v0}, Lo/cno;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v1, v2}, Lo/cno;->e(D)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 94
    :sswitch_1
    double-to-int v0, v1

    invoke-static {v0}, Lo/cno;->c(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v1, v2}, Lo/cno;->e(D)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0

    .line 96
    :sswitch_2
    invoke-static {v1, v2}, Lo/cno;->b(D)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {v1, v2}, Lo/cno;->e(D)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    return v0

    .line 98
    :sswitch_3
    double-to-int v0, v1

    invoke-static {v0}, Lo/cno;->g(I)Z

    move-result v0

    return v0

    .line 100
    :sswitch_4
    invoke-static {v1, v2}, Lo/cno;->e(D)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    return v0

    .line 105
    :sswitch_5
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x1

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    :goto_4
    return v0

    .line 107
    :goto_5
    invoke-static {v1, v2}, Lo/cno;->e(D)Z

    move-result v0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x4 -> :sswitch_1
        0x5 -> :sswitch_2
        0x7 -> :sswitch_3
        0x7f2 -> :sswitch_4
        0x7f3 -> :sswitch_5
        0x7f4 -> :sswitch_5
        0x7f5 -> :sswitch_5
        0x835 -> :sswitch_5
    .end sparse-switch
.end method

.method public static e(D)Z
    .locals 2

    .line 179
    const-wide/16 v0, 0x0

    cmpl-double v0, p0, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e(I)Z
    .locals 1

    .line 137
    const/16 v0, 0x1f4

    if-ge p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e(ID)Z
    .locals 1

    .line 72
    packed-switch p0, :pswitch_data_0

    goto :goto_3

    .line 74
    :pswitch_0
    double-to-int v0, p1

    invoke-static {v0}, Lo/cno;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Lo/cno;->e(D)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 76
    :pswitch_1
    double-to-int v0, p1

    invoke-static {v0}, Lo/cno;->c(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Lo/cno;->e(D)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0

    .line 78
    :pswitch_2
    invoke-static {p1, p2}, Lo/cno;->b(D)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1, p2}, Lo/cno;->e(D)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    return v0

    .line 80
    :goto_3
    :pswitch_3
    invoke-static {p1, p2}, Lo/cno;->e(D)Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static g(I)Z
    .locals 1

    .line 204
    const/4 v0, 0x1

    if-lt p0, v0, :cond_0

    const/16 v0, 0x63

    if-gt p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
