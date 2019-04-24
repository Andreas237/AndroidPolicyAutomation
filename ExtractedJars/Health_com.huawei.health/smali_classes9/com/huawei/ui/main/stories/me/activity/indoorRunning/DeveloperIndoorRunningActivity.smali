.class public Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/RadioButton;

.field private b:Lo/cce;

.field private c:Landroid/widget/RadioButton;

.field private d:Landroid/content/Context;

.field private e:Landroid/widget/RadioGroup;

.field private f:Lo/dcy;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Ljava/lang/String;

.field private m:Landroid/widget/Button;

.field private p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->p:Ljava/util/ArrayList;

    return-void
.end method

.method private a(IIF)Landroid/view/View;
    .locals 7

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->d:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/LayoutInflater;

    .line 188
    sget v0, Lcom/huawei/ui/main/R$layout;->indoor_running_setting_item_layout:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 189
    sget v0, Lcom/huawei/ui/main/R$id;->duration_data:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/EditText;

    .line 190
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 191
    sget v0, Lcom/huawei/ui/main/R$id;->step_data:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/EditText;

    .line 192
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 193
    sget v0, Lcom/huawei/ui/main/R$id;->distance_data:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/EditText;

    .line 194
    invoke-static {p3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 195
    return-object v3
.end method

.method private a()V
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-static {v1}, Lo/cch;->b(I)F

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    return-void
.end method

.method private a(Z)V
    .locals 2

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->b:Lo/cce;

    const-string v1, "indoor_running_developer_running"

    invoke-virtual {v0, p1, v1}, Lo/cce;->a(ZLjava/lang/String;)V

    .line 127
    return-void
.end method

.method private b()V
    .locals 17

    .line 149
    const-string v0, "calibrate_distance_indoor_running_data_duration"

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 150
    const-string v0, "calibrate_distance_indoor_running_data_step"

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 151
    const-string v0, "calibrate_distance_indoor_running_data_actual_distance"

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 153
    if-eqz v4, :cond_0

    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 154
    :cond_0
    return-void

    .line 157
    :cond_1
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity$3;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity$3;-><init>(Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;)V

    invoke-static {v4, v0}, Lo/cdl;->d(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/ArrayList;

    .line 158
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v8, v0, [I

    .line 159
    const/4 v9, 0x0

    :goto_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v9, v0, :cond_2

    .line 160
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v8, v9

    .line 159
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 162
    :cond_2
    const-string v0, "Track_DeveloperIndoorRunningActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "acquireCalibrationData(), durationDatas :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v8}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity$1;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity$1;-><init>(Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;)V

    invoke-static {v5, v0}, Lo/cdl;->d(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/ArrayList;

    .line 164
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v10, v0, [I

    .line 165
    const/4 v11, 0x0

    :goto_1
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v11, v0, :cond_3

    .line 166
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v10, v11

    .line 165
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 168
    :cond_3
    const-string v0, "Track_DeveloperIndoorRunningActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "acquireCalibrationData(), stepDatasList :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v10}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity$2;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity$2;-><init>(Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;)V

    invoke-static {v6, v0}, Lo/cdl;->d(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/util/ArrayList;

    .line 170
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v12, v0, [F

    .line 171
    const/4 v13, 0x0

    :goto_2
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v13, v0, :cond_4

    .line 172
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    aput v0, v12, v13

    .line 171
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    .line 174
    :cond_4
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/djl;->c(Landroid/content/Context;)Lo/dao;

    move-result-object v13

    .line 175
    const/4 v0, 0x0

    invoke-static {v13, v8, v10, v12, v0}, Lo/cch;->c(Lo/dao;[I[I[FI)I

    .line 176
    array-length v14, v8

    .line 177
    const/4 v15, 0x0

    :goto_3
    if-ge v15, v14, :cond_5

    .line 178
    aget v0, v8, v15

    aget v1, v10, v15

    aget v2, v12, v15

    move-object/from16 v3, p0

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->a(IIF)Landroid/view/View;

    move-result-object v16

    .line 179
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->p:Ljava/util/ArrayList;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->g:Landroid/widget/LinearLayout;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 177
    add-int/lit8 v15, v15, 0x1

    goto :goto_3

    .line 182
    :cond_5
    move-object/from16 v0, p0

    invoke-direct {v0, v8, v10, v12}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->d([I[I[F)Ljava/lang/String;

    move-result-object v15

    .line 183
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;Z)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->a(Z)V

    return-void
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->l:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 140
    return-object v2
.end method

.method private c()V
    .locals 2

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-static {v1}, Lo/cch;->e(I)F

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 136
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->d()V

    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .line 248
    const-string v0, ""

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_1

    .line 249
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 252
    :cond_1
    :try_start_1
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 253
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 254
    invoke-static {p3}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v6

    .line 255
    if-eqz v4, :cond_2

    if-eqz v5, :cond_2

    const/4 v0, 0x0

    cmpl-float v0, v6, v0

    if-nez v0, :cond_3

    .line 256
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 258
    :cond_3
    const/4 v0, 0x1

    return v0

    .line 259
    :catch_0
    move-exception v4

    .line 260
    const-string v0, "Track_DeveloperIndoorRunningActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkNumberCorrect() NumberFormatException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    const/4 v0, 0x0

    return v0
.end method

.method private d([I[I[F)Ljava/lang/String;
    .locals 4

    .line 201
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 203
    const/4 v3, 0x0

    :goto_0
    array-length v0, p1

    if-ge v3, v0, :cond_0

    .line 204
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ". duration : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget v1, p1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", step :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget v1, p2, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", distance :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget v1, p3, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 203
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 207
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    .line 208
    return-object v3
.end method

.method private d()V
    .locals 13

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 213
    return-void

    .line 215
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 216
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 217
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 218
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 220
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    .line 221
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    .line 222
    const/4 v0, 0x5

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    .line 223
    invoke-direct {p0, v7, v8, v9}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 224
    invoke-static {v9}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 228
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->d:Landroid/content/Context;

    .line 229
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_autotrack__developer_error_number:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 228
    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 230
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 231
    return-void

    .line 233
    :goto_1
    invoke-static {v4}, Lo/cdl;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 234
    invoke-static {v3}, Lo/cdl;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 235
    invoke-static {v2}, Lo/cdl;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 237
    const-string v0, "calibrate_distance_indoor_running_data_duration"

    invoke-direct {p0, v0, v10}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    const-string v0, "calibrate_distance_indoor_running_data_step"

    invoke-direct {p0, v0, v11}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    const-string v0, "calibrate_distance_indoor_running_data_actual_distance"

    invoke-direct {p0, v0, v12}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 244
    :cond_2
    return-void
.end method

.method private e()V
    .locals 3

    .line 79
    sget v0, Lcom/huawei/ui/main/R$id;->indoor_running_info_radiogroup:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->e:Landroid/widget/RadioGroup;

    .line 80
    sget v0, Lcom/huawei/ui/main/R$id;->indoor_running_open_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->a:Landroid/widget/RadioButton;

    .line 81
    sget v0, Lcom/huawei/ui/main/R$id;->indoor_running_close_radio_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->c:Landroid/widget/RadioButton;

    .line 82
    sget v0, Lcom/huawei/ui/main/R$id;->indoor_running_data_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->g:Landroid/widget/LinearLayout;

    .line 83
    sget v0, Lcom/huawei/ui/main/R$id;->data_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->h:Landroid/widget/TextView;

    .line 84
    sget v0, Lcom/huawei/ui/main/R$id;->indoor_data_A0:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->i:Landroid/widget/TextView;

    .line 85
    sget v0, Lcom/huawei/ui/main/R$id;->indoor_data_A1:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->k:Landroid/widget/TextView;

    .line 86
    sget v0, Lcom/huawei/ui/main/R$id;->save_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->m:Landroid/widget/Button;

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->m:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity$4;-><init>(Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->e:Landroid/widget/RadioGroup;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity$5;-><init>(Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->b:Lo/cce;

    const-string v1, "indoor_running_developer_running"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/cce;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->a:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->c:Landroid/widget/RadioButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 110
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->a:Landroid/widget/RadioButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->c:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 113
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->b()V

    .line 114
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->a()V

    .line 115
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->c()V

    .line 118
    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->l:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->f:Lo/dcy;

    invoke-static {v0, v1, p1, p2, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 146
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 68
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 69
    sget v0, Lcom/huawei/ui/main/R$layout;->indoor_running_setting_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->setContentView(I)V

    .line 70
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->d:Landroid/content/Context;

    .line 71
    new-instance v0, Lo/dcy;

    invoke-direct {v0}, Lo/dcy;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->f:Lo/dcy;

    .line 72
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->l:Ljava/lang/String;

    .line 73
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 74
    new-instance v0, Lo/cce;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/cce;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->b:Lo/cce;

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->e()V

    .line 76
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 63
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 64
    return-void
.end method
