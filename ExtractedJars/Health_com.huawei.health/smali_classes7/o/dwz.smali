.class public Lo/dwz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dui;


# static fields
.field private static d:Ljava/lang/String;


# instance fields
.field private a:Landroid/content/Context;

.field private b:I

.field private c:Lo/dwr;

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    const-string v0, "PLGACHIEVE_AchieveServiceObserver"

    sput-object v0, Lo/dwz;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/dwz;->b:I

    .line 44
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/dwz;->b:I

    .line 47
    iput-object p1, p0, Lo/dwz;->a:Landroid/content/Context;

    .line 48
    iput-boolean p2, p0, Lo/dwz;->e:Z

    .line 49
    invoke-direct {p0}, Lo/dwz;->b()V

    .line 50
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 222
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 223
    const-string v0, "_monthReportNo"

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    const-string v0, "_monthMinReportNo"

    invoke-interface {v1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    iget-object v0, p0, Lo/dwz;->a:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dtn;->e(Landroid/content/Context;Ljava/util/Map;)V

    .line 226
    return-void
.end method

.method private a(Lo/dwk;)V
    .locals 12

    .line 101
    iget-object v0, p0, Lo/dwz;->c:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 102
    return-void

    .line 104
    :cond_0
    invoke-virtual {p1}, Lo/dwk;->g()Lo/dwd;

    move-result-object v3

    .line 105
    if-nez v3, :cond_1

    .line 106
    iget-object v0, p0, Lo/dwz;->c:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->d(Lo/dui;)V

    .line 107
    return-void

    .line 109
    :cond_1
    iget-object v0, p0, Lo/dwz;->a:Landroid/content/Context;

    const-string v1, "_monthReportNo"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 111
    :try_start_0
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/dwz;->b:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    goto :goto_0

    .line 112
    :catch_0
    move-exception v5

    .line 113
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    const-string v1, "processMonthly NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    :goto_0
    invoke-virtual {v3}, Lo/dwd;->a()I

    move-result v5

    .line 116
    invoke-virtual {v3}, Lo/dwd;->l()I

    move-result v6

    .line 117
    invoke-virtual {v3}, Lo/dwd;->o()J

    move-result-wide v7

    .line 118
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processMonthly reportNo="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processMonthly minReportNo="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processMonthly localMonthReportNo="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dwz;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processMonthly wrapper.getResultCode()="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/dwz;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    iget v0, p0, Lo/dwz;->b:I

    const/4 v1, -0x1

    if-eq v1, v0, :cond_4

    .line 124
    iget v0, p0, Lo/dwz;->b:I

    if-le v5, v0, :cond_4

    invoke-virtual {p1}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dwz;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 126
    iput v5, p0, Lo/dwz;->b:I

    .line 127
    iget-object v0, p0, Lo/dwz;->c:Lo/dwr;

    invoke-virtual {v0, v6, v5, v7, v8}, Lo/dwr;->b(IIJ)Lo/dwc;

    move-result-object v9

    .line 128
    const-string v0, "achievement"

    invoke-virtual {v9, v0}, Lo/dwc;->a(Ljava/lang/String;)V

    .line 129
    const-string v0, "monthReportMessage"

    invoke-virtual {v9, v0}, Lo/dwc;->c(Ljava/lang/String;)V

    .line 130
    const-string v0, "assets://localMessageIcon/messagecenter_achieve_ic_report.png"

    invoke-virtual {v9, v0}, Lo/dwc;->k(Ljava/lang/String;)V

    .line 131
    const/16 v0, 0xb

    invoke-virtual {v9, v0}, Lo/dwc;->f(I)V

    .line 132
    iget-object v0, p0, Lo/dwz;->a:Landroid/content/Context;

    const-string v1, "_achieve_msg_id_month"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 133
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processMonthly msgId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    iget-object v0, p0, Lo/dwz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 135
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 136
    invoke-virtual {v9, v10}, Lo/dwc;->e(Ljava/lang/String;)V

    .line 138
    :cond_2
    iget-object v0, p0, Lo/dwz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    invoke-interface {v0, v9}, Lo/dti;->c(Lo/dwc;)Ljava/lang/String;

    move-result-object v11

    .line 139
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 140
    move-object v10, v11

    .line 142
    :cond_3
    iget-object v0, p0, Lo/dwz;->a:Landroid/content/Context;

    const-string v1, "_achieve_msg_id_month"

    invoke-static {v0, v1, v10}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processMonthly msgId.="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    :cond_4
    iget-object v0, p0, Lo/dwz;->c:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->d(Lo/dui;)V

    .line 149
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dwz;->c:Lo/dwr;

    .line 150
    return-void
.end method

.method private b()V
    .locals 2

    .line 230
    iget-object v0, p0, Lo/dwz;->c:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 231
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lo/dwz;->c:Lo/dwr;

    .line 233
    :cond_0
    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 214
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 215
    const-string v0, "_weekReportNo"

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    const-string v0, "_weekMinReportNo"

    invoke-interface {v1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    iget-object v0, p0, Lo/dwz;->a:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dtn;->e(Landroid/content/Context;Ljava/util/Map;)V

    .line 218
    return-void
.end method

.method private d(Lo/dwk;)V
    .locals 4

    .line 92
    invoke-virtual {p1}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v3

    .line 93
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processTakeMedal resultCode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const-string v0, "0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lo/dwz;->a:Landroid/content/Context;

    const-string v1, "_uploadMedal"

    invoke-static {v0, v1}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 97
    :cond_0
    return-void
.end method

.method private d(Ljava/lang/String;)Z
    .locals 1

    .line 53
    const-string v0, "0"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e(Lo/dwk;)V
    .locals 15

    .line 154
    iget-object v0, p0, Lo/dwz;->c:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 155
    return-void

    .line 157
    :cond_0
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    const-string v1, "AchieveServiceObserver, enter processWeekly-------"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    invoke-virtual/range {p1 .. p1}, Lo/dwk;->h()Lo/dwh;

    move-result-object v3

    .line 160
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 161
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    const-string v1, "weekRecord is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    return-void

    .line 164
    :cond_1
    invoke-virtual {v3}, Lo/dwh;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    .line 165
    invoke-virtual {v3}, Lo/dwh;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 166
    iget-object v0, p0, Lo/dwz;->a:Landroid/content/Context;

    const-string v1, "_weekReportNo"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 167
    invoke-direct {p0, v4, v5}, Lo/dwz;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    invoke-static {}, Lo/dth;->l()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 169
    invoke-virtual {v3}, Lo/dwh;->l()J

    move-result-wide v7

    .line 170
    invoke-virtual {v3}, Lo/dwh;->n()I

    move-result v9

    .line 171
    invoke-virtual {v3}, Lo/dwh;->b()I

    move-result v10

    .line 173
    const/4 v11, 0x0

    .line 175
    :try_start_0
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v11, v0

    .line 178
    goto :goto_0

    .line 176
    :catch_0
    move-exception v12

    .line 177
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    const-string v1, "processWeekly NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    :goto_0
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processWeekly reportNo="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processWeekly minReportNo="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processWeekly localMonthReportNo="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processWeekly wrapper.getResultCode()="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    const/4 v0, -0x1

    if-eq v0, v11, :cond_4

    .line 184
    if-le v10, v11, :cond_4

    invoke-virtual/range {p1 .. p1}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dwz;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 186
    iget-object v0, p0, Lo/dwz;->c:Lo/dwr;

    invoke-virtual {v0, v9, v10, v7, v8}, Lo/dwr;->a(IIJ)Lo/dwc;

    move-result-object v12

    .line 187
    const-string v0, "achievement"

    invoke-virtual {v12, v0}, Lo/dwc;->a(Ljava/lang/String;)V

    .line 188
    const-string v0, "weekReportMessage"

    invoke-virtual {v12, v0}, Lo/dwc;->c(Ljava/lang/String;)V

    .line 189
    const-string v0, "assets://localMessageIcon/messagecenter_achieve_ic_report.png"

    invoke-virtual {v12, v0}, Lo/dwc;->k(Ljava/lang/String;)V

    .line 190
    const/16 v0, 0xb

    invoke-virtual {v12, v0}, Lo/dwc;->f(I)V

    .line 191
    iget-object v0, p0, Lo/dwz;->a:Landroid/content/Context;

    const-string v1, "_achieve_msg_id_week"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 192
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processWeekly msgId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    iget-object v0, p0, Lo/dwz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 194
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 195
    invoke-virtual {v12, v13}, Lo/dwc;->e(Ljava/lang/String;)V

    .line 197
    :cond_2
    iget-object v0, p0, Lo/dwz;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    invoke-interface {v0, v12}, Lo/dti;->c(Lo/dwc;)Ljava/lang/String;

    move-result-object v14

    .line 198
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 199
    move-object v13, v14

    .line 201
    :cond_3
    iget-object v0, p0, Lo/dwz;->a:Landroid/content/Context;

    const-string v1, "_achieve_msg_id_week"

    invoke-static {v0, v1, v13}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processWeekly msgId.="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    :cond_4
    iget-object v0, p0, Lo/dwz;->c:Lo/dwr;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v0, v2, v1}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 210
    return-void
.end method


# virtual methods
.method public e(ILo/dwk;)V
    .locals 4

    .line 59
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 60
    iget-object v0, p0, Lo/dwz;->c:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->d(Lo/dui;)V

    .line 61
    return-void

    .line 63
    :cond_0
    if-nez p2, :cond_1

    .line 64
    return-void

    .line 66
    :cond_1
    invoke-virtual {p2}, Lo/dwk;->l()I

    move-result v3

    .line 67
    sget-object v0, Lo/dwz;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AchieveServiceObserver|onDataChanged contentType = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    const/4 v0, 0x2

    if-ne v3, v0, :cond_2

    .line 69
    invoke-direct {p0, p2}, Lo/dwz;->e(Lo/dwk;)V

    .line 70
    return-void

    .line 72
    :cond_2
    const/4 v0, 0x3

    if-ne v3, v0, :cond_3

    .line 73
    invoke-direct {p0, p2}, Lo/dwz;->a(Lo/dwk;)V

    .line 74
    return-void

    .line 76
    :cond_3
    const/4 v0, 0x4

    if-ne v3, v0, :cond_5

    .line 77
    iget-object v0, p0, Lo/dwz;->c:Lo/dwr;

    invoke-virtual {v0, p2}, Lo/dwr;->b(Lo/dwk;)V

    .line 78
    iget-boolean v0, p0, Lo/dwz;->e:Z

    if-eqz v0, :cond_4

    .line 79
    iget-object v0, p0, Lo/dwz;->c:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->d(Lo/dui;)V

    .line 81
    :cond_4
    return-void

    .line 83
    :cond_5
    const/4 v0, 0x7

    if-ne v3, v0, :cond_6

    .line 84
    invoke-direct {p0, p2}, Lo/dwz;->d(Lo/dwk;)V

    .line 88
    :cond_6
    return-void
.end method
