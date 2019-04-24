.class Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity$1;->c:Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 67
    const-string v0, "WorkModeConflictDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity$1;->c:Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;->finish()V

    .line 69
    return-void
.end method
