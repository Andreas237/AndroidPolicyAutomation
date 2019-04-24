.class public Lo/cgd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Ljava/lang/String;

.field private static final c:Ljava/lang/Object;

.field private static d:Lo/cgd;


# instance fields
.field private a:Lo/cfy;

.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    const-string v0, "Track_OfflineDialogController"

    sput-object v0, Lo/cgd;->b:Ljava/lang/String;

    .line 14
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cgd;->c:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lo/cgd;->e:Landroid/content/Context;

    .line 22
    new-instance v0, Lo/cfy;

    invoke-direct {v0, p1}, Lo/cfy;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/cgd;->a:Lo/cfy;

    .line 23
    return-void
.end method

.method public static b(Landroid/content/Context;)Lo/cgd;
    .locals 4

    .line 26
    sget-object v2, Lo/cgd;->c:Ljava/lang/Object;

    monitor-enter v2

    .line 27
    :try_start_0
    sget-object v0, Lo/cgd;->d:Lo/cgd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 28
    new-instance v0, Lo/cgd;

    invoke-direct {v0, p0}, Lo/cgd;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/cgd;->d:Lo/cgd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 31
    :goto_0
    sget-object v0, Lo/cgd;->d:Lo/cgd;

    return-object v0
.end method

.method static synthetic b(Lo/cgd;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2}, Lo/cgd;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lo/cgd;)Landroid/content/Context;
    .locals 1

    .line 12
    iget-object v0, p0, Lo/cgd;->e:Landroid/content/Context;

    return-object v0
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 37
    sget-object v0, Lo/cgd;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendBroadcast() action:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 39
    const-string v0, "TAG_ONE_CITY_STRING_AS"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 40
    iget-object v0, p0, Lo/cgd;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lo/ccd;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 41
    return-void
.end method

.method private c(Ljava/lang/String;Z)V
    .locals 2

    .line 198
    iget-object v0, p0, Lo/cgd;->a:Lo/cfy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 200
    iget-object v0, p0, Lo/cgd;->a:Lo/cfy;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lo/cfy;->e(Ljava/lang/String;ZLandroid/content/DialogInterface$OnDismissListener;)V

    .line 202
    :cond_0
    return-void
.end method

.method private c(Z)V
    .locals 2

    .line 193
    iget-object v0, p0, Lo/cgd;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_common_ui_waiting:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lo/cgd;->c(Ljava/lang/String;Z)V

    .line 194
    return-void
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 12
    sget-object v0, Lo/cgd;->b:Ljava/lang/String;

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 1

    .line 181
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lo/cgd;->c(Ljava/lang/String;Z)V

    .line 182
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 9

    .line 46
    sget-object v0, Lo/cgd;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoWifiWaintingDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    iget-object v0, p0, Lo/cgd;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_connectting_no_wifi:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 48
    new-instance v8, Lo/cfy;

    iget-object v0, p0, Lo/cgd;->e:Landroid/content/Context;

    invoke-direct {v8, v0}, Lo/cfy;-><init>(Landroid/content/Context;)V

    .line 49
    move-object v0, v8

    move-object v1, v7

    iget-object v2, p0, Lo/cgd;->e:Landroid/content/Context;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_remind:I

    .line 50
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_cancel:I

    sget v5, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_connectting_sure:I

    new-instance v6, Lo/cgd$5;

    invoke-direct {v6, p0, p1}, Lo/cgd$5;-><init>(Lo/cgd;Ljava/lang/String;)V

    .line 49
    const/4 v3, 0x1

    invoke-virtual/range {v0 .. v6}, Lo/cfy;->b(Ljava/lang/String;Ljava/lang/String;ZIILo/cfy$d;)V

    .line 69
    invoke-virtual {v8}, Lo/cfy;->b()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 70
    invoke-virtual {v8}, Lo/cfy;->b()Landroid/app/Dialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    goto :goto_0

    .line 72
    :cond_0
    sget-object v0, Lo/cgd;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoWifiWaintingDialog: commonDialog.getConfirmDialog return null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/String;ZJ)V
    .locals 14

    .line 79
    sget-object v0, Lo/cgd;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoWifiDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    new-instance v12, Lo/cfy;

    iget-object v0, p0, Lo/cgd;->e:Landroid/content/Context;

    invoke-direct {v12, v0}, Lo/cfy;-><init>(Landroid/content/Context;)V

    .line 81
    iget-object v0, p0, Lo/cgd;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_connectting_no_wifi:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 82
    move-object v0, v12

    move-object v1, v13

    iget-object v2, p0, Lo/cgd;->e:Landroid/content/Context;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_remind:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_cancel:I

    sget v5, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_connectting_sure:I

    new-instance v6, Lo/cgd$4;

    move-object v7, p0

    move-wide/from16 v8, p3

    move/from16 v10, p2

    move-object v11, p1

    invoke-direct/range {v6 .. v11}, Lo/cgd$4;-><init>(Lo/cgd;JZLjava/lang/String;)V

    const/4 v3, 0x1

    invoke-virtual/range {v0 .. v6}, Lo/cfy;->b(Ljava/lang/String;Ljava/lang/String;ZIILo/cfy$d;)V

    .line 106
    invoke-virtual {v12}, Lo/cfy;->b()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 107
    invoke-virtual {v12}, Lo/cfy;->b()Landroid/app/Dialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    goto :goto_0

    .line 109
    :cond_0
    sget-object v0, Lo/cgd;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNetworkOpenDlg: commonDialog.getConfirmDialog return null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    :goto_0
    return-void
.end method

