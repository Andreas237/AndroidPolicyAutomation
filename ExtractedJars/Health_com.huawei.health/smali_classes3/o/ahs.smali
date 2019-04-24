.class public Lo/ahs;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lo/ahs;

.field private static final e:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 51
    const/4 v0, 0x0

    sput-object v0, Lo/ahs;->c:Lo/ahs;

    .line 53
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/ahs;->e:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    return-void
.end method

.method public static declared-synchronized e()Lo/ahs;
    .locals 4

    const-class v3, Lo/ahs;

    monitor-enter v3

    .line 59
    :try_start_0
    sget-object v0, Lo/ahs;->c:Lo/ahs;

    if-nez v0, :cond_0

    .line 60
    sget-object v1, Lo/ahs;->e:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 61
    :try_start_1
    new-instance v0, Lo/ahs;

    invoke-direct {v0}, Lo/ahs;-><init>()V

    sput-object v0, Lo/ahs;->c:Lo/ahs;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    :try_start_2
    throw v2

    .line 64
    :cond_0
    :goto_0
    sget-object v0, Lo/ahs;->c:Lo/ahs;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v3

    return-object v0

    :catchall_1
    move-exception v1

    monitor-exit v3

    throw v1
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 167
    new-instance v1, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 168
    invoke-virtual {v1, p1}, Lo/aev;->g(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .line 169
    const-string v0, "key_last_check_ota_version_time"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 6

    .line 160
    new-instance v4, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v4, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 161
    invoke-virtual {v4, p1}, Lo/aev;->g(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    .line 162
    const-string v0, "key_last_check_ota_version_time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    invoke-virtual {v4, p1, v5}, Lo/aev;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 164
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 199
    new-instance v1, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 200
    invoke-virtual {v1, p1, p2}, Lo/aev;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 201
    return-void
.end method

.method public c(Ljava/lang/String;Z)V
    .locals 4

    .line 177
    new-instance v2, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 178
    invoke-virtual {v2, p1}, Lo/aev;->g(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 179
    const-string v0, "key_is_exist_new_version"

    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    invoke-virtual {v2, p1, v3}, Lo/aev;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 181
    return-void
.end method

.method public c(Ljava/lang/String;)Z
    .locals 3

    .line 188
    new-instance v1, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 189
    invoke-virtual {v1, p1}, Lo/aev;->g(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .line 190
    const-string v0, "key_is_exist_new_version"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public d(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 7

    .line 213
    const/4 v2, 0x0

    .line 214
    if-nez v2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 215
    sget v0, Lcom/huawei/plugindevice/R$layout;->wifi_ota_update_prompt_dialog:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 216
    sget v0, Lcom/huawei/plugindevice/R$id;->version_code:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 217
    sget v0, Lcom/huawei/plugindevice/R$id;->version_node:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 218
    const-string v0, "version"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 219
    const-string v0, "update_nodes"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    new-instance v6, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    invoke-direct {v6, p1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;-><init>(Landroid/content/Context;)V

    .line 221
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_ota_update_band_update:I

    invoke-virtual {v6, v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(I)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 222
    invoke-virtual {v6, v3}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(Landroid/view/View;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 223
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_ota_go_upgrade:I

    new-instance v1, Lo/ahs$3;

    invoke-direct {v1, p0, p2, p1}, Lo/ahs$3;-><init>(Lo/ahs;Landroid/os/Bundle;Landroid/app/Activity;)V

    invoke-virtual {v6, v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->d(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 234
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_ota_try_again_later:I

    new-instance v1, Lo/ahs$2;

    invoke-direct {v1, p0, p2}, Lo/ahs$2;-><init>(Lo/ahs;Landroid/os/Bundle;)V

    invoke-virtual {v6, v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 241
    invoke-virtual {v6}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->e()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v2

    .line 242
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->setCancelable(Z)V

    .line 243
    invoke-virtual {v2}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->show()V

    .line 245
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;)Z
    .locals 12

    .line 131
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ajw;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 132
    const-string v0, "WifiOtaUpdateConstants"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "network is off. no check version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 133
    const/4 v4, 0x0

    goto/16 :goto_0

    .line 135
    :cond_0
    invoke-virtual {p0, p1}, Lo/ahs;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 136
    const-string v0, "WifiOtaUpdateConstants"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "last check version time: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 137
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 138
    const/4 v4, 0x1

    goto :goto_0

    .line 140
    :cond_1
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 141
    new-instance v8, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v8, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 143
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v9

    .line 144
    invoke-virtual {v9, v8}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 145
    const/4 v0, 0x5

    invoke-virtual {v9, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, -0x7

    const/4 v1, 0x5

    invoke-virtual {v9, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 146
    invoke-virtual {v9}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v10

    .line 147
    const-string v0, "WifiOtaUpdateConstants"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "seven days ago time: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", time: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 148
    cmp-long v0, v6, v10

    if-gez v0, :cond_2

    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 151
    :goto_0
    invoke-virtual {p0, p1}, Lo/ahs;->b(Ljava/lang/String;)V

    .line 153
    return v4
.end method

.method public e(Ljava/lang/String;)V
    .locals 5

    .line 68
    invoke-virtual {p0, p1}, Lo/ahs;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;-><init>()V

    .line 70
    invoke-virtual {v4, p1}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;->setDevId(Ljava/lang/String;)V

    .line 71
    const-string v0, "devOtaInfo"

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;->setSid(Ljava/lang/String;)V

    .line 72
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lo/ahs$5;

    invoke-direct {v1, p0, p1}, Lo/ahs$5;-><init>(Lo/ahs;Ljava/lang/String;)V

    invoke-virtual {v0, v4, v1}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;Lo/cyx;)V

    .line 120
    goto :goto_0

    .line 121
    :cond_0
    const-string v0, "WifiOtaUpdateConstants"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no need check ota version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 123
    :goto_0
    return-void
.end method

.method public f(Ljava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 204
    new-instance v1, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 205
    invoke-virtual {v1, p1}, Lo/aev;->g(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
