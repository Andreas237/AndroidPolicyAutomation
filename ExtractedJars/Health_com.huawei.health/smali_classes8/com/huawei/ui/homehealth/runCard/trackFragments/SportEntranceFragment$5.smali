.class Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)V
    .locals 0

    .line 883
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    iput p2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 888
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 889
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    goto :goto_0

    .line 891
    :cond_0
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateGpsStatus fragment not add yet"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 892
    return-void

    .line 894
    :goto_0
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->a:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 897
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_gps_close:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 898
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 899
    goto/16 :goto_2

    .line 902
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_gps_searching:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 903
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 904
    goto/16 :goto_2

    .line 907
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_motiontrack_page_gps:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 908
    sget v0, Lcom/huawei/ui/homehealth/R$drawable;->track_ic_health_running_signal1:I

    invoke-virtual {v6, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 909
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 910
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 911
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 912
    goto/16 :goto_2

    .line 915
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_motiontrack_page_gps:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 916
    sget v0, Lcom/huawei/ui/homehealth/R$drawable;->track_ic_health_running_signal2:I

    invoke-virtual {v6, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 917
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 918
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 919
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 920
    goto :goto_2

    .line 923
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_motiontrack_page_gps:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 924
    sget v0, Lcom/huawei/ui/homehealth/R$drawable;->track_ic_health_running_signal3:I

    invoke-virtual {v6, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 925
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 926
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 927
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 928
    goto :goto_2

    .line 930
    :goto_1
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Wrong GPS signal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 932
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
