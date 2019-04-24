.class public Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Landroid/widget/TextView;

.field private C:Landroid/widget/Button;

.field private a:Landroid/content/Context;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/Button;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/TextView;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/TextView;

.field private z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private a()V
    .locals 14

    .line 124
    const-string v0, "DeveloperLabelActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initLabelFromCloud"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    invoke-static {p0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v4

    .line 127
    const/16 v0, 0x4e29

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_userLabel_key"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 128
    const/4 v0, 0x0

    if-eq v0, v5, :cond_9

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_9

    .line 129
    const-string v0, ","

    invoke-virtual {v5, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    .line 130
    const-string v0, "DeveloperLabelActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initLabelFromCloud, userAllLabel = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    const-string v2, "userAllLabel.size() = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x5

    if-gt v1, v0, :cond_9

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->d:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->k:Landroid/widget/TextView;

    const/4 v1, 0x3

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->h:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    const/4 v7, 0x0

    .line 138
    const-string v8, ""

    .line 139
    const/4 v9, 0x7

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_9

    .line 140
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v10

    .line 141
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    add-int/lit8 v1, v10, -0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    .line 142
    const-string v0, "DeveloperLabelActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initLabelFromCloud, subLabel = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    move-object v12, v11

    const/4 v13, -0x1

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v0, "SportRun"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v13, 0x0

    goto/16 :goto_1

    :sswitch_1
    const-string v0, "SportStep"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v13, 0x1

    goto :goto_1

    :sswitch_2
    const-string v0, "SportBike"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v13, 0x2

    goto :goto_1

    :sswitch_3
    const-string v0, "SportFitness"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v13, 0x3

    goto :goto_1

    :sswitch_4
    const-string v0, "Fatreduce"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v13, 0x4

    goto :goto_1

    :sswitch_5
    const-string v0, "BloodSugar"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v13, 0x5

    goto :goto_1

    :sswitch_6
    const-string v0, "BloodPressure"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v13, 0x6

    goto :goto_1

    :sswitch_7
    const-string v0, "FitnessFacility"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v13, 0x7

    goto :goto_1

    :sswitch_8
    const-string v0, "ActivityDistribution"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v13, 0x8

    :cond_0
    :goto_1
    packed-switch v13, :pswitch_data_0

    goto/16 :goto_2

    .line 145
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->n:Landroid/widget/TextView;

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    goto/16 :goto_3

    .line 148
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->o:Landroid/widget/TextView;

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    goto/16 :goto_3

    .line 151
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->m:Landroid/widget/TextView;

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 152
    goto/16 :goto_3

    .line 154
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->t:Landroid/widget/TextView;

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 155
    goto/16 :goto_3

    .line 157
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->r:Landroid/widget/TextView;

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    goto/16 :goto_3

    .line 160
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->y:Landroid/widget/TextView;

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 161
    goto/16 :goto_3

    .line 163
    :pswitch_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->v:Landroid/widget/TextView;

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    goto/16 :goto_3

    .line 166
    :pswitch_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->w:Landroid/widget/TextView;

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 167
    goto/16 :goto_3

    .line 169
    :pswitch_8
    goto/16 :goto_3

    .line 171
    :goto_2
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "blood_pressure"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 172
    const/4 v7, 0x1

    .line 173
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 174
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 176
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "blood_pressure"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 178
    :cond_2
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "weight"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    .line 179
    const/4 v7, 0x1

    .line 180
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 181
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 183
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "weight"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 185
    :cond_4
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "blood_sugar"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    .line 186
    const/4 v7, 0x1

    .line 187
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 188
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 190
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "blood_sugar"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 192
    :cond_6
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "heart_rate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_8

    .line 193
    const/4 v7, 0x1

    .line 194
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 195
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 197
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "heart_rate"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 199
    :cond_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->A:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    :goto_3
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 205
    :cond_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x695e2569 -> :sswitch_0
        -0x585dd661 -> :sswitch_4
        -0x30a63775 -> :sswitch_7
        -0x2848200c -> :sswitch_3
        -0x25c129c1 -> :sswitch_6
        0x14fdab53 -> :sswitch_8
        0x31b11f7c -> :sswitch_5
        0x3d920555 -> :sswitch_2
        0x3d99e840 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method private b()V
    .locals 1

    .line 89
    sget v0, Lcom/huawei/ui/main/R$id;->gender_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->b:Landroid/widget/TextView;

    .line 90
    sget v0, Lcom/huawei/ui/main/R$id;->age_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->d:Landroid/widget/TextView;

    .line 91
    sget v0, Lcom/huawei/ui/main/R$id;->height_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->k:Landroid/widget/TextView;

    .line 92
    sget v0, Lcom/huawei/ui/main/R$id;->weight_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->h:Landroid/widget/TextView;

    .line 93
    sget v0, Lcom/huawei/ui/main/R$id;->step_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->o:Landroid/widget/TextView;

    .line 94
    sget v0, Lcom/huawei/ui/main/R$id;->run_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->n:Landroid/widget/TextView;

    .line 95
    sget v0, Lcom/huawei/ui/main/R$id;->bike_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->m:Landroid/widget/TextView;

    .line 96
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->t:Landroid/widget/TextView;

    .line 97
    sget v0, Lcom/huawei/ui/main/R$id;->fat_reduce_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->r:Landroid/widget/TextView;

    .line 98
    sget v0, Lcom/huawei/ui/main/R$id;->blood_sugar_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->y:Landroid/widget/TextView;

    .line 99
    sget v0, Lcom/huawei/ui/main/R$id;->blood_pressure_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->v:Landroid/widget/TextView;

    .line 100
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_facility_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->w:Landroid/widget/TextView;

    .line 101
    sget v0, Lcom/huawei/ui/main/R$id;->device_type_up_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->A:Landroid/widget/TextView;

    .line 103
    sget v0, Lcom/huawei/ui/main/R$id;->local_gender_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->e:Landroid/widget/TextView;

    .line 104
    sget v0, Lcom/huawei/ui/main/R$id;->local_age_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->c:Landroid/widget/TextView;

    .line 105
    sget v0, Lcom/huawei/ui/main/R$id;->local_height_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->f:Landroid/widget/TextView;

    .line 106
    sget v0, Lcom/huawei/ui/main/R$id;->local_weight_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->g:Landroid/widget/TextView;

    .line 107
    sget v0, Lcom/huawei/ui/main/R$id;->local_step_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->i:Landroid/widget/TextView;

    .line 108
    sget v0, Lcom/huawei/ui/main/R$id;->local_run_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->p:Landroid/widget/TextView;

    .line 109
    sget v0, Lcom/huawei/ui/main/R$id;->local_bike_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->l:Landroid/widget/TextView;

    .line 110
    sget v0, Lcom/huawei/ui/main/R$id;->local_fitness_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->s:Landroid/widget/TextView;

    .line 111
    sget v0, Lcom/huawei/ui/main/R$id;->local_fat_reduce_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->u:Landroid/widget/TextView;

    .line 112
    sget v0, Lcom/huawei/ui/main/R$id;->local_blood_sugar_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->q:Landroid/widget/TextView;

    .line 113
    sget v0, Lcom/huawei/ui/main/R$id;->local_blood_pressure_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->x:Landroid/widget/TextView;

    .line 114
    sget v0, Lcom/huawei/ui/main/R$id;->local_fitness_facility_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->z:Landroid/widget/TextView;

    .line 115
    sget v0, Lcom/huawei/ui/main/R$id;->local_device_type_up_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->B:Landroid/widget/TextView;

    .line 117
    sget v0, Lcom/huawei/ui/main/R$id;->generateButton:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->j:Landroid/widget/Button;

    .line 118
    sget v0, Lcom/huawei/ui/main/R$id;->refreshButton:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->C:Landroid/widget/Button;

    .line 119
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->a()V

    .line 120
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->d()V

    .line 121
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->c()V

    return-void
.end method

.method private c()V
    .locals 9

    .line 239
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide v2, 0x9a7ec800L

    sub-long v4, v0, v2

    .line 240
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 241
    new-instance v8, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-direct {v8}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;-><init>()V

    .line 242
    invoke-static {p0}, Lo/dnj;->d(Landroid/content/Context;)V

    .line 243
    invoke-static {p0}, Lo/dnj;->c(Landroid/content/Context;)V

    .line 244
    invoke-static {p0}, Lo/dnj;->a(Landroid/content/Context;)V

    .line 245
    invoke-static {p0}, Lo/dnj;->e(Landroid/content/Context;)V

    .line 246
    invoke-static {p0}, Lo/dnj;->b(Landroid/content/Context;)V

    .line 247
    invoke-static {p0}, Lo/dnj;->g(Landroid/content/Context;)V

    .line 248
    invoke-static {p0}, Lo/dnj;->k(Landroid/content/Context;)V

    .line 249
    invoke-virtual {v8, v4, v5, v6, v7}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->e(JJ)V

    .line 250
    invoke-static {p0}, Lo/dnj;->i(Landroid/content/Context;)V

    .line 251
    invoke-static {p0}, Lo/dnj;->f(Landroid/content/Context;)V

    .line 252
    invoke-static {p0}, Lo/dnj;->h(Landroid/content/Context;)V

    .line 253
    invoke-static {p0}, Lo/dnj;->n(Landroid/content/Context;)V

    .line 254
    invoke-static {p0}, Lo/dnj;->o(Landroid/content/Context;)V

    .line 255
    return-void
.end method

.method private d()V
    .locals 17

    .line 208
    const-string v0, "DeveloperLabelActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initLabelFromLocal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->a:Landroid/content/Context;

    const-string v1, "gender"

    invoke-static {v0, v1}, Lo/dnc;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 210
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->a:Landroid/content/Context;

    const-string v1, "age"

    invoke-static {v0, v1}, Lo/dnc;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 211
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->a:Landroid/content/Context;

    const-string v1, "height"

    invoke-static {v0, v1}, Lo/dnc;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 212
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->a:Landroid/content/Context;

    const-string v1, "weight"

    invoke-static {v0, v1}, Lo/dnc;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 213
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->a:Landroid/content/Context;

    const-string v1, "health_sport_grade_up"

    invoke-static {v0, v1}, Lo/dnc;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 214
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->a:Landroid/content/Context;

    const-string v1, "health_sport_freq_up"

    invoke-static {v0, v1}, Lo/dnc;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 215
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->a:Landroid/content/Context;

    const-string v1, "health_sport_bike_up"

    invoke-static {v0, v1}, Lo/dnc;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 216
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->a:Landroid/content/Context;

    const-string v1, "health_sport_Bodybuilding"

    invoke-static {v0, v1}, Lo/dnc;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 217
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->a:Landroid/content/Context;

    const-string v1, "health_fat_reducing_group_up"

    invoke-static {v0, v1}, Lo/dnc;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 218
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->a:Landroid/content/Context;

    const-string v1, "health_blood_sugar_group_up"

    invoke-static {v0, v1}, Lo/dnc;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 219
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->a:Landroid/content/Context;

    const-string v1, "health_blood_pressure_group_up"

    invoke-static {v0, v1}, Lo/dnc;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 220
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->a:Landroid/content/Context;

    const-string v1, "health_fitness_facility_up"

    invoke-static {v0, v1}, Lo/dnc;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 221
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->a:Landroid/content/Context;

    const-string v1, "health_device_type_up"

    invoke-static {v0, v1}, Lo/dnc;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 222
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 223
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 225
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 226
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 227
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 228
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 229
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->s:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 231
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->x:Landroid/widget/TextView;

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 233
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v0, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 234
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->B:Landroid/widget/TextView;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 235
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->d()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 69
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 70
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_developer_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->setContentView(I)V

    .line 71
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->a:Landroid/content/Context;

    .line 72
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->b()V

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->j:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity$5;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;->C:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity$1;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    return-void
.end method
