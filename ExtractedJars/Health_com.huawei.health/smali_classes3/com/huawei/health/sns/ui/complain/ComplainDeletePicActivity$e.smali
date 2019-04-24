.class Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;)V
    .locals 0

    .line 263
    iput-object p1, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$e;->c:Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$5;)V
    .locals 0

    .line 263
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$e;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 268
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$e;->c:Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;

    const-string v1, ""

    iget-object v2, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$e;->c:Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;

    .line 269
    invoke-static {v2}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->a(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;)Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_delete_dialog_msg:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$e$2;

    invoke-direct {v3, p0}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$e$2;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$e;)V

    .line 268
    invoke-static {v0, v1, v2, v3}, Lo/boj;->c(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lo/boj$c;)V

    .line 284
    return-void
.end method
