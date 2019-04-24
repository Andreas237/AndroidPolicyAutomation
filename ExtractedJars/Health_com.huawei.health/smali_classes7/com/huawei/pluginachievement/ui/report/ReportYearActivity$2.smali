.class Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$2;->e:Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 80
    const-string v0, "PLGACHIEVE_ReportYearActivity"

    const-string v1, "webUrl2018 https://achievement.hicloud.com/web/annualHtml/annualReport2018.html"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$2;->e:Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;

    const-string v1, "https://achievement.hicloud.com/web/annualHtml/annualReport2018.html"

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->c(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;Ljava/lang/String;)V

    .line 82
    return-void
.end method
