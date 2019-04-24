.class public Lcom/huawei/pluginachievement/ui/AchieveReportActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lo/dui;


# static fields
.field private static r:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/ScrollView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Lo/dwm;

.field private n:Lo/dwj;

.field private o:Lo/emr;

.field private p:Lo/dwr;

.field private q:Z

.field private s:Landroid/os/Handler;

.field private t:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Landroid/util/Pair<Ljava/lang/Long;Ljava/lang/Long;>;>;"
        }
    .end annotation
.end field

.field private u:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Landroid/graphics/drawable/BitmapDrawable;>;"
        }
    .end annotation
.end field

.field private v:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 83
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 115
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->t:Ljava/util/Map;

    .line 117
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->u:Ljava/util/HashMap;

    .line 159
    new-instance v0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$5;-><init>(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->s:Landroid/os/Handler;

    .line 237
    new-instance v0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$2;-><init>(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->v:Ljava/lang/Runnable;

    return-void
.end method

.method private a(Ljava/lang/String;I)Landroid/util/Pair;
    .locals 18
    .annotation build Landroid/annotation/TargetApi;
        value = 0x5
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Landroid/util/Pair<Ljava/lang/Long;Ljava/lang/Long;>;"
        }
    .end annotation

    .line 1124
    new-instance v4, Landroid/util/Pair;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1126
    :try_start_0
    new-instance v5, Lorg/json/JSONArray;

    move-object/from16 v0, p1

    invoke-direct {v5, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 1127
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    .line 1128
    const-wide/16 v6, 0x0

    .line 1129
    const-wide/16 v8, 0x0

    .line 1130
    const-wide/16 v10, 0x0

    .line 1131
    const-wide/16 v12, 0x0

    .line 1132
    const/4 v14, 0x0

    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v14, v0, :cond_4

    .line 1133
    invoke-virtual {v5, v14}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v15

    .line 1134
    invoke-static/range {p2 .. p2}, Lo/dzr;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1135
    const-string v0, "value"

    invoke-static {v0, v15}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v16

    .line 1136
    cmp-long v0, v16, v10

    if-lez v0, :cond_0

    .line 1137
    move-wide/from16 v10, v16

    .line 1138
    const-string v0, "startTime"

    invoke-static {v0, v15}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v6

    .line 1139
    const-string v0, "endTime"

    invoke-static {v0, v15}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v8

    .line 1140
    const-string v0, "PLGACHIEVE_AchieveReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "value="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-wide/from16 v2, v16

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "startTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "endTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1142
    :cond_0
    goto/16 :goto_1

    :cond_1
    invoke-static/range {p2 .. p2}, Lo/dzr;->d(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1143
    const-string v0, "value"

    invoke-static {v0, v15}, Lo/dty;->a(Ljava/lang/String;Lorg/json/JSONObject;)D

    move-result-wide v16

    .line 1144
    const-wide/16 v0, 0x0

    cmpl-double v0, v12, v0

    if-nez v0, :cond_2

    .line 1145
    move-wide/from16 v12, v16

    .line 1146
    const-string v0, "startTime"

    invoke-static {v0, v15}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v6

    .line 1147
    const-string v0, "endTime"

    invoke-static {v0, v15}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v8

    .line 1149
    :cond_2
    cmpg-double v0, v16, v12

    if-gtz v0, :cond_3

    .line 1150
    move-wide/from16 v12, v16

    .line 1151
    const-string v0, "startTime"

    invoke-static {v0, v15}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v6

    .line 1152
    const-string v0, "endTime"

    invoke-static {v0, v15}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v8

    .line 1153
    const-string v0, "PLGACHIEVE_AchieveReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "key="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, p2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "value="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-wide/from16 v2, v16

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "startTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "endTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1132
    :cond_3
    :goto_1
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_0

    .line 1157
    :cond_4
    new-instance v0, Landroid/util/Pair;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 1161
    :cond_5
    goto :goto_2

    .line 1159
    :catch_0
    move-exception v5

    .line 1160
    const-string v0, "PLGACHIEVE_AchieveReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getStartTimeAndEndTime Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1162
    :goto_2
    return-object v4
.end method

.method private a(II)Landroid/widget/TextView;
    .locals 1

    .line 1057
    invoke-static {p0, p1}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;
    .locals 1

    .line 1002
    invoke-static {p1, p2}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private a(Lo/dvh;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dvh;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 285
    if-nez p1, :cond_0

    .line 286
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0

    .line 288
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 289
    const-string v0, "timestamp"

    invoke-virtual {p1}, Lo/dvh;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    return-object v3
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;Lo/dwm;)Lo/dwm;
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->m:Lo/dwm;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)Lo/dwr;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->p:Lo/dwr;

    return-object v0
.end method

.method private a()V
    .locals 11

    .line 422
    const-string v0, "PLGACHIEVE_AchieveReportActivity"

    const-string v1, "share enter"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    invoke-static {p0}, Lo/dtm;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 424
    const-string v0, "PLGACHIEVE_AchieveReportActivity"

    const-string v1, "isNetworkAvailable error"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->s:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 426
    return-void

    .line 430
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_root_share:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/ScrollView;

    .line 431
    invoke-static {v9}, Lo/dxh;->b(Landroid/widget/ScrollView;)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 432
    if-nez v10, :cond_1

    .line 433
    const-string v0, "PLGACHIEVE_AchieveReportActivity"

    const-string v1, "share bmpShare == null "

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 435
    :cond_1
    move-object v0, p0

    move-object v4, v10

    sget-object v1, Lo/dae;->ac:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v8

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v8}, Lo/dtm;->d(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;ZLjava/lang/String;)V

    .line 437
    :goto_0
    const-string v0, "PLGACHIEVE_AchieveReportActivity"

    const-string v1, "share end"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    return-void
.end method

.method private a(I)V
    .locals 2

    .line 965
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 966
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    invoke-direct {p0, v0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(Landroid/widget/ScrollView;I)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 968
    :cond_0
    return-void
.end method

.method private a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 946
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 947
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->record_data_layout:I

    invoke-direct {p0, v0, p1, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(Landroid/widget/ScrollView;II)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 949
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_desc:I

    invoke-direct {p0, v0, p1, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 950
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_value:I

    invoke-direct {p0, v0, p1, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 951
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->record_data:I

    invoke-direct {p0, v0, p1, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 952
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->record_arrow:I

    invoke-direct {p0, v0, p1, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ScrollView;II)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 953
    const/4 v0, 0x0

    if-eq v0, p4, :cond_0

    .line 954
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_unit:I

    invoke-direct {p0, v0, p1, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 957
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)Landroid/content/Context;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    return-object v0
.end method

.method private b(Landroid/widget/ScrollView;II)Landroid/widget/LinearLayout;
    .locals 1

    .line 1025
    invoke-static {p1, p2}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private b(Landroid/widget/ScrollView;I)Landroid/widget/RelativeLayout;
    .locals 1

    .line 1035
    invoke-static {p1, p2}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private b()V
    .locals 9

    .line 294
    const-string v0, "HwChinese-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 295
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_root_share:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    .line 296
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_share_date:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->f:Landroid/widget/TextView;

    .line 297
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->f()V

    .line 298
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i()V

    .line 299
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e()V

    .line 300
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->h()V

    .line 301
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->g()V

    .line 302
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->k()V

    .line 305
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->qr_code:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/ImageView;

    .line 306
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 307
    const/4 v0, 0x4

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 310
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->q:Z

    .line 312
    sget v0, Lcom/huawei/pluginachievement/R$id;->title_layout:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->o:Lo/emr;

    .line 313
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->o:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 314
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->o:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 315
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 316
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->o:Lo/emr;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->ic_health_nav_share_black:I

    invoke-static {v1, v2}, Lo/enf;->b(Landroid/content/Context;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 318
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->o:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->ic_health_nav_share_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 320
    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->o:Lo/emr;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$3;-><init>(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 331
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 332
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->f:Landroid/widget/TextView;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/dzr;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 334
    :cond_2
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_share_head:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 335
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_share_nick:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 336
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dtm;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 337
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dtm;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    .line 338
    const-string v0, "PLGACHIEVE_AchieveReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initView imgUrl="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " nick="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 339
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 340
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 341
    invoke-static {p0, v6}, Lo/dxg;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 342
    if-eqz v8, :cond_3

    .line 343
    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 346
    :cond_3
    return-void
.end method

.method private b(I)V
    .locals 3

    .line 706
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_value:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 707
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$color;->achieve_report_content_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 708
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$dimen;->hw_achieve_medal_button_text_size:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 709
    sget v0, Lcom/huawei/pluginachievement/R$id;->record_data_layout:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(II)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 710
    return-void
.end method

.method private b(II)V
    .locals 2

    .line 828
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 829
    return-void

    .line 831
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$id;->item_rl:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->c(II)Landroid/widget/RelativeLayout;

    move-result-object v0

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$1;-><init>(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;II)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 844
    return-void
.end method

.method private b(IILo/dwm;)V
    .locals 8
    .annotation build Landroid/annotation/TargetApi;
        value = 0x5
    .end annotation

    .line 886
    invoke-static {p2}, Lo/dzr;->c(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 887
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 888
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(I)V

    .line 889
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(I)V

    .line 890
    invoke-direct {p0, p2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i(I)V

    .line 891
    return-void

    .line 893
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_desc:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 894
    const-string v4, ""

    .line 895
    const-string v5, ""

    .line 896
    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 897
    invoke-virtual {p3}, Lo/dwm;->e()I

    move-result v0

    if-lez v0, :cond_3

    .line 898
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(I)V

    .line 899
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-virtual {p3}, Lo/dwm;->e()I

    move-result v1

    invoke-static {v0, v1}, Lo/dzp;->d(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    .line 900
    invoke-virtual {p3}, Lo/dwm;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/dzr;->c(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 902
    :cond_1
    const/4 v0, 0x3

    if-ne p2, v0, :cond_2

    .line 903
    invoke-virtual {p3}, Lo/dwm;->b()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    .line 904
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(I)V

    .line 905
    sget v0, Lcom/huawei/pluginachievement/R$id;->record_arrow:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 906
    invoke-virtual {p3}, Lo/dwm;->c()J

    move-result-wide v6

    .line 907
    invoke-virtual {p3}, Lo/dwm;->b()D

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v0, v1, v2}, Lo/dzp;->e(DLandroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 908
    invoke-static {v6, v7}, Lo/dzr;->c(J)Ljava/lang/String;

    move-result-object v5

    .line 909
    goto :goto_0

    .line 910
    :cond_2
    const/4 v0, 0x4

    if-ne p2, v0, :cond_3

    .line 911
    invoke-virtual {p3}, Lo/dwm;->a()I

    move-result v0

    if-lez v0, :cond_3

    .line 912
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(I)V

    .line 913
    sget v0, Lcom/huawei/pluginachievement/R$id;->record_arrow:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 914
    invoke-virtual {p3}, Lo/dwm;->k()J

    move-result-wide v6

    .line 915
    invoke-virtual {p3}, Lo/dwm;->a()I

    move-result v0

    invoke-static {v0}, Lo/dzr;->i(I)Ljava/lang/String;

    move-result-object v4

    .line 916
    invoke-static {v6, v7}, Lo/dzr;->c(J)Ljava/lang/String;

    move-result-object v5

    .line 919
    :cond_3
    :goto_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 920
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_value:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 921
    sget v0, Lcom/huawei/pluginachievement/R$id;->record_data:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 922
    const/4 v0, 0x0

    invoke-direct {p0, p1, v4, v5, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 924
    :cond_4
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(I)V

    .line 925
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(I)V

    .line 926
    const/4 v0, 0x4

    if-eq p2, v0, :cond_5

    .line 927
    invoke-direct {p0, p2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i(I)V

    .line 930
    :cond_5
    :goto_1
    goto :goto_2

    .line 931
    :cond_6
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->f(I)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 932
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceTitle:I

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->f(I)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 933
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(I)V

    .line 934
    invoke-direct {p0, p2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i(I)V

    .line 936
    :goto_2
    return-void
.end method

.method private b(Lo/dwk;)V
    .locals 2

    .line 181
    invoke-virtual {p1}, Lo/dwk;->f()Lo/dwj;

    move-result-object v0

    .line 182
    invoke-virtual {p1}, Lo/dwk;->i()Lo/dwm;

    move-result-object v1

    .line 185
    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Lo/dwj;)V

    .line 188
    invoke-direct {p0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(Lo/dwm;)V

    .line 191
    return-void
.end method

.method private b(Lo/dwm;)V
    .locals 1

    .line 544
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PB3KMBestPace:I

    invoke-direct {p0, v0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(ILo/dwm;)V

    .line 545
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PB5KMBestPace:I

    invoke-direct {p0, v0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(ILo/dwm;)V

    .line 546
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PB10KMBestPace:I

    invoke-direct {p0, v0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(ILo/dwm;)V

    .line 547
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PBHMBestPace:I

    invoke-direct {p0, v0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(ILo/dwm;)V

    .line 548
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PBFMBestPace:I

    invoke-direct {p0, v0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(ILo/dwm;)V

    .line 550
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceBestDistance:I

    invoke-direct {p0, v0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(ILo/dwm;)V

    .line 551
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceBestPace:I

    invoke-direct {p0, v0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(ILo/dwm;)V

    .line 553
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_stepBestDistance:I

    invoke-direct {p0, v0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(ILo/dwm;)V

    .line 555
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_singleDayMoststeps:I

    invoke-direct {p0, v0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(ILo/dwm;)V

    .line 556
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_runBestDistance:I

    invoke-direct {p0, v0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(ILo/dwm;)V

    .line 557
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_runBestPace:I

    invoke-direct {p0, v0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(ILo/dwm;)V

    .line 558
    return-void
.end method

.method private c(I)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 120
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 122
    const/4 v0, 0x0

    return-object v0

    .line 125
    :cond_0
    const/4 v2, 0x0

    .line 128
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->u:Ljava/util/HashMap;

    if-eqz v0, :cond_2

    .line 129
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->u:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 130
    if-eqz v2, :cond_1

    .line 131
    return-object v2

    .line 134
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/enf;->b(Landroid/content/Context;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v2

    .line 135
    if-eqz v2, :cond_2

    .line 136
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->u:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    :cond_2
    return-object v2
.end method

.method private c(II)Landroid/widget/RelativeLayout;
    .locals 1

    .line 1091
    invoke-static {p0, p1}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)Lo/dwm;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->m:Lo/dwm;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 267
    const-string v0, "PLGACHIEVE_AchieveReportActivity"

    const-string v1, "enter doRefreshInfo():"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->p:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 269
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->p:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->b(Lo/dui;)V

    .line 270
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->p:Lo/dwr;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {v0, v2, v1}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/dvh;

    .line 272
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->p:Lo/dwr;

    invoke-direct {p0, v3}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Lo/dvh;)Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 274
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;Lo/dwk;)V
    .locals 0

    .line 83
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(Lo/dwk;)V

    return-void
.end method

.method private d(I)I
    .locals 2

    .line 630
    const/4 v1, 0x0

    .line 631
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_stepBestDistance:I

    if-ne p1, v0, :cond_0

    .line 632
    const/4 v0, 0x1

    return v0

    .line 634
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_singleDayMoststeps:I

    if-ne p1, v0, :cond_1

    .line 635
    const/4 v0, 0x2

    return v0

    .line 637
    :cond_1
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceBestDistance:I

    if-ne p1, v0, :cond_2

    .line 638
    const/16 v0, 0xa

    return v0

    .line 640
    :cond_2
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceBestPace:I

    if-ne p1, v0, :cond_3

    .line 641
    const/16 v0, 0xb

    return v0

    .line 643
    :cond_3
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_runBestDistance:I

    if-ne p1, v0, :cond_4

    .line 644
    const/4 v0, 0x3

    return v0

    .line 646
    :cond_4
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_runBestPace:I

    if-ne p1, v0, :cond_5

    .line 647
    const/4 v0, 0x4

    return v0

    .line 649
    :cond_5
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PB3KMBestPace:I

    if-ne p1, v0, :cond_6

    .line 650
    const/4 v0, 0x5

    return v0

    .line 652
    :cond_6
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PB5KMBestPace:I

    if-ne p1, v0, :cond_7

    .line 653
    const/4 v0, 0x6

    return v0

    .line 655
    :cond_7
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PB10KMBestPace:I

    if-ne p1, v0, :cond_8

    .line 656
    const/4 v0, 0x7

    return v0

    .line 658
    :cond_8
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PBHMBestPace:I

    if-ne p1, v0, :cond_9

    .line 659
    const/16 v0, 0x8

    return v0

    .line 661
    :cond_9
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PBFMBestPace:I

    if-ne p1, v0, :cond_a

    .line 662
    const/16 v0, 0x9

    return v0

    .line 664
    :cond_a
    return v1
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;I)I
    .locals 1

    .line 83
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(I)I

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)Landroid/os/Handler;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->s:Landroid/os/Handler;

    return-object v0
.end method

.method private d(Landroid/widget/ScrollView;II)Landroid/widget/ImageView;
    .locals 1

    .line 1013
    invoke-static {p1, p2}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private d(II)Landroid/widget/LinearLayout;
    .locals 1

    .line 1080
    invoke-static {p0, p1}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;Lo/dwj;)Lo/dwj;
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->n:Lo/dwj;

    return-object p1
.end method

.method private d()V
    .locals 2

    .line 256
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->p:Lo/dwr;

    .line 257
    const-string v0, "PLGACHIEVE_AchieveReportActivity"

    const-string v1, "getData()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->p:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->b(Lo/dui;)V

    .line 259
    sget-object v0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->r:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 260
    sget-object v0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->r:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->v:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 262
    :cond_0
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->c()V

    .line 264
    return-void
.end method

.method private d(IJJ)V
    .locals 3

    .line 1103
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x5

    if-lt v0, v1, :cond_2

    .line 1104
    cmp-long v0, p4, p2

    if-gtz v0, :cond_0

    .line 1105
    const-wide/16 v0, 0x1

    add-long p4, p2, v0

    .line 1107
    :cond_0
    new-instance v2, Landroid/util/Pair;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1108
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->t:Ljava/util/Map;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1109
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->t:Ljava/util/Map;

    .line 1111
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->t:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1113
    :cond_2
    return-void
.end method

.method private d(Landroid/widget/ImageView;I)V
    .locals 3

    .line 611
    invoke-direct {p0, p2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->c(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 612
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    .line 614
    if-eqz v2, :cond_0

    .line 615
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 617
    :cond_0
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 621
    :cond_1
    :goto_0
    return-void
.end method

.method private d(Lo/dwj;)V
    .locals 3

    .line 196
    if-nez p1, :cond_0

    .line 197
    invoke-static {}, Lo/dzx;->a()Lo/dwj;

    move-result-object p1

    .line 200
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->b(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 201
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->c(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 203
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->e(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 206
    invoke-static {}, Lo/dzr;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 207
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->a(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 209
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->g(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 211
    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->d(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->f(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 213
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->k(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 214
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->i(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 217
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totaldays:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_value:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->c(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 218
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totaldays:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_desc:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->b(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totalWalkDistance:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_value:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->e(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    invoke-static {}, Lo/dzr;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 223
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totalWalkDistance:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_desc:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->a(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 225
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totalWalkDistance:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_desc:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->g(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 228
    :goto_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totalsteps:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_value:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->d(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 229
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totalsteps:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_desc:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->f(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 231
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totalcal:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_value:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->k(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totalcal:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_desc:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v1, p1}, Lo/dzx;->i(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 234
    return-void
.end method

.method private e(II)Landroid/widget/ImageView;
    .locals 1

    .line 1068
    invoke-static {p0, p1}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)Lo/dwj;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->n:Lo/dwj;

    return-object v0
.end method

.method private e()V
    .locals 7

    .line 445
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_days_desc:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 446
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totaldays:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 447
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totaldays:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 449
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totaldays:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_value:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d:Landroid/widget/TextView;

    .line 450
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totaldays:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_desc:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->l:Landroid/widget/TextView;

    .line 452
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_step_desc:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 453
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totalsteps:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 454
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totalsteps:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 455
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totalsteps:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_value:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e:Landroid/widget/TextView;

    .line 456
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totalsteps:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_desc:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->g:Landroid/widget/TextView;

    .line 458
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_calorie_desc:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 459
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totalcal:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 460
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totalcal:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 462
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totalcal:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_value:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->h:Landroid/widget/TextView;

    .line 463
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totalcal:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_desc:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->k:Landroid/widget/TextView;

    .line 465
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_walking_mileage:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 466
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totalWalkDistance:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 467
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totalWalkDistance:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 469
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totalWalkDistance:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_value:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b:Landroid/widget/TextView;

    .line 470
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totalWalkDistance:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_desc:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->c:Landroid/widget/TextView;

    .line 471
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totalWalkDistance:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->data_line:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 472
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totalWalkDistance:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->data_line:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 473
    return-void
.end method

.method private e(I)V
    .locals 3

    .line 718
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_value:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 719
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$color;->achieve_report_color_item_line:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 720
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$dimen;->hw_achieve_medal_size_13:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 721
    sget v0, Lcom/huawei/pluginachievement/R$id;->record_data_layout:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(II)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 723
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dzo;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 724
    sget v0, Lcom/huawei/pluginachievement/R$id;->record_arrow:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 728
    :cond_0
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 729
    sget v0, Lcom/huawei/pluginachievement/R$id;->record_arrow:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 731
    :cond_1
    return-void
.end method

.method private e(IILjava/lang/String;)V
    .locals 11
    .annotation build Landroid/annotation/TargetApi;
        value = 0x5
    .end annotation

    .line 744
    invoke-direct {p0, p3, p2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Ljava/lang/String;I)Landroid/util/Pair;

    move-result-object v6

    .line 745
    move-object v0, p0

    move v1, p2

    iget-object v2, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object v4, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(IJJ)V

    .line 747
    invoke-static {p2}, Lo/dzr;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 748
    invoke-static {p3}, Lo/dzr;->a(Ljava/lang/String;)Lo/dyx;

    move-result-object v7

    .line 749
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 750
    invoke-direct {p0, p1, p2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(II)V

    .line 751
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_desc:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 752
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(I)V

    .line 753
    invoke-virtual {v7}, Lo/dyx;->c()J

    move-result-wide v0

    long-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-static {v0, v1, v2}, Lo/dzp;->e(DLandroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    .line 754
    invoke-virtual {v7}, Lo/dyx;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 755
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_value:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 756
    sget v0, Lcom/huawei/pluginachievement/R$id;->record_data:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 758
    const/4 v0, 0x0

    invoke-direct {p0, p1, v8, v9, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 759
    goto :goto_0

    .line 760
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(I)V

    .line 761
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(I)V

    .line 763
    :goto_0
    goto/16 :goto_5

    :cond_1
    invoke-static {p2}, Lo/dzr;->d(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 764
    invoke-static {p3}, Lo/dzr;->e(Ljava/lang/String;)Lo/dyv;

    move-result-object v7

    .line 765
    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    .line 766
    invoke-direct {p0, p1, p2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(II)V

    .line 767
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_desc:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 768
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(I)V

    .line 770
    const/4 v0, 0x4

    if-ne v0, p2, :cond_2

    .line 771
    invoke-virtual {v7}, Lo/dyv;->c()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-static {v0}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    .line 773
    :cond_2
    invoke-virtual {v7}, Lo/dyv;->c()D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-static {v0}, Lo/dzr;->i(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 776
    :goto_1
    invoke-virtual {v7}, Lo/dyv;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 777
    invoke-static {p2}, Lo/dzr;->g(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 778
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 779
    invoke-virtual {v7}, Lo/dyv;->c()D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/dzr;->b(D)Ljava/lang/String;

    move-result-object v8

    .line 780
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_value:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 781
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_unit:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 782
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 783
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_hwh_motiontrack_show_speed_pace_mi:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 784
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_unit:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 786
    :cond_3
    invoke-direct {p0, p1, v8, v9, v10}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 787
    goto :goto_2

    .line 788
    :cond_4
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_value:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 789
    const/4 v0, 0x0

    invoke-direct {p0, p1, v8, v9, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 791
    :goto_2
    sget v0, Lcom/huawei/pluginachievement/R$id;->record_data:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 792
    goto :goto_3

    .line 793
    :cond_5
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(I)V

    .line 794
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(I)V

    .line 796
    :goto_3
    goto/16 :goto_5

    :cond_6
    invoke-static {p2}, Lo/dzr;->e(I)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 798
    invoke-static {p3}, Lo/dzr;->c(Ljava/lang/String;)Lo/dyz;

    move-result-object v7

    .line 799
    const/4 v0, 0x0

    if-eq v0, v7, :cond_7

    .line 800
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_desc:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 801
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-virtual {v7}, Lo/dyz;->d()I

    move-result v1

    invoke-static {v0, v1}, Lo/dzp;->d(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v8

    .line 802
    invoke-virtual {v7}, Lo/dyz;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 803
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(I)V

    .line 804
    sget v0, Lcom/huawei/pluginachievement/R$id;->content_value:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    invoke-virtual {v7}, Lo/dyz;->d()I

    move-result v2

    invoke-static {v1, v2}, Lo/dzp;->d(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 805
    sget v0, Lcom/huawei/pluginachievement/R$id;->record_data:I

    invoke-direct {p0, p1, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v7}, Lo/dyz;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/dzr;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 807
    const/4 v0, 0x0

    invoke-direct {p0, p1, v8, v9, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 808
    goto :goto_4

    .line 809
    :cond_7
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(I)V

    .line 810
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(I)V

    .line 812
    :goto_4
    goto :goto_5

    .line 813
    :cond_8
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(I)V

    .line 814
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(I)V

    .line 817
    :goto_5
    return-void
.end method

.method private e(ILo/dwm;)V
    .locals 5

    .line 867
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(I)I

    move-result v3

    .line 868
    invoke-static {v3, p2}, Lo/dzr;->e(ILo/dwm;)Ljava/lang/String;

    move-result-object v4

    .line 869
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 870
    invoke-direct {p0, p1, v3, p2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(IILo/dwm;)V

    .line 871
    return-void

    .line 873
    :cond_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 874
    invoke-direct {p0, p1, v3, v4}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(IILjava/lang/String;)V

    goto :goto_0

    .line 876
    :cond_1
    const-string v0, "PLGACHIEVE_AchieveReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "json is null key="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 877
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(I)V

    .line 878
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(I)V

    .line 879
    invoke-direct {p0, v3}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i(I)V

    .line 881
    :goto_0
    return-void
.end method

.method private f(I)Landroid/widget/RelativeLayout;
    .locals 1

    .line 1045
    invoke-static {p0, p1}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private f()V
    .locals 8

    .line 481
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_user_report_total:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 482
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totalDataTitle:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->item_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 483
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totalDataTitle:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->item_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 486
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_walk_record_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 487
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_stepTitle:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->item_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 488
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_stepTitle:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->item_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 491
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_run_record_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 492
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_runTitle:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->item_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 493
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_runTitle:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->item_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 496
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_cycle_record_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 497
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceTitle:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->item_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 498
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceTitle:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->item_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 499
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 500
    sget v0, Lcom/huawei/pluginachievement/R$id;->cycle_and_run_divide_line:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 501
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 502
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_runBestPace:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->data_line:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 505
    :cond_0
    return-void
.end method

.method private g()V
    .locals 3

    .line 511
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_runBestDistance:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_run_distance_record:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 512
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_runBestDistance:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_run_distance_record:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 515
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_runBestPace:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_single_day_best_run_match_speed:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 516
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_runBestPace:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_single_day_best_run_match_speed:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 519
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PB3KMBestPace:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    const/4 v2, 0x5

    invoke-static {v2, v1}, Lo/dzr;->b(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 520
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_PB3KMBestPace:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    const/4 v2, 0x5

    invoke-static {v2, v1}, Lo/dzr;->b(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 522
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PB5KMBestPace:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    const/4 v2, 0x6

    invoke-static {v2, v1}, Lo/dzr;->b(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 523
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_PB5KMBestPace:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    const/4 v2, 0x6

    invoke-static {v2, v1}, Lo/dzr;->b(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 525
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PB10KMBestPace:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    const/4 v2, 0x7

    invoke-static {v2, v1}, Lo/dzr;->b(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 526
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_PB10KMBestPace:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    const/4 v2, 0x7

    invoke-static {v2, v1}, Lo/dzr;->b(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 528
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PBHMBestPace:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_hm_pace_record:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 529
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_PBHMBestPace:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_hm_pace_record:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 531
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PBFMBestPace:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_fm_pace_record:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 532
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_PBFMBestPace:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_fm_pace_record:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 534
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PBFMBestPace:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->data_line:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 535
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_PBFMBestPace:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->data_line:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 536
    return-void
.end method

.method private h()V
    .locals 5

    .line 671
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_cycle_distance_record:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 672
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceBestDistance:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 673
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceBestDistance:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 675
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_cycle_speed_record:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 676
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceBestPace:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 677
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceBestPace:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 679
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceBestPace:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->data_line:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 680
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceBestPace:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->data_line:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 681
    return-void
.end method

.method private i()V
    .locals 3

    .line 564
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totaldays:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_day:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ImageView;I)V

    .line 565
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totalsteps:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_step_off:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ImageView;I)V

    .line 566
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totalcal:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_kcal_off:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ImageView;I)V

    .line 567
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_totalWalkDistance:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_distance_off:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ImageView;I)V

    .line 569
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_stepBestDistance:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ImageView;I)V

    .line 570
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_singleDayMoststeps:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_step_off:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ImageView;I)V

    .line 572
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceBestDistance:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_ride:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ImageView;I)V

    .line 573
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceBestPace:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_speed:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ImageView;I)V

    .line 575
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_runBestDistance:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ImageView;I)V

    .line 576
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_runBestPace:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_speed:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ImageView;I)V

    .line 577
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PB3KMBestPace:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_3k_off:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ImageView;I)V

    .line 578
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PB5KMBestPace:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_5k_off:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ImageView;I)V

    .line 579
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PB10KMBestPace:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_10k_off:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ImageView;I)V

    .line 580
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PBHMBestPace:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_half_off:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ImageView;I)V

    .line 581
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_PBFMBestPace:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_full_off:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ImageView;I)V

    .line 584
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totaldays:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ScrollView;II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_day:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 585
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totalsteps:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ScrollView;II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_step_off:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 586
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totalcal:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ScrollView;II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_kcal_off:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 587
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_totalWalkDistance:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ScrollView;II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_distance_off:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 589
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_stepBestDistance:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ScrollView;II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 590
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_singleDayMoststeps:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ScrollView;II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_step_off:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 592
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceBestDistance:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ScrollView;II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_ride:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 593
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceBestPace:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ScrollView;II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_speed:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 595
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_runBestDistance:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ScrollView;II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 596
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_runBestPace:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ScrollView;II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_speed:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 597
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_PB3KMBestPace:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ScrollView;II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_3k_off:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 598
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_PB5KMBestPace:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ScrollView;II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_5k_off:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 599
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_PB10KMBestPace:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ScrollView;II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_10k_off:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 600
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_PBHMBestPace:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ScrollView;II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_half_off:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 601
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_PBFMBestPace:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_icon:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Landroid/widget/ScrollView;II)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_full_off:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 603
    return-void
.end method

.method private i(I)V
    .locals 3

    .line 977
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 978
    const/16 v0, 0xa

    if-ne p1, v0, :cond_0

    .line 979
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_cylceTitle:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(Landroid/widget/ScrollView;I)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 980
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->cycle_and_run_line:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 981
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 982
    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    .line 983
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_runTitle:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(Landroid/widget/ScrollView;I)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 984
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->step_and_run_line:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 985
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 986
    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    .line 987
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_stepTitle:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(Landroid/widget/ScrollView;I)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 988
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->total_and_run_line:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 989
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 992
    :cond_2
    :goto_0
    return-void
.end method

.method private k()V
    .locals 3

    .line 687
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_stepBestDistance:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_walk_distance_record:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 688
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_stepBestDistance:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_walk_distance_record:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 690
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_singleDayMoststeps:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_single_day_most_steps:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 691
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_singleDayMoststeps:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->content_title:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_single_day_most_steps:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 693
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_singleDayMoststeps:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->data_line:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(II)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 694
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->i:Landroid/widget/ScrollView;

    sget v1, Lcom/huawei/pluginachievement/R$id;->report_detail_singleDayMoststeps:I

    sget v2, Lcom/huawei/pluginachievement/R$id;->data_line:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Landroid/widget/ScrollView;II)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 696
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_detail_singleDayMoststeps:I

    sget v1, Lcom/huawei/pluginachievement/R$id;->record_arrow:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(II)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 697
    return-void
.end method

.method static synthetic k(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a()V

    return-void
.end method


# virtual methods
.method public e(ILo/dwk;)V
    .locals 4

    .line 351
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->q:Z

    if-nez v0, :cond_0

    .line 352
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->q:Z

    .line 353
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->s:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->s:Landroid/os/Handler;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 354
    return-void

    .line 356
    :cond_0
    if-nez p2, :cond_1

    .line 357
    return-void

    .line 361
    :cond_1
    invoke-virtual {p2}, Lo/dwk;->l()I

    move-result v3

    .line 362
    if-nez v3, :cond_2

    .line 364
    sget-object v0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->r:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_2

    .line 365
    sget-object v0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->r:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->v:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 368
    :cond_2
    return-void
.end method

.method public e(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 3

    .line 371
    const-string v0, "PLGACHIEVE_AchieveReportActivity"

    const-string v1, "checkGalleryPermission"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 373
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a()V

    .line 374
    return-void

    .line 376
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_5

    .line 377
    invoke-static {p1, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 378
    const-string v0, "PLGACHIEVE_AchieveReportActivity"

    const-string v1, "checkGalleryPermission isnotHasPermissions"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 379
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 380
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 381
    :goto_0
    if-nez v2, :cond_3

    .line 382
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/ene;->b(Landroid/content/Context;Z)V

    .line 383
    return-void

    .line 386
    :cond_3
    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 387
    goto :goto_1

    .line 388
    :cond_4
    const-string v0, "PLGACHIEVE_AchieveReportActivity"

    const-string v1, "checkGalleryPermission choosePic"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a()V

    .line 392
    :cond_5
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 146
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 147
    sget v0, Lcom/huawei/pluginachievement/R$layout;->activity_report_main:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->setContentView(I)V

    .line 148
    iput-object p0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a:Landroid/content/Context;

    .line 149
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->r:Ljava/util/concurrent/ExecutorService;

    .line 150
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b()V

    .line 151
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d()V

    .line 152
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 410
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 411
    sget-object v0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->r:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Lo/dzw;->c(Ljava/util/concurrent/ExecutorService;)V

    .line 412
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->p:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 413
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->p:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->d(Lo/dui;)V

    .line 415
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->s:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 416
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->s:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 417
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->s:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 419
    :cond_1
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 278
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->p:Lo/dwr;

    if-eqz v0, :cond_0

    .line 279
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->p:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->d(Lo/dui;)V

    .line 281
    :cond_0
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 282
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3

    .line 396
    const-string v0, "PLGACHIEVE_AchieveReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestCode=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 398
    array-length v0, p2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_0

    .line 399
    const-string v0, "PLGACHIEVE_AchieveReportActivity"

    const-string v1, "choosePicWrite Permission success"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 400
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a()V

    goto :goto_0

    .line 402
    :cond_0
    const-string v0, "PLGACHIEVE_AchieveReportActivity"

    const-string v1, "choosePicWrite Permission Failed"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 405
    :cond_1
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 156
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 157
    return-void
.end method
