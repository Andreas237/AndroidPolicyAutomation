.class Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(Lo/acu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)V
    .locals 0

    .line 1193
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$15;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1196
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$15;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->u(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$15;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->u(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;)Landroid/content/Context;

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 1197
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 1198
    return-void
.end method
