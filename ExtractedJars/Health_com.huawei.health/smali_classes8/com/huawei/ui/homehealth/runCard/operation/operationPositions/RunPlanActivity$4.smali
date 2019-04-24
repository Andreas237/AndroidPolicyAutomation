.class Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/RunPlanActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/RunPlanActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/RunPlanActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/RunPlanActivity;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/RunPlanActivity$4;->a:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/RunPlanActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 35
    const-string v0, "HS_RunPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goto show run plan history"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->f()V

    .line 37
    return-void
.end method
