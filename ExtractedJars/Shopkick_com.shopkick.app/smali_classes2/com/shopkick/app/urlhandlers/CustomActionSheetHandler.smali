.class public Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "CustomActionSheetHandler.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/content/DialogInterface$OnDismissListener;
.implements Lcom/shopkick/app/url/IURLDispatcherFinishedCallback;


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "custom_action_sheet"

.field private static final PARAM_CANCEL_TEXT:Ljava/lang/String; = "cancel_text"

.field private static final PARAM_OPTION_PREFIX:Ljava/lang/String; = "option"

.field private static final PARAM_SKLINK_PREFIX:Ljava/lang/String; = "sklink"

.field private static final PARAM_TITLE:Ljava/lang/String; = "title"


# instance fields
.field private alertDialog:Landroid/app/AlertDialog;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private buttonIdxClicked:I

.field private dispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private dispatcherFactoryWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/url/URLDispatcherFactory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/url/URLDispatcherFactory;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    const/4 v0, -0x1

    .line 32
    iput v0, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->buttonIdxClicked:I

    .line 35
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 36
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->dispatcherFactoryWeakReference:Ljava/lang/ref/WeakReference;

    const/4 p1, 0x1

    .line 37
    iput-boolean p1, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->isAsync:Z

    return-void
.end method

.method private optionForIndex(I)Ljava/lang/String;
    .locals 2

    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "option"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->params:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method private sklinkForIndex(I)Ljava/lang/String;
    .locals 2

    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "sklink"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->params:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .line 47
    invoke-super {p0}, Lcom/shopkick/app/url/URLHandler;->cancel()V

    .line 48
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->alertDialog:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    .line 49
    iput v1, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->buttonIdxClicked:I

    .line 50
    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method public clone()Lcom/shopkick/app/url/URLHandler;
    .locals 3

    .line 42
    new-instance v0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->dispatcherFactoryWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/url/URLDispatcherFactory;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 18
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->clone()Lcom/shopkick/app/url/URLHandler;

    move-result-object v0

    return-object v0
.end method

.method public dispatcherDidFinish()V
    .locals 0

    .line 136
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->finish()V

    return-void
.end method

.method public execute()V
    .locals 5

    .line 56
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 58
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->finish()V

    return-void

    .line 62
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->params:Ljava/util/Map;

    const-string/jumbo v2, "title"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_1

    const-string v1, ""

    .line 67
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    .line 70
    :goto_0
    invoke-direct {p0, v3}, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->optionForIndex(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 71
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 75
    :cond_2
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-direct {v3, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 76
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_5

    .line 77
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    .line 78
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 79
    invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 81
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->params:Ljava/util/Map;

    const-string v2, "cancel_text"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 82
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_3

    .line 83
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 86
    :cond_3
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->alertDialog:Landroid/app/AlertDialog;

    if-eqz v1, :cond_4

    .line 87
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 89
    :cond_4
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->alertDialog:Landroid/app/AlertDialog;

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->alertDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0, p0}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->alertDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto :goto_1

    .line 93
    :cond_5
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->finish()V

    :goto_1
    return-void
.end method

.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->alertDialog:Landroid/app/AlertDialog;

    if-ne p1, v0, :cond_0

    .line 110
    iput p2, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->buttonIdxClicked:I

    .line 111
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    :cond_0
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->alertDialog:Landroid/app/AlertDialog;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    .line 118
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 119
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->alertDialog:Landroid/app/AlertDialog;

    .line 121
    iget p1, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->buttonIdxClicked:I

    invoke-direct {p0, p1}, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->sklinkForIndex(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 123
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->dispatcherFactoryWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/url/URLDispatcherFactory;

    if-eqz v0, :cond_1

    .line 125
    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->dispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->dispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/url/URLDispatcher;->setUrlDispatcherFinishedCallback(Lcom/shopkick/app/url/IURLDispatcherFinishedCallback;)V

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->dispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    goto :goto_0

    .line 130
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/CustomActionSheetHandler;->finish()V

    :cond_1
    :goto_0
    return-void
.end method
