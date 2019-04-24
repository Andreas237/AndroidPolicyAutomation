.class Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V
    .locals 0

    .line 294
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u786e\u8ba4"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->k(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->h(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_3

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    const-string v1, "measureEnd"

    const/high16 v2, 0x42c80000    # 100.0f

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Ljava/lang/String;F)V

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d(I)V

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "if \u4e2d\u9014\u9000\u51fa \u56de\u9000\u952e \u7b97\u6cd5\u80fd\u8fd4\u56de\u7ed3\u679c  \u5173\u95ed\u8bbe\u5907"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Z)Z

    .line 310
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Z)Z

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " if \u4e2d\u9014\u9000\u51fa \u56de\u9000\u952e \u7b97\u6cd5\u80fd\u8fd4\u56de\u7ed3\u679c \u8fdb\u5165stopTimer()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->e()V

    .line 315
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Z)Z

    goto/16 :goto_0

    .line 317
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u91cd\u542f\u540estressGameMainActivity.stressGameBindService \u4e3a\u7a7a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 323
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d(I)V

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    const-string v1, "measureEnd"

    const/high16 v2, 0x43960000    # 300.0f

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Ljava/lang/String;F)V

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 331
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d(I)V

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "else \u4e2d\u9014\u9000\u51fa \u56de\u9000\u952e \u7b97\u6cd5\u4e0d\u80fd\u8fd4\u56de\u7ed3\u679c  \u5173\u95ed\u8bbe\u5907"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Z)Z

    .line 337
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 338
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Z)Z

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "else \u4e2d\u9014\u9000\u51fa \u56de\u9000\u952e \u7b97\u6cd5\u4e0d\u80fd\u8fd4\u56de\u7ed3\u679c \u8fdb\u5165stopTimer()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->e()V

    goto :goto_0

    .line 343
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u91cd\u542f\u540estressGameMainActivity.stressGameBindService \u4e3a\u7a7a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    :cond_6
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Z)Z

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;II)V

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->finish()V

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->overridePendingTransition(II)V

    .line 352
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u9500\u6bc1\u6e38\u620f\u9875\u9762"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$5;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->p(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Lo/bvb;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvb;->c()Lo/bvb;

    .line 354
    return-void
.end method
