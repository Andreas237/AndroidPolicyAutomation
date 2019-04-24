.class Lcom/huawei/feedback/ui/FeedbackDetailActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/ui/FeedbackDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V
    .locals 0

    .line 756
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity$a;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 759
    const/4 v0, -0x1

    if-ne v0, p2, :cond_0

    .line 760
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity$a;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->g(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V

    .line 763
    :cond_0
    return-void
.end method
