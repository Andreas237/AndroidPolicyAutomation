.class Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)V
    .locals 0

    .line 332
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$2;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 335
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$2;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->finish()V

    .line 336
    return-void
.end method
