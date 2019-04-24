.class Lcom/huawei/feedback/ui/FeedbackEditActivity$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/ui/FeedbackEditActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "g"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackEditActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 1796
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$g;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;Lcom/huawei/feedback/ui/n;)V
    .locals 0

    .line 1796
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/FeedbackEditActivity$g;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1799
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$g;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->c(Lcom/huawei/feedback/ui/FeedbackEditActivity;Z)Z

    .line 1801
    const-string v0, "FeedbackEditActivity"

    const-string v1, "isFromOutside cancle click"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1802
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$g;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/d;->c(I)V

    .line 1803
    return-void
.end method
