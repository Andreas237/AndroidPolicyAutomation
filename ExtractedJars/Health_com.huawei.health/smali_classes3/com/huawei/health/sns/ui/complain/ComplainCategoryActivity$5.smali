.class final Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->a(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;J)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

.field final synthetic d:J


# direct methods
.method constructor <init>(JLcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)V
    .locals 0

    .line 314
    iput-wide p1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$5;->d:J

    iput-object p3, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$5;->a:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 318
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$5;->d:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 319
    if-eqz v3, :cond_1

    .line 321
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v4

    .line 322
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 324
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$5;->a:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 326
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$5;->a:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-static {v0, v4}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->a(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;Ljava/lang/String;)V

    .line 328
    :cond_1
    return-void
.end method
