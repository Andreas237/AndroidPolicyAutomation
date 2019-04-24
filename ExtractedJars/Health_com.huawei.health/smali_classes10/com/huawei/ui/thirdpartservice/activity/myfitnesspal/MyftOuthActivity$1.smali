.class Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;)V
    .locals 0

    .line 279
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity$1;->e:Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity$1;->e:Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;)Lo/fjx;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fjx;->d(Z)V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity$1;->e:Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;)Lo/fjw;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fjw;->c(Ljava/lang/Boolean;)V

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity$1;->e:Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->b(Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;)V

    .line 285
    return-void
.end method
