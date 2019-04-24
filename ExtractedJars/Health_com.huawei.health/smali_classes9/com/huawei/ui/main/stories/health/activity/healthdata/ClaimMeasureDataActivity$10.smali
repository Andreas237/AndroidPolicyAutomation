.class Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->d(Lo/acu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V
    .locals 0

    .line 418
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$10;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 421
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$10;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->l(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 422
    return-void
.end method
