.class Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$ScreenSlidePagerAdapter;
.super Landroid/support/v4/app/FragmentStatePagerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ScreenSlidePagerAdapter"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;Landroid/support/v4/app/FragmentManager;)V
    .locals 0

    .line 317
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$ScreenSlidePagerAdapter;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    .line 318
    invoke-direct {p0, p2}, Landroid/support/v4/app/FragmentStatePagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 319
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$ScreenSlidePagerAdapter;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$000(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 5

    .line 323
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$ScreenSlidePagerAdapter;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$000(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->getQuestionType()Ljava/lang/String;

    move-result-object v4

    .line 325
    const-string v0, "essay"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$ScreenSlidePagerAdapter;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    new-instance v1, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$ScreenSlidePagerAdapter;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$000(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    add-int/lit8 v3, p1, 0x1

    invoke-direct {v1, v2, v3}, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;-><init>(Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;I)V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$102(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;)Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$ScreenSlidePagerAdapter;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$100(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;

    move-result-object v0

    return-object v0

    .line 329
    :cond_0
    const-string v0, "option"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 330
    new-instance v0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$ScreenSlidePagerAdapter;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$000(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    add-int/lit8 v2, p1, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;-><init>(Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;I)V

    return-object v0

    .line 334
    :cond_1
    new-instance v0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$ScreenSlidePagerAdapter;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$000(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    add-int/lit8 v2, p1, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;-><init>(Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;I)V

    return-object v0
.end method
