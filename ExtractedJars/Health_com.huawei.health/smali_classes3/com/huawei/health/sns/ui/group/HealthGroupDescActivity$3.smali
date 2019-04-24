.class Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .line 188
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 189
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    .line 190
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x32

    if-le v0, v1, :cond_0

    .line 191
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x32

    invoke-interface {p1, v1, v0}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 193
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x32

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Lo/eha;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eha;->setCursorVisible(Z)V

    .line 195
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x32

    if-ge v0, v1, :cond_1

    .line 196
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 197
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Lo/eha;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->round_rectangle_bg:I

    invoke-virtual {v0, v1}, Lo/eha;->setBackgroundResource(I)V

    .line 198
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->group_char_number_text_color_4d1a1a1a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 200
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 201
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Lo/eha;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->round_rectangle_bg_warning:I

    invoke-virtual {v0, v1}, Lo/eha;->setBackgroundResource(I)V

    .line 202
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->group_char_number_warnning_text_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 205
    :cond_2
    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    .line 206
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "0/50"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 208
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-static {v0, v3}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;Ljava/lang/String;)V

    .line 209
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 160
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 6

    .line 164
    const/4 v2, 0x1

    .line 165
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 166
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 167
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    .line 168
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 169
    const/4 v5, 0x0

    :goto_0
    array-length v0, v3

    if-ge v5, v0, :cond_2

    .line 170
    aget-char v0, v3, v5

    invoke-static {v0}, Ljava/lang/Character;->isSpaceChar(C)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    if-nez v2, :cond_1

    .line 172
    aget-char v0, v3, v5

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 175
    :cond_0
    const/4 v2, 0x0

    .line 176
    aget-char v0, v3, v5

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 169
    :cond_1
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 179
    :cond_2
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    .line 180
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Lo/eha;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/eha;->setText(Ljava/lang/CharSequence;)V

    .line 181
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;)Lo/eha;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/eha;->setSelection(I)V

    .line 184
    :cond_3
    return-void
.end method
