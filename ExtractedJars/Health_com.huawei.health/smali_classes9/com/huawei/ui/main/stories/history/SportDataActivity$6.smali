.class Lcom/huawei/ui/main/stories/history/SportDataActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/SportDataActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/history/SportDataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/SportDataActivity;)V
    .locals 0

    .line 243
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 8
    .param p2    # I
        .annotation build Landroid/support/annotation/IdRes;
        .end annotation
    .end param

    .line 246
    invoke-virtual {p1, p2}, Landroid/widget/RadioGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RadioButton;

    .line 247
    invoke-virtual {p1, v4}, Landroid/widget/RadioGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    div-int/lit8 v5, v0, 0x2

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->c(Lcom/huawei/ui/main/stories/history/SportDataActivity;)I

    move-result v0

    if-ne v0, v5, :cond_0

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->a(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 250
    return-void

    .line 252
    :cond_0
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 253
    sget-object v0, Lo/dae;->ib:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v7

    .line 254
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->b(Lcom/huawei/ui/main/stories/history/SportDataActivity;)V

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v0, v5}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->a(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)I

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->e(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)I

    .line 258
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 259
    packed-switch v5, :pswitch_data_0

    goto/16 :goto_0

    .line 261
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_running_statistics:I

    invoke-virtual {v1, v2}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    const/16 v1, 0x102

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->c(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)V

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    const/16 v1, 0x102

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)I

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->a(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 265
    const-string v0, "sportType"

    const/16 v1, 0x102

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    goto/16 :goto_1

    .line 268
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_walking_statistics:I

    invoke-virtual {v1, v2}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    const/16 v1, 0x101

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->c(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)V

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    const/16 v1, 0x101

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)I

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->a(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 272
    const-string v0, "sportType"

    const/16 v1, 0x101

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    goto/16 :goto_1

    .line 275
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_cycling_statistics:I

    invoke-virtual {v1, v2}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    const/16 v1, 0x103

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->c(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)V

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    const/16 v1, 0x103

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)I

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->a(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 279
    const-string v0, "sportType"

    const/16 v1, 0x103

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    goto :goto_1

    .line 282
    :pswitch_3
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "spinner choose  fitness"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_fitness_statistics:I

    invoke-virtual {v1, v2}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    const/16 v1, 0x2711

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->c(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)V

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    const/16 v1, 0x2711

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)I

    .line 286
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->a(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 287
    const-string v0, "sportType"

    const/16 v1, 0x2711

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    goto :goto_1

    .line 290
    :goto_0
    const-string v0, "Track_SportDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unknown type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->a(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 294
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->e(Lcom/huawei/ui/main/stories/history/SportDataActivity;)I

    move-result v2

    invoke-static {v1, v2}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->b(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->c(Lcom/huawei/ui/main/stories/history/SportDataActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 295
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$6;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v7, v6, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 296
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
