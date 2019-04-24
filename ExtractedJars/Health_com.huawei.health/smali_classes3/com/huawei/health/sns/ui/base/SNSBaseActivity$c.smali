.class public Lcom/huawei/health/sns/ui/base/SNSBaseActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/base/SNSBaseActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/base/SNSBaseActivity;)V
    .locals 0

    .line 363
    iput-object p1, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$c;->c:Lcom/huawei/health/sns/ui/base/SNSBaseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    .line 369
    iget-object v0, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$c;->c:Lcom/huawei/health/sns/ui/base/SNSBaseActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->i()I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$c;->c:Lcom/huawei/health/sns/ui/base/SNSBaseActivity;

    iget v0, v0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->i:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$c;->c:Lcom/huawei/health/sns/ui/base/SNSBaseActivity;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->i()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 371
    iget-object v0, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$c;->c:Lcom/huawei/health/sns/ui/base/SNSBaseActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$c;->c:Lcom/huawei/health/sns/ui/base/SNSBaseActivity;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->i()I

    move-result v1

    iput v1, v0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->i:I

    .line 372
    iget-object v0, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$c;->c:Lcom/huawei/health/sns/ui/base/SNSBaseActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->f()V

    .line 374
    :cond_0
    return-void
.end method
