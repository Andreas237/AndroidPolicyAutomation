.class public Lnet/hockeyapp/android/tasks/ParseFeedbackTask;
.super Landroid/os/AsyncTask;
.source "ParseFeedbackTask.java"

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lnet/hockeyapp/android/objects/FeedbackResponse;",
        ">;"
    }
.end annotation


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field private mContext:Landroid/content/Context;

.field private mFeedbackResponse:Ljava/lang/String;

.field private mHandler:Landroid/os/Handler;

.field private mRequestType:Ljava/lang/String;

.field private mUrlString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 46
    iput-object p1, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->mContext:Landroid/content/Context;

    .line 47
    iput-object p2, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->mFeedbackResponse:Ljava/lang/String;

    .line 48
    iput-object p3, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->mHandler:Landroid/os/Handler;

    .line 49
    iput-object p4, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->mRequestType:Ljava/lang/String;

    const/4 p1, 0x0

    .line 50
    iput-object p1, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->mUrlString:Ljava/lang/String;

    return-void
.end method

.method private checkForNewAnswers(Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lnet/hockeyapp/android/objects/FeedbackMessage;",
            ">;)V"
        }
    .end annotation

    .line 92
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/hockeyapp/android/objects/FeedbackMessage;

    .line 93
    invoke-virtual {p1}, Lnet/hockeyapp/android/objects/FeedbackMessage;->getId()I

    move-result v0

    .line 95
    iget-object v1, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->mContext:Landroid/content/Context;

    const-string v2, "net.hockeyapp.android.feedback"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 97
    iget-object v2, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->mRequestType:Ljava/lang/String;

    const-string v4, "send"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 98
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v1, "idLastMessageSend"

    .line 99
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v1, "idLastMessageProcessed"

    .line 100
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 101
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    .line 102
    :cond_0
    iget-object v2, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->mRequestType:Ljava/lang/String;

    const-string v4, "fetch"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "idLastMessageSend"

    const/4 v4, -0x1

    .line 103
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    const-string v5, "idLastMessageProcessed"

    .line 104
    invoke-interface {v1, v5, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    if-eq v0, v2, :cond_2

    if-eq v0, v4, :cond_2

    .line 108
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "idLastMessageProcessed"

    .line 109
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 110
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 113
    invoke-static {}, Lnet/hockeyapp/android/FeedbackManager;->getLastListener()Lnet/hockeyapp/android/FeedbackManagerListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 115
    invoke-virtual {v0, p1}, Lnet/hockeyapp/android/FeedbackManagerListener;->feedbackAnswered(Lnet/hockeyapp/android/objects/FeedbackMessage;)Z

    move-result v3

    :cond_1
    if-nez v3, :cond_2

    .line 119
    iget-object p1, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->mContext:Landroid/content/Context;

    invoke-direct {p0, p1}, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->startNotification(Landroid/content/Context;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private startNotification(Landroid/content/Context;)V
    .locals 5

    .line 127
    iget-object v0, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->mUrlString:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "notification"

    .line 131
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 132
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "ic_menu_refresh"

    const-string v3, "drawable"

    const-string v4, "android"

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    .line 135
    invoke-static {}, Lnet/hockeyapp/android/FeedbackManager;->getLastListener()Lnet/hockeyapp/android/FeedbackManagerListener;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 136
    invoke-static {}, Lnet/hockeyapp/android/FeedbackManager;->getLastListener()Lnet/hockeyapp/android/FeedbackManagerListener;

    move-result-object v2

    invoke-virtual {v2}, Lnet/hockeyapp/android/FeedbackManagerListener;->getFeedbackActivityClass()Ljava/lang/Class;

    move-result-object v2

    :cond_1
    if-nez v2, :cond_2

    .line 139
    const-class v2, Lnet/hockeyapp/android/FeedbackActivity;

    .line 142
    :cond_2
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    const/high16 v4, 0x30000000

    .line 143
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 144
    invoke-virtual {v3, p1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const-string v2, "url"

    .line 145
    iget-object v4, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->mUrlString:Ljava/lang/String;

    invoke-virtual {v3, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v2, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    .line 147
    invoke-static {p1, v2, v3, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    const-string v3, "HockeyApp Feedback"

    const-string v4, "A new answer to your feedback is available."

    .line 149
    invoke-static {p1, v2, v3, v4, v1}, Lnet/hockeyapp/android/utils/Util;->createNotification(Landroid/content/Context;Landroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;

    move-result-object p1

    if-eqz p1, :cond_3

    const/4 v1, 0x2

    .line 152
    invoke-virtual {v0, v1, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "ParseFeedbackTask#doInBackground"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "ParseFeedbackTask#doInBackground"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :goto_0
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->doInBackground([Ljava/lang/Void;)Lnet/hockeyapp/android/objects/FeedbackResponse;

    move-result-object p1

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->unloadTraceContext(Ljava/lang/Object;)V

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Lnet/hockeyapp/android/objects/FeedbackResponse;
    .locals 2

    .line 59
    iget-object p1, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->mContext:Landroid/content/Context;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->mFeedbackResponse:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 60
    invoke-static {}, Lnet/hockeyapp/android/utils/FeedbackParser;->getInstance()Lnet/hockeyapp/android/utils/FeedbackParser;

    move-result-object p1

    iget-object v0, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->mFeedbackResponse:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lnet/hockeyapp/android/utils/FeedbackParser;->parseFeedbackResponse(Ljava/lang/String;)Lnet/hockeyapp/android/objects/FeedbackResponse;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 63
    invoke-virtual {p1}, Lnet/hockeyapp/android/objects/FeedbackResponse;->getFeedback()Lnet/hockeyapp/android/objects/Feedback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 65
    invoke-virtual {p1}, Lnet/hockeyapp/android/objects/FeedbackResponse;->getFeedback()Lnet/hockeyapp/android/objects/Feedback;

    move-result-object v0

    invoke-virtual {v0}, Lnet/hockeyapp/android/objects/Feedback;->getMessages()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 66
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 67
    invoke-direct {p0, v0}, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->checkForNewAnswers(Ljava/util/ArrayList;)V

    :cond_0
    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "ParseFeedbackTask#onPostExecute"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "ParseFeedbackTask#onPostExecute"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :goto_0
    check-cast p1, Lnet/hockeyapp/android/objects/FeedbackResponse;

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->onPostExecute(Lnet/hockeyapp/android/objects/FeedbackResponse;)V

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method protected onPostExecute(Lnet/hockeyapp/android/objects/FeedbackResponse;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 80
    iget-object v0, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->mHandler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 81
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 82
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "parse_feedback_response"

    .line 84
    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 85
    invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 87
    iget-object p1, p0, Lnet/hockeyapp/android/tasks/ParseFeedbackTask;->mHandler:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method
