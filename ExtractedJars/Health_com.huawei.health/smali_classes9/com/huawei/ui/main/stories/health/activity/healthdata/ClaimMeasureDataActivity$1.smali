.class Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V
    .locals 0

    .line 367
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 370
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->h(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 371
    return-void
.end method
