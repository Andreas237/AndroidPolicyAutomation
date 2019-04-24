.class Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 117
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 104
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 5

    .line 108
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    .line 109
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->access$100(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;)Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->nps_user_survey_sport_health:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->access$002(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    :cond_0
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "commentString: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->access$000(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    return-void
.end method
