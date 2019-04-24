.class Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity$3;->c:Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity$3;->c:Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->e(Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dxd;->d(Landroid/content/Context;)Lo/dxd;

    move-result-object v0

    invoke-virtual {v0}, Lo/dxd;->d()V

    .line 139
    return-void
.end method
