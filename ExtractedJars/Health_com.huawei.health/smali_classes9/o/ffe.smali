.class public Lo/ffe;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:F

.field private c:J

.field private d:I

.field private e:F

.field private f:J

.field private g:J

.field private h:I

.field private i:I

.field private k:I

.field private l:I

.field private m:I

.field private o:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const/4 v0, 0x0

    iput v0, p0, Lo/ffe;->o:I

    .line 30
    const/4 v0, 0x0

    iput v0, p0, Lo/ffe;->m:I

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lo/ffe;->l:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 51
    iget v0, p0, Lo/ffe;->h:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 185
    iput p1, p0, Lo/ffe;->k:I

    .line 186
    return-void
.end method

.method public a(J)V
    .locals 0

    .line 193
    iput-wide p1, p0, Lo/ffe;->g:J

    .line 194
    return-void
.end method

.method public b()F
    .locals 1

    .line 35
    iget v0, p0, Lo/ffe;->b:F

    return v0
.end method

.method public b(F)V
    .locals 0

    .line 205
    iput p1, p0, Lo/ffe;->e:F

    .line 206
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 180
    iput p1, p0, Lo/ffe;->i:I

    .line 181
    return-void
.end method

.method public b(J)V
    .locals 0

    .line 168
    iput-wide p1, p0, Lo/ffe;->c:J

    .line 169
    return-void
.end method

.method public c()I
    .locals 1

    .line 47
    iget v0, p0, Lo/ffe;->d:I

    return v0
.end method

.method public c(FI)V
    .locals 0

    .line 162
    iput p1, p0, Lo/ffe;->b:F

    .line 163
    iput p2, p0, Lo/ffe;->h:I

    .line 164
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 176
    iput p1, p0, Lo/ffe;->d:I

    .line 177
    return-void
.end method

.method public d()J
    .locals 2

    .line 39
    iget-wide v0, p0, Lo/ffe;->c:J

    return-wide v0
.end method

.method public d(I)V
    .locals 0

    .line 197
    iput p1, p0, Lo/ffe;->o:I

    .line 198
    return-void
.end method

.method public e()F
    .locals 1

    .line 43
    iget v0, p0, Lo/ffe;->a:F

    return v0
.end method

.method public e(F)V
    .locals 0

    .line 172
    iput p1, p0, Lo/ffe;->a:F

    .line 173
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 201
    iput p1, p0, Lo/ffe;->m:I

    .line 202
    return-void
.end method

.method public e(J)V
    .locals 0

    .line 189
    iput-wide p1, p0, Lo/ffe;->f:J

    .line 190
    return-void
.end method

.method public f()I
    .locals 2

    .line 72
    const/4 v1, 0x0

    .line 73
    iget v0, p0, Lo/ffe;->d:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 75
    :pswitch_0
    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_run:I

    .line 76
    goto :goto_1

    .line 78
    :pswitch_1
    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_walk:I

    .line 79
    goto :goto_1

    .line 81
    :pswitch_2
    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_bike:I

    .line 82
    goto :goto_1

    .line 84
    :pswitch_3
    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_indoor_swim:I

    .line 85
    goto :goto_1

    .line 87
    :pswitch_4
    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_outdoor_swim:I

    .line 88
    goto :goto_1

    .line 90
    :pswitch_5
    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_indoorrunning:I

    .line 91
    goto :goto_1

    .line 93
    :pswitch_6
    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_cross_country_running:I

    .line 94
    goto :goto_1

    .line 96
    :pswitch_7
    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_indoor_bike:I

    .line 97
    goto :goto_1

    .line 99
    :pswitch_8
    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_other_sport:I

    .line 100
    goto :goto_1

    .line 102
    :pswitch_9
    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_mountaineering:I

    .line 103
    goto :goto_1

    .line 105
    :goto_0
    :pswitch_a
    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_run:I

    .line 108
    :goto_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_9
        :pswitch_a
        :pswitch_3
        :pswitch_a
        :pswitch_5
        :pswitch_7
        :pswitch_4
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_8
        :pswitch_6
    .end packed-switch
.end method

.method public g()I
    .locals 1

    .line 64
    iget v0, p0, Lo/ffe;->l:I

    return v0
.end method

.method public h()I
    .locals 3

    .line 116
    iget v0, p0, Lo/ffe;->k:I

    invoke-static {v0}, Lo/ffk;->e(I)I

    move-result v2

    .line 117
    iget v0, p0, Lo/ffe;->o:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 118
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_sporthistory_add:I

    return v0

    .line 120
    :cond_0
    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 122
    :pswitch_0
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_sporthistory_bracelet:I

    return v0

    .line 124
    :pswitch_1
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_sporthistory_watch:I

    return v0

    .line 126
    :pswitch_2
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_sporthistory_headphones:I

    return v0

    .line 129
    :goto_0
    :pswitch_3
    iget v0, p0, Lo/ffe;->i:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 131
    :sswitch_0
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_history_autotrack:I

    return v0

    .line 133
    :sswitch_1
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_sporthistory_nike:I

    return v0

    .line 135
    :sswitch_2
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_sporthistory_huawei_wear:I

    return v0

    .line 138
    :sswitch_3
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_sporthistory_bracelet:I

    return v0

    .line 140
    :sswitch_4
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_sporthistory_watch:I

    return v0

    .line 142
    :sswitch_5
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_sporthistory_headphones:I

    return v0

    .line 144
    :sswitch_6
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_sporthistory_else:I

    return v0

    .line 150
    :goto_1
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_3
        0x5 -> :sswitch_4
        0x6 -> :sswitch_5
        0xc7 -> :sswitch_6
        0xc8 -> :sswitch_1
    .end sparse-switch
.end method

.method public i()J
    .locals 2

    .line 56
    iget-wide v0, p0, Lo/ffe;->f:J

    return-wide v0
.end method

.method public i(I)V
    .locals 0

    .line 209
    iput p1, p0, Lo/ffe;->l:I

    .line 210
    return-void
.end method

.method public k()J
    .locals 2

    .line 60
    iget-wide v0, p0, Lo/ffe;->g:J

    return-wide v0
.end method

.method public l()F
    .locals 1

    .line 158
    iget v0, p0, Lo/ffe;->e:F

    return v0
.end method

.method public m()I
    .locals 1

    .line 154
    iget v0, p0, Lo/ffe;->m:I

    return v0
.end method
