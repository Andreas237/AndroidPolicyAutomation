.class Lcom/huawei/health/MainActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/MainActivity;->I()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/MainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 1606
    iput-object p1, p0, Lcom/huawei/health/MainActivity$1;->e:Lcom/huawei/health/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1609
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dgk;->b(Z)V

    .line 1610
    iget-object v0, p0, Lcom/huawei/health/MainActivity$1;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_user_experience_plan_check_box"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 1612
    return-void
.end method
