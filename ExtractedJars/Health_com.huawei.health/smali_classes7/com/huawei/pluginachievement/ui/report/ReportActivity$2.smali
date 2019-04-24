.class Lcom/huawei/pluginachievement/ui/report/ReportActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/report/ReportActivity;->a()V
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

    .line 159
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$2;->a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 162
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$2;->a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dxb;->a(Landroid/content/Context;)Lo/dxb;

    move-result-object v0

    .line 163
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 162
    const-wide/16 v1, 0x0

    const/16 v5, 0xb

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/dxb;->b(JJILo/duh;)V

    .line 164
    return-void
.end method
