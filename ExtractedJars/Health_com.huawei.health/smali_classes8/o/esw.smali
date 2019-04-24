.class public Lo/esw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/esw;


# instance fields
.field private a:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private g:Landroid/os/Handler;

.field private h:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 47
    const/4 v0, 0x0

    sput-object v0, Lo/esw;->b:Lo/esw;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/esw;->d:I

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lo/esw;->e:I

    .line 51
    const-string v0, ""

    iput-object v0, p0, Lo/esw;->c:Ljava/lang/String;

    .line 52
    const-string v0, ""

    iput-object v0, p0, Lo/esw;->a:Ljava/lang/String;

    .line 57
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/esw;->h:Landroid/content/Context;

    .line 58
    return-void
.end method

.method public static a()Lo/esw;
    .locals 2

    .line 61
    sget-object v0, Lo/esw;->b:Lo/esw;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 62
    new-instance v0, Lo/esw;

    invoke-direct {v0}, Lo/esw;-><init>()V

    sput-object v0, Lo/esw;->b:Lo/esw;

    .line 64
    :cond_0
    sget-object v0, Lo/esw;->b:Lo/esw;

    return-object v0
.end method

.method static synthetic b(Lo/esw;)Landroid/os/Handler;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/esw;->g:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/os/Handler;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lo/esw;->g:Landroid/os/Handler;

    .line 69
    return-void
.end method

.method public b()V
    .locals 5

    .line 72
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    iget-object v0, p0, Lo/esw;->g:Landroid/os/Handler;

    const/16 v1, 0x2711

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 74
    return-void

    .line 76
    :cond_0
    iget-object v0, p0, Lo/esw;->h:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_msg_switch_notification"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 78
    const-string v0, "UIHLH_OperaMsgInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryOperaMsg notificationRecommend = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    const-string v0, "0"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    iget-object v0, p0, Lo/esw;->g:Landroid/os/Handler;

    const/16 v1, 0x2711

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 82
    :cond_1
    iget-object v0, p0, Lo/esw;->h:Landroid/content/Context;

    invoke-static {v0}, Lo/dlf;->d(Landroid/content/Context;)Lo/dlf;

    move-result-object v0

    new-instance v1, Lo/esw$2;

    invoke-direct {v1, p0}, Lo/esw$2;-><init>(Lo/esw;)V

    invoke-virtual {v0, v1}, Lo/dlf;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 101
    :goto_0
    return-void
.end method

.method public d(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/RelativeLayout;)V
    .locals 9

    .line 104
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    .line 105
    const-string v0, "UIHLH_OperaMsgInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "operaMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgType()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 108
    :sswitch_0
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->getContent()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/esw;->a:Ljava/lang/String;

    .line 109
    goto :goto_0

    .line 112
    :sswitch_1
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;->getContent()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/esw;->a:Ljava/lang/String;

    .line 113
    goto :goto_0

    .line 115
    :sswitch_2
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;->getFitWorkout()Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v5

    .line 116
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 117
    const-string v0, "UIHLH_OperaMsgInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitWorkout is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    iget-object v0, p0, Lo/esw;->h:Landroid/content/Context;

    invoke-static {v0}, Lo/dlf;->d(Landroid/content/Context;)Lo/dlf;

    move-result-object v0

    const/16 v1, 0x4e26

    invoke-virtual {v0, v1}, Lo/dlf;->b(I)V

    .line 119
    const/16 v0, 0x8

    invoke-virtual {p3, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 120
    const/4 v0, 0x0

    invoke-virtual {p4, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 121
    return-void

    .line 123
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/esw;->a:Ljava/lang/String;

    .line 124
    .line 128
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgSrc()I

    move-result v0

    const/4 v1, 0x4

    if-ne v1, v0, :cond_1

    .line 130
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 131
    const-string v0, "content"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/esw;->a:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    goto :goto_1

    .line 132
    :catch_0
    move-exception v5

    .line 133
    const-string v0, "UIHLH_OperaMsgInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JSONException, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    :cond_1
    :goto_1
    const-string v0, "UIHLH_OperaMsgInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OperaMsgTitle = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/esw;->a:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget-object v0, p0, Lo/esw;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 138
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgType()I

    move-result v0

    iput v0, p0, Lo/esw;->d:I

    .line 139
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getId()I

    move-result v0

    iput v0, p0, Lo/esw;->e:I

    .line 140
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/esw;->c:Ljava/lang/String;

    .line 141
    iget-object v0, p0, Lo/esw;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 143
    const/16 v0, 0x8

    invoke-virtual {p4, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 144
    iget-object v0, p0, Lo/esw;->h:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_bi_opera"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 146
    const-string v0, "0"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 147
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 148
    sget-object v0, Lo/dae;->bM:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v7

    .line 149
    const-string v0, "type"

    iget v1, p0, Lo/esw;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    const-string v0, "title"

    iget-object v1, p0, Lo/esw;->a:Ljava/lang/String;

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v8

    .line 152
    iget-object v0, p0, Lo/esw;->h:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v7, v6, v1}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 153
    iget-object v0, p0, Lo/esw;->h:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_bi_opera"

    const-string v3, "0"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 156
    :cond_2
    goto :goto_2

    .line 157
    :cond_3
    const/16 v0, 0x8

    invoke-virtual {p3, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 158
    const/4 v0, 0x0

    invoke-virtual {p4, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_2

    .line 161
    :cond_4
    const/16 v0, 0x8

    invoke-virtual {p3, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 162
    const/4 v0, 0x0

    invoke-virtual {p4, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 163
    const-string v0, "UIHLH_OperaMsgInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SmartMsgDBObject is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2710 -> :sswitch_1
        0x2712 -> :sswitch_1
        0x4e26 -> :sswitch_2
        0xc351 -> :sswitch_0
    .end sparse-switch
.end method

.method public e(Landroid/content/Context;)V
    .locals 5

    .line 168
    const-string v0, "UIHLH_OperaMsgInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "operaMsg click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 170
    const-string v0, "id"

    iget v1, p0, Lo/esw;->e:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 171
    const-string v0, "msgType"

    iget v1, p0, Lo/esw;->d:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 172
    const-string v0, "msgContent"

    iget-object v1, p0, Lo/esw;->c:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 173
    const-string v0, "msgTitle"

    iget-object v1, p0, Lo/esw;->a:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 174
    const-string v0, "from"

    const/4 v1, 0x2

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 175
    const-class v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;

    invoke-virtual {v4, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 176
    invoke-virtual {p1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 177
    return-void
.end method
