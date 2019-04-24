.class public abstract Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;
.super Ljava/lang/Object;
.source "ErrorDialogFragmentFactory.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory$Honeycomb;,
        Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory$Support;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final config:Lorg/greenrobot/eventbus/util/ErrorDialogConfig;


# direct methods
.method protected constructor <init>(Lorg/greenrobot/eventbus/util/ErrorDialogConfig;)V
    .locals 0
    .param p1, "config"    # Lorg/greenrobot/eventbus/util/ErrorDialogConfig;

    .prologue
    .line 31
    .local p0, "this":Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;, "Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->config:Lorg/greenrobot/eventbus/util/ErrorDialogConfig;

    .line 33
    return-void
.end method


# virtual methods
.method protected abstract createErrorFragment(Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;Landroid/os/Bundle;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;",
            "Landroid/os/Bundle;",
            ")TT;"
        }
    .end annotation
.end method

.method protected getMessageFor(Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;Landroid/os/Bundle;)Ljava/lang/String;
    .locals 3
    .param p1, "event"    # Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;
    .param p2, "arguments"    # Landroid/os/Bundle;

    .prologue
    .line 82
    .local p0, "this":Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;, "Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory<TT;>;"
    iget-object v1, p0, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->config:Lorg/greenrobot/eventbus/util/ErrorDialogConfig;

    iget-object v2, p1, Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;->throwable:Ljava/lang/Throwable;

    invoke-virtual {v1, v2}, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->getMessageIdForThrowable(Ljava/lang/Throwable;)I

    move-result v0

    .line 83
    .local v0, "msgResId":I
    iget-object v1, p0, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->config:Lorg/greenrobot/eventbus/util/ErrorDialogConfig;

    iget-object v1, v1, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->resources:Landroid/content/res/Resources;

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method protected getTitleFor(Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;Landroid/os/Bundle;)Ljava/lang/String;
    .locals 2
    .param p1, "event"    # Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;
    .param p2, "arguments"    # Landroid/os/Bundle;

    .prologue
    .line 77
    .local p0, "this":Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;, "Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory<TT;>;"
    iget-object v0, p0, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->config:Lorg/greenrobot/eventbus/util/ErrorDialogConfig;

    iget-object v0, v0, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->resources:Landroid/content/res/Resources;

    iget-object v1, p0, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->config:Lorg/greenrobot/eventbus/util/ErrorDialogConfig;

    iget v1, v1, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->defaultTitleId:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected prepareErrorFragment(Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;ZLandroid/os/Bundle;)Ljava/lang/Object;
    .locals 5
    .param p1, "event"    # Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;
    .param p2, "finishAfterDialog"    # Z
    .param p3, "argumentsForErrorDialog"    # Landroid/os/Bundle;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;",
            "Z",
            "Landroid/os/Bundle;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 40
    .local p0, "this":Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;, "Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory<TT;>;"
    invoke-virtual {p1}, Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;->isSuppressErrorUi()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 42
    const/4 v3, 0x0

    .line 69
    :goto_0
    return-object v3

    .line 45
    :cond_0
    if-eqz p3, :cond_6

    .line 46
    invoke-virtual {p3}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 51
    .local v0, "bundle":Landroid/os/Bundle;
    :goto_1
    const-string v3, "de.greenrobot.eventbus.errordialog.title"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 52
    invoke-virtual {p0, p1, v0}, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->getTitleFor(Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v2

    .line 53
    .local v2, "title":Ljava/lang/String;
    const-string v3, "de.greenrobot.eventbus.errordialog.title"

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .end local v2    # "title":Ljava/lang/String;
    :cond_1
    const-string v3, "de.greenrobot.eventbus.errordialog.message"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 56
    invoke-virtual {p0, p1, v0}, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->getMessageFor(Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v1

    .line 57
    .local v1, "message":Ljava/lang/String;
    const-string v3, "de.greenrobot.eventbus.errordialog.message"

    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .end local v1    # "message":Ljava/lang/String;
    :cond_2
    const-string v3, "de.greenrobot.eventbus.errordialog.finish_after_dialog"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 60
    const-string v3, "de.greenrobot.eventbus.errordialog.finish_after_dialog"

    invoke-virtual {v0, v3, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 62
    :cond_3
    const-string v3, "de.greenrobot.eventbus.errordialog.event_type_on_close"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p0, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->config:Lorg/greenrobot/eventbus/util/ErrorDialogConfig;

    iget-object v3, v3, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->defaultEventTypeOnDialogClosed:Ljava/lang/Class;

    if-eqz v3, :cond_4

    .line 64
    const-string v3, "de.greenrobot.eventbus.errordialog.event_type_on_close"

    iget-object v4, p0, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->config:Lorg/greenrobot/eventbus/util/ErrorDialogConfig;

    iget-object v4, v4, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->defaultEventTypeOnDialogClosed:Ljava/lang/Class;

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 66
    :cond_4
    const-string v3, "de.greenrobot.eventbus.errordialog.icon_id"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, p0, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->config:Lorg/greenrobot/eventbus/util/ErrorDialogConfig;

    iget v3, v3, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->defaultDialogIconId:I

    if-eqz v3, :cond_5

    .line 67
    const-string v3, "de.greenrobot.eventbus.errordialog.icon_id"

    iget-object v4, p0, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->config:Lorg/greenrobot/eventbus/util/ErrorDialogConfig;

    iget v4, v4, Lorg/greenrobot/eventbus/util/ErrorDialogConfig;->defaultDialogIconId:I

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 69
    :cond_5
    invoke-virtual {p0, p1, v0}, Lorg/greenrobot/eventbus/util/ErrorDialogFragmentFactory;->createErrorFragment(Lorg/greenrobot/eventbus/util/ThrowableFailureEvent;Landroid/os/Bundle;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    .line 48
    .end local v0    # "bundle":Landroid/os/Bundle;
    :cond_6
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .restart local v0    # "bundle":Landroid/os/Bundle;
    goto :goto_1
.end method
