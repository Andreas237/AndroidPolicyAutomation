.class Lcom/huawei/pluginachievement/ui/report/ReportActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$5;->a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 219
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$5;->a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$5;->a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->d(Landroid/content/Context;[Ljava/lang/String;)V

    .line 220
    return-void
.end method
