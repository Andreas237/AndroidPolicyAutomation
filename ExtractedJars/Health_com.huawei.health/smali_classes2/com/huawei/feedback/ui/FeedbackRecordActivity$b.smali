.class Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/ui/FeedbackRecordActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

.field private b:Landroid/view/LayoutInflater;

.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;Landroid/content/Context;)V
    .locals 1

    .line 1107
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    .line 1108
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 1109
    iput-object p2, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->c:Landroid/content/Context;

    .line 1110
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->b:Landroid/view/LayoutInflater;

    .line 1111
    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;)Landroid/content/Context;
    .locals 1

    .line 1097
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->c:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 3

    .line 1518
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1519
    return-void

    .line 1522
    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 1523
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->t()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1524
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1522
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1528
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->notifyDataSetChanged()V

    .line 1529
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 1114
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 1118
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 1122
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 25

    .line 1127
    const/4 v5, 0x0

    .line 1128
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->b:Landroid/view/LayoutInflater;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v2, "feedback_newfeedback_upload_item"

    .line 1129
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    .line 1128
    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 1133
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1f

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, p1

    if-le v0, v1, :cond_1f

    .line 1136
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->r()Ljava/lang/String;

    move-result-object v6

    .line 1138
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v1, "feedbackQuestion"

    .line 1139
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 1143
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v1, "detail_progress"

    .line 1144
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 1146
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1148
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v1, "line1"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    .line 1149
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v1, "line2"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    .line 1150
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v1, "line3"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    .line 1155
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->q()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 1157
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-virtual {v0, v6}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->a(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v12

    .line 1158
    invoke-virtual {v7, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1159
    goto :goto_0

    .line 1160
    :cond_0
    if-eqz v6, :cond_1

    .line 1161
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1168
    :cond_1
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v1, "feedbackType"

    .line 1169
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/TextView;

    .line 1171
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1172
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->o()Ljava/lang/String;

    move-result-object v13

    .line 1173
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v13}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "[0-9]+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1175
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 1177
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 1178
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "feedback_cloud_service"

    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    .line 1177
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1183
    :cond_3
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->u()I

    move-result v13

    .line 1185
    if-lez v13, :cond_4

    .line 1187
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->c:Landroid/content/Context;

    const-string v1, "feedbackReply"

    .line 1188
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    .line 1187
    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Landroid/widget/TextView;

    .line 1189
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    .line 1190
    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->c:Landroid/content/Context;

    const-string v2, "feedback_question_type_color"

    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 1189
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1192
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1193
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    .line 1194
    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->c:Landroid/content/Context;

    const-string v2, "feedback_question_type_color"

    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 1193
    invoke-virtual {v14, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1196
    goto :goto_2

    .line 1198
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->c:Landroid/content/Context;

    const-string v1, "feedbackReply"

    .line 1199
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    .line 1198
    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Landroid/widget/TextView;

    .line 1201
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    .line 1202
    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->c:Landroid/content/Context;

    const-string v2, "feedback_text_color1"

    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 1201
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1204
    const/16 v0, 0x8

    invoke-virtual {v14, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1208
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->p()Ljava/lang/String;

    move-result-object v14

    .line 1209
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->c:Landroid/content/Context;

    const-string v1, "feedbackTime"

    .line 1210
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Landroid/widget/TextView;

    .line 1212
    if-eqz v14, :cond_5

    .line 1213
    invoke-virtual {v15, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1216
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v16

    .line 1217
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v1, "tv_uploadfeedback_type"

    .line 1218
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Landroid/widget/TextView;

    .line 1220
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v1, "feedbackRelativeLayout"

    .line 1221
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Landroid/widget/RelativeLayout;

    .line 1225
    if-nez p1, :cond_9

    .line 1226
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1227
    if-eqz v11, :cond_6

    .line 1228
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1230
    :cond_6
    const/16 v0, 0x8

    invoke-virtual {v10, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1231
    const/16 v0, 0x8

    invoke-virtual {v9, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1232
    move/from16 v0, v16

    const/4 v1, 0x3

    if-eq v0, v1, :cond_7

    if-nez v16, :cond_8

    .line 1234
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v2, "feedback_records"

    .line 1235
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1234
    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1239
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b(Lcom/huawei/feedback/ui/FeedbackRecordActivity;Z)V

    goto/16 :goto_3

    .line 1242
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v2, "feedback_advanced_logupload_task_title"

    .line 1243
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    .line 1242
    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 1250
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    add-int/lit8 v1, p1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v19

    .line 1256
    move/from16 v0, v19

    const/4 v1, 0x3

    if-eq v0, v1, :cond_a

    if-nez v19, :cond_b

    :cond_a
    move/from16 v0, v16

    const/4 v1, 0x3

    if-eq v0, v1, :cond_d

    if-eqz v16, :cond_d

    :cond_b
    move/from16 v0, v19

    const/4 v1, 0x1

    if-eq v0, v1, :cond_c

    move/from16 v0, v19

    const/4 v1, 0x2

    if-eq v0, v1, :cond_c

    move/from16 v0, v19

    const/4 v1, 0x5

    if-ne v0, v1, :cond_f

    :cond_c
    move/from16 v0, v16

    const/4 v1, 0x1

    if-eq v0, v1, :cond_d

    move/from16 v0, v16

    const/4 v1, 0x2

    if-eq v0, v1, :cond_d

    move/from16 v0, v16

    const/4 v1, 0x5

    if-ne v0, v1, :cond_f

    .line 1266
    :cond_d
    move-object/from16 v0, v18

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1267
    if-eqz v11, :cond_e

    .line 1268
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1270
    :cond_e
    const/16 v0, 0x8

    invoke-virtual {v10, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1271
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    .line 1278
    :cond_f
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1279
    if-eqz v11, :cond_10

    .line 1280
    const/16 v0, 0x8

    invoke-virtual {v11, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1282
    :cond_10
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1283
    const/16 v0, 0x8

    invoke-virtual {v9, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1285
    move/from16 v0, v16

    const/4 v1, 0x3

    if-eq v0, v1, :cond_11

    if-nez v16, :cond_12

    .line 1287
    :cond_11
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v2, "feedback_records"

    .line 1288
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1287
    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1292
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b(Lcom/huawei/feedback/ui/FeedbackRecordActivity;Z)V

    goto :goto_3

    .line 1295
    :cond_12
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v2, "feedback_advanced_logupload_task_title"

    .line 1296
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    .line 1295
    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1303
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v1, "feedbackItem_plus"

    .line 1304
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Landroid/widget/LinearLayout;

    .line 1315
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v1, "btn_upload_retransmit"

    .line 1316
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Landroid/widget/Button;

    .line 1319
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v1, "tv_uploadprogress"

    .line 1320
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Landroid/widget/TextView;

    .line 1322
    new-instance v0, Lcom/huawei/feedback/ui/am;

    move-object/from16 v1, p0

    move/from16 v2, p1

    invoke-direct {v0, v1, v2}, Lcom/huawei/feedback/ui/am;-><init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;I)V

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1395
    move/from16 v0, v16

    const/4 v1, 0x1

    if-ne v0, v1, :cond_13

    .line 1397
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1401
    move-object/from16 v0, v20

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 1402
    move-object/from16 v0, v21

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_5

    .line 1405
    :cond_13
    move/from16 v0, v16

    const/4 v1, 0x2

    if-ne v0, v1, :cond_14

    .line 1406
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1410
    move-object/from16 v0, v20

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 1411
    move-object/from16 v0, v21

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1412
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v2, "feedback_advanced_logupload_fail"

    .line 1413
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    .line 1412
    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    .line 1421
    :cond_14
    move/from16 v0, v16

    const/4 v1, 0x3

    if-eq v0, v1, :cond_15

    if-nez v16, :cond_19

    .line 1430
    :cond_15
    move-object/from16 v0, v19

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1431
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1432
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->a()I

    move-result v22

    .line 1433
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v2, "feedback_handle_progress"

    .line 1434
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    .line 1433
    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getString(I)Ljava/lang/String;

    move-result-object v23

    .line 1436
    const-string v24, ""

    .line 1437
    if-nez v22, :cond_16

    .line 1438
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v4, "feedback_submitted"

    .line 1439
    invoke-static {v3, v4}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1438
    move-object/from16 v2, v23

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v24

    .line 1441
    move-object/from16 v0, v24

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 1442
    :cond_16
    move/from16 v0, v22

    const/4 v1, 0x1

    if-ne v0, v1, :cond_17

    .line 1443
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v4, "feedback_tobe_evaluated"

    .line 1444
    invoke-static {v3, v4}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    .line 1443
    invoke-virtual {v2, v3}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, v23

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v24

    .line 1446
    move-object/from16 v0, v24

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 1447
    :cond_17
    move/from16 v0, v22

    const/4 v1, 0x2

    if-ne v0, v1, :cond_18

    .line 1448
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v4, "feedback_has_evaluated"

    .line 1449
    invoke-static {v3, v4}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1448
    move-object/from16 v2, v23

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v24

    .line 1451
    move-object/from16 v0, v24

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1453
    :cond_18
    :goto_4
    goto/16 :goto_5

    .line 1455
    :cond_19
    move/from16 v0, v16

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1f

    .line 1457
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1458
    move-object/from16 v0, v21

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1459
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->g()Ljava/lang/String;

    move-result-object v22

    .line 1460
    const/4 v0, 0x0

    move-object/from16 v1, v22

    if-ne v0, v1, :cond_1a

    .line 1461
    const-string v22, ""

    .line 1463
    :cond_1a
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->f()Ljava/lang/String;

    move-result-object v23

    .line 1466
    const-string v0, "1"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    const-string v0, ""

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    const-string v0, "0"

    .line 1467
    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 1471
    :cond_1b
    move-object/from16 v0, v20

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 1476
    if-eqz v23, :cond_1d

    .line 1477
    const-string v0, ""

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 1478
    .line 1479
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    .line 1480
    invoke-virtual {v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v3, "feedback_advanced_loguploading"

    .line 1481
    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 1480
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "0%"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1479
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 1486
    :cond_1c
    move-object/from16 v0, v21

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 1489
    :cond_1d
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    .line 1490
    invoke-virtual {v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v3, "feedback_advanced_loguploading"

    .line 1491
    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 1490
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "0%"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1489
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 1498
    :cond_1e
    const-string v0, "2"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 1502
    move-object/from16 v0, v20

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 1504
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const-string v2, "feedback_advanced_logupload_fail"

    .line 1505
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    .line 1504
    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1511
    :cond_1f
    :goto_5
    return-object v5
.end method
