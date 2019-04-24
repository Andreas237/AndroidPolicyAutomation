.class Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V
    .locals 0

    .line 516
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$2;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 519
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$2;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$2;->b:Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->initOpenServiceDB(Ljava/lang/String;)I

    .line 520
    return-void
.end method
