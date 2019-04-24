.class public Lorg/researchstack/backbone/ui/PinCodeActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "PinCodeActivity.java"

# interfaces
.implements Lorg/researchstack/backbone/storage/file/StorageAccessListener;


# instance fields
.field private pinCodeLayout:Lorg/researchstack/backbone/ui/views/PinCodeLayout;

.field private toggleKeyboardAction:Lrx/functions/Action1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrx/functions/Action1",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method static synthetic lambda$null$5(Lorg/researchstack/backbone/ui/PinCodeActivity;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1
    .param p0, "this"    # Lorg/researchstack/backbone/ui/PinCodeActivity;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 186
    invoke-static {}, Lorg/researchstack/backbone/StorageAccess;->getInstance()Lorg/researchstack/backbone/StorageAccess;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lorg/researchstack/backbone/StorageAccess;->authenticate(Landroid/content/Context;Ljava/lang/String;)V

    .line 187
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$null$6(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/TextView;ILjava/lang/Throwable;)V
    .locals 2
    .param p0, "this"    # Lorg/researchstack/backbone/ui/PinCodeActivity;
    .param p3, "throwable"    # Ljava/lang/Throwable;

    .prologue
    .line 189
    iget-object v0, p0, Lorg/researchstack/backbone/ui/PinCodeActivity;->toggleKeyboardAction:Lrx/functions/Action1;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lrx/functions/Action1;->call(Ljava/lang/Object;)V

    .line 190
    invoke-virtual {p3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 191
    sget v0, Lorg/researchstack/backbone/R$string;->rsb_pincode_enter_error:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 192
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 193
    iget-object v0, p0, Lorg/researchstack/backbone/ui/PinCodeActivity;->pinCodeLayout:Lorg/researchstack/backbone/ui/views/PinCodeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->showProgress(Z)V

    .line 194
    return-void
.end method

.method static synthetic lambda$null$7(Ljava/lang/Throwable;)Lrx/Observable;
    .locals 1
    .param p0, "throwable1"    # Ljava/lang/Throwable;

    .prologue
    .line 195
    invoke-static {}, Lrx/Observable;->empty()Lrx/Observable;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$onDataAuth$1(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/EditText;Ljava/lang/Boolean;)V
    .locals 2
    .param p0, "this"    # Lorg/researchstack/backbone/ui/PinCodeActivity;
    .param p2, "enable"    # Ljava/lang/Boolean;

    .prologue
    .line 166
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 167
    const-string v1, ""

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 168
    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    .line 169
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 171
    const-string v1, "input_method"

    invoke-virtual {p0, v1}, Lorg/researchstack/backbone/ui/PinCodeActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 172
    .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 174
    .end local v0    # "imm":Landroid/view/inputmethod/InputMethodManager;
    :cond_0
    return-void
.end method

.method static synthetic lambda$onDataAuth$10(Lorg/researchstack/backbone/ui/PinCodeActivity;)V
    .locals 2
    .param p0, "this"    # Lorg/researchstack/backbone/ui/PinCodeActivity;

    .prologue
    .line 214
    iget-object v0, p0, Lorg/researchstack/backbone/ui/PinCodeActivity;->toggleKeyboardAction:Lrx/functions/Action1;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lrx/functions/Action1;->call(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$onDataAuth$2(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/TextView;ILjava/lang/String;)V
    .locals 1
    .param p0, "this"    # Lorg/researchstack/backbone/ui/PinCodeActivity;
    .param p3, "pin"    # Ljava/lang/String;

    .prologue
    .line 177
    invoke-virtual {p1}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v0

    if-ne v0, p2, :cond_0

    .line 179
    invoke-static {p0}, Lorg/researchstack/backbone/utils/ThemeUtils;->getTextColorPrimary(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 180
    iget-object v0, p0, Lorg/researchstack/backbone/ui/PinCodeActivity;->pinCodeLayout:Lorg/researchstack/backbone/ui/views/PinCodeLayout;

    invoke-virtual {v0}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->resetSummaryText()V

    .line 182
    :cond_0
    return-void
.end method

.method static synthetic lambda$onDataAuth$3(Lorg/researchstack/backbone/storage/file/PinCodeConfig;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2
    .param p1, "pin"    # Ljava/lang/String;

    .prologue
    .line 182
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0}, Lorg/researchstack/backbone/storage/file/PinCodeConfig;->getPinLength()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic lambda$onDataAuth$4(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/EditText;Ljava/lang/String;)V
    .locals 2
    .param p0, "this"    # Lorg/researchstack/backbone/ui/PinCodeActivity;
    .param p2, "pin"    # Ljava/lang/String;

    .prologue
    .line 183
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 184
    iget-object v0, p0, Lorg/researchstack/backbone/ui/PinCodeActivity;->pinCodeLayout:Lorg/researchstack/backbone/ui/views/PinCodeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->showProgress(Z)V

    .line 185
    return-void
.end method

.method static synthetic lambda$onDataAuth$8(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/TextView;ILjava/lang/String;)Lrx/Observable;
    .locals 2
    .param p0, "this"    # Lorg/researchstack/backbone/ui/PinCodeActivity;
    .param p3, "pin"    # Ljava/lang/String;

    .prologue
    .line 185
    invoke-static {p0, p3}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$12;->lambdaFactory$(Lorg/researchstack/backbone/ui/PinCodeActivity;Ljava/lang/String;)Ljava/util/concurrent/Callable;

    move-result-object v0

    invoke-static {v0}, Lrx/Observable;->fromCallable(Ljava/util/concurrent/Callable;)Lrx/Observable;

    move-result-object v0

    .line 188
    invoke-static {}, Lorg/researchstack/backbone/utils/ObservableUtils;->applyDefault()Lrx/Observable$Transformer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrx/Observable;->compose(Lrx/Observable$Transformer;)Lrx/Observable;

    move-result-object v0

    invoke-static {p0, p1, p2}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$13;->lambdaFactory$(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/TextView;I)Lrx/functions/Action1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrx/Observable;->doOnError(Lrx/functions/Action1;)Lrx/Observable;

    move-result-object v0

    invoke-static {}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$14;->lambdaFactory$()Lrx/functions/Func1;

    move-result-object v1

    .line 194
    invoke-virtual {v0, v1}, Lrx/Observable;->onErrorResumeNext(Lrx/functions/Func1;)Lrx/Observable;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$onDataAuth$9(Lorg/researchstack/backbone/ui/PinCodeActivity;Ljava/lang/Boolean;)V
    .locals 2
    .param p0, "this"    # Lorg/researchstack/backbone/ui/PinCodeActivity;
    .param p1, "success"    # Ljava/lang/Boolean;

    .prologue
    .line 197
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 199
    iget-object v0, p0, Lorg/researchstack/backbone/ui/PinCodeActivity;->toggleKeyboardAction:Lrx/functions/Action1;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lrx/functions/Action1;->call(Ljava/lang/Object;)V

    .line 208
    :goto_0
    return-void

    .line 203
    :cond_0
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    iget-object v1, p0, Lorg/researchstack/backbone/ui/PinCodeActivity;->pinCodeLayout:Lorg/researchstack/backbone/ui/views/PinCodeLayout;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    .line 204
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/researchstack/backbone/ui/PinCodeActivity;->pinCodeLayout:Lorg/researchstack/backbone/ui/views/PinCodeLayout;

    .line 206
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->requestStorageAccess()V

    goto :goto_0
.end method

.method static synthetic lambda$onDataReady$0(Lorg/researchstack/backbone/ui/PinCodeActivity;)V
    .locals 6
    .param p0, "this"    # Lorg/researchstack/backbone/ui/PinCodeActivity;

    .prologue
    .line 101
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v1

    .line 102
    .local v1, "fragments":Ljava/util/List;, "Ljava/util/List<Landroid/support/v4/app/Fragment;>;"
    if-eqz v1, :cond_1

    .line 104
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "Fragments found on stack. Checking for StorageAccessListener."

    invoke-static {v2, v3}, Lorg/researchstack/backbone/utils/LogExt;->i(Ljava/lang/Class;Ljava/lang/String;)V

    .line 107
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 109
    .local v0, "fragment":Landroid/support/v4/app/Fragment;
    instance-of v3, v0, Lorg/researchstack/backbone/storage/file/StorageAccessListener;

    if-eqz v3, :cond_0

    .line 111
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Notifying "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " of onDataReady"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lorg/researchstack/backbone/utils/LogExt;->i(Ljava/lang/Class;Ljava/lang/String;)V

    .line 114
    check-cast v0, Lorg/researchstack/backbone/storage/file/StorageAccessListener;

    .end local v0    # "fragment":Landroid/support/v4/app/Fragment;
    invoke-interface {v0}, Lorg/researchstack/backbone/storage/file/StorageAccessListener;->onDataReady()V

    goto :goto_0

    .line 118
    :cond_1
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 39
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 40
    return-void
.end method

.method public onDataAuth()V
    .locals 10

    .prologue
    .line 150
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-string v7, "onDataAuth()"

    invoke-static {v6, v7}, Lorg/researchstack/backbone/utils/LogExt;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 151
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->storageAccessUnregister()V

    .line 154
    invoke-static {}, Lorg/researchstack/backbone/StorageAccess;->getInstance()Lorg/researchstack/backbone/StorageAccess;

    move-result-object v6

    invoke-virtual {v6}, Lorg/researchstack/backbone/StorageAccess;->getPinCodeConfig()Lorg/researchstack/backbone/storage/file/PinCodeConfig;

    move-result-object v0

    .line 156
    .local v0, "config":Lorg/researchstack/backbone/storage/file/PinCodeConfig;
    invoke-static {p0}, Lorg/researchstack/backbone/utils/ThemeUtils;->getPassCodeTheme(Landroid/content/Context;)I

    move-result v5

    .line 157
    .local v5, "theme":I
    new-instance v6, Lorg/researchstack/backbone/ui/views/PinCodeLayout;

    new-instance v7, Landroid/view/ContextThemeWrapper;

    invoke-direct {v7, p0, v5}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v6, v7}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;-><init>(Landroid/content/Context;)V

    iput-object v6, p0, Lorg/researchstack/backbone/ui/PinCodeActivity;->pinCodeLayout:Lorg/researchstack/backbone/ui/views/PinCodeLayout;

    .line 158
    iget-object v6, p0, Lorg/researchstack/backbone/ui/PinCodeActivity;->pinCodeLayout:Lorg/researchstack/backbone/ui/views/PinCodeLayout;

    const/4 v7, -0x1

    invoke-virtual {v6, v7}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->setBackgroundColor(I)V

    .line 160
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lorg/researchstack/backbone/R$color;->rsb_error:I

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 162
    .local v1, "errorColor":I
    iget-object v6, p0, Lorg/researchstack/backbone/ui/PinCodeActivity;->pinCodeLayout:Lorg/researchstack/backbone/ui/views/PinCodeLayout;

    sget v7, Lorg/researchstack/backbone/R$id;->text:I

    invoke-virtual {v6, v7}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 163
    .local v4, "summary":Landroid/widget/TextView;
    iget-object v6, p0, Lorg/researchstack/backbone/ui/PinCodeActivity;->pinCodeLayout:Lorg/researchstack/backbone/ui/views/PinCodeLayout;

    sget v7, Lorg/researchstack/backbone/R$id;->pincode:I

    invoke-virtual {v6, v7}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    .line 165
    .local v3, "pincode":Landroid/widget/EditText;
    invoke-static {p0, v3}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$4;->lambdaFactory$(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/EditText;)Lrx/functions/Action1;

    move-result-object v6

    iput-object v6, p0, Lorg/researchstack/backbone/ui/PinCodeActivity;->toggleKeyboardAction:Lrx/functions/Action1;

    .line 176
    invoke-static {v3}, Lcom/jakewharton/rxbinding/widget/RxTextView;->textChanges(Landroid/widget/TextView;)Lrx/Observable;

    move-result-object v6

    invoke-static {}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$5;->lambdaFactory$()Lrx/functions/Func1;

    move-result-object v7

    invoke-virtual {v6, v7}, Lrx/Observable;->map(Lrx/functions/Func1;)Lrx/Observable;

    move-result-object v6

    invoke-static {p0, v4, v1}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$6;->lambdaFactory$(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/TextView;I)Lrx/functions/Action1;

    move-result-object v7

    invoke-virtual {v6, v7}, Lrx/Observable;->doOnNext(Lrx/functions/Action1;)Lrx/Observable;

    move-result-object v6

    invoke-static {v0}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$7;->lambdaFactory$(Lorg/researchstack/backbone/storage/file/PinCodeConfig;)Lrx/functions/Func1;

    move-result-object v7

    .line 182
    invoke-virtual {v6, v7}, Lrx/Observable;->filter(Lrx/functions/Func1;)Lrx/Observable;

    move-result-object v6

    invoke-static {p0, v3}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$8;->lambdaFactory$(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/EditText;)Lrx/functions/Action1;

    move-result-object v7

    invoke-virtual {v6, v7}, Lrx/Observable;->doOnNext(Lrx/functions/Action1;)Lrx/Observable;

    move-result-object v6

    invoke-static {p0, v4, v1}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$9;->lambdaFactory$(Lorg/researchstack/backbone/ui/PinCodeActivity;Landroid/widget/TextView;I)Lrx/functions/Func1;

    move-result-object v7

    .line 185
    invoke-virtual {v6, v7}, Lrx/Observable;->flatMap(Lrx/functions/Func1;)Lrx/Observable;

    move-result-object v6

    invoke-static {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$10;->lambdaFactory$(Lorg/researchstack/backbone/ui/PinCodeActivity;)Lrx/functions/Action1;

    move-result-object v7

    .line 196
    invoke-virtual {v6, v7}, Lrx/Observable;->subscribe(Lrx/functions/Action1;)Lrx/Subscription;

    .line 210
    new-instance v2, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v2}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 211
    .local v2, "params":Landroid/view/WindowManager$LayoutParams;
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v6

    iget-object v7, p0, Lorg/researchstack/backbone/ui/PinCodeActivity;->pinCodeLayout:Lorg/researchstack/backbone/ui/views/PinCodeLayout;

    invoke-interface {v6, v7, v2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 214
    iget-object v6, p0, Lorg/researchstack/backbone/ui/PinCodeActivity;->pinCodeLayout:Lorg/researchstack/backbone/ui/views/PinCodeLayout;

    invoke-static {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$11;->lambdaFactory$(Lorg/researchstack/backbone/ui/PinCodeActivity;)Ljava/lang/Runnable;

    move-result-object v7

    const-wide/16 v8, 0x12c

    invoke-virtual {v6, v7, v8, v9}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 215
    return-void
.end method

.method public onDataFailed()V
    .locals 6

    .prologue
    .line 124
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "onDataFailed()"

    invoke-static {v2, v3}, Lorg/researchstack/backbone/utils/LogExt;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 126
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->storageAccessUnregister()V

    .line 128
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v1

    .line 130
    .local v1, "fragments":Ljava/util/List;, "Ljava/util/List<Landroid/support/v4/app/Fragment;>;"
    if-eqz v1, :cond_1

    .line 132
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "Fragments found on stack. Checking for StorageAccessListener."

    invoke-static {v2, v3}, Lorg/researchstack/backbone/utils/LogExt;->i(Ljava/lang/Class;Ljava/lang/String;)V

    .line 134
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 136
    .local v0, "fragment":Landroid/support/v4/app/Fragment;
    instance-of v3, v0, Lorg/researchstack/backbone/storage/file/StorageAccessListener;

    if-eqz v3, :cond_0

    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Notifying "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " of onDataFailed"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lorg/researchstack/backbone/utils/LogExt;->i(Ljava/lang/Class;Ljava/lang/String;)V

    .line 141
    check-cast v0, Lorg/researchstack/backbone/storage/file/StorageAccessListener;

    .end local v0    # "fragment":Landroid/support/v4/app/Fragment;
    invoke-interface {v0}, Lorg/researchstack/backbone/storage/file/StorageAccessListener;->onDataFailed()V

    goto :goto_0

    .line 145
    :cond_1
    return-void
.end method

.method public onDataReady()V
    .locals 2

    .prologue
    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "onDataReady()"

    invoke-static {v0, v1}, Lorg/researchstack/backbone/utils/LogExt;->i(Ljava/lang/Class;Ljava/lang/String;)V

    .line 96
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->storageAccessUnregister()V

    .line 100
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    invoke-static {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity$$Lambda$1;->lambdaFactory$(Lorg/researchstack/backbone/ui/PinCodeActivity;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 119
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 61
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onDestroy()V

    .line 62
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->storageAccessUnregister()V

    .line 63
    iget-object v0, p0, Lorg/researchstack/backbone/ui/PinCodeActivity;->pinCodeLayout:Lorg/researchstack/backbone/ui/views/PinCodeLayout;

    if-eqz v0, :cond_0

    .line 65
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    iget-object v1, p0, Lorg/researchstack/backbone/ui/PinCodeActivity;->pinCodeLayout:Lorg/researchstack/backbone/ui/views/PinCodeLayout;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    .line 67
    :cond_0
    return-void
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 45
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onPause()V

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "logAccessTime()"

    invoke-static {v0, v1}, Lorg/researchstack/backbone/utils/LogExt;->i(Ljava/lang/Class;Ljava/lang/String;)V

    .line 47
    invoke-static {}, Lorg/researchstack/backbone/StorageAccess;->getInstance()Lorg/researchstack/backbone/StorageAccess;

    move-result-object v0

    invoke-virtual {v0}, Lorg/researchstack/backbone/StorageAccess;->logAccessTime()V

    .line 48
    return-void
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 53
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onResume()V

    .line 55
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->requestStorageAccess()V

    .line 56
    return-void
.end method

.method protected requestStorageAccess()V
    .locals 3

    .prologue
    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "requestStorageAccess()"

    invoke-static {v1, v2}, Lorg/researchstack/backbone/utils/LogExt;->i(Ljava/lang/Class;Ljava/lang/String;)V

    .line 72
    invoke-static {}, Lorg/researchstack/backbone/StorageAccess;->getInstance()Lorg/researchstack/backbone/StorageAccess;

    move-result-object v0

    .line 73
    .local v0, "storageAccess":Lorg/researchstack/backbone/StorageAccess;
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/PinCodeActivity;->storageAccessRegister()V

    .line 74
    invoke-virtual {v0, p0}, Lorg/researchstack/backbone/StorageAccess;->requestStorageAccess(Landroid/content/Context;)V

    .line 75
    return-void
.end method

.method protected storageAccessRegister()V
    .locals 3

    .prologue
    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "storageAccessRegister()"

    invoke-static {v1, v2}, Lorg/researchstack/backbone/utils/LogExt;->i(Ljava/lang/Class;Ljava/lang/String;)V

    .line 80
    invoke-static {}, Lorg/researchstack/backbone/StorageAccess;->getInstance()Lorg/researchstack/backbone/StorageAccess;

    move-result-object v0

    .line 81
    .local v0, "storageAccess":Lorg/researchstack/backbone/StorageAccess;
    invoke-virtual {v0, p0}, Lorg/researchstack/backbone/StorageAccess;->register(Lorg/researchstack/backbone/storage/file/StorageAccessListener;)V

    .line 82
    return-void
.end method

.method protected storageAccessUnregister()V
    .locals 3

    .prologue
    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "storageAccessUnregister()"

    invoke-static {v1, v2}, Lorg/researchstack/backbone/utils/LogExt;->i(Ljava/lang/Class;Ljava/lang/String;)V

    .line 87
    invoke-static {}, Lorg/researchstack/backbone/StorageAccess;->getInstance()Lorg/researchstack/backbone/StorageAccess;

    move-result-object v0

    .line 88
    .local v0, "storageAccess":Lorg/researchstack/backbone/StorageAccess;
    invoke-virtual {v0, p0}, Lorg/researchstack/backbone/StorageAccess;->unregister(Lorg/researchstack/backbone/storage/file/StorageAccessListener;)V

    .line 89
    return-void
.end method
