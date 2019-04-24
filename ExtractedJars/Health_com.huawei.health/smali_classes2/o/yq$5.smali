.class Lo/yq$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/yq;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/yq;


# direct methods
.method constructor <init>(Lo/yq;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lo/yq$5;->a:Lo/yq;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 9

    .line 155
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 156
    const-string v0, "HwProgressDialog"

    const-string v1, "init handleMessage"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 157
    iget-object v0, p0, Lo/yq$5;->a:Lo/yq;

    invoke-static {v0}, Lo/yq;->c(Lo/yq;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v4

    .line 158
    iget-object v0, p0, Lo/yq$5;->a:Lo/yq;

    invoke-static {v0}, Lo/yq;->c(Lo/yq;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getMax()I

    move-result v5

    .line 159
    iget-object v0, p0, Lo/yq$5;->a:Lo/yq;

    invoke-static {v0}, Lo/yq;->d(Lo/yq;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 160
    const-string v0, "HwProgressDialog"

    const-string v1, "judge mProgressNumberFormat not null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 161
    iget-object v0, p0, Lo/yq$5;->a:Lo/yq;

    invoke-static {v0}, Lo/yq;->d(Lo/yq;)Ljava/lang/String;

    move-result-object v6

    .line 162
    iget-object v0, p0, Lo/yq$5;->a:Lo/yq;

    invoke-static {v0}, Lo/yq;->a(Lo/yq;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v6, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    const-string v0, "HwProgressDialog"

    const-string v1, "exit if"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 164
    goto :goto_0

    .line 165
    :cond_0
    const-string v0, "HwProgressDialog"

    const-string v1, "judge mProgressNumberFormat null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 166
    iget-object v0, p0, Lo/yq$5;->a:Lo/yq;

    invoke-static {v0}, Lo/yq;->a(Lo/yq;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 167
    const-string v0, "HwProgressDialog"

    const-string v1, "judge finish mProgressNumberFormat null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    :goto_0
    iget-object v0, p0, Lo/yq$5;->a:Lo/yq;

    invoke-static {v0}, Lo/yq;->e(Lo/yq;)Ljava/text/NumberFormat;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 170
    const-string v0, "HwProgressDialog"

    const-string v1, "judge mProgressPercentFormat not null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    int-to-double v0, v4

    int-to-double v2, v5

    div-double v6, v0, v2

    .line 172
    new-instance v8, Landroid/text/SpannableString;

    iget-object v0, p0, Lo/yq$5;->a:Lo/yq;

    .line 173
    invoke-static {v0, v6, v7}, Lo/yq;->b(Lo/yq;D)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 174
    new-instance v0, Landroid/text/style/StyleSpan;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {v8}, Landroid/text/SpannableString;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x21

    invoke-virtual {v8, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 176
    iget-object v0, p0, Lo/yq$5;->a:Lo/yq;

    invoke-static {v0}, Lo/yq;->b(Lo/yq;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    const-string v0, "HwProgressDialog"

    const-string v1, "judge finish mProgressPercentFormat not null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 178
    goto :goto_1

    .line 179
    :cond_1
    const-string v0, "HwProgressDialog"

    const-string v1, "judge mProgressPercentFormat null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 180
    iget-object v0, p0, Lo/yq$5;->a:Lo/yq;

    invoke-static {v0}, Lo/yq;->b(Lo/yq;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    const-string v0, "HwProgressDialog"

    const-string v1, "judge finish mProgressPercentFormat null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 183
    :goto_1
    return-void
.end method
