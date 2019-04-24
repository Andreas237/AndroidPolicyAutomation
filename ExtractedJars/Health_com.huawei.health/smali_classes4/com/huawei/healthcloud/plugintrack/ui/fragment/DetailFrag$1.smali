.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;)V
    .locals 0

    .line 311
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag$1;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 316
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag$1;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lo/cgl;->e(ILandroid/content/Context;)V

    .line 317
    return-void
.end method
