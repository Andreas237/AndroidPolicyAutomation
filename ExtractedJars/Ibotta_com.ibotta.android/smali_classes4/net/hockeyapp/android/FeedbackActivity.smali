.class public Lnet/hockeyapp/android/FeedbackActivity;
.super Landroid/app/Activity;
.source "FeedbackActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/hockeyapp/android/FeedbackActivity$ParseFeedbackHandler;,
        Lnet/hockeyapp/android/FeedbackActivity$FeedbackHandler;
    }
.end annotation


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field private initialUserEmail:Ljava/lang/String;

.field private initialUserName:Ljava/lang/String;

.field private mAddAttachmentButton:Landroid/widget/Button;

.field private mAddResponseButton:Landroid/widget/Button;

.field private mContext:Landroid/content/Context;

.field private mEmailInput:Landroid/widget/EditText;

.field private mError:Lnet/hockeyapp/android/objects/ErrorObject;

.field private mFeedbackHandler:Landroid/os/Handler;

.field private mFeedbackMessages:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lnet/hockeyapp/android/objects/FeedbackMessage;",
            ">;"
        }
    .end annotation
.end field

.field private mFeedbackScrollview:Landroid/widget/ScrollView;

.field private mFeedbackViewInitialized:Z

.field private mInSendFeedback:Z

.field private mInitialAttachments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field private mLastUpdatedTextView:Landroid/widget/TextView;

.field private mMessagesAdapter:Lnet/hockeyapp/android/adapters/MessagesAdapter;

.field private mMessagesListView:Landroid/widget/ListView;

.field private mNameInput:Landroid/widget/EditText;

.field private mParseFeedbackHandler:Landroid/os/Handler;

.field private mParseFeedbackTask:Lnet/hockeyapp/android/tasks/ParseFeedbackTask;

.field private mRefreshButton:Landroid/widget/Button;

.field private mSendFeedbackButton:Landroid/widget/Button;

.field private mSendFeedbackTask:Lnet/hockeyapp/android/tasks/SendFeedbackTask;

.field private mSubjectInput:Landroid/widget/EditText;

.field private mTextInput:Landroid/widget/EditText;

.field private mToken:Ljava/lang/String;

.field private mUrl:Ljava/lang/String;

.field private mWrapperLayoutFeedbackAndMessages:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 63
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic access$002(Lnet/hockeyapp/android/FeedbackActivity;Lnet/hockeyapp/android/objects/ErrorObject;)Lnet/hockeyapp/android/objects/ErrorObject;
    .locals 0

    .line 63
    iput-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mError:Lnet/hockeyapp/android/objects/ErrorObject;

    return-object p1
.end method

