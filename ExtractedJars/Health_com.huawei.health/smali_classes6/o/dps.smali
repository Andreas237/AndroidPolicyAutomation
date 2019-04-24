.class public abstract Lo/dps;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field private a:Z

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dps;->a:Z

    .line 18
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dps;->d:Z

    return-void
.end method

.method private c(Ljava/lang/Object;)V
    .locals 5

    .line 92
    move-object v4, p1

    :try_start_0
    check-cast v4, Lo/dow;

    .line 93
    invoke-static {}, Lo/dpm;->m()Lo/doy;

    move-result-object v0

    iget v0, v0, Lo/doy;->t:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 94
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATUS_NEW_VERSION_NOT_AVAILABLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dps;->a(I)V

    goto :goto_0

    .line 96
    :cond_0
    invoke-static {}, Lo/dpm;->m()Lo/doy;

    move-result-object v0

    iget v0, v0, Lo/doy;->t:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 97
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATUS_SYSTEM_ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/dps;->a(I)V

    goto :goto_0

    .line 99
    :cond_1
    invoke-static {}, Lo/dpm;->m()Lo/doy;

    move-result-object v0

    iget v0, v0, Lo/doy;->t:I

    if-nez v0, :cond_2

    .line 100
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATUS_NEW_VERSION_AVAILABLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    invoke-virtual {p0, v4}, Lo/dps;->d(Lo/dow;)V

    goto :goto_0

    .line 103
    :cond_2
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FAILED_REASON_UNKNOWN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lo/dps;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    :goto_0
    goto :goto_1

    .line 106
    :catch_0
    move-exception v4

    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleMessage CHECK_VERSION_STATUS_SUCCESS, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    :goto_1
    return-void
.end method

.method private e(Ljava/lang/Object;)V
    .locals 5

    .line 113
    move-object v4, p1

    :try_start_0
    check-cast v4, Lo/dow;

    .line 114
    iget-boolean v0, p0, Lo/dps;->a:Z

    if-eqz v0, :cond_3

    .line 115
    invoke-static {}, Lo/dpm;->p()Lo/doy;

    move-result-object v0

    iget v0, v0, Lo/doy;->t:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 116
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check band STATUS_NEW_VERSION_NOT_AVAILABLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dps;->a(I)V

    goto/16 :goto_0

    .line 118
    :cond_0
    invoke-static {}, Lo/dpm;->p()Lo/doy;

    move-result-object v0

    iget v0, v0, Lo/doy;->t:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 119
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check band STATUS_SYSTEM_ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/dps;->a(I)V

    goto/16 :goto_0

    .line 121
    :cond_1
    invoke-static {}, Lo/dpm;->p()Lo/doy;

    move-result-object v0

    iget v0, v0, Lo/doy;->t:I

    if-nez v0, :cond_2

    .line 122
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check band STATUS_NEW_VERSION_AVAILABLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    invoke-virtual {p0, v4}, Lo/dps;->d(Lo/dow;)V

    goto/16 :goto_0

    .line 125
    :cond_2
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check band FAILED_REASON_UNKNOWN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lo/dps;->a(I)V

    goto/16 :goto_0

    .line 128
    :cond_3
    iget-boolean v0, p0, Lo/dps;->d:Z

    if-eqz v0, :cond_7

    .line 129
    invoke-static {}, Lo/dpm;->n()Lo/doy;

    move-result-object v0

    iget v0, v0, Lo/doy;->t:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 130
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check band STATUS_NEW_VERSION_NOT_AVAILABLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dps;->a(I)V

    goto/16 :goto_0

    .line 132
    :cond_4
    invoke-static {}, Lo/dpm;->n()Lo/doy;

    move-result-object v0

    iget v0, v0, Lo/doy;->t:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_5

    .line 133
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check band STATUS_SYSTEM_ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/dps;->a(I)V

    goto/16 :goto_0

    .line 135
    :cond_5
    invoke-static {}, Lo/dpm;->n()Lo/doy;

    move-result-object v0

    iget v0, v0, Lo/doy;->t:I

    if-nez v0, :cond_6

    .line 136
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check band STATUS_NEW_VERSION_AVAILABLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    invoke-virtual {p0, v4}, Lo/dps;->d(Lo/dow;)V

    goto/16 :goto_0

    .line 139
    :cond_6
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check band FAILED_REASON_UNKNOWN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lo/dps;->a(I)V

    goto :goto_0

    .line 143
    :cond_7
    invoke-static {}, Lo/dpm;->l()Lo/doy;

    move-result-object v0

    iget v0, v0, Lo/doy;->t:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 144
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check band STATUS_NEW_VERSION_NOT_AVAILABLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dps;->a(I)V

    goto :goto_0

    .line 146
    :cond_8
    invoke-static {}, Lo/dpm;->l()Lo/doy;

    move-result-object v0

    iget v0, v0, Lo/doy;->t:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_9

    .line 147
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check band STATUS_SYSTEM_ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/dps;->a(I)V

    goto :goto_0

    .line 149
    :cond_9
    invoke-static {}, Lo/dpm;->l()Lo/doy;

    move-result-object v0

    iget v0, v0, Lo/doy;->t:I

    if-nez v0, :cond_a

    .line 150
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check band STATUS_NEW_VERSION_AVAILABLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    invoke-virtual {p0, v4}, Lo/dps;->d(Lo/dow;)V

    goto :goto_0

    .line 153
    :cond_a
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check band FAILED_REASON_UNKNOWN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lo/dps;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    :goto_0
    goto :goto_1

    .line 158
    :catch_0
    move-exception v4

    .line 159
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "check band handleMessage CHECK_VERSION_STATUS_SUCCESS, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    :goto_1
    return-void
.end method


# virtual methods
.method public abstract a(I)V
.end method

.method public a(Z)V
    .locals 0

    .line 25
    iput-boolean p1, p0, Lo/dps;->d:Z

    .line 26
    return-void
.end method

.method public abstract d(Lo/dow;)V
.end method

.method public d(Z)V
    .locals 0

    .line 21
    iput-boolean p1, p0, Lo/dps;->a:Z

    .line 22
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 29
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 30
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 32
    :pswitch_0
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check new version failed,FAILED_REASON_NETWORK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0, v0}, Lo/dps;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    goto :goto_1

    .line 35
    :catch_0
    move-exception v4

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleMessage CHECK_VERSION_STATUS_FAILED, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    goto :goto_1

    .line 40
    :pswitch_1
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check new version success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lo/dps;->c(Ljava/lang/Object;)V

    .line 60
    goto :goto_1

    .line 62
    :pswitch_2
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check band new version success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lo/dps;->e(Ljava/lang/Object;)V

    .line 82
    goto :goto_1

    .line 84
    :goto_0
    const-string v0, "AppCheckNewVersionHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
