.class public Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "ActiveUserEngagementOverlay.java"


# instance fields
.field private dialogView:Landroid/view/View;

.field private dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private dispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field elementPrimaryNo:I

.field elementPrimaryYes:I

.field elementSecondaryNo:I

.field elementSecondaryYes:I

.field elementSurveyNo:I

.field elementSurveyYes:I

.field primaryQuestion:Ljava/lang/String;

.field private secondaryPositiveActionSKUrl:Ljava/lang/String;

.field secondaryQuestion:Ljava/lang/String;

.field surveyQuestion:Ljava/lang/String;

.field surveyUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    return-void
.end method

.method public static synthetic lambda$createView$142(Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;Landroid/view/View;)V
    .locals 2

    .line 94
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    iget v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->elementPrimaryYes:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 95
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 96
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->onPrimaryPositivePressed()V

    return-void
.end method

.method public static synthetic lambda$createView$143(Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;Landroid/view/View;)V
    .locals 2

    .line 99
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    iget v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->elementPrimaryNo:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x30

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 101
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->onPrimaryNegativePressed()V

    return-void
.end method

.method public static synthetic lambda$onPrimaryNegativePressed$144(Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;Ljava/lang/ref/WeakReference;)V
    .locals 2

    .line 118
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v1, 0x8

    .line 119
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 120
    iget v1, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->elementSurveyYes:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 121
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 122
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->surveyUrl:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->dispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->surveyUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    .line 126
    :cond_0
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method public static synthetic lambda$onPrimaryNegativePressed$145(Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;Ljava/lang/ref/WeakReference;)V
    .locals 2

    .line 130
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v1, 0x30

    .line 131
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 132
    iget v1, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->elementSurveyNo:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 133
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 135
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method public static synthetic lambda$onPrimaryPositivePressed$146(Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;Landroid/content/Context;Ljava/lang/ref/WeakReference;)V
    .locals 2

    .line 155
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v1, 0x8

    .line 156
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 157
    iget v1, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->elementSecondaryYes:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 158
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 159
    invoke-virtual {p0, p1}, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->onSecondaryPositivePressed(Landroid/content/Context;)V

    .line 160
    invoke-static {p2}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method public static synthetic lambda$onPrimaryPositivePressed$147(Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;Ljava/lang/ref/WeakReference;)V
    .locals 2

    .line 164
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v1, 0x30

    .line 165
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 166
    iget v1, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->elementSecondaryNo:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 167
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 168
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method private onPrimaryNegativePressed()V
    .locals 10

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->contextRef:Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/ref/WeakReference;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->contextRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 113
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->surveyQuestion:Ljava/lang/String;

    const v5, 0x7f11016d

    .line 116
    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/shopkick/app/overlays/common/-$$Lambda$ActiveUserEngagementOverlay$4pPGkCFSqZr5Cpj8uzp5snd5IYQ;

    invoke-direct {v6, p0}, Lcom/shopkick/app/overlays/common/-$$Lambda$ActiveUserEngagementOverlay$4pPGkCFSqZr5Cpj8uzp5snd5IYQ;-><init>(Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;)V

    const v7, 0x7f110162

    .line 128
    invoke-virtual {v0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lcom/shopkick/app/overlays/common/-$$Lambda$ActiveUserEngagementOverlay$XKcaWqJe-EXVxczrgALOi0j1tY8;

    invoke-direct {v8, p0}, Lcom/shopkick/app/overlays/common/-$$Lambda$ActiveUserEngagementOverlay$XKcaWqJe-EXVxczrgALOi0j1tY8;-><init>(Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;)V

    const/4 v9, 0x0

    .line 113
    invoke-virtual/range {v1 .. v9}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogConfirmOrDeny(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    .line 140
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->dismiss()V

    return-void
.end method

.method private onPrimaryPositivePressed()V
    .locals 10

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->contextRef:Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/ref/WeakReference;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->contextRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 150
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->secondaryQuestion:Ljava/lang/String;

    const v5, 0x7f11016d

    .line 153
    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/shopkick/app/overlays/common/-$$Lambda$ActiveUserEngagementOverlay$nHxa_vZYJPtJf6Lxg8KgTUPvjQ4;

    invoke-direct {v6, p0, v0}, Lcom/shopkick/app/overlays/common/-$$Lambda$ActiveUserEngagementOverlay$nHxa_vZYJPtJf6Lxg8KgTUPvjQ4;-><init>(Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;Landroid/content/Context;)V

    const v7, 0x7f110163

    .line 162
    invoke-virtual {v0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lcom/shopkick/app/overlays/common/-$$Lambda$ActiveUserEngagementOverlay$_FOUn1eeBf-u3Cm-ltrWSYG6f7U;

    invoke-direct {v8, p0}, Lcom/shopkick/app/overlays/common/-$$Lambda$ActiveUserEngagementOverlay$_FOUn1eeBf-u3Cm-ltrWSYG6f7U;-><init>(Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;)V

    const/4 v9, 0x0

    .line 150
    invoke-virtual/range {v1 .. v9}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogConfirmOrDeny(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    .line 173
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->dismiss()V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 3

    .line 85
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->dialogView:Landroid/view/View;

    .line 86
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->dialogView:Landroid/view/View;

    const v0, 0x7f090534

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->dialogView:Landroid/view/View;

    const v1, 0x7f0904a3

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 88
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->dialogView:Landroid/view/View;

    const v2, 0x7f090206

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 90
    iget-object v2, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->primaryQuestion:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f11016f

    .line 91
    invoke-virtual {p1, v1}, Landroid/widget/Button;->setText(I)V

    const v1, 0x7f110164

    .line 92
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 93
    new-instance v1, Lcom/shopkick/app/overlays/common/-$$Lambda$ActiveUserEngagementOverlay$s11055dO6ksq-64r_TCEqs1FHxU;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/common/-$$Lambda$ActiveUserEngagementOverlay$s11055dO6ksq-64r_TCEqs1FHxU;-><init>(Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;)V

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    new-instance p1, Lcom/shopkick/app/overlays/common/-$$Lambda$ActiveUserEngagementOverlay$Ankre_l9F8GZaaangpE3o1eTq04;

    invoke-direct {p1, p0}, Lcom/shopkick/app/overlays/common/-$$Lambda$ActiveUserEngagementOverlay$Ankre_l9F8GZaaangpE3o1eTq04;-><init>(Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;)V

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->dialogView:Landroid/view/View;

    return-object p1
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c001d

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 199
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->dialogView:Landroid/view/View;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 55
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 56
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p2}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->dispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 57
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p1, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 58
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->setUpPromptElements()V

    return-void
.end method

.method protected onSecondaryPositivePressed(Landroid/content/Context;)V
    .locals 1

    .line 183
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->dispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->secondaryPositiveActionSKUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method

.method protected setUpPromptElements()V
    .locals 1

    const/16 v0, 0x15b

    .line 66
    iput v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->elementPrimaryYes:I

    const/16 v0, 0x15c

    .line 67
    iput v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->elementPrimaryNo:I

    const/16 v0, 0x15f

    .line 68
    iput v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->elementSecondaryYes:I

    const/16 v0, 0x160

    .line 69
    iput v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->elementSecondaryNo:I

    const/16 v0, 0x15d

    .line 70
    iput v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->elementSurveyYes:I

    const/16 v0, 0x15e

    .line 71
    iput v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->elementSurveyNo:I

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->activeUserEngagementPrimerQuestion:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->primaryQuestion:Ljava/lang/String;

    .line 74
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->activeUserEngagementSecondaryQuestion:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->secondaryQuestion:Ljava/lang/String;

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->activeUserEngagementSurveyQuestion:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->surveyQuestion:Ljava/lang/String;

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->activeUserEngagementSurveyUrl:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->surveyUrl:Ljava/lang/String;

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->activeUserEngagementSkUrl:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;->secondaryPositiveActionSKUrl:Ljava/lang/String;

    return-void
.end method
