.class Lcom/huawei/feedback/ui/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackEditActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 1316
    iput-object p1, p0, Lcom/huawei/feedback/ui/o;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 2

    .line 1319
    iget-object v0, p0, Lcom/huawei/feedback/ui/o;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "radioButton1"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-ne p2, v0, :cond_0

    .line 1320
    iget-object v0, p0, Lcom/huawei/feedback/ui/o;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const-string v1, "0"

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 1321
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/o;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "radioButton2"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-ne p2, v0, :cond_1

    .line 1322
    iget-object v0, p0, Lcom/huawei/feedback/ui/o;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const-string v1, "1"

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 1323
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/o;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "radioButton3"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-ne p2, v0, :cond_2

    .line 1324
    iget-object v0, p0, Lcom/huawei/feedback/ui/o;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const-string v1, "2"

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 1325
    :cond_2
    iget-object v0, p0, Lcom/huawei/feedback/ui/o;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "radioButton4"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-ne p2, v0, :cond_3

    .line 1326
    iget-object v0, p0, Lcom/huawei/feedback/ui/o;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const-string v1, "3"

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 1328
    :cond_3
    :goto_0
    return-void
.end method