.method static synthetic access$100(Lnet/hockeyapp/android/FeedbackActivity;)Ljava/util/ArrayList;
    .locals 0

    .line 63
    iget-object p0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mFeedbackMessages:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$102(Lnet/hockeyapp/android/FeedbackActivity;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 63
    iput-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mFeedbackMessages:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic access$200(Lnet/hockeyapp/android/FeedbackActivity;)Landroid/widget/TextView;
    .locals 0

    .line 63
    iget-object p0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mLastUpdatedTextView:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic access$300(Lnet/hockeyapp/android/FeedbackActivity;)Lnet/hockeyapp/android/adapters/MessagesAdapter;
    .locals 0

    .line 63
    iget-object p0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mMessagesAdapter:Lnet/hockeyapp/android/adapters/MessagesAdapter;

    return-object p0
.end method

.method static synthetic access$302(Lnet/hockeyapp/android/FeedbackActivity;Lnet/hockeyapp/android/adapters/MessagesAdapter;)Lnet/hockeyapp/android/adapters/MessagesAdapter;
    .locals 0

    .line 63
    iput-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mMessagesAdapter:Lnet/hockeyapp/android/adapters/MessagesAdapter;

    return-object p1
.end method

.method static synthetic access$400(Lnet/hockeyapp/android/FeedbackActivity;)Landroid/content/Context;
    .locals 0

    .line 63
    iget-object p0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$500(Lnet/hockeyapp/android/FeedbackActivity;)Landroid/widget/ListView;
    .locals 0

    .line 63
    iget-object p0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mMessagesListView:Landroid/widget/ListView;

    return-object p0
.end method

.method static synthetic access$600(Lnet/hockeyapp/android/FeedbackActivity;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lnet/hockeyapp/android/FeedbackActivity;->resetFeedbackView()V

    return-void
.end method

.method static synthetic access$700(Lnet/hockeyapp/android/FeedbackActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1, p2}, Lnet/hockeyapp/android/FeedbackActivity;->startParseFeedbackTask(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$800(Lnet/hockeyapp/android/FeedbackActivity;Lnet/hockeyapp/android/objects/FeedbackResponse;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lnet/hockeyapp/android/FeedbackActivity;->loadFeedbackMessages(Lnet/hockeyapp/android/objects/FeedbackResponse;)V

    return-void
.end method

.method static synthetic access$902(Lnet/hockeyapp/android/FeedbackActivity;Z)Z
    .locals 0

    .line 63
    iput-boolean p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mInSendFeedback:Z

    return p1
.end method

.method private addAttachment(I)Z
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    .line 565
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v2, "*/*"

    .line 566
    invoke-virtual {p1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "android.intent.action.GET_CONTENT"

    .line 567
    invoke-virtual {p1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 568
    sget v2, Lnet/hockeyapp/android/R$string;->hockeyapp_feedback_select_file:I

    invoke-virtual {p0, v2}, Lnet/hockeyapp/android/FeedbackActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lnet/hockeyapp/android/FeedbackActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return v1

    :cond_0
    if-ne p1, v1, :cond_1

    .line 572
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v0, "image/*"

    .line 573
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "android.intent.action.GET_CONTENT"

    .line 574
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 575
    sget v0, Lnet/hockeyapp/android/R$string;->hockeyapp_feedback_select_picture:I

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1, v1}, Lnet/hockeyapp/android/FeedbackActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private configureAppropriateView()V
    .locals 11

    .line 583
    invoke-static {}, Lnet/hockeyapp/android/utils/PrefsUtil;->getInstance()Lnet/hockeyapp/android/utils/PrefsUtil;

    move-result-object v0

    invoke-virtual {v0, p0}, Lnet/hockeyapp/android/utils/PrefsUtil;->getFeedbackTokenFromPrefs(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mToken:Ljava/lang/String;

    .line 584
    iget-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mToken:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mInSendFeedback:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 589
    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->configureFeedbackView(Z)V

    .line 590
    iget-object v2, p0, Lnet/hockeyapp/android/FeedbackActivity;->mUrl:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-object v8, p0, Lnet/hockeyapp/android/FeedbackActivity;->mToken:Ljava/lang/String;

    iget-object v9, p0, Lnet/hockeyapp/android/FeedbackActivity;->mFeedbackHandler:Landroid/os/Handler;

    const/4 v10, 0x1

    move-object v1, p0

    invoke-direct/range {v1 .. v10}, Lnet/hockeyapp/android/FeedbackActivity;->sendFetchFeedback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroid/os/Handler;Z)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 586
    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->configureFeedbackView(Z)V

    :goto_1
    return-void
.end method

.method private createParseFeedbackTask(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 600
    new-instance v0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;

    iget-object v1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mParseFeedbackHandler:Landroid/os/Handler;

    invoke-direct {v0, p0, p1, v1, p2}, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;)V

    iput-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mParseFeedbackTask:Lnet/hockeyapp/android/tasks/ParseFeedbackTask;

    return-void
.end method

.method private hideKeyboard()V
    .locals 3

    .line 604
    iget-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mTextInput:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    const-string v0, "input_method"

    .line 605
    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 606
    iget-object v1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mTextInput:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :cond_0
    return-void
.end method

.method private initFeedbackHandler()V
    .locals 1

    .line 614
    new-instance v0, Lnet/hockeyapp/android/FeedbackActivity$FeedbackHandler;

    invoke-direct {v0, p0}, Lnet/hockeyapp/android/FeedbackActivity$FeedbackHandler;-><init>(Lnet/hockeyapp/android/FeedbackActivity;)V

    iput-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mFeedbackHandler:Landroid/os/Handler;

    return-void
.end method

.method private initParseFeedbackHandler()V
    .locals 1

    .line 621
    new-instance v0, Lnet/hockeyapp/android/FeedbackActivity$ParseFeedbackHandler;

    invoke-direct {v0, p0}, Lnet/hockeyapp/android/FeedbackActivity$ParseFeedbackHandler;-><init>(Lnet/hockeyapp/android/FeedbackActivity;)V

    iput-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mParseFeedbackHandler:Landroid/os/Handler;

    return-void
.end method

.method private loadFeedbackMessages(Lnet/hockeyapp/android/objects/FeedbackResponse;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation

    .line 631
    new-instance v0, Lnet/hockeyapp/android/FeedbackActivity$2;

    invoke-direct {v0, p0, p1}, Lnet/hockeyapp/android/FeedbackActivity$2;-><init>(Lnet/hockeyapp/android/FeedbackActivity;Lnet/hockeyapp/android/objects/FeedbackResponse;)V

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private resetFeedbackView()V
    .locals 1

    .line 675
    new-instance v0, Lnet/hockeyapp/android/FeedbackActivity$3;

    invoke-direct {v0, p0}, Lnet/hockeyapp/android/FeedbackActivity$3;-><init>(Lnet/hockeyapp/android/FeedbackActivity;)V

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private sendFeedback()V
    .locals 13

    .line 695
    invoke-static {p0}, Lnet/hockeyapp/android/utils/Util;->isConnectedToNetwork(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 696
    sget v0, Lnet/hockeyapp/android/R$string;->hockeyapp_error_no_network_message:I

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 697
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 701
    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->enableDisableSendFeedbackButton(Z)V

    .line 702
    invoke-direct {p0}, Lnet/hockeyapp/android/FeedbackActivity;->hideKeyboard()V

    .line 704
    invoke-static {}, Lnet/hockeyapp/android/utils/PrefsUtil;->getInstance()Lnet/hockeyapp/android/utils/PrefsUtil;

    move-result-object v1

    iget-object v2, p0, Lnet/hockeyapp/android/FeedbackActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lnet/hockeyapp/android/utils/PrefsUtil;->getFeedbackTokenFromPrefs(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    .line 706
    iget-object v1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mNameInput:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 707
    iget-object v1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mEmailInput:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    .line 708
    iget-object v1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mSubjectInput:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    .line 709
    iget-object v1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mTextInput:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    .line 711
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 712
    iget-object v1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mSubjectInput:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setVisibility(I)V

    .line 713
    iget-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mSubjectInput:Landroid/widget/EditText;

    sget v1, Lnet/hockeyapp/android/R$string;->hockeyapp_feedback_validate_subject_error:I

    invoke-direct {p0, v0, v1}, Lnet/hockeyapp/android/FeedbackActivity;->setError(Landroid/widget/EditText;I)V

    goto/16 :goto_0

    .line 714
    :cond_1
    invoke-static {}, Lnet/hockeyapp/android/FeedbackManager;->getRequireUserName()Lnet/hockeyapp/android/objects/FeedbackUserDataElement;

    move-result-object v0

    sget-object v1, Lnet/hockeyapp/android/objects/FeedbackUserDataElement;->REQUIRED:Lnet/hockeyapp/android/objects/FeedbackUserDataElement;

    if-ne v0, v1, :cond_2

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 715
    iget-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mNameInput:Landroid/widget/EditText;

    sget v1, Lnet/hockeyapp/android/R$string;->hockeyapp_feedback_validate_name_error:I

    invoke-direct {p0, v0, v1}, Lnet/hockeyapp/android/FeedbackActivity;->setError(Landroid/widget/EditText;I)V

    goto :goto_0

    .line 716
    :cond_2
    invoke-static {}, Lnet/hockeyapp/android/FeedbackManager;->getRequireUserEmail()Lnet/hockeyapp/android/objects/FeedbackUserDataElement;

    move-result-object v0

    sget-object v1, Lnet/hockeyapp/android/objects/FeedbackUserDataElement;->REQUIRED:Lnet/hockeyapp/android/objects/FeedbackUserDataElement;

    if-ne v0, v1, :cond_3

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 717
    iget-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mEmailInput:Landroid/widget/EditText;

    sget v1, Lnet/hockeyapp/android/R$string;->hockeyapp_feedback_validate_email_empty:I

    invoke-direct {p0, v0, v1}, Lnet/hockeyapp/android/FeedbackActivity;->setError(Landroid/widget/EditText;I)V

    goto :goto_0

    .line 718
    :cond_3
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 719
    iget-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mTextInput:Landroid/widget/EditText;

    sget v1, Lnet/hockeyapp/android/R$string;->hockeyapp_feedback_validate_text_error:I

    invoke-direct {p0, v0, v1}, Lnet/hockeyapp/android/FeedbackActivity;->setError(Landroid/widget/EditText;I)V

    goto :goto_0

    .line 720
    :cond_4
    invoke-static {}, Lnet/hockeyapp/android/FeedbackManager;->getRequireUserEmail()Lnet/hockeyapp/android/objects/FeedbackUserDataElement;

    move-result-object v0

    sget-object v1, Lnet/hockeyapp/android/objects/FeedbackUserDataElement;->REQUIRED:Lnet/hockeyapp/android/objects/FeedbackUserDataElement;

    if-ne v0, v1, :cond_5

    invoke-static {v6}, Lnet/hockeyapp/android/utils/Util;->isValidEmail(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 721
    iget-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mEmailInput:Landroid/widget/EditText;

    sget v1, Lnet/hockeyapp/android/R$string;->hockeyapp_feedback_validate_email_error:I

    invoke-direct {p0, v0, v1}, Lnet/hockeyapp/android/FeedbackActivity;->setError(Landroid/widget/EditText;I)V

    goto :goto_0

    .line 724
    :cond_5
    invoke-static {}, Lnet/hockeyapp/android/utils/PrefsUtil;->getInstance()Lnet/hockeyapp/android/utils/PrefsUtil;

    move-result-object v0

    iget-object v1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1, v5, v6, v7}, Lnet/hockeyapp/android/utils/PrefsUtil;->saveNameEmailSubjectToPrefs(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 727
    sget v0, Lnet/hockeyapp/android/R$id;->wrapper_attachments:I

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnet/hockeyapp/android/views/AttachmentListView;

    .line 728
    invoke-virtual {v0}, Lnet/hockeyapp/android/views/AttachmentListView;->getAttachments()Ljava/util/ArrayList;

    move-result-object v9

    .line 731
    iget-object v4, p0, Lnet/hockeyapp/android/FeedbackActivity;->mUrl:Ljava/lang/String;

    iget-object v11, p0, Lnet/hockeyapp/android/FeedbackActivity;->mFeedbackHandler:Landroid/os/Handler;

    const/4 v12, 0x0

    move-object v3, p0

    invoke-direct/range {v3 .. v12}, Lnet/hockeyapp/android/FeedbackActivity;->sendFetchFeedback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroid/os/Handler;Z)V

    :goto_0
    return-void
.end method

.method private sendFetchFeedback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroid/os/Handler;Z)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;",
            "Ljava/lang/String;",
            "Landroid/os/Handler;",
            "Z)V"
        }
    .end annotation

    move-object v0, p0

    .line 753
    new-instance v12, Lnet/hockeyapp/android/tasks/SendFeedbackTask;

    iget-object v2, v0, Lnet/hockeyapp/android/FeedbackActivity;->mContext:Landroid/content/Context;

    move-object v1, v12

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move/from16 v11, p9

    invoke-direct/range {v1 .. v11}, Lnet/hockeyapp/android/tasks/SendFeedbackTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroid/os/Handler;Z)V

    iput-object v12, v0, Lnet/hockeyapp/android/FeedbackActivity;->mSendFeedbackTask:Lnet/hockeyapp/android/tasks/SendFeedbackTask;

    .line 754
    iget-object v1, v0, Lnet/hockeyapp/android/FeedbackActivity;->mSendFeedbackTask:Lnet/hockeyapp/android/tasks/SendFeedbackTask;

    invoke-static {v1}, Lnet/hockeyapp/android/utils/AsyncTaskUtils;->execute(Landroid/os/AsyncTask;)V

    return-void
.end method

.method private setError(Landroid/widget/EditText;I)V
    .locals 0

    .line 736
    invoke-virtual {p0, p2}, Lnet/hockeyapp/android/FeedbackActivity;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    .line 737
    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/FeedbackActivity;->enableDisableSendFeedbackButton(Z)V

    return-void
.end method

.method private startParseFeedbackTask(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 763
    invoke-direct {p0, p1, p2}, Lnet/hockeyapp/android/FeedbackActivity;->createParseFeedbackTask(Ljava/lang/String;Ljava/lang/String;)V

    .line 764
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mParseFeedbackTask:Lnet/hockeyapp/android/tasks/ParseFeedbackTask;

    invoke-static {p1}, Lnet/hockeyapp/android/utils/AsyncTaskUtils;->execute(Landroid/os/AsyncTask;)V

    return-void
.end method


# virtual methods
.method protected configureFeedbackView(Z)V
    .locals 6

    .line 458
    sget v0, Lnet/hockeyapp/android/R$id;->wrapper_feedback_scroll:I

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mFeedbackScrollview:Landroid/widget/ScrollView;

    .line 459
    sget v0, Lnet/hockeyapp/android/R$id;->wrapper_messages:I

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mWrapperLayoutFeedbackAndMessages:Landroid/widget/LinearLayout;

    .line 460
    sget v0, Lnet/hockeyapp/android/R$id;->list_feedback_messages:I

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mMessagesListView:Landroid/widget/ListView;

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 464
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mWrapperLayoutFeedbackAndMessages:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 465
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mFeedbackScrollview:Landroid/widget/ScrollView;

    invoke-virtual {p1, v0}, Landroid/widget/ScrollView;->setVisibility(I)V

    .line 467
    sget p1, Lnet/hockeyapp/android/R$id;->label_last_updated:I

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mLastUpdatedTextView:Landroid/widget/TextView;

    .line 469
    sget p1, Lnet/hockeyapp/android/R$id;->button_add_response:I

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mAddResponseButton:Landroid/widget/Button;

    .line 470
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mAddResponseButton:Landroid/widget/Button;

    instance-of v0, p1, Landroid/view/View;

    if-nez v0, :cond_0

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 472
    :goto_0
    sget p1, Lnet/hockeyapp/android/R$id;->button_refresh:I

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mRefreshButton:Landroid/widget/Button;

    .line 473
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mRefreshButton:Landroid/widget/Button;

    instance-of v0, p1, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_5

    :cond_1
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    goto/16 :goto_5

    .line 476
    :cond_2
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mWrapperLayoutFeedbackAndMessages:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 477
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mFeedbackScrollview:Landroid/widget/ScrollView;

    invoke-virtual {p1, v1}, Landroid/widget/ScrollView;->setVisibility(I)V

    .line 479
    sget p1, Lnet/hockeyapp/android/R$id;->input_name:I

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mNameInput:Landroid/widget/EditText;

    .line 480
    sget p1, Lnet/hockeyapp/android/R$id;->input_email:I

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mEmailInput:Landroid/widget/EditText;

    .line 481
    sget p1, Lnet/hockeyapp/android/R$id;->input_subject:I

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mSubjectInput:Landroid/widget/EditText;

    .line 482
    sget p1, Lnet/hockeyapp/android/R$id;->input_message:I

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mTextInput:Landroid/widget/EditText;

    .line 485
    iget-boolean p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mFeedbackViewInitialized:Z

    const/4 v2, 0x1

    if-nez p1, :cond_8

    .line 486
    invoke-static {}, Lnet/hockeyapp/android/utils/PrefsUtil;->getInstance()Lnet/hockeyapp/android/utils/PrefsUtil;

    move-result-object p1

    iget-object v3, p0, Lnet/hockeyapp/android/FeedbackActivity;->mContext:Landroid/content/Context;

    invoke-virtual {p1, v3}, Lnet/hockeyapp/android/utils/PrefsUtil;->getNameEmailFromPrefs(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    const-string v3, "\\|"

    .line 489
    invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 490
    array-length v3, p1

    const/4 v4, 0x2

    if-lt v3, v4, :cond_7

    .line 491
    iget-object v3, p0, Lnet/hockeyapp/android/FeedbackActivity;->mNameInput:Landroid/widget/EditText;

    aget-object v5, p1, v1

    invoke-virtual {v3, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 492
    iget-object v3, p0, Lnet/hockeyapp/android/FeedbackActivity;->mEmailInput:Landroid/widget/EditText;

    aget-object v5, p1, v2

    invoke-virtual {v3, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 494
    array-length v3, p1

    const/4 v5, 0x3

    if-lt v3, v5, :cond_3

    .line 495
    iget-object v3, p0, Lnet/hockeyapp/android/FeedbackActivity;->mSubjectInput:Landroid/widget/EditText;

    aget-object p1, p1, v4

    invoke-virtual {v3, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 496
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mTextInput:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    goto :goto_1

    .line 498
    :cond_3
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mSubjectInput:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    goto :goto_1

    .line 503
    :cond_4
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mNameInput:Landroid/widget/EditText;

    iget-object v3, p0, Lnet/hockeyapp/android/FeedbackActivity;->initialUserName:Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 504
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mEmailInput:Landroid/widget/EditText;

    iget-object v3, p0, Lnet/hockeyapp/android/FeedbackActivity;->initialUserEmail:Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 505
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mSubjectInput:Landroid/widget/EditText;

    const-string v3, ""

    invoke-virtual {p1, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 506
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->initialUserName:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 507
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mNameInput:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    goto :goto_1

    .line 508
    :cond_5
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->initialUserEmail:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 509
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mEmailInput:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    goto :goto_1

    .line 511
    :cond_6
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mSubjectInput:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    .line 515
    :cond_7
    :goto_1
    iput-boolean v2, p0, Lnet/hockeyapp/android/FeedbackActivity;->mFeedbackViewInitialized:Z

    .line 519
    :cond_8
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mTextInput:Landroid/widget/EditText;

    const-string v3, ""

    invoke-virtual {p1, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 522
    invoke-static {}, Lnet/hockeyapp/android/utils/PrefsUtil;->getInstance()Lnet/hockeyapp/android/utils/PrefsUtil;

    move-result-object p1

    iget-object v3, p0, Lnet/hockeyapp/android/FeedbackActivity;->mContext:Landroid/content/Context;

    invoke-virtual {p1, v3}, Lnet/hockeyapp/android/utils/PrefsUtil;->getFeedbackTokenFromPrefs(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 524
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mSubjectInput:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setVisibility(I)V

    goto :goto_2

    .line 527
    :cond_9
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mSubjectInput:Landroid/widget/EditText;

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setVisibility(I)V

    .line 531
    :goto_2
    sget p1, Lnet/hockeyapp/android/R$id;->wrapper_attachments:I

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    .line 532
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 534
    iget-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mInitialAttachments:Ljava/util/List;

    if-eqz v0, :cond_a

    .line 535
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/Uri;

    .line 536
    new-instance v3, Lnet/hockeyapp/android/views/AttachmentView;

    invoke-direct {v3, p0, p1, v1, v2}, Lnet/hockeyapp/android/views/AttachmentView;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/net/Uri;Z)V

    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_3

    .line 541
    :cond_a
    sget p1, Lnet/hockeyapp/android/R$id;->button_attachment:I

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mAddAttachmentButton:Landroid/widget/Button;

    .line 542
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mAddAttachmentButton:Landroid/widget/Button;

    instance-of v0, p1, Landroid/view/View;

    if-nez v0, :cond_b

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    :cond_b
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 543
    :goto_4
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mAddAttachmentButton:Landroid/widget/Button;

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/FeedbackActivity;->registerForContextMenu(Landroid/view/View;)V

    .line 545
    sget p1, Lnet/hockeyapp/android/R$id;->button_send:I

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mSendFeedbackButton:Landroid/widget/Button;

    .line 546
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mSendFeedbackButton:Landroid/widget/Button;

    instance-of v0, p1, Landroid/view/View;

    if-nez v0, :cond_c

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_5

    :cond_c
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_5
    return-void
.end method

.method public enableDisableSendFeedbackButton(Z)V
    .locals 1

    .line 446
    iget-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mSendFeedbackButton:Landroid/widget/Button;

    if-eqz v0, :cond_0

    .line 447
    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    :cond_0
    return-void
.end method

.method public getLayoutView()Landroid/view/View;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 437
    invoke-virtual {p0}, Lnet/hockeyapp/android/FeedbackActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lnet/hockeyapp/android/R$layout;->hockeyapp_activity_feedback:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x2

    const/4 v0, 0x1

    if-ne p1, p2, :cond_1

    .line 400
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 403
    sget p2, Lnet/hockeyapp/android/R$id;->wrapper_attachments:I

    invoke-virtual {p0, p2}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup;

    .line 404
    new-instance p3, Lnet/hockeyapp/android/views/AttachmentView;

    invoke-direct {p3, p0, p2, p1, v0}, Lnet/hockeyapp/android/views/AttachmentView;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/net/Uri;Z)V

    invoke-virtual {p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    const/4 p2, 0x3

    if-ne p1, v0, :cond_2

    .line 409
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 414
    :try_start_0
    new-instance p3, Landroid/content/Intent;

    const-class v0, Lnet/hockeyapp/android/PaintActivity;

    invoke-direct {p3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "imageUri"

    .line 415
    invoke-virtual {p3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 416
    invoke-virtual {p0, p3, p2}, Lnet/hockeyapp/android/FeedbackActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "HockeyApp"

    const-string p3, "Paint activity not declared!"

    .line 418
    invoke-static {p2, p3, p1}, Lnet/hockeyapp/android/utils/HockeyLog;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    if-ne p1, p2, :cond_4

    const-string p1, "imageUri"

    .line 425
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    if-eqz p1, :cond_3

    .line 428
    sget p2, Lnet/hockeyapp/android/R$id;->wrapper_attachments:I

    invoke-virtual {p0, p2}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup;

    .line 429
    new-instance p3, Lnet/hockeyapp/android/views/AttachmentView;

    invoke-direct {p3, p0, p2, p1, v0}, Lnet/hockeyapp/android/views/AttachmentView;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/net/Uri;Z)V

    invoke-virtual {p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_3
    :goto_0
    return-void

    :cond_4
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 11

    .line 304
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 306
    sget v1, Lnet/hockeyapp/android/R$id;->button_send:I

    if-ne v0, v1, :cond_0

    .line 307
    invoke-direct {p0}, Lnet/hockeyapp/android/FeedbackActivity;->sendFeedback()V

    goto :goto_0

    .line 308
    :cond_0
    sget v1, Lnet/hockeyapp/android/R$id;->button_attachment:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2

    .line 309
    sget v0, Lnet/hockeyapp/android/R$id;->wrapper_attachments:I

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 310
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_1

    .line 312
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 314
    :cond_1
    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/FeedbackActivity;->openContextMenu(Landroid/view/View;)V

    goto :goto_0

    .line 316
    :cond_2
    sget p1, Lnet/hockeyapp/android/R$id;->button_add_response:I

    if-ne v0, p1, :cond_3

    .line 317
    invoke-virtual {p0, v2}, Lnet/hockeyapp/android/FeedbackActivity;->configureFeedbackView(Z)V

    const/4 p1, 0x1

    .line 318
    iput-boolean p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mInSendFeedback:Z

    goto :goto_0

    .line 319
    :cond_3
    sget p1, Lnet/hockeyapp/android/R$id;->button_refresh:I

    if-ne v0, p1, :cond_4

    .line 320
    iget-object v2, p0, Lnet/hockeyapp/android/FeedbackActivity;->mUrl:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {}, Lnet/hockeyapp/android/utils/PrefsUtil;->getInstance()Lnet/hockeyapp/android/utils/PrefsUtil;

    move-result-object p1

    iget-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mContext:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lnet/hockeyapp/android/utils/PrefsUtil;->getFeedbackTokenFromPrefs(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lnet/hockeyapp/android/FeedbackActivity;->mFeedbackHandler:Landroid/os/Handler;

    const/4 v10, 0x1

    move-object v1, p0

    invoke-direct/range {v1 .. v10}, Lnet/hockeyapp/android/FeedbackActivity;->sendFetchFeedback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroid/os/Handler;Z)V

    :cond_4
    :goto_0
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 340
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 346
    invoke-super {p0, p1}, Landroid/app/Activity;->onContextItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 343
    :pswitch_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    invoke-direct {p0, p1}, Lnet/hockeyapp/android/FeedbackActivity;->addAttachment(I)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    const-string v0, "FeedbackActivity"

    invoke-static {v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->startTracing(Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lnet/hockeyapp/android/FeedbackActivity;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "FeedbackActivity#onCreate"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "FeedbackActivity#onCreate"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    :goto_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 188
    invoke-virtual {p0}, Lnet/hockeyapp/android/FeedbackActivity;->getLayoutView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->setContentView(Landroid/view/View;)V

    .line 190
    sget v0, Lnet/hockeyapp/android/R$string;->hockeyapp_feedback_title:I

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 191
    iput-object p0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mContext:Landroid/content/Context;

    .line 193
    invoke-virtual {p0}, Lnet/hockeyapp/android/FeedbackActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "url"

    .line 195
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnet/hockeyapp/android/FeedbackActivity;->mUrl:Ljava/lang/String;

    const-string v2, "initialUserName"

    .line 196
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnet/hockeyapp/android/FeedbackActivity;->initialUserName:Ljava/lang/String;

    const-string v2, "initialUserEmail"

    .line 197
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lnet/hockeyapp/android/FeedbackActivity;->initialUserEmail:Ljava/lang/String;

    const-string v2, "initialAttachments"

    .line 199
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 201
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lnet/hockeyapp/android/FeedbackActivity;->mInitialAttachments:Ljava/util/List;

    .line 202
    array-length v2, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    .line 203
    iget-object v5, p0, Lnet/hockeyapp/android/FeedbackActivity;->mInitialAttachments:Ljava/util/List;

    check-cast v4, Landroid/net/Uri;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    const-string v0, "feedbackViewInitialized"

    .line 209
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mFeedbackViewInitialized:Z

    const-string v0, "inSendFeedback"

    .line 210
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mInSendFeedback:Z

    goto :goto_2

    .line 212
    :cond_1
    iput-boolean v1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mInSendFeedback:Z

    .line 213
    iput-boolean v1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mFeedbackViewInitialized:Z

    :goto_2
    const-string p1, "notification"

    .line 217
    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/FeedbackActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    const/4 v0, 0x2

    .line 218
    invoke-virtual {p1, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 220
    invoke-direct {p0}, Lnet/hockeyapp/android/FeedbackActivity;->initFeedbackHandler()V

    .line 221
    invoke-direct {p0}, Lnet/hockeyapp/android/FeedbackActivity;->initParseFeedbackHandler()V

    .line 222
    invoke-direct {p0}, Lnet/hockeyapp/android/FeedbackActivity;->configureAppropriateView()V

    .line 223
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .line 329
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 331
    sget p2, Lnet/hockeyapp/android/R$string;->hockeyapp_feedback_attach_file:I

    invoke-virtual {p0, p2}, Lnet/hockeyapp/android/FeedbackActivity;->getString(I)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    const/4 v0, 0x2

    invoke-interface {p1, p3, v0, p3, p2}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 332
    sget p2, Lnet/hockeyapp/android/R$string;->hockeyapp_feedback_attach_picture:I

    invoke-virtual {p0, p2}, Lnet/hockeyapp/android/FeedbackActivity;->getString(I)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    invoke-interface {p1, p3, v0, p3, p2}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    return-void
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 2

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 354
    :cond_0
    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-direct {p1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v0, Lnet/hockeyapp/android/R$string;->hockeyapp_dialog_error_message:I

    .line 355
    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const/4 v0, 0x0

    .line 356
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    sget v0, Lnet/hockeyapp/android/R$string;->hockeyapp_dialog_error_title:I

    .line 357
    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const v0, 0x1080027

    .line 358
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    sget v0, Lnet/hockeyapp/android/R$string;->hockeyapp_dialog_positive_button:I

    .line 359
    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lnet/hockeyapp/android/FeedbackActivity$1;

    invoke-direct {v1, p0}, Lnet/hockeyapp/android/FeedbackActivity$1;-><init>(Lnet/hockeyapp/android/FeedbackActivity;)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    .line 364
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 285
    iget-boolean p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mInSendFeedback:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 286
    iput-boolean p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mInSendFeedback:Z

    .line 287
    invoke-direct {p0}, Lnet/hockeyapp/android/FeedbackActivity;->configureAppropriateView()V

    goto :goto_0

    .line 289
    :cond_0
    invoke-virtual {p0}, Lnet/hockeyapp/android/FeedbackActivity;->finish()V

    :goto_0
    const/4 p1, 0x1

    return p1

    .line 295
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method protected onPrepareDialog(ILandroid/app/Dialog;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    .line 374
    :cond_0
    check-cast p2, Landroid/app/AlertDialog;

    .line 375
    iget-object p1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mError:Lnet/hockeyapp/android/objects/ErrorObject;

    if-eqz p1, :cond_1

    .line 377
    invoke-virtual {p1}, Lnet/hockeyapp/android/objects/ErrorObject;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 380
    :cond_1
    sget p1, Lnet/hockeyapp/android/R$string;->hockeyapp_feedback_generic_error:I

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/FeedbackActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 5

    if-eqz p1, :cond_1

    .line 231
    sget v0, Lnet/hockeyapp/android/R$id;->wrapper_attachments:I

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const-string v1, "attachments"

    .line 232
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 233
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/Uri;

    .line 234
    new-instance v3, Lnet/hockeyapp/android/views/AttachmentView;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v0, v2, v4}, Lnet/hockeyapp/android/views/AttachmentView;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/net/Uri;Z)V

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    const-string v0, "feedbackViewInitialized"

    .line 237
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mFeedbackViewInitialized:Z

    .line 240
    :cond_1
    invoke-super {p0, p1}, Landroid/app/Activity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 1

    .line 275
    iget-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mSendFeedbackTask:Lnet/hockeyapp/android/tasks/SendFeedbackTask;

    if-eqz v0, :cond_0

    .line 276
    invoke-virtual {v0}, Lnet/hockeyapp/android/tasks/SendFeedbackTask;->detach()V

    .line 279
    :cond_0
    iget-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mSendFeedbackTask:Lnet/hockeyapp/android/tasks/SendFeedbackTask;

    return-object v0
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 248
    sget v0, Lnet/hockeyapp/android/R$id;->wrapper_attachments:I

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/FeedbackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lnet/hockeyapp/android/views/AttachmentListView;

    const-string v1, "attachments"

    .line 250
    invoke-virtual {v0}, Lnet/hockeyapp/android/views/AttachmentListView;->getAttachments()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v0, "feedbackViewInitialized"

    .line 251
    iget-boolean v1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mFeedbackViewInitialized:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "inSendFeedback"

    .line 252
    iget-boolean v1, p0, Lnet/hockeyapp/android/FeedbackActivity;->mInSendFeedback:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 254
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onSendFeedbackResult(Z)V
    .locals 0

    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->activityStarted()V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->activityStopped()V

    .line 259
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 261
    iget-object v0, p0, Lnet/hockeyapp/android/FeedbackActivity;->mSendFeedbackTask:Lnet/hockeyapp/android/tasks/SendFeedbackTask;

    if-eqz v0, :cond_0

    .line 262
    invoke-virtual {v0}, Lnet/hockeyapp/android/tasks/SendFeedbackTask;->detach()V

    :cond_0
    return-void
.end method
