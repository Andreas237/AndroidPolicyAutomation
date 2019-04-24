.class public Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

.field private c:Landroid/content/Context;

.field private d:[Ljava/lang/String;

.field private e:I


# direct methods
.method public constructor <init>(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;[Ljava/lang/String;Landroid/content/Context;I)V
    .locals 1

    .line 529
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->a:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 530
    if-eqz p2, :cond_0

    .line 531
    invoke-virtual {p2}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->d:[Ljava/lang/String;

    .line 533
    :cond_0
    iput-object p3, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->c:Landroid/content/Context;

    .line 534
    iput p4, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->e:I

    .line 535
    return-void
.end method


# virtual methods
.method public c(ILcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$d;)V
    .locals 2

    .line 537
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->e:I

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    .line 539
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->e:I

    .line 540
    iget-object v0, p2, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$d;->c:Landroid/widget/CheckedTextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    goto :goto_0

    .line 541
    :cond_0
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 543
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->e:I

    .line 544
    iget-object v0, p2, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$d;->c:Landroid/widget/CheckedTextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    goto :goto_0

    .line 546
    :cond_1
    iget-object v0, p2, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$d;->c:Landroid/widget/CheckedTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 548
    :goto_0
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 588
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->e:I

    .line 589
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->notifyDataSetChanged()V

    .line 590
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 553
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->d:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 558
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->d:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 563
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 568
    const/4 v3, 0x0

    .line 569
    if-nez p2, :cond_0

    .line 570
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->custom_list_item_single_choice:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 571
    new-instance v3, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$d;

    invoke-direct {v3}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$d;-><init>()V

    .line 572
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text1:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckedTextView;

    iput-object v0, v3, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$d;->c:Landroid/widget/CheckedTextView;

    .line 573
    sget v0, Lcom/huawei/ui/homehealth/R$id;->divide_line:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v3, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$d;->d:Landroid/widget/ImageView;

    .line 574
    invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 576
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$d;

    .line 578
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->d:[Ljava/lang/String;

    aget-object v0, v0, p1

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->a:Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->e(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_music:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 579
    iget-object v0, v3, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$d;->d:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 582
    :cond_1
    iget-object v0, v3, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$d;->c:Landroid/widget/CheckedTextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->d:[Ljava/lang/String;

    aget-object v1, v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/CheckedTextView;->setText(Ljava/lang/CharSequence;)V

    .line 583
    invoke-virtual {p0, p1, v3}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;->c(ILcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$d;)V

    .line 584
    return-object p2
.end method
