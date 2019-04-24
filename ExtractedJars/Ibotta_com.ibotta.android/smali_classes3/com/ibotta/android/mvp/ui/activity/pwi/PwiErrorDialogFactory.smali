.class public Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;
.super Ljava/lang/Object;
.source "PwiErrorDialogFactory.java"


# static fields
.field private static final MAX_ERROR_RETRY_COUNT:I = 0x1


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private codeRetryCountMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/StripeErrorCode;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->codeRetryCountMap:Ljava/util/Map;

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method private generateGenericErrorViewState()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;
    .locals 5

    .line 99
    new-instance v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;-><init>()V

    const v1, 0x7f08029a

    .line 100
    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->imageId(I)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    const v4, 0x7f110506

    .line 101
    invoke-interface {v1, v4, v3}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->title(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-array v3, v2, [Ljava/lang/Object;

    const v4, 0x7f110505

    .line 102
    invoke-interface {v1, v4, v3}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->body(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-array v2, v2, [Ljava/lang/Object;

    const v3, 0x7f110146

    .line 103
    invoke-interface {v1, v3, v2}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->primaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 104
    invoke-virtual {v0}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->build()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public generateDialogViewStateFromError(Lcom/ibotta/api/model/pwi/PwiError;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState;
    .locals 5
    .param p1    # Lcom/ibotta/api/model/pwi/PwiError;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 32
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->generateGenericErrorViewState()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object p1

    return-object p1

    .line 35
    :cond_0
    new-instance v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;-><init>()V

    const v1, 0x7f08029a

    .line 36
    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->imageId(I)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 37
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiError;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->title(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiError;->getBody()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->body(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 40
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$pwi$PwiErrorDialogAction:[I

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiError;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/StripeErrorCode;->lookupByName(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/pwi/StripeErrorCode;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/StripeErrorCode;->getAction()Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const v1, 0x7f110389

    const v2, 0x7f1104fd

    const/4 v3, 0x0

    packed-switch p1, :pswitch_data_0

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->generateGenericErrorViewState()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object p1

    return-object p1

    .line 66
    :pswitch_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v1, 0x7f1104e2

    new-array v4, v3, [Ljava/lang/Object;

    .line 67
    invoke-interface {p1, v1, v4}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->primaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-array v1, v3, [Ljava/lang/Object;

    .line 68
    invoke-interface {v0, v2, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->secondaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    .line 69
    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->build()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object p1

    return-object p1

    .line 60
    :pswitch_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-array v4, v3, [Ljava/lang/Object;

    .line 61
    invoke-interface {p1, v1, v4}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->primaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-array v1, v3, [Ljava/lang/Object;

    .line 62
    invoke-interface {v0, v2, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->secondaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    .line 63
    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->build()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object p1

    return-object p1

    .line 55
    :pswitch_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v1, 0x7f1104fe

    new-array v2, v3, [Ljava/lang/Object;

    .line 56
    invoke-interface {p1, v1, v2}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->primaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    .line 57
    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->build()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object p1

    return-object p1

    .line 49
    :pswitch_3
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-array v4, v3, [Ljava/lang/Object;

    .line 50
    invoke-interface {p1, v1, v4}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->primaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-array v1, v3, [Ljava/lang/Object;

    .line 51
    invoke-interface {v0, v2, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->secondaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    .line 52
    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->build()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object p1

    return-object p1

    .line 43
    :pswitch_4
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v1, 0x7f110501

    new-array v4, v3, [Ljava/lang/Object;

    .line 44
    invoke-interface {p1, v1, v4}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->primaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-array v1, v3, [Ljava/lang/Object;

    .line 45
    invoke-interface {v0, v2, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->secondaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->build()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public shouldRetryTransaction(Lcom/ibotta/api/model/pwi/PwiError;)Z
    .locals 3
    .param p1    # Lcom/ibotta/api/model/pwi/PwiError;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 81
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiError;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/StripeErrorCode;->lookupByName(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/pwi/StripeErrorCode;

    move-result-object p1

    .line 83
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/StripeErrorCode;->isRetryable()Z

    move-result v1

    if-nez v1, :cond_1

    return v0

    .line 87
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->codeRetryCountMap:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->codeRetryCountMap:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x1

    if-lt v1, v2, :cond_3

    .line 90
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->codeRetryCountMap:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    return v0

    .line 93
    :cond_3
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;->codeRetryCountMap:Ljava/util/Map;

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v2
.end method
