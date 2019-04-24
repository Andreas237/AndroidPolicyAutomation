.class public Lcom/shopkick/app/application/dialog/DialogsManager;
.super Ljava/lang/Object;
.source "DialogsManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;
    }
.end annotation


# static fields
.field private static final DEFAULT_POSITIVE_TEXT:Ljava/lang/String; = "OK"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private activityMgr:Lcom/shopkick/app/application/AppActivityManager;

.field private activityNameToDialogFrag:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/application/dialog/SKDialogFragment;",
            ">;"
        }
    .end annotation
.end field

.field private resources:Landroid/content/res/Resources;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Landroid/content/res/Resources;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->activityMgr:Lcom/shopkick/app/application/AppActivityManager;

    .line 42
    iput-object p2, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->resources:Landroid/content/res/Resources;

    .line 44
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->activityNameToDialogFrag:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getMessageForResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)Ljava/lang/String;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 247
    invoke-virtual {p1}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x193

    if-ne v0, v2, :cond_0

    return-object v1

    .line 252
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result v0

    const/16 v2, 0x1f4

    if-lt v0, v2, :cond_1

    .line 253
    iget-object p1, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->resources:Landroid/content/res/Resources;

    const v0, 0x7f110152

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 256
    :cond_1
    iget p1, p1, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    if-eqz p1, :cond_3

    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    .line 259
    iget-object p1, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->resources:Landroid/content/res/Resources;

    const v0, 0x7f11014d

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 v0, 0x5

    if-ne p1, v0, :cond_3

    return-object v1

    .line 267
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->resources:Landroid/content/res/Resources;

    const v0, 0x7f110142

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public reset()V
    .locals 4

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->activityNameToDialogFrag:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 54
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 55
    iget-object v2, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->activityNameToDialogFrag:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/application/dialog/SKDialogFragment;

    if-eqz v2, :cond_0

    .line 56
    invoke-virtual {v2}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->isVisible()Z

    move-result v3

    if-nez v3, :cond_0

    .line 57
    invoke-virtual {v2}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->dismiss()V

    .line 58
    iget-object v2, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->activityNameToDialogFrag:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public showCustomAlert(II)Lcom/shopkick/app/application/dialog/SKDialogFragment;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->resources:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->resources:Landroid/content/res/Resources;

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showCustomAlert(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    move-result-object p1

    return-object p1
.end method

.method public showCustomAlert(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;
    .locals 9
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->resources:Landroid/content/res/Resources;

    const v1, 0x7f11014f

    .line 98
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/shopkick/app/application/dialog/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/application/dialog/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v3, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    .line 95
    invoke-virtual/range {v2 .. v8}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    move-result-object p1

    return-object p1
.end method

.method public showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;
    .locals 2
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->activityMgr:Lcom/shopkick/app/application/AppActivityManager;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Lcom/shopkick/app/application/AppActivityManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 142
    :cond_0
    new-instance v0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;

    iget-object v1, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->activityMgr:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;-><init>(Lcom/shopkick/app/activities/BaseActivity;)V

    .line 144
    sget-object v1, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->ACKNOWLEDGE:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setDialogType(Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;)V

    .line 146
    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setDismissOnBgClick(Z)V

    .line 148
    invoke-virtual {v0, p2, p3}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setTitleAndDescText(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    invoke-virtual {v0, p4}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setBtnPositiveText(Ljava/lang/String;)V

    .line 151
    invoke-virtual {v0, p5}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setPositiveOnClick(Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;)V

    .line 153
    invoke-virtual {v0, p6}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setOnDismissListener(Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)V

    .line 155
    invoke-virtual {v0}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->show()V

    .line 157
    invoke-virtual {v0}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->getFrag()Lcom/shopkick/app/application/dialog/SKDialogFragment;

    move-result-object p1

    return-object p1
.end method

.method public showDialogButtonless(Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;
    .locals 2

    .line 116
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->activityMgr:Lcom/shopkick/app/application/AppActivityManager;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Lcom/shopkick/app/application/AppActivityManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 118
    :cond_0
    new-instance v0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;

    iget-object v1, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->activityMgr:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;-><init>(Lcom/shopkick/app/activities/BaseActivity;)V

    .line 120
    sget-object v1, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->BUTTONLESS:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setDialogType(Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;)V

    const/4 v1, 0x1

    .line 122
    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setDismissOnBgClick(Z)V

    .line 124
    invoke-virtual {v0, p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setTitleAndDescText(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    invoke-virtual {v0, p3}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setOnDismissListener(Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)V

    .line 128
    invoke-virtual {v0}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->show()V

    .line 130
    invoke-virtual {v0}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->getFrag()Lcom/shopkick/app/application/dialog/SKDialogFragment;

    move-result-object p1

    return-object p1
.end method

.method public showDialogComplex(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;
    .locals 2
    .param p8    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 203
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->activityMgr:Lcom/shopkick/app/application/AppActivityManager;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Lcom/shopkick/app/application/AppActivityManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 205
    :cond_0
    new-instance v0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;

    iget-object v1, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->activityMgr:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;-><init>(Lcom/shopkick/app/activities/BaseActivity;)V

    .line 207
    sget-object v1, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->COMPLEX:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setDialogType(Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;)V

    .line 209
    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setDismissOnBgClick(Z)V

    .line 211
    invoke-virtual {v0, p2, p3}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setTitleAndDescText(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    invoke-virtual {v0, p4}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setBtnPositiveText(Ljava/lang/String;)V

    .line 214
    invoke-virtual {v0, p5}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setPositiveOnClick(Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;)V

    .line 216
    invoke-virtual {v0, p6}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setBtnNegativeText(Ljava/lang/String;)V

    .line 217
    invoke-virtual {v0, p7}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setNegativeOnClick(Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;)V

    .line 219
    invoke-virtual {v0, p8}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setBtnNeutralText(Ljava/lang/String;)V

    .line 220
    invoke-virtual {v0, p9}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setNeutralOnClick(Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;)V

    .line 222
    invoke-virtual {v0, p10}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setOnDismissListener(Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)V

    .line 224
    invoke-virtual {v0}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->show()V

    .line 226
    invoke-virtual {v0}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->getFrag()Lcom/shopkick/app/application/dialog/SKDialogFragment;

    move-result-object p1

    return-object p1
.end method

.method public showDialogConfirmOrDeny(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;
    .locals 2
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->activityMgr:Lcom/shopkick/app/application/AppActivityManager;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Lcom/shopkick/app/application/AppActivityManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 171
    :cond_0
    new-instance v0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;

    iget-object v1, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->activityMgr:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;-><init>(Lcom/shopkick/app/activities/BaseActivity;)V

    .line 173
    sget-object v1, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->CONFIRM_OR_DENY:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setDialogType(Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;)V

    .line 175
    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setDismissOnBgClick(Z)V

    .line 177
    invoke-virtual {v0, p2, p3}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setTitleAndDescText(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    invoke-virtual {v0, p4}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setBtnPositiveText(Ljava/lang/String;)V

    .line 180
    invoke-virtual {v0, p5}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setPositiveOnClick(Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;)V

    .line 182
    invoke-virtual {v0, p6}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setBtnNegativeText(Ljava/lang/String;)V

    .line 183
    invoke-virtual {v0, p7}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setNegativeOnClick(Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;)V

    .line 185
    invoke-virtual {v0, p8}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->setOnDismissListener(Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)V

    .line 187
    invoke-virtual {v0}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->show()V

    .line 189
    invoke-virtual {v0}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->getFrag()Lcom/shopkick/app/application/dialog/SKDialogFragment;

    move-result-object p1

    return-object p1
.end method

.method public showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;
    .locals 9
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->resources:Landroid/content/res/Resources;

    const v1, 0x7f110155

    .line 84
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->resources:Landroid/content/res/Resources;

    const v1, 0x7f11014f

    .line 86
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/shopkick/app/application/dialog/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/application/dialog/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v3, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v5, p1

    .line 83
    invoke-virtual/range {v2 .. v8}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    move-result-object p1

    return-object p1
.end method

.method public showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 236
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->getMessageForResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 238
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :cond_0
    return-void
.end method

.method public showWebViewErrorAlert()V
    .locals 9

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->resources:Landroid/content/res/Resources;

    const v1, 0x7f110155

    .line 70
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->resources:Landroid/content/res/Resources;

    const v1, 0x7f110142

    .line 71
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager;->resources:Landroid/content/res/Resources;

    const v1, 0x7f11014f

    .line 72
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/shopkick/app/application/dialog/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/application/dialog/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v3, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    .line 69
    invoke-virtual/range {v2 .. v8}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void
.end method
