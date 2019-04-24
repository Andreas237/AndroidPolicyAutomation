.class public Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;
.super Ljava/lang/Object;
.source "LegalDetailsWebViewLauncher.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private baseActivityWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/activities/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field private tosWebViewType:I

.field private userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/activities/BaseActivity;ILcom/shopkick/app/account/UserAccountDataSource;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string/jumbo v0, "userAccountDataSource cannot be null"

    .line 25
    invoke-static {p3, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;->baseActivityWeakReference:Ljava/lang/ref/WeakReference;

    .line 28
    iput p2, p0, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;->tosWebViewType:I

    .line 29
    iput-object p3, p0, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    return-void
.end method

.method private getWebViewTitle()Ljava/lang/String;
    .locals 3

    .line 33
    iget-object v0, p0, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;->baseActivityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 37
    :cond_0
    iget v2, p0, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;->tosWebViewType:I

    packed-switch v2, :pswitch_data_0

    return-object v1

    :pswitch_0
    const v1, 0x7f1101a8

    .line 41
    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    const v1, 0x7f1101b0

    .line 39
    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private getWebViewUrl()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;->baseActivityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 53
    :cond_0
    iget v0, p0, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;->tosWebViewType:I

    invoke-direct {p0, v0}, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;->getWebViewUrlForType(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getWebViewUrlForType(I)Ljava/lang/String;
    .locals 0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    .line 63
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccountDataSource;->getTermsOfServiceURL()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 61
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccountDataSource;->getPrivacyPolicyURL()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 59
    :pswitch_2
    iget-object p1, p0, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccountDataSource;->getCombinedPrivacyPolicyAndTermsOfServiceURL()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 71
    iget-object p1, p0, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;->baseActivityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/activities/BaseActivity;

    if-eqz p1, :cond_1

    .line 73
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v1, "url"

    .line 74
    invoke-direct {p0}, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;->getWebViewUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    invoke-direct {p0}, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;->getWebViewTitle()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "header_title"

    .line 77
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    :cond_0
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lcom/shopkick/app/webview/WebViewScreen;

    invoke-direct {v1, v2, v3, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 82
    invoke-virtual {p1, v1}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    :cond_1
    return-void
.end method
