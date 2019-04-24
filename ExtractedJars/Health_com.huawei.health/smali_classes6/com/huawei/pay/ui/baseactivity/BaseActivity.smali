.class public Lcom/huawei/pay/ui/baseactivity/BaseActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# static fields
.field private static final DISPLAY_HW_NO_SPLIT_LINE:I = 0x8000

.field private static final EMUI4_DEFAULT_COLOR:I = -0xf0f10

.field public static final HANDLER_PAY_VERIFY_ERROR:I = 0x6

.field public static final HANDLER_PAY_VERIFY_SUCCESS:I = 0x5

.field private static final HANDLER_QUERY_BALANCE_FAIL:I = 0x4

.field private static final HANDLER_QUERY_BALANCE_SUCCESS:I = 0x3

.field private static final HANDLER_WALLET_NEWAUTH_ERROR:I = 0x2

.field private static final HANDLER_WALLET_NEWAUTH_SUCCESS:I = 0x1


# instance fields
.field private hasLeftHomeView:Z

.field protected isReportUseTimeByBI:Z

.field protected mActionBar:Landroid/app/ActionBar;

.field public mContext:Landroid/content/Context;

.field protected parentBodyLinearLayout:Landroid/widget/LinearLayout;

.field protected progressDialog:Lo/yw;

.field private statusBarTransparentFlag:I

.field private titleBar:Lo/emr;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 46
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->isReportUseTimeByBI:Z

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->hasLeftHomeView:Z

    .line 82
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->statusBarTransparentFlag:I

    return-void
.end method

.method private initParentView()V
    .locals 1

    .line 163
    sget v0, Lcom/huawei/paycommonbase/R$layout;->huaweipay_base_main_layout:I

    invoke-super {p0, v0}, Lcom/huawei/ui/commonui/base/BaseActivity;->setContentView(I)V

    .line 164
    sget v0, Lcom/huawei/paycommonbase/R$id;->third_party_title_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->titleBar:Lo/emr;

    .line 165
    sget v0, Lcom/huawei/paycommonbase/R$id;->base_main_body_linearlayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    .line 166
    return-void
.end method

