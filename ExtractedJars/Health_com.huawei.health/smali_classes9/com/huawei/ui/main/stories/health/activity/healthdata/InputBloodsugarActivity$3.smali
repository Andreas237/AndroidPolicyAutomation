.class Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V
    .locals 0

    .line 266
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$3;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 269
    const-string v0, "UIHLH_InputBloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dialog is dismiss"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    return-void
.end method
