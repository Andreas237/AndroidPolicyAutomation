.class public Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "ViewWebDocumentActivity.java"


# static fields
.field public static final KEY_DOC_CONTENT:Ljava/lang/String;

.field public static final KEY_DOC_PATH:Ljava/lang/String;

.field public static final KEY_THEME:Ljava/lang/String;

.field public static final KEY_TITLE:Ljava/lang/String;

.field public static final TAG:Ljava/lang/String;


# instance fields
.field private toolbar:Landroid/support/v7/widget/Toolbar;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 22
    const-class v0, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->TAG:Ljava/lang/String;

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->TAG:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".DOC_PATH"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->KEY_DOC_PATH:Ljava/lang/String;

    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->TAG:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".DOC_CONTENT"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->KEY_DOC_CONTENT:Ljava/lang/String;

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->TAG:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".TITLE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->KEY_TITLE:Ljava/lang/String;

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->TAG:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".THEME"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->KEY_THEME:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;Ljava/lang/String;Z)Landroid/content/Intent;
    .locals 4
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "useCallingTheme"    # Z

    .prologue
    .line 55
    new-instance v0, Landroid/content/Intent;

    const-class v2, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 56
    .local v0, "intent":Landroid/content/Intent;
    sget-object v2, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->KEY_TITLE:Ljava/lang/String;

    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 57
    if-eqz p2, :cond_0

    .line 59
    invoke-static {p0}, Lorg/researchstack/backbone/utils/ThemeUtils;->getTheme(Landroid/content/Context;)I

    move-result v1

    .line 60
    .local v1, "theme":I
    if-eqz v1, :cond_0

    .line 62
    sget-object v2, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->KEY_THEME:Ljava/lang/String;

    invoke-static {p0}, Lorg/researchstack/backbone/utils/ThemeUtils;->getTheme(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 65
    .end local v1    # "theme":I
    :cond_0
    return-object v0
.end method

.method public static newIntentForContent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "htmlConent"    # Ljava/lang/String;

    .prologue
    .line 32
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->newIntentForContent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public static newIntentForContent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Landroid/content/Intent;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "htmlConent"    # Ljava/lang/String;
    .param p3, "useCallingTheme"    # Z

    .prologue
    .line 36
    invoke-static {p0, p1, p3}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->newIntent(Landroid/content/Context;Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v0

    .line 37
    .local v0, "intent":Landroid/content/Intent;
    sget-object v1, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->KEY_DOC_CONTENT:Ljava/lang/String;

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    return-object v0
.end method

.method public static newIntentForPath(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "absDocPath"    # Ljava/lang/String;

    .prologue
    .line 43
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->newIntentForPath(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public static newIntentForPath(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Landroid/content/Intent;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "absDocPath"    # Ljava/lang/String;
    .param p3, "useCallingTheme"    # Z

    .prologue
    .line 48
    invoke-static {p0, p1, p3}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->newIntent(Landroid/content/Context;Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v0

    .line 49
    .local v0, "intent":Landroid/content/Intent;
    sget-object v1, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->KEY_DOC_PATH:Ljava/lang/String;

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 50
    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 11
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v1, 0x0

    .line 71
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    sget-object v3, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->KEY_THEME:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 73
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    sget-object v3, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->KEY_THEME:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {p0, v2}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->setTheme(I)V

    .line 75
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 76
    sget v2, Lorg/researchstack/backbone/R$layout;->rsb_activity_web_document:I

    invoke-super {p0, v2}, Landroid/support/v7/app/AppCompatActivity;->setContentView(I)V

    .line 78
    sget v2, Lorg/researchstack/backbone/R$id;->toolbar:I

    invoke-virtual {p0, v2}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/support/v7/widget/Toolbar;

    iput-object v2, p0, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    .line 79
    iget-object v2, p0, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v2}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 80
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v6

    .line 82
    .local v6, "actionBar":Landroid/support/v7/app/ActionBar;
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    sget-object v3, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->KEY_TITLE:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 84
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    sget-object v3, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->KEY_TITLE:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 85
    .local v10, "title":Ljava/lang/String;
    invoke-virtual {v6, v10}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 88
    .end local v10    # "title":Ljava/lang/String;
    :cond_1
    sget v2, Lorg/researchstack/backbone/R$id;->webview:I

    invoke-virtual {p0, v2}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/ui/views/LocalWebView;

    .line 90
    .local v0, "webView":Lorg/researchstack/backbone/ui/views/LocalWebView;
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    sget-object v3, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->KEY_DOC_PATH:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 92
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    sget-object v2, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->KEY_DOC_PATH:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 93
    .local v8, "docPath":Ljava/lang/String;
    invoke-virtual {v0, v8}, Lorg/researchstack/backbone/ui/views/LocalWebView;->loadUrl(Ljava/lang/String;)V

    .line 102
    .end local v8    # "docPath":Ljava/lang/String;
    :cond_2
    :goto_0
    return-void

    .line 95
    :cond_3
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    sget-object v3, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->KEY_DOC_CONTENT:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 97
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    sget-object v3, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->KEY_DOC_CONTENT:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 98
    .local v7, "docContent":Ljava/lang/String;
    const-string v9, "<style> body { margin: 16pt; } </style>"

    .line 100
    .local v9, "marginStyle":Ljava/lang/String;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "<style> body { margin: 16pt; } </style>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "text/html"

    const-string v4, "UTF-8"

    move-object v5, v1

    invoke-virtual/range {v0 .. v5}, Lorg/researchstack/backbone/ui/views/LocalWebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2
    .param p1, "menu"    # Landroid/view/Menu;

    .prologue
    .line 106
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    sget v1, Lorg/researchstack/backbone/R$menu;->rsb_done_task:I

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->inflateMenu(I)V

    .line 107
    const/4 v0, 0x1

    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1
    .param p1, "item"    # Landroid/view/MenuItem;

    .prologue
    .line 113
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->onBackPressed()V

    .line 114
    const/4 v0, 0x1

    return v0
.end method
