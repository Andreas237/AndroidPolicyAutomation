.class Lcom/shopkick/app/more/ReportWalkinProblemScreen$2;
.super Ljava/lang/Object;
.source "ReportWalkinProblemScreen.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/more/ReportWalkinProblemScreen;->maybeShowThirdSection()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/more/ReportWalkinProblemScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)V
    .locals 0

    .line 203
    iput-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen$2;->this$0:Lcom/shopkick/app/more/ReportWalkinProblemScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 211
    iget-object p2, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen$2;->this$0:Lcom/shopkick/app/more/ReportWalkinProblemScreen;

    invoke-static {p2}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->access$000(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    if-eqz p2, :cond_0

    .line 212
    iget-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen$2;->this$0:Lcom/shopkick/app/more/ReportWalkinProblemScreen;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->access$002(Lcom/shopkick/app/more/ReportWalkinProblemScreen;Z)Z

    .line 213
    iget-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen$2;->this$0:Lcom/shopkick/app/more/ReportWalkinProblemScreen;

    invoke-static {p1}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->access$100(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)V

    goto :goto_0

    .line 214
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen$2;->this$0:Lcom/shopkick/app/more/ReportWalkinProblemScreen;

    invoke-static {p2}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->access$000(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_1

    .line 216
    iget-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen$2;->this$0:Lcom/shopkick/app/more/ReportWalkinProblemScreen;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->access$002(Lcom/shopkick/app/more/ReportWalkinProblemScreen;Z)Z

    .line 217
    iget-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen$2;->this$0:Lcom/shopkick/app/more/ReportWalkinProblemScreen;

    invoke-static {p1}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->access$210(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)I

    .line 218
    iget-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen$2;->this$0:Lcom/shopkick/app/more/ReportWalkinProblemScreen;

    invoke-static {p1}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->access$300(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)Landroid/widget/ProgressBar;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen$2;->this$0:Lcom/shopkick/app/more/ReportWalkinProblemScreen;

    invoke-static {p2}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->access$200(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 219
    iget-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen$2;->this$0:Lcom/shopkick/app/more/ReportWalkinProblemScreen;

    invoke-static {p1}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->access$500(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)Lcom/shopkick/app/widget/SKTextView;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen$2;->this$0:Lcom/shopkick/app/more/ReportWalkinProblemScreen;

    invoke-static {p3}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->access$200(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "/"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen$2;->this$0:Lcom/shopkick/app/more/ReportWalkinProblemScreen;

    invoke-static {p3}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->access$400(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 220
    iget-object p1, p0, Lcom/shopkick/app/more/ReportWalkinProblemScreen$2;->this$0:Lcom/shopkick/app/more/ReportWalkinProblemScreen;

    invoke-static {p1}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->access$600(Lcom/shopkick/app/more/ReportWalkinProblemScreen;)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090700

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void
.end method
