.class Lcom/huawei/feedback/ui/FeedbackEditActivity$e;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/ui/FeedbackEditActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field a:Landroid/content/Context;

.field b:[Ljava/lang/String;

.field final synthetic c:Lcom/huawei/feedback/ui/FeedbackEditActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;Landroid/content/Context;I[Ljava/lang/String;)V
    .locals 1

    .line 1426
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$e;->c:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 1427
    invoke-direct {p0, p2, p3, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 1424
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$e;->b:[Ljava/lang/String;

    .line 1428
    iput-object p4, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$e;->b:[Ljava/lang/String;

    .line 1429
    iput-object p2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$e;->a:Landroid/content/Context;

    .line 1430
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 1435
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$e;->b:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 1441
    if-nez p2, :cond_0

    .line 1442
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$e;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 1443
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$e;->c:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "feedback_spinner_dropview"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 1446
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$e;->c:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "text"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 1447
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$e;->b:[Ljava/lang/String;

    aget-object v0, v0, p1

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1448
    return-object p2
.end method
