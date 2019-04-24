.class Lcom/huawei/sim/esim/view/ConformActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sim/esim/view/ConformActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/sim/esim/view/ConformActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/ConformActivity;)V
    .locals 0

    .line 281
    iput-object p1, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 338
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 333
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 4

    .line 288
    const-string v0, "ConformActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CharSequence "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "length "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0xff

    if-le v0, v1, :cond_1

    .line 290
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->f(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 291
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->f(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_conform_code_error:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 292
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->p(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 293
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->p(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-virtual {v1}, Lcom/huawei/sim/esim/view/ConformActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_ext_back_color_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 294
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 295
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->n(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$drawable;->sim_back_arrow_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 298
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->n(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$drawable;->sim_next_arrow_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 300
    :goto_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->a(Lcom/huawei/sim/esim/view/ConformActivity;)Lo/eha;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$drawable;->sim_edit_input_error:I

    invoke-virtual {v0, v1}, Lo/eha;->setBackgroundResource(I)V

    goto/16 :goto_2

    .line 303
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 304
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->p(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 305
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->p(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-virtual {v1}, Lcom/huawei/sim/esim/view/ConformActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_next_back_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 306
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 307
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->n(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$drawable;->sim_back_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 310
    :cond_2
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->n(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$drawable;->sim_next_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 314
    :cond_3
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->p(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 315
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->p(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-virtual {v1}, Lcom/huawei/sim/esim/view/ConformActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_ext_back_color_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 316
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 317
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->n(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$drawable;->sim_back_arrow_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 320
    :cond_4
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->n(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$drawable;->sim_next_arrow_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 323
    :goto_1
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->f(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 324
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$7;->a:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->a(Lcom/huawei/sim/esim/view/ConformActivity;)Lo/eha;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$drawable;->sim_edit_input:I

    invoke-virtual {v0, v1}, Lo/eha;->setBackgroundResource(I)V

    .line 326
    :goto_2
    return-void
.end method
