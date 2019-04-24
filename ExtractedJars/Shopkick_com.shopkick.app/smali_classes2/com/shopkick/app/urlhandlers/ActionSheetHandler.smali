.class public Lcom/shopkick/app/urlhandlers/ActionSheetHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "ActionSheetHandler.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "actionsheet"

.field private static final PARAM_CALLBACK:Ljava/lang/String; = "callback"

.field private static final PARAM_CANCEL_IDX:Ljava/lang/String; = "cancel_index"

.field private static final PARAM_OPTIONS:Ljava/lang/String; = "options"

.field private static final PARAM_TITLE:Ljava/lang/String; = "title"


# instance fields
.field private alertDialog:Landroid/app/AlertDialog;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private buttonIdxClicked:I


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    const/4 v0, -0x1

    .line 23
    iput v0, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->buttonIdxClicked:I

    .line 26
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    const/4 p1, 0x1

    .line 28
    iput-boolean p1, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->isAsync:Z

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .line 38
    invoke-super {p0}, Lcom/shopkick/app/url/URLHandler;->cancel()V

    .line 39
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->alertDialog:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    .line 40
    iput v1, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->buttonIdxClicked:I

    .line 41
    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method public clone()Lcom/shopkick/app/url/URLHandler;
    .locals 2

    .line 33
    new-instance v0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-direct {v0, v1}, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 12
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->clone()Lcom/shopkick/app/url/URLHandler;

    move-result-object v0

    return-object v0
.end method

.method public execute()V
    .locals 9

    .line 47
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 49
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->finish()V

    return-void

    .line 53
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->params:Ljava/util/Map;

    const-string/jumbo v2, "title"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_1

    const-string v1, ""

    :cond_1
    const/4 v2, -0x1

    .line 59
    iget-object v3, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->params:Ljava/util/Map;

    const-string v4, "cancel_index"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 61
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 65
    :cond_2
    iget-object v3, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->params:Ljava/util/Map;

    const-string v4, "options"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    const-string v5, ";"

    .line 67
    invoke-virtual {v3, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    if-lez v2, :cond_6

    .line 73
    array-length v5, v3

    if-ge v2, v5, :cond_6

    .line 74
    array-length v5, v3

    add-int/lit8 v5, v5, -0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    move v7, v6

    .line 76
    :goto_0
    array-length v8, v3

    if-ge v6, v8, :cond_4

    if-ne v6, v2, :cond_3

    goto :goto_1

    .line 80
    :cond_3
    aget-object v8, v3, v6

    aput-object v8, v5, v7

    add-int/lit8 v7, v7, 0x1

    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    move-object v3, v5

    goto :goto_2

    :cond_5
    move-object v3, v4

    .line 88
    :cond_6
    :goto_2
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    if-eqz v3, :cond_8

    .line 89
    array-length v1, v3

    if-lez v1, :cond_8

    .line 90
    invoke-virtual {v0, v3, p0}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 92
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->alertDialog:Landroid/app/AlertDialog;

    if-eqz v1, :cond_7

    .line 93
    invoke-virtual {v1, v4}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 95
    :cond_7
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->alertDialog:Landroid/app/AlertDialog;

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->alertDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0, p0}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 97
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->alertDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto :goto_3

    .line 99
    :cond_8
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->finish()V

    :goto_3
    return-void
.end method

.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->alertDialog:Landroid/app/AlertDialog;

    if-ne p1, v0, :cond_0

    .line 106
    iput p2, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->buttonIdxClicked:I

    .line 107
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    :cond_0
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->alertDialog:Landroid/app/AlertDialog;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    .line 114
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 115
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->alertDialog:Landroid/app/AlertDialog;

    .line 117
    iget p1, p0, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->buttonIdxClicked:I

    if-ltz p1, :cond_0

    const-string v0, "callback"

    const/4 v1, 0x1

    .line 118
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->finishWithWebViewCallback(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 120
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/ActionSheetHandler;->finish()V

    :cond_1
    :goto_0
    return-void
.end method
