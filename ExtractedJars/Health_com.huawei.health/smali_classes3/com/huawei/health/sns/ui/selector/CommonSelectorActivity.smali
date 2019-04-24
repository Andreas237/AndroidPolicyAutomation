.class public abstract Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;
.super Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SearchView$OnCloseListener;
.implements Landroid/widget/SearchView$OnQueryTextListener;


# instance fields
.field protected B:Z

.field private C:Landroid/view/View$OnClickListener;

.field protected D:Z

.field private j:Landroid/view/View$OnClickListener;

.field protected l:Landroid/widget/TextView;

.field protected n:Z

.field protected q:Landroid/view/View;

.field protected r:I

.field protected s:Landroid/widget/TextView;

.field protected t:Landroid/view/View;

.field protected u:Landroid/widget/SearchView;

.field protected v:[J

.field protected w:Lo/bjd;

.field protected x:Z

.field protected y:Lo/bnd;

.field protected z:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 54
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;-><init>()V

    .line 121
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->n:Z

    .line 141
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->r:I

    .line 166
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->v:[J

    .line 181
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->B:Z

    .line 186
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->D:Z

    .line 523
    new-instance v0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity$4;-><init>(Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->C:Landroid/view/View$OnClickListener;

    .line 534
    new-instance v0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity$2;-><init>(Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->j:Landroid/view/View$OnClickListener;

    return-void
.end method

.method protected static d(Landroid/os/Handler;)Lo/brc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Handler;)Lo/brc<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;>;"
        }
    .end annotation

    .line 699
    new-instance v0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity$1;-><init>(Landroid/os/Handler;)V

    return-object v0
.end method

.method private p()V
    .locals 3

    .line 403
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 405
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_friendselector_actionbar_bg_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 406
    invoke-static {}, Lo/bom;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 408
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_friendselector_actionbar_bg_gray:I

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_friendselector_actionbar_bg:I

    invoke-static {v0, v1, v2, p0}, Lo/bom;->c(Landroid/view/View;IILandroid/content/Context;)V

    goto :goto_0

    .line 413
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_friendselector_actionbar_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_0

    .line 418
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->l:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_select_num_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 420
    :goto_0
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 4

    .line 319
    sget v0, Lcom/huawei/android/sns/R$id;->friendselector_searchbar:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->q:Landroid/view/View;

    .line 320
    sget v0, Lcom/huawei/android/sns/R$id;->search_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SearchView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->u:Landroid/widget/SearchView;

    .line 321
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->u:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->onActionViewExpanded()V

    .line 322
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->u:Landroid/widget/SearchView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_local_search:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 323
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->u:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setSubmitButtonEnabled(Z)V

    .line 324
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->u:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconified(Z)V

    .line 325
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->u:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnCloseListener(Landroid/widget/SearchView$OnCloseListener;)V

    .line 326
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->u:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    .line 329
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->u:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->clearFocus()V

    .line 331
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->u:Landroid/widget/SearchView;

    invoke-static {v0}, Lo/bmo;->b(Landroid/widget/SearchView;)V

    .line 333
    const-string v0, "input_method"

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/inputmethod/InputMethodManager;

    .line 334
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->q:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 336
    sget v0, Lcom/huawei/android/sns/R$id;->no_friend_data_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->z:Landroid/widget/LinearLayout;

    .line 337
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->c:Landroid/widget/LinearLayout;

    .line 338
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_icon:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->e:Landroid/widget/ImageView;

    .line 339
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 340
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->c:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->e:Landroid/widget/ImageView;

    const/4 v2, 0x1

    invoke-static {v0, v1, p0, v2}, Lo/bph;->c(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/app/Activity;Z)V

    .line 341
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->z:Landroid/widget/LinearLayout;

    invoke-static {v0, p0}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 342
    return-void
.end method

.method protected a(Landroid/os/Bundle;)V
    .locals 0

    .line 304
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->a(Landroid/os/Bundle;)V

    .line 305
    return-void
.end method

.method abstract a(Lcom/huawei/health/sns/model/user/User;)V
.end method

.method protected b()V
    .locals 0

    .line 552
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->finish()V

    .line 553
    return-void
.end method

.method protected b(Z)V
    .locals 4

    .line 457
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v3

    .line 459
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->C:Landroid/view/View$OnClickListener;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v3, v1, v2, v0}, Lo/bmm;->a(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    .line 460
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->j:Landroid/view/View$OnClickListener;

    const/4 v1, 0x0

    invoke-static {v3, p1, v1, v0}, Lo/bmm;->b(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    .line 463
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->n:Z

    .line 465
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->invalidatePanelMenu(I)V

    .line 466
    return-void
.end method

.method protected b(Landroid/os/Bundle;)Z
    .locals 1

    .line 310
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->b(Landroid/os/Bundle;)Z

    move-result v0

    return v0
.end method

.method protected c()V
    .locals 4

    .line 193
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 194
    if-eqz v2, :cond_6

    .line 196
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 197
    if-nez v3, :cond_0

    .line 199
    return-void

    .line 202
    :cond_0
    const-string v0, "ignore_list"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 204
    const-string v0, "ignore_list"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLongArray(Ljava/lang/String;)[J

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->v:[J

    .line 207
    :cond_1
    const-string v0, "select_mode"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 209
    const-string v0, "select_mode"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->r:I

    .line 212
    :cond_2
    const-string v0, "msgType"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 214
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->a(Landroid/os/Bundle;)V

    .line 218
    :cond_3
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->b(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 220
    const-string v0, "singleChoice"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 222
    const-string v0, "singleChoice"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    goto :goto_0

    :cond_4
    const/4 v0, 0x1

    :goto_0
    iput v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->r:I

    .line 228
    :cond_5
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lo/bpc;->a(Landroid/content/Intent;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->x:Z

    .line 231
    :cond_6
    return-void
.end method

.method protected c(Landroid/os/Handler;Landroid/view/View;I)V
    .locals 8

    .line 242
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/bjd$a;

    .line 243
    if-eqz v4, :cond_6

    .line 246
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->r:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 248
    iget-object v5, v4, Lo/bjd$a;->e:Landroid/widget/CheckBox;

    .line 249
    invoke-virtual {v5}, Landroid/widget/CheckBox;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 251
    invoke-virtual {v5}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v6

    .line 252
    if-nez v6, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v5, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 253
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->w:Lo/bjd;

    invoke-virtual {v0, p3}, Lo/bjd;->b(I)Lcom/huawei/health/sns/model/user/User;

    move-result-object v7

    .line 254
    if-eqz v7, :cond_2

    .line 256
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->w:Lo/bjd;

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    if-nez v6, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v0, v1, v2, v3}, Lo/bjd;->c(JZ)V

    .line 259
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->w:Lo/bjd;

    invoke-virtual {v0}, Lo/bjd;->a()I

    move-result v6

    .line 260
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x111

    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 261
    goto :goto_2

    .line 266
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->w:Lo/bjd;

    invoke-virtual {v0, p3}, Lo/bjd;->e(I)Lcom/huawei/health/sns/model/user/User;

    move-result-object v5

    .line 267
    if-nez v5, :cond_4

    .line 269
    return-void

    .line 280
    :cond_4
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->x:Z

    if-eqz v0, :cond_5

    .line 283
    new-instance v6, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 284
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 287
    const-string v0, "userList"

    invoke-virtual {v7, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 288
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v7}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->setResult(ILandroid/content/Intent;)V

    .line 289
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->finish()V

    .line 290
    goto :goto_2

    .line 293
    :cond_5
    invoke-virtual {p0, v5}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->a(Lcom/huawei/health/sns/model/user/User;)V

    .line 297
    :cond_6
    :goto_2
    return-void
.end method

.method protected c(Z)V
    .locals 2

    .line 663
    if-eqz p1, :cond_0

    .line 665
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->y:Lo/bnd;

    invoke-virtual {v0}, Lo/bnd;->getListView()Landroid/widget/ListView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 666
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 670
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->y:Lo/bnd;

    invoke-virtual {v0}, Lo/bnd;->getListView()Landroid/widget/ListView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 671
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 673
    :goto_0
    return-void
.end method

.method public d()V
    .locals 1

    .line 425
    sget v0, Lcom/huawei/android/sns/R$id;->friendselector_fragment_layout_id:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->d:Landroid/view/View;

    .line 426
    return-void
.end method

.method protected d(J)V
    .locals 0

    .line 734
    invoke-super {p0, p1, p2}, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->d(J)V

    .line 735
    return-void
.end method

.method abstract d(Ljava/lang/String;)V
.end method

.method protected e()V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ResourceAsColor",
            "InflateParams"
        }
    .end annotation

    .line 348
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v3

    .line 349
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    .line 351
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 353
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_friendselector_actionbar_customtitle_for_emuifive:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 355
    sget v0, Lcom/huawei/android/sns/R$id;->sns_friend_selector_bg:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->t:Landroid/view/View;

    goto :goto_0

    .line 359
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_friendselector_actionbar_customtitle:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 363
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$id;->sns_friend_selector_num:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->l:Landroid/widget/TextView;

    .line 364
    sget v0, Lcom/huawei/android/sns/R$id;->sns_friend_selector_text:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->s:Landroid/widget/TextView;

    .line 367
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->B:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->D:Z

    if-eqz v0, :cond_2

    .line 369
    :cond_1
    if-eqz v3, :cond_3

    .line 371
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    goto :goto_1

    .line 376
    :cond_2
    invoke-static {v3, v5}, Lo/bmm;->b(Landroid/app/ActionBar;Landroid/view/View;)V

    .line 379
    :cond_3
    :goto_1
    iget v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->r:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 381
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->b(Z)V

    goto :goto_2

    .line 386
    :cond_4
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->B:Z

    if-nez v0, :cond_5

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->D:Z

    if-nez v0, :cond_5

    .line 388
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->b(Z)V

    .line 392
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$color;->sns_huaweipay_black_a_FF:I

    sget v2, Lcom/huawei/android/sns/R$color;->sns_chat_action_bar_title_for_emuifive:I

    invoke-static {v0, v1, v2, p0}, Lo/bom;->e(Landroid/widget/TextView;IILandroid/content/Context;)V

    .line 394
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->s:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$color;->sns_huaweipay_black_a_FF:I

    sget v2, Lcom/huawei/android/sns/R$color;->sns_chat_action_bar_title_for_emuifive:I

    invoke-static {v0, v1, v2, p0}, Lo/bom;->e(Landroid/widget/TextView;IILandroid/content/Context;)V

    .line 396
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->p()V

    .line 398
    return-void
.end method

.method protected e(Ljava/lang/String;)V
    .locals 2

    .line 435
    const-string v0, "0"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 437
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->l:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 441
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->l:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 442
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 444
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->t:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 446
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->t:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getVisibility()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 448
    :cond_1
    return-void
.end method

.method protected e(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 652
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->c(Z)V

    .line 653
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->w:Lo/bjd;

    invoke-virtual {v0, p1}, Lo/bjd;->a(Ljava/util/List;)V

    .line 654
    return-void
.end method

.method abstract g()Z
.end method

.method protected h()V
    .locals 1

    .line 680
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->y:Lo/bnd;

    invoke-virtual {v0}, Lo/bnd;->c()V

    .line 681
    return-void
.end method

.method protected k()V
    .locals 3

    .line 572
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->w:Lo/bjd;

    invoke-virtual {v0}, Lo/bjd;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 574
    sget v0, Lcom/huawei/android/sns/R$string;->sns_please_select_friend:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 575
    return-void

    .line 577
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 579
    return-void

    .line 601
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->w:Lo/bjd;

    invoke-virtual {v0}, Lo/bjd;->d()Ljava/util/ArrayList;

    move-result-object v1

    .line 602
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 605
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 606
    const-string v0, "userList"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 607
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v2}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->setResult(ILandroid/content/Intent;)V

    .line 610
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->finish()V

    .line 611
    return-void
.end method

.method protected o()V
    .locals 1

    .line 688
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->y:Lo/bnd;

    invoke-virtual {v0}, Lo/bnd;->a()V

    .line 689
    return-void
.end method

.method public onClose()Z
    .locals 1

    .line 616
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->w:Lo/bjd;

    invoke-virtual {v0}, Lo/bjd;->b()V

    .line 617
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->c(Z)V

    .line 618
    const/4 v0, 0x0

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    .line 721
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 723
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->c:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->e:Landroid/widget/ImageView;

    const/4 v2, 0x1

    invoke-static {v0, v1, p0, v2}, Lo/bph;->c(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/app/Activity;Z)V

    .line 724
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->z:Landroid/widget/LinearLayout;

    invoke-static {v0, p0}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 725
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 471
    invoke-static {}, Lo/bom;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 474
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$menu;->sns_action_bar_confirm_menu:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 477
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onDestroy()V
    .locals 0

    .line 740
    invoke-super {p0}, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->onDestroy()V

    .line 741
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 517
    invoke-super {p0, p1, p2}, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 496
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    .line 497
    const v0, 0x102002c

    if-ne v1, v0, :cond_0

    .line 499
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->b()V

    goto :goto_0

    .line 501
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->sns_menu_ab_confirm:I

    if-ne v1, v0, :cond_1

    .line 503
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->k()V

    .line 506
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 484
    sget v0, Lcom/huawei/android/sns/R$id;->sns_menu_ab_confirm:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    .line 485
    if-eqz v1, :cond_0

    .line 487
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->n:Z

    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 490
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 1

    .line 630
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->B:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->D:Z

    if-nez v0, :cond_0

    .line 632
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->h()V

    .line 633
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->onClose()Z

    goto :goto_0

    .line 637
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->o()V

    .line 638
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/selector/CommonSelectorActivity;->d(Ljava/lang/String;)V

    .line 640
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 1

    .line 624
    const/4 v0, 0x0

    return v0
.end method