.method private g()V
    .locals 9

    .line 207
    sget-object v0, Lo/cgd;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNetworkOpenDlg()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    iget-object v0, p0, Lo/cgd;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_connectting_error:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 209
    new-instance v8, Lo/cfy;

    iget-object v0, p0, Lo/cgd;->e:Landroid/content/Context;

    invoke-direct {v8, v0}, Lo/cfy;-><init>(Landroid/content/Context;)V

    .line 210
    move-object v0, v8

    move-object v2, v7

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_cancel:I

    sget v5, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_operate_settings:I

    new-instance v6, Lo/cgd$3;

    invoke-direct {v6, p0}, Lo/cgd$3;-><init>(Lo/cgd;)V

    const/4 v1, 0x0

    const/4 v3, 0x1

    invoke-virtual/range {v0 .. v6}, Lo/cfy;->b(Ljava/lang/String;Ljava/lang/String;ZIILo/cfy$d;)V

    .line 230
    invoke-virtual {v8}, Lo/cfy;->b()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 231
    invoke-virtual {v8}, Lo/cfy;->b()Landroid/app/Dialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    goto :goto_0

    .line 233
    :cond_0
    sget-object v0, Lo/cgd;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNetworkOpenDlg: commonDialog.getConfirmDialog return null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    :goto_0
    return-void
.end method

.method private static declared-synchronized k()V
    .locals 3

    const-class v1, Lo/cgd;

    monitor-enter v1

    .line 259
    const/4 v0, 0x0

    :try_start_0
    sput-object v0, Lo/cgd;->d:Lo/cgd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 260
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 239
    sget-object v0, Lo/cgd;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeWaitingDialog enter mCommonDialog : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cgd;->a:Lo/cfy;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    iget-object v0, p0, Lo/cgd;->a:Lo/cfy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 242
    iget-object v0, p0, Lo/cgd;->a:Lo/cfy;

    invoke-virtual {v0}, Lo/cfy;->a()V

    .line 244
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    .line 116
    sget-object v0, Lo/cgd;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadWaitCity() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    iget-object v0, p0, Lo/cgd;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cfu;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 119
    invoke-direct {p0}, Lo/cgd;->g()V

    .line 120
    return-void

    .line 122
    :cond_0
    iget-object v0, p0, Lo/cgd;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cfu;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 124
    invoke-direct {p0, p1}, Lo/cgd;->e(Ljava/lang/String;)V

    .line 125
    return-void

    .line 127
    :cond_1
    invoke-virtual {p0}, Lo/cgd;->b()V

    .line 128
    const-string v0, "ACITON_ACTIVITY_WAIT_CITY_AS"

    invoke-direct {p0, p1, v0}, Lo/cgd;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    sget-object v0, Lo/cgd;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadWaitCity() finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    return-void
.end method

.method public a(Ljava/lang/String;ZJ)V
    .locals 4

    .line 136
    sget-object v0, Lo/cgd;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "loadCity int isUpdate:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget-object v0, p0, Lo/cgd;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cfu;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 139
    invoke-direct {p0}, Lo/cgd;->g()V

    .line 140
    return-void

    .line 142
    :cond_0
    iget-object v0, p0, Lo/cgd;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cfu;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 144
    invoke-direct {p0, p1, p2, p3, p4}, Lo/cgd;->e(Ljava/lang/String;ZJ)V

    .line 145
    return-void

    .line 147
    :cond_1
    if-eqz p2, :cond_2

    .line 149
    const-string v0, "ACTION_MAP_ONCHRCKUPDATE_AS"

    invoke-direct {p0, p1, v0}, Lo/cgd;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    sget-object v0, Lo/cgd;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadCity update ok"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 154
    :cond_2
    const-string v0, "ACITON_ACTIVITY_LOAD_CITY_AS"

    invoke-direct {p0, p1, v0}, Lo/cgd;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    sget-object v0, Lo/cgd;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadCity ok"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    :goto_0
    return-void
.end method

.method public b()V
    .locals 4

    .line 186
    sget-object v0, Lo/cgd;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showWaitingDialog enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/cgd;->c(Z)V

    .line 188
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    .line 175
    sget-object v0, Lo/cgd;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopLoading"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    const-string v0, "ACTION_ACTIVITY_PAUSE_CITY_AS"

    invoke-direct {p0, p1, v0}, Lo/cgd;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    return-void
.end method

.method public c()V
    .locals 1

    .line 253
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgd;->a:Lo/cfy;

    .line 254
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgd;->e:Landroid/content/Context;

    .line 255
    invoke-static {}, Lo/cgd;->k()V

    .line 256
    return-void
.end method

.method public d(Ljava/lang/String;Z)V
    .locals 7

    .line 162
    sget-object v0, Lo/cgd;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteCity()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    iget-object v0, p0, Lo/cgd;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_download_city_delete_on:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 164
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 165
    invoke-direct {p0, v5}, Lo/cgd;->d(Ljava/lang/String;)V

    .line 166
    new-instance v6, Landroid/content/Intent;

    const-string v0, "ACITON_ACTIVITY_DELETE_CITY_AS"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 167
    const-string v0, "TAG_ONE_CITY_STRING_AS"

    invoke-virtual {v6, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 168
    const-string v0, "TAG_BOOLEAN_ISRESTART_AS"

    invoke-virtual {v6, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 169
    iget-object v0, p0, Lo/cgd;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v6}, Lo/ccd;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 170
    return-void
.end method

.method public e()Lo/cfy;
    .locals 1

    .line 248
    iget-object v0, p0, Lo/cgd;->a:Lo/cfy;

    return-object v0
.end method
