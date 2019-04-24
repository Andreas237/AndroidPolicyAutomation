.class Lo/eue$a;
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
    name = "a"
.end annotation


# instance fields
.field private b:Lo/eug;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/eug;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    iput-object p1, p0, Lo/eue$a;->e:Landroid/content/Context;

    .line 151
    iput-object p2, p0, Lo/eue$a;->b:Lo/eug;

    .line 152
    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 1

    .line 166
    iget-object v0, p0, Lo/eue$a;->b:Lo/eug;

    invoke-interface {v0, p1, p2}, Lo/eug;->b(ILjava/lang/String;)V

    .line 167
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 5

    .line 157
    :try_start_0
    iget-object v0, p0, Lo/eue$a;->e:Landroid/content/Context;

    move-object v1, p1

    check-cast v1, Lo/eui;

    iget-object v2, p0, Lo/eue$a;->b:Lo/eug;

    invoke-static {v0, v1, v2}, Lo/eue;->d(Landroid/content/Context;Lo/eui;Lo/eug;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    goto :goto_0

    .line 158
    :catch_0
    move-exception v4

    .line 159
    const-string v0, "HuaweiCloudLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    :goto_0
    return-void
.end method
