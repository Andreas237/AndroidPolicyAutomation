.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V
    .locals 0

    .line 1027
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$1;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1030
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 1031
    const/4 v0, 0x1

    return v0

    .line 1033
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
