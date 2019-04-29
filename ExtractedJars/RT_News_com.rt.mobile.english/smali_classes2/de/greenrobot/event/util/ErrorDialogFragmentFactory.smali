.class public abstract Lde/greenrobot/event/util/ErrorDialogFragmentFactory;
.super Ljava/lang/Object;
.source "ErrorDialogFragmentFactory.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde/greenrobot/event/util/ErrorDialogFragmentFactory$Honeycomb;,
        Lde/greenrobot/event/util/ErrorDialogFragmentFactory$Support;
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
.field protected final config:Lde/greenrobot/event/util/ErrorDialogConfig;


# direct methods
.method protected constructor <init>(Lde/greenrobot/event/util/ErrorDialogConfig;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lde/greenrobot/event/util/ErrorDialogFragmentFactory;->config:Lde/greenrobot/event/util/ErrorDialogConfig;

    return-void
.end method


# virtual methods
.method protected abstract createErrorFragment(Lde/greenrobot/event/util/ThrowableFailureEvent;Landroid/os/Bundle;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde/greenrobot/event/util/ThrowableFailureEvent;",
            "Landroid/os/Bundle;",
            ")TT;"
        }
    .end annotation
.end method

.method protected getMessageFor(Lde/greenrobot/event/util/ThrowableFailureEvent;Landroid/os/Bundle;)Ljava/lang/String;
    .locals 0

    .line 66
    iget-object p2, p0, Lde/greenrobot/event/util/ErrorDialogFragmentFactory;->config:Lde/greenrobot/event/util/ErrorDialogConfig;

    iget-object p1, p1, Lde/greenrobot/event/util/ThrowableFailureEvent;->throwable:Ljava/lang/Throwable;

    invoke-virtual {p2, p1}, Lde/greenrobot/event/util/ErrorDialogConfig;->getMessageIdForThrowable(Ljava/lang/Throwable;)I

    move-result p1

    .line 67
    iget-object p2, p0, Lde/greenrobot/event/util/ErrorDialogFragmentFactory;->config:Lde/greenrobot/event/util/ErrorDialogConfig;

    iget-object p2, p2, Lde/greenrobot/event/util/ErrorDialogConfig;->resources:Landroid/content/res/Resources;

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getTitleFor(Lde/greenrobot/event/util/ThrowableFailureEvent;Landroid/os/Bundle;)Ljava/lang/String;
    .locals 0

    .line 61
    iget-object p1, p0, Lde/greenrobot/event/util/ErrorDialogFragmentFactory;->config:Lde/greenrobot/event/util/ErrorDialogConfig;

    iget-object p1, p1, Lde/greenrobot/event/util/ErrorDialogConfig;->resources:Landroid/content/res/Resources;

    iget-object p2, p0, Lde/greenrobot/event/util/ErrorDialogFragmentFactory;->config:Lde/greenrobot/event/util/ErrorDialogConfig;

    iget p2, p2, Lde/greenrobot/event/util/ErrorDialogConfig;->defaultTitleId:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected prepareErrorFragment(Lde/greenrobot/event/util/ThrowableFailureEvent;ZLandroid/os/Bundle;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde/greenrobot/event/util/ThrowableFailureEvent;",
            "Z",
            "Landroid/os/Bundle;",
            ")TT;"
        }
    .end annotation

    .line 24
    invoke-virtual {p1}, Lde/greenrobot/event/util/ThrowableFailureEvent;->isSuppressErrorUi()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-eqz p3, :cond_1

    .line 30
    invoke-virtual {p3}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/os/Bundle;

    goto :goto_0

    .line 32
    :cond_1
    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    :goto_0
    const-string v0, "de.greenrobot.eventbus.errordialog.title"

    .line 35
    invoke-virtual {p3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 36
    invoke-virtual {p0, p1, p3}, Lde/greenrobot/event/util/ErrorDialogFragmentFactory;->getTitleFor(Lde/greenrobot/event/util/ThrowableFailureEvent;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "de.greenrobot.eventbus.errordialog.title"

    .line 37
    invoke-virtual {p3, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    const-string v0, "de.greenrobot.eventbus.errordialog.message"

    .line 39
    invoke-virtual {p3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 40
    invoke-virtual {p0, p1, p3}, Lde/greenrobot/event/util/ErrorDialogFragmentFactory;->getMessageFor(Lde/greenrobot/event/util/ThrowableFailureEvent;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "de.greenrobot.eventbus.errordialog.message"

    .line 41
    invoke-virtual {p3, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    const-string v0, "de.greenrobot.eventbus.errordialog.finish_after_dialog"

    .line 43
    invoke-virtual {p3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "de.greenrobot.eventbus.errordialog.finish_after_dialog"

    .line 44
    invoke-virtual {p3, v0, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_4
    const-string p2, "de.greenrobot.eventbus.errordialog.event_type_on_close"

    .line 46
    invoke-virtual {p3, p2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_5

    iget-object p2, p0, Lde/greenrobot/event/util/ErrorDialogFragmentFactory;->config:Lde/greenrobot/event/util/ErrorDialogConfig;

    iget-object p2, p2, Lde/greenrobot/event/util/ErrorDialogConfig;->defaultEventTypeOnDialogClosed:Ljava/lang/Class;

    if-eqz p2, :cond_5

    const-string p2, "de.greenrobot.eventbus.errordialog.event_type_on_close"

    .line 48
    iget-object v0, p0, Lde/greenrobot/event/util/ErrorDialogFragmentFactory;->config:Lde/greenrobot/event/util/ErrorDialogConfig;

    iget-object v0, v0, Lde/greenrobot/event/util/ErrorDialogConfig;->defaultEventTypeOnDialogClosed:Ljava/lang/Class;

    invoke-virtual {p3, p2, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    :cond_5
    const-string p2, "de.greenrobot.eventbus.errordialog.icon_id"

    .line 50
    invoke-virtual {p3, p2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_6

    iget-object p2, p0, Lde/greenrobot/event/util/ErrorDialogFragmentFactory;->config:Lde/greenrobot/event/util/ErrorDialogConfig;

    iget p2, p2, Lde/greenrobot/event/util/ErrorDialogConfig;->defaultDialogIconId:I

    if-eqz p2, :cond_6

    const-string p2, "de.greenrobot.eventbus.errordialog.icon_id"

    .line 51
    iget-object v0, p0, Lde/greenrobot/event/util/ErrorDialogFragmentFactory;->config:Lde/greenrobot/event/util/ErrorDialogConfig;

    iget v0, v0, Lde/greenrobot/event/util/ErrorDialogConfig;->defaultDialogIconId:I

    invoke-virtual {p3, p2, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 53
    :cond_6
    invoke-virtual {p0, p1, p3}, Lde/greenrobot/event/util/ErrorDialogFragmentFactory;->createErrorFragment(Lde/greenrobot/event/util/ThrowableFailureEvent;Landroid/os/Bundle;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
