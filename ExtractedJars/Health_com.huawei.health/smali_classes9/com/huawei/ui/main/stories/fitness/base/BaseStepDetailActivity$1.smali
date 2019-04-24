.class Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$1;
.super Lo/ezq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->b(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;Landroid/app/Activity;Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)V
    .locals 0

    .line 272
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$1;->b:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    invoke-direct {p0, p2}, Lo/ezq;-><init>(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public d(F)Ljava/lang/String;
    .locals 1

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$1;->b:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    invoke-interface {v0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;->a(F)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
