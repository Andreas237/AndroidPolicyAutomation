.class Lcom/huawei/feedback/ui/am;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;I)V
    .locals 0

    .line 1322
    iput-object p1, p0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iput p2, p0, Lcom/huawei/feedback/ui/am;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 17

    .line 1326
    invoke-static {}, Lcom/huawei/feedback/e;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1327
    return-void

    .line 1331
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v13

    .line 1332
    const/4 v0, 0x1

    if-ne v0, v13, :cond_6

    .line 1333
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/f;->b(I)V

    .line 1334
    new-instance v0, Lcom/huawei/feedback/bean/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/feedback/bean/d$a;-><init>(I)V

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d$a;->a()Lcom/huawei/feedback/bean/d;

    move-result-object v14

    .line 1336
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->x()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1337
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    .line 1338
    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->x()Ljava/lang/String;

    move-result-object v0

    .line 1337
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v14, v0}, Lcom/huawei/feedback/bean/d;->d(I)V

    .line 1341
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/feedback/bean/d;->h(Ljava/lang/String;)V

    .line 1342
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1343
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    .line 1344
    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->o()Ljava/lang/String;

    move-result-object v0

    .line 1343
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v14, v0}, Lcom/huawei/feedback/bean/d;->b(I)V

    .line 1346
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->c()Z

    move-result v0

    invoke-virtual {v14, v0}, Lcom/huawei/feedback/bean/d;->a(Z)V

    .line 1347
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/feedback/bean/d;->i(Ljava/lang/String;)V

    .line 1348
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->d()Z

    move-result v0

    invoke-virtual {v14, v0}, Lcom/huawei/feedback/bean/d;->b(Z)V

    .line 1349
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/feedback/bean/d;->e(Ljava/lang/String;)V

    .line 1350
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->w()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/feedback/bean/d;->f(Ljava/lang/String;)V

    .line 1351
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/feedback/bean/d;->j(Ljava/lang/String;)V

    .line 1352
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/feedback/bean/d;->d(Ljava/lang/String;)V

    .line 1353
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/feedback/bean/d;->g(Ljava/lang/String;)V

    .line 1354
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->v()I

    move-result v0

    invoke-virtual {v14, v0}, Lcom/huawei/feedback/bean/d;->a(I)V

    .line 1355
    const-string v0, "FeedbackRecordActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bf.getFeedbackRecordId()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1356
    invoke-virtual {v14}, Lcom/huawei/feedback/bean/d;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1355
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1360
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->b()Ljava/lang/String;

    move-result-object v15

    .line 1361
    const-string v16, ""

    .line 1362
    invoke-virtual {v14}, Lcom/huawei/feedback/bean/d;->q()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1363
    invoke-virtual {v14}, Lcom/huawei/feedback/bean/d;->q()Ljava/lang/String;

    move-result-object v16

    .line 1365
    :cond_3
    if-eqz v16, :cond_5

    .line 1366
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/b/a;->a()Lcom/huawei/phoneserviceuni/common/e/b/a;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/logic/i;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v2, v2, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    iget-object v4, v2, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b:Lcom/huawei/lcagent/client/LogCollectManager;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    .line 1368
    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a(Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;)Landroid/content/Context;

    move-result-object v6

    .line 1369
    invoke-virtual {v14}, Lcom/huawei/feedback/bean/d;->k()Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v7, "1"

    goto :goto_0

    :cond_4
    const-string v7, "0"

    .line 1371
    :goto_0
    invoke-virtual {v14}, Lcom/huawei/feedback/bean/d;->p()Ljava/lang/String;

    move-result-object v8

    new-instance v2, Ljava/io/File;

    move-object/from16 v3, v16

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1372
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    move-object v2, v14

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object/from16 v10, v16

    const/4 v11, 0x0

    move-object v12, v15

    invoke-direct/range {v1 .. v12}, Lcom/huawei/feedback/logic/i;-><init>(Lcom/huawei/feedback/bean/d;ILcom/huawei/lcagent/client/LogCollectManager;Lcom/huawei/lcagent/client/LogMetricInfo;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;)V

    .line 1367
    invoke-virtual {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/b/a;->a(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 1375
    :cond_5
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "FeedbackSubmitTask Exception--> zipfilepath is null"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1382
    :goto_1
    goto :goto_2

    :cond_6
    const/4 v0, 0x2

    if-ne v0, v13, :cond_7

    .line 1383
    new-instance v14, Landroid/content/Intent;

    invoke-direct {v14}, Landroid/content/Intent;-><init>()V

    .line 1384
    const-string v0, "com.example.logupload.progress.start"

    invoke-virtual {v14, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1385
    const-string v0, "strID"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v1, v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v1

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/feedback/ui/am;->a:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/feedback/bean/f;

    .line 1386
    invoke-virtual {v1}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v1

    .line 1385
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v14, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1387
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1388
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/am;->b:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-virtual {v0, v14}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 1391
    :cond_7
    :goto_2
    return-void
.end method