.method private final initVerHorSwitch()V
    .locals 2

    .line 369
    invoke-virtual {p0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/paycommonbase/R$bool;->IsSupportOrientation:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 370
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->setRequestedOrientation(I)V

    goto :goto_0

    .line 372
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->setRequestedOrientation(I)V

    .line 374
    :goto_0
    return-void
.end method


# virtual methods
.method public final changeActionBarUpIcon2White()V
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 351
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 352
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "up"

    const-string v2, "id"

    const-string v3, "android"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 353
    invoke-virtual {p0, v4}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 354
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 355
    invoke-virtual {p0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/paycommonbase/R$drawable;->cp3_actionbar_home_icon_white:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 356
    invoke-virtual {p0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/paycommonbase/R$drawable;->cp3_actionbar_home_icon_white:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 359
    :cond_0
    return-void
.end method

.method public isNeedInitVerHorSwitchByParent()Z
    .locals 1

    .line 389
    const/4 v0, 0x1

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 379
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 381
    return-void
.end method

.method protected onAlertDialogKeyBack(I)V
    .locals 0

    .line 320
    return-void
.end method

.method protected onAlertDialogNegativeClick(I)V
    .locals 0

    .line 311
    return-void
.end method

.method protected onAlertDialogPositiveClick(I)V
    .locals 0

    .line 302
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 116
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->requestWindowFeature(I)Z

    .line 117
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 119
    invoke-static {}, Lo/dte;->c()Lo/dte;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/dte;->a(Landroid/content/Context;)V

    .line 120
    invoke-virtual {p0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->mContext:Landroid/content/Context;

    .line 122
    invoke-direct {p0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->initVerHorSwitch()V

    .line 124
    invoke-direct {p0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->initParentView()V

    .line 125
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 151
    iget-object v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->progressDialog:Lo/yw;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 152
    iget-object v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->progressDialog:Lo/yw;

    invoke-interface {v0}, Lo/yw;->dismiss()V

    .line 154
    :cond_0
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 155
    return-void
.end method

.method protected onError()V
    .locals 0

    .line 330
    return-void
.end method

.method protected onHomeRetrunArrowClick()V
    .locals 0

    .line 236
    invoke-virtual {p0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->finish()V

    .line 237
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 226
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v1, v0, :cond_0

    .line 227
    invoke-virtual {p0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->onHomeRetrunArrowClick()V

    .line 229
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onPause()V
    .locals 2

    .line 140
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 141
    iget-boolean v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->isReportUseTimeByBI:Z

    if-eqz v0, :cond_0

    .line 143
    invoke-static {}, Lcom/huawei/wallet/logic/bi/AppStartHianalytics;->a()V

    goto :goto_0

    .line 145
    :cond_0
    const-string v0, "StartLifeServiceBaseActivity: need not report BI"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->c(Ljava/lang/String;Z)V

    .line 147
    :goto_0
    return-void
.end method

.method protected onPayPassVerifySuccess(Ljava/lang/String;Z)V
    .locals 2

    .line 340
    const-string v0, "pay password verify success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 341
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 129
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 130
    iget-boolean v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->isReportUseTimeByBI:Z

    if-eqz v0, :cond_0

    .line 132
    invoke-static {p0}, Lcom/huawei/wallet/logic/bi/AppStartHianalytics;->d(Landroid/content/Context;)V

    goto :goto_0

    .line 134
    :cond_0
    const-string v0, "StartLifeServiceBaseActivity: need not report BI"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->c(Ljava/lang/String;Z)V

    .line 136
    :goto_0
    return-void
.end method

.method public final setContentView(I)V
    .locals 3

    .line 175
    iget-object v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 176
    iget-object v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 177
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 178
    iget-object v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 179
    iget-object v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 180
    goto :goto_0

    .line 181
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->setContentView(I)V

    .line 183
    :goto_0
    return-void
.end method

.method public final setContentView(Landroid/view/View;)V
    .locals 2

    .line 190
    iget-object v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 191
    iget-object v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 192
    iget-object v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 193
    iget-object v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 195
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->setContentView(Landroid/view/View;)V

    .line 197
    :goto_0
    return-void
.end method

.method public setTitle(I)V
    .locals 1

    .line 216
    invoke-virtual {p0, p1}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->setTitle(Ljava/lang/String;)V

    .line 217
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1

    .line 220
    iget-object v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->titleBar:Lo/emr;

    invoke-virtual {v0, p1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 221
    return-void
.end method

.method public showDialogFragment(Landroid/support/v4/app/DialogFragment;)V
    .locals 1

    .line 291
    const-string v0, "alertdialog"

    invoke-virtual {p0, p1, v0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->showDialogFragment(Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    .line 292
    return-void
.end method

.method public showDialogFragment(Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V
    .locals 5

    .line 267
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 271
    invoke-virtual {p0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 272
    invoke-virtual {v2, p2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    .line 273
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    .line 274
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 275
    invoke-virtual {v4, v3}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 277
    :cond_0
    invoke-virtual {v4, p1, p2}, Landroid/support/v4/app/FragmentTransaction;->add(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 278
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 284
    :cond_1
    goto :goto_0

    .line 281
    :catch_0
    move-exception v2

    .line 282
    const-string v0, "IllegalStateException"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 283
    invoke-virtual {p0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->onError()V

    .line 285
    :goto_0
    return-void
.end method

.method protected final showHead(I)V
    .locals 1

    .line 203
    invoke-virtual {p0, p1}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->showHead(Ljava/lang/CharSequence;)V

    .line 204
    return-void
.end method

.method protected final showHead(Ljava/lang/CharSequence;)V
    .locals 2

    .line 212
    iget-object v0, p0, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->titleBar:Lo/emr;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 213
    return-void
.end method

.method public showToast(I)V
    .locals 0

    .line 246
    invoke-static {p0, p1}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;I)V

    .line 247
    return-void
.end method

.method public showToast(Ljava/lang/String;)V
    .locals 0

    .line 255
    invoke-static {p0, p1}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;Ljava/lang/String;)V

    .line 256
    return-void
.end method
