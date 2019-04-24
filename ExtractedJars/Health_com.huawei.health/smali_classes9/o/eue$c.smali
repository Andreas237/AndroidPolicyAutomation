.class Lo/eue$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eug;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lo/eug;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/eug;)V
    .locals 0

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    iput-object p1, p0, Lo/eue$c;->b:Landroid/content/Context;

    .line 120
    iput-object p2, p0, Lo/eue$c;->c:Lo/eug;

    .line 121
    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 1

    .line 139
    iget-object v0, p0, Lo/eue$c;->c:Lo/eug;

    invoke-interface {v0, p1, p2}, Lo/eug;->b(ILjava/lang/String;)V

    .line 140
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 5

    .line 125
    const-string v0, "com.huawei.bone"

    iget-object v1, p0, Lo/eue$c;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lo/eue$c;->c:Lo/eug;

    invoke-interface {v0, p1}, Lo/eug;->b(Ljava/lang/Object;)V

    goto :goto_0

    .line 129
    :cond_0
    :try_start_0
    iget-object v0, p0, Lo/eue$c;->b:Landroid/content/Context;

    move-object v1, p1

    check-cast v1, Lo/eui;

    iget-object v2, p0, Lo/eue$c;->c:Lo/eug;

    invoke-static {v0, v1, v2}, Lo/eue;->d(Landroid/content/Context;Lo/eui;Lo/eug;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    goto :goto_0

    .line 130
    :catch_0
    move-exception v4

    .line 131
    const-string v0, "HuaweiCloudLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    :goto_0
    return-void
.end method
