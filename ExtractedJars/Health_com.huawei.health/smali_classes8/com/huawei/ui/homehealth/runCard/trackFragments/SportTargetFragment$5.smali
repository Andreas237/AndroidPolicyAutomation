.class Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)V
    .locals 0

    .line 370
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 4

    .line 373
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->radio_outdoor_sport_type:I

    if-ne v0, v1, :cond_0

    .line 374
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a:Z

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;Z)V

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;Z)V

    .line 377
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d:Landroid/widget/RadioButton;

    const-string v1, "HwChinese-medium"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;)V

    .line 378
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->c:Landroid/widget/RadioButton;

    const-string v1, "regular"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;)V

    goto :goto_0

    .line 380
    :cond_0
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->radio_indoor_sport_type:I

    if-ne v0, v1, :cond_1

    .line 381
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a:Z

    .line 382
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;Z)V

    .line 383
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;Z)V

    .line 384
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->c:Landroid/widget/RadioButton;

    const-string v1, "HwChinese-medium"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;)V

    .line 385
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d:Landroid/widget/RadioButton;

    const-string v1, "regular"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;)V

    .line 389
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-virtual {v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->b()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;I)I

    .line 390
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->f(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)I

    move-result v2

    invoke-static {v1, v2}, Lo/ets;->e(Landroid/content/Context;I)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;I)I

    .line 391
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->f(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)I

    move-result v2

    invoke-static {v1, v2}, Lo/ets;->a(Landroid/content/Context;I)F

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;F)F

    .line 392
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->k(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 394
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->g(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->i(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)F

    move-result v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;IFZ)V

    .line 396
    :cond_2
    return-void
.end method
